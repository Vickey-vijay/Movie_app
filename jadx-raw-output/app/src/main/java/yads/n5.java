package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f80559a = "yandex_ad_info";

    public static String a(de3 de3Var) {
        Object next;
        Iterator it = de3Var.f76657a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!ck.p.e(((hq0) next).f78301a, f80559a));
        hq0 hq0Var = (hq0) next;
        if (hq0Var != null) {
            return hq0Var.f78302b;
        }
        return null;
    }
}
