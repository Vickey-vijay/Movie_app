package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes11.dex */
public abstract class sf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mj.g f82626a = kotlin.b.a(qf.f81843b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final mj.g f82627b = kotlin.b.a(rf.f82248b);

    public static LinkedHashMap a(String str) {
        StackTraceElement stackTraceElement;
        List list;
        List<String> listB;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> it = lk.a0.u0(str).iterator();
        Thread thread = null;
        while (it.hasNext()) {
            String string = lk.a0.k1(it.next()).toString();
            lk.i iVarFind$default = Regex.find$default((Regex) f82627b.getValue(), string, 0, 2, null);
            String str2 = (iVarFind$default == null || (listB = iVarFind$default.b()) == null) ? null : (String) nj.b0.i0(listB, 1);
            if (str2 != null) {
                thread = new Thread("[ExitInfo] " + str2);
                linkedHashMap.put(thread, new ArrayList());
            } else if (lk.x.R(string, "at ", false, 2, null) && thread != null) {
                lk.i iVarFind$default2 = Regex.find$default((Regex) f82626a.getValue(), string, 0, 2, null);
                if (iVarFind$default2 == null) {
                    stackTraceElement = null;
                } else {
                    lk.i.b bVarA = iVarFind$default2.a();
                    String str3 = bVarA.a().b().get(1);
                    String str4 = bVarA.a().b().get(2);
                    String str5 = bVarA.a().b().get(3);
                    String strF1 = lk.a0.f1(str3, '.', "");
                    String strZ0 = lk.a0.Z0(str3, '.', null, 2, null);
                    try {
                        Integer numR = lk.w.r(str5);
                        stackTraceElement = new StackTraceElement(strF1, strZ0, str4, numR != null ? numR.intValue() : -1);
                    } catch (Throwable unused) {
                        stackTraceElement = null;
                    }
                }
                if (stackTraceElement != null && (list = (List) linkedHashMap.get(thread)) != null) {
                    list.add(stackTraceElement);
                }
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(nj.l0.f(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (StackTraceElement[]) ((Collection) entry.getValue()).toArray(new StackTraceElement[0]));
        }
        return linkedHashMap2;
    }
}
