// 140 변경할 수 있는(Mutable) 컬렉션

package ex_mutable_collection_interface // 자바와 달리 코틀린의 컬렉션은 기본적으로 수정이 불가능하다.

fun main(args: Array<String>)
{
    val mutableList: MutableCollection<Int> = mutableListOf(1, 2, 4, 2, 3, 2, 5) // 수정이 가능한 컬렉션을 만들려면 MutableCollection 인터페이스를 구현하는 컬렉션을 이용해야 한다.
    println(mutableList)

    mutableList.add(1) // 원소가 성공적으로 추가되었으면 true를 반환한다. (컬렉션이 원소의 중복을 허용하지 않는 등의 사유로 원소를 추가하지 못하면 false를 반환한다)
    println(mutableList)

    mutableList.addAll(listOf(3, 2, 4)) // elements 컬렉션의 모든 원소를 컬렉션에 추가한다. 원소가 하나라도 추가되었으면 true, 단 한 개도 추가되지 않았으면 false를 반환한다.
    println(mutableList)

    mutableList.remove(1) // element와 일치하는 원소를 하나 제거한다. 원소가 성공적으로 제거되면 true, 해당하는 원소가 없으면 false를 반환한다.
    println(mutableList)

    mutableList.removeAll(listOf(1, 2)) // elements 컬렉션의 원소들과 일치하는 '모든' 원소를 컬렉션에서 제거한다. 원소가 하나라도 제거되면 true, 삭제된 원소가 없으면 false를 반환한다.
    println(mutableList)

    mutableList.retainAll(listOf(3, 5)) // elements 컬렉션의 원소와 일치하는 원소만 남기고 컬렉션에서 모두 제거한다. 원소가 하나라도 제거되면 true, 삭제된 원소가 없으면 false를 반환한다.
    println(mutableList)

    mutableList.clear()
    println(mutableList) // 컬렉션을 반드시 수정해야 하는 상황이 아니라면 Mutable이 아닌 일반 Collection을 쓸 것을 권장한다. (수정이 가능하다면 컬렉션에 들어있는 버그 발생 시 어느 지점에서 수행하는 지를 찾아봐야하기 때문이다)
}