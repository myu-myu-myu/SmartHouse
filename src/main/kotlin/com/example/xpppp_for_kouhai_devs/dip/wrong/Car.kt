package DIP.Wrong

class Car() {
    //上位モジュールが下位モジュールに直接依存している
    private val wheel: NormalWheel = NormalWheel()
    fun drive(): String {
        val wheelStatus = wheel.rotate()
        return "$wheelStatus\n車が走ります!!"
    }

    fun back(): String {
        val wheelStatus = wheel.rotate()
        return "$wheelStatus\n車がバックします!!"
    }
}
fun main () {
    val car= Car()
    println(car.drive())
}

//仕様が変わってOptionWheelにしたい場合
//上位クラスであるCarがNormalWheelに直接依存しているため(依存性逆転の原則に違反)
//他の種類のホイールを使用するにはCarクラスを変更しなければならない



//↓OptionWheelに変えた場合
//class Car() {
//    private val wheel: OptionWheel = OptionWheel()
//    fun drive(): String {
//        val wheelStatus = wheel.rotateHighSpeed()
//        return "$wheelStatus\n車が走ります!!"
//    }
//
//    fun back(): String {
//        val wheelStatus = wheel.rotateHighSpeed()
//        return "$wheelStatus\n車がバックします!!"
//    }
//}

