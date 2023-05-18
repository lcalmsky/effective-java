* equals를 재정의 할 필요가 없는 경우
  * 각 인스턴스가 본질적으로 고유할 때
  * 인스턴스의 '논리적 동치성'을 검사할 필요가 없을 때
  * 상위 클래스에서 재정의한 equals가 하위 클래스에도 적절할 때
  * 클래스가 private이거나 package-private이고 equals 메서드를 호출할 일이 없을 때

* equals 규약
  * 반사성: A.equals(A) == true 
  * 대칭성: A.equals(B) == B.equals(A)
    * CaseInsensitiveString 
  * 추이성: A.equals(B) && B.equals(C), A.equals(C)
    * Point, ColorPoint(inherit), CounterPointer, ColorPoint(comp) 일관성: A.equals(B) == A.equals(B)
  * null-아님: A.equals(null) == false