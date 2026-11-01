package yads;

import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class jj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w41 f79055a;

    public /* synthetic */ jj() {
        this(new w41());
    }

    public final ArrayList a(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            oi oiVar = (oi) it.next();
            Object obj = oiVar.f81050c;
            String str = oiVar.f81049b;
            if (ck.p.e("image", str) && (obj instanceof u41)) {
                this.f79055a.getClass();
                if (w41.a((u41) obj, map)) {
                    arrayList.add(oiVar);
                }
            } else {
                if (ck.p.e(C3426d4.i.I0, str) && (obj instanceof on1)) {
                    on1 on1Var = (on1) obj;
                    if (on1Var.f81112c != null) {
                        ck.p.h(obj, "null cannot be cast to non-null type com.monetization.ads.network.model.MediaValue");
                        List list2 = on1Var.f81112c;
                        u41 u41Var = list2 != null ? (u41) nj.b0.h0(list2) : null;
                        sd3 sd3Var = on1Var.f81111b;
                        oj1 oj1Var = on1Var.f81110a;
                        if (sd3Var == null && oj1Var == null) {
                            if (u41Var != null) {
                                this.f79055a.getClass();
                                if (w41.a(u41Var, map)) {
                                }
                            }
                        }
                        arrayList.add(oiVar);
                    }
                }
                arrayList.add(oiVar);
            }
        }
        return arrayList;
    }

    public jj(w41 w41Var) {
        this.f79055a = w41Var;
    }
}
