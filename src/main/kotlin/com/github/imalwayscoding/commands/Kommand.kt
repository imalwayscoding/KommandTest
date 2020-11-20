package com.github.imalwayscoding.commands

import com.github.noonmaru.kommand.KommandBuilder
import org.bukkit.Bukkit

internal object Kommand {

    var needConfirm = false
    lateinit var activity: String

    fun register(builder: KommandBuilder) {
        builder.apply {
            then("disable") {
                executes {
                    needConfirm = true
                    activity = "disable"
                }
            }
            then("reload") {
                executes {
                    needConfirm = true
                    activity = "reload"
                }
            }
            then("confirm") {
                executes {
                    if (activity == "disable") {
                        Bukkit.getServer().pluginManager.getPlugin("KommandTest")?.let {
                            it -> Bukkit.getServer().pluginManager.disablePlugin(it)
                        }
                    } else {
                        Bukkit.getServer().pluginManager.getPlugin("KommandTest")?.let {
                            it -> Bukkit.getServer().pluginManager.disablePlugin(it)
                        }
                        Bukkit.getServer().pluginManager.getPlugin("KommandTest")?.let {
                            it -> Bukkit.getServer().pluginManager.enablePlugin(it)
                        }
                    }
                }
            }
        }
    }
}