package bl;

import java.util.ArrayList;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class e2<Tag> implements al.f, al.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Tag> f5400a = new ArrayList<>();

    @Override // al.f
    public abstract <T> void F(xk.g<? super T> gVar, T t10);

    public abstract void J(Tag tag, boolean z10);

    public abstract void K(Tag tag, byte b10);

    public abstract void L(Tag tag, char c10);

    public abstract void M(Tag tag, double d10);

    public abstract void N(Tag tag, kotlinx.serialization.descriptors.a aVar, int i10);

    public abstract void O(Tag tag, float f10);

    public abstract void Q(Tag tag, int i10);

    public abstract void R(Tag tag, long j10);

    public abstract void S(Tag tag, short s10);

    public abstract void T(Tag tag, String str);

    public abstract void U(kotlinx.serialization.descriptors.a aVar);

    public abstract Tag X(kotlinx.serialization.descriptors.a aVar, int i10);

    @Override // al.d
    public final void B(kotlinx.serialization.descriptors.a aVar, int i10, float f10) {
        ck.p.j(aVar, "descriptor");
        O(X(aVar, i10), f10);
    }

    @Override // al.d
    public <T> void C(kotlinx.serialization.descriptors.a aVar, int i10, xk.g<? super T> gVar, T t10) {
        ck.p.j(aVar, "descriptor");
        ck.p.j(gVar, "serializer");
        if (H(aVar, i10)) {
            I(gVar, t10);
        }
    }

    @Override // al.d
    public final void G(kotlinx.serialization.descriptors.a aVar, int i10, double d10) {
        ck.p.j(aVar, "descriptor");
        M(X(aVar, i10), d10);
    }

    public al.f P(Tag tag, kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "inlineDescriptor");
        Z(tag);
        return this;
    }

    public final Tag V() {
        return (Tag) nj.b0.r0(this.f5400a);
    }

    public final Tag W() {
        return (Tag) nj.b0.s0(this.f5400a);
    }

    public final Tag Y() {
        if (!(!this.f5400a.isEmpty())) {
            throw new SerializationException("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.f5400a;
        return arrayList.remove(nj.s.m(arrayList));
    }

    public final void Z(Tag tag) {
        this.f5400a.add(tag);
    }

    @Override // al.d
    public final void c(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
        if (!this.f5400a.isEmpty()) {
            Y();
        }
        U(aVar);
    }

    @Override // al.f
    public final void f(kotlinx.serialization.descriptors.a aVar, int i10) {
        ck.p.j(aVar, "enumDescriptor");
        N(Y(), aVar, i10);
    }

    @Override // al.f
    public al.f g(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
        return P(Y(), aVar);
    }

    @Override // al.d
    public final void h(kotlinx.serialization.descriptors.a aVar, int i10, char c10) {
        ck.p.j(aVar, "descriptor");
        L(X(aVar, i10), c10);
    }

    @Override // al.d
    public final void i(kotlinx.serialization.descriptors.a aVar, int i10, byte b10) {
        ck.p.j(aVar, "descriptor");
        K(X(aVar, i10), b10);
    }

    @Override // al.d
    public <T> void m(kotlinx.serialization.descriptors.a aVar, int i10, xk.g<? super T> gVar, T t10) {
        ck.p.j(aVar, "descriptor");
        ck.p.j(gVar, "serializer");
        if (H(aVar, i10)) {
            F(gVar, t10);
        }
    }

    @Override // al.d
    public final void n(kotlinx.serialization.descriptors.a aVar, int i10, int i11) {
        ck.p.j(aVar, "descriptor");
        Q(X(aVar, i10), i11);
    }

    @Override // al.d
    public final void o(kotlinx.serialization.descriptors.a aVar, int i10, boolean z10) {
        ck.p.j(aVar, "descriptor");
        J(X(aVar, i10), z10);
    }

    @Override // al.d
    public final void p(kotlinx.serialization.descriptors.a aVar, int i10, String str) {
        ck.p.j(aVar, "descriptor");
        ck.p.j(str, "value");
        T(X(aVar, i10), str);
    }

    @Override // al.d
    public final void t(kotlinx.serialization.descriptors.a aVar, int i10, short s10) {
        ck.p.j(aVar, "descriptor");
        S(X(aVar, i10), s10);
    }

    @Override // al.d
    public final void u(kotlinx.serialization.descriptors.a aVar, int i10, long j10) {
        ck.p.j(aVar, "descriptor");
        R(X(aVar, i10), j10);
    }

    @Override // al.f
    public final void v(String str) {
        ck.p.j(str, "value");
        T(Y(), str);
    }

    @Override // al.d
    public final al.f w(kotlinx.serialization.descriptors.a aVar, int i10) {
        ck.p.j(aVar, "descriptor");
        return P(X(aVar, i10), aVar.d(i10));
    }

    private final boolean H(kotlinx.serialization.descriptors.a aVar, int i10) {
        Z(X(aVar, i10));
        return true;
    }

    @Override // al.f
    public final void D(char c10) {
        L(Y(), c10);
    }

    public <T> void I(xk.g<? super T> gVar, T t10) {
        al.f.a.c(this, gVar, t10);
    }

    @Override // al.f
    public final void e(byte b10) {
        K(Y(), b10);
    }

    @Override // al.f
    public final void j(short s10) {
        S(Y(), s10);
    }

    @Override // al.f
    public final void k(boolean z10) {
        J(Y(), z10);
    }

    @Override // al.f
    public final void l(float f10) {
        O(Y(), f10);
    }

    @Override // al.f
    public final void s(int i10) {
        Q(Y(), i10);
    }

    @Override // al.f
    public final void x(double d10) {
        M(Y(), d10);
    }

    @Override // al.f
    public al.d y(kotlinx.serialization.descriptors.a aVar, int i10) {
        return al.f.a.a(this, aVar, i10);
    }

    @Override // al.f
    public final void z(long j10) {
        R(Y(), j10);
    }
}
