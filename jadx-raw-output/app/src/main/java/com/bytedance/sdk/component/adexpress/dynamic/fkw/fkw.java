package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.utils.ko;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class fkw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ouw f11375lh;
    public com.bytedance.sdk.component.adexpress.dynamic.yu.vt ouw;
    public vt vt;
    private com.bytedance.sdk.component.adexpress.dynamic.yu.pno yu;

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f11376lh;
        public float ouw;
        public float vt;
    }

    public final void ouw() {
        this.vt.ouw();
    }

    public final void ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        if (pnoVar != null) {
            this.yu = pnoVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 = this.yu;
        float f10 = pnoVar2.f11474le;
        float f11 = pnoVar2.f11476ra;
        float f12 = TextUtils.equals(pnoVar2.bly.f11431lh.f11451rn, "fixed") ? f11 : 65536.0f;
        this.vt.ouw();
        this.vt.ouw(pnoVar2, f10, f12);
        vt.lh lhVarOuw = this.vt.ouw(pnoVar2);
        com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar = new com.bytedance.sdk.component.adexpress.dynamic.yu.vt();
        vtVar.ouw = 0.0f;
        vtVar.vt = 0.0f;
        if (lhVarOuw != null) {
            f10 = lhVarOuw.ouw;
        }
        vtVar.f11484lh = f10;
        if (lhVarOuw != null) {
            f11 = lhVarOuw.vt;
        }
        vtVar.yu = f11;
        vtVar.fkw = "root";
        vtVar.bly = 1280.0f;
        vtVar.f11483le = pnoVar2;
        pnoVar2.vt = 0.0f;
        pnoVar2.f11475lh = 0.0f;
        pnoVar2.f11474le = f10;
        pnoVar2.f11476ra = f11;
        com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVarOuw = ouw(vtVar, 0.0f);
        this.ouw = vtVarOuw;
        ouw(vtVarOuw);
    }

    public fkw(double d10, int i10, double d11, String str, mwh mwhVar) {
        this.vt = new vt(d10, i10, d11, str, mwhVar);
    }

    private void ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar) {
        if (vtVar == null) {
            return;
        }
        ko.vt("DynamicCanvas", "native parser: type = " + vtVar.f11483le.bly.ouw + "; width = " + vtVar.f11484lh + "; height = " + vtVar.yu + "; x = " + vtVar.ouw + "; y = " + vtVar.vt);
        List<List<com.bytedance.sdk.component.adexpress.dynamic.yu.vt>> list = vtVar.f11485ra;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.yu.vt> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.vt> it = list2.iterator();
                while (it.hasNext()) {
                    ouw(it.next());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c7  */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.vt ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar, float f10) {
        float fOuw;
        float fOuw2;
        float f11;
        float fOuw3;
        float fOuw4;
        com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar2;
        com.bytedance.sdk.component.adexpress.dynamic.yu.bly blyVarOuw;
        float f12;
        com.bytedance.sdk.component.adexpress.dynamic.yu.bly blyVar;
        vt.lh lhVarOuw;
        vt.lh lhVarOuw2;
        com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar3 = vtVar;
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar = vtVar3.f11483le;
        if (pnoVar == null) {
            return vtVar3;
        }
        pnoVar.le();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> list = pnoVar.ryl;
        if (list == null || list.size() <= 0) {
            return vtVar3;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = pnoVar.bly.f11431lh;
        float f13 = leVar.f11450ra;
        float f14 = leVar.f11443le;
        float f15 = leVar.yu;
        float f16 = leVar.fkw;
        float f17 = leVar.vt;
        String str = leVar.f11448od;
        String str2 = leVar.f11433cd;
        float f18 = vtVar3.ouw + f16;
        float f19 = vtVar3.vt + f13;
        float f20 = f17 * 2.0f;
        float f21 = ((vtVar3.f11484lh - f16) - f14) - f20;
        float f22 = ((vtVar3.yu - f13) - f15) - f20;
        com.bytedance.sdk.component.adexpress.dynamic.yu.bly blyVar2 = new com.bytedance.sdk.component.adexpress.dynamic.yu.bly(f18, f19);
        if (vtVar3.f11485ra == null) {
            vtVar3.f11485ra = new ArrayList();
        }
        Iterator<List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno>> it = list.iterator();
        float f23 = 0.0f;
        while (it.hasNext()) {
            vt.lh lhVarOuw3 = this.vt.ouw(it.next());
            if (lhVarOuw3 != null) {
                f23 += lhVarOuw3.vt;
            }
        }
        String str3 = "space-between";
        String str4 = "space-around";
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar2 = leVar;
        if (f23 >= f22) {
            fOuw = 0.0f;
            fOuw2 = 0.0f;
        } else {
            if (TextUtils.equals(str2, "center")) {
                fOuw2 = (f22 - f23) / 2.0f;
            } else if (TextUtils.equals(str2, "flex-end")) {
                fOuw2 = f22 - f23;
            } else if (TextUtils.equals(str2, "space-around")) {
                fOuw2 = tlj.ouw((f22 - f23) / (list.size() + 1));
                fOuw = fOuw2;
            } else {
                if (!TextUtils.equals(str2, "space-between") || list.size() <= 1) {
                    fOuw = 0.0f;
                } else {
                    fOuw = tlj.ouw((f22 - f23) / (list.size() - 1));
                }
                fOuw2 = 0.0f;
            }
            fOuw = 0.0f;
        }
        blyVar2.vt += fOuw2;
        float f24 = f10;
        int i10 = 0;
        while (i10 < list.size()) {
            List<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> list2 = list.get(i10);
            i10++;
            if (i10 >= vtVar3.f11485ra.size()) {
                int size = (i10 - vtVar3.f11485ra.size()) + 1;
                int i11 = 0;
                while (i11 < size) {
                    vtVar3.f11485ra.add(new ArrayList());
                    i11++;
                    size = size;
                    f24 = f24;
                }
            }
            float f25 = f24;
            Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it2 = list2.iterator();
            float f26 = 0.0f;
            while (true) {
                f11 = fOuw;
                if (!it2.hasNext()) {
                    break;
                }
                com.bytedance.sdk.component.adexpress.dynamic.yu.pno next = it2.next();
                com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar3 = next.bly.f11431lh;
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it3 = it2;
                String str5 = leVar3.zih;
                int i12 = leVar3.hun;
                if (!TextUtils.equals(str5, "flex") && i12 != 1 && i12 != 2 && (lhVarOuw2 = this.vt.ouw(next)) != null) {
                    f26 += lhVarOuw2.ouw;
                }
                fOuw = f11;
                it2 = it3;
            }
            float fMax = Math.max(f21 - f26, 0.0f);
            Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it4 = list2.iterator();
            float f27 = 0.0f;
            while (it4.hasNext()) {
                com.bytedance.sdk.component.adexpress.dynamic.yu.pno next2 = it4.next();
                int i13 = next2.bly.f11431lh.hun;
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it5 = it4;
                if (i13 != 1 && i13 != 2 && (lhVarOuw = this.vt.ouw(next2)) != null) {
                    f27 += lhVarOuw.ouw;
                }
                it4 = it5;
            }
            if (f27 >= f21) {
                fOuw3 = 0.0f;
                fOuw4 = 0.0f;
            } else {
                if (TextUtils.equals(str, "center")) {
                    fOuw3 = (f21 - f27) / 2.0f;
                } else if (TextUtils.equals(str, "flex-end")) {
                    fOuw3 = f21 - f27;
                } else if (TextUtils.equals(str, str4)) {
                    fOuw3 = tlj.ouw((f21 - f27) / (list2.size() + 1));
                    fOuw4 = fOuw3;
                } else if (!TextUtils.equals(str, str3) || list2.size() <= 1) {
                    fOuw3 = 0.0f;
                } else {
                    fOuw4 = tlj.ouw((f21 - f27) / (list2.size() - 1.0f));
                    fOuw3 = 0.0f;
                }
                fOuw4 = 0.0f;
            }
            blyVar2.ouw += fOuw3;
            Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it6 = list2.iterator();
            float fMax2 = 0.0f;
            while (it6.hasNext()) {
                com.bytedance.sdk.component.adexpress.dynamic.yu.pno next3 = it6.next();
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it7 = it6;
                float f28 = this.vt.ouw(next3) != null ? this.vt.ouw(next3).vt : 0.0f;
                int i14 = next3.bly.f11431lh.hun;
                fMax2 = Math.max(fMax2, (i14 == 1 || i14 == 2) ? 0.0f : f28);
                it6 = it7;
            }
            Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it8 = list2.iterator();
            f24 = f25;
            while (it8.hasNext()) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.pno> it9 = it8;
                com.bytedance.sdk.component.adexpress.dynamic.yu.pno next4 = it8.next();
                String str6 = str3;
                vt.lh lhVarOuw4 = this.vt.ouw(next4);
                String str7 = str;
                com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar4 = next4.bly.f11431lh;
                float f29 = f24;
                float f30 = leVar4.fvf;
                float f31 = f21;
                float f32 = leVar4.uoy;
                String str8 = str4;
                float f33 = leVar4.bs;
                float f34 = fOuw4;
                float f35 = leVar4.fak;
                com.bytedance.sdk.component.adexpress.dynamic.yu.bly blyVar3 = blyVar2;
                float f36 = lhVarOuw4 == null ? 0.0f : lhVarOuw4.ouw;
                float f37 = lhVarOuw4 == null ? 0.0f : lhVarOuw4.vt;
                com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 = pnoVar;
                float f38 = TextUtils.equals(pnoVar.ouw, "root") ? i10 : f29;
                int i15 = i10;
                if (leVar4.hun == 1) {
                    vtVar2 = vtVar;
                    blyVarOuw = ouw(vtVar2, leVar4, (f36 - f32) - f35, (f37 - f30) - f33);
                } else {
                    vtVar2 = vtVar;
                    blyVarOuw = blyVar3;
                }
                com.bytedance.sdk.component.adexpress.dynamic.yu.bly blyVarOuw2 = leVar4.hun == 2 ? ouw(leVar4, this.vt.ouw(this.yu), new vt.lh((f36 - f32) - f35, (f37 - f30) - f33)) : blyVarOuw;
                String str9 = leVar2.f11446ng;
                if (fMax2 <= f37 || TextUtils.equals(str9, "flex-start")) {
                    f12 = 0.0f;
                } else {
                    str9.hashCode();
                    if (str9.equals("center")) {
                        f12 = (fMax2 - f37) / 2.0f;
                    } else if (str9.equals("flex-end")) {
                        f12 = fMax2 - f37;
                    } else {
                        f12 = 0.0f;
                    }
                }
                com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar4 = new com.bytedance.sdk.component.adexpress.dynamic.yu.vt();
                leVar2 = leVar2;
                vtVar4.ouw = blyVarOuw2.ouw + f35;
                vtVar4.vt = blyVarOuw2.vt + f30 + f12;
                vtVar4.f11484lh = (f36 - f32) - f35;
                vtVar4.yu = (f37 - f30) - f33;
                vtVar4.fkw = vtVar2.fkw + "." + next4.ouw;
                vtVar4.pno = vtVar2;
                vtVar4.f11483le = next4;
                fMax = fMax;
                vtVar4.bly = fMax;
                list2 = list2;
                vtVar4.tlj = list2;
                next4.vt = vtVar4.ouw;
                next4.f11475lh = vtVar4.vt;
                next4.f11474le = vtVar4.f11484lh;
                next4.f11476ra = vtVar4.yu;
                float f39 = f38;
                com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVarOuw = ouw(vtVar4, f39);
                i10 = i15;
                vtVar2.f11485ra.get(i10).add(vtVarOuw);
                int i16 = leVar4.hun;
                if (i16 == 1) {
                    blyVar = blyVar3;
                } else if (i16 != 2) {
                    blyVar = blyVar3;
                    blyVar.ouw += f36 + f34;
                } else {
                    blyVar = blyVar3;
                }
                f24 = f39;
                blyVar2 = blyVar;
                str3 = str6;
                it8 = it9;
                str = str7;
                f21 = f31;
                str4 = str8;
                fOuw4 = f34;
                pnoVar = pnoVar2;
            }
            com.bytedance.sdk.component.adexpress.dynamic.yu.bly blyVar4 = blyVar2;
            blyVar4.ouw = f18;
            blyVar4.vt += fMax2 + f11;
            vtVar3 = vtVar;
            list = list;
            str3 = str3;
            fOuw = f11;
            pnoVar = pnoVar;
        }
        return vtVar3;
    }

    private static com.bytedance.sdk.component.adexpress.dynamic.yu.bly ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar, com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar, float f10, float f11) {
        float f12;
        float f13;
        float f14 = vtVar.ouw;
        float f15 = vtVar.vt;
        float f16 = leVar.mt;
        float f17 = leVar.zvq;
        float f18 = leVar.xdk;
        float f19 = leVar.myk;
        boolean z10 = leVar.lso;
        boolean z11 = leVar.f11456ub;
        boolean z12 = leVar.f11435cj;
        boolean z13 = leVar.pv;
        String str = leVar.ux;
        float f20 = vtVar.f11484lh;
        float f21 = vtVar.yu;
        if (TextUtils.equals(str, "0")) {
            if (z10) {
                f14 = vtVar.ouw + f16;
            } else if (z11) {
                f14 = ((vtVar.ouw + f20) - f18) - f10;
            }
            if (z12) {
                f13 = vtVar.vt;
                f15 = f13 + f17;
            } else if (z13) {
                f12 = vtVar.vt;
                f15 = ((f12 + f21) - f19) - f11;
            }
        } else if (TextUtils.equals(str, "1")) {
            f14 = vtVar.ouw + ((f20 - f10) / 2.0f);
            if (z12) {
                f13 = vtVar.vt;
                f15 = f13 + f17;
            } else if (z13) {
                f12 = vtVar.vt;
                f15 = ((f12 + f21) - f19) - f11;
            }
        } else if (TextUtils.equals(str, "2")) {
            f15 = vtVar.vt + ((f21 - f11) / 2.0f);
            if (z10) {
                f14 = vtVar.ouw + f16;
            } else if (z11) {
                f14 = ((vtVar.ouw + f20) - f18) - f10;
            }
        } else if (TextUtils.equals(str, ExifInterface.GPS_MEASUREMENT_3D)) {
            f14 = vtVar.ouw + ((f20 - f10) / 2.0f);
            f15 = vtVar.vt + ((f21 - f11) / 2.0f);
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.yu.bly(f14, f15);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.yu.bly ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar, vt.lh lhVar, vt.lh lhVar2) {
        float fMin = leVar.mt;
        float f10 = leVar.zvq;
        float f11 = leVar.xdk;
        float f12 = leVar.myk;
        boolean z10 = leVar.lso;
        boolean z11 = leVar.f11456ub;
        boolean z12 = leVar.f11435cj;
        boolean z13 = leVar.pv;
        if (!z10) {
            if (z11) {
                float f13 = this.f11375lh.ouw;
                fMin = ((f13 != 0.0f ? Math.min(f13, lhVar.ouw) : lhVar.ouw) - f11) - lhVar2.ouw;
            } else {
                fMin = 0.0f;
            }
        }
        if (!z12) {
            if (z13) {
                float f14 = this.f11375lh.vt;
                if (f14 == 0.0f) {
                    f14 = lhVar.vt;
                }
                f10 = (f14 - f12) - lhVar2.vt;
            } else {
                f10 = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.yu.bly(fMin, f10);
    }
}
