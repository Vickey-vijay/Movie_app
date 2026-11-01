package yads;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes11.dex */
public final class pc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f81371a;

    public final LinkedHashMap a(Set set) {
        List listO0;
        w5 w5Var = this.f81371a;
        synchronized (w5Var.f84105a) {
            listO0 = nj.b0.O0(w5Var.f84108d);
        }
        kk.i<u5> iVarZ = SequencesKt___SequencesKt.z(nj.b0.S(listO0), new oc2(set));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (u5 u5Var : iVarZ) {
            String str = u5Var.f83374a.f83767b;
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(u5Var.f83375b);
        }
        return linkedHashMap;
    }

    public pc2(w5 w5Var) {
        this.f81371a = w5Var;
    }
}
