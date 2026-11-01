package sg.bigo.ads.common.h.b;

import com.ironsource.Z7;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, a> f69725a = new HashMap();

    public static void a() {
        f69725a.clear();
    }

    public static void a(String str) {
        a aVarC = c(str);
        if (aVarC == null) {
            sg.bigo.ads.common.t.a.a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
            return;
        }
        int i10 = aVarC.f69706e;
        if (i10 == h.f69720d || i10 == h.f69722f) {
            sg.bigo.ads.common.t.a.a(0, 3, "TaskManager", "start downloadBean = ".concat(String.valueOf(aVarC)));
            return;
        }
        aVarC.f69706e = h.f69718b;
        f.a().a(aVarC.f69702a);
        g.f69716a.execute(aVarC.f69704c);
    }

    public static void a(a aVar) {
        aVar.f69707f = "It's remove !!!";
        if (aVar.f69706e != h.f69722f) {
            aVar.f69706e = h.f69723g;
            f.a().a(aVar.f69702a);
        }
        f.a().b(aVar.f69702a);
        g.a(aVar.f69704c);
    }

    public static Collection<a> b() {
        return f69725a.values();
    }

    public static void b(String str) {
        a aVarC = c(str);
        if (aVarC != null) {
            a(aVarC);
        } else {
            sg.bigo.ads.common.t.a.a(0, "TaskManager", "you add " + str + " to TaskQueue ?");
        }
        if (f69725a.containsKey(str)) {
            f69725a.remove(str);
        }
    }

    public static void b(a aVar) {
        if (f69725a.containsKey(aVar.f69702a)) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "TaskManager", Z7.f27998r + f69725a.keySet().size());
        f69725a.put(aVar.f69702a, aVar);
    }

    public static a c(String str) {
        if (f69725a.containsKey(str)) {
            return f69725a.get(str);
        }
        return null;
    }
}
