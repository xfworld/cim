package com.crossoverjie.cim.route.service;

import com.crossoverjie.cim.common.pojo.CIMUserInfo;

import java.util.Set;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 2018/12/24 11:06
 * @since JDK 1.8
 */
public interface UserInfoCacheService {

    /**
     * 通过 userID 获取用户信息
     * @param userId 用户唯一 ID
     * @return
     * @throws Exception
     */
    CIMUserInfo loadUserInfoByUserId(Long userId) ;

    /**
     * 保存和检查用户登录情况
     * @param userId userId 用户唯一 ID
     * @return true 为可以登录 false 为已经登录
     * @throws Exception
     */
    boolean saveAndCheckUserLoginStatus(Long userId) throws Exception ;

    /**
     * 检查用户登录情况
     * @param userId userId 用户唯一 ID
     * @return true 为已登录 false 为未登录
     * @throws Exception
     */
    boolean CheckUserLoginStatus(Long userId) ;

    /**
     * query all online user
     * @return online user
     */
    Set<CIMUserInfo> onlineUser() ;
}
