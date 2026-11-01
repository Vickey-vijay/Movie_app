package com.bytedance.sdk.component.adexpress.dynamic.fkw;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.vpp;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class cf {
    private static final Set<String> ouw = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));
    private static String vt;

    public static String ouw(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static double vt(String str) {
        try {
            return Double.parseDouble(PangleVideoBridge.jsonObjectInit(str).optString("fontSize"));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static boolean vt() {
        return !TextUtils.isEmpty(vt);
    }

    private static vt.lh ouw(vt.lh lhVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            lhVar.ouw = 0.0f;
            lhVar.vt = 0.0f;
        } else {
            if (TextUtils.isEmpty(str3)) {
                str3 = ouw(str);
            }
            if (TextUtils.isEmpty(str3)) {
                lhVar.ouw = 0.0f;
                lhVar.vt = 0.0f;
            } else {
                return ouw(str3, str2);
            }
        }
        return lhVar;
    }

    private static vt.lh ouw(String str, String str2) {
        vt.lh lhVar = new vt.lh();
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str2);
            int[] iArrOuw = ouw(str, (float) vt(str2), false);
            int iVt = com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), iArrOuw[1]);
            lhVar.ouw = new int[]{com.bytedance.sdk.component.adexpress.yu.ra.vt(com.bytedance.sdk.component.adexpress.yu.ouw(), iArrOuw[0]), iVt}[0];
            lhVar.vt = iVt;
            if (jSONObjectJsonObjectInit.optDouble("lineHeight", 1.0d) == 0.0d) {
                lhVar.vt = 0.0f;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return lhVar;
    }

    public static int[] ouw(String str, float f10, boolean z10) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.yu.ouw());
            textView.setTextSize(f10);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z10) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static String ouw() {
        return vt;
    }

    /* JADX WARN: Code duplicated, block: B:224:0x0464  */
    /* JADX WARN: Code duplicated, block: B:227:0x0472 A[Catch: Exception -> 0x0482, TryCatch #4 {Exception -> 0x0482, blocks: (B:225:0x0468, B:227:0x0472, B:232:0x047b), top: B:285:0x0468 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x047a  */
    public static vt.lh ouw(String str, String str2, String str3, boolean z10, boolean z11, int i10, com.bytedance.sdk.component.adexpress.dynamic.yu.pno pnoVar, double d10, int i11, double d11, mwh mwhVar) {
        int i12;
        int i13;
        float f10;
        float f11;
        vt.lh lhVarOuw;
        int i14;
        com.bytedance.sdk.component.adexpress.dynamic.yu.le leVar;
        String strOptString = str;
        int i15 = i10;
        String str4 = mwhVar.ouw;
        int i16 = mwhVar.zih;
        if (com.bytedance.sdk.component.adexpress.yu.vt() && i11 != 4 && (TextUtils.equals(str2, "text_star") || TextUtils.equals(str2, "score-count") || TextUtils.equals(str2, "score-count-type-1") || TextUtils.equals(str2, "score-count-type-2"))) {
            return new vt.lh(0.0f, 0.0f);
        }
        vt.lh lhVar = new vt.lh();
        if (!strOptString.startsWith("<svg") && !ouw.contains(str2)) {
            if ("logo".equals(str2)) {
                if (!com.bytedance.sdk.component.adexpress.yu.vt() && ((!TextUtils.isEmpty(str) && strOptString.contains("adx:")) || vt())) {
                    if (vt()) {
                        return ouw(lhVar, strOptString, str3, vt);
                    }
                    return ouw(lhVar, strOptString, str3, "");
                }
                lhVar.ouw = "union".equals(strOptString) ? 14.0f : 20.0f;
                lhVar.vt = 10.0f;
                if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                    String str5 = mwhVar.ksc;
                    if ("union".equals(strOptString) && TextUtils.isEmpty(str5)) {
                        lhVar.ouw = 0.0f;
                    }
                    String str6 = str2 + strOptString;
                    float fVt = (float) vt(str3);
                    if (str6.contains("logoad")) {
                        String str7 = mwhVar.jae;
                        if (TextUtils.isEmpty(str7)) {
                            lhVar.ouw = 0.0f;
                        } else {
                            return ouw(str7, str3);
                        }
                    }
                    lhVar.vt = fVt;
                }
                return lhVar;
            }
            if ("development-name".equals(str2)) {
                strOptString = vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_text_privacy_development") + strOptString;
            }
            if ("app-version".equals(str2)) {
                strOptString = vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_text_privacy_app_version") + strOptString;
            }
            if ("score-count".equals(str2)) {
                try {
                    i12 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused) {
                    i12 = 0;
                }
                if (com.bytedance.sdk.component.adexpress.yu.vt() && i12 < 0) {
                    return new vt.lh(0.0f, 0.0f);
                }
                return ouw("(" + String.format(vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_comment_num"), Integer.valueOf(i12)) + ")", str3);
            }
            if ("score-count-type-2".equals(str2)) {
                try {
                    i13 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused2) {
                    i13 = 0;
                }
                if (com.bytedance.sdk.component.adexpress.yu.vt() && i13 < 0) {
                    return new vt.lh(0.0f, 0.0f);
                }
                return ouw("(" + String.format(new DecimalFormat("###,###,###").format(i13), Integer.valueOf(i13)) + ")", str3);
            }
            if ("feedback-dislike".equals(str2) && com.bytedance.sdk.component.adexpress.yu.vt()) {
                vt.lh lhVar2 = new vt.lh();
                float fVt2 = (float) vt(str3);
                lhVar2.ouw = fVt2;
                lhVar2.vt = fVt2;
                return lhVar2;
            }
            if (!"skip-with-time-countdown".equals(str2) && !TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
                if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
                    return ouw("| " + vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_reward_screen_skip_tx"), str3);
                }
                if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
                    return ouw("| ".concat(String.valueOf(String.format(vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_reward_full_skip_count_down"), "00"))), str3);
                }
                if ("skip-with-time-skip-btn".equals(str2)) {
                    vt.lh lhVarOuw2 = ouw("| " + vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_reward_screen_skip_tx"), str3);
                    if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                        try {
                            lhVarOuw2.vt = (float) ((((double) lhVarOuw2.vt) * PangleVideoBridge.jsonObjectInit(str3).optDouble("lineHeight")) / 1.2d);
                        } catch (Throwable unused3) {
                        }
                        lhVarOuw2.ouw = lhVarOuw2.vt;
                    }
                    return lhVarOuw2;
                }
                if ("skip".equals(str2)) {
                    return ouw(vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_reward_screen_skip_tx"), str3);
                }
                if ("timedown".equals(str2)) {
                    return ouw("0.0", str3);
                }
                if ("text_star".equals(str2)) {
                    if (com.bytedance.sdk.component.adexpress.yu.vt() && (d11 < 0.0d || d11 > 5.0d)) {
                        return new vt.lh(0.0f, 0.0f);
                    }
                    return ouw("0.0", str3);
                }
                if (TextUtils.equals("privacy-detail", str2)) {
                    return ouw("Permission list | Privacy policy", str3);
                }
                if ("arrowButton".equals(str2)) {
                    return ouw("Download", str3);
                }
                if ("text".equals(str2) && com.bytedance.sdk.component.adexpress.yu.vt() && TextUtils.isEmpty(strOptString) && (leVar = pnoVar.bly.f11431lh) != null) {
                    JSONObject jSONObject = leVar.f11441kn;
                    strOptString = jSONObject != null ? jSONObject.optString(com.bytedance.sdk.component.adexpress.yu.ra.ouw(com.bytedance.sdk.component.adexpress.yu.ouw())) : "";
                }
                if (!"fillButton".equals(str2) && !"text".equals(str2) && !"button".equals(str2) && !"downloadWithIcon".equals(str2) && !"downloadButton".equals(str2) && !"laceButton".equals(str2) && !"cardButton".equals(str2) && !"colourMixtureButton".equals(str2) && !"arrowButton".equals(str2) && ((!"source".equals(str2) || (com.bytedance.sdk.component.adexpress.yu.vt() && "open_ad".equals(str4))) && !TextUtils.equals("app-version", str2) && !TextUtils.equals("development-name", str2))) {
                    try {
                        JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str3);
                        int length = strOptString.length();
                        float fOptDouble = (float) jSONObjectJsonObjectInit.optDouble("fontSize");
                        float fOptDouble2 = (float) jSONObjectJsonObjectInit.optDouble("letterSpacing");
                        float fOptDouble3 = (float) jSONObjectJsonObjectInit.optDouble("lineHeight");
                        float fOptDouble4 = (float) jSONObjectJsonObjectInit.optDouble("maxWidth");
                        float f12 = (length * (fOptDouble + fOptDouble2)) - fOptDouble2;
                        ko.fkw("DynamicBaseWidget", "getDomSizeFromNative letterSpacing==" + fOptDouble2 + ",lineHeight==" + fOptDouble3 + ",maxWidth ==" + fOptDouble4 + ",totalStrLength" + f12);
                        if ("muted".equals(str2)) {
                            lhVar.ouw = fOptDouble;
                            lhVar.vt = fOptDouble;
                            return lhVar;
                        }
                        if ("star".equals(str2)) {
                            if (com.bytedance.sdk.component.adexpress.yu.vt() && (d11 < 0.0d || d11 > 5.0d || i11 != 4)) {
                                return new vt.lh(0.0f, 0.0f);
                            }
                            vt.lh lhVarOuw3 = ouw("str", str3);
                            lhVarOuw3.ouw = fOptDouble * 5.0f;
                            return lhVarOuw3;
                        }
                        if ("icon".equals(str2)) {
                            lhVar.ouw = fOptDouble;
                            lhVar.vt = fOptDouble;
                            return lhVar;
                        }
                        if (!z10) {
                            f10 = (float) (((double) (fOptDouble3 * fOptDouble)) * 1.2d);
                            if (f12 <= fOptDouble4) {
                                f11 = f12;
                            }
                            if (!"title".equals(str2) || (com.bytedance.sdk.component.adexpress.yu.vt() && "open_ad".equals(str4) && "source".equals(str2))) {
                                try {
                                    lhVarOuw = ouw(strOptString.replace('\n', ' '), str3);
                                    if (z10) {
                                        i14 = ((int) (f12 / fOptDouble4)) + 1;
                                        if (z11 || i14 < i15) {
                                            i15 = i14;
                                        }
                                        lhVarOuw.vt *= i15;
                                    }
                                    return lhVarOuw;
                                } catch (Exception unused4) {
                                }
                            }
                            lhVar.ouw = f11;
                            lhVar.vt = f10;
                            return lhVar;
                        }
                        int i17 = ((int) (f12 / fOptDouble4)) + 1;
                        if (z11 && i17 >= i15) {
                            i17 = i15;
                        }
                        f10 = (float) (((double) (fOptDouble3 * fOptDouble * i17)) * 1.2d);
                        f11 = fOptDouble4;
                        if (!"title".equals(str2)) {
                            lhVarOuw = ouw(strOptString.replace('\n', ' '), str3);
                            if (z10) {
                                i14 = ((int) (f12 / fOptDouble4)) + 1;
                                if (z11) {
                                    i15 = i14;
                                } else {
                                    i15 = i14;
                                }
                                lhVarOuw.vt *= i15;
                            }
                            return lhVarOuw;
                        }
                        lhVarOuw = ouw(strOptString.replace('\n', ' '), str3);
                        if (z10) {
                            i14 = ((int) (f12 / fOptDouble4)) + 1;
                            if (z11) {
                                i15 = i14;
                            } else {
                                i15 = i14;
                            }
                            lhVarOuw.vt *= i15;
                        }
                        return lhVarOuw;
                        return lhVar;
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                } else {
                    return ouw(strOptString, str3);
                }
            } else {
                if (!mwhVar.f11604vm || !com.bytedance.sdk.component.adexpress.yu.le.ouw(str4)) {
                    if (d10 < 10.0d) {
                        return ouw("0S", str3);
                    }
                    return ouw("00S", str3);
                }
                if (((int) (d10 + 0.5d)) - i16 < 10) {
                    if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                        return ouw("0s", str3);
                    }
                    return ouw(String.format(vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_reward_full_skip"), "0"), str3);
                }
                if (com.bytedance.sdk.component.adexpress.yu.vt()) {
                    return ouw("00s", str3);
                }
                return ouw(String.format(vpp.ouw(com.bytedance.sdk.component.adexpress.yu.ouw(), "tt_reward_full_skip"), "00"), str3);
            }
        } else {
            try {
                if ("close".equals(str2) || (com.bytedance.sdk.component.adexpress.yu.vt() && "close-fill".equals(str2))) {
                    float fOptDouble5 = (float) PangleVideoBridge.jsonObjectInit(str3).optDouble("fontSize");
                    lhVar.ouw = fOptDouble5;
                    lhVar.vt = fOptDouble5;
                    return lhVar;
                }
            } catch (Exception unused5) {
            }
            lhVar.ouw = 10.0f;
            lhVar.vt = 10.0f;
            return lhVar;
        }
    }
}
