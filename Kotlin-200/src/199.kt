// 199 자바에서 코틀린 코드 접근하기: 선언된 객체

object KotlinObject
{
    // @JvmStatic을 사용한 프로퍼티와 멤버 함수는 INSTANCE 필드 없이 접근할 수 있다.
    var num = 52

    fun hello() = println("Hello")
}