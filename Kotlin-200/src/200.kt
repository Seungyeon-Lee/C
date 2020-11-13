// 200 자바에서 코틀린 코드 접근하기: 동반자 객체

class KotlinClass2
{
    companion object // 동반자 객체가 있는 클래스는 자바에서 Companion이라는 이름의 static 필드를 갖는다.
    {
        var num = 0 // 동반자 객체도 다른 멤버 변수, 함수와 마찬가지로 @JvmStatic 어노테이션을 붙여 static으로 접근하게 만들 수 있다.

        fun hello() = println("Hello")
    }
}