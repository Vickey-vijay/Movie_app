package com.mbridge.msdk.tracker;

import java.io.Serializable;

/* JADX INFO: compiled from: EventTable.java */
/* JADX INFO: loaded from: classes8.dex */
public class i implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static String f38121i = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_error_message TEXT,report_count INTEGER)";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f38122j = "DROP TABLE IF EXISTS %s";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f38123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f38124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f38126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f38127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f38128f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f38129g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f38130h;

    public void a(boolean z10) {
        this.f38129g = z10;
    }

    public void b(boolean z10) {
        this.f38128f = z10;
    }

    public void a(int i10) {
        this.f38124b = i10;
    }

    public void b(int i10) {
        this.f38125c = i10;
    }

    public e d() {
        return this.f38123a;
    }

    public long g() {
        return this.f38127e;
    }

    public int h() {
        return this.f38124b;
    }

    public String i() {
        return this.f38130h;
    }

    public int j() {
        return this.f38125c;
    }

    public String k() {
        return this.f38126d;
    }

    public boolean l() {
        return this.f38129g;
    }

    public boolean m() {
        return this.f38128f;
    }

    public i(e eVar) {
        this.f38123a = eVar;
        this.f38126d = eVar.n();
    }

    public void a(long j10) {
        this.f38127e = j10;
    }

    public void a(String str) {
        this.f38130h = str;
    }
}
