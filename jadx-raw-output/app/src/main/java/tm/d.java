package tm;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.util.LazyList;
import rm.i;
import rm.j;
import rm.n;

/* JADX INFO: compiled from: ContextHandlerCollection.java */
/* JADX INFO: loaded from: classes2.dex */
public class d extends f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final zm.c f72447u = zm.b.a(d.class);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile PathMap f72448s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Class<? extends c> f72449t;

    public d() {
        super(true);
        this.f72449t = c.class;
    }

    @Override // tm.f
    public void C0(i[] iVarArr) {
        this.f72448s = null;
        super.C0(iVarArr);
        if (isStarted()) {
            D0();
        }
    }

    public void D0() {
        i[] iVarArrV;
        Map map;
        PathMap pathMap = new PathMap();
        i[] iVarArrP = P();
        for (int i10 = 0; iVarArrP != null && i10 < iVarArrP.length; i10++) {
            i iVar = iVarArrP[i10];
            if (iVar instanceof c) {
                iVarArrV = new i[]{iVar};
            } else {
                if (iVar instanceof j) {
                    iVarArrV = ((j) iVar).V(c.class);
                } else {
                    continue;
                }
            }
            for (i iVar2 : iVarArrV) {
                c cVar = (c) iVar2;
                String strU0 = cVar.U0();
                if (strU0 == null || strU0.indexOf(44) >= 0 || strU0.startsWith("*")) {
                    throw new IllegalArgumentException("Illegal context spec:" + strU0);
                }
                if (!strU0.startsWith("/")) {
                    strU0 = '/' + strU0;
                }
                if (strU0.length() > 1) {
                    if (strU0.endsWith("/")) {
                        strU0 = strU0 + "*";
                    } else if (!strU0.endsWith("/*")) {
                        strU0 = strU0 + "/*";
                    }
                }
                Object obj = pathMap.get(strU0);
                String[] strArrD1 = cVar.d1();
                if (strArrD1 != null && strArrD1.length > 0) {
                    if (obj instanceof Map) {
                        map = (Map) obj;
                    } else {
                        HashMap map2 = new HashMap();
                        map2.put("*", obj);
                        pathMap.put(strU0, map2);
                        map = map2;
                    }
                    for (String str : strArrD1) {
                        map.put(str, LazyList.add(map.get(str), iVarArrP[i10]));
                    }
                } else if (obj instanceof Map) {
                    Map map3 = (Map) obj;
                    map3.put("*", LazyList.add(map3.get("*"), iVarArrP[i10]));
                } else {
                    pathMap.put(strU0, LazyList.add(obj, iVarArrP[i10]));
                }
            }
        }
        this.f72448s = pathMap;
    }

    public final String E0(String str) {
        if (str == null) {
            return null;
        }
        return str.endsWith(".") ? str.substring(0, str.length() - 1) : str;
    }

    @Override // tm.f, tm.a, ym.b, ym.a
    public void d0() throws Exception {
        D0();
        super.d0();
    }

    @Override // tm.f, rm.i
    public void v(String str, n nVar, lj.a aVar, lj.c cVar) throws ServletException, IOException {
        c cVarK;
        i[] iVarArrP = P();
        if (iVarArrP != null && iVarArrP.length != 0) {
            rm.c cVarY = nVar.y();
            if (cVarY.o() && (cVarK = cVarY.k()) != null) {
                cVarK.v(str, nVar, aVar, cVar);
                return;
            }
            PathMap pathMap = this.f72448s;
            if (pathMap != null && str != null && str.startsWith("/")) {
                Object lazyMatches = pathMap.getLazyMatches(str);
                for (int i10 = 0; i10 < LazyList.size(lazyMatches); i10++) {
                    Object value = ((Map.Entry) LazyList.get(lazyMatches, i10)).getValue();
                    if (value instanceof Map) {
                        Map map = (Map) value;
                        String strE0 = E0(aVar.s());
                        Object obj = map.get(strE0);
                        for (int i11 = 0; i11 < LazyList.size(obj); i11++) {
                            ((i) LazyList.get(obj, i11)).v(str, nVar, aVar, cVar);
                            if (nVar.X()) {
                                return;
                            }
                        }
                        Object obj2 = map.get("*." + strE0.substring(strE0.indexOf(".") + 1));
                        for (int i12 = 0; i12 < LazyList.size(obj2); i12++) {
                            ((i) LazyList.get(obj2, i12)).v(str, nVar, aVar, cVar);
                            if (nVar.X()) {
                                return;
                            }
                        }
                        Object obj3 = map.get("*");
                        for (int i13 = 0; i13 < LazyList.size(obj3); i13++) {
                            ((i) LazyList.get(obj3, i13)).v(str, nVar, aVar, cVar);
                            if (nVar.X()) {
                                return;
                            }
                        }
                    } else {
                        for (int i14 = 0; i14 < LazyList.size(value); i14++) {
                            ((i) LazyList.get(value, i14)).v(str, nVar, aVar, cVar);
                            if (nVar.X()) {
                                return;
                            }
                        }
                    }
                }
                return;
            }
            for (i iVar : iVarArrP) {
                iVar.v(str, nVar, aVar, cVar);
                if (nVar.X()) {
                    return;
                }
            }
        }
    }
}
