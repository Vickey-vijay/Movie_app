package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class tlj {
    public static float ouw(float f10) {
        return (float) Math.ceil((f10 * 16.0f) / 16.0f);
    }

    public static List<vt.ouw> ouw(float f10, List<vt.ouw> list) {
        ArrayList<vt.ouw> arrayList;
        int size;
        float f11;
        float f12;
        float f13;
        while (true) {
            arrayList = new ArrayList();
            Iterator<vt.ouw> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((vt.ouw) it.next().clone());
            }
            boolean z10 = true;
            int i10 = 0;
            int i11 = 0;
            for (vt.ouw ouwVar : arrayList) {
                if (ouwVar.vt) {
                    i10 = (int) (i10 + ouwVar.ouw);
                } else {
                    i11 = (int) (i11 + ouwVar.ouw);
                    z10 = false;
                }
            }
            if (z10 && f10 > i10) {
                return arrayList;
            }
            f11 = i10;
            f12 = f10 < f11 ? f10 / f11 : 1.0f;
            f13 = f10 > f11 ? (f10 - f11) / i11 : 0.0f;
            if (f13 <= 1.0f) {
                break;
            }
            ArrayList arrayList2 = new ArrayList();
            boolean z11 = false;
            for (vt.ouw ouwVar2 : arrayList) {
                if (!ouwVar2.vt) {
                    float f14 = ouwVar2.f11384lh;
                    if (f14 != 0.0f && ouwVar2.ouw * f13 > f14) {
                        ouwVar2.ouw = f14;
                        ouwVar2.vt = true;
                        z11 = true;
                    }
                }
                arrayList2.add(ouwVar2);
            }
            if (!z11) {
                break;
            }
            list = arrayList2;
        }
        int i12 = 0;
        for (vt.ouw ouwVar3 : arrayList) {
            if (ouwVar3.vt) {
                ouwVar3.ouw = ouw(ouwVar3.ouw * f12);
            } else {
                ouwVar3.ouw = ouw(ouwVar3.ouw * f13);
            }
            i12 = (int) (i12 + ouwVar3.ouw);
        }
        float f15 = i12;
        if (f15 < f10) {
            float f16 = f10 - f15;
            for (size = 0; size < arrayList.size() && f16 > 0.0f; size = (size + 1) % arrayList.size()) {
                vt.ouw ouwVar4 = (vt.ouw) arrayList.get(size);
                if ((f10 < f11 && ouwVar4.vt) || (f10 > f11 && !ouwVar4.vt)) {
                    ouwVar4.ouw += 0.0625f;
                    f16 -= 0.0625f;
                }
            }
        }
        return arrayList;
    }
}
