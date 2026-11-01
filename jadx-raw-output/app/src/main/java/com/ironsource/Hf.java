package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* JADX INFO: loaded from: classes7.dex */
public final class Hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f26768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f26770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f26771d;

    public Hf(String str, boolean z10, Boolean bool, String str2) {
        this.f26768a = str2;
        this.f26769b = str;
        this.f26770c = z10;
        this.f26771d = bool;
    }

    public final String a() {
        return this.f26768a;
    }

    public final boolean a(NetworkSettings networkSettings, IronSource.a aVar) {
        ck.p.j(networkSettings, "networkSettings");
        ck.p.j(aVar, "adUnit");
        String str = this.f26769b;
        if (str == null || str.length() == 0) {
            return true;
        }
        Kf kf2 = Kf.f26939a;
        return ck.p.e(kf2.a(networkSettings), this.f26769b) && kf2.a(networkSettings, aVar) == this.f26770c;
    }

    public final boolean b() {
        return ck.p.e(this.f26771d, Boolean.TRUE);
    }

    public /* synthetic */ Hf(String str, boolean z10, Boolean bool, String str2, int i10, ck.i iVar) {
        this(str, z10, (i10 & 4) != 0 ? Boolean.FALSE : bool, (i10 & 8) != 0 ? null : str2);
    }
}
