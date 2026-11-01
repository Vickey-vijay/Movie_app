package yads;

import android.os.Bundle;
import java.util.Map;
import yads.q73;
import yads.xq;

/* JADX INFO: loaded from: classes11.dex */
public class q73 implements xq {
    public static final q73 B = new q73(new p73());
    public final u51 A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f81743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f81744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f81745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f81746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f81747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f81748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f81749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f81750j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f81751k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f81752l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p51 f81753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f81754n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p51 f81755o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f81756p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f81757q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f81758r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p51 f81759s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p51 f81760t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f81761u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f81762v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f81763w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f81764x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f81765y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final s51 f81766z;

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q73 q73Var = (q73) obj;
        if (this.f81742b == q73Var.f81742b && this.f81743c == q73Var.f81743c && this.f81744d == q73Var.f81744d && this.f81745e == q73Var.f81745e && this.f81746f == q73Var.f81746f && this.f81747g == q73Var.f81747g && this.f81748h == q73Var.f81748h && this.f81749i == q73Var.f81749i && this.f81752l == q73Var.f81752l && this.f81750j == q73Var.f81750j && this.f81751k == q73Var.f81751k && this.f81753m.equals(q73Var.f81753m) && this.f81754n == q73Var.f81754n && this.f81755o.equals(q73Var.f81755o) && this.f81756p == q73Var.f81756p && this.f81757q == q73Var.f81757q && this.f81758r == q73Var.f81758r && this.f81759s.equals(q73Var.f81759s) && this.f81760t.equals(q73Var.f81760t) && this.f81761u == q73Var.f81761u && this.f81762v == q73Var.f81762v && this.f81763w == q73Var.f81763w && this.f81764x == q73Var.f81764x && this.f81765y == q73Var.f81765y) {
            s51 s51Var = this.f81766z;
            s51 s51Var2 = q73Var.f81766z;
            s51Var.getClass();
            if (s51Var != s51Var2) {
                if (s51Var2 instanceof Map) {
                    if (((u51) s51Var.entrySet()).equals(s51Var2.entrySet())) {
                        if (this.A.equals(q73Var.A)) {
                            return true;
                        }
                    }
                }
            } else if (this.A.equals(q73Var.A)) {
                return true;
            }
        }
        return false;
    }

    static {
        new wq() { // from class: cp.r8
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return q73.a(bundle);
            }
        };
    }

    public static q73 a(Bundle bundle) {
        return new q73(new p73(bundle));
    }

    public int hashCode() {
        return this.A.hashCode() + ((((((((((((((this.f81760t.hashCode() + ((this.f81759s.hashCode() + ((((((((this.f81755o.hashCode() + ((((this.f81753m.hashCode() + ((((((((((((((((((((((this.f81742b + 31) * 31) + this.f81743c) * 31) + this.f81744d) * 31) + this.f81745e) * 31) + this.f81746f) * 31) + this.f81747g) * 31) + this.f81748h) * 31) + this.f81749i) * 31) + (this.f81752l ? 1 : 0)) * 31) + this.f81750j) * 31) + this.f81751k) * 31)) * 31) + this.f81754n) * 31)) * 31) + this.f81756p) * 31) + this.f81757q) * 31) + this.f81758r) * 31)) * 31)) * 31) + this.f81761u) * 31) + this.f81762v) * 31) + (this.f81763w ? 1 : 0)) * 31) + (this.f81764x ? 1 : 0)) * 31) + (this.f81765y ? 1 : 0)) * 31) + ly2.a(this.f81766z.entrySet())) * 31);
    }

    public q73(p73 p73Var) {
        this.f81742b = p73Var.f81274a;
        this.f81743c = p73Var.f81275b;
        this.f81744d = p73Var.f81276c;
        this.f81745e = p73Var.f81277d;
        this.f81746f = p73Var.f81278e;
        this.f81747g = p73Var.f81279f;
        this.f81748h = p73Var.f81280g;
        this.f81749i = p73Var.f81281h;
        this.f81750j = p73Var.f81282i;
        this.f81751k = p73Var.f81283j;
        this.f81752l = p73Var.f81284k;
        this.f81753m = p73Var.f81285l;
        this.f81754n = p73Var.f81286m;
        this.f81755o = p73Var.f81287n;
        this.f81756p = p73Var.f81288o;
        this.f81757q = p73Var.f81289p;
        this.f81758r = p73Var.f81290q;
        this.f81759s = p73Var.f81291r;
        this.f81760t = p73Var.f81292s;
        this.f81761u = p73Var.f81293t;
        this.f81762v = p73Var.f81294u;
        this.f81763w = p73Var.f81295v;
        this.f81764x = p73Var.f81296w;
        this.f81765y = p73Var.f81297x;
        this.f81766z = s51.a(p73Var.f81298y);
        this.A = u51.a(p73Var.f81299z);
    }
}
