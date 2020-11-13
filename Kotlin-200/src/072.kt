import java.lang.NumberFormatException

// 072 예외 처리

fun main(args: Array<String>)
{
    try // 예외가 발생할 가능성이 있는 부분
    {
        val str = "abcd"
        val num = str.toInt()

        println(num)
    }
    catch (e: NumberFormatException) // 예외가 발생했을 때 실행할 코드, 예외타입 지정 (여러 종류의 예외를 처리하려면 catch 블록을 여러 개 사용한다)
    {
        println("문자열을 숫자로 변경하지 못함")
    }
    finally // 예외 발생 여부와 상관없이 무조건 실행되는 블록 (생략 가능)
    {
        println("프로그램 종료")
    }
}