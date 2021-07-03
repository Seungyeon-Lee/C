// 086 확장 함수(Extension Function)

package ex_extension_funciton

// 문자열이 숫자로만 이루어져있는지 판단하는 확장 함수
// 함수를 주입할 클래스(리시버).확장 함수
fun String.isNumber(): Boolean // 확장 함수를 사용하면 상속 없이 클래스 외부에서 멤버 함수를 추가할 수 있다.
{
    var i = 0
    while (i < this.length)
    {
        // 숫자가 아닌 문자가 하나라도 들어있으면 false 반환
        if(!('0' <= this[i] && this[i] <= '9'))
            return false
        i += 1
    }

    // 모든 조건을 통과하면 true 반환
    return true
}

fun main(args: Array<String>)
{
    println("1234567890".isNumber()) // true
    println("500원".isNumber()) // false
    // 클래스에 이미 존재하는 멤버 함수와 동일한 시그니처의 확장 함수가 있다면 멤버 함수만 항상 호출된다.
}