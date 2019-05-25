package com.mmlm.shici.module.util.beans;

/**
 * Created by Administrator on 2019/1/27.
 */

public class EventBusParam<T> {
    public static final int EVENT_BUS_CHATROOM_CREATE = 1;  //创建房间

    private int eventBusCode;
    private T data;

    public int getEventBusCode() {
        return eventBusCode;
    }

    public void setEventBusCode(int eventBusCode) {
        this.eventBusCode = eventBusCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
