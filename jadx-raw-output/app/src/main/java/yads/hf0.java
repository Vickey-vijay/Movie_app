package yads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import yads.hf0;

/* JADX INFO: loaded from: classes3.dex */
public final class hf0 extends gf0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f78201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final af0 f78202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f78203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f78204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f78205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f78206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f78207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f78208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f78209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f78210o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f78211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f78212q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f78213r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f78214s;

    public static int a(hf0 hf0Var, hf0 hf0Var2) {
        hy hyVarA = fy.a(lq.a(hf0Var.f78204i, hf0Var2.f78204i)).a(hf0Var.f78208m, hf0Var2.f78208m).a(hf0Var.f78209n, hf0Var2.f78209n).a(hf0Var.f78201f, hf0Var2.f78201f).a(hf0Var.f78203h, hf0Var2.f78203h);
        Integer numValueOf = Integer.valueOf(hf0Var.f78207l);
        Integer numValueOf2 = Integer.valueOf(hf0Var2.f78207l);
        y72.f84838b.getClass();
        hy hyVarA2 = hyVarA.a(numValueOf, numValueOf2, jq2.f79148b).a(hf0Var.f78212q, hf0Var2.f78212q).a(hf0Var.f78213r, hf0Var2.f78213r);
        if (hf0Var.f78212q && hf0Var.f78213r) {
            hyVarA2 = hyVarA2.a(hf0Var.f78214s, hf0Var2.f78214s);
        }
        return hyVarA2.a();
    }

    public static int b(hf0 hf0Var, hf0 hf0Var2) {
        sa2 sa2VarA = (hf0Var.f78201f && hf0Var.f78204i) ? if0.f78613i : if0.f78613i.a();
        return fy.a((hf0Var.f78202g.f81764x ? if0.f78613i.a() : if0.f78614j).compare(Integer.valueOf(hf0Var.f78205j), Integer.valueOf(hf0Var2.f78205j))).a(Integer.valueOf(hf0Var.f78206k), Integer.valueOf(hf0Var2.f78206k), sa2VarA).a(Integer.valueOf(hf0Var.f78205j), Integer.valueOf(hf0Var2.f78205j), sa2VarA).a();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0079  */
    public hf0(int i10, h73 h73Var, int i11, af0 af0Var, int i12, int i13, boolean z10) {
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        mx0 mx0Var;
        int i15;
        int i16;
        int i17;
        mx0 mx0Var2;
        int i18;
        int i19;
        int i20;
        super(i10, i11, h73Var);
        this.f78202g = af0Var;
        if (af0Var.E) {
            i14 = 24;
        } else {
            i14 = 16;
        }
        if (af0Var.D && (i13 & i14) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f78210o = z11;
        if (z10 && (((i18 = (mx0Var2 = this.f77796e).f80434r) == -1 || i18 <= af0Var.f81742b) && ((i19 = mx0Var2.f80435s) == -1 || i19 <= af0Var.f81743c))) {
            float f10 = mx0Var2.f80436t;
            if ((f10 == -1.0f || f10 <= af0Var.f81744d) && ((i20 = mx0Var2.f80425i) == -1 || i20 <= af0Var.f81745e)) {
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        this.f78201f = z12;
        if (z10 && (((i15 = (mx0Var = this.f77796e).f80434r) == -1 || i15 >= af0Var.f81746f) && ((i16 = mx0Var.f80435s) == -1 || i16 >= af0Var.f81747g))) {
            float f11 = mx0Var.f80436t;
            if ((f11 == -1.0f || f11 >= af0Var.f81748h) && ((i17 = mx0Var.f80425i) == -1 || i17 >= af0Var.f81749i)) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        this.f78203h = z13;
        this.f78204i = if0.a(false, i12);
        mx0 mx0Var3 = this.f77796e;
        this.f78205j = mx0Var3.f80425i;
        this.f78206k = mx0Var3.a();
        this.f78208m = if0.a(this.f77796e.f80422f, af0Var.f81754n);
        int i21 = this.f77796e.f80422f;
        if (i21 != 0 && (i21 & 1) == 0) {
            z14 = false;
        } else {
            z14 = true;
        }
        this.f78209n = z14;
        int i22 = Integer.MAX_VALUE;
        for (int i23 = 0; i23 < af0Var.f81753m.size(); i23++) {
            String str = this.f77796e.f80429m;
            if (str != null && str.equals(af0Var.f81753m.get(i23))) {
                i22 = i23;
                break;
            }
        }
        this.f78207l = i22;
        if (ro.a(i12) == 128) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.f78212q = z15;
        this.f78213r = ro.b(i12) == 64;
        this.f78214s = if0.a(this.f77796e.f80429m);
        this.f78211p = a(i12, i14);
    }

    public static int a(List list, List list2) {
        return fy.a(new Comparator() { // from class: cp.l2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hf0.a((hf0) obj, (hf0) obj2);
            }
        }.compare((hf0) Collections.max(list, new Comparator() { // from class: cp.l2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hf0.a((hf0) obj, (hf0) obj2);
            }
        }), (hf0) Collections.max(list2, new Comparator() { // from class: cp.l2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hf0.a((hf0) obj, (hf0) obj2);
            }
        }))).a(list.size(), list2.size()).a((hf0) Collections.max(list, new Comparator() { // from class: cp.m2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hf0.b((hf0) obj, (hf0) obj2);
            }
        }), (hf0) Collections.max(list2, new Comparator() { // from class: cp.m2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hf0.b((hf0) obj, (hf0) obj2);
            }
        }), new Comparator() { // from class: cp.m2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return hf0.b((hf0) obj, (hf0) obj2);
            }
        }).a();
    }

    public final int a(int i10, int i11) {
        if ((this.f77796e.f80422f & 16384) != 0 || !if0.a(this.f78202g.M, i10)) {
            return 0;
        }
        if (!this.f78201f && !this.f78202g.C) {
            return 0;
        }
        if (if0.a(false, i10) && this.f78203h && this.f78201f && this.f77796e.f80425i != -1) {
            af0 af0Var = this.f78202g;
            if (!af0Var.f81765y && !af0Var.f81764x && (i10 & i11) != 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override // yads.gf0
    public final int a() {
        return this.f78211p;
    }

    @Override // yads.gf0
    public final boolean a(gf0 gf0Var) {
        hf0 hf0Var = (hf0) gf0Var;
        return (this.f78210o || ib3.a(this.f77796e.f80429m, hf0Var.f77796e.f80429m)) && (this.f78202g.F || (this.f78212q == hf0Var.f78212q && this.f78213r == hf0Var.f78213r));
    }
}
