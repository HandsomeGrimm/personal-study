package grimm.study.exception;

import grimm.study.vo.ServerResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
@ResponseBody
public class GlobalExceptionHandler {

    @ExceptionHandler(CommonException.class)
    public ServerResponse commonExceptionHand(CommonException e){
      log.error("somewhere occur exception{}",e.getMessage());
      return ServerResponse.error("全局捕获");
    }

}
