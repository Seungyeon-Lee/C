// 044 import

import ex_package.max // 함수를 패키지 이름 없이 호출할 수 있다.
import ex_package.min as ex_min // 새로운 함수 이름으로 해당 함수를 호출할 수 있다.
// import ex_package.*과 같이 적으면 ex_package에 있는 모든 함수를 패키지 이름 없이 호출할 수 있다.

fun main(args: Array<String>)
{
    println(max(55, 47))
    println(ex_min(3, 10))
}