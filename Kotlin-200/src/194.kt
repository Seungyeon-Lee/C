// 194 코틀린에서 자바 코드 접근하기: Getter/Setter

fun main(args: Array<String>)
{
    val java = JavaClass()

    java.something = 301 // 자바 클래스에 get, set으로 시작하는 메소드가 있다면 코틀린에서 프로퍼티로 접근이 가능하다.
    println(java.something)

    println(java.isGood)
    println(java.doubleValue)
}