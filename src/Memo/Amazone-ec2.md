# EC2 인스턴스 생성하기
 - AWS EC2의 서버 장비를 대여(로그, 모니터링,네트워크 관리)
 - 24시간 서버를 작동시키는 방법 
 ~~~
집 pc를 24시간 구동
호스팅서비스 (카페24) 이용
클라우드서비스(AWS) 이용
~~~

 - AWS 계정 생성
 - 서비스 ec2 찾기
 - 인스턴승 생성( AMI를 선택)
 - 탄력적 IP 다운
 - cp pem 키를 내려받은 위치 ~/.ssh
 - ll || grep pem 파일명( 파일 찾기)
 - chmod 600 ~/.ssh/pem 이름
 - vim ~/.ssh/config
 ~~~
   Host myServiceName
      HostName {public Ip 주소}
      User ec2-user
      IdentityFile ~/.ssh/myServiceName.pem
 ~~~
 - chmod 700 ~/.ssh/config
 - ssh config에 등록한 서비스명
 - 접속 성공
 - 자바8 설치
 - $ sudo yum install -y java-1.8.0-openjdk-devel.x86_64
 - $ sudo /usr/sbin/alternatives --config java
 - 시간 변경(한국 시간)
 - $ sudo ln -s /usr/share/zoneinfo/Asia/Seoul /etc/localtime
 - HostName 변경( IP만으로 어떤서비스의 서버인지 확인 어려움) 
 - sudo vim /etc/sysconfig/network
 ~~~
 NETWORKING=yes
 HOSTNAME=myServiceName
 NOZEROCONF=yes
 ~~~
 - sudo reboot
 - curl 등록한 호스트 명
 - Failed to connected to ~ connection refused 정상(아직 80포트로 실행된 서비스가 없음을 나타)

# AWS RDS
 - 생성 및 연동
 
