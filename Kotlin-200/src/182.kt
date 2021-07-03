// 182 KotlinVersion 클래스: 사용중인 코틀린 버전 알아내기

package ex_kotlin_version

fun main(args: Array<String>)
{
    val kotlinVersion: KotlinVersion = KotlinVersion.CURRENT // KotlinVersion 컴패니언 오브젝트의 CURRENT 프로퍼티에 현재 코틀린 버전을 갖는 Kotlin Version 객체가 담겨있다.
    println("${kotlinVersion.major}.${kotlinVersion.minor}.${kotlinVersion.patch}") // 코틀린의 메이저, 마이너, 패치 버전을 Int 타입으로 가져올 수 있다.
    println(kotlinVersion.isAtLeast(1, 1, 0)) // isAtLeast 멤버 함수를 사용하면 코틀린이 특정 버전 이상인지를 쉽게 판단할 수 있다.
}