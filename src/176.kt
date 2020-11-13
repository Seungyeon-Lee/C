// 176 toBits, toRawBits 확장 함수: 실수 타입을 이진수 값으로 가져오기

fun main(args: Array<String>)
{
    val normal = 10.0 // 일반 실수
    val infinite = 10.0 / 0 // 무한
    val nan = 0.0 / 0 // NaN

    println(normal.toBits().toString(2)) // toString(2)로 하여 인수인 2진법대로 문자열을 생성한다.
    println(infinite.toBits().toString(2))
    println(nan.toBits().toString(2))

    println(normal.toRawBits().toString(2))
    println(infinite.toRawBits().toString(2))
    println(nan.toRawBits().toString(2))
}