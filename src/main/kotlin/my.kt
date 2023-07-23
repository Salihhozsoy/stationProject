fun main() {

val message = getMessage(Type.a,"ada")
    println(message)
}

fun getMessage(type: Type, name:String): String {
    return when (type) {
        Type.a -> "tip a'dır $name"
        Type.b -> "tip b'dir"
        Type.c -> "tip c'dir"

    }
}

enum class Type {
    a,
    b,
    c
}