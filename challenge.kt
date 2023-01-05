// Nama : Danial Farros Maualana
// Kelengkapan :
// (Done) Menerapkan bahasa pemrograman Kotlin (3 poin)
// (Done) Menerapkan control ﬂow (2 poin) --> if else
// (Done) Menerapkan function & method untuk masing-masing task (2 poin)
// (Done) Menerapkan setidaknya 2 konsep OOP dalam membuat bentuk (3 poin) --> Polymorphism and Inheritance

//penerapan OOP berupa Class
open class data{
    fun control(sisi : Int,bentuk : String){
        var nama : String = ""
        if (bentuk =="a")
            nama = "segitiga asli"
        else if (bentuk =="b")
            nama = "segitigaterbalik"
        else if(bentuk == "c")
            nama = "piramidafull"
        else if (bentuk == "d")
            nama = "x"
        else if (bentuk =="e")
            nama = "segitigabagidua"

        println("akan dibuat $nama dengan index $sisi")
    }
}

// Penerapan OOP Berupa Polymorphism dan Inheritance
class bentuk :data (){

}

fun main() {
    println("masukan index pembuatan bentuk")
    var sisi = Integer.valueOf(readLine())
    println("$sisi")
    println("daftar bentuk yang bisa di buat\n" +
            "a. segitiga asli\n" +
            "b. segitiga terbaalik\n" +
            "c. belah ketupat\n" +
            "d. bentuk X\n" +
            "e. segitiga siku siku\n" +
            "pilih bentuk yang akan dibuat (a/b/c/d/e)")

    var choice = readLine()
//    Penerapan Control Flow Percabangan
//    Penerapan fungsi di setiap Percangan
    if (choice =="a") {
        bentuk().control(sisi,choice)
        segitiga(sisi)
    }
    else if (choice =="b"){
        bentuk().control(sisi,choice)
        segitigaterbalik(sisi)
    }
    else if(choice == "c"){
        bentuk().control(sisi,choice)
        piramidafull(sisi)
    }
    else if (choice == "d"){
        bentuk().control(sisi,choice)
        x(sisi)
    }
    else if (choice =="e"){
        bentuk().control(sisi,choice)
        segitigabagidua(sisi)
    }
    else
        println("pilihan tidak ditemukan")

}

fun segitiga(input :Int){
//    val input = 4;
    for (i in input downTo 1){
        for(j in 1..i)
            print(" ");
        for(j in i..input-1)
            print("*");
        print("*")
        for(j in i..input-1)
            print("*");
        for(j in 1..i)
            print(" ");
        print("\n");
    }
}
fun segitigaterbalik(input :Int){
//    val input = 4;
    for (i in 1 .. input){
        for(j in 1..i)
            print(" ");
        for(j in i..input-1)
            print("*");
        print("*")
        for(j in i..input-1)
            print("*");
        for(j in 1..i)
            print(" ");
        print("\n");
    }
}

fun piramidafull(input :Int){
//    var input = 5;
    var setinput = input
    for (i in input downTo 1){
        for(j in 1..i)
            print(" ");
        for(j in i..input-1)
            print("*");
        print("*")
        for(j in i..input-1)
            print("*");
        for(j in 1..i)
            print(" ");
        print("\n");
    }
    for(i in 1..(2*input)+1)
        print("*")
    print("\n")
    for (i in 1 .. input){
        for(j in 1..i)
            print(" ");
        for(j in i..input-1)
            print("*");
        print("*")
        for(j in i..input-1)
            print("*");
        for(j in 1..i)
            print(" ");
        print("\n");
    }

}

fun x(x : Int){
//    val x = 5
    for(i in 0..x-1){
        for(j in 1..i)
            print(" ");
        print("*");
        for(j in 1..(2*(x-i)-1))
            print(" ");
        print("*");
        print("\n")
    }

    for(i in 1..x)
        print(" ")
    println("*")

    for(i in x-1 downTo 0){
        for(j in 1..i)
            print(" ");
        print("*");
        for(j in 1..(2*(x-i)-1))
            print(" ");
        print("*");
        print("\n")
    }
}

fun segitigabagidua(input: Int){
//    var input = 6
    for(i in 1..input){
        for (i in 1..i)
            print("*");
        print("\n");
    }
}