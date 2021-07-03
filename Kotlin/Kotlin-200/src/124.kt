// 124 열거 클래스 활용하기

package ex_enum_class_practice

enum class Mode
{
    SELECTION, PEN, SHAPE, ERASER
}

fun main(args: Array<String>)
{
    val shapeMode: Mode = Mode.SHAPE
    println(shapeMode.name)
    println(shapeMode.ordinal)

    val modes: Array<Mode> = Mode.values()
    for (mode: Mode in modes)
        println(mode) // 모든 열거 상수의 값을 출력한다.

    println(Mode.valueOf("PEN").ordinal) // valueOf는 String 타입의 열거 상수의 이름으로부터 열거 상수를 찾아서 반환한다.
}