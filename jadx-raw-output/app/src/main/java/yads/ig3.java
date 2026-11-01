package yads;

/* JADX INFO: loaded from: classes7.dex */
public final class ig3 extends fk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jg3 f78654a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ig3(jg3 jg3Var) {
        hg3 hg3Var = hg3.f78220b;
        this.f78654a = jg3Var;
        super(hg3Var);
    }

    @Override // fk.b
    public final void afterChange(jk.k kVar, Object obj, Object obj2) {
        ck.p.j(kVar, "property");
        this.f78654a.f79043a.add((hg3) obj2);
    }
}
