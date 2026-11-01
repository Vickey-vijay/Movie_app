package dc;

/* JADX INFO: compiled from: DimensionStatus.java */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f51914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f51915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f51916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f51917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f51918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f51919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f51920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f51921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f51922k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f51923l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f51924m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f51925n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a[] f51926o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f51927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f51928b;

    static {
        a aVar = new a(0, false);
        f51914c = aVar;
        a aVar2 = new a(1, true);
        f51915d = aVar2;
        a aVar3 = new a(2, false);
        f51916e = aVar3;
        a aVar4 = new a(3, true);
        f51917f = aVar4;
        a aVar5 = new a(4, false);
        f51918g = aVar5;
        a aVar6 = new a(5, true);
        f51919h = aVar6;
        a aVar7 = new a(6, false);
        f51920i = aVar7;
        a aVar8 = new a(7, true);
        f51921j = aVar8;
        a aVar9 = new a(8, false);
        f51922k = aVar9;
        a aVar10 = new a(9, true);
        f51923l = aVar10;
        a aVar11 = new a(10, false);
        f51924m = aVar11;
        a aVar12 = new a(10, true);
        f51925n = aVar12;
        f51926o = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12};
    }

    public boolean a(a aVar) {
        int i10 = this.f51927a;
        int i11 = aVar.f51927a;
        return i10 < i11 || ((!this.f51928b || f51923l == this) && i10 == i11);
    }

    public a b() {
        return !this.f51928b ? f51926o[this.f51927a + 1] : this;
    }

    public a c() {
        if (!this.f51928b) {
            return this;
        }
        a aVar = f51926o[this.f51927a - 1];
        return !aVar.f51928b ? aVar : f51914c;
    }

    public a(int i10, boolean z10) {
        this.f51927a = i10;
        this.f51928b = z10;
    }
}
