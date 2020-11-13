// 187 thread 함수: 스레드 생성하기

import kotlin.concurrent.thread // thread 함수는 JVM 스레드를 생성하기 때문에 이 함수를 사용하면 JVM에 의존성이 생긴다.

fun main(args: Array<String>)
{
    thread (start = true) { // 스레드를 생성과 동시에 시작한다.
        print("Hello, ")
        Thread.sleep(1000) // 인수를 지정한 시간(밀리 초)만큼 대기한다.
        print("World!")
    }

    Thread.sleep(500)
    print("Kotlin ")
}