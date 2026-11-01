package dl;

import java.util.Set;

/* JADX INFO: compiled from: StreamingJsonEncoder.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<kotlinx.serialization.descriptors.a> f52216a = nj.q0.j(yk.a.E(mj.k.f64546c).getDescriptor(), yk.a.F(mj.m.f64551c).getDescriptor(), yk.a.D(mj.i.f64541c).getDescriptor(), yk.a.G(mj.p.f64557c).getDescriptor());

    public static final boolean a(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "<this>");
        return aVar.isInline() && ck.p.e(aVar, cl.i.m());
    }

    public static final boolean b(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "<this>");
        return aVar.isInline() && f52216a.contains(aVar);
    }
}
