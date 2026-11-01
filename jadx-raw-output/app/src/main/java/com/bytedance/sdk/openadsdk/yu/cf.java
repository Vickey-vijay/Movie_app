package com.bytedance.sdk.openadsdk.yu;

/* JADX INFO: loaded from: classes3.dex */
public final class cf extends yu {
    public static String vt() {
        return "CREATE TABLE IF NOT EXISTS loghighpriority (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }
}
