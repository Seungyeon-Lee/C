// 063 멤버 함수의 중위 표기법(Infix Notation)

package ex_package

class Point(var x: Int = 0, var y: Int = 0)
{
    // base를 원점으로 생각했을 때의 좌표를 반환한다.
    // 즁위표기법 방식. a 연산자 b 순서로 표현식을 구성한다.
    // 멤버 함수의 매개변수가 하나뿐이면 중위 표기법으로 호출 가능하다.
    infix fun from(base: Point): Point
    {
        return Point(x - base.x, y - base.y)
    }
}

fun main(args: Array<String>)
{
    val pt = Point(3, 6) from Point(1, 1) // Point(3, 6).from(Point(1,1))과 동일
    println(pt.x)
    println(pt.y)
}