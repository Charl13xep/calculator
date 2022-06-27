import java.util.Scanner
fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter a number; ")
    var no1:Int = reader.nextInt()
    println("Choose operator;\n--------------------------------------------------------------------------")
    println(" \n + = addition \n - = subtraction \n / = division \n * = multiplication\n")
    println("--------------------------------------------------------------------------")
    print("= ")
    val operator1 = readln()
    print("Enter a second number; ")
    val no2:Int = reader.nextInt()
    if (operator1 == "+" ){
        val ans = no1 + no2

        println(" $no1 + $no2 = $ans")
    }else if (operator1 == "-" ) {
        val ans = no1 - no2

        println(" $no1 - $no2 = $ans")
    }else if (operator1 == "*" ) {
        val ans = no1 * no2

        println(" $no1 * $no2 = $ans")
    }else if (operator1 == "/" ) {
        val ans = no1 / no2
        val nkt = ans.toDouble()

        println(" $no1 / $no2 = $nkt")
    }
}