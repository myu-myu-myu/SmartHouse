package DIP.Wrong

class Car() {
    //上位モジュールが下位モジュールに直接依存している
    private val wheel: NormalWheel = NormalWheel()
    fun drive(): String {
        return "${wheel.rotate()} -- 車が走ります!!\n"
    }
    fun back(): String {
        return "${wheel.rotate()} -- 車がバックします!!\n"
    }
}

//OptionWheelに変えた場合
class Car2() {
    private val wheel: OptionWheel = OptionWheel()
    fun drive(): String {
        return "${wheel.rotateHighSpeed()} -- 車が走ります!!\n"
    }
    fun back(): String {
        return "${wheel.rotateHighSpeed()} -- 車がバックします!!\n"
    }
}

fun main () {
    println(" - - - Wrong version - - - ")
    println(Car().drive())
    println(Car().back())
    println(Car2().drive())
    println(Car2().back())
}

//仕様が変わってOptionWheelにしたい場合
//上位クラスであるCarがNormalWheelに直接依存しているため(依存性逆転の原則に違反)
//他の種類のホイールを使用するにはCarクラスを変更しなければならない