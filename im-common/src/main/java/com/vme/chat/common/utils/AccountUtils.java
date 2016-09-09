package com.vme.chat.common.utils;

/**
 * Created by Wayne on 16/1/21.
 */
public class AccountUtils {

    /**
     * 判断账号是否为手机号,根据是否带国家号做判断
     * @param account
     * @return
     */
    public static boolean isPhone(String account) {
        boolean result = false;

        if (0 == account.indexOf("+")) {
            result = true;
        }

        return result;
    }

    /**
     * 判断账号是否为邮箱
     * @param account
     * @return
     */
    public static boolean isEmail(String account) {
        return  RegexUtils.isMatch("[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?", account);
    }

}
