package dl;

/* JADX INFO: compiled from: Composers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f52192c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r0 r0Var, boolean z10) {
        super(r0Var);
        ck.p.j(r0Var, "writer");
        this.f52192c = z10;
    }

    @Override // dl.r
    public void m(String str) {
        ck.p.j(str, "value");
        if (this.f52192c) {
            super.m(str);
        } else {
            super.j(str);
        }
    }
}
