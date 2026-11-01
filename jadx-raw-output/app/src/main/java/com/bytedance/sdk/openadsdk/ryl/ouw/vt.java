package com.bytedance.sdk.openadsdk.ryl.ouw;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.bs;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class vt extends com.bytedance.sdk.component.ouw.lh<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final WeakReference<bs> f13340lh;

    public vt(bs bsVar) {
        this.f13340lh = new WeakReference<>(bsVar);
    }

    @Override // com.bytedance.sdk.component.ouw.lh
    public final /* synthetic */ void ouw(@NonNull JSONObject jSONObject) throws Exception {
        com.bytedance.sdk.openadsdk.core.bly.ouw().jg();
        bs bsVar = this.f13340lh.get();
        if (bsVar == null) {
            com.bytedance.sdk.component.utils.ko.fkw("DoInterstitialWebViewCloseMethod", "invoke error");
            vt();
        } else {
            com.bytedance.sdk.openadsdk.core.bly.ko koVar = bsVar.f12579cf;
            if (koVar != null) {
                koVar.lh();
            }
        }
    }
}
