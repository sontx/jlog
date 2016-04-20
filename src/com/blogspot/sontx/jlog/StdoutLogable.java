package com.blogspot.sontx.jlog;

/**
 * Copyright 2016 by sontx
 * Created by sontx on 20/4/2016.
 */
public class StdoutLogable implements ILogable {

    private void out(String tag, Object obj) {
        System.out.println(String.format("[%s] %s", tag, obj != null ? obj : "NULL"));
    }

    @Override
    public void d(Object obj) {
        out("DBG", obj);
    }

    @Override
    public void e(Object obj) {
        out("ERR", obj);
    }

    @Override
    public void i(Object obj) {
        out("INF", obj);
    }

    @Override
    public void w(Object obj) {
        out("WRN", obj);
    }
}
