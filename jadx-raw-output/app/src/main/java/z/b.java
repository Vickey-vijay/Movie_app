package z;

import ck.p;
import io.g;
import org.fourthline.cling.support.model.TransportAction;

/* JADX INFO: compiled from: AVTransportServiceImpl.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b extends p000do.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f85866c;

    @Override // ho.m
    public org.fourthline.cling.model.types.b[] a() {
        return new org.fourthline.cling.model.types.b[]{new org.fourthline.cling.model.types.b(0L)};
    }

    public b(f fVar) {
        p.j(fVar, "avTransportControl");
        this.f85866c = fVar;
    }

    @Override // p000do.a
    public TransportAction[] c(org.fourthline.cling.model.types.b bVar) {
        p.j(bVar, "instanceId");
        return this.f85866c.d();
    }

    @Override // p000do.a
    public io.b d(org.fourthline.cling.model.types.b bVar) {
        p.j(bVar, "instanceId");
        return this.f85866c.f();
    }

    @Override // p000do.a
    public io.c e(org.fourthline.cling.model.types.b bVar) {
        p.j(bVar, "instanceId");
        return this.f85866c.a();
    }

    @Override // p000do.a
    public io.d f(org.fourthline.cling.model.types.b bVar) {
        p.j(bVar, "instanceId");
        return this.f85866c.e();
    }

    @Override // p000do.a
    public io.f g(org.fourthline.cling.model.types.b bVar) {
        p.j(bVar, "instanceId");
        return this.f85866c.b();
    }

    @Override // p000do.a
    public g h(org.fourthline.cling.model.types.b bVar) {
        p.j(bVar, "instanceId");
        return this.f85866c.c();
    }
}
