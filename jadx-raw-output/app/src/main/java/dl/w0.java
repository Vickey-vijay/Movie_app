package dl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.ironsource.C3426d4;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.json.internal.JsonElementMarker;
import kotlinx.serialization.json.internal.JsonNamesMapKt;
import kotlinx.serialization.json.internal.JsonTreeReader;
import kotlinx.serialization.json.internal.WriteMode;

/* JADX INFO: compiled from: StreamingJsonDecoder.kt */
/* JADX INFO: loaded from: classes9.dex */
public class w0 extends al.a implements cl.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cl.a f52199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WriteMode f52200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dl.a f52201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final el.c f52202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f52204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cl.f f52205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JsonElementMarker f52206h;

    /* JADX INFO: compiled from: StreamingJsonDecoder.kt */
    public /* synthetic */ class b {
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
            try {
                iArr[WriteMode.OBJ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final boolean S(a aVar, String str) {
        if (aVar == null || !ck.p.e(aVar.f52207a, str)) {
            return false;
        }
        aVar.f52207a = null;
        return true;
    }

    @Override // al.a, al.e
    public Void g() {
        return null;
    }

    /* JADX INFO: compiled from: StreamingJsonDecoder.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f52207a;

        public a(String str) {
            this.f52207a = str;
        }
    }

    public w0(cl.a aVar, WriteMode writeMode, dl.a aVar2, kotlinx.serialization.descriptors.a aVar3, a aVar4) {
        ck.p.j(aVar, "json");
        ck.p.j(writeMode, C3426d4.a.f28427t);
        ck.p.j(aVar2, "lexer");
        ck.p.j(aVar3, "descriptor");
        this.f52199a = aVar;
        this.f52200b = writeMode;
        this.f52201c = aVar2;
        this.f52202d = aVar.a();
        this.f52203e = -1;
        this.f52204f = aVar4;
        cl.f fVarE = aVar.e();
        this.f52205g = fVarE;
        this.f52206h = fVarE.f() ? null : new JsonElementMarker(aVar3);
    }

    @Override // al.a, al.e
    public boolean B() {
        return this.f52205g.m() ? this.f52201c.i() : this.f52201c.g();
    }

    @Override // al.a, al.e
    public boolean E() {
        JsonElementMarker jsonElementMarker = this.f52206h;
        return ((jsonElementMarker != null ? jsonElementMarker.b() : false) || dl.a.O(this.f52201c, false, 1, null)) ? false : true;
    }

    @Override // al.a, al.e
    public byte H() {
        long jP = this.f52201c.p();
        byte b10 = (byte) jP;
        if (jP == b10) {
            return b10;
        }
        dl.a.y(this.f52201c, "Failed to parse byte for input '" + jP + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final void K() {
        if (this.f52201c.F() != 4) {
            return;
        }
        dl.a.y(this.f52201c, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final boolean L(kotlinx.serialization.descriptors.a aVar, int i10) {
        String strG;
        cl.a aVar2 = this.f52199a;
        kotlinx.serialization.descriptors.a aVarD = aVar.d(i10);
        if (!aVarD.b() && this.f52201c.N(true)) {
            return true;
        }
        if (!ck.p.e(aVarD.getKind(), zk.g.b.f86476a) || ((aVarD.b() && this.f52201c.N(false)) || (strG = this.f52201c.G(this.f52205g.m())) == null || JsonNamesMapKt.g(aVarD, aVar2, strG) != -3)) {
            return false;
        }
        this.f52201c.q();
        return true;
    }

    public final int M() {
        boolean zM = this.f52201c.M();
        if (!this.f52201c.f()) {
            if (!zM) {
                return -1;
            }
            dl.a.y(this.f52201c, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i10 = this.f52203e;
        if (i10 != -1 && !zM) {
            dl.a.y(this.f52201c, "Expected end of the array or comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        int i11 = i10 + 1;
        this.f52203e = i11;
        return i11;
    }

    public final int N() {
        int i10 = this.f52203e;
        boolean zM = false;
        boolean z10 = i10 % 2 != 0;
        if (!z10) {
            this.f52201c.o(':');
        } else if (i10 != -1) {
            zM = this.f52201c.M();
        }
        if (!this.f52201c.f()) {
            if (!zM) {
                return -1;
            }
            dl.a.y(this.f52201c, "Expected '}', but had ',' instead", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        if (z10) {
            if (this.f52203e == -1) {
                dl.a aVar = this.f52201c;
                boolean z11 = !zM;
                int i11 = aVar.f52133a;
                if (!z11) {
                    dl.a.y(aVar, "Unexpected trailing comma", i11, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                dl.a aVar2 = this.f52201c;
                int i12 = aVar2.f52133a;
                if (!zM) {
                    dl.a.y(aVar2, "Expected comma after the key-value pair", i12, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            }
        }
        int i13 = this.f52203e + 1;
        this.f52203e = i13;
        return i13;
    }

    public final int O(kotlinx.serialization.descriptors.a aVar) {
        boolean zM;
        boolean zM2 = this.f52201c.M();
        while (this.f52201c.f()) {
            String strP = P();
            this.f52201c.o(':');
            int iG = JsonNamesMapKt.g(aVar, this.f52199a, strP);
            boolean z10 = false;
            if (iG == -3) {
                z10 = true;
                zM = false;
            } else {
                if (!this.f52205g.d() || !L(aVar, iG)) {
                    JsonElementMarker jsonElementMarker = this.f52206h;
                    if (jsonElementMarker != null) {
                        jsonElementMarker.c(iG);
                    }
                    return iG;
                }
                zM = this.f52201c.M();
            }
            zM2 = z10 ? Q(strP) : zM;
        }
        if (zM2) {
            dl.a.y(this.f52201c, "Unexpected trailing comma", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        JsonElementMarker jsonElementMarker2 = this.f52206h;
        if (jsonElementMarker2 != null) {
            return jsonElementMarker2.d();
        }
        return -1;
    }

    public final String P() {
        return this.f52205g.m() ? this.f52201c.t() : this.f52201c.k();
    }

    public final boolean Q(String str) {
        if (this.f52205g.g() || S(this.f52204f, str)) {
            this.f52201c.I(this.f52205g.m());
        } else {
            this.f52201c.A(str);
        }
        return this.f52201c.M();
    }

    @Override // al.e, al.c
    public el.c a() {
        return this.f52202d;
    }

    @Override // al.a, al.e
    public al.c b(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
        WriteMode writeModeB = c1.b(this.f52199a, aVar);
        this.f52201c.f52134b.c(aVar);
        this.f52201c.o(writeModeB.begin);
        K();
        int i10 = b.$EnumSwitchMapping$0[writeModeB.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return new w0(this.f52199a, writeModeB, this.f52201c, aVar, this.f52204f);
        }
        return (this.f52200b == writeModeB && this.f52199a.e().f()) ? this : new w0(this.f52199a, writeModeB, this.f52201c, aVar, this.f52204f);
    }

    @Override // al.a, al.c
    public void c(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
        if (this.f52199a.e().g() && aVar.e() == 0) {
            R(aVar);
        }
        this.f52201c.o(this.f52200b.end);
        this.f52201c.f52134b.b();
    }

    @Override // cl.g
    public final cl.a d() {
        return this.f52199a;
    }

    @Override // al.a, al.e
    public long h() {
        return this.f52201c.p();
    }

    @Override // al.a, al.e
    public short l() {
        long jP = this.f52201c.p();
        short s10 = (short) jP;
        if (jP == s10) {
            return s10;
        }
        dl.a.y(this.f52201c, "Failed to parse short for input '" + jP + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // al.a, al.e
    public double m() {
        dl.a aVar = this.f52201c;
        String strS = aVar.s();
        try {
            double d10 = Double.parseDouble(strS);
            if (!this.f52199a.e().a()) {
                if (!((Double.isInfinite(d10) || Double.isNaN(d10)) ? false : true)) {
                    f0.j(this.f52201c, Double.valueOf(d10));
                    throw new KotlinNothingValueException();
                }
            }
            return d10;
        } catch (IllegalArgumentException unused) {
            dl.a.y(aVar, "Failed to parse type 'double' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // al.a, al.e
    public char n() {
        String strS = this.f52201c.s();
        if (strS.length() == 1) {
            return strS.charAt(0);
        }
        dl.a.y(this.f52201c, "Expected single char, but got '" + strS + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    @Override // al.a, al.e
    public String o() {
        return this.f52205g.m() ? this.f52201c.t() : this.f52201c.q();
    }

    @Override // al.a, al.e
    public <T> T r(xk.a<? extends T> aVar) {
        ck.p.j(aVar, "deserializer");
        try {
            if ((aVar instanceof bl.b) && !this.f52199a.e().l()) {
                String strC = s0.c(aVar.getDescriptor(), this.f52199a);
                String strL = this.f52201c.l(strC, this.f52205g.m());
                xk.a<T> aVarC = strL != null ? ((bl.b) aVar).c(this, strL) : null;
                if (aVarC == null) {
                    return (T) s0.d(this, aVar);
                }
                this.f52204f = new a(strC);
                return aVarC.deserialize(this);
            }
            return aVar.deserialize(this);
        } catch (MissingFieldException e10) {
            String message = e10.getMessage();
            ck.p.g(message);
            if (lk.a0.X(message, "at path", false, 2, null)) {
                throw e10;
            }
            throw new MissingFieldException(e10.getMissingFields(), e10.getMessage() + " at path: " + this.f52201c.f52134b.a(), e10);
        }
    }

    @Override // al.a, al.e
    public int s(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "enumDescriptor");
        return JsonNamesMapKt.i(aVar, this.f52199a, o(), " at path " + this.f52201c.f52134b.a());
    }

    @Override // cl.g
    public kotlinx.serialization.json.b t() {
        return new JsonTreeReader(this.f52199a.e(), this.f52201c).e();
    }

    @Override // al.a, al.e
    public int u() {
        long jP = this.f52201c.p();
        int i10 = (int) jP;
        if (jP == i10) {
            return i10;
        }
        dl.a.y(this.f52201c, "Failed to parse int for input '" + jP + '\'', 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // al.a, al.c
    public <T> T v(kotlinx.serialization.descriptors.a aVar, int i10, xk.a<? extends T> aVar2, T t10) {
        ck.p.j(aVar, "descriptor");
        ck.p.j(aVar2, "deserializer");
        boolean z10 = this.f52200b == WriteMode.MAP && (i10 & 1) == 0;
        if (z10) {
            this.f52201c.f52134b.d();
        }
        T t11 = (T) super.v(aVar, i10, aVar2, t10);
        if (z10) {
            this.f52201c.f52134b.f(t11);
        }
        return t11;
    }

    @Override // al.c
    public int x(kotlinx.serialization.descriptors.a aVar) {
        int iN;
        ck.p.j(aVar, "descriptor");
        int i10 = b.$EnumSwitchMapping$0[this.f52200b.ordinal()];
        if (i10 != 2) {
            iN = i10 != 4 ? M() : O(aVar);
        } else {
            iN = N();
        }
        if (this.f52200b != WriteMode.MAP) {
            this.f52201c.f52134b.g(iN);
        }
        return iN;
    }

    @Override // al.a, al.e
    public al.e y(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
        return y0.b(aVar) ? new e0(this.f52201c, this.f52199a) : super.y(aVar);
    }

    @Override // al.a, al.e
    public float z() {
        dl.a aVar = this.f52201c;
        String strS = aVar.s();
        try {
            float f10 = Float.parseFloat(strS);
            if (!this.f52199a.e().a()) {
                if (!((Float.isInfinite(f10) || Float.isNaN(f10)) ? false : true)) {
                    f0.j(this.f52201c, Float.valueOf(f10));
                    throw new KotlinNothingValueException();
                }
            }
            return f10;
        } catch (IllegalArgumentException unused) {
            dl.a.y(aVar, "Failed to parse type '" + TypedValues.Custom.S_FLOAT + "' for input '" + strS + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    public final void R(kotlinx.serialization.descriptors.a aVar) {
        while (x(aVar) != -1) {
        }
    }
}
