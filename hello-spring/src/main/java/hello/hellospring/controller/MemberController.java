package hello.hellospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import hello.hellospring.service.MemberService;


//어노테이션을 보고 객체를 생성하여 스프링 컨테이너에 담아둠
@Controller
public class MemberController {
    private final MemberService memberService;

    //컨트롤러와 멤버 서비스를 연결
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}

