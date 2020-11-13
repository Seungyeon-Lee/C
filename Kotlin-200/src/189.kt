// 189 synchronized 함수: 스레드 동기화하기

import kotlin.concurrent.thread

private var obj: Int = 0

@Synchronized // synchronized 키워드 대신 함수에 붙일 수 있는 어노테이션으로 바뀌었다.
private fun objPlus()
{
    for(i in 1..1000) // obj는 동시 수정으로부터 보호할 객체이다.
        obj++ // obj를 점유하고 있는 동안 실행할 함수이다.
}

fun main(args: Array<String>)
{
    thread { objPlus() } // 두 개의 스레드에서 obj의 값을 동시에 증가시키고 있다.

    objPlus()
    Thread.sleep(100)
    println(obj)
}