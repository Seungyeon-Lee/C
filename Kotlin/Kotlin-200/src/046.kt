// 046 메모리의 힙(Heap) 영역

fun main(args: Array<String>)
{
    // person 선언과 동시에 객체로 초기화
    // 스택에는 person 변수가 쌓이게 된다.
    val person = object // 이후 object 부분이 실행되며 힙 영역에 객체가 생성된다.
    {
        val name: String = "홍길동"
        val age: Int = 36
    }
    // person 참조 변수가 스택 영역에서 힙 영역의 객체를 가리키고 있게 된다.

    println(person.name)
    println(person.age)
}