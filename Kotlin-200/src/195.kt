// 195 코틀린에서 자바 코드 접근하기: 연산자 오버로딩

fun main(args: Array<String>)
{
    val java = JavaClass()
    println(13 in java) // 자바의 메소드 중 연산자를 오버로딩하는 이름의 메소드가 있으면 코틀린에서 연산자의 형태로 접근이 가능하다.
    println(java[13])
    println(java[28])
    println(java[18])
}