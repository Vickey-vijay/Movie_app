package com.bytedance.adsdk.vt.lh;

import com.bytedance.adsdk.vt.ko;

/* JADX INFO: loaded from: classes8.dex */
public final class fkw {
    private static final fkw ouw = new fkw();
    private final ko<String, com.bytedance.adsdk.vt.ra> vt = new ko<>();

    public static fkw ouw() {
        return ouw;
    }

    public final com.bytedance.adsdk.vt.ra ouw(String str) {
        if (str == null) {
            return null;
        }
        return this.vt.ouw(str);
    }

    public final void ouw(String str, com.bytedance.adsdk.vt.ra raVar) {
        if (str == null) {
            return;
        }
        this.vt.ouw(str, raVar);
    }
}
