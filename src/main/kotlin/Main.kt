fun main() {
    val input = Scanner(System.`in`)
    val a = 3754973572456736097275273527456634.294802944298742973
    var b = 2302839582756834.230237529875892749028490184285425737
    val PI = 3.141592653589793
    var classtest = test()
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
    println("Program arguments: ${PI} < $b")
    println("Result: ${PI < b}")
    println()
    println("Program arguments: ${PI} > $b")
    println("Result: ${PI > b}")
}
