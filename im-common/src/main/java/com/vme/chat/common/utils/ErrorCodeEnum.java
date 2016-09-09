package com.vme.chat.common.utils;


public enum ErrorCodeEnum {
    //通用
	SUCCESS("0","ok"),
    APPLICATION_ERROR("20001", "应用程序错误!"),


    //请求
	PARAMETERFORMATERROR("10001","参数格式错误！"),
	PARAMETERMISSING("10002","参数值缺失！"),
	PARAMETERVALUEINVALID("10003","参数值无效！"),
    INTERFACE_CANCELLED("10004", "接口被取消!"),
    REQUEST_ILLEGAL("40004","请求非法"),

    //用户
    USER_LOGIN_SUCCESS("30001","登录成功"),
    USER_ACCOUNTORPASSWORD_ERROR("30002","用户名密码不对"),
    USER_ERROR("30003","用户异常"),
    USER_LOGIN_MACHINE_IS_EMPTY("30004", "用户设备码为空"),
    USER_MACHINE_ERROR("30005", "用户所在设备错误"),
    USER_VERIFY_PARAM_TYPE_ERROR("30006", "验证码数据格式错误"),
    USER_EXIST("30006", "用户已存在"),
    USER_NOT_EXIST("30007", "用户不存在"),
    USER_VERIFY_ERROR("30008", "验证码错误"),
    USER_MANAGER_EXIST("30009", "此管理员已存在"),
    USER_THIRD_LOGIN_FAILED("30010", "第三方登录失败"),
    USER_SEND_VERIFY_ERROR("30011", "验证码发送失败"),

   //删除
    DELETE_NO_AUTHORITY("50001","无权限删除"),

    //七牛
    STORAGE_QINIU_GETTOKEN_FAILED("60001", "获取token失败");

    private String resultCode;
    private String resultMsg;

    private ErrorCodeEnum() {
    }

    private ErrorCodeEnum(String resultCode, String resultMsg) {
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }


    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public static String getValues(String resultCode){
        for(ErrorCodeEnum chronicEnum:ErrorCodeEnum.values()){
            if(chronicEnum.resultCode==resultCode){
                return chronicEnum.resultMsg;
            }
        }
        return null;
    }

    public static ErrorCodeEnum getEnumByCode(String resultCode){
        for(ErrorCodeEnum chronicEnum:ErrorCodeEnum.values()){
            if(chronicEnum.getResultCode().equals(resultCode)){
                return chronicEnum;
            }
        }
        return null;
    }

    public static ErrorCodeEnum getEnumByMsg(String resultMsg){
        for(ErrorCodeEnum chronicEnum:ErrorCodeEnum.values()){
            if(chronicEnum.getResultMsg().equals(resultMsg)){
                return chronicEnum;
            }
        }
        return null;
    }
    
}
