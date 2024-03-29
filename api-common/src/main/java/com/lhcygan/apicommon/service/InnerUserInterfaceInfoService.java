package com.lhcygan.apicommon.service;

public interface InnerUserInterfaceInfoService {

    /**
     * 是否还有调用次数
     *
     * @param userId          用户id
     * @param interfaceInfoId 接口id
     * @return boolean
     */
    boolean hasInvokeNum(long userId, long interfaceInfoId);

    /**
     * 根据userId、interfaceInfoId计数
     * @param userId          用户id
     * @param interfaceInfoId 接口id
     * @return boolean
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
