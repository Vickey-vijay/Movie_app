package com.bytedance.sdk.openadsdk.core.cf.le;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.component.utils.vm;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.utils.uoy;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class fkw {
    public JSONObject bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public boolean f12600cf;
    public com.bytedance.adsdk.ugeno.vt.lh fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public JSONArray f12601jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final vpp f12603le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.adsdk.ugeno.vt.lh f12604lh;
    public boolean mwh;
    public com.bytedance.sdk.openadsdk.core.widget.fkw pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public final String f12605ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final Context f12606rn;
    public boolean ryl;
    public final JSONObject tlj;
    public com.bytedance.adsdk.ugeno.vt.lh yu;
    public int ouw = -1;
    public int vt = -1;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final String f12602ko = "UGenSwiperEvent";

    public final void ouw(boolean z10, boolean z11, boolean z12) {
        com.bytedance.adsdk.ugeno.vt.lh lhVar;
        com.bytedance.adsdk.ugeno.vt.lh lhVar2 = this.f12604lh;
        if (lhVar2 == null || (lhVar = this.yu) == null) {
            return;
        }
        T t10 = lhVar2.fkw;
        T t11 = lhVar.fkw;
        JSONArray jSONArray = this.f12601jg;
        if (jSONArray != null && jSONArray.length() == 1) {
            t10.setVisibility(8);
            t11.setVisibility(8);
            return;
        }
        if (z10) {
            return;
        }
        if (z11) {
            if (t10 instanceof TextView) {
                ouw((TextView) t10, 90);
            }
            if (t11 instanceof TextView) {
                ouw((TextView) t11, 255);
                return;
            }
            return;
        }
        if (z12) {
            if (t10 instanceof TextView) {
                ouw((TextView) t10, 255);
            }
            if (t11 instanceof TextView) {
                ouw((TextView) t11, 90);
                return;
            }
            return;
        }
        if (t10 instanceof TextView) {
            ouw((TextView) t10, 255);
        }
        if (t11 instanceof TextView) {
            ouw((TextView) t11, 255);
        }
    }

    public fkw(Context context, vpp vppVar, String str, JSONObject jSONObject) {
        this.f12606rn = context;
        this.f12603le = vppVar;
        this.f12605ra = str;
        this.tlj = jSONObject;
    }

    private static void ouw(TextView textView, int i10) {
        int currentTextColor = textView.getCurrentTextColor();
        textView.setTextColor(Color.argb(i10, Color.red(currentTextColor), Color.green(currentTextColor), Color.blue(currentTextColor)));
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c7 A[Catch: all -> 0x00f7, TryCatch #1 {all -> 0x00f7, blocks: (B:6:0x0015, B:8:0x0019, B:10:0x0021, B:14:0x0031, B:17:0x0039, B:20:0x006a, B:22:0x0072, B:23:0x0076, B:25:0x007c, B:29:0x0099, B:50:0x00d4, B:52:0x00da, B:54:0x00df, B:36:0x00b3, B:38:0x00b9, B:41:0x00c0, B:44:0x00c7), top: B:64:0x0015 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    public final boolean ouw(mwh mwhVar) {
        JSONObject jSONObjectOptJSONObject;
        boolean z10;
        this.bly = null;
        int i10 = this.vt;
        if (i10 != -1 && i10 != 0) {
            try {
                JSONObject jSONObject = mwhVar.f10810lh;
                if (jSONObject != null && (jSONObjectOptJSONObject = jSONObject.optJSONObject("related_dpa_click")) != null) {
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enableOpenExternalUrl");
                    int iOptInt = jSONObjectOptJSONObject.optInt("landingStyle");
                    if (zOptBoolean && iOptInt != -1) {
                        if (this.f12601jg != null) {
                            String strOuw = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObjectOptJSONObject.optString("url"), this.f12601jg.optJSONObject(this.vt));
                            String strOuw2 = com.bytedance.adsdk.ugeno.lh.vt.ouw(jSONObjectOptJSONObject.optString("fallback_url"), this.f12601jg.optJSONObject(this.vt));
                            jSONObjectOptJSONObject.put("url", strOuw);
                            jSONObjectOptJSONObject.put("fallback_url", strOuw2);
                            JSONObject jSONObjectOptJSONObject2 = this.f12601jg.optJSONObject(this.vt);
                            if (jSONObjectOptJSONObject2 != null) {
                                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("clickInfo");
                                this.bly = jSONObjectOptJSONObject3;
                                if (jSONObjectOptJSONObject3 != null) {
                                    Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                                    while (itKeys.hasNext()) {
                                        String next = itKeys.next();
                                        this.bly.putOpt(next, com.bytedance.adsdk.ugeno.lh.vt.ouw((String) this.bly.opt(next), jSONObjectOptJSONObject2));
                                    }
                                    try {
                                        jSONObjectOptJSONObject.putOpt("clickInfo", this.bly);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                        T t10 = mwhVar.ouw.fkw;
                        int iOptInt2 = jSONObjectOptJSONObject.optInt("landingStyle");
                        String strOptString = jSONObjectOptJSONObject.optString("url");
                        String strOptString2 = jSONObjectOptJSONObject.optString("fallback_url");
                        if (iOptInt2 != 1) {
                            if (iOptInt2 != 2) {
                                if (iOptInt2 == 3) {
                                    if (vm.ouw(strOptString)) {
                                        z10 = false;
                                    }
                                }
                            } else if ((TextUtils.isEmpty(strOptString) && TextUtils.isEmpty(strOptString2)) || !vm.ouw(strOptString2)) {
                                z10 = false;
                            }
                            z10 = true;
                        } else if (vm.ouw(strOptString)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            Activity activityOuw = t10 != 0 ? com.bytedance.sdk.component.utils.vt.ouw(t10) : null;
                            com.bytedance.sdk.openadsdk.core.vm.ouw(activityOuw == null ? this.f12606rn : activityOuw, this.f12606rn instanceof Activity, jSONObjectOptJSONObject, this.f12603le, this.f12605ra, uoy.ouw(this.f12605ra), null, this.pno);
                        }
                        return true;
                    }
                    return false;
                }
            } catch (Throwable th2) {
                qbp.lh("UGenSwiperEvent", th2.getMessage());
            }
        }
        return false;
    }
}
