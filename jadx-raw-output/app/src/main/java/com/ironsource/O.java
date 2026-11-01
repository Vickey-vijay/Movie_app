package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f27211f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f27212g = "0";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f27213h = "0";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f27214i = "0";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f27215j = "0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O9 f27216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private W7 f27217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f27218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC3603n0 f27219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f27220e;

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }
    }

    public final O9 a() {
        return this.f27216a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return ck.p.e(c(), o10.c()) && ck.p.e(g(), o10.g()) && b() == o10.b() && ck.p.e(i(), o10.i()) && this.f27217b == o10.f27217b && ck.p.e(this.f27218c, o10.f27218c) && this.f27219d == o10.f27219d;
    }

    public O(O9 o10) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        this.f27216a = o10;
        this.f27217b = W7.UnknownProvider;
        this.f27218c = "0";
        this.f27219d = EnumC3603n0.LOAD_REQUEST;
        this.f27220e = new Date().getTime() / 1000.0d;
    }

    public final O a(O9 o10) {
        ck.p.j(o10, C3426d4.i.f28559p0);
        return new O(o10);
    }

    public final IronSource.a b() {
        if (this.f27216a.i()) {
            return IronSource.a.BANNER;
        }
        return this.f27216a.n() ? IronSource.a.REWARDED_VIDEO : IronSource.a.INTERSTITIAL;
    }

    public final String c() {
        String strE = this.f27216a.e();
        ck.p.i(strE, "adInstance.id");
        return strE;
    }

    public final O9 d() {
        return this.f27216a;
    }

    public final W7 e() {
        return this.f27217b;
    }

    public final EnumC3603n0 f() {
        return this.f27219d;
    }

    public final String g() {
        String strC = this.f27216a.c();
        return strC == null ? "0" : strC;
    }

    public final String h() {
        return this.f27218c;
    }

    public final String i() {
        String strG = this.f27216a.g();
        ck.p.i(strG, "adInstance.name");
        return strG;
    }

    public final double j() {
        return this.f27220e;
    }

    public static /* synthetic */ O a(O o10, O9 o11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            o11 = o10.f27216a;
        }
        return o10.a(o11);
    }

    public int hashCode() {
        return Objects.hash(c(), g(), b(), i(), this.f27217b, this.f27218c, this.f27219d, Double.valueOf(this.f27220e));
    }

    public final void a(W7 w10) {
        ck.p.j(w10, "<set-?>");
        this.f27217b = w10;
    }

    public final void a(String str) {
        ck.p.j(str, "<set-?>");
        this.f27218c = str;
    }

    public String toString() {
        String string = IronSourceVideoBridge.jsonObjectInit().put(com.ironsource.sdk.controller.f.b.f30919c, c()).put("advertiserBundleId", this.f27218c).put("adProvider", this.f27217b.ordinal()).put("adStatus", this.f27219d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.f27220e).put("adUnitId", g()).put("adFormat", b().toString()).put("instanceId", i()).toString();
        ck.p.i(string, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return string;
    }

    public final void a(EnumC3603n0 enumC3603n0) {
        ck.p.j(enumC3603n0, "<set-?>");
        this.f27219d = enumC3603n0;
    }

    public final void a(double d10) {
        this.f27220e = d10;
    }
}
