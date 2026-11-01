package yads;

import android.text.Layout;

/* JADX INFO: loaded from: classes11.dex */
public final class v93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f83836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f83838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f83840e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f83846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f83847l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Layout.Alignment f83850o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f83851p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v53 f83853r;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f83841f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83842g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f83843h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f83844i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f83845j = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f83848m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f83849n = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f83852q = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f83854s = Float.MAX_VALUE;

    public final v93 a(v93 v93Var) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (v93Var != null) {
            if (!this.f83838c && v93Var.f83838c) {
                this.f83837b = v93Var.f83837b;
                this.f83838c = true;
            }
            if (this.f83843h == -1) {
                this.f83843h = v93Var.f83843h;
            }
            if (this.f83844i == -1) {
                this.f83844i = v93Var.f83844i;
            }
            if (this.f83836a == null && (str = v93Var.f83836a) != null) {
                this.f83836a = str;
            }
            if (this.f83841f == -1) {
                this.f83841f = v93Var.f83841f;
            }
            if (this.f83842g == -1) {
                this.f83842g = v93Var.f83842g;
            }
            if (this.f83849n == -1) {
                this.f83849n = v93Var.f83849n;
            }
            if (this.f83850o == null && (alignment2 = v93Var.f83850o) != null) {
                this.f83850o = alignment2;
            }
            if (this.f83851p == null && (alignment = v93Var.f83851p) != null) {
                this.f83851p = alignment;
            }
            if (this.f83852q == -1) {
                this.f83852q = v93Var.f83852q;
            }
            if (this.f83845j == -1) {
                this.f83845j = v93Var.f83845j;
                this.f83846k = v93Var.f83846k;
            }
            if (this.f83853r == null) {
                this.f83853r = v93Var.f83853r;
            }
            if (this.f83854s == Float.MAX_VALUE) {
                this.f83854s = v93Var.f83854s;
            }
            if (!this.f83840e && v93Var.f83840e) {
                this.f83839d = v93Var.f83839d;
                this.f83840e = true;
            }
            if (this.f83848m == -1 && (i10 = v93Var.f83848m) != -1) {
                this.f83848m = i10;
            }
        }
        return this;
    }
}
