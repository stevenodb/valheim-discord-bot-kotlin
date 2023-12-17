package be.takestwo.discord

import kotlin.js.Json

@JsModule("discord.js")
external object DiscordJS {
    class Client(clientOptions: Json) {
        fun once(event: String, callback: (dynamic) -> Unit)
        fun login(token: String)
    }
}