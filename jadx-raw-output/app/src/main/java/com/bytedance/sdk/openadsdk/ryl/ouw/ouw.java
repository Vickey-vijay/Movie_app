package com.bytedance.sdk.openadsdk.ryl.ouw;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.bs;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class ouw extends com.bytedance.sdk.component.ouw.lh<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final WeakReference<bs> f13333lh;

    @Override // com.bytedance.sdk.component.ouw.lh
    public final /* synthetic */ void ouw(@NonNull JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        bs bsVar = this.f13333lh.get();
        if (bsVar == null) {
            vt();
        } else {
            bsVar.ouw(jSONObject2, new com.bytedance.sdk.openadsdk.mwh.yu() { // from class: com.bytedance.sdk.openadsdk.ryl.ouw.ouw.2
                @Override // com.bytedance.sdk.openadsdk.mwh.yu
                public final void ouw(boolean z10, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        if (!z10) {
                            ouw.this.vt(jSONObject3);
                        } else {
                            jSONObject3.put("creatives", bs.ouw(ouwVar));
                            ouw.this.vt(jSONObject3);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public ouw(bs bsVar) {
        this.f13333lh = new WeakReference<>(bsVar);
    }
}
