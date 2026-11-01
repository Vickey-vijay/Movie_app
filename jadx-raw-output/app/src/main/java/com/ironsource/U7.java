package com.ironsource;

import com.ironsource.sdk.utils.SDKUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class U7 {
    public final String b() {
        return Gc.f26641e;
    }

    public final String a() {
        String str = Gc.f26642f;
        ck.p.i(str, "OMID_LIB_VERSION");
        return str;
    }

    public final String c() {
        String sDKVersion = SDKUtils.getSDKVersion();
        ck.p.i(sDKVersion, "getSDKVersion()");
        return sDKVersion;
    }
}
