fun main() {
    val commissionRate = 0.0075 // 0.75%
    val minimumCommission = 35.0 // 35 рублей

    // Ввод суммы перевода из командной строки
    println("Введите сумму перевода в рублях:")
    val amountInput = readLine()
    val amount = amountInput?.toDoubleOrNull()

    if (amount == null || amount <= 0) {
        println("Некорректный ввод. Введите положительное число.")
        return
    }

    // Вычисление комиссии
    val commission = amount * commissionRate
    val finalCommission = if (commission < minimumCommission) minimumCommission else commission

    // Вывод результата
    println("Сумма перевода: $amount руб.")
    println("Комиссия: $finalCommission руб.")
}
