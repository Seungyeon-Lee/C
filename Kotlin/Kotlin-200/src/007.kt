// 007 비트 연산자(Bitwise Operator and or xor inv shl shr ushr)

fun main(args: Array<String>): Unit
{
    // 코틀린의 비트 연산자는 기호가 아닌 '문자'로 되어 있다.
    println(15 and 7) // 7 (15&7)
    println(5 or 2) // 7 (5|2)
    println(15 xor 5) // 10 (15^5)
    println(32767.inv()) // -32767 (~32767)
    println(1 shl 3) // 8 (1 << 3)
    println(8 shr 1) // 4 (8 >> 1)
    println(-17 ushr 2) // 1073741819 (-17 >>> 2)
}