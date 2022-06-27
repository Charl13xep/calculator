import java.util.Scanner
fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    print("Please enter your marks; ")
    var marks:Int = reader.nextInt()
    if (marks in 80..100){
        println("Excellent performance!!")
    }else if (marks in 70..79){
        println("Good performance")
    }else if (marks in 60..69) {
        println("Satisfactory performance")
    }else if (marks in 50..59){
        println("Average performance")
    }else if (marks in 0..49){
        println("Unsatisfactory performance")
    }else{
        println("Please enter a valid mark")
    }


}