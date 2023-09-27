package com.example.xpppp_for_senpai_devs.smart_home_tdd.right

class B9100: Bulb {
    override fun turnOn(){
        print("照明が点灯しました")
    }
    override fun turnOff(){
        print("照明が消灯しました")
    }
}