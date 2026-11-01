package com.bytedance.sdk.component.vt.ouw;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class bly {
    public String ouw;
    private String vt;

    public static bly ouw(String str) {
        return new bly(str);
    }

    public final Charset ouw(Charset charset) {
        try {
            String str = this.vt;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    private bly(String str) {
        this.ouw = str;
    }
}
