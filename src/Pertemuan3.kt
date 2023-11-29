fun main() {
    //konkal() //materi pertama
    //if_else() //materi kedua
    for_loop()
}

fun konkal() {
    //Kondisi dan Kalkulasi
    // aritmatika
    val a = 1 + 1
    println(a)
    val b = 1 - 1
    println(b)
    val c = 2 * 2
    println(c)
    val d = 2 / 2
    println(d)
    val e = 10 % 2
    println(e)
    // kondisi
    val lb = 20 > 1
    println(lb)
    val lbs = 20 >= 20
    println(lbs)
    val lk = 2 < 3
    println(lk)
    val lks = 2 <= 2
    println(lks)
    val sd = 20 == 20
    println(sd)
    val tsd = 20 != 12
    println(tsd)
    // operator logika
    val andVar = 19 > 17 && 3 > 12
    println(andVar);
    val orVar = 8 > 27 || 7 > 5
    println(orVar);
    val negVar = !true
    println(negVar)
}

fun if_else() {
    val nilai = 70
    //if else satuan
    if (nilai > 50) {
        println("Lulus")
    } else {
        println("Tidak Lulus")
    }
    //if else borongan
    if (nilai > 70) {
        println("A")
    } else if (nilai > 60) {
        println("B")
    } else {
        println("C")
    }
    //when
    val numwhen = 3
    val exwhen = when (numwhen > 2 && numwhen > 4) {
        true -> "True"
        false -> "False"
    }
    println(exwhen)
}

fun for_loop() {
    for (i in 1 .. 10) {
        //print("Nilai ke-$i")
        for (j in 10 downTo i) {
            print(" ")
        }
        for (k in 1..i) {
            print("*")
        }
        println()
    }
    //array
    val cars = arrayOf("Volvo", "BMW", "Hyundai", "Tesla")
    for (x in cars) {
        println("Mobil $x")
    }
    //while
    var n = 0
    while (n < 5) {
        println("Nilai $n")
        n++
    }
    //do
    var donum = 1
    do {
        println("Do eksperimen ke-$donum")
        donum++
    }while (donum < 5)
}