// 177 fromBits 확장 함수: 이진수 값으로부터 실수 값 만들기

fun main(args: Array<String>)
{
    val realNumber: Float = Float.fromBits(0b01000001_00100111_10101110_00010100)
    println(realNumber) // 이진수를 실수 값으로 변경 후 출력
}