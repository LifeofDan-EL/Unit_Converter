package converter

import java.util.*

fun main() {
    println("Enter a number of kilometers:")
    val scanner = Scanner(System.`in`)
    val num = scanner.nextInt()
    val max = num * 1000

    println("$num kilometers is $max meters")

}
