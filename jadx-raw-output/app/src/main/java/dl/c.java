package dl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import bl.e1;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.JsonNamesMapKt;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends e1 implements cl.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cl.a f52141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final kotlinx.serialization.json.b f52142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final cl.f f52143e;

    public c(cl.a aVar, kotlinx.serialization.json.b bVar) {
        this.f52141c = aVar;
        this.f52142d = bVar;
        this.f52143e = d().e();
    }

    public /* synthetic */ c(cl.a aVar, kotlinx.serialization.json.b bVar, ck.i iVar) {
        this(aVar, bVar);
    }

    @Override // bl.e1
    public String Z(String str, String str2) {
        ck.p.j(str, "parentName");
        ck.p.j(str2, "childName");
        return str2;
    }

    @Override // al.c
    public void c(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
    }

    public abstract kotlinx.serialization.json.b e0(String str);

    public abstract kotlinx.serialization.json.b s0();

    @Override // al.e
    public al.c b(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
        kotlinx.serialization.json.b bVarF0 = f0();
        zk.g kind = aVar.getKind();
        if (ck.p.e(kind, kotlinx.serialization.descriptors.b.C0567b.f63247a) ? true : kind instanceof zk.d) {
            cl.a aVarD = d();
            if (bVarF0 instanceof kotlinx.serialization.json.a) {
                return new n0(aVarD, (kotlinx.serialization.json.a) bVarF0);
            }
            throw f0.e(-1, "Expected " + ck.s.b(kotlinx.serialization.json.a.class) + " as the serialized body of " + aVar.h() + ", but had " + ck.s.b(bVarF0.getClass()));
        }
        if (!ck.p.e(kind, kotlinx.serialization.descriptors.b.c.f63248a)) {
            cl.a aVarD2 = d();
            if (bVarF0 instanceof JsonObject) {
                return new kotlinx.serialization.json.internal.b(aVarD2, (JsonObject) bVarF0, null, null, 12, null);
            }
            throw f0.e(-1, "Expected " + ck.s.b(JsonObject.class) + " as the serialized body of " + aVar.h() + ", but had " + ck.s.b(bVarF0.getClass()));
        }
        cl.a aVarD3 = d();
        kotlinx.serialization.descriptors.a aVarA = c1.a(aVar.d(0), aVarD3.a());
        zk.g kind2 = aVarA.getKind();
        if ((kind2 instanceof zk.e) || ck.p.e(kind2, zk.g.b.f86476a)) {
            cl.a aVarD4 = d();
            if (bVarF0 instanceof JsonObject) {
                return new p0(aVarD4, (JsonObject) bVarF0);
            }
            throw f0.e(-1, "Expected " + ck.s.b(JsonObject.class) + " as the serialized body of " + aVar.h() + ", but had " + ck.s.b(bVarF0.getClass()));
        }
        if (!aVarD3.e().b()) {
            throw f0.d(aVarA);
        }
        cl.a aVarD5 = d();
        if (bVarF0 instanceof kotlinx.serialization.json.a) {
            return new n0(aVarD5, (kotlinx.serialization.json.a) bVarF0);
        }
        throw f0.e(-1, "Expected " + ck.s.b(kotlinx.serialization.json.a.class) + " as the serialized body of " + aVar.h() + ", but had " + ck.s.b(bVarF0.getClass()));
    }

    @Override // cl.g
    public cl.a d() {
        return this.f52141c;
    }

    public final cl.n d0(kotlinx.serialization.json.c cVar, String str) {
        cl.n nVar = cVar instanceof cl.n ? (cl.n) cVar : null;
        if (nVar != null) {
            return nVar;
        }
        throw f0.e(-1, "Unexpected 'null' when " + str + " was expected");
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public boolean J(String str) {
        ck.p.j(str, "tag");
        kotlinx.serialization.json.c cVarR0 = r0(str);
        if (!d().e().m() && d0(cVarR0, TypedValues.Custom.S_BOOLEAN).g()) {
            throw f0.f(-1, "Boolean literal for key '" + str + "' should be unquoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", f0().toString());
        }
        try {
            Boolean boolE = cl.i.e(cVarR0);
            if (boolE != null) {
                return boolE.booleanValue();
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException unused) {
            t0(TypedValues.Custom.S_BOOLEAN);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public byte K(String str) {
        ck.p.j(str, "tag");
        try {
            int iJ = cl.i.j(r0(str));
            boolean z10 = false;
            if (-128 <= iJ && iJ <= 127) {
                z10 = true;
            }
            Byte bValueOf = z10 ? Byte.valueOf((byte) iJ) : null;
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            t0("byte");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            t0("byte");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public char L(String str) {
        ck.p.j(str, "tag");
        try {
            return lk.c0.w1(r0(str).e());
        } catch (IllegalArgumentException unused) {
            t0("char");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public double M(String str) {
        ck.p.j(str, "tag");
        try {
            double dG = cl.i.g(r0(str));
            if (!d().e().a()) {
                if (!((Double.isInfinite(dG) || Double.isNaN(dG)) ? false : true)) {
                    throw f0.a(Double.valueOf(dG), str, f0().toString());
                }
            }
            return dG;
        } catch (IllegalArgumentException unused) {
            t0("double");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public int N(String str, kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(str, "tag");
        ck.p.j(aVar, "enumDescriptor");
        return JsonNamesMapKt.j(aVar, d(), r0(str).e(), null, 4, null);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public float O(String str) {
        ck.p.j(str, "tag");
        try {
            float fI = cl.i.i(r0(str));
            if (!d().e().a()) {
                if (!((Float.isInfinite(fI) || Float.isNaN(fI)) ? false : true)) {
                    throw f0.a(Float.valueOf(fI), str, f0().toString());
                }
            }
            return fI;
        } catch (IllegalArgumentException unused) {
            t0(TypedValues.Custom.S_FLOAT);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public al.e P(String str, kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(str, "tag");
        ck.p.j(aVar, "inlineDescriptor");
        return y0.b(aVar) ? new e0(new z0(r0(str).e()), d()) : super.P(str, aVar);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public int Q(String str) {
        ck.p.j(str, "tag");
        try {
            return cl.i.j(r0(str));
        } catch (IllegalArgumentException unused) {
            t0(ImpressionLog.f43647w);
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public long R(String str) {
        ck.p.j(str, "tag");
        try {
            return cl.i.n(r0(str));
        } catch (IllegalArgumentException unused) {
            t0("long");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public short S(String str) {
        ck.p.j(str, "tag");
        try {
            int iJ = cl.i.j(r0(str));
            boolean z10 = false;
            if (-32768 <= iJ && iJ <= 32767) {
                z10 = true;
            }
            Short shValueOf = z10 ? Short.valueOf((short) iJ) : null;
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            t0("short");
            throw new KotlinNothingValueException();
        } catch (IllegalArgumentException unused) {
            t0("short");
            throw new KotlinNothingValueException();
        }
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public String T(String str) {
        ck.p.j(str, "tag");
        kotlinx.serialization.json.c cVarR0 = r0(str);
        if (d().e().m() || d0(cVarR0, TypedValues.Custom.S_STRING).g()) {
            if (cVarR0 instanceof JsonNull) {
                throw f0.f(-1, "Unexpected 'null' value instead of string literal", f0().toString());
            }
            return cVarR0.e();
        }
        throw f0.f(-1, "String literal for key '" + str + "' should be quoted.\nUse 'isLenient = true' in 'Json {}` builder to accept non-compliant JSON.", f0().toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, al.e
    public <T> T r(xk.a<? extends T> aVar) {
        ck.p.j(aVar, "deserializer");
        return (T) s0.d(this, aVar);
    }

    public final kotlinx.serialization.json.c r0(String str) {
        ck.p.j(str, "tag");
        kotlinx.serialization.json.b bVarE0 = e0(str);
        kotlinx.serialization.json.c cVar = bVarE0 instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVarE0 : null;
        if (cVar != null) {
            return cVar;
        }
        throw f0.f(-1, "Expected JsonPrimitive at " + str + ", found " + bVarE0, f0().toString());
    }

    public final Void t0(String str) {
        throw f0.f(-1, "Failed to parse '" + str + '\'', f0().toString());
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, al.e
    public al.e y(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "descriptor");
        return U() != null ? super.y(aVar) : new h0(d(), s0()).y(aVar);
    }

    @Override // kotlinx.serialization.internal.TaggedDecoder, al.e
    public boolean E() {
        return !(f0() instanceof JsonNull);
    }

    @Override // al.e, al.c
    public el.c a() {
        return d().a();
    }

    public final kotlinx.serialization.json.b f0() {
        kotlinx.serialization.json.b bVarE0;
        String strU = U();
        if (strU == null || (bVarE0 = e0(strU)) == null) {
            return s0();
        }
        return bVarE0;
    }

    @Override // cl.g
    public kotlinx.serialization.json.b t() {
        return f0();
    }
}
