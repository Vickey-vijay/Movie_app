package com.bytedance.sdk.openadsdk.core.cf.yu;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.adsdk.ugeno.core.rn;
import com.bytedance.adsdk.ugeno.core.ryl;
import com.bytedance.adsdk.ugeno.vt.lh;
import com.bytedance.adsdk.ugeno.yu.le;
import com.bytedance.sdk.openadsdk.core.cf.ra.yu;
import com.ironsource.C3426d4;
import com.ironsource.Q6;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ouw implements ko, rn {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final Context f12672lh;
    public InterfaceC0122ouw ouw;
    public rn vt;
    private lh<View> yu;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.cf.yu.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0122ouw {
        void ouw(mwh mwhVar);
    }

    @Override // com.bytedance.adsdk.ugeno.core.ko
    public final void ouw(lh lhVar, le.ouw ouwVar) {
    }

    public final void ouw(JSONObject jSONObject, JSONObject jSONObject2, yu yuVar) {
        try {
            ryl rylVar = new ryl(this.f12672lh);
            lh<View> lhVarOuw = rylVar.ouw(jSONObject);
            this.yu = lhVarOuw;
            if (lhVarOuw == null) {
                if (yuVar != null) {
                    yuVar.ouw(3000, "ugen render fail");
                    return;
                }
                return;
            }
            T t10 = lhVarOuw.fkw;
            if (t10 != 0) {
                t10.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.cf.yu.ouw.2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/cf/yu/ouw$2;->onClick(Landroid/view/View;)V");
                        CreativeInfoManager.onViewClicked(g.f44975u, view);
                        safedk_ouw$2_onClick_49efb67bdd915358d8aea8d34a5b2e1d(view);
                    }

                    public void safedk_ouw$2_onClick_49efb67bdd915358d8aea8d34a5b2e1d(View p10) {
                    }
                });
            }
            rylVar.ouw(this);
            rylVar.ouw = this;
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("language", com.bytedance.sdk.openadsdk.core.ryl.vt());
                    jSONObject2.put(Q6.F, C3426d4.f28386d);
                } catch (JSONException unused) {
                }
            }
            rylVar.vt(jSONObject2);
            if (yuVar != null) {
                yuVar.ouw(this.yu);
            }
        } catch (Exception e10) {
            if (yuVar != null) {
                yuVar.ouw(3000, "ugen render fail exception is" + e10.getMessage());
            }
        }
    }

    public ouw(Context context) {
        this.f12672lh = context;
    }

    @Override // com.bytedance.adsdk.ugeno.core.rn
    public final void ouw(lh lhVar, MotionEvent motionEvent) {
        rn rnVar = this.vt;
        if (rnVar != null) {
            rnVar.ouw(lhVar, motionEvent);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.ko
    public final void ouw(mwh mwhVar, ko.ouw ouwVar) {
        InterfaceC0122ouw interfaceC0122ouw;
        mwh mwhVar2;
        if (mwhVar == null) {
            return;
        }
        int i10 = mwhVar.vt;
        if ((i10 == 1 || i10 == 4) && (interfaceC0122ouw = this.ouw) != null) {
            interfaceC0122ouw.ouw(mwhVar);
        }
        if (ouwVar == null || (mwhVar2 = mwhVar.yu) == null) {
            return;
        }
        ouwVar.ouw(mwhVar2);
    }
}
