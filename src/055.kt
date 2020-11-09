// 055 init 블록 나누어 쓰기

class Size(width: Int, height: Int)
{
    val width = width
    val height: Int

    init {
        this.height = height
    }

    val area: Int

    init {
        area = width * height // init 블록은 여러 개로 나누어 쓸 수 있다.
    }
}

fun main(args: Array<String>)
{
    val size = Size(10, 50)
    println(size.area)
}