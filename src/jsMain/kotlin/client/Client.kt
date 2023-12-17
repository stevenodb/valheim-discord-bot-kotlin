package be.takestwo.client

import kotlin.js.Json

@JsModule("discord.js")
external class Client(clientOptions: Json) {
    fun once(event: String, callback: (dynamic) -> Unit)
    fun login(token: String)
}