package kr.swu.spring_rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController 애너테이션이 붙은 클래스는 컨트롤러로 정의
@RestController
public class TestController {
    // 어떤 주소로 접속하면 어떤 기능을 실행할지 결정할 수 있는데
    // 메서드 위에 @RequestMapping("패턴")으로 지정할 수 있음
    // 기본적 서버 주소 : localhost:8080
    // 기본 서버 주소를 줄여서 /로 표현
    // 따라서 /hello 패턴은 localhost:8080/hello인 패턴
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("컨트롤러가 hello 요청을 감지했습니다.");
        // 화면에 return 문자를 찍어줌
        return "Hello!!!";
    }

    // localhost:8080/show?param=들어온내용을 하단의 String param에 전달
    @RequestMapping("/show")
    public String getParameter(String param){
        System.out.println("?param=" + param);
        return param;
    }

    // 위 메서드처럼 동작하되 localhost:8080/keyword?kw=들어온내용을
    // 콘솔창에는 keyword:들어온내용
    // 결과창에는 들어온내용을 2번 반복하는 메서드
    @RequestMapping("/keyword")
    public String getKeyword(String kw, int day){
        System.out.println("keyword : " + kw);
        System.out.println(day + 100);
        return kw + day + "일";
    }
}