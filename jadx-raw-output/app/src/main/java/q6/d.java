package q6;

import com.safedk.android.analytics.brandsafety.ImpressionLog;

/* JADX INFO: compiled from: Codeword.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f66541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f66542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66543e = -1;

    public boolean h(int i10) {
        return i10 != -1 && this.f66541c == (i10 % 3) * 3;
    }

    public int a() {
        return this.f66541c;
    }

    public int b() {
        return this.f66540b;
    }

    public int c() {
        return this.f66543e;
    }

    public int d() {
        return this.f66539a;
    }

    public int e() {
        return this.f66542d;
    }

    public int f() {
        return this.f66540b - this.f66539a;
    }

    public boolean g() {
        return h(this.f66543e);
    }

    public void i(int i10) {
        this.f66543e = i10;
    }

    public void j() {
        this.f66543e = ((this.f66542d / 30) * 3) + (this.f66541c / 3);
    }

    public String toString() {
        return this.f66543e + ImpressionLog.Q + this.f66542d;
    }

    public d(int i10, int i11, int i12, int i13) {
        this.f66539a = i10;
        this.f66540b = i11;
        this.f66541c = i12;
        this.f66542d = i13;
    }
}
