package kotlinx.serialization.json.internal;

import bl.q0;
import ck.i;
import ck.p;
import cl.q;
import cl.v;
import dl.c;
import dl.f0;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import nj.r0;
import zk.d;
import zk.g;

/* JADX INFO: compiled from: TreeJsonDecoder.kt */
/* JADX INFO: loaded from: classes3.dex */
public class b extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JsonObject f63309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f63311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f63312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f63313j;

    public /* synthetic */ b(cl.a aVar, JsonObject jsonObject, String str, kotlinx.serialization.descriptors.a aVar2, int i10, i iVar) {
        this(aVar, jsonObject, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : aVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(cl.a aVar, JsonObject jsonObject, String str, kotlinx.serialization.descriptors.a aVar2) {
        super(aVar, jsonObject, null);
        p.j(aVar, "json");
        p.j(jsonObject, "value");
        this.f63309f = jsonObject;
        this.f63310g = str;
        this.f63311h = aVar2;
    }

    @Override // dl.c, kotlinx.serialization.internal.TaggedDecoder, al.e
    public boolean E() {
        return !this.f63313j && super.E();
    }

    @Override // bl.e1
    public String a0(kotlinx.serialization.descriptors.a aVar, int i10) {
        Object next;
        Integer num;
        p.j(aVar, "descriptor");
        q qVarK = JsonNamesMapKt.k(aVar, d());
        String strF = aVar.f(i10);
        if (qVarK == null && (!this.f52143e.k() || s0().keySet().contains(strF))) {
            return strF;
        }
        Map<String, Integer> mapD = JsonNamesMapKt.d(d(), aVar);
        Iterator<T> it = s0().keySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            num = mapD.get((String) next);
        } while (!(num != null && num.intValue() == i10));
        String str = (String) next;
        if (str != null) {
            return str;
        }
        String strA = qVarK != null ? qVarK.a(aVar, i10, strF) : null;
        return strA == null ? strF : strA;
    }

    @Override // dl.c, al.e
    public al.c b(kotlinx.serialization.descriptors.a aVar) {
        p.j(aVar, "descriptor");
        return aVar == this.f63311h ? this : super.b(aVar);
    }

    @Override // dl.c, al.c
    public void c(kotlinx.serialization.descriptors.a aVar) {
        Set<String> setM;
        p.j(aVar, "descriptor");
        if (this.f52143e.g() || (aVar.getKind() instanceof d)) {
            return;
        }
        q qVarK = JsonNamesMapKt.k(aVar, d());
        if (qVarK == null && !this.f52143e.k()) {
            setM = q0.a(aVar);
        } else if (qVarK != null) {
            setM = JsonNamesMapKt.d(d(), aVar).keySet();
        } else {
            Set<String> setA = q0.a(aVar);
            Map map = (Map) v.a(d()).a(aVar, JsonNamesMapKt.e());
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = nj.q0.f();
            }
            setM = r0.m(setA, setKeySet);
        }
        for (String str : s0().keySet()) {
            if (!setM.contains(str) && !p.e(str, this.f63310g)) {
                throw f0.g(str, s0().toString());
            }
        }
    }

    @Override // dl.c
    public kotlinx.serialization.json.b e0(String str) {
        p.j(str, "tag");
        return (kotlinx.serialization.json.b) kotlin.collections.a.k(s0(), str);
    }

    @Override // dl.c
    /* JADX INFO: renamed from: w0 */
    public JsonObject s0() {
        return this.f63309f;
    }

    public int x(kotlinx.serialization.descriptors.a aVar) {
        p.j(aVar, "descriptor");
        while (this.f63312i < aVar.e()) {
            int i10 = this.f63312i;
            this.f63312i = i10 + 1;
            String strV = V(aVar, i10);
            int i11 = this.f63312i - 1;
            this.f63313j = false;
            if (s0().containsKey(strV) || u0(aVar, i11)) {
                if (!this.f52143e.d() || !v0(aVar, i11, strV)) {
                    return i11;
                }
            }
        }
        return -1;
    }

    public final boolean u0(kotlinx.serialization.descriptors.a aVar, int i10) {
        boolean z10;
        if (!d().e().f() && !aVar.i(i10) && aVar.d(i10).b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f63313j = z10;
        return z10;
    }

    public final boolean v0(kotlinx.serialization.descriptors.a aVar, int i10, String str) {
        kotlinx.serialization.json.c cVar;
        cl.a aVarD = d();
        kotlinx.serialization.descriptors.a aVarD2 = aVar.d(i10);
        if (!aVarD2.b() && (e0(str) instanceof JsonNull)) {
            return true;
        }
        if (p.e(aVarD2.getKind(), g.b.f86476a) && (!aVarD2.b() || !(e0(str) instanceof JsonNull))) {
            kotlinx.serialization.json.b bVarE0 = e0(str);
            String strF = null;
            if (bVarE0 instanceof kotlinx.serialization.json.c) {
                cVar = (kotlinx.serialization.json.c) bVarE0;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                strF = cl.i.f(cVar);
            }
            if (strF != null && JsonNamesMapKt.g(aVarD2, aVarD, strF) == -3) {
                return true;
            }
        }
        return false;
    }
}
