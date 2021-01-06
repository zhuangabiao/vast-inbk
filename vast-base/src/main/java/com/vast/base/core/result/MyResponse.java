package com.vast.base.core.result;

/**
 * ====================================================
 *
 * @ProjectName: vast-inbk
 * @Package: com.vast.base.core.result
 * @ClassName: MyResponse
 * @Author: Administrator
 * @Description: 返回前端layui的数据结构
 *
 *      当code为0的时候，count必须有值
 *
 * @Date: 2021/1/5 11:41
 * ====================================================
 * @Version: 1.0
 * ====================================================
 */
public class MyResponse {

    private int code;
    private String msg;
    private Integer count;
    private Object data;

    public MyResponse(int code) {
        this(code,null);
    }
    public MyResponse(int code,Object data) {
        this(code,data,null);
    }
    public MyResponse(int code,Object data,Integer count) {
        this(code,data,count,null);
    }
    public MyResponse(int code,Object data,int count,String msg) {
        this.code = code;
        this.data = data;
        this.count = count;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
