package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f7588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f7589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f7590d;

    public boolean a(Object obj) {
        return obj instanceof h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.a(this) && d() == hVar.d() && c() == hVar.c() && b() == hVar.b() && a() == hVar.a();
    }

    public int a() {
        return this.f7590d;
    }

    public int b() {
        return this.f7589c;
    }

    public int c() {
        return this.f7588b;
    }

    public int d() {
        return this.f7587a;
    }

    public Map e() {
        HashMap map = new HashMap(4);
        map.put("asr_num", Integer.valueOf(this.f7587a));
        map.put("air_num", Integer.valueOf(this.f7588b));
        map.put("fsr_num", Integer.valueOf(this.f7589c));
        map.put("fir_num", Integer.valueOf(this.f7590d));
        return map;
    }

    public String toString() {
        return "AdRequestNumberInfo(adUnitSessionAdRequestNumber=" + d() + ", adUnitInstallAdRequestNumber=" + c() + ", adFormatSessionAdRequestNumber=" + b() + ", adFormatInstallAdRequestNumber=" + a() + ")";
    }

    public h(int i10, int i11, int i12, int i13) {
        this.f7587a = i10;
        this.f7588b = i11;
        this.f7589c = i12;
        this.f7590d = i13;
    }

    public int hashCode() {
        return ((((((d() + 59) * 59) + c()) * 59) + b()) * 59) + a();
    }
}
