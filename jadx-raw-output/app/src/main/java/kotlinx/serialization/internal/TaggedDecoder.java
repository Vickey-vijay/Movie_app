package kotlinx.serialization.internal;

import al.c;
import al.e;
import ck.p;
import java.util.ArrayList;
import kotlinx.serialization.descriptors.a;
import nj.b0;
import nj.s;

/* JADX INFO: compiled from: Tagged.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class TaggedDecoder<Tag> implements e, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Tag> f63278a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f63279b;

    @Override // al.e
    public abstract boolean E();

    public abstract boolean J(Tag tag);

    public abstract byte K(Tag tag);

    public abstract char L(Tag tag);

    public abstract double M(Tag tag);

    public abstract int N(Tag tag, a aVar);

    public abstract float O(Tag tag);

    public abstract int Q(Tag tag);

    public abstract long R(Tag tag);

    public abstract short S(Tag tag);

    public abstract String T(Tag tag);

    public abstract Tag V(a aVar, int i10);

    @Override // al.e
    public final Void g() {
        return null;
    }

    @Override // al.e
    public abstract <T> T r(xk.a<? extends T> aVar);

    @Override // al.c
    public final float A(a aVar, int i10) {
        p.j(aVar, "descriptor");
        return O(V(aVar, i10));
    }

    @Override // al.c
    public final byte C(a aVar, int i10) {
        p.j(aVar, "descriptor");
        return K(V(aVar, i10));
    }

    @Override // al.c
    public final boolean D(a aVar, int i10) {
        p.j(aVar, "descriptor");
        return J(V(aVar, i10));
    }

    @Override // al.c
    public final short F(a aVar, int i10) {
        p.j(aVar, "descriptor");
        return S(V(aVar, i10));
    }

    @Override // al.c
    public final double G(a aVar, int i10) {
        p.j(aVar, "descriptor");
        return M(V(aVar, i10));
    }

    public <T> T I(xk.a<? extends T> aVar, T t10) {
        p.j(aVar, "deserializer");
        return (T) r(aVar);
    }

    public e P(Tag tag, a aVar) {
        p.j(aVar, "inlineDescriptor");
        X(tag);
        return this;
    }

    public final Tag U() {
        return (Tag) b0.s0(this.f63278a);
    }

    public final Tag W() {
        ArrayList<Tag> arrayList = this.f63278a;
        Tag tagRemove = arrayList.remove(s.m(arrayList));
        this.f63279b = true;
        return tagRemove;
    }

    public final void X(Tag tag) {
        this.f63278a.add(tag);
    }

    @Override // al.c
    public final long e(a aVar, int i10) {
        p.j(aVar, "descriptor");
        return R(V(aVar, i10));
    }

    @Override // al.c
    public final int f(a aVar, int i10) {
        p.j(aVar, "descriptor");
        return Q(V(aVar, i10));
    }

    @Override // al.c
    public final String i(a aVar, int i10) {
        p.j(aVar, "descriptor");
        return T(V(aVar, i10));
    }

    @Override // al.c
    public final e k(a aVar, int i10) {
        p.j(aVar, "descriptor");
        return P(V(aVar, i10), aVar.d(i10));
    }

    @Override // al.c
    public final <T> T p(a aVar, int i10, final xk.a<? extends T> aVar2, final T t10) {
        p.j(aVar, "descriptor");
        p.j(aVar2, "deserializer");
        return (T) Y(V(aVar, i10), new bk.a<T>(this) { // from class: kotlinx.serialization.internal.TaggedDecoder$decodeNullableSerializableElement$1
            public final /* synthetic */ TaggedDecoder<Tag> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // bk.a
            public final T invoke() {
                if (!this.this$0.E()) {
                    return (T) this.this$0.g();
                }
                return (T) this.this$0.I((xk.a<? extends T>) aVar2, t10);
            }
        });
    }

    @Override // al.c
    public final char q(a aVar, int i10) {
        p.j(aVar, "descriptor");
        return L(V(aVar, i10));
    }

    @Override // al.e
    public final int s(a aVar) {
        p.j(aVar, "enumDescriptor");
        return N(W(), aVar);
    }

    @Override // al.c
    public final <T> T v(a aVar, int i10, final xk.a<? extends T> aVar2, final T t10) {
        p.j(aVar, "descriptor");
        p.j(aVar2, "deserializer");
        return (T) Y(V(aVar, i10), new bk.a<T>(this) { // from class: kotlinx.serialization.internal.TaggedDecoder$decodeSerializableElement$1
            public final /* synthetic */ TaggedDecoder<Tag> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // bk.a
            public final T invoke() {
                return (T) this.this$0.I((xk.a<? extends T>) aVar2, t10);
            }
        });
    }

    @Override // al.e
    public e y(a aVar) {
        p.j(aVar, "descriptor");
        return P(W(), aVar);
    }

    @Override // al.e
    public final boolean B() {
        return J(W());
    }

    @Override // al.e
    public final byte H() {
        return K(W());
    }

    public final <E> E Y(Tag tag, bk.a<? extends E> aVar) {
        X(tag);
        E eInvoke = aVar.invoke();
        if (!this.f63279b) {
            W();
        }
        this.f63279b = false;
        return eInvoke;
    }

    @Override // al.e
    public final long h() {
        return R(W());
    }

    @Override // al.c
    public boolean j() {
        return c.a.b(this);
    }

    @Override // al.e
    public final short l() {
        return S(W());
    }

    @Override // al.e
    public final double m() {
        return M(W());
    }

    @Override // al.e
    public final char n() {
        return L(W());
    }

    @Override // al.e
    public final String o() {
        return T(W());
    }

    @Override // al.e
    public final int u() {
        return Q(W());
    }

    @Override // al.c
    public int w(a aVar) {
        return c.a.a(this, aVar);
    }

    @Override // al.e
    public final float z() {
        return O(W());
    }
}
