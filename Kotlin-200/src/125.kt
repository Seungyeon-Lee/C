// 125 sealed 클래스

package ex_sealed_class

sealed class Outer // sealed 클래스는 자신의 중첩 클래스에만 상속을 허용하는 클래스이다.
{
    class One: Outer() // Outer 클래스는 자신의 중첩 또는 내부 클래스에서만 상속이 가능하다.
    class Two: Outer() // Outer 클래스 자체로는 인스턴스를 만들 수 없다.
    class Three: Outer()
}

// class Four : Outer() Outer 클래스는 자신의 중첩 클래스에서만 상속이 가능하므로, 오류가 발생한다.

fun main(args: Array<String>)
{
    val instance: Outer = Outer.Three()

    val text: String = when (instance) // instance 변수의 실제 타입을 판별하여 대응되는 String 리터럴로 반환하는 when 표현식
    {
        is Outer.One -> "첫 번째"
        is Outer.Two -> "두 번째"
        is Outer.Three -> "세 번째" // sealed 클래스의 모든 서브 타입을 체크했다면 else 블록을 생략해도 표현식을 구성할 수 있다.
    }
    println(text) // 세 번째
}