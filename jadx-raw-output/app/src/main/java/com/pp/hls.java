package com.pp;

import com.jiagu.sdk.pp_hlsProtected;

/* JADX INFO: loaded from: classes7.dex */
public class hls {
    static {
        System.loadLibrary(pp_hlsProtected.a(0));
    }

    public native int exec(String str, String str2, String str3);

    public native int load(String str, String str2, String str3, String str4, String str5, String str6, String str7);
}
