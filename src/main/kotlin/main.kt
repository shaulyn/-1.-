import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    println("Введите число: ")
    var amount = sc.nextInt()
    val discount = if (amount * 0.75 / 100 > 35) {
        amount * 0.75 / 100
    } else {
        35
    }
    println("Вы перевели $amount рублей, комиссия составила $discount рублей")
}