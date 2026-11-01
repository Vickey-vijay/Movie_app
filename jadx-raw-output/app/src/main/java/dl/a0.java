package dl;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cl.a f52137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f52138d;

    @Override // dl.r
    public void b() {
        n(true);
        this.f52138d++;
    }

    @Override // dl.r
    public void c() {
        n(false);
        j("\n");
        int i10 = this.f52138d;
        for (int i11 = 0; i11 < i10; i11++) {
            j(this.f52137c.e().j());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(r0 r0Var, cl.a aVar) {
        super(r0Var);
        ck.p.j(r0Var, "writer");
        ck.p.j(aVar, "json");
        this.f52137c = aVar;
    }

    @Override // dl.r
    public void o() {
        e(' ');
    }

    @Override // dl.r
    public void p() {
        this.f52138d--;
    }
}
