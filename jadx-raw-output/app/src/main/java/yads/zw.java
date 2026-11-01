package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class zw implements xw, qg1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f85621j = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t83 f85622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t83 f85623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f85624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f85625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f85626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f85627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f85628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f85629i;

    public final boolean a() {
        boolean z10;
        synchronized (f85621j) {
            z10 = this.f85626f;
        }
        return z10;
    }

    public final String b() {
        String str;
        synchronized (f85621j) {
            str = this.f85624d;
        }
        return str;
    }

    public final String c() {
        String str;
        synchronized (f85621j) {
            str = this.f85625e;
        }
        return str;
    }

    public final String d() {
        String str;
        synchronized (f85621j) {
            str = this.f85627g;
        }
        return str;
    }

    public final String e() {
        String str;
        synchronized (f85621j) {
            str = this.f85628h;
        }
        return str;
    }

    public zw(ax axVar, bx bxVar, rg1 rg1Var) {
        this.f85622b = axVar;
        this.f85623c = bxVar;
        for (sw swVar : sw.values()) {
            a(rg1Var, swVar);
        }
        ((tg1) rg1Var).a(this);
    }

    public final void a(rg1 rg1Var, sw swVar) {
        ix ixVarA = this.f85623c.a(rg1Var, swVar);
        if (ixVarA == null) {
            ixVarA = this.f85622b.a(rg1Var, swVar);
        }
        a(ixVarA);
    }

    public final void a(ix ixVar) {
        if (ixVar instanceof dx) {
            this.f85626f = ((dx) ixVar).f76834a;
            return;
        }
        if (ixVar instanceof ex) {
            this.f85624d = ((ex) ixVar).f77215a;
            return;
        }
        if (ixVar instanceof fx) {
            this.f85625e = ((fx) ixVar).f77533a;
            return;
        }
        if (ixVar instanceof gx) {
            this.f85627g = ((gx) ixVar).f77964a;
        } else if (ixVar instanceof hx) {
            this.f85628h = ((hx) ixVar).f78403a;
        } else if (ixVar instanceof cx) {
            this.f85629i = ((cx) ixVar).f76454a;
        }
    }
}
