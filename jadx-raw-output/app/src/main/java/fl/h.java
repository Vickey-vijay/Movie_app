package fl;

import gl.t1;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f52972a;

    public h(c cVar) {
        this.f52972a = cVar;
    }

    @Override // gl.t1
    public final void a() {
        c cVar = this.f52972a;
        if (cVar.I) {
            return;
        }
        cVar.v("load ad time out!");
        this.f52972a.J = true;
    }
}
