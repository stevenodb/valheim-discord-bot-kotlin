package be.takestwo

import be.takestwo.discord.DiscordJS.Client
import kotlin.js.json

const val GUILDS = 1 // 1 << 0

fun main() {
    val client = Client(json(Pair("intents", arrayOf(GUILDS))))

    client.once("ready") {
        console.log("Logged in")
    }

    client.login("")
}