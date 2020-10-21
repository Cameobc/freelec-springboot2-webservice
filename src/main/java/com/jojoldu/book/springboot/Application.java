package com.jojoldu.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//선 테스트코드 작성, 절대로 수종으로 검증하고 테스트 코드를 작성하지 않는다!!!
//@SpringBootApplication 이 있는 위치부터 설정을 읽어나가기 떄문에 이 클래스는 항상 프로젝트의 최상단에 위치해야 함.
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        //내장WAS를 실행한다.
        SpringApplication.run(Application.class, args);
    }
}
