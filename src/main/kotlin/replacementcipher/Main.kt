package replacementcipher

fun main() {
    val inputData = "тест"
    var outputData : String? = ""
    var currentValueForKey: Int?
    val driftInCipher = 3
    val replacementTable = LinkedHashMap<String, Int>()
    replacementTable["а"] = 1
    replacementTable["б"] = 2
    replacementTable["в"] = 3
    replacementTable["г"] = 4
    replacementTable["д"] = 5
    replacementTable["е"] = 6
    replacementTable["ё"] = 7
    replacementTable["ж"] = 8
    replacementTable["з"] = 9
    replacementTable["и"] = 10
    replacementTable["й"] = 11
    replacementTable["к"] = 12
    replacementTable["л"] = 13
    replacementTable["м"] = 14
    replacementTable["н"] = 15
    replacementTable["о"] = 16
    replacementTable["п"] = 17
    replacementTable["р"] = 18
    replacementTable["с"] = 19
    replacementTable["т"] = 20
    replacementTable["у"] = 21
    replacementTable["ф"] = 22
    replacementTable["х"] = 23
    replacementTable["ц"] = 24
    replacementTable["ч"] = 25
    replacementTable["ш"] = 26
    replacementTable["щ"] = 27
    replacementTable["ъ"] = 28
    replacementTable["ы"] = 29
    replacementTable["ь"] = 30
    replacementTable["э"] = 31
    replacementTable["ю"] = 32
    replacementTable["я"] = 33

    for (element in inputData) {
        currentValueForKey = replacementTable[element.toString()]?.plus(driftInCipher)
        if (currentValueForKey != null) {
            outputData += currentValueForKey.toUInt().toString(radix = 2)
        }
    }
    println(outputData)
}