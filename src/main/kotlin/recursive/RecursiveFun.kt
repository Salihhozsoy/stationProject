package recursive

fun main() {

    val result = recursiveFun(3)
    println(result)

    val number = 5
    print("$number! = ")
    println(factorialCalculation(number))
}

fun recursiveFun(x: Int): Int {                                  // 1.yöntem

    return if (x == 1) 1 else x * recursiveFun(x - 1)

}


fun factorialCalculation(x: Int): Int {                          // 2. yöntem
    if (x > 1) {
        print("$x.")
        return x * factorialCalculation(x - 1)
    } else {
        print("1 = ")
        return x
    }
}