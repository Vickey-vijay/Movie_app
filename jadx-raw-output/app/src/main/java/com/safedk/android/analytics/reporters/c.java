package com.safedk.android.analytics.reporters;

/* JADX INFO: loaded from: classes11.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44690a = "application";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StackTraceElement f44691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f44693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f44694e;

    public c(StackTraceElement stackTraceElement, String str) {
        this.f44691b = stackTraceElement;
        this.f44692c = str;
    }

    public c(StackTraceElement stackTraceElement) {
        this.f44691b = stackTraceElement;
        this.f44692c = "application";
    }

    public StackTraceElement a() {
        return this.f44691b;
    }

    public String b() {
        return this.f44692c;
    }

    public int c() {
        return this.f44694e;
    }

    public void a(int i10) {
        this.f44694e = i10;
    }
}
