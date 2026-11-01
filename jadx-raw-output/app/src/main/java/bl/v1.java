package bl;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<jk.c<? extends Object>, xk.b<? extends Object>> f5476a = kotlin.collections.a.m(mj.h.a(ck.s.b(String.class), yk.a.C(ck.w.f6066a)), mj.h.a(ck.s.b(Character.TYPE), yk.a.w(ck.e.f6047a)), mj.h.a(ck.s.b(char[].class), yk.a.d()), mj.h.a(ck.s.b(Double.TYPE), yk.a.x(ck.j.f6056a)), mj.h.a(ck.s.b(double[].class), yk.a.e()), mj.h.a(ck.s.b(Float.TYPE), yk.a.y(ck.k.f6057a)), mj.h.a(ck.s.b(float[].class), yk.a.f()), mj.h.a(ck.s.b(Long.TYPE), yk.a.A(ck.q.f6059a)), mj.h.a(ck.s.b(long[].class), yk.a.i()), mj.h.a(ck.s.b(mj.m.class), yk.a.F(mj.m.f64551c)), mj.h.a(ck.s.b(mj.n.class), yk.a.r()), mj.h.a(ck.s.b(Integer.TYPE), yk.a.z(ck.o.f6058a)), mj.h.a(ck.s.b(int[].class), yk.a.g()), mj.h.a(ck.s.b(mj.k.class), yk.a.E(mj.k.f64546c)), mj.h.a(ck.s.b(mj.l.class), yk.a.q()), mj.h.a(ck.s.b(Short.TYPE), yk.a.B(ck.u.f6064a)), mj.h.a(ck.s.b(short[].class), yk.a.n()), mj.h.a(ck.s.b(mj.p.class), yk.a.G(mj.p.f64557c)), mj.h.a(ck.s.b(mj.q.class), yk.a.s()), mj.h.a(ck.s.b(Byte.TYPE), yk.a.v(ck.d.f6046a)), mj.h.a(ck.s.b(byte[].class), yk.a.c()), mj.h.a(ck.s.b(mj.i.class), yk.a.D(mj.i.f64541c)), mj.h.a(ck.s.b(mj.j.class), yk.a.p()), mj.h.a(ck.s.b(Boolean.TYPE), yk.a.u(ck.c.f6045a)), mj.h.a(ck.s.b(boolean[].class), yk.a.b()), mj.h.a(ck.s.b(mj.r.class), yk.a.H(mj.r.f64562a)), mj.h.a(ck.s.b(Void.class), yk.a.l()), mj.h.a(ck.s.b(mk.b.class), yk.a.I(mk.b.f64563c)));

    public static final kotlinx.serialization.descriptors.a a(String str, zk.e eVar) {
        ck.p.j(str, "serialName");
        ck.p.j(eVar, "kind");
        d(str);
        return new u1(str, eVar);
    }

    public static final <T> xk.b<T> b(jk.c<T> cVar) {
        ck.p.j(cVar, "<this>");
        return (xk.b) f5476a.get(cVar);
    }

    public static final void d(String str) {
        Iterator<jk.c<? extends Object>> it = f5476a.keySet().iterator();
        while (it.hasNext()) {
            String strI = it.next().i();
            ck.p.g(strI);
            String strC = c(strI);
            if (lk.x.E(str, "kotlin." + strC, true) || lk.x.E(str, strC, true)) {
                throw new IllegalArgumentException(lk.q.j("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exist " + c(strC) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }

    public static final String c(String str) {
        boolean z10;
        String strValueOf;
        if (str.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            StringBuilder sb2 = new StringBuilder();
            char cCharAt = str.charAt(0);
            if (Character.isLowerCase(cCharAt)) {
                strValueOf = lk.b.i(cCharAt);
            } else {
                strValueOf = String.valueOf(cCharAt);
            }
            sb2.append((Object) strValueOf);
            String strSubstring = str.substring(1);
            ck.p.i(strSubstring, "this as java.lang.String).substring(startIndex)");
            sb2.append(strSubstring);
            return sb2.toString();
        }
        return str;
    }
}
