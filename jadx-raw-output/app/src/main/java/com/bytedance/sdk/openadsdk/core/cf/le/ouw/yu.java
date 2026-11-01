package com.bytedance.sdk.openadsdk.core.cf.le.ouw;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.bly.ex;
import com.bytedance.sdk.openadsdk.core.cf.le.ra;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.safedk.android.internal.partials.PangleVideoBridge;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class yu extends ra {
    private static Boolean ksc;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private final vt f12612tc;

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.ra, com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final JSONObject ouw() {
        vt vtVar = this.f12612tc;
        if (vtVar != null) {
            try {
                return PangleVideoBridge.jsonObjectInit(vtVar.ouw());
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.yu, com.bytedance.sdk.component.adexpress.vt.yu
    public final int vt() {
        return 1;
    }

    private boolean ryl() {
        vpp vppVar = this.fkw;
        if (vppVar == null) {
            return false;
        }
        int i10 = vppVar.lna;
        boolean z10 = i10 == 7 || i10 == 8;
        int i11 = vppVar.fvf;
        return z10 && (i11 == 43 || i11 == 44);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.ra, com.bytedance.sdk.openadsdk.core.cf.le.yu
    public final com.bytedance.adsdk.ugeno.vt.lh bly() {
        com.bytedance.adsdk.ugeno.vt.lh<View> lhVar = this.f12626lh;
        if (lhVar == null) {
            return null;
        }
        return lhVar.ra("VideoV3");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    public yu(Context context, vpp vppVar, boolean z10, com.bytedance.sdk.openadsdk.core.cf.le.ouw ouwVar, ViewGroup viewGroup, float f10, float f11, boolean z11, String str) {
        vt ouwVar2;
        super(context, vppVar, z10, ouwVar, viewGroup);
        boolean z12 = true;
        if (vppVar != null) {
            int i10 = vppVar.lna;
            if (i10 != 1) {
                if (i10 == 7 || i10 == 8) {
                    ouwVar2 = new lh(vppVar);
                } else {
                    ouwVar2 = null;
                }
            } else {
                ouwVar2 = new ouw(vppVar, ouwVar);
            }
        } else {
            ouwVar2 = null;
        }
        this.f12612tc = ouwVar2;
        this.vpp = str;
        JSONObject jSONObjectOuw = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(f10, f11, z11, vppVar, str);
        this.ex = jSONObjectOuw;
        if (jSONObjectOuw != null) {
            try {
                JSONObject jSONObjectOptJSONObject = jSONObjectOuw.optJSONObject("xSize");
                if (jSONObjectOptJSONObject != null) {
                    vpp vppVar2 = this.fkw;
                    float f12 = 1.0f;
                    if (vppVar2 != null) {
                        int i11 = vppVar2.ucs;
                        if (i11 == 3) {
                            f12 = 1.91f;
                        } else if (i11 == 5) {
                            f12 = 1.78f;
                        } else if (i11 != 15 && i11 != 173) {
                            if (i11 != 33 && i11 != 50) {
                                if (i11 == 1010) {
                                    f12 = 1.2f;
                                } else if (i11 == 1011) {
                                    f12 = 6.4f;
                                } else if (i11 == 1012) {
                                    f12 = 3.2f;
                                }
                            }
                        } else {
                            f12 = 0.5625f;
                        }
                    }
                    jSONObjectOptJSONObject.put("imageModeRatio", f12);
                }
                JSONObject jSONObjectOptJSONObject2 = this.ex.optJSONObject("xAdInfo");
                if (jSONObjectOptJSONObject2 != null) {
                    jSONObjectOptJSONObject2.put("isVideoImageMode", vpp.fkw(this.fkw));
                    if (this.fkw == null || !ryl() || !od.lh(this.fkw)) {
                        z12 = false;
                    }
                    jSONObjectOptJSONObject2.put("feed_draw_purePlayable", z12);
                    jSONObjectOptJSONObject2.put("isFeedDraw", ryl());
                }
                if (ouwVar2 != null) {
                    ouwVar2.ouw(this.ex);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.le.ra
    public final JSONObject ouw(pd pdVar) {
        vt vtVar = this.f12612tc;
        if (vtVar != null) {
            return vtVar.vt();
        }
        return null;
    }

    public static boolean ouw(String str) {
        if (ksc == null) {
            ksc = Boolean.valueOf(com.bytedance.sdk.openadsdk.vpp.ouw.ouw("express_backup_type", 0) == 1);
        }
        return ksc.booleanValue() && (TextUtils.equals(str, "fullscreen_interstitial_ad") || TextUtils.equals(str, "rewarded_video") || ex.vt(str));
    }
}
