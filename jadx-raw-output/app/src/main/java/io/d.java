package io;

/* JADX INFO: compiled from: PositionInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public org.fourthline.cling.model.types.b f61011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f61012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f61013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f61014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f61015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f61016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f61017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f61018h;

    public d() {
        this.f61011a = new org.fourthline.cling.model.types.b(0L);
        this.f61012b = "00:00:00";
        this.f61013c = "NOT_IMPLEMENTED";
        this.f61014d = "";
        this.f61015e = "00:00:00";
        this.f61016f = "00:00:00";
        this.f61017g = Integer.MAX_VALUE;
        this.f61018h = Integer.MAX_VALUE;
    }

    public String b() {
        return this.f61015e;
    }

    public org.fourthline.cling.model.types.b c() {
        return this.f61011a;
    }

    public String d() {
        return this.f61012b;
    }

    public String g() {
        return this.f61013c;
    }

    public String h() {
        return this.f61014d;
    }

    public String toString() {
        return "(PositionInfo) Track: " + c() + " RelTime: " + b() + " Duration: " + d() + " Percent: " + a();
    }

    public int a() {
        long jF = f();
        long jE = e();
        if (jF != 0 && jE != 0) {
            return new Double(jF / (jE / 100.0d)).intValue();
        }
        return 0;
    }

    public long e() {
        if (d() == null) {
            return 0L;
        }
        return mn.f.c(d());
    }

    public long f() {
        if (b() != null && !b().equals("NOT_IMPLEMENTED")) {
            return mn.f.c(b());
        }
        return 0L;
    }

    public d(long j10, String str, String str2, String str3, String str4) {
        this.f61011a = new org.fourthline.cling.model.types.b(0L);
        this.f61012b = "00:00:00";
        this.f61013c = "NOT_IMPLEMENTED";
        this.f61014d = "";
        this.f61015e = "00:00:00";
        this.f61016f = "00:00:00";
        this.f61017g = Integer.MAX_VALUE;
        this.f61018h = Integer.MAX_VALUE;
        this.f61011a = new org.fourthline.cling.model.types.b(j10);
        this.f61012b = str;
        this.f61014d = str2;
        this.f61015e = str3;
        this.f61016f = str4;
    }

    public d(long j10, String str, String str2) {
        this.f61011a = new org.fourthline.cling.model.types.b(0L);
        this.f61012b = "00:00:00";
        this.f61013c = "NOT_IMPLEMENTED";
        this.f61014d = "";
        this.f61015e = "00:00:00";
        this.f61016f = "00:00:00";
        this.f61017g = Integer.MAX_VALUE;
        this.f61018h = Integer.MAX_VALUE;
        this.f61011a = new org.fourthline.cling.model.types.b(j10);
        this.f61013c = str;
        this.f61014d = str2;
    }
}
