package com.bytedance.adsdk.vt;

import android.util.Pair;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class th {
    public boolean ouw = false;
    private final Set<Object> vt = new ouw();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Map<String, com.bytedance.adsdk.vt.le.le> f11340lh = new HashMap();
    private final Comparator<Pair<String, Float>> yu = new Comparator<Pair<String, Float>>() { // from class: com.bytedance.adsdk.vt.th.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(Pair<String, Float> pair, Pair<String, Float> pair2) {
            float fFloatValue = ((Float) pair.second).floatValue();
            float fFloatValue2 = ((Float) pair2.second).floatValue();
            if (fFloatValue2 > fFloatValue) {
                return 1;
            }
            return fFloatValue > fFloatValue2 ? -1 : 0;
        }
    };

    public final void ouw(String str, float f10) {
        if (this.ouw) {
            com.bytedance.adsdk.vt.le.le leVar = this.f11340lh.get(str);
            if (leVar == null) {
                leVar = new com.bytedance.adsdk.vt.le.le();
                this.f11340lh.put(str, leVar);
            }
            float f11 = leVar.ouw + f10;
            leVar.ouw = f11;
            int i10 = leVar.vt + 1;
            leVar.vt = i10;
            if (i10 == Integer.MAX_VALUE) {
                leVar.ouw = f11 / 2.0f;
                leVar.vt = i10 / 2;
            }
            if (str.equals("__container")) {
                Iterator<Object> it = this.vt.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
    }
}
