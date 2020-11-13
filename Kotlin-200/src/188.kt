// 188 timer 함수: 타이머 생성하기

import java.util.Timer
import kotlin.concurrent.timer

fun main(args: Array<String>)
{
    var i = 1
    val t: Timer = timer(initialDelay = 1500, period = 250) { // 1500 밀리 초간 대기한 뒤, 250 밀리 초마다 정수 값을 증가시키며 출력하는 타이머를 생성하고 실행한다.
        println(i)
        i += 1
    }

    Thread.sleep(2400) // 2400 밀리 초간 대기한 뒤, cancel 멤버 함수로 타이머를 중단시켰다.
    t.cancel()
}