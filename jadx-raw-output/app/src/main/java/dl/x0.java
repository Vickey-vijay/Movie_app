package dl;

import com.ironsource.C3426d4;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.internal.JsonNamesMapKt;
import kotlinx.serialization.json.internal.WriteMode;

/* JADX INFO: compiled from: StreamingJsonEncoder.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class x0 extends al.b implements cl.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f52208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl.a f52209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WriteMode f52210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cl.k[] f52211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final el.c f52212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final cl.f f52213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f52214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f52215h;

    /* JADX INFO: compiled from: StreamingJsonEncoder.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public x0(r rVar, cl.a aVar, WriteMode writeMode, cl.k[] kVarArr) {
        ck.p.j(rVar, "composer");
        ck.p.j(aVar, "json");
        ck.p.j(writeMode, C3426d4.a.f28427t);
        this.f52208a = rVar;
        this.f52209b = aVar;
        this.f52210c = writeMode;
        this.f52211d = kVarArr;
        this.f52212e = d().a();
        this.f52213f = d().e();
        int iOrdinal = writeMode.ordinal();
        if (kVarArr != null) {
            cl.k kVar = kVarArr[iOrdinal];
            if (kVar == null && kVar == this) {
                return;
            }
            kVarArr[iOrdinal] = this;
        }
    }

    @Override // al.b, al.f
    public void A() {
        this.f52208a.j("null");
    }

    @Override // al.b, al.d
    public <T> void C(kotlinx.serialization.descriptors.a aVar, int i10, xk.g<? super T> gVar, T t10) {
        ck.p.j(aVar, "descriptor");
        ck.p.j(gVar, "serializer");
        if (t10 != null || this.f52213f.f()) {
            super.C(aVar, i10, gVar, t10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // al.b, al.f
    public <T> void F(xk.g<? super T> gVar, T t10) {
        ck.p.j(gVar, "serializer");
        if (!(gVar instanceof bl.b) || d().e().l()) {
            gVar.serialize(this, t10);
            return;
        }
        bl.b bVar = (bl.b) gVar;
        String strC = s0.c(gVar.getDescriptor(), d());
        ck.p.h(t10, "null cannot be cast to non-null type kotlin.Any");
        xk.g gVarB = xk.d.b(bVar, this, t10);
        s0.f(bVar, gVarB, strC);
        s0.b(gVarB.getDescriptor().getKind());
        this.f52215h = strC;
        gVarB.serialize(this, t10);
    }

    @Override // al.b
    public boolean H(kotlinx.serialization.descriptors.a aVar, int i10) {
        ck.p.j(aVar, "descriptor");
        int i11 = a.$EnumSwitchMapping$0[this.f52210c.ordinal()];
        if (i11 != 1) {
            boolean z10 = false;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (!this.f52208a.a()) {
                        this.f52208a.e(',');
                    }
                    this.f52208a.c();
                    v(JsonNamesMapKt.f(aVar, d(), i10));
                    this.f52208a.e(':');
                    this.f52208a.o();
                } else {
                    if (i10 == 0) {
                        this.f52214g = true;
                    }
                    if (i10 == 1) {
                        this.f52208a.e(',');
                        this.f52208a.o();
                        this.f52214g = false;
                    }
                }
            } else if (this.f52208a.a()) {
                this.f52214g = true;
                this.f52208a.c();
            } else {
                if (i10 % 2 == 0) {
                    this.f52208a.e(',');
                    this.f52208a.c();
                    z10 = true;
                } else {
                    this.f52208a.e(':');
                    this.f52208a.o();
                }
                this.f52214g = z10;
            }
        } else {
            if (!this.f52208a.a()) {
                this.f52208a.e(',');
            }
            this.f52208a.c();
        }
        return true;
    }

    public final void K(kotlinx.serialization.descriptors.a aVar) {
        this.f52208a.c();
        String str = this.f52215h;
        ck.p.g(str);
        v(str);
        this.f52208a.e(':');
        this.f52208a.o();
        v(aVar.h());
    }

    @Override // al.f
    public el.c a() {
        return this.f52212e;
    }

    @Override // al.b, al.f
    public al.d b(kotlinx.serialization.descriptors.a aVar) {
        cl.k kVar;
        ck.p.j(aVar, "descriptor");
        WriteMode writeModeB = c1.b(d(), aVar);
        char c10 = writeModeB.begin;
        if (c10 != 0) {
            this.f52208a.e(c10);
            this.f52208a.b();
        }
        if (this.f52215h != null) {
            K(aVar);
            this.f52215h = null;
        }
        if (this.f52210c == writeModeB) {
            return this;
        }
        cl.k[] kVarArr = this.f52211d;
        return (kVarArr == null || (kVar = kVarArr[writeModeB.ordinal()]) == null) ? new x0(this.f52208a, d(), writeModeB, this.f52211d) : kVar;
    }

    @Override // al.b, al.d
    public void c(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
        if (this.f52210c.end != 0) {
            this.f52208a.p();
            this.f52208a.c();
            this.f52208a.e(this.f52210c.end);
        }
    }

    @Override // cl.k
    public cl.a d() {
        return this.f52209b;
    }

    @Override // al.b, al.f
    public void e(byte b10) {
        if (this.f52214g) {
            v(String.valueOf((int) b10));
        } else {
            this.f52208a.d(b10);
        }
    }

    @Override // al.b, al.f
    public void f(kotlinx.serialization.descriptors.a aVar, int i10) {
        ck.p.j(aVar, "enumDescriptor");
        v(aVar.f(i10));
    }

    @Override // al.b, al.f
    public al.f g(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
        if (y0.b(aVar)) {
            r zVar = this.f52208a;
            if (!(zVar instanceof z)) {
                zVar = new z(zVar.f52190a, this.f52214g);
            }
            return new x0(zVar, d(), this.f52210c, (cl.k[]) null);
        }
        if (!y0.a(aVar)) {
            return super.g(aVar);
        }
        r sVar = this.f52208a;
        if (!(sVar instanceof s)) {
            sVar = new s(sVar.f52190a, this.f52214g);
        }
        return new x0(sVar, d(), this.f52210c, (cl.k[]) null);
    }

    @Override // al.b, al.f
    public void j(short s10) {
        if (this.f52214g) {
            v(String.valueOf((int) s10));
        } else {
            this.f52208a.k(s10);
        }
    }

    @Override // al.b, al.f
    public void k(boolean z10) {
        if (this.f52214g) {
            v(String.valueOf(z10));
        } else {
            this.f52208a.l(z10);
        }
    }

    @Override // al.b, al.f
    public void l(float f10) {
        if (this.f52214g) {
            v(String.valueOf(f10));
        } else {
            this.f52208a.g(f10);
        }
        if (this.f52213f.a()) {
            return;
        }
        if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
            throw f0.b(Float.valueOf(f10), this.f52208a.f52190a.toString());
        }
    }

    @Override // al.b, al.d
    public boolean q(kotlinx.serialization.descriptors.a aVar, int i10) {
        ck.p.j(aVar, "descriptor");
        return this.f52213f.e();
    }

    @Override // cl.k
    public void r(kotlinx.serialization.json.b bVar) {
        ck.p.j(bVar, "element");
        F(JsonElementSerializer.f63284a, bVar);
    }

    @Override // al.b, al.f
    public void s(int i10) {
        if (this.f52214g) {
            v(String.valueOf(i10));
        } else {
            this.f52208a.h(i10);
        }
    }

    @Override // al.b, al.f
    public void v(String str) {
        ck.p.j(str, "value");
        this.f52208a.m(str);
    }

    @Override // al.b, al.f
    public void x(double d10) {
        if (this.f52214g) {
            v(String.valueOf(d10));
        } else {
            this.f52208a.f(d10);
        }
        if (this.f52213f.a()) {
            return;
        }
        if (!((Double.isInfinite(d10) || Double.isNaN(d10)) ? false : true)) {
            throw f0.b(Double.valueOf(d10), this.f52208a.f52190a.toString());
        }
    }

    @Override // al.b, al.f
    public void z(long j10) {
        if (this.f52214g) {
            v(String.valueOf(j10));
        } else {
            this.f52208a.i(j10);
        }
    }

    @Override // al.b, al.f
    public void D(char c10) {
        v(String.valueOf(c10));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x0(r0 r0Var, cl.a aVar, WriteMode writeMode, cl.k[] kVarArr) {
        this(b0.a(r0Var, aVar), aVar, writeMode, kVarArr);
        ck.p.j(r0Var, "output");
        ck.p.j(aVar, "json");
        ck.p.j(writeMode, C3426d4.a.f28427t);
        ck.p.j(kVarArr, "modeReuseCache");
    }
}
