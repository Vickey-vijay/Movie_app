package kotlinx.serialization.json.internal;

import cl.p;
import cl.q;
import cl.v;
import com.ironsource.C3426d4;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.SerializationException;
import nj.b0;

/* JADX INFO: compiled from: JsonNamesMap.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class JsonNamesMapKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0569a<Map<String, Integer>> f63302a = new a.C0569a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.C0569a<String[]> f63303b = new a.C0569a<>();

    public static final Map<String, Integer> b(kotlinx.serialization.descriptors.a aVar, cl.a aVar2) {
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        q qVarK = k(aVar, aVar2);
        int iE = aVar.e();
        for (int i10 = 0; i10 < iE; i10++) {
            List<Annotation> listG = aVar.g(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                if (obj instanceof p) {
                    arrayList.add(obj);
                }
            }
            p pVar = (p) b0.E0(arrayList);
            if (pVar != null && (strArrNames = pVar.names()) != null) {
                for (String str : strArrNames) {
                    c(linkedHashMap, aVar, str, i10);
                }
            }
            if (qVarK != null) {
                c(linkedHashMap, aVar, qVarK.a(aVar, i10, aVar.f(i10)), i10);
            }
        }
        return linkedHashMap.isEmpty() ? kotlin.collections.a.j() : linkedHashMap;
    }

    public static final Map<String, Integer> d(final cl.a aVar, final kotlinx.serialization.descriptors.a aVar2) {
        ck.p.j(aVar, "<this>");
        ck.p.j(aVar2, "descriptor");
        return (Map) v.a(aVar).b(aVar2, f63302a, new bk.a<Map<String, ? extends Integer>>() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt$deserializationNamesMap$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public final Map<String, ? extends Integer> invoke() {
                return JsonNamesMapKt.b(aVar2, aVar);
            }
        });
    }

    public static final a.C0569a<Map<String, Integer>> e() {
        return f63302a;
    }

    public static final String f(kotlinx.serialization.descriptors.a aVar, cl.a aVar2, int i10) {
        ck.p.j(aVar, "<this>");
        ck.p.j(aVar2, "json");
        q qVarK = k(aVar, aVar2);
        return qVarK == null ? aVar.f(i10) : l(aVar, aVar2, qVarK)[i10];
    }

    public static final int g(kotlinx.serialization.descriptors.a aVar, cl.a aVar2, String str) {
        ck.p.j(aVar, "<this>");
        ck.p.j(aVar2, "json");
        ck.p.j(str, "name");
        if (k(aVar, aVar2) != null) {
            return h(aVar2, aVar, str);
        }
        int iC = aVar.c(str);
        return (iC == -3 && aVar2.e().k()) ? h(aVar2, aVar, str) : iC;
    }

    public static final int i(kotlinx.serialization.descriptors.a aVar, cl.a aVar2, String str, String str2) {
        ck.p.j(aVar, "<this>");
        ck.p.j(aVar2, "json");
        ck.p.j(str, "name");
        ck.p.j(str2, "suffix");
        int iG = g(aVar, aVar2, str);
        if (iG != -3) {
            return iG;
        }
        throw new SerializationException(aVar.h() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static /* synthetic */ int j(kotlinx.serialization.descriptors.a aVar, cl.a aVar2, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return i(aVar, aVar2, str, str2);
    }

    public static final q k(kotlinx.serialization.descriptors.a aVar, cl.a aVar2) {
        ck.p.j(aVar, "<this>");
        ck.p.j(aVar2, "json");
        if (ck.p.e(aVar.getKind(), kotlinx.serialization.descriptors.b.a.f63246a)) {
            return aVar2.e().h();
        }
        return null;
    }

    public static final String[] l(final kotlinx.serialization.descriptors.a aVar, cl.a aVar2, final q qVar) {
        ck.p.j(aVar, "<this>");
        ck.p.j(aVar2, "json");
        ck.p.j(qVar, C3426d4.f.f28486e);
        return (String[]) v.a(aVar2).b(aVar, f63303b, new bk.a<String[]>() { // from class: kotlinx.serialization.json.internal.JsonNamesMapKt$serializationNamesIndices$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public final String[] invoke() {
                int iE = aVar.e();
                String[] strArr = new String[iE];
                for (int i10 = 0; i10 < iE; i10++) {
                    strArr[i10] = qVar.a(aVar, i10, aVar.f(i10));
                }
                return strArr;
            }
        });
    }

    public static final void c(Map<String, Integer> map, kotlinx.serialization.descriptors.a aVar, String str, int i10) {
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new JsonException("The suggested name '" + str + "' for property " + aVar.f(i10) + " is already one of the names for property " + aVar.f(((Number) kotlin.collections.a.k(map, str)).intValue()) + " in " + aVar);
    }

    public static final int h(cl.a aVar, kotlinx.serialization.descriptors.a aVar2, String str) {
        Integer num = d(aVar, aVar2).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }
}
