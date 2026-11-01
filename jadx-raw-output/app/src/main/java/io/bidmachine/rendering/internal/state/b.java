package io.bidmachine.rendering.internal.state;

import ck.p;
import io.bidmachine.rendering.internal.h;
import nk.j2;
import nk.l0;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements l0, a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f60554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final kotlin.coroutines.d f60555b;

    public b(a aVar, h hVar) {
        p.j(aVar, "adState");
        p.j(hVar, "coroutineDispatchers");
        this.f60554a = aVar;
        this.f60555b = j2.b(null, 1, null).plus(hVar.e());
        if (aVar.h()) {
            kotlinx.coroutines.d.d(this, null, 1, null);
        } else {
            aVar.a(this);
        }
    }

    @Override // io.bidmachine.rendering.internal.state.a.b
    public void a(a aVar, a.EnumC0537a enumC0537a) {
        p.j(aVar, "source");
        p.j(enumC0537a, "event");
        if (enumC0537a == a.EnumC0537a.Destroyed && p.e(this.f60554a, aVar)) {
            kotlinx.coroutines.d.d(this, null, 1, null);
            aVar.b(this);
        }
    }

    @Override // nk.l0
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f60555b;
    }
}
