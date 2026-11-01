package yads;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ef0 extends gf0 implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f77048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f77049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f77050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f77051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f77052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f77053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f77054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f77055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f77056n;

    public static int a(List list, List list2) {
        return ((ef0) list.get(0)).compareTo((ef0) list2.get(0));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ef0 ef0Var) {
        hy hyVarA = fy.a(lq.a(this.f77049g, ef0Var.f77049g));
        Integer numValueOf = Integer.valueOf(this.f77052j);
        Integer numValueOf2 = Integer.valueOf(ef0Var.f77052j);
        Comparator comparator = y72.f84838b;
        comparator.getClass();
        jq2 jq2Var = jq2.f79148b;
        hy hyVarA2 = hyVarA.a(numValueOf, numValueOf2, jq2Var).a(this.f77053k, ef0Var.f77053k).a(this.f77054l, ef0Var.f77054l).a(this.f77050h, ef0Var.f77050h);
        Boolean boolValueOf = Boolean.valueOf(this.f77051i);
        Boolean boolValueOf2 = Boolean.valueOf(ef0Var.f77051i);
        if (this.f77053k != 0) {
            comparator = jq2Var;
        }
        hy hyVarA3 = hyVarA2.a(boolValueOf, boolValueOf2, comparator).a(this.f77055m, ef0Var.f77055m);
        if (this.f77054l == 0) {
            hyVarA3 = hyVarA3.b(this.f77056n, ef0Var.f77056n);
        }
        return hyVarA3.a();
    }

    public ef0(int i10, h73 h73Var, int i11, af0 af0Var, int i12, String str) {
        boolean z10;
        boolean z11;
        p51 p51VarA;
        int iA;
        boolean z12;
        boolean z13;
        boolean z14;
        super(i10, i11, h73Var);
        int i13 = 0;
        this.f77049g = if0.a(false, i12);
        int i14 = this.f77796e.f80421e & (~af0Var.f81762v);
        if ((i14 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f77050h = z10;
        if ((i14 & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f77051i = z11;
        int i15 = Integer.MAX_VALUE;
        if (af0Var.f81760t.isEmpty()) {
            p51VarA = p51.a("");
        } else {
            p51VarA = af0Var.f81760t;
        }
        int i16 = 0;
        while (true) {
            if (i16 < p51VarA.size()) {
                iA = if0.a(this.f77796e, (String) p51VarA.get(i16), af0Var.f81763w);
                if (iA > 0) {
                    i15 = i16;
                    break;
                }
                i16++;
            } else {
                iA = 0;
                break;
            }
        }
        this.f77052j = i15;
        this.f77053k = iA;
        int iA2 = if0.a(this.f77796e.f80422f, af0Var.f81761u);
        this.f77054l = iA2;
        if ((this.f77796e.f80422f & 1088) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f77056n = z12;
        if (if0.b(str) == null) {
            z13 = true;
        } else {
            z13 = false;
        }
        int iA3 = if0.a(this.f77796e, str, z13);
        this.f77055m = iA3;
        if (iA <= 0 && ((!af0Var.f81760t.isEmpty() || iA2 <= 0) && !this.f77050h && (!this.f77051i || iA3 <= 0))) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (if0.a(af0Var.M, i12) && z14) {
            i13 = 1;
        }
        this.f77048f = i13;
    }

    @Override // yads.gf0
    public final int a() {
        return this.f77048f;
    }

    @Override // yads.gf0
    public final /* bridge */ /* synthetic */ boolean a(gf0 gf0Var) {
        return false;
    }
}
