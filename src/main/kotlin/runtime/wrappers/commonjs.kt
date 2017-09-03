package runtime.wrappers

external fun require(module: String): dynamic

fun Any.getOwnPropertyNames(): Array<String> {
    val me = this
    return js("Object.getOwnPropertyNames(me)")
}

fun toPlainObjectStripNull(me: Any): dynamic {
    val obj = js("({})")
    for (p in me.getOwnPropertyNames().filterNot { it == "__proto__" || it == "constructor" }) {
        js("if (me[p] != null) { obj[p]=me[p] }")
    }
    return obj
}