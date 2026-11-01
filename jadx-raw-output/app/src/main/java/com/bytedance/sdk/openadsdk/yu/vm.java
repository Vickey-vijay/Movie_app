package com.bytedance.sdk.openadsdk.yu;

/* JADX INFO: loaded from: classes6.dex */
public final class vm extends yu {
    public static String vt() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS adevent_applog (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0, channel INTEGER default 0)").toString();
    }
}
