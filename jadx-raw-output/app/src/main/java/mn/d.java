package mn;

import java.util.Date;

/* JADX INFO: compiled from: ExpirationDetails.java */
/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f64625c = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f64627b;

    public d() {
        this.f64626a = 0;
        this.f64627b = a();
    }

    public boolean d() {
        return e(false);
    }

    public long a() {
        return new Date().getTime() / 1000;
    }

    public int b() {
        return this.f64626a;
    }

    public long c() {
        int i10 = this.f64626a;
        if (i10 == 0) {
            return 2147483647L;
        }
        return (this.f64627b + ((long) i10)) - a();
    }

    public boolean e(boolean z10) {
        int i10 = this.f64626a;
        if (i10 != 0) {
            if (this.f64627b + ((long) (i10 / (z10 ? 2 : 1))) < a()) {
                return true;
            }
        }
        return false;
    }

    public void f(long j10) {
        this.f64627b = j10;
    }

    public String toString() {
        return "(" + f64625c + ") MAX AGE: " + this.f64626a;
    }

    public void g() {
        f(a());
    }

    public d(int i10) {
        this.f64626a = 0;
        this.f64627b = a();
        this.f64626a = i10;
    }
}
