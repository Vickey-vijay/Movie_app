package com.yandex.div.core.util.mask;

import ck.p;
import java.util.List;
import lk.a0;
import nj.r;
import oe.yc;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PhoneInputMask.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PhoneInputMaskKt {
    private static final List<BaseInputMask.MaskKey> DEFAULT_DECODING_MASK_KEY;
    private static final BaseInputMask.MaskData DEFAULT_MASK_DATA;

    static {
        List<BaseInputMask.MaskKey> listE = r.e(new BaseInputMask.MaskKey('0', "\\d", '_'));
        DEFAULT_DECODING_MASK_KEY = listE;
        DEFAULT_MASK_DATA = new BaseInputMask.MaskData(getPhoneMaskPattern(""), listE, false);
    }

    public static final List<BaseInputMask.MaskKey> getDEFAULT_DECODING_MASK_KEY() {
        return DEFAULT_DECODING_MASK_KEY;
    }

    public static final BaseInputMask.MaskData getDEFAULT_MASK_DATA() {
        return DEFAULT_MASK_DATA;
    }

    public static final String getPhoneMaskPattern(String str) throws JSONException {
        if (a0.n0(str)) {
            return "000000000000000";
        }
        JSONObject jSONObject = yc.f65332d;
        int i10 = 0;
        while (!jSONObject.has("value")) {
            String str2 = "*";
            if (i10 >= str.length()) {
                Object obj = jSONObject.get("*");
                p.h(obj, "null cannot be cast to non-null type org.json.JSONObject");
                jSONObject = (JSONObject) obj;
                break;
            }
            int i11 = i10 + 1;
            String strValueOf = String.valueOf(str.charAt(i10));
            if (jSONObject.has(strValueOf)) {
                str2 = strValueOf;
            }
            Object obj2 = jSONObject.get(str2);
            p.h(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj2;
            i10 = i11;
        }
        return jSONObject.getString("value") + "00";
    }
}
