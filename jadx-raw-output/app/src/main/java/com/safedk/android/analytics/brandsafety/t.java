package com.safedk.android.analytics.brandsafety;

/* JADX INFO: loaded from: classes7.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f44565c;

    public String a() {
        return this.f44564b;
    }

    public void a(String str) {
        this.f44564b = str;
    }

    public long b() {
        return this.f44565c;
    }

    public void a(long j10) {
        this.f44565c = j10;
    }

    private t() {
        this.f44565c = 0L;
    }

    public t(String str, String str2, long j10) {
        this.f44565c = 0L;
        this.f44563a = str;
        this.f44564b = str2;
        this.f44565c = j10;
    }

    public String c() {
        return a(this.f44563a, this.f44565c);
    }

    public static String a(String str, long j10) {
        return str + "_" + j10;
    }
}
