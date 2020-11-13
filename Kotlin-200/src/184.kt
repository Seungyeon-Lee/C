// 184 코드 성능 측정하기

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

fun main(args: Array<String>)
{
    println(measureTimeMillis { // block에 전달한 함수를 호출하고, 함수가 끝나기까지 경과한 시간을 밀리 초 단위로 반환한다.
        var sum = 0L
        for(i in 1..100000000)
            sum += i
    })

    println(measureNanoTime { // measureTimeMillis와 동작이 같으며 함수가 끝나기까지 경과한 시간을 나노 초 단위로 반환한다.
        var sum = 0L
        for(i in 1..100000000)
            sum += i
    })
}