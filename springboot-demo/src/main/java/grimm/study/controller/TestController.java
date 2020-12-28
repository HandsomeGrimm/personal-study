package grimm.study.controller;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import grimm.study.exception.CommonException;
import grimm.study.vo.ServerResponse;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
@Slf4j
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

    @RequestMapping("/logTest")
    public ServerResponse logTest(){

        log.trace("----trace----");
        log.debug("----debug----");
        log.info("----info----");
        log.error("----error----");

        return ServerResponse.success();
    }

    @RequestMapping(value = "{logLevel}",method = {RequestMethod.POST})
    public ServerResponse setLogLevel(@PathVariable String logLevel){
        LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
        Logger logger = loggerContext.getLogger("root");
        if (logLevel.equals(Level.INFO.toString())){
            ((ch.qos.logback.classic.Logger) logger).setLevel(Level.INFO);
        }else if (logLevel.equals(Level.DEBUG.toString())){
            ((ch.qos.logback.classic.Logger)logger).setLevel(Level.DEBUG);
        }else if (logLevel.equals(Level.ERROR.toString())){
            ((ch.qos.logback.classic.Logger)logger).setLevel(Level.ERROR);
        }

        return ServerResponse.success();
    }

}
