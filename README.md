### CRUDRepository를 이용한 간단 테스트 완료 
```sql
docker docker-compose-redis.yml 파일 추가됨 - 서버 바로 구동 가능하도록 설정해야 함
docker 사용하여 redis server, cli환경 구성 및 Hash값 key-value 구현 완료

docker 설치 하여 redis server 구성해야 Spring server 열림 (포트 아웃바운드:인바운드 6379:6379)

Redis server내의 값 확인할려면 Redis cli환경 구축하여 통신해서 값을 가져와야 한다.

의존성 - Redis
implementation 'org.springframework.boot:spring-boot-starter-data-redis-reactive'
implementation group: 'org.springframework.boot', name: 'spring-boot-starter-data-redis', version: '2.7.4'
config - RedisCachConfig 설정파일로 설정 완료

날짜 - Timestamp, Date 사용시 parsing 유의할 것

Entity에 @RedisHash 어노테이션을 사용하여 키값을 지정하였다. - @Id 어노테이션 지정해줘야 한다.(primary key)

value값은 Entity의 field값이 되겠다.

```