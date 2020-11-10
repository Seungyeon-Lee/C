// 076 안전한 호출 연산자(Safe Call Operator) ?.

package ex_safe_call_operator

// 멤버 함수 예제의 Building 클래스 재활용
import ex_member_function.Building

fun main(args: Array<String>)
{
    var obj: Building? = null
    obj?.print() // 참조 변수?.프로퍼티 = 참조변수가 null이면 멤버 함수를 호출하지 않는다.
    obj?.name = "건물" // 프로퍼티에 값을 저장하는 동작도 일종의 함수 호출이므로 null인 경우 호출되지 않는다.

    obj = Building()
    obj?.name = "서울월드컵경기장"
    obj?.date = "2001년 11월 10일"
    obj?.area = 21_6712
    obj?.print()
}