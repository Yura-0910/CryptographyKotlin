package ru.lainer

fun main() {
    val source = arrayOf(
        charArrayOf('А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З'),
        charArrayOf('И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р'),
        charArrayOf('С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ'),
        charArrayOf('Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я', '0', '1', '2'),
        charArrayOf('3', '4', '5', '6', '7', '8', '9', '0', ' ')
    )

    val replace = arrayOf(
        intArrayOf(11, 12, 13, 14, 15, 16, 17, 18, 19),
        intArrayOf(20, 21, 22, 23, 24, 25, 26, 27, 28),
        intArrayOf(29, 30, 31, 32, 33, 34, 35, 36, 37),
        intArrayOf(38, 39, 40, 41, 42, 43, 44, 45, 46),
        intArrayOf(47, 48, 49, 50, 51, 52, 53, 54, 55)
    )

    val relationshipMap = mutableMapOf<Char, Int>()

    //Перебираем два двумерных массива и заполняем mutableMap
    for (i in 0..4)
        for (j in 0..8)
            relationshipMap[source[i][j]] = replace[i][j]

    //Читаем данные с консоли
    println("Введите данные:: ")
    val data = readlnOrNull()

    //Обрабатываем прочитанные данные с консоли
    var result = ""
    var code: Int? = 0
    if (data != null) {
        for (char in data) {
            code = relationshipMap.getOrDefault(char.uppercaseChar(), 9)
            result += code.toString()
        }
    }

    println(result)
}