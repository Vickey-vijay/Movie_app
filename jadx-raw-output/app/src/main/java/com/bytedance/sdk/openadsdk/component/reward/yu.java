package com.bytedance.sdk.openadsdk.component.reward;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.zih;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class yu {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile yu f12490lh;
    public final Context ouw;
    public final com.bytedance.sdk.openadsdk.common.vt.ouw vt;

    public final void ouw(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        vpp vppVarLh;
        if (ouwVar == null || ouwVar.lh() == null || !ouwVar.lh().f12887zn) {
            if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
                com.bytedance.sdk.openadsdk.common.vt.ouw("sp_full_screen_video_new").ouw(adSlot, ouwVar);
                return;
            }
            if (ouwVar == null || adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm()) || (vppVarLh = ouwVar.lh()) == null || vppVarLh.yhj() == 2) {
                return;
            }
            try {
                this.vt.ouw(adSlot, ouwVar.fkw().toString(), ouwVar.ouw());
            } catch (Throwable unused) {
            }
        }
    }

    public final com.bytedance.sdk.openadsdk.core.model.ouw vt(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVarOuw;
        long jYu = this.vt.yu(str);
        boolean zFkw = this.vt.fkw(str);
        boolean zRa = this.vt.ra(str);
        if ((System.currentTimeMillis() - jYu < 10500000) && !zFkw && (!z10 || !zRa)) {
            try {
                String strVt = this.vt.vt(str);
                if (!TextUtils.isEmpty(strVt)) {
                    JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(strVt);
                    if (jSONObjectJsonObjectInit.has("cypher")) {
                        jSONObjectJsonObjectInit = zih.lh().ouw(jSONObjectJsonObjectInit);
                    }
                    if (jSONObjectJsonObjectInit.has("creatives")) {
                        ouwVarOuw = com.bytedance.sdk.openadsdk.core.model.ouw.ouw(jSONObjectJsonObjectInit);
                    } else {
                        vpp vppVarOuw = com.bytedance.sdk.openadsdk.core.vt.ouw(jSONObjectJsonObjectInit);
                        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.model.ouw();
                        ouwVar.ouw(vppVarOuw);
                        ouwVarOuw = ouwVar;
                    }
                    if (ouwVarOuw != null && ouwVarOuw.vt()) {
                        Iterator<vpp> it = ouwVarOuw.yu.iterator();
                        while (it.hasNext()) {
                            vpp next = it.next();
                            if (!(next != null && (od.lh(next) || next.f12874sd != null))) {
                                it.remove();
                            }
                        }
                        if (ouwVarOuw.vt() && ouwVarOuw.lh() != null && ouwVarOuw.lh().yiz != null) {
                            return ouwVarOuw;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private yu(Context context) {
        Context applicationContext;
        if (context == null) {
            applicationContext = zih.ouw();
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.ouw = applicationContext;
        this.vt = new com.bytedance.sdk.openadsdk.common.vt.ouw("sp_full_screen_video");
    }

    public static yu ouw(Context context) {
        if (f12490lh == null) {
            synchronized (yu.class) {
                if (f12490lh == null) {
                    f12490lh = new yu(context);
                }
            }
        }
        return f12490lh;
    }

    public static String ouw(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.common.vt vtVarOuw = com.bytedance.sdk.openadsdk.common.vt.ouw("sp_full_screen_video_new");
        String strLh = vtVarOuw.lh(str);
        if (z10 && !TextUtils.isEmpty(strLh) && vtVarOuw.fkw(str)) {
            return null;
        }
        return strLh;
    }

    public static boolean ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        com.bytedance.sdk.openadsdk.common.vt.ouw("sp_full_screen_video_new");
        return com.bytedance.sdk.openadsdk.common.vt.ouw(ouwVar);
    }
}
