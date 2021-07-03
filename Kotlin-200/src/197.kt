// 197 자바에서 코틀린 코드 접근하기: 패키지 레벨 변수·함수
@file:JvmName("MyKotlin") // 파일이름이 아닌 적혀진 이름으로 클래스 이름을 만들도록 컴파일러에 지시한다.
package ex_kotlin_to_java_package_level

val a = 10

fun func() = println("Hello")

fun Int.extension() = println(this)

fun func2() = println("From File2.kt")