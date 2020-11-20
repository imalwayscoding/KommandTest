package com.github.imalwayscoding.plugin

import com.github.imalwayscoding.commands.Kommand
import com.github.noonmaru.kommand.kommand
import org.bukkit.plugin.java.JavaPlugin

class KommandTestPlugin : JavaPlugin() {

    override fun onEnable() {
        server.consoleSender.sendMessage("§e[KommandTest / Korean] 플러그인이 §a활성화§e 되었습니다.")
        server.consoleSender.sendMessage("§e[KommandTest / English] Plugin is §aEnabled§e.")
    }

    override fun onDisable() {
        server.consoleSender.sendMessage("§e[KommandTest / Korean] 플러그인이 §c비활성화§e 되었습니다.")
        server.consoleSender.sendMessage("§e[KommandTest / English] Plugin is §cDisabled§e.")
    }

    fun register() {
        kommand {
            register("kt") {
                Kommand.register(this)
            }
        }
    }

}