import java.util.Scanner
fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Enter a number; ")
    var no1: Int= reader.nextInt()
    print("Enter a second number; ")
    var no2:Int = reader.nextInt()
    var answer = no1 + no2
    print(answer)
}