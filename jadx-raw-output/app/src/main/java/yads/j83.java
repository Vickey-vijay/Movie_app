package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class j83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za f78945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bv f78946b;

    public /* synthetic */ j83(za zaVar) {
        this(zaVar, new bv());
    }

    public final void a(List list, yu yuVar) {
        this.f78946b.f75972a.getClass();
        Map mapG = nj.l0.g(mj.h.a("{CLICK_DEST}", av.a(yuVar)));
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                za zaVar = this.f78945a;
                dd2 dd2Var = new dd2(zaVar.f85261c, zaVar.f85259a, zaVar.f85260b, k83.f79332d);
                if (str.length() > 0) {
                    za.f85258d.execute(new ya(str, dd2Var, mapG));
                }
            }
        }
    }

    public j83(za zaVar, bv bvVar) {
        this.f78945a = zaVar;
        this.f78946b = bvVar;
    }
}
