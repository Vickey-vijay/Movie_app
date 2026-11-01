package com.unity3d.ads.beta;

import ck.p;
import com.ironsource.Df;

/* JADX INFO: compiled from: MediationInfo.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class MediationInfo {
    private final String adapterVersion;
    private final String name;
    private final String version;

    public MediationInfo(String str, String str2, String str3) {
        p.j(str, "name");
        p.j(str2, "version");
        p.j(str3, Df.f26386b);
        this.name = str;
        this.version = str2;
        this.adapterVersion = str3;
    }

    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVersion() {
        return this.version;
    }
}
