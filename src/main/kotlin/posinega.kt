fun main() {
    count(arrayOf(-1, 1, -2, 3, 5, 7, 8, 0, -3, -5))
    staircase(6)
    val asd= time("12:23:00AM")
    println(asd)
}

fun count(arr: Array<Int>) {
    val positive = arr.count { it > 0 }
    val negative = arr.count { it < 0 }
    val zero = arr.count { it == 0 }

    val n = arr.size.toDouble()

    println(positive / n)
    println(negative / n)
    println(zero / n)

}

fun staircase(n: Int) {

    for (i in 1..n) {
        println(" ".repeat(n - i) + "#".repeat(i))
    }
}

fun time(s: String): String {
    var hour = s.take(2).toInt()
    val amPm = s.takeLast(2)
    val middle = s.substring(2..7)

    if (hour == 12 && amPm == "AM")
        hour = 0

    if (hour < 12 && amPm == "PM")
        hour += 12

    val hourStr =hour.toString().padStart(2,'0')

    return hourStr + middle

}