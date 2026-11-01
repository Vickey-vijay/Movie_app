package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class vt {
    private mwh bly;
    private double fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f11381le;
    private String pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private double f11383ra;
    public Map<String, lh> ouw = new HashMap();
    public Map<String, lh> vt = new HashMap();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public Map<String, lh> f11382lh = new HashMap();
    private double yu = Math.random();

    public static class lh {
        public float ouw;
        public float vt;

        public lh() {
        }

        public final String toString() {
            return "UnitSize{width=" + this.ouw + ", height=" + this.vt + '}';
        }

        public lh(float f10, float f11) {
            this.ouw = f10;
            this.vt = f11;
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.fkw.vt$vt, reason: collision with other inner class name */
    public static class C0079vt {
        public float fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public int f11385lh;
        public float ouw;
        public int vt;
        public double yu;

        public static JSONObject ouw(C0079vt c0079vt) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", c0079vt.ouw);
                jSONObject.put("letterSpacing", c0079vt.vt);
                jSONObject.put("lineHeight", c0079vt.yu);
                jSONObject.put("maxWidth", c0079vt.fkw);
                jSONObject.put("fontWeight", c0079vt.f11385lh);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return jSONObject;
        }
    }

    private lh lh(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list, float f10, float f11) {
        float fMax;
        yu(list);
        lh lhVar = new lh();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = pnoVar.bly.f11431lh;
            int i10 = leVar.hun;
            if (i10 == 1 || i10 == 2) {
                arrayList.add(pnoVar);
            }
            int i11 = leVar.hun;
            if (i11 != 1 && i11 != 2) {
                arrayList2.add(pnoVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ouw((com.bytedance.sdk.component.adexpress.dynamic.yu.pno) it.next(), f10, f11);
        }
        if (arrayList2.size() <= 0) {
            return lhVar;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Float.valueOf(ouw((com.bytedance.sdk.component.adexpress.dynamic.yu.pno) it2.next(), f10, f11).ouw));
        }
        ArrayList arrayList4 = new ArrayList();
        int i12 = 0;
        while (true) {
            fMax = 0.0f;
            if (i12 >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 = (com.bytedance.sdk.component.adexpress.dynamic.yu.pno) arrayList2.get(i12);
            String str = pnoVar2.bly.f11431lh.zih;
            float fFloatValue = pnoVar2.f11474le;
            boolean zEquals = TextUtils.equals(str, "flex");
            if (TextUtils.equals(str, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> list2 = pnoVar2.ryl;
                if (list2 == null || list2.size() <= 0) {
                    zEquals = false;
                    break;
                }
                Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        zEquals = false;
                        break;
                    }
                    if (vt(it3.next())) {
                        zEquals = true;
                        break;
                    }
                }
            }
            ouw ouwVar = new ouw();
            if (!zEquals) {
                fFloatValue = ((Float) arrayList3.get(i12)).floatValue();
            }
            ouwVar.ouw = fFloatValue;
            ouwVar.vt = !zEquals;
            if (zEquals) {
                fMax = ((Float) arrayList3.get(i12)).floatValue();
            }
            ouwVar.f11384lh = fMax;
            arrayList4.add(ouwVar);
            i12++;
        }
        ouw(arrayList4, f10, arrayList2);
        List<ouw> listOuw = tlj.ouw(f10, arrayList4);
        float f12 = 0.0f;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            f12 += listOuw.get(i13).ouw;
            if (((Float) arrayList3.get(i13)).floatValue() != listOuw.get(i13).ouw) {
                yu((com.bytedance.sdk.component.adexpress.dynamic.yu.pno) arrayList2.get(i13));
            }
        }
        Iterator it4 = arrayList2.iterator();
        int i14 = 0;
        boolean z10 = false;
        while (it4.hasNext()) {
            i14++;
            if (!vt((com.bytedance.sdk.component.adexpress.dynamic.yu.pno) it4.next())) {
                z10 = false;
                break;
            }
            if (i14 == arrayList2.size()) {
                z10 = true;
            }
        }
        fMax = z10 ? f11 : 0.0f;
        ArrayList arrayList5 = new ArrayList();
        for (int i15 = 0; i15 < arrayList2.size(); i15++) {
            com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar3 = (com.bytedance.sdk.component.adexpress.dynamic.yu.pno) arrayList2.get(i15);
            lh lhVarOuw = ouw(pnoVar3, listOuw.get(i15).ouw, f11);
            if (!vt(pnoVar3)) {
                fMax = Math.max(fMax, lhVarOuw.vt);
            }
            arrayList5.add(lhVarOuw);
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Float.valueOf(((lh) it5.next()).vt));
        }
        if (!z10) {
            for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar4 = (com.bytedance.sdk.component.adexpress.dynamic.yu.pno) arrayList2.get(i16);
                if (vt(pnoVar4) && ((Float) arrayList6.get(i16)).floatValue() != fMax) {
                    yu(pnoVar4);
                    ouw(pnoVar4, listOuw.get(i16).ouw, fMax);
                }
            }
        }
        lhVar.ouw = f12;
        lhVar.vt = fMax;
        return lhVar;
    }

    private lh vt(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar, float f10, float f11) {
        lh lhVar;
        lh lhVarOuw;
        lh lhVar2 = new lh();
        if (pnoVar.bly.f11431lh == null) {
            return lhVar2;
        }
        String str = pnoVar.ouw + "_" + f10 + "_" + f11;
        if (this.f11382lh.containsKey(str)) {
            lhVarOuw = this.f11382lh.get(str);
            lhVar = lhVar2;
        } else {
            new lh();
            com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = pnoVar.bly.f11431lh;
            float f12 = leVar.pno;
            int i10 = leVar.ey;
            double d10 = leVar.osn;
            int i11 = leVar.jvy;
            boolean z10 = leVar.uq;
            boolean z11 = leVar.fqk;
            int i12 = leVar.f11449pd;
            C0079vt c0079vt = new C0079vt();
            c0079vt.ouw = f12;
            c0079vt.vt = i10;
            c0079vt.f11385lh = i11;
            c0079vt.yu = d10;
            c0079vt.fkw = f10;
            lhVar = lhVar2;
            lhVarOuw = cf.ouw(pnoVar.bly.vt, pnoVar.bly.ouw, C0079vt.ouw(c0079vt).toString(), z10, z11, i12, pnoVar, this.fkw, this.f11381le, this.f11383ra, this.bly);
            this.f11382lh.put(str, lhVarOuw);
        }
        float f13 = lhVarOuw.ouw;
        float f14 = lhVarOuw.vt;
        lhVar.ouw = Math.min(f13, f10);
        lhVar.vt = Math.min(f14, f11);
        return lhVar;
    }

    private static String yu(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10).ouw;
            if (i10 < list.size() - 1) {
                sb2.append(str);
                sb2.append("-");
            } else {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public final lh ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar, float f10, float f11) {
        float fMin;
        float f12;
        float fRound = f10;
        float fMin2 = f11;
        if (pnoVar == null) {
            return null;
        }
        lh lhVarOuw = ouw(pnoVar);
        float f13 = 0.0f;
        if (lhVarOuw == null || (lhVarOuw.ouw == 0.0f && lhVarOuw.vt == 0.0f)) {
            lhVarOuw = new lh();
            if (fMin2 <= 0.0f || fRound <= 0.0f) {
                lhVarOuw.ouw = 0.0f;
                lhVarOuw.vt = 0.0f;
            } else if (!pnoVar.fkw()) {
                float f14 = pnoVar.f11474le;
                float f15 = pnoVar.f11476ra;
                float fLh = pnoVar.lh();
                float fYu = pnoVar.yu();
                com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = pnoVar.bly.f11431lh;
                String str = leVar.zih;
                String str2 = leVar.f11451rn;
                float fMin3 = ((TextUtils.equals(str, "flex") || TextUtils.equals(str, "auto")) ? fRound : Math.min(f14, fRound)) - fLh;
                if (TextUtils.equals(str2, "scale")) {
                    fMin = Math.round(fMin3 / f15) + fYu;
                    if (fMin > fMin2) {
                        fMin3 = Math.round((fMin2 - fYu) * f15);
                    }
                } else {
                    fMin = (TextUtils.equals(str2, "auto") || TextUtils.equals(str2, "flex")) ? fMin2 : Math.min(f15, fMin2);
                }
                float f16 = fMin - fYu;
                List<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> list = pnoVar.ryl;
                float fMax = 0.0f;
                float fMax2 = 0.0f;
                for (List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list2 : list) {
                    float f17 = fYu;
                    lh lhVarVt = vt(list2, fMin3, f16);
                    if (vt(list2)) {
                        f13 += 1.0f;
                    } else {
                        fMax = Math.max(fMax, lhVarVt.ouw);
                    }
                    float f18 = fMax;
                    fMax2 = pnoVar.bly.ouw.equals("carousel") ? Math.max(pnoVar.f11476ra, lhVarVt.vt) : fMax2 + lhVarVt.vt;
                    fYu = f17;
                    fMax = f18;
                }
                float f19 = fYu;
                if (TextUtils.equals(str, "auto")) {
                    if (f13 == list.size()) {
                        fMin3 = f10;
                    } else {
                        for (List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list3 : list) {
                            lh(list3);
                            vt(list3, fMax, f16);
                        }
                        fMin3 = fMax;
                    }
                }
                if (TextUtils.equals(str2, "auto")) {
                    if (fMax2 <= fMin2) {
                        f16 = fMax2;
                    } else {
                        ouw(list, fMin3, f16);
                    }
                } else if ((TextUtils.equals(str2, "fixed") || TextUtils.equals(str2, "flex")) && f16 < fMax2) {
                    ouw(list, fMin3, f16);
                }
                lhVarOuw = lhVarOuw;
                lhVarOuw.ouw = Math.min(fMin3 + fLh, f10);
                lhVarOuw.vt = Math.min(f16 + f19, fMin2);
            } else if ((TextUtils.isEmpty(pnoVar.bly.vt) && pnoVar.bly.f11431lh.wp == null) || TextUtils.equals(pnoVar.bly.ouw, "creative-playable-bait")) {
                lh lhVar = new lh(0.0f, 0.0f);
                lhVarOuw = lhVar;
            } else {
                float f20 = pnoVar.f11474le;
                float f21 = pnoVar.f11476ra;
                com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar2 = pnoVar.bly.f11431lh;
                String str3 = leVar2.zih;
                String str4 = leVar2.f11451rn;
                float fOuw = pnoVar.ouw();
                float fVt = pnoVar.vt();
                float fLh2 = pnoVar.lh();
                float fYu2 = pnoVar.yu();
                if (TextUtils.equals(str3, "fixed")) {
                    fRound = Math.min(f20, fRound);
                    if (TextUtils.equals(str4, "auto")) {
                        f12 = vt(pnoVar, fRound - fLh2, fMin2 - fYu2).vt;
                        f21 = f12 + fYu2;
                    }
                } else {
                    if (TextUtils.equals(str3, "auto")) {
                        lh lhVarVt2 = vt(pnoVar, fRound - fLh2, fMin2 - fYu2);
                        f20 = lhVarVt2.ouw + fLh2;
                        if (TextUtils.equals(str4, "auto")) {
                            f21 = lhVarVt2.vt + fYu2;
                        }
                    } else if (TextUtils.equals(str3, "flex")) {
                        if (TextUtils.equals(str4, "auto")) {
                            f12 = vt(pnoVar, fRound - fLh2, fMin2 - fYu2).vt;
                            f21 = f12 + fYu2;
                        }
                    }
                    fRound = f20;
                }
                if (TextUtils.equals(str4, "scale")) {
                    float fRound2 = Math.round((fRound - fOuw) / f21) + fVt;
                    if (fRound2 > fMin2) {
                        fRound = Math.round((fMin2 - fVt) * f21) + fOuw;
                    } else {
                        fMin2 = fRound2;
                    }
                } else if (TextUtils.equals(str4, "fixed")) {
                    fMin2 = Math.min(f21 + fVt, fMin2);
                } else if (!TextUtils.equals(str4, "flex")) {
                    fMin2 = f21;
                }
                lhVarOuw = new lh();
                lhVarOuw.ouw = fRound;
                lhVarOuw.vt = fMin2;
            }
            this.ouw.put(pnoVar.ouw, lhVarOuw);
        }
        return lhVarOuw;
    }

    public static class ouw implements Cloneable {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f11384lh;
        public float ouw;
        public boolean vt;

        public final Object clone() {
            try {
                return (ouw) super.clone();
            } catch (CloneNotSupportedException e10) {
                e10.printStackTrace();
                return null;
            }
        }
    }

    public vt(double d10, int i10, double d11, String str, mwh mwhVar) {
        this.fkw = d10;
        this.f11381le = i10;
        this.f11383ra = d11;
        this.pno = str;
        this.bly = mwhVar;
    }

    private void yu(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        this.ouw.remove(pnoVar.ouw);
        List<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> list = pnoVar.ryl;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> it = list.iterator();
        while (it.hasNext()) {
            lh(it.next());
        }
    }

    private boolean vt(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list) {
        boolean z10;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> list2;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            if (TextUtils.equals(it.next().bly.f11431lh.zih, "flex")) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            return true;
        }
        while (true) {
            boolean z11 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar : list) {
                if (TextUtils.equals(pnoVar.bly.f11431lh.zih, "auto") && (list2 = pnoVar.ryl) != null) {
                    Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> it2 = list2.iterator();
                    int i10 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> next = it2.next();
                            i10++;
                            if (vt(next)) {
                                if (i10 == next.size()) {
                                    z11 = true;
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return z11;
        }
    }

    private lh vt(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list, float f10, float f11) {
        lh lhVarOuw = ouw(list);
        if (lhVarOuw != null && (lhVarOuw.ouw != 0.0f || lhVarOuw.vt != 0.0f)) {
            return lhVarOuw;
        }
        lh lhVarLh = lh(list, f10, f11);
        ouw(list, lhVarLh);
        return lhVarLh;
    }

    private boolean vt(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        if (pnoVar == null) {
            return false;
        }
        if (TextUtils.equals(pnoVar.bly.f11431lh.f11451rn, "flex")) {
            return true;
        }
        return lh(pnoVar);
    }

    private boolean lh(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> list;
        if (!pnoVar.fkw() && TextUtils.equals(pnoVar.bly.f11431lh.f11451rn, "auto") && (list = pnoVar.ryl) != null && list.size() > 0) {
            if (list.size() == 1) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it = list.get(0).iterator();
                while (it.hasNext()) {
                    if (!vt(it.next())) {
                        return false;
                    }
                }
                return true;
            }
            Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> it2 = list.iterator();
            while (it2.hasNext()) {
                if (ouw(it2.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void lh(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.vt.remove(yu(list));
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it = list.iterator();
        while (it.hasNext()) {
            yu(it.next());
        }
    }

    private void ouw(List<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> list, float f10, float f11) {
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (ouw(it.next(), false)) {
                z10 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list2 : list) {
            ouw ouwVar = new ouw();
            boolean zOuw = ouw(list2, !z10);
            ouwVar.ouw = zOuw ? 1.0f : vt(list2, f10, f11).vt;
            ouwVar.vt = !zOuw;
            arrayList.add(ouwVar);
        }
        List<ouw> listOuw = tlj.ouw(f11, arrayList);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((ouw) arrayList.get(i10)).ouw != listOuw.get(i10).ouw) {
                List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list3 = list.get(i10);
                lh(list3);
                vt(list3, f10, listOuw.get(i10).ouw);
            }
        }
    }

    private boolean ouw(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list, boolean z10) {
        boolean z11;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z11 = false;
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.yu.pno next = it.next();
            com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = next.bly.f11431lh;
            String str = leVar.f11451rn;
            if (TextUtils.equals(str, "flex") || (z10 && ((TextUtils.equals(leVar.zih, "flex") && TextUtils.equals(leVar.f11451rn, "scale") && com.bytedance.sdk.component.adexpress.dynamic.yu.fkw.f11430le.get(next.bly.ouw).intValue() == 7) || TextUtils.equals(str, "flex")))) {
                z11 = true;
                break;
            }
        }
        if (z11) {
            return true;
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it2 = list.iterator();
        while (it2.hasNext()) {
            if (lh(it2.next())) {
                return true;
            }
        }
        return false;
    }

    private static void ouw(List<ouw> list, float f10, List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list2) {
        float f11 = 0.0f;
        for (ouw ouwVar : list) {
            if (ouwVar.vt) {
                f11 += ouwVar.ouw;
            }
        }
        if (f11 > f10) {
            int i10 = 0;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (list.get(i11).vt && list2.get(i11).ra()) {
                    i10++;
                }
            }
            if (i10 > 0) {
                float fCeil = (float) (Math.ceil(((f11 - f10) / i10) * 1000.0f) / 1000.0d);
                for (int i12 = 0; i12 < list2.size(); i12++) {
                    ouw ouwVar2 = list.get(i12);
                    if (ouwVar2.vt && list2.get(i12).ra()) {
                        ouwVar2.ouw -= fCeil;
                    }
                }
            }
        }
    }

    public final void ouw() {
        this.f11382lh.clear();
        this.ouw.clear();
        this.vt.clear();
    }

    public final lh ouw(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list) {
        return this.vt.get(yu(list));
    }

    private void ouw(List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list, lh lhVar) {
        this.vt.put(yu(list), lhVar);
    }

    public final lh ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        return this.ouw.get(pnoVar.ouw);
    }
}
