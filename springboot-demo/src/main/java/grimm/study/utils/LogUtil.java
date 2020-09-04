package grimm.study.utils;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

/**
 * @author HandsomeGrimm
 * @Date: 2019/5/31 15:06
 * @Description:
 */
@Slf4j
@Aspect
@Component
public class LogUtil {
    private long startTime;

    private long endTime;

    @Pointcut("execution(public * grimm.study.controller.*.*(..))")
    public void webLog() {

    }

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) {
        startTime = System.currentTimeMillis();
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容
        // log.info("=======URL : " + request.getRequestURL().toString());
        log.info("==进程号" + Thread.currentThread().getId() + "=======HTTP_METHOD : " + request.getMethod());
        log.info("==进程号" + Thread.currentThread().getId() + "=======IP : " + request.getRemoteAddr());
        log.info("==进程号" + Thread.currentThread().getId() + "=======CLASS_METHOD : " + joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.info("==进程号" + Thread.currentThread().getId() + "=======ARGS : " + Arrays.toString(joinPoint.getArgs()));

    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) {
        endTime = System.currentTimeMillis();
        log.info("==进程号" + Thread.currentThread().getId() + "=======共用时 : " + (endTime - startTime) + "ms");
        // 处理完请求，返回内容
        log.info("==进程号" + Thread.currentThread().getId() + "=======RESPONSE : " + ret);
    }


}
