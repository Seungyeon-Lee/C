// 017 비교 연산자(Comparison Operator) == != > < >= <=

fun main(args: Array<String>): Unit
{
    var isRight: Boolean = (10 + 70) > (3 * 25) // true (80 > 75)
    println(isRight)

    isRight = false
    println(isRight)

    // 코틀린에서 ==과 != 연산자는 자바의 equals 메소드를 호출한 것과 동일하다.
    // 객체의 참조 값끼리 비교하려면 ===과 !== 연산자를 사용해야 한다.
    
    isRight = 30 == (10 + 20) // true (30 == 30)
    println(isRight)

    isRight = 0.00001f == 0.005f * 0.002f // 실수 타입의 오차로 인해 정확한 비교 불가 false 반환
    println(isRight)

    isRight = 3.0 * 8 + 2.7 <= 16 // false (17.7 <= 16)
    println(isRight)
}