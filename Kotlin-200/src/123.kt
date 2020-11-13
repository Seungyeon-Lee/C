// 123 열거 클래스에 프로퍼티와 멤버 함수 선언하기

package ex_enum_class_members

enum class Mode(val number: Int) // 열거 클래스도 클래스의 일종이기 때문에 프로퍼티와 멤버 함수를 가질 수 있다.
{
    SELECTION(0), // 열거 클래스에 생성자가 있으면 열거 상수 각각에 (인수)를 적어 생성자를 호출해야 한다.
    PEN(1), // 열거 클래스의 인스턴스
    SHAPE(2),
    ERASER(3); // 열거 상수의 끝에 세미콜론을 반드시 붙여야 한다.

    fun printNumber()
    {
        println("모드: $number")
    }
}

fun main(args: Array<String>)
{
    // 현재 선택된 모드
    val mode: Mode = Mode.ERASER

    println(mode.number) // 열거 클래스의 ERASER 상수의 프로퍼티와 멤버 함수에 접근
    mode.printNumber()
}