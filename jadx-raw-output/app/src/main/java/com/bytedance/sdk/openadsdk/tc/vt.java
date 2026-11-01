package com.bytedance.sdk.openadsdk.tc;

/* JADX INFO: loaded from: classes8.dex */
public final class vt {
    public static String ouw() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0, ad_id TEXT , url_type INTEGER default 0, error_code TEXT ,error_msg TEXT )").toString();
    }
}
