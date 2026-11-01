package al;

import bl.g1;
import ck.p;
import ck.s;
import kotlinx.serialization.SerializationException;
import xk.g;

/* JADX INFO: compiled from: AbstractEncoder.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b implements f, d {
    public boolean H(kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(aVar, "descriptor");
        return true;
    }

    @Override // al.f
    public d b(kotlinx.serialization.descriptors.a aVar) {
        p.j(aVar, "descriptor");
        return this;
    }

    @Override // al.d
    public void c(kotlinx.serialization.descriptors.a aVar) {
        p.j(aVar, "descriptor");
    }

    @Override // al.f
    public f g(kotlinx.serialization.descriptors.a aVar) {
        p.j(aVar, "descriptor");
        return this;
    }

    @Override // al.f
    public void A() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // al.d
    public final void B(kotlinx.serialization.descriptors.a aVar, int i10, float f10) {
        p.j(aVar, "descriptor");
        if (H(aVar, i10)) {
            l(f10);
        }
    }

    @Override // al.d
    public <T> void C(kotlinx.serialization.descriptors.a aVar, int i10, g<? super T> gVar, T t10) {
        p.j(aVar, "descriptor");
        p.j(gVar, "serializer");
        if (H(aVar, i10)) {
            I(gVar, t10);
        }
    }

    @Override // al.d
    public final void G(kotlinx.serialization.descriptors.a aVar, int i10, double d10) {
        p.j(aVar, "descriptor");
        if (H(aVar, i10)) {
            x(d10);
        }
    }

    public void J(Object obj) {
        p.j(obj, "value");
        throw new SerializationException("Non-serializable " + s.b(obj.getClass()) + " is not supported by " + s.b(getClass()) + " encoder");
    }

    @Override // al.f
    public void f(kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(aVar, "enumDescriptor");
        J(Integer.valueOf(i10));
    }

    @Override // al.d
    public final void h(kotlinx.serialization.descriptors.a aVar, int i10, char c10) {
        p.j(aVar, "descriptor");
        if (H(aVar, i10)) {
            D(c10);
        }
    }

    @Override // al.d
    public final void i(kotlinx.serialization.descriptors.a aVar, int i10, byte b10) {
        p.j(aVar, "descriptor");
        if (H(aVar, i10)) {
            e(b10);
        }
    }

    @Override // al.d
    public <T> void m(kotlinx.serialization.descriptors.a aVar, int i10, g<? super T> gVar, T t10) {
        p.j(aVar, "descriptor");
        p.j(gVar, "serializer");
        if (H(aVar, i10)) {
            F(gVar, t10);
        }
    }

    @Override // al.d
    public final void n(kotlinx.serialization.descriptors.a aVar, int i10, int i11) {
        p.j(aVar, "descriptor");
        if (H(aVar, i10)) {
            s(i11);
        }
    }

    @Override // al.d
    public final void o(kotlinx.serialization.descriptors.a aVar, int i10, boolean z10) {
        p.j(aVar, "descriptor");
        if (H(aVar, i10)) {
            k(z10);
        }
    }

    @Override // al.d
    public final void p(kotlinx.serialization.descriptors.a aVar, int i10, String str) {
        p.j(aVar, "descriptor");
        p.j(str, "value");
        if (H(aVar, i10)) {
            v(str);
        }
    }

    @Override // al.d
    public final void t(kotlinx.serialization.descriptors.a aVar, int i10, short s10) {
        p.j(aVar, "descriptor");
        if (H(aVar, i10)) {
            j(s10);
        }
    }

    @Override // al.d
    public final void u(kotlinx.serialization.descriptors.a aVar, int i10, long j10) {
        p.j(aVar, "descriptor");
        if (H(aVar, i10)) {
            z(j10);
        }
    }

    @Override // al.f
    public void v(String str) {
        p.j(str, "value");
        J(str);
    }

    @Override // al.d
    public final f w(kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(aVar, "descriptor");
        return H(aVar, i10) ? g(aVar.d(i10)) : g1.f5407a;
    }

    @Override // al.f
    public void D(char c10) {
        J(Character.valueOf(c10));
    }

    @Override // al.f
    public void E() {
        f.a.b(this);
    }

    @Override // al.f
    public <T> void F(g<? super T> gVar, T t10) {
        f.a.d(this, gVar, t10);
    }

    public <T> void I(g<? super T> gVar, T t10) {
        f.a.c(this, gVar, t10);
    }

    @Override // al.f
    public void e(byte b10) {
        J(Byte.valueOf(b10));
    }

    @Override // al.f
    public void j(short s10) {
        J(Short.valueOf(s10));
    }

    @Override // al.f
    public void k(boolean z10) {
        J(Boolean.valueOf(z10));
    }

    @Override // al.f
    public void l(float f10) {
        J(Float.valueOf(f10));
    }

    @Override // al.d
    public boolean q(kotlinx.serialization.descriptors.a aVar, int i10) {
        return d.a.a(this, aVar, i10);
    }

    @Override // al.f
    public void s(int i10) {
        J(Integer.valueOf(i10));
    }

    @Override // al.f
    public void x(double d10) {
        J(Double.valueOf(d10));
    }

    @Override // al.f
    public d y(kotlinx.serialization.descriptors.a aVar, int i10) {
        return f.a.a(this, aVar, i10);
    }

    @Override // al.f
    public void z(long j10) {
        J(Long.valueOf(j10));
    }
}
