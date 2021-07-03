// 192 코틀린에서 자바 코드 접근하기: 키워드 충돌

import java.util.*

fun main(args: Array<String>)
{
    val scanner: Scanner = Scanner(System.`in`)
    // 자바의 System 클래스에는 in이라는 이름의 정적 피드가 선언되어 있기 때문에 `in`으로 감싸주어서 사용한다.
    // ``은 특수문자가 들어간 식별자를 지을 때도 사용된다.

    val `어떤 변수`: Int = 10
    println(`어떤 변수`) // 식별자를 ``로 감싸면 띄어쓰기도 식별자 안에 담을 수 있다.
}