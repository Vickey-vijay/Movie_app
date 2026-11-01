package com.bytedance.sdk.openadsdk.ryl.ouw;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.bs;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lh extends com.bytedance.sdk.component.ouw.lh<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final WeakReference<bs> f13331lh;

    @Override // com.bytedance.sdk.component.ouw.lh
    public final /* synthetic */ void ouw(@NonNull JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        bs bsVar = this.f13331lh.get();
        if (bsVar == null) {
            vt();
        } else {
            bsVar.vt(jSONObject2);
        }
    }

    public lh(bs bsVar) {
        this.f13331lh = new WeakReference<>(bsVar);
    }
}
