package al;

import ck.p;
import ck.s;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: AbstractDecoder.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements e, c {
    @Override // al.e
    public boolean E() {
        return true;
    }

    @Override // al.e
    public abstract byte H();

    @Override // al.e
    public c b(kotlinx.serialization.descriptors.a aVar) {
        p.j(aVar, "descriptor");
        return this;
    }

    @Override // al.c
    public void c(kotlinx.serialization.descriptors.a aVar) {
        p.j(aVar, "descriptor");
    }

    @Override // al.e
    public Void g() {
        return null;
    }

    @Override // al.e
    public abstract long h();

    @Override // al.e
    public abstract short l();

    @Override // al.e
    public abstract int u();

    @Override // al.e
    public e y(kotlinx.serialization.descriptors.a aVar) {
        p.j(aVar, "descriptor");
        return this;
    }

    @Override // al.c
    public final float A(kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(aVar, "descriptor");
        return z();
    }

    @Override // al.c
    public final byte C(kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(aVar, "descriptor");
        return H();
    }

    @Override // al.c
    public final boolean D(kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(aVar, "descriptor");
        return B();
    }

    @Override // al.c
    public final short F(kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(aVar, "descriptor");
        return l();
    }

    @Override // al.c
    public final double G(kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(aVar, "descriptor");
        return m();
    }

    public <T> T I(xk.a<? extends T> aVar, T t10) {
        p.j(aVar, "deserializer");
        return (T) r(aVar);
    }

    public Object J() {
        throw new SerializationException(s.b(getClass()) + " can't retrieve untyped values");
    }

    @Override // al.c
    public final long e(kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(aVar, "descriptor");
        return h();
    }

    @Override // al.c
    public final int f(kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(aVar, "descriptor");
        return u();
    }

    @Override // al.c
    public final String i(kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(aVar, "descriptor");
        return o();
    }

    @Override // al.c
    public e k(kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(aVar, "descriptor");
        return y(aVar.d(i10));
    }

    @Override // al.c
    public final <T> T p(kotlinx.serialization.descriptors.a aVar, int i10, xk.a<? extends T> aVar2, T t10) {
        p.j(aVar, "descriptor");
        p.j(aVar2, "deserializer");
        return (aVar2.getDescriptor().b() || E()) ? (T) I(aVar2, t10) : (T) g();
    }

    @Override // al.c
    public final char q(kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(aVar, "descriptor");
        return n();
    }

    @Override // al.e
    public int s(kotlinx.serialization.descriptors.a aVar) {
        p.j(aVar, "enumDescriptor");
        Object objJ = J();
        p.h(objJ, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) objJ).intValue();
    }

    @Override // al.c
    public <T> T v(kotlinx.serialization.descriptors.a aVar, int i10, xk.a<? extends T> aVar2, T t10) {
        p.j(aVar, "descriptor");
        p.j(aVar2, "deserializer");
        return (T) I(aVar2, t10);
    }

    @Override // al.e
    public boolean B() {
        Object objJ = J();
        p.h(objJ, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) objJ).booleanValue();
    }

    @Override // al.c
    public boolean j() {
        return c.a.b(this);
    }

    @Override // al.e
    public double m() {
        Object objJ = J();
        p.h(objJ, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) objJ).doubleValue();
    }

    @Override // al.e
    public char n() {
        Object objJ = J();
        p.h(objJ, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) objJ).charValue();
    }

    @Override // al.e
    public String o() {
        Object objJ = J();
        p.h(objJ, "null cannot be cast to non-null type kotlin.String");
        return (String) objJ;
    }

    @Override // al.e
    public <T> T r(xk.a<? extends T> aVar) {
        return (T) e.a.a(this, aVar);
    }

    @Override // al.c
    public int w(kotlinx.serialization.descriptors.a aVar) {
        return c.a.a(this, aVar);
    }

    @Override // al.e
    public float z() {
        Object objJ = J();
        p.h(objJ, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) objJ).floatValue();
    }
}
