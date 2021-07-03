// 091 const

package ex_const

// const는 전역 변수, 오브젝트의 프로퍼티(Getter 사용없이) 등에 사용 가능하다.
const val hello = "Hello" + " World!" // 리터럴로 이루어진 표현식만 저장이 가능하다.

object Foo
{
    const val bar = "bar"
}

fun main(args: Array<String>)
{
    println(hello) // println("Hello World")로 대체된다. 변수에 접근하는 코드가 아예 변수에 저장된 값으로 대체되어 실행된다.
    println(Foo.bar)
    println(hello)
    println(Foo.bar)
}