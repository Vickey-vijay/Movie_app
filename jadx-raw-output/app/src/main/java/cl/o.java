package cl;

import dl.f0;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import lk.h0;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements xk.b<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f6115a = new o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f6116b = SerialDescriptorsKt.a("kotlinx.serialization.json.JsonLiteral", zk.e.i.f86468a);

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public n deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        kotlinx.serialization.json.b bVarT = j.d(eVar).t();
        if (bVarT instanceof n) {
            return (n) bVarT;
        }
        throw f0.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + ck.s.b(bVarT.getClass()), bVarT.toString());
    }

    @Override // xk.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(al.f fVar, n nVar) {
        ck.p.j(fVar, "encoder");
        ck.p.j(nVar, "value");
        j.h(fVar);
        if (nVar.g()) {
            fVar.v(nVar.e());
            return;
        }
        if (nVar.f() != null) {
            fVar.g(nVar.f()).v(nVar.e());
            return;
        }
        Long lO = i.o(nVar);
        if (lO != null) {
            fVar.z(lO.longValue());
            return;
        }
        mj.m mVarH = h0.h(nVar.e());
        if (mVarH != null) {
            fVar.g(yk.a.F(mj.m.f64551c).getDescriptor()).z(mVarH.f());
            return;
        }
        Double dH = i.h(nVar);
        if (dH != null) {
            fVar.x(dH.doubleValue());
            return;
        }
        Boolean boolE = i.e(nVar);
        if (boolE != null) {
            fVar.k(boolE.booleanValue());
        } else {
            fVar.v(nVar.e());
        }
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f6116b;
    }
}
