// 114 제네릭이 적용된 클래스 / 인터페이스 상속·구현하기

package ex_inherit_from_generic

interface Plusable<T>
{
    operator fun plus(other: T): T // T타입과 덧셈이 가능하게 하는 인터페이스를 선언하고 있다.
}

class Rectangle(val width: Int, val height: Int) : Plusable<Rectangle>
{
    override fun plus(other: Rectangle) = // Pluseable에는 제네릭이 적용되어 있으므로 타입 인수(Rectangle)를 전달한다.
            Rectangle(width + other.width, height + other.height) // width와 height를 각각 더하도록 오버라이딩 한다.

    override fun toString() = "width: $width, height: $height"
}

fun main(args: Array<String>)
{
    val rect = Rectangle(10, 5)
    val rect2 = Rectangle(3, 8)

    println(rect + rect2)
}