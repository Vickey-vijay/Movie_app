package kotlinx.serialization.json.internal;

import bl.b0;
import ck.p;

/* JADX INFO: compiled from: JsonElementMarker.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class JsonElementMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f63300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f63301b;

    public JsonElementMarker(kotlinx.serialization.descriptors.a aVar) {
        p.j(aVar, "descriptor");
        this.f63300a = new b0(aVar, new JsonElementMarker$origin$1(this));
    }

    public final boolean b() {
        return this.f63301b;
    }

    public final void c(int i10) {
        this.f63300a.a(i10);
    }

    public final int d() {
        return this.f63300a.d();
    }

    public final boolean e(kotlinx.serialization.descriptors.a aVar, int i10) {
        boolean z10;
        if (!aVar.i(i10) && aVar.d(i10).b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f63301b = z10;
        return z10;
    }
}
