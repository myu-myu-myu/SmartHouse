package com.example.xpppp_for_kouhai_devs.smart_home_tdd.right

//SmartHomeのインターフェースを宣言してください。
interface Main{
}
interface Bulb {
    fun turnOn()
    fun turnOff()
}

interface Switch {
    fun isOn():Boolean
}
interface InfoDisplay {
    fun displayBulbWarning()
}
//main関数はスマートホームに必要な部品のインスタンスを作成し、アキラくんの家に依存を注入する。
//  ↓６行目から１３行目までのコメントアウトを解除してから始めてください
fun main(){
    //現状はクラスが宣言されていないのでエラーが出ていますが正しく実装できればエラーはなくなるはずです。
    val bulb = B9100()
    val switch = S9000()
    val infoDisplay = D9000()
    val smartHome = AkiraHouse(bulb, switch, infoDisplay)
    smartHome.run()
}
