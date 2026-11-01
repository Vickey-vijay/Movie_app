package z4;

import android.text.Layout;

/* JADX INFO: compiled from: TtmlStyle.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f86293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f86295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f86297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86298f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f86299g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f86300h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f86301i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f86302j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f86303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f86304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f86305m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Layout.Alignment f86306n;

    public e a(e eVar) {
        return l(eVar, true);
    }

    public int b() {
        if (this.f86297e) {
            return this.f86296d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f86295c) {
            return this.f86294b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f86293a;
    }

    public float e() {
        return this.f86303k;
    }

    public int f() {
        return this.f86302j;
    }

    public String g() {
        return this.f86304l;
    }

    public int h() {
        int i10 = this.f86300h;
        if (i10 == -1 && this.f86301i == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f86301i == 1 ? 2 : 0);
    }

    public Layout.Alignment i() {
        return this.f86306n;
    }

    public boolean j() {
        return this.f86297e;
    }

    public boolean k() {
        return this.f86295c;
    }

    public final e l(e eVar, boolean z10) {
        if (eVar != null) {
            if (!this.f86295c && eVar.f86295c) {
                q(eVar.f86294b);
            }
            if (this.f86300h == -1) {
                this.f86300h = eVar.f86300h;
            }
            if (this.f86301i == -1) {
                this.f86301i = eVar.f86301i;
            }
            if (this.f86293a == null) {
                this.f86293a = eVar.f86293a;
            }
            if (this.f86298f == -1) {
                this.f86298f = eVar.f86298f;
            }
            if (this.f86299g == -1) {
                this.f86299g = eVar.f86299g;
            }
            if (this.f86306n == null) {
                this.f86306n = eVar.f86306n;
            }
            if (this.f86302j == -1) {
                this.f86302j = eVar.f86302j;
                this.f86303k = eVar.f86303k;
            }
            if (z10 && !this.f86297e && eVar.f86297e) {
                o(eVar.f86296d);
            }
        }
        return this;
    }

    public boolean m() {
        return this.f86298f == 1;
    }

    public boolean n() {
        return this.f86299g == 1;
    }

    public e o(int i10) {
        this.f86296d = i10;
        this.f86297e = true;
        return this;
    }

    public e p(boolean z10) {
        g5.a.f(this.f86305m == null);
        this.f86300h = z10 ? 1 : 0;
        return this;
    }

    public e q(int i10) {
        g5.a.f(this.f86305m == null);
        this.f86294b = i10;
        this.f86295c = true;
        return this;
    }

    public e r(String str) {
        g5.a.f(this.f86305m == null);
        this.f86293a = str;
        return this;
    }

    public e s(float f10) {
        this.f86303k = f10;
        return this;
    }

    public e t(int i10) {
        this.f86302j = i10;
        return this;
    }

    public e u(String str) {
        this.f86304l = str;
        return this;
    }

    public e v(boolean z10) {
        g5.a.f(this.f86305m == null);
        this.f86301i = z10 ? 1 : 0;
        return this;
    }

    public e w(boolean z10) {
        g5.a.f(this.f86305m == null);
        this.f86298f = z10 ? 1 : 0;
        return this;
    }

    public e x(Layout.Alignment alignment) {
        this.f86306n = alignment;
        return this;
    }

    public e y(boolean z10) {
        g5.a.f(this.f86305m == null);
        this.f86299g = z10 ? 1 : 0;
        return this;
    }
}
