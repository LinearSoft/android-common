package com.linearsoft.android.common.xposed;

import de.robv.android.xposed.XposedBridge;

public class Log {
    private static String appTag = "LinearSoftXposedApp";

    public static void setAppTag(String appTag) {
        Log.appTag = appTag;
    }

    public static String getAppTag() {
        return appTag;
    }

    protected static void log(String msg) {
        XposedBridge.log(appTag.concat(": ").concat(msg));
    }
    protected static void log(String tag, String msg) {
        XposedBridge.log(tag.concat(": ").concat(msg));
    }

    public static void d(String msg) { log(msg); };
    public static void d(String tag, String msg) { log(tag, msg); };
    public static void e(String msg) { log(msg); };
    public static void e(String tag, String msg) { log(tag, msg); };
    public static void i(String msg) { log(msg); };
    public static void i(String tag, String msg) { log(tag, msg); };
    public static void v(String msg) { log(msg); };
    public static void v(String tag, String msg) { log(tag, msg); };
    public static void w(String msg) { log(msg); };
    public static void w(String tag, String msg) { log(tag, msg); };
    public static void wtf(String msg) { log(msg); };
    public static void wtf(String tag, String msg) { log(tag, msg); };
}