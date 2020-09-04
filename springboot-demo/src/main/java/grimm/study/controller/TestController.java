package grimm.study.controller;

import grimm.study.exception.CommonException;
import grimm.study.vo.ServerResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")

public class TestController {


    @RequestMapping("/exceptionTest")
    public ServerResponse exceptionHandTest() throws CommonException {

        try {
            System.out.println(1/0);
        }catch (Exception e){
            throw  new CommonException(e.getMessage());
        }

        return ServerResponse.success();
    }

}
