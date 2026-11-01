package com.safedk.android.analytics.brandsafety.creatives;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class CreativeInfoAndCountPair implements Serializable {
    private static final long serialVersionUID = -7509291458978814775L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CreativeInfo f43835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43836b;

    public CreativeInfoAndCountPair() {
    }

    public CreativeInfoAndCountPair(CreativeInfo ci2) {
        this.f43835a = ci2;
        this.f43836b = 1;
    }

    public CreativeInfo a() {
        return this.f43835a;
    }

    public int b() {
        return this.f43836b;
    }

    public void c() {
        this.f43836b++;
    }

    public void d() {
        this.f43836b--;
    }

    public String toString() {
        return super.toString();
    }
}
