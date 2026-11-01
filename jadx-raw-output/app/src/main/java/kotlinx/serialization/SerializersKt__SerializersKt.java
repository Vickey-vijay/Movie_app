package kotlinx.serialization;

import bk.a;
import bl.f;
import bl.i0;
import bl.k0;
import bl.m1;
import bl.n1;
import bl.u0;
import bl.v1;
import bl.w0;
import ck.p;
import ck.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jk.c;
import jk.e;
import jk.n;
import jk.o;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import nj.t;
import xk.b;
import xk.h;

/* JADX INFO: compiled from: Serializers.kt */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class SerializersKt__SerializersKt {
    public static final b<? extends Object> b(c<Object> cVar, List<? extends b<Object>> list) {
        b[] bVarArr = (b[]) list.toArray(new b[0]);
        return m1.d(cVar, (b[]) Arrays.copyOf(bVarArr, bVarArr.length));
    }

    public static final b<? extends Object> a(c<Object> cVar, List<? extends b<Object>> list, a<? extends e> aVar) {
        if (p.e(cVar, s.b(Collection.class)) ? true : p.e(cVar, s.b(List.class)) ? true : p.e(cVar, s.b(List.class)) ? true : p.e(cVar, s.b(ArrayList.class))) {
            return new f(list.get(0));
        }
        if (p.e(cVar, s.b(HashSet.class))) {
            return new k0(list.get(0));
        }
        if (p.e(cVar, s.b(Set.class)) ? true : p.e(cVar, s.b(Set.class)) ? true : p.e(cVar, s.b(LinkedHashSet.class))) {
            return new w0(list.get(0));
        }
        if (p.e(cVar, s.b(HashMap.class))) {
            return new i0(list.get(0), list.get(1));
        }
        if (p.e(cVar, s.b(Map.class)) ? true : p.e(cVar, s.b(Map.class)) ? true : p.e(cVar, s.b(LinkedHashMap.class))) {
            return new u0(list.get(0), list.get(1));
        }
        if (p.e(cVar, s.b(Map.Entry.class))) {
            return yk.a.j(list.get(0), list.get(1));
        }
        if (p.e(cVar, s.b(Pair.class))) {
            return yk.a.m(list.get(0), list.get(1));
        }
        if (p.e(cVar, s.b(Triple.class))) {
            return yk.a.o(list.get(0), list.get(1), list.get(2));
        }
        if (!m1.k(cVar)) {
            return null;
        }
        e eVarInvoke = aVar.invoke();
        p.h(eVarInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return yk.a.a((c) eVarInvoke, list.get(0));
    }

    public static final <T> b<T> c(b<T> bVar, boolean z10) {
        if (z10) {
            return yk.a.t(bVar);
        }
        p.h(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return bVar;
    }

    public static final b<? extends Object> d(c<Object> cVar, List<? extends b<Object>> list, a<? extends e> aVar) {
        p.j(cVar, "<this>");
        p.j(list, "serializers");
        p.j(aVar, "elementClassifierIfArray");
        b<? extends Object> bVarA = a(cVar, list, aVar);
        return bVarA == null ? b(cVar, list) : bVarA;
    }

    public static final b<Object> e(el.c cVar, n nVar) {
        p.j(cVar, "<this>");
        p.j(nVar, "type");
        b<Object> bVarF = f(cVar, nVar, true);
        if (bVarF != null) {
            return bVarF;
        }
        m1.l(n1.c(nVar));
        throw new KotlinNothingValueException();
    }

    public static final b<Object> g(el.c cVar, n nVar) {
        p.j(cVar, "<this>");
        p.j(nVar, "type");
        return f(cVar, nVar, false);
    }

    public static final <T> b<T> h(c<T> cVar) {
        p.j(cVar, "<this>");
        b<T> bVarB = m1.b(cVar);
        return bVarB == null ? v1.b(cVar) : bVarB;
    }

    public static final List<b<Object>> i(el.c cVar, List<? extends n> list, boolean z10) {
        ArrayList arrayList;
        p.j(cVar, "<this>");
        p.j(list, "typeArguments");
        if (z10) {
            arrayList = new ArrayList(t.v(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(h.b(cVar, (n) it.next()));
            }
        } else {
            arrayList = new ArrayList(t.v(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                b<Object> bVarC = h.c(cVar, (n) it2.next());
                if (bVarC == null) {
                    return null;
                }
                arrayList.add(bVarC);
            }
        }
        return arrayList;
    }

    public static final b<Object> f(el.c cVar, n nVar, boolean z10) {
        b<Object> bVarA;
        b<? extends Object> bVarB;
        c<Object> cVarC = n1.c(nVar);
        boolean zG = nVar.g();
        List<o> arguments = nVar.getArguments();
        final ArrayList arrayList = new ArrayList(t.v(arguments, 10));
        Iterator<T> it = arguments.iterator();
        while (it.hasNext()) {
            n type = ((o) it.next()).getType();
            if (type != null) {
                arrayList.add(type);
            } else {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + nVar).toString());
            }
        }
        if (arrayList.isEmpty()) {
            bVarA = SerializersCacheKt.a(cVarC, zG);
        } else {
            Object objB = SerializersCacheKt.b(cVarC, arrayList, zG);
            if (z10) {
                if (Result.m3463isFailureimpl(objB)) {
                    objB = null;
                }
                bVarA = (b) objB;
            } else {
                if (Result.m3461exceptionOrNullimpl(objB) != null) {
                    return null;
                }
                bVarA = (b) objB;
            }
        }
        if (bVarA != null) {
            return bVarA;
        }
        if (arrayList.isEmpty()) {
            bVarB = el.c.c(cVar, cVarC, null, 2, null);
        } else {
            List<b<Object>> listE = h.e(cVar, arrayList, z10);
            if (listE == null) {
                return null;
            }
            b<? extends Object> bVarA2 = h.a(cVarC, listE, new a<e>() { // from class: kotlinx.serialization.SerializersKt__SerializersKt$serializerByKTypeImpl$contextualSerializer$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                @Override // bk.a
                public final e invoke() {
                    return arrayList.get(0).h();
                }
            });
            if (bVarA2 == null) {
                bVarB = cVar.b(cVarC, listE);
            } else {
                bVarB = bVarA2;
            }
        }
        if (bVarB == null) {
            return null;
        }
        return c(bVarB, zG);
    }
}
