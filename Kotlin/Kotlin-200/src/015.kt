// 015 배정 연산자(Assignment Operator)

fun main(args: Array<String>): Unit
{
    val a: Int
    var b: Int

    a = 10 + 5
    b = 10

    b += a // b에 a의 값을 누적
    println(b)

    b %= 3 // b를 3으로 나눈 나머지를 b에 저장
    println(b)

    // 연산자 우선순위는 */% > +- > = 순서이다.
    // a += 3은 a = a + 3과 동일하다.
}