package com.example.minatest.client;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;

/**
 * @author gexiaoshan
 * @description: TODO
 * @date 2019/4/29 14:53
 */
public class TCPClientHandler extends IoHandlerAdapter {
    private final String values;

    public TCPClientHandler(String values) {
        this.values = values;
    }

    @Override
    public void sessionOpened(IoSession session) {
        session.write(values);
    }
}

