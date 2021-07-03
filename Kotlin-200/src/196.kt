// 196 코틀린에서 자바 코드 접근하기: 클래스 참조

fun main(args: Array<String>)
{
    val number: Int = 26
    val str: String = "2018년"

    JavaClass.printClassInfo(number::class.java) // 자바와 호환되는 Class<T> 타입의 객체를 가져온다.
    JavaClass.printClassInfo(str::class.java)
    JavaClass.printClassInfo(Double::class.java)
}