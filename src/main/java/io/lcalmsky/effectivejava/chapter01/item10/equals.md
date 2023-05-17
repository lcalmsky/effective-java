* equals를 재정의 할 필요가 없는 경우
  * 각 인스턴스가 본질적으로 고유할 때
  * 인스턴스의 '논리적 동치성'을 검사할 필요가 없을 때
  * 상위 클래스에서 재정의한 equals가 하위 클래스에도 적절할 때
  * 클래스가 private이거나 package-private이고 equals 메서드를 호출할 일이 없을 때