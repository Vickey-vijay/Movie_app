package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* JADX INFO: loaded from: classes4.dex */
public final class O8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f55674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f55675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f55676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f55677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f55678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C4288j7 f55679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EnumC4112cb f55680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f55681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f55682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f55683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f55684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f55685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f55686n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J8 f55687o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final EnumC4162ea f55688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final EnumC4392n9 f55689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Boolean f55690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Integer f55691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f55692t;

    /* JADX WARN: Multi-variable type inference failed */
    public O8(ContentValues contentValues) {
        C4185f7 model = new C4211g7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f55673a = model.a().j();
        this.f55674b = model.a().p();
        this.f55675c = model.c();
        this.f55676d = model.b();
        this.f55677e = model.a().k();
        this.f55678f = model.d();
        this.f55679g = model.a().i();
        this.f55680h = model.e();
        this.f55681i = model.a().d();
        this.f55682j = model.a().f();
        this.f55683k = model.a().o();
        this.f55684l = model.a().c();
        this.f55685m = model.a().b();
        this.f55686n = model.a().m();
        J8 j8E = model.a().e();
        this.f55687o = j8E == null ? J8.a(null) : j8E;
        EnumC4162ea enumC4162eaH = model.a().h();
        this.f55688p = enumC4162eaH == null ? EnumC4162ea.a(null) : enumC4162eaH;
        this.f55689q = model.a().n();
        this.f55690r = model.a().a();
        this.f55691s = model.a().l();
        this.f55692t = model.a().g();
    }
}
