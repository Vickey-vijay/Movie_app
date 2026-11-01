package ck;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;
import nj.b0;

/* JADX INFO: compiled from: TypeReference.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class z implements jk.n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f6068f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk.e f6069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<jk.o> f6070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final jk.n f6071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6072e;

    /* JADX INFO: compiled from: TypeReference.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: TypeReference.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public z(jk.e eVar, List<jk.o> list, jk.n nVar, int i10) {
        p.j(eVar, "classifier");
        p.j(list, "arguments");
        this.f6069b = eVar;
        this.f6070c = list;
        this.f6071d = nVar;
        this.f6072e = i10;
    }

    public static final CharSequence f(z zVar, jk.o oVar) {
        p.j(oVar, "it");
        return zVar.b(oVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (p.e(h(), zVar.h()) && p.e(getArguments(), zVar.getArguments()) && p.e(this.f6071d, zVar.f6071d) && this.f6072e == zVar.f6072e) {
                return true;
            }
        }
        return false;
    }

    @Override // jk.n
    public boolean g() {
        return (this.f6072e & 1) != 0;
    }

    @Override // jk.n
    public List<jk.o> getArguments() {
        return this.f6070c;
    }

    @Override // jk.n
    public jk.e h() {
        return this.f6069b;
    }

    public final String j(Class<?> cls) {
        if (p.e(cls, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if (p.e(cls, char[].class)) {
            return "kotlin.CharArray";
        }
        if (p.e(cls, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if (p.e(cls, short[].class)) {
            return "kotlin.ShortArray";
        }
        if (p.e(cls, int[].class)) {
            return "kotlin.IntArray";
        }
        if (p.e(cls, float[].class)) {
            return "kotlin.FloatArray";
        }
        if (p.e(cls, long[].class)) {
            return "kotlin.LongArray";
        }
        return p.e(cls, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    public final int k() {
        return this.f6072e;
    }

    public final jk.n l() {
        return this.f6071d;
    }

    public String toString() {
        return c(false) + " (Kotlin reflection is not available)";
    }

    public final String b(jk.o oVar) {
        z zVar;
        String strValueOf;
        int i10;
        if (oVar.a() == null) {
            return "*";
        }
        jk.n type = oVar.getType();
        if (type instanceof z) {
            zVar = (z) type;
        } else {
            zVar = null;
        }
        if (zVar == null || (strValueOf = zVar.c(true)) == null) {
            strValueOf = String.valueOf(oVar.getType());
        }
        KVariance kVarianceA = oVar.a();
        if (kVarianceA == null) {
            i10 = -1;
        } else {
            i10 = b.$EnumSwitchMapping$0[kVarianceA.ordinal()];
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return "out " + strValueOf;
                }
                throw new NoWhenBranchMatchedException();
            }
            return "in " + strValueOf;
        }
        return strValueOf;
    }

    public final String c(boolean z10) {
        jk.c cVar;
        String name;
        String strP0;
        jk.e eVarH = h();
        Class<?> clsA = null;
        if (eVarH instanceof jk.c) {
            cVar = (jk.c) eVarH;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            clsA = ak.a.a(cVar);
        }
        if (clsA == null) {
            name = h().toString();
        } else if ((this.f6072e & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (clsA.isArray()) {
            name = j(clsA);
        } else if (z10 && clsA.isPrimitive()) {
            jk.e eVarH2 = h();
            p.h(eVarH2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = ak.a.b((jk.c) eVarH2).getName();
        } else {
            name = clsA.getName();
        }
        String str = "";
        if (getArguments().isEmpty()) {
            strP0 = "";
        } else {
            strP0 = b0.p0(getArguments(), ", ", "<", ">", 0, null, new bk.l() { // from class: ck.y
                @Override // bk.l
                public final Object invoke(Object obj) {
                    return z.f(this.f6067b, (jk.o) obj);
                }
            }, 24, null);
        }
        if (g()) {
            str = "?";
        }
        String str2 = name + strP0 + str;
        jk.n nVar = this.f6071d;
        if (nVar instanceof z) {
            String strC = ((z) nVar).c(true);
            if (!p.e(strC, str2)) {
                if (p.e(strC, str2 + '?')) {
                    return str2 + '!';
                }
                return '(' + str2 + ".." + strC + ')';
            }
            return str2;
        }
        return str2;
    }

    public int hashCode() {
        return (((h().hashCode() * 31) + getArguments().hashCode()) * 31) + Integer.hashCode(this.f6072e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z(jk.e eVar, List<jk.o> list, boolean z10) {
        this(eVar, list, null, z10 ? 1 : 0);
        p.j(eVar, "classifier");
        p.j(list, "arguments");
    }
}
