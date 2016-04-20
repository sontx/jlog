package com.blogspot.sontx.jlog;

import com.sun.istack.internal.NotNull;

/**
 * Copyright 2016 by sontx
 * Created by sontx on 20/4/2016.
 */
public final class Log {
    private static ILogable logable = new StdoutLogable();
    private static Object lock = new Object();

    public static void setLogable(@NotNull ILogable _logable) {
        if (_logable != null)
            logable = _logable;
    }

    public static void d(Object obj) {
        synchronized (lock) {
            logable.d(obj);
        }
    }

    public static void e(Object obj) {
        synchronized (lock) {
            logable.e(obj);
        }
    }

    public static void i(Object obj) {
        synchronized (lock) {
            logable.i(obj);
        }
    }

    public static void w(Object obj) {
        synchronized (lock) {
            logable.w(obj);
        }
    }

    private Log() {}
}
