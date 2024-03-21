package DIP.Right

import com.example.xpppp_for_senpai_devs.dip.right.WheelAbstraction

// 下位モジュールの抽象に依存
class NormalWheel: WheelAbstraction {
    override fun rotate(): String {
        return "ノーマルホイールが回転します！"
    }
}

// 下位モジュールの抽象に依存
//class OptionWheel: WheelAbstraction {
//    private fun rotateHighSpeed(): String {
//        return "オプションホイールが超高速回転します！"
//    }
//    override fun rotate(): String {
//        return rotateHighSpeed()
//    }
//}