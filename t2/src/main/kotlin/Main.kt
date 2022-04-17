import java.util.*

fun main() {
    println("Hello World!")
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    var b = input.nextInt()
    val PI = 3.141592653589793
//           3.141592653589793
   // круто у нас туту ограничение в 15 символов после точки
  //  println("test")
 //   val name = readLine()
//    println("$name")
    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: $a < $b")
    println("Result: ${a < b}")
    println()
    println("Program arguments: $a <= $b")
    println("Result: ${a <= b}")
    println()
    println("Program arguments: $a >= $b")
    println("Result: ${a >= b}")
    println()
    println("Program arguments: $a > $b")
    println("Result: ${a > b}")
    println()
    println("Program arguments: $a + $b")
    println("Result: ${a + b}")
    println()
    println("Program arguments: $a - $b")
    println("Result: ${a - b}")
    println()
    println("Program arguments: $a / $b")
    println("Result: ${a / b}")
    println()
    println("Program arguments: $a * $b")
    println("Result: ${a * b}")
    println()
    println("Program arguments: $PI < $b")
    println("Result: ${PI < b}")
    println()
    println("Program arguments: $PI > $b")
    println("Result: ${PI > b}")
}