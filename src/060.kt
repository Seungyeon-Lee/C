// 060 번호 붙은 접근 연산자 (Indexed Access Operator) []

class Person2(var name: String, var birthday: String)
{
    operator fun get(position: Int): String
    {
        return when (position) {
            0 -> name
            1 -> birthday
            else -> "알 수 없음"
        }
    }

    operator fun set(position: Int, value: String) // [] 연산자 오버로딩
    {
        when (position)
        {
            0 -> name = value
            1 -> birthday = value
        }
    }
}

fun main(args: Array<String>)
{
    val person = Person2("Kotlin", "2016-02-15")
    println(person[0]) // person.get(0)과 동일하다.
    println(person[1])
    println(person[-1])
    // person[1, 2, 3] 호출 시 person.get(1, 2, 3) 호출됨
    // person[1, 2] = "J" 호출 시 person.set(1, 2, "J") 호출됨

    person[0] = "Java" // person.set(0, "Java")와 동일하다. 대입되는 표현식이 마지막 인수가 된다.
    println(person.name)
}