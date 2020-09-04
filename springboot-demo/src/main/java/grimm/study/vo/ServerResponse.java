package grimm.study.vo;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class ServerResponse<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;

    private ServerResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private ServerResponse(Integer code, String msg,T data) {
        this.code = code;
        this.msg = msg;
        this.data=data;
    }

    public static ServerResponse success(){
        return new ServerResponse(0,"SUCCESS");
    }

    public static ServerResponse error(){
        return new ServerResponse(99999, "Server Error");
    }

    public static ServerResponse error(String msg){
        return new ServerResponse(99999, msg);
    }
}
