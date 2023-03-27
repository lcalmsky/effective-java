### checked exception과 unchecked exception의 차이?
* checked exception
  * 다시 throw하거나 try-catch 해야함
  * compile 타임에 체크
  * 복구가 가능한 상황
* unchecked exception
  * 런타임
  * 복구가 불가능한 상황

### 메소드 선언부에 unchecked exception을 선언하는 이유는?
* 명시적으로 사용하는 client 알려주기 위해

### checked exception은 왜 사용할까?
* 에러가 발생했을 때 클라이언트가 후속작업을 해주길 바라는 경우
* 클라이언트에게 액션을 강요

### java의 모든 runtime exception 클래스 이름 한번씩 읽어보기

### 