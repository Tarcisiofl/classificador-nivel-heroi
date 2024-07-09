import java.util.*

fun main() {
    val reader = Scanner(System.`in`)

    print("Enter nickname: ")
    val nickName: String = reader.next()

    var currentXP: Int? = null
    while (currentXP == null) {
        print("Enter current XP: ")

        try {
            currentXP = reader.nextInt()
        } catch (e: Exception) {
            println("Invalid input for XP. Please enter a valid number.")
            reader.nextLine()
        }
    }

    val hero = Hero(nickName, currentXP)
    println(hero.outputMessage())
}