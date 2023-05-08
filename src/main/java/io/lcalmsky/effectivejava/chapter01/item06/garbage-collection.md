* 기본 개념
  * Mark: 참조를 가지고 있는지 체크
  * Sweep: 필요 없는 Object를 heap에서 제거
  * Compact: 파편화 된 메모리를 compact하게
  * Young Generation (Eden, S0, S1), Old Generation
  * Minor GC, Full GC
  * 자바 8 기본 GC: parallel GC
  * Full GC algorithm
    * Serial, Parallel, CMS, G1, **ZGC**, Shenandoah
  * Throughput: 처리량, 애플리케이션과 GC 비율
  * **Latency (Stop-The-World)**: Full GC 수행 시간
  * Footprint: GC로 인해 얼마나 더 많은 메모리를 사용하는가
* throughput을 더 많이 쓰더라도 latency를 줄이는 게 중요
* throughput은 서버를 늘려서 해결 가능
* JVM 버전마다 기본 GC가 뭔지는 알고있는 게 좋다
  * 8: parallel
  * 11: G1
* ZGC까지는 공부하는 게 좋음, production level에서 사용할 수 있는 가장 발전된 형태의 algorithm
* CMS(Concurrent Mark & Sweep)는 deprecated 되었음
* java option & tool

