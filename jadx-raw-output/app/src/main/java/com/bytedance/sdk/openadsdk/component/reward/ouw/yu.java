package com.bytedance.sdk.openadsdk.component.reward.ouw;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class yu {
    public final com.bytedance.sdk.openadsdk.component.reward.ouw.ouw fkw;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh f12423lh;
    public final vpp ouw;
    public final String vt;
    public boolean yu;

    public interface ouw {
        void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<com.bytedance.sdk.openadsdk.core.lh.lh.ouw> sparseArray, int i10, int i11, int i12);

        void ouw(String str, JSONObject jSONObject);
    }

    public yu(com.bytedance.sdk.openadsdk.component.reward.ouw.ouw ouwVar) {
        this.fkw = ouwVar;
        this.ouw = ouwVar.vt;
        this.vt = ouwVar.fkw;
    }
}
