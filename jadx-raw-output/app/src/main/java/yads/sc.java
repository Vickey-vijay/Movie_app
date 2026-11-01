package yads;

import android.view.View;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class sc implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final id f82591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final za f82592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lv f82593c;

    @Override // yads.o0
    public final Object a(View view, m0 m0Var, u0 u0Var) {
        rc rcVar = (rc) m0Var;
        Iterator it = rcVar.f82180d.iterator();
        while (it.hasNext()) {
            za.a(this.f82592b, (String) it.next(), k83.f79330b);
        }
        this.f82591a.a(view, rcVar);
        lv lvVar = this.f82593c;
        co2 co2Var = co2.f76359j;
        lvVar.getClass();
        lvVar.f79937d.a(lvVar.a(co2Var, new HashMap()));
        return new o01(false, null);
    }

    public sc(id idVar, za zaVar, lv lvVar) {
        this.f82591a = idVar;
        this.f82592b = zaVar;
        this.f82593c = lvVar;
    }
}
