package com.ckkj.exchangeoflearningplatform.service;

import com.ckkj.exchangeoflearningplatform.model.TempUser;

/**
 * 二维码扫描登陆
 *
 * @author lzh
 * create 2019-06-04-11:18
 */
public interface TempService {

    /**
     * 二维码扫描登陆
     * @param tempUser
     * @return
     */
    int login(TempUser tempUser);

    /**
     * 登陆成功记录
     * @param tempUser
     * @return
     */
    int createTempUser(TempUser tempUser);

    /**
     * 根据随机码查找用户
     * @return
     */
    String findTempNameByRid(String rid);

    /**
     * 查找临时表密码
     * @return
     */
    String findTempPassword(String tempUser,String rid);

    /**
     * 用户退出
     * @param userName
     */
    void deleteUserInTemp(String userName);
}
