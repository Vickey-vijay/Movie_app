package com.applovin.impl;

import com.applovin.mediation.MaxError;

/* JADX INFO: loaded from: classes7.dex */
public class c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d5 f7124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final MaxError f7128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f7129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f7130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f7131h;

    public interface a {
        void a(c5 c5Var);
    }

    private c5(d5 d5Var, com.applovin.impl.mediation.h hVar, String str, MaxError maxError, long j10, long j11) {
        this(d5Var, str, maxError, j10, j11, hVar != null ? hVar.i() : null, hVar != null ? hVar.b() : null, false);
    }

    public static c5 a(d5 d5Var, com.applovin.impl.mediation.h hVar, String str, long j10, long j11) {
        if (d5Var == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (hVar != null) {
            return new c5(d5Var, hVar, str, null, j10, j11);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public long b() {
        return this.f7130g;
    }

    public MaxError c() {
        return this.f7128e;
    }

    public String d() {
        return this.f7125b;
    }

    public String e() {
        return this.f7127d;
    }

    public d5 f() {
        return this.f7124a;
    }

    public boolean g() {
        return this.f7131h;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SignalCollectionResult{mSignalProviderSpec=");
        sb2.append(this.f7124a);
        sb2.append(", mSdkVersion='");
        sb2.append(this.f7125b);
        sb2.append('\'');
        sb2.append(", mAdapterVersion='");
        sb2.append(this.f7126c);
        sb2.append('\'');
        sb2.append(", mSignalDataLength='");
        String str = this.f7127d;
        sb2.append(str != null ? str.length() : 0);
        sb2.append('\'');
        sb2.append(", mErrorMessage=");
        MaxError maxError = this.f7128e;
        sb2.append(maxError != null ? maxError.getMessage() : "");
        sb2.append('}');
        return sb2.toString();
    }

    private c5(d5 d5Var, String str, MaxError maxError, long j10, long j11, String str2, String str3, boolean z10) {
        this.f7124a = d5Var;
        this.f7127d = str;
        this.f7128e = maxError;
        this.f7129f = j10;
        this.f7130g = j11;
        this.f7125b = str2;
        this.f7126c = str3;
        this.f7131h = z10;
    }

    public static c5 a(d5 d5Var, MaxError maxError) {
        return a(d5Var, (com.applovin.impl.mediation.h) null, maxError, -1L, -1L);
    }

    public static c5 a(d5 d5Var, com.applovin.impl.mediation.h hVar, MaxError maxError, long j10, long j11) {
        if (d5Var != null) {
            return new c5(d5Var, hVar, null, maxError, j10, j11);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public static c5 a(c5 c5Var) {
        return new c5(c5Var.f(), c5Var.e(), c5Var.c(), c5Var.f7129f, c5Var.f7130g, c5Var.d(), c5Var.a(), true);
    }

    public String a() {
        return this.f7126c;
    }
}
