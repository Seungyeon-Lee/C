// 122 열거 클래스(Enum Class)

package ex_enum_class

enum class Mode // 열거 클래스를 선언하려면 클래스 선언문 앞에 enum 키워드를 붙인다.
{
    SELECTION, PEN, SHAPE, ERASER // 식별자(열거 상수)는 모두 대문자로 하는 것이 좋다.
}

fun main(args: Array<String>)
{
    // 현재 선택된 모드
    val mode: Mode = Mode.PEN

    when (mode)
    {
        Mode.SELECTION -> println("선택 모드") // 열거 클래스.열거 상수 형태로 초기화가 가능하다.
        Mode.PEN -> println("펜 모드")
        Mode.SHAPE -> println("도형 모드")
        Mode.ERASER -> println("지우개 모드")
    }

}