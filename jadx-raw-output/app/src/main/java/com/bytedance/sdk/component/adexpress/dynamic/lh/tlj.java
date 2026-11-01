package com.bytedance.sdk.component.adexpress.dynamic.lh;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public final class tlj {
    public static ra ouw(Context context, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fkw fkwVar, com.bytedance.sdk.component.adexpress.dynamic.yu.ra raVar, com.bytedance.sdk.component.adexpress.dynamic.yu.tlj tljVar, com.bytedance.sdk.component.adexpress.vt.mwh mwhVar) {
        String str = null;
        if (context == null || fkwVar == null || raVar == null) {
            return null;
        }
        String str2 = raVar.yu.f11454tc;
        String str3 = mwhVar.jqy;
        str2.hashCode();
        switch (str2) {
            case "0":
                return new fkw(context, fkwVar, raVar);
            case "1":
                return new lh(context, fkwVar);
            case "2":
                return new vt(context, raVar);
            case "5":
                com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = raVar.yu;
                return leVar.ms == 1 ? new zih(context, fkwVar, raVar, leVar.zin) : new rn(context, fkwVar, raVar);
            case "6":
            case "11":
                return new jg(context, raVar);
            case "7":
            case "14":
                return new ryl(context, raVar);
            case "8":
                return new mwh(context, fkwVar);
            case "9":
            case "16":
                return new ko(context, fkwVar, raVar, str2, tljVar.ouw, tljVar.vt, tljVar.yu, tljVar.f11482ra);
            case "10":
                return new yu(context, fkwVar, raVar);
            case "12":
                return new rn(context, fkwVar, raVar);
            case "13":
                return new zih(context, fkwVar, raVar);
            case "17":
            case "18":
                return new th(context, fkwVar, raVar, str2, tljVar);
            case "20":
                if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                    return new cf(context, fkwVar, raVar, str3 + "static/lotties/glass-swipe/glass-swipe.json", "20");
                }
                if (!TextUtils.isEmpty(str3)) {
                    str = str3 + "brush_mask.json";
                }
                return new cf(context, fkwVar, raVar, str, "20");
            case "22":
                if (!com.bytedance.sdk.component.adexpress.yu.vt()) {
                    return new vm(context, raVar);
                }
                return new cf(context, fkwVar, raVar, str3 + "static/lotties/202327swiper-up-star/index.json", "22");
            case "23":
                if (!com.bytedance.sdk.component.adexpress.yu.vt()) {
                    return null;
                }
                return new cf(context, fkwVar, raVar, str3 + "static/lotties/202327swiper-up-star/click.json", "23");
            case "24":
                if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                    return new ouw(context, fkwVar, raVar);
                }
                if (!TextUtils.isEmpty(str3)) {
                    str = str3 + "swiper_up_star.json";
                }
                return new cf(context, fkwVar, raVar, str, "24");
            case "25":
                if (!com.bytedance.sdk.component.adexpress.yu.vt()) {
                    return null;
                }
                return new cf(context, fkwVar, raVar, str3 + "static/lotties/gesture-slide.json", "25");
            case "29":
                return new le(context, fkwVar, raVar, tljVar.ouw, tljVar.vt, tljVar.yu, tljVar.f11482ra);
            default:
                return null;
        }
    }
}
