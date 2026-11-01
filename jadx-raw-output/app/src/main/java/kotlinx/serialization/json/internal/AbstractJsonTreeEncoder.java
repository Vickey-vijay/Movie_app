package kotlinx.serialization.json.internal;

import bk.l;
import bl.f1;
import ck.p;
import cl.f;
import cl.k;
import cl.n;
import dl.c1;
import dl.f0;
import dl.i0;
import dl.m0;
import dl.o0;
import dl.q0;
import dl.s0;
import dl.y0;
import el.c;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonNull;
import mj.i;
import mj.m;
import mj.r;
import xk.d;
import xk.g;
import zk.e;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractJsonTreeEncoder extends f1 implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl.a f63290b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<kotlinx.serialization.json.b, r> f63291c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f63292d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f63293e;

    /* JADX INFO: compiled from: TreeJsonEncoder.kt */
    public static final class a extends al.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f63295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlinx.serialization.descriptors.a f63296c;

        public a(String str, kotlinx.serialization.descriptors.a aVar) {
            this.f63295b = str;
            this.f63296c = aVar;
        }

        @Override // al.f
        public c a() {
            return AbstractJsonTreeEncoder.this.d().a();
        }

        @Override // al.b, al.f
        public void v(String str) {
            p.j(str, "value");
            AbstractJsonTreeEncoder.this.v0(this.f63295b, new n(str, false, this.f63296c));
        }
    }

    /* JADX INFO: compiled from: TreeJsonEncoder.kt */
    public static final class b extends al.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f63297a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f63299c;

        public b(String str) {
            this.f63299c = str;
            this.f63297a = AbstractJsonTreeEncoder.this.d().a();
        }

        public final void K(String str) {
            p.j(str, "s");
            AbstractJsonTreeEncoder.this.v0(this.f63299c, new n(str, false, null, 4, null));
        }

        @Override // al.f
        public c a() {
            return this.f63297a;
        }

        @Override // al.b, al.f
        public void e(byte b10) {
            K(i.e(i.b(b10)));
        }

        @Override // al.b, al.f
        public void j(short s10) {
            K(mj.p.e(mj.p.b(s10)));
        }

        @Override // al.b, al.f
        public void s(int i10) {
            K(Long.toString(((long) mj.k.b(i10)) & 4294967295L, 10));
        }

        @Override // al.b, al.f
        public void z(long j10) {
            K(dl.f.a(m.b(j10), 10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractJsonTreeEncoder(cl.a aVar, l<? super kotlinx.serialization.json.b, r> lVar) {
        this.f63290b = aVar;
        this.f63291c = lVar;
        this.f63292d = aVar.e();
    }

    public /* synthetic */ AbstractJsonTreeEncoder(cl.a aVar, l lVar, ck.i iVar) {
        this(aVar, lVar);
    }

    @Override // al.f
    public void E() {
    }

    @Override // bl.f1
    public String a0(String str, String str2) {
        p.j(str, "parentName");
        p.j(str2, "childName");
        return str2;
    }

    public abstract kotlinx.serialization.json.b r0();

    public abstract void v0(String str, kotlinx.serialization.json.b bVar);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bl.e2, al.f
    public <T> void F(g<? super T> gVar, T t10) {
        p.j(gVar, "serializer");
        if (W() == null && TreeJsonEncoderKt.b(c1.a(gVar.getDescriptor(), a()))) {
            new i0(this.f63290b, this.f63291c).F(gVar, t10);
            return;
        }
        if (!(gVar instanceof bl.b) || d().e().l()) {
            gVar.serialize(this, t10);
            return;
        }
        bl.b bVar = (bl.b) gVar;
        String strC = s0.c(gVar.getDescriptor(), d());
        p.h(t10, "null cannot be cast to non-null type kotlin.Any");
        g gVarB = d.b(bVar, this, t10);
        s0.f(bVar, gVarB, strC);
        s0.b(gVarB.getDescriptor().getKind());
        this.f63293e = strC;
        gVarB.serialize(this, t10);
    }

    @Override // bl.e2
    public void U(kotlinx.serialization.descriptors.a aVar) {
        p.j(aVar, "descriptor");
        this.f63291c.invoke(r0());
    }

    @Override // al.f
    public final c a() {
        return this.f63290b.a();
    }

    @Override // al.f
    public al.d b(kotlinx.serialization.descriptors.a aVar) {
        AbstractJsonTreeEncoder m0Var;
        p.j(aVar, "descriptor");
        l<kotlinx.serialization.json.b, r> lVar = W() == null ? this.f63291c : new l<kotlinx.serialization.json.b, r>() { // from class: kotlinx.serialization.json.internal.AbstractJsonTreeEncoder$beginStructure$consumer$1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(kotlinx.serialization.json.b bVar) {
                invoke2(bVar);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(kotlinx.serialization.json.b bVar) {
                p.j(bVar, "node");
                AbstractJsonTreeEncoder abstractJsonTreeEncoder = this.this$0;
                abstractJsonTreeEncoder.v0(abstractJsonTreeEncoder.V(), bVar);
            }
        };
        zk.g kind = aVar.getKind();
        if (p.e(kind, kotlinx.serialization.descriptors.b.C0567b.f63247a) ? true : kind instanceof zk.d) {
            m0Var = new o0(this.f63290b, lVar);
        } else if (p.e(kind, kotlinx.serialization.descriptors.b.c.f63248a)) {
            cl.a aVar2 = this.f63290b;
            kotlinx.serialization.descriptors.a aVarA = c1.a(aVar.d(0), aVar2.a());
            zk.g kind2 = aVarA.getKind();
            if ((kind2 instanceof e) || p.e(kind2, zk.g.b.f86476a)) {
                m0Var = new q0(this.f63290b, lVar);
            } else {
                if (!aVar2.e().b()) {
                    throw f0.d(aVarA);
                }
                m0Var = new o0(this.f63290b, lVar);
            }
        } else {
            m0Var = new m0(this.f63290b, lVar);
        }
        String str = this.f63293e;
        if (str != null) {
            p.g(str);
            m0Var.v0(str, cl.i.c(aVar.h()));
            this.f63293e = null;
        }
        return m0Var;
    }

    @Override // bl.f1
    public String b0(kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(aVar, "descriptor");
        return JsonNamesMapKt.f(aVar, this.f63290b, i10);
    }

    @Override // cl.k
    public final cl.a d() {
        return this.f63290b;
    }

    @Override // bl.e2
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void J(String str, boolean z10) {
        p.j(str, "tag");
        v0(str, cl.i.a(Boolean.valueOf(z10)));
    }

    @Override // bl.e2, al.f
    public al.f g(kotlinx.serialization.descriptors.a aVar) {
        p.j(aVar, "descriptor");
        return W() != null ? super.g(aVar) : new i0(this.f63290b, this.f63291c).g(aVar);
    }

    @Override // bl.e2
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void K(String str, byte b10) {
        p.j(str, "tag");
        v0(str, cl.i.b(Byte.valueOf(b10)));
    }

    @Override // bl.e2
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void L(String str, char c10) {
        p.j(str, "tag");
        v0(str, cl.i.c(String.valueOf(c10)));
    }

    @Override // bl.e2
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void M(String str, double d10) {
        p.j(str, "tag");
        v0(str, cl.i.b(Double.valueOf(d10)));
        if (this.f63292d.a()) {
            return;
        }
        if (!((Double.isInfinite(d10) || Double.isNaN(d10)) ? false : true)) {
            throw f0.c(Double.valueOf(d10), str, r0().toString());
        }
    }

    @Override // bl.e2
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void N(String str, kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(str, "tag");
        p.j(aVar, "enumDescriptor");
        v0(str, cl.i.c(aVar.f(i10)));
    }

    @Override // bl.e2
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void O(String str, float f10) {
        p.j(str, "tag");
        v0(str, cl.i.b(Float.valueOf(f10)));
        if (this.f63292d.a()) {
            return;
        }
        if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
            throw f0.c(Float.valueOf(f10), str, r0().toString());
        }
    }

    @Override // bl.e2
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public al.f P(String str, kotlinx.serialization.descriptors.a aVar) {
        p.j(str, "tag");
        p.j(aVar, "inlineDescriptor");
        if (y0.b(aVar)) {
            return u0(str);
        }
        return y0.a(aVar) ? t0(str, aVar) : super.P(str, aVar);
    }

    @Override // bl.e2
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public void Q(String str, int i10) {
        p.j(str, "tag");
        v0(str, cl.i.b(Integer.valueOf(i10)));
    }

    @Override // bl.e2
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void R(String str, long j10) {
        p.j(str, "tag");
        v0(str, cl.i.b(Long.valueOf(j10)));
    }

    public void o0(String str) {
        p.j(str, "tag");
        v0(str, JsonNull.INSTANCE);
    }

    @Override // bl.e2
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void S(String str, short s10) {
        p.j(str, "tag");
        v0(str, cl.i.b(Short.valueOf(s10)));
    }

    @Override // al.d
    public boolean q(kotlinx.serialization.descriptors.a aVar, int i10) {
        p.j(aVar, "descriptor");
        return this.f63292d.e();
    }

    @Override // bl.e2
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void T(String str, String str2) {
        p.j(str, "tag");
        p.j(str2, "value");
        v0(str, cl.i.c(str2));
    }

    @Override // cl.k
    public void r(kotlinx.serialization.json.b bVar) {
        p.j(bVar, "element");
        F(JsonElementSerializer.f63284a, bVar);
    }

    public final l<kotlinx.serialization.json.b, r> s0() {
        return this.f63291c;
    }

    public final a t0(String str, kotlinx.serialization.descriptors.a aVar) {
        return new a(str, aVar);
    }

    public final b u0(String str) {
        return new b(str);
    }

    @Override // al.f
    public void A() {
        String strW = W();
        if (strW == null) {
            this.f63291c.invoke(JsonNull.INSTANCE);
        } else {
            o0(strW);
        }
    }
}
