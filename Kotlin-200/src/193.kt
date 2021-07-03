// 193 코틀린에서 자바 코드 접근하기: SAM 변환

fun main(args: Array<String>)
{
    val runnable: Runnable = Runnable { println("Sam") } // Runnable 인터페이스는 매개변수와 반환 타입이 없는 추상 메소드를 갖는다.
    // SAM(Single Abstract Method)는 메소드를 한 개만 갖고 있는 인터페이스이다. (EX. Runnable, Comparale)
    runnable.run()
}