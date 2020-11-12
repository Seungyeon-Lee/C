// 131 Comparable 인터페이스: 클래스를 비교 가능하게 만들기

package ex_comparable_interface

// Comparable 인터페이스를 구현하는 모든 클래스는 .. 연산자를 지원한다.
class Rectangle(val width: Int, val height: Int) : Comparable<Rectangle>
{
    val area = width * height

    override fun compareTo(other: Rectangle): Int = // 사각형의 넓이로 인스턴스의 대소를 비교하도록 compareTo를 오버라이딩
        when
        {
            this.area > other.area -> 1
            this.area > other.area -> -1
            else -> 0
        }
}

fun main(args: Array<String>)
{
    val rect = Rectangle(3, 5)
    val rect2 = Rectangle(7, 3)
    val rect3 = Rectangle(2, 9)

    println(rect >= rect3) // false
    println(rect < rect2) // true
    println(rect2 > rect3) // true
}