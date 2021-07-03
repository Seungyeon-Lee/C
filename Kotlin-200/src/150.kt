// 150 CharSequence 인터페이스: 문자열과 관련된 클래스가 구현하는 뼈대 인터페이스

fun main(args: Array<String>) {
    // CharSequence는 String, StringBuilder 등 문자열과 관련된 클래스들이 구현하는 기본적인 뼈대 인터페이스이다.
    // Sequence 인터페이스를 상속하지 않고, 다른 어떠한 인터페이스도 상속하지 않는다.

    val seq: CharSequence = "Hello"
    println(seq.length)
    println(seq[2])
    println(seq.subSequence(1, 4)) // CharSequence의 멤버는 3개뿐이지만 CharSequence를 리시버로 하는 수많은 확장 멤버가 표준 라이브러리에 존재하므로 활용도는 매우 높다.
}