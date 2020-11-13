// 190 코틀린에서 자바 코드 접근하기: 타입

fun main(args: Array<String>)
{
    val rand: Double = Math.random()
    println(rand)

    val buffer: StringBuffer = StringBuffer() // 코틀린에서 자바 코드로 불러오면 자바의 기본 타입들은 정해진 코틀린 타입으로 바뀌게 된다.
    buffer.append("hello, ")
    buffer.append("world!")
    val result: String = buffer.toString()
    println(result)
}