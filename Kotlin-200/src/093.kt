// 093 Nullable 리시버

package ex_nullagble_receiver

// 리시버 타입에 ?가 붙어있는 경우 Nullable 리시버라고 한다.
fun String?.isNumber()
{
    if(this == null)
        println("문자열이 null입니다.")
}

fun main(args: Array<String>)
{
    val empty: String? = null
    empty.isNumber() // 리시버 타입이 Nullable이므로 표현식이 null이어도 확장 함수를 호출할 수 있다.
}