package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class wf3 extends fk.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yf3 f84190a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf3(yf3 yf3Var) {
        super(null);
        this.f84190a = yf3Var;
    }

    @Override // fk.b
    public final void afterChange(jk.k kVar, Object obj, Object obj2) {
        ck.p.j(kVar, "property");
        this.f84190a.f84943f.f75819e = (ag3) obj2;
    }
}
