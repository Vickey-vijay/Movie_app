package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e00 f76559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qx f76560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hb f76561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b03 f76562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g9 f76563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v42 f76564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public qa3 f76565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f76566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f76567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Integer f76568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public qq1 f76569k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f76570l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f76571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f76572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f76573o;

    public /* synthetic */ d4(e00 e00Var) {
        this(e00Var, new qx(), new hb(), new b03());
    }

    public final e00 a() {
        return this.f76559a;
    }

    public final void a(g9 g9Var) {
        this.f76563e = g9Var;
    }

    public final rd b() {
        return this.f76560b.f82017b;
    }

    public final jm0 c() {
        return this.f76560b.f82016a;
    }

    public final a03 d() {
        return this.f76562d.f75685a;
    }

    public final void e() {
        this.f76564f = v42.f83737c;
    }

    public final void a(String str) {
        hb hbVar = this.f76561c;
        hbVar.getClass();
        if (str != null && !lk.a0.n0(str)) {
            String str2 = hbVar.f78158a;
            if (str2 != null && !ck.p.e(str2, str)) {
                lc1.c("Ad Unit Id can't be set twice.", new Object[0]);
                return;
            } else {
                hbVar.f78158a = str;
                return;
            }
        }
        lc1.c("Ad Unit Id can't be null or empty.", new Object[0]);
    }

    public d4(e00 e00Var, qx qxVar, hb hbVar, b03 b03Var) {
        this.f76559a = e00Var;
        this.f76560b = qxVar;
        this.f76561c = hbVar;
        this.f76562d = b03Var;
        this.f76571m = true;
        this.f76573o = x11.f84413b;
    }
}
