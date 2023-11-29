fun main() {
    //val = static, var = dynamic
    val namaDepan: String = "Faiz"
    val namaBelakang = "Ahnaf"
    var usia = 15
    usia = 18
    //good run for null
    var nulltest: String? = null
    nulltest = "Siapa?"
    var chartest = 'A'
    chartest--
    //collection variable
    val listtest = listOf(2,4,2,7,4,9,3,8)
    val settest = setOf(5,2,4,3,4,6,7,5,6)
    val maptest = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India",
    )
    println(listtest + listtest[1])
    println(settest)
    println(maptest)
    println(maptest["Jakarta"])
    //mutable collection variable
    val mutlisttest = mutableListOf(3,"Makan",'M',false)
    mutlisttest.add(0,"Iya")
    mutlisttest[2] = "Makan sate ayam"
    mutlisttest.removeAt(3)
    println(mutlisttest)

    println("Halo, Nama saya $namaDepan $namaBelakang, usia saya $usia, $nulltest, $chartest")
}