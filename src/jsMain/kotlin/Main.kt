package be.takestwo

import be.takestwo.client.Client
import kotlin.js.json


fun main() {
    val client = Client(json(Pair("intents", arrayOf("GUILDS"))))

    client.once("ready") {
        console.log("Logged in")
    }

    client.login("YOUR_BOT_TOKEN")
}