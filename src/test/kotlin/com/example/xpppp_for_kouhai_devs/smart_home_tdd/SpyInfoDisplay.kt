package com.example.xpppp_for_kouhai_devs.smart_home_tdd

import com.example.xpppp_for_kouhai_devs.smart_home_tdd.right.InfoDisplay

class SpyInfoDisplay: InfoDisplay {
    var displayBulbWarning_wasCalled = false
    override fun displayBulbWarning() {
        displayBulbWarning_wasCalled = true
    }
}
//
//class DummyBulb: Bulb {
//    override fun turnOn() {}
//
//}