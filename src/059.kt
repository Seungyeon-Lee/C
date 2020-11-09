// 059 연산자 오버로딩(Operator Overloading)

class Point(var x: Int = 0, var y: Int = 0)
{
    // operator는 Point의 인스턴스 간에 연산자를 사용했을 때 해당 멤버 함수를 대신 호출하라는 뜻이다.
    operator fun plus(other: Point): Point // pt1 + pt2 시 수행, 매개 변수는 반드시 1개여야 한다.
    {
        return Point(x + other.x, y + other.y)
    }

    operator fun minus(other: Point): Point // 매개 변수의 타입과 함수 반환 타입은 마음대로 지정해도 된다.
    {
        return Point(x - other.x, y - other.y)
    }

    operator fun times(number: Int): Point
    {
        return Point(x * number, y * number)
    }

    operator fun div(number: Int): Point
    {
        return Point(x / number, y / number)
    }

    // 좌표 값을 출력한다.
    fun print()
    {
        println("x: $x, y: $y")
    }
}

fun main(args: Array<String>)
{
    val pt1 = Point(3, 7)
    val pt2 = Point(2, -6)

    val pt3 = pt1 + pt2
    val pt4 = pt3 * 6
    val pt5 = pt4 / 3

    pt3.print()
    pt4.print()
    pt5.print()
}