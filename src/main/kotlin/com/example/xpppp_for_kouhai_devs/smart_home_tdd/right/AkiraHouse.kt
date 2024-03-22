package com.example.xpppp_for_kouhai_devs.smart_home_tdd.right
//ヒント
//DIPの講義で使用したCarのコードを参考にしましょう。
//wrongフォルダに良くない例としてスマートホームのサンプルコードを示してあります。
//サンプルコード（wrongフォルダ内）を良くみてDIPに則った形に書き直してください。
//まずは必要なインターフェースを実装しましょう

//次にアキラくんの家（class AkiraHouse)を宣言し実装しましょう
//アキラくんの家はSmartHomeのインターフェースを継承する形で定義してください。
//アキラくんの家は依存関係を注入できるようにコンストラクターの引数を設定しましょう。

interface SmartHome {
    fun run()
    var bulbWarning: Boolean
}
class AkiraHouse(
    private val bulb: Bulb,
    private val switch: Switch,
    private val infoDisplay:InfoDisplay
): SmartHome {
    override var bulbWarning = false
    override fun run() {
        lightning(bulb, switch)
        if (bulbWarning){
            infoDisplay.displayBulbWarning()
        }
    }

    private fun lightning(bulb: Bulb, switch: Switch) {
        if(switch.isOn()){
            bulb.turnOn()
        }else{
            bulb.turnOff()
        }
    }
}