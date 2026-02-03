package collections

fun main(args: Array<String>) {
    val namesToAges = mapOf(Pair("Peter",24), Pair("Roger",25), Pair("Pin",26), Pair("Pee",27))
    val namesToAges2 = mapOf(
        "Peter" to 24,
        "Roger" to 25,
        "Pin" to 26,
        "Pee" to 27
    )

    println(namesToAges == namesToAges2)

    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    val countryToInhabitants = mutableMapOf(
        "Germany" to 80_000_000,
        "USA" to 300_000_000,
    )

    countryToInhabitants.put("USA", 400_000_000)
    countryToInhabitants.putIfAbsent("USA", 400_000_000)

    println(countryToInhabitants)

    println(countryToInhabitants.contains("Australia"))
    println(countryToInhabitants.containsKey("France"))
    println(countryToInhabitants.containsValue(200_000_000))

    println(countryToInhabitants.get("Germany"))
}