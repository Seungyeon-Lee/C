// 092 lateinit

package ex_lateinit

// 점을 표현하는 클래스
class Point(val x: Int, val y: Int)

// 사각형을 표현하는 클래스
class Rect
{
    lateinit var pt: Point // lateinit이 붙은 프로퍼티는 클래스 내부에서 바로 초기화하지 않아도 된다.
    lateinit var pt2: Point // lateinit은 var 프로퍼티에만 붙일 수 있다.

    val width: Int get() = pt2.x - pt.x
    val height: Int get() = pt2.y - pt.y
    val area get() = width * height
}

fun main(args: Array<String>)
{
    val rect = Rect()
    rect.pt = Point(3, 3)
    rect.pt2 = Point(6, 5)
    
    println("너비: ${rect.width}") // 만약 pt와 pt2 프로퍼티 값을 지정하지 않은 채로 접근하면 UninitializedPropertyAccessException 예외가 발생한다.
    println("높이: ${rect.height}") // if(rect::pt.isInitialized)를 사용하여 lateinit 프로퍼티가 초기화되었는지 알 수 있다.
    println("넓이: ${rect.area}")
}