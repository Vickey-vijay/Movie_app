package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.ironsource.C3426d4;
import com.safedk.android.internal.partials.PangleVideoBridge;
import io.bidmachine.iab.vast.tags.VastAttributes;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class le {

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private static HashMap<String, String> f11377ra;
    private lh fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.yu f11378le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.lh f11379lh;
    private JSONObject ouw;
    private JSONObject vt;
    private ouw yu;

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public boolean f11380lh;
        public float ouw;
        public float vt;
    }

    public final com.bytedance.sdk.component.adexpress.dynamic.yu.pno ouw(double d10, int i10, double d11, String str, mwh mwhVar) {
        JSONObject jSONObjectJsonObjectInit;
        int iMwh;
        com.bytedance.sdk.component.adexpress.dynamic.yu.lh lhVar = this.f11379lh;
        Iterator<String> itKeys = lhVar.vt.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = lhVar.vt.opt(next);
            int i11 = 0;
            if (TextUtils.equals("image", next)) {
                if (objOpt instanceof JSONArray) {
                    while (true) {
                        JSONArray jSONArray = (JSONArray) objOpt;
                        if (i11 < jSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i11);
                            if (jSONObjectOptJSONObject != null) {
                                Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                while (itKeys2.hasNext()) {
                                    String next2 = itKeys2.next();
                                    Object objOpt2 = jSONObjectOptJSONObject.opt(next2);
                                    lhVar.ouw.put(next + "." + i11 + "." + next2, objOpt2);
                                }
                            }
                            i11++;
                        }
                    }
                }
            } else if (TextUtils.equals("dynamic_creative", next)) {
                if (objOpt instanceof String) {
                    try {
                        JSONObject jSONObjectJsonObjectInit2 = PangleVideoBridge.jsonObjectInit((String) objOpt);
                        Iterator<String> itKeys3 = jSONObjectJsonObjectInit2.keys();
                        while (itKeys3.hasNext()) {
                            String next3 = itKeys3.next();
                            Object objOpt3 = jSONObjectJsonObjectInit2.opt(next3);
                            if ((objOpt3 instanceof JSONArray) && !TextUtils.equals(next3, "short_phrase") && !TextUtils.equals(next3, "long_phrase")) {
                                for (int i12 = 0; i12 < ((JSONArray) objOpt3).length(); i12++) {
                                    lhVar.ouw.put(next + "." + next3 + "." + i12, ((JSONArray) objOpt3).opt(i12));
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "coupon")) {
                                Iterator<String> itKeys4 = ((JSONObject) objOpt3).keys();
                                while (itKeys4.hasNext()) {
                                    String next4 = itKeys4.next();
                                    Object objOpt4 = ((JSONObject) objOpt3).opt(next4);
                                    lhVar.ouw.put(next + "." + next3 + "." + next4, objOpt4);
                                }
                            } else if ((objOpt3 instanceof JSONObject) && TextUtils.equals(next3, "live_room_data")) {
                                lhVar.ouw(next, next3, objOpt3);
                            } else {
                                lhVar.ouw.put(next + "." + next3, objOpt3);
                            }
                        }
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                }
            } else if (!(objOpt instanceof JSONObject)) {
                lhVar.ouw.put(next, objOpt);
                if (objOpt instanceof String) {
                    lhVar.ouw.put(next, objOpt);
                }
            } else if (objOpt != null) {
                JSONObject jSONObject = (JSONObject) objOpt;
                Iterator<String> itKeys5 = jSONObject.keys();
                while (itKeys5.hasNext()) {
                    String next5 = itKeys5.next();
                    Object objOpt5 = jSONObject.opt(next5);
                    lhVar.ouw.put(next + "." + next5, objOpt5);
                }
            }
        }
        try {
            jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(this.f11378le.vt);
        } catch (JSONException e11) {
            e11.printStackTrace();
            jSONObjectJsonObjectInit = null;
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVarOuw = ouw(yu.ouw(this.ouw, jSONObjectJsonObjectInit), null);
        if (pnoVarOuw != null) {
            if (com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh != null) {
                iMwh = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.mwh();
            } else {
                Context contextOuw = com.bytedance.sdk.component.adexpress.yu.ouw();
                if (contextOuw == null) {
                    contextOuw = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.vt();
                }
                iMwh = contextOuw.getResources().getDisplayMetrics().widthPixels;
            }
            int iVt = com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), iMwh);
            ouw ouwVar = this.yu;
            float fMin = ouwVar.f11380lh ? ouwVar.ouw : Math.min(ouwVar.ouw, iVt);
            if (this.yu.vt == 0.0f) {
                pnoVarOuw.f11474le = fMin;
                pnoVarOuw.bly.f11431lh.f11451rn = "auto";
                pnoVarOuw.f11476ra = 0.0f;
            } else {
                pnoVarOuw.f11474le = fMin;
                Context contextOuw2 = com.bytedance.sdk.component.adexpress.yu.ouw();
                Context contextOuw3 = com.bytedance.sdk.component.adexpress.yu.ouw();
                if (contextOuw3 == null) {
                    contextOuw3 = com.bytedance.sdk.component.adexpress.ouw.ouw.ouw.ouw().f11574lh.vt();
                }
                Display defaultDisplay = ((WindowManager) contextOuw3.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                int iVt2 = com.bytedance.sdk.component.adexpress.yu.ra.vt(contextOuw2, displayMetrics.heightPixels);
                ouw ouwVar2 = this.yu;
                pnoVarOuw.f11476ra = ouwVar2.f11380lh ? ouwVar2.vt : Math.min(ouwVar2.vt, iVt2);
                pnoVarOuw.bly.f11431lh.f11451rn = "fixed";
            }
        }
        fkw fkwVar = new fkw(d10, i10, d11, str, mwhVar);
        fkw.ouw ouwVar3 = new fkw.ouw();
        ouw ouwVar4 = this.yu;
        ouwVar3.ouw = ouwVar4.ouw;
        ouwVar3.vt = ouwVar4.vt;
        ouwVar3.f11376lh = 0.0f;
        fkwVar.f11375lh = ouwVar3;
        fkwVar.ouw(pnoVarOuw);
        fkwVar.ouw();
        com.bytedance.sdk.component.adexpress.dynamic.yu.vt vtVar = fkwVar.ouw;
        if (vtVar.yu == 65536.0f) {
            return null;
        }
        return vtVar.f11483le;
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        f11377ra = map;
        map.put("subtitle", UnifiedMediationParams.KEY_DESCRIPTION);
        f11377ra.put("source", "source|app.app_name");
        f11377ra.put("screenshot", "dynamic_creative.screenshot");
    }

    public le(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.ouw = jSONObject;
        this.vt = jSONObject2;
        this.f11379lh = new com.bytedance.sdk.component.adexpress.dynamic.yu.lh(jSONObject2);
        ouw ouwVar = new ouw();
        if (jSONObject3 != null) {
            ouwVar.ouw = (float) jSONObject3.optDouble("width");
            ouwVar.vt = (float) jSONObject3.optDouble("height");
            ouwVar.f11380lh = jSONObject3.optBoolean("isLandscape");
        }
        this.yu = ouwVar;
        this.f11378le = com.bytedance.sdk.component.adexpress.dynamic.yu.yu.ouw(jSONObject4);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0170  */
    private com.bytedance.sdk.component.adexpress.dynamic.yu.pno ouw(JSONObject jSONObject, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar) {
        JSONObject jSONObjectOuw;
        JSONObject jSONObjectOuw2;
        String str;
        JSONObject jSONObject2;
        int i10;
        String str2;
        int length;
        String strOuw;
        JSONObject jSONObject3;
        int iLastIndexOf;
        Object objOuw;
        Object objOuw2;
        Object objOuw3;
        Object objOuw4;
        JSONObject jSONObjectOptJSONObject;
        com.bytedance.sdk.component.adexpress.dynamic.yu.yu.ouw next;
        JSONObject jSONObject4;
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("type");
        if (TextUtils.equals(strOptString, "custom-component-vessel")) {
            int iOptInt = jSONObject.optInt("componentId");
            if (this.f11378le != null) {
                this.fkw = new lh();
                List<com.bytedance.sdk.component.adexpress.dynamic.yu.yu.ouw> list = this.f11378le.ouw;
                if (list == null || list.size() <= 0) {
                    jSONObjectOuw = null;
                } else {
                    Iterator<com.bytedance.sdk.component.adexpress.dynamic.yu.yu.ouw> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (next != null && next.ouw == iOptInt) {
                            break;
                        }
                    }
                    if (next == null || (jSONObject4 = next.vt) == null) {
                        jSONObjectOuw = null;
                    } else {
                        jSONObjectOuw = lh.ouw(jSONObject4, jSONObject);
                    }
                }
                if (jSONObjectOuw == null) {
                    jSONObjectOuw = jSONObject;
                }
            } else {
                jSONObjectOuw = jSONObject;
            }
        } else {
            jSONObjectOuw = jSONObject;
        }
        String strOptString2 = jSONObjectOuw.optString("type");
        String strOptString3 = jSONObjectOuw.optString("id");
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOuw.optJSONObject("values");
        JSONObject jSONObjectOuw3 = com.bytedance.sdk.component.adexpress.vt.ouw(strOptString2);
        if (jSONObjectOuw3 != null) {
            JSONObject jSONObject5 = jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2;
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOuw3.optJSONObject("values");
            if (jSONObjectOptJSONObject3 != null) {
                bly.ouw(jSONObjectOptJSONObject3, jSONObject5);
            }
        }
        JSONArray jSONArrayOptJSONArray = jSONObjectOuw.optJSONArray("sceneValues");
        JSONObject jSONObjectOptJSONObject4 = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0 || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) ? null : jSONObjectOptJSONObject.optJSONObject("values");
        JSONObject jSONObjectOuw4 = com.bytedance.sdk.component.adexpress.vt.ouw(strOptString2);
        if (jSONObjectOuw4 == null) {
            jSONObjectOuw2 = null;
        } else {
            if (jSONObjectOptJSONObject4 == null) {
                jSONObjectOptJSONObject4 = new JSONObject();
            }
            jSONObjectOuw2 = bly.ouw(jSONObjectOptJSONObject2, jSONObjectOuw4.optJSONObject("themeValues"), jSONObjectOptJSONObject4);
        }
        com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar2 = new com.bytedance.sdk.component.adexpress.dynamic.yu.pno();
        if (TextUtils.isEmpty(strOptString3)) {
            pnoVar2.ouw = String.valueOf(pnoVar2.hashCode());
        } else {
            pnoVar2.ouw = strOptString3;
        }
        if (jSONObjectOptJSONObject2 != null) {
            com.bytedance.sdk.component.adexpress.dynamic.yu.lh lhVar = this.f11379lh;
            if (lhVar == null || (objOuw = lhVar.ouw("image.0.url")) == null) {
                str = strOptString;
                jSONObject2 = jSONObjectOuw;
            } else {
                String strValueOf = String.valueOf(objOuw);
                if (TextUtils.isEmpty(strValueOf) || (objOuw2 = this.f11379lh.ouw("title")) == null) {
                    str = strOptString;
                    jSONObject2 = jSONObjectOuw;
                } else {
                    String strValueOf2 = String.valueOf(objOuw2);
                    if (TextUtils.isEmpty(strValueOf2) || (objOuw3 = this.f11379lh.ouw(UnifiedMediationParams.KEY_DESCRIPTION)) == null) {
                        str = strOptString;
                        jSONObject2 = jSONObjectOuw;
                    } else {
                        String strValueOf3 = String.valueOf(objOuw3);
                        if (TextUtils.isEmpty(strValueOf3) || (objOuw4 = this.f11379lh.ouw("icon")) == null) {
                            str = strOptString;
                            jSONObject2 = jSONObjectOuw;
                        } else {
                            String strValueOf4 = String.valueOf(objOuw4);
                            if (TextUtils.isEmpty(strValueOf4)) {
                                str = strOptString;
                                jSONObject2 = jSONObjectOuw;
                            } else {
                                str = strOptString;
                                Object objOuw5 = this.f11379lh.ouw("app.app_name");
                                jSONObject2 = jSONObjectOuw;
                                Object objOuw6 = this.f11379lh.ouw("source");
                                if (objOuw5 != null || objOuw6 != null) {
                                    if (objOuw5 == null) {
                                        objOuw5 = objOuw6;
                                    }
                                    String strValueOf5 = String.valueOf(objOuw5);
                                    if (!TextUtils.isEmpty(strValueOf5)) {
                                        pnoVar2.ouw(UnifiedMediationParams.KEY_IMAGE_URL, strValueOf);
                                        pnoVar2.ouw("title", strValueOf2);
                                        pnoVar2.ouw(UnifiedMediationParams.KEY_DESCRIPTION, strValueOf3);
                                        pnoVar2.ouw("icon", strValueOf4);
                                        pnoVar2.ouw("app_name", strValueOf5);
                                        pnoVar2.f11472jg = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            pnoVar2.vt = (float) jSONObjectOptJSONObject2.optDouble(VastAttributes.HORIZONTAL_POSITION);
            pnoVar2.f11475lh = (float) jSONObjectOptJSONObject2.optDouble(VastAttributes.VERTICAL_POSITION);
            pnoVar2.f11474le = (float) jSONObjectOptJSONObject2.optDouble("width");
            pnoVar2.f11476ra = (float) jSONObjectOptJSONObject2.optDouble("height");
            pnoVar2.pno = jSONObjectOptJSONObject2.optInt("remainWidth");
            com.bytedance.sdk.component.adexpress.dynamic.yu.fkw fkwVar = new com.bytedance.sdk.component.adexpress.dynamic.yu.fkw();
            fkwVar.ouw = strOptString2;
            fkwVar.vt = jSONObjectOptJSONObject2.optString("data");
            fkwVar.fkw = jSONObjectOptJSONObject2.optString("dataExtraInfo");
            com.bytedance.sdk.component.adexpress.dynamic.yu.le leVarOuw = com.bytedance.sdk.component.adexpress.dynamic.yu.le.ouw(jSONObjectOptJSONObject2);
            fkwVar.f11431lh = leVarOuw;
            com.bytedance.sdk.component.adexpress.dynamic.yu.le leVarOuw2 = com.bytedance.sdk.component.adexpress.dynamic.yu.le.ouw(jSONObjectOuw2);
            if (leVarOuw2 == null) {
                fkwVar.yu = leVarOuw;
            } else {
                fkwVar.yu = leVarOuw2;
            }
            ouw(leVarOuw);
            ouw(leVarOuw2);
            if (!TextUtils.equals(strOptString2, "video-image-budget") || (jSONObject3 = this.vt) == null) {
                i10 = 0;
            } else {
                int iOptInt2 = jSONObject3.optInt("image_mode");
                if (iOptInt2 != 5 && iOptInt2 != 15 && iOptInt2 != 50 && iOptInt2 != 154) {
                    fkwVar.ouw = "image";
                    String strOuw2 = bly.ouw("image");
                    com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar = fkwVar.f11431lh;
                    leVar.wp = strOuw2;
                    fkwVar.yu.wp = strOuw2;
                    String strOuw3 = bly.ouw("image", "clickArea");
                    if (!TextUtils.isEmpty(strOuw3)) {
                        leVar.ksc = strOuw3;
                        fkwVar.yu.ksc = strOuw3;
                    }
                    JSONObject jSONObject6 = leVar.yw;
                    if (jSONObject6 != null) {
                        leVar.f11437fn = jSONObject6.optString("imageLottieTosPath");
                        leVar.byv = jSONObject6.optBoolean("animationsLoop");
                        leVar.ehk = jSONObject6.optInt("lottieAppNameMaxLength");
                        leVar.xwt = jSONObject6.optInt("lottieAdDescMaxLength");
                        leVar.f11440ki = jSONObject6.optInt("lottieAdTitleMaxLength");
                    }
                    fkwVar.vt = strOuw2;
                    if (strOuw2 == null || (iLastIndexOf = strOuw2.lastIndexOf(".")) <= 0) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                        String strSubstring = strOuw2.substring(0, iLastIndexOf);
                        JSONObject jSONObject7 = new JSONObject();
                        try {
                            jSONObject7.put("width", ouw(strSubstring + ".width"));
                            jSONObject7.put("height", ouw(strSubstring + ".height"));
                        } catch (JSONException e10) {
                            e10.printStackTrace();
                        }
                        fkwVar.fkw = jSONObject7.toString();
                    }
                    leVar.vt();
                } else {
                    i10 = 0;
                    fkwVar.ouw = "video";
                    String strOuw4 = bly.ouw("video");
                    fkwVar.f11431lh.wp = strOuw4;
                    String strOuw5 = bly.ouw("video", "clickArea");
                    if (!TextUtils.isEmpty(strOuw5)) {
                        fkwVar.f11431lh.ksc = strOuw5;
                        fkwVar.yu.ksc = strOuw5;
                    }
                    fkwVar.yu.wp = strOuw4;
                    fkwVar.vt = strOuw4;
                    fkwVar.f11431lh.ouw();
                }
            }
            String str3 = fkwVar.ouw;
            com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar2 = fkwVar.f11431lh;
            if (f11377ra.containsKey(str3) && !leVar2.rrs) {
                leVar2.wp = f11377ra.get(str3);
            }
            if (leVar2.rrs) {
                strOuw = fkwVar.vt;
            } else {
                strOuw = ouw(fkwVar.vt);
            }
            if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                if (TextUtils.equals(str3, "star") || TextUtils.equals(str3, "text_star")) {
                    strOuw = ouw("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(str3, "score-count") || TextUtils.equals(str3, "score-count-type-1") || TextUtils.equals(str3, "score-count-type-2")) {
                    strOuw = ouw("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(str3) && leVarOuw.odc) {
                    strOuw = ouw("image.0.url");
                }
            }
            if (!TextUtils.isEmpty(ouw()) && (TextUtils.equals("logo-union", strOptString2) || TextUtils.equals("logo", strOptString2))) {
                fkwVar.vt = strOuw + "adx:" + ouw();
            } else {
                fkwVar.vt = strOuw;
            }
            pnoVar2.bly = fkwVar;
        } else {
            str = strOptString;
            jSONObject2 = jSONObjectOuw;
            i10 = 0;
        }
        pnoVar2.f11471cf = pnoVar;
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("children");
        if (jSONArrayOptJSONArray2 == null) {
            pnoVar2.tlj = null;
            return pnoVar2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i11 = i10;
        while (i11 < jSONArrayOptJSONArray2.length()) {
            JSONArray jSONArrayOptJSONArray3 = jSONArrayOptJSONArray2.optJSONArray(i11);
            if (jSONArrayOptJSONArray3 != null) {
                ArrayList arrayList3 = new ArrayList();
                str2 = str;
                if (TextUtils.equals(str2, "tag-group")) {
                    length = pnoVar2.bly.f11431lh.ucs;
                } else {
                    length = jSONArrayOptJSONArray3.length();
                }
                for (int i12 = i10; i12 < length; i12++) {
                    com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVarOuw = ouw(jSONArrayOptJSONArray3.optJSONObject(i12), pnoVar2);
                    if (com.bytedance.sdk.component.adexpress.yu.vt() && "skip-with-time".equals(pnoVar2.bly.ouw) && !C3426d4.i.T.equals(pnoVar2.pno()) && !TextUtils.isEmpty(pnoVar2.pno())) {
                        pnoVarOuw.bly.f11431lh.mwh = pnoVar2.pno();
                    }
                    arrayList.add(pnoVarOuw);
                    arrayList3.add(pnoVarOuw);
                }
                arrayList2.add(arrayList3);
            } else {
                str2 = str;
            }
            i11++;
            str = str2;
        }
        if (arrayList.size() > 0) {
            pnoVar2.tlj = arrayList;
        }
        if (arrayList2.size() > 0) {
            pnoVar2.ryl = arrayList2;
        }
        return pnoVar2;
    }

    private String ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.f11379lh.ouw.containsKey(str2)) {
                String strValueOf = String.valueOf(this.f11379lh.ouw(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    private String ouw() {
        Object objOuw;
        com.bytedance.sdk.component.adexpress.dynamic.yu.lh lhVar = this.f11379lh;
        return (lhVar == null || (objOuw = lhVar.ouw("adx_name")) == null) ? "" : String.valueOf(objOuw);
    }

    private void ouw(com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar) {
        JSONObject jSONObject;
        if (leVar == null) {
            return;
        }
        String str = leVar.f11460vm;
        if (com.bytedance.sdk.component.adexpress.yu.vt()) {
            String strOuw = com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw());
            if ("zh".equals(strOuw)) {
                strOuw = "cn";
            }
            if (!TextUtils.isEmpty(strOuw) && (jSONObject = leVar.yiz) != null) {
                String strOptString = jSONObject.optString(strOuw);
                if (!TextUtils.isEmpty(strOptString)) {
                    str = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iIndexOf = str.indexOf("{{");
        int iIndexOf2 = str.indexOf("}}");
        if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf2 >= iIndexOf) {
            String strOuw2 = ouw(str.substring(iIndexOf + 2, iIndexOf2));
            StringBuilder sb2 = new StringBuilder(str.substring(0, iIndexOf));
            if (!TextUtils.isEmpty(strOuw2)) {
                sb2.append(strOuw2);
            }
            sb2.append(str.substring(iIndexOf2 + 2));
            leVar.f11460vm = sb2.toString();
            return;
        }
        leVar.f11460vm = str;
    }
}
