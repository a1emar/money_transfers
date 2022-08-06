fun main() {
    val amount = 100_000
    var fee = 3_500.00
    val tax = 0.75
    fee = if ((amount * tax) < fee) fee else amount * tax
    println("VK fee: " + fee.toInt() + "коп")
}