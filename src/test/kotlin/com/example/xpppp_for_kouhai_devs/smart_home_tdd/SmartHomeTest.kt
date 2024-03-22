package com.example.xpppp_for_kouhai_devs.smart_home_tdd

import com.example.xpppp_for_kouhai_devs.smart_home_tdd.right.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class SmartHomeTest {
    //ここにテストを記述してください。
    //必要なTestDoubleは自分たちで設定しましょう。
    //TestDoubleを作るのにmockkなどの便利なライブラリがありますが今回は使用しないでください。

    // SmartHomeのrunメソッドが呼ばれた時にbulbWarningがtrueだったら、InfoDisplayのdisplayBulbWarningが呼ばれる

//    @BeforeEach // 関数に使う
    private lateinit var bulb: Bulb
    private lateinit var switch: Switch
    @BeforeEach
    fun setup() {
        bulb = B9100()
        switch = S9000()
    }

    @Test
    fun `bulbWarningがtrueの時、システムを起動するとInfoDisplayに「電球を交換してください」と表示する`() {
        val spyInfoDisplay = SpyInfoDisplay()
        val smartHome = AkiraHouse(bulb,switch,spyInfoDisplay)
        smartHome.bulbWarning = true
        smartHome.run()
        assertTrue(spyInfoDisplay.displayBulbWarning_wasCalled)
    }

    @Test
    fun `bulbWarningがfalseの時、システムを起動するとInfoDisplayに「電球を交換してください」と表示しない`() {
        val spyInfoDisplay = SpyInfoDisplay()
        val smartHome = AkiraHouse(bulb,switch,spyInfoDisplay)
        smartHome.bulbWarning = false
        smartHome.run()
        assertFalse(spyInfoDisplay.displayBulbWarning_wasCalled)
    }
}
