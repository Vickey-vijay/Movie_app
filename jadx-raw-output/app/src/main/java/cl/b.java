package cl;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: JsonElementBuilders.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<kotlinx.serialization.json.b> f6077a = new ArrayList();

    public final boolean a(kotlinx.serialization.json.b bVar) {
        ck.p.j(bVar, "element");
        this.f6077a.add(bVar);
        return true;
    }

    public final kotlinx.serialization.json.a b() {
        return new kotlinx.serialization.json.a(this.f6077a);
    }
}
