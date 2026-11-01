package cl;

/* JADX INFO: compiled from: Json.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f6089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f6092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f6093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f6094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public q f6095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public el.c f6096n;

    public d(a aVar) {
        ck.p.j(aVar, "json");
        this.f6083a = aVar.e().e();
        this.f6084b = aVar.e().f();
        this.f6085c = aVar.e().g();
        this.f6086d = aVar.e().m();
        this.f6087e = aVar.e().b();
        this.f6088f = aVar.e().i();
        this.f6089g = aVar.e().j();
        this.f6090h = aVar.e().d();
        this.f6091i = aVar.e().l();
        this.f6092j = aVar.e().c();
        this.f6093k = aVar.e().a();
        this.f6094l = aVar.e().k();
        this.f6095m = aVar.e().h();
        this.f6096n = aVar.a();
    }

    public final f a() {
        if (this.f6091i && !ck.p.e(this.f6092j, "type")) {
            throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified".toString());
        }
        if (this.f6088f) {
            if (!ck.p.e(this.f6089g, "    ")) {
                String str = this.f6089g;
                boolean z10 = false;
                int i10 = 0;
                while (true) {
                    boolean z11 = true;
                    if (i10 >= str.length()) {
                        z10 = true;
                        break;
                    }
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        z11 = false;
                    }
                    if (!z11) {
                        break;
                    }
                    i10++;
                }
                if (!z10) {
                    throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f6089g).toString());
                }
            }
        } else if (!ck.p.e(this.f6089g, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used".toString());
        }
        return new f(this.f6083a, this.f6085c, this.f6086d, this.f6087e, this.f6088f, this.f6084b, this.f6089g, this.f6090h, this.f6091i, this.f6092j, this.f6093k, this.f6094l, this.f6095m);
    }

    public final el.c b() {
        return this.f6096n;
    }

    public final void c(boolean z10) {
        this.f6087e = z10;
    }

    public final void d(boolean z10) {
        this.f6083a = z10;
    }

    public final void e(boolean z10) {
        this.f6084b = z10;
    }

    public final void f(boolean z10) {
        this.f6085c = z10;
    }

    public final void g(boolean z10) {
        this.f6088f = z10;
    }
}
