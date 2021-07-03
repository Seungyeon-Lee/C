// 062 in 연산자

fun main(args: Array<String>)
{
    // in 연산자는 어떤 값이 객체에 포함되어 있는지 여부를 조사하는 역할
    println('o' in "Kotlin") // true, "Kotlin".contains('o')과 동일
    println("in" !in "Kotlin") // false, !"Kotlin".contains("in")과 동일

    // in 연산자는 operator fun contains(매개변수: 타입): Boolean으로 오버로딩할 수 있다.
    // in 연산자는 when문에서도 사용 가능하다.
}