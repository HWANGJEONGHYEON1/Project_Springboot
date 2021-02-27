
## 스프링 Securiy 관
### @EnableWebSecurity
 - Spring Security 설정 활성

### csrf().diable().frameOptions().disable() 
 - h2-console화면을 사용하기 위한 옵션들을 disable

### authorizeRequests
 - URL 별 권한 관리를 설정하는 옵션의 싲가점
 - authorizeRequests가 선언되어야만 antMathcer 사용가능

### antMathcer
 - 권한 관리 대상을 지정하는 옵션
 - URL, HTTP 메소드별로 관리가가능
 - "/" 등 지정된 URL들은 permitAll() 옵션을 통해 전체 열람 권한을 가능
 - "/api/v1/**" 주소를 가진 API는 USER 권한을 가진 사람만 가능 가능하도록함

### anyRequest
 - 설정된 값들ㅇ 이외 나머지 URL 보냄

### logout().logoutSuccessUrl("/")
 - 로그아웃 기능에 대한 시작점
 - 로그아우 성공 시 / 주소로
 
### oauth2Login
 - OAuth2 로그인 기능에 대한 시작점
 
### userInfoEndpoint
 - 로그인 성공 이후 사용자 정보를 가져옴
 
### userService
 - 로그인 성공시 후속 조치를 하기 우히ㅏㄴ UserService 인터패이스 구현
 - 소셜 서비스에서 사용자 정보를 가져온 상태에서 추가로 진행, 기능을 명시
 
### registrationId (userRequest.getClientRegistration.registrationId)
 - 현재 진행중인 서비스 구분하는 코드( 네이버 , 구글 등)
 
### SessionUser
 - 세션에 사용자 정보를 저장하기 위한 DTO 클래  
 ㅅ
### LoginUser Session user
 -  httpSession.getAttribute("user") -> @LoginUser Session user (Parameter)  
 