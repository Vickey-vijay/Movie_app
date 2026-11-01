package com.bytedance.adsdk.ouw;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public final class rn {
    public static bly ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "toNumber":
                return new mwh();
            case "toString":
                return new jg();
            case "formatDecimal":
                return new ra();
            case "modArray":
                return new tlj();
            case "find":
                return new le();
            case "size":
                return new cf();
            case "chunk":
                return new ouw();
            case "exist":
                return new fkw();
            case "split":
                return new ryl();
            case "decodeUrl":
                return new vt();
            case "translate":
                return new ko();
            case "encodeUrl":
                return new yu();
            case "isDigit":
                return new pno();
            default:
                return null;
        }
    }
}
