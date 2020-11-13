// 008 정수 타입과 실수 타입
fun main(args: Array<String>): Unit
{
    val a: Byte = 125
    val b: Short = (100 + 200) * 100 // 300000
    var c: Int = 12_4354_6538 // 언더스코어를 넣어 숫자를 좀 더 알아보기 쉽게 표현한다
    c = 0xFF_88_88 // 0x로 시작하면 16진수로 인식한다
    c = 0b01010010_01100011_01110101_01000101 // 0b로 시작하면 2진수로 인식한다
    var d: Long = -543_7847_3984_7238_4723

    c = a + b
    d = c + 10L // 30135L
    var e : Float = 67.6f
    val f: Double = 658.456
    e = (e + f).toFloat() // 726.056
    println(e) // 726.0
}