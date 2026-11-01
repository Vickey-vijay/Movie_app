package com.bytedance.adsdk.ugeno.core.vt;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.ko;
import com.bytedance.adsdk.ugeno.core.mwh;
import com.bytedance.adsdk.ugeno.core.tlj;
import com.bytedance.adsdk.ugeno.ra.pno;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class vt implements pno.ouw {
    public Handler fkw = new pno(Looper.getMainLooper(), this);

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private Context f10844le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public mwh f10845lh;
    public int ouw;
    public ko vt;
    public com.bytedance.adsdk.ugeno.vt.lh yu;

    @Override // com.bytedance.adsdk.ugeno.ra.pno.ouw
    public final void ouw(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject jSONObject = this.f10845lh.f10810lh;
        if (TextUtils.equals(jSONObject.optString("type"), "onAnimation")) {
            com.bytedance.adsdk.ugeno.vt.lh lhVarFkw = com.bytedance.adsdk.ugeno.vt.lh.vt(this.yu).fkw(jSONObject.optString("nodeId"));
            new tlj(lhVarFkw.fkw, com.bytedance.adsdk.ugeno.core.ouw.ouw(jSONObject.optJSONObject("animatorSet"), null, lhVarFkw)).ouw();
        } else {
            ko koVar = this.vt;
            if (koVar != null) {
                koVar.ouw(this.f10845lh, this.yu);
            }
        }
        this.fkw.removeMessages(1001);
    }

    public vt(Context context, mwh mwhVar, com.bytedance.adsdk.ugeno.vt.lh lhVar) {
        this.f10844le = context;
        this.f10845lh = mwhVar;
        this.yu = lhVar;
    }
}
