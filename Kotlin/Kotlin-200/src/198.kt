// 198 자바에서 코틀린 코드 접근하기: 프로퍼티

class KotlinClass
{
    // @JvmField // Getter/Setter가 아닌 필트 형태로 접근이 가능하도록 만들어준다.
    var num: Int = 0 // 해당 어노테이션을 붙이기 위해서는 프로퍼티가 private가 아니어야 하고, 프로퍼티에 open, override, const 키워드를 붙일 수 없고, 위임된 프로퍼티가 아니어야 한다.
        @JvmName("getter") get
        @JvmName("setter") set // 원하는 이름으로 Getter와 Setter를 만들 수 있다.
}