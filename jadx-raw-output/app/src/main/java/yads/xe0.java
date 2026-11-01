package yads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class xe0 extends gf0 implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f84540f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f84541g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f84542h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final af0 f84543i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f84544j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f84545k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f84546l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f84547m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f84548n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f84549o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f84550p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f84551q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f84552r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f84553s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f84554t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f84555u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f84556v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f84557w;

    public static int a(List list, List list2) {
        return ((xe0) Collections.max(list)).compareTo((xe0) Collections.max(list2));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(xe0 xe0Var) {
        sa2 sa2VarA = (this.f84541g && this.f84544j) ? if0.f78613i : if0.f78613i.a();
        hy hyVarA = fy.a(lq.a(this.f84544j, xe0Var.f84544j));
        Integer numValueOf = Integer.valueOf(this.f84546l);
        Integer numValueOf2 = Integer.valueOf(xe0Var.f84546l);
        y72.f84838b.getClass();
        jq2 jq2Var = jq2.f79148b;
        hy hyVarA2 = hyVarA.a(numValueOf, numValueOf2, jq2Var).a(this.f84545k, xe0Var.f84545k).a(this.f84547m, xe0Var.f84547m).a(this.f84551q, xe0Var.f84551q).a(this.f84548n, xe0Var.f84548n).a(Integer.valueOf(this.f84549o), Integer.valueOf(xe0Var.f84549o), jq2Var).a(this.f84550p, xe0Var.f84550p).a(this.f84541g, xe0Var.f84541g).a(Integer.valueOf(this.f84555u), Integer.valueOf(xe0Var.f84555u), jq2Var).a(Integer.valueOf(this.f84554t), Integer.valueOf(xe0Var.f84554t), this.f84543i.f81764x ? if0.f78613i.a() : if0.f78614j).a(this.f84556v, xe0Var.f84556v).a(this.f84557w, xe0Var.f84557w).a(Integer.valueOf(this.f84552r), Integer.valueOf(xe0Var.f84552r), sa2VarA).a(Integer.valueOf(this.f84553s), Integer.valueOf(xe0Var.f84553s), sa2VarA);
        Integer numValueOf3 = Integer.valueOf(this.f84554t);
        Integer numValueOf4 = Integer.valueOf(xe0Var.f84554t);
        if (!ib3.a(this.f84542h, xe0Var.f84542h)) {
            sa2VarA = if0.f78614j;
        }
        return hyVarA2.a(numValueOf3, numValueOf4, sa2VarA).a();
    }

    public xe0(int i10, h73 h73Var, int i11, af0 af0Var, int i12, boolean z10, og2 og2Var) {
        int i13;
        int iA;
        boolean z11;
        boolean z12;
        boolean z13;
        int iA2;
        boolean z14;
        super(i10, i11, h73Var);
        this.f84543i = af0Var;
        this.f84542h = if0.b(this.f77796e.f80420d);
        this.f84544j = if0.a(false, i12);
        int i14 = 0;
        while (true) {
            i13 = Integer.MAX_VALUE;
            if (i14 < af0Var.f81755o.size()) {
                iA = if0.a(this.f77796e, (String) af0Var.f81755o.get(i14), false);
                if (iA > 0) {
                    break;
                } else {
                    i14++;
                }
            } else {
                iA = 0;
                i14 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f84546l = i14;
        this.f84545k = iA;
        this.f84547m = if0.a(this.f77796e.f80422f, af0Var.f81756p);
        mx0 mx0Var = this.f77796e;
        int i15 = mx0Var.f80422f;
        if (i15 != 0 && (i15 & 1) == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f84548n = z11;
        if ((mx0Var.f80421e & 1) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f84551q = z12;
        int i16 = mx0Var.f80442z;
        this.f84552r = i16;
        this.f84553s = mx0Var.A;
        int i17 = mx0Var.f80425i;
        this.f84554t = i17;
        if ((i17 == -1 || i17 <= af0Var.f81758r) && ((i16 == -1 || i16 <= af0Var.f81757q) && og2Var.apply(mx0Var))) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f84541g = z13;
        String[] strArrD = ib3.d();
        int i18 = 0;
        while (true) {
            if (i18 < strArrD.length) {
                iA2 = if0.a(this.f77796e, strArrD[i18], false);
                if (iA2 > 0) {
                    break;
                } else {
                    i18++;
                }
            } else {
                iA2 = 0;
                i18 = Integer.MAX_VALUE;
                break;
            }
        }
        this.f84549o = i18;
        this.f84550p = iA2;
        for (int i19 = 0; i19 < af0Var.f81759s.size(); i19++) {
            String str = this.f77796e.f80429m;
            if (str != null && str.equals(af0Var.f81759s.get(i19))) {
                i13 = i19;
                break;
            }
        }
        this.f84555u = i13;
        if (ro.a(i12) == 128) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.f84556v = z14;
        this.f84557w = ro.b(i12) == 64;
        this.f84540f = a(z10, i12);
    }

    public final int a(boolean z10, int i10) {
        if (!if0.a(this.f84543i.M, i10)) {
            return 0;
        }
        if (!this.f84541g && !this.f84543i.G) {
            return 0;
        }
        if (if0.a(false, i10) && this.f84541g && this.f77796e.f80425i != -1) {
            af0 af0Var = this.f84543i;
            if (!af0Var.f81765y && !af0Var.f81764x && (af0Var.O || !z10)) {
                return 2;
            }
        }
        return 1;
    }

    @Override // yads.gf0
    public final int a() {
        return this.f84540f;
    }

    @Override // yads.gf0
    public final boolean a(gf0 gf0Var) {
        int i10;
        String str;
        int i11;
        xe0 xe0Var = (xe0) gf0Var;
        af0 af0Var = this.f84543i;
        if ((af0Var.J || ((i11 = this.f77796e.f80442z) != -1 && i11 == xe0Var.f77796e.f80442z)) && (af0Var.H || ((str = this.f77796e.f80429m) != null && TextUtils.equals(str, xe0Var.f77796e.f80429m)))) {
            af0 af0Var2 = this.f84543i;
            if ((af0Var2.I || ((i10 = this.f77796e.A) != -1 && i10 == xe0Var.f77796e.A)) && (af0Var2.K || (this.f84556v == xe0Var.f84556v && this.f84557w == xe0Var.f84557w))) {
                return true;
            }
        }
        return false;
    }
}
