// 082 접근 지정자(Access Modifier)

package ex_access_modifier

class Rectangle(private val width: Int, private val height: Int)
{
    val area: Int
        get() = width * height
}

fun main(args: Array<String>)
{
    val rect = Rectangle(5, 7)
    // println(rect.width) 프로퍼티를 private로 지정하였으므로 접근할 수 없다.
    println(rect.area) // public이므로 접근할 수 있다.
}