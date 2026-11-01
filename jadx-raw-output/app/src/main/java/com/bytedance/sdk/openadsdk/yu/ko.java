package com.bytedance.sdk.openadsdk.yu;

/* JADX INFO: loaded from: classes5.dex */
public final class ko {
    public static String ouw() {
        return "CREATE TABLE IF NOT EXISTS logstatsbatch (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
