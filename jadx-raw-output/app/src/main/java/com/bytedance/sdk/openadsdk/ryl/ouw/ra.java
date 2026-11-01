package com.bytedance.sdk.openadsdk.ryl.ouw;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.bs;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ra extends com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject> {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final bs f13336lh;
    private final String yu;

    @Override // com.bytedance.sdk.component.ouw.yu
    @Nullable
    public final /* synthetic */ JSONObject ouw(String str, @NonNull JSONObject jSONObject) throws Exception {
        bs.vt vtVar = new bs.vt();
        vtVar.ouw = NotificationCompat.CATEGORY_CALL;
        vtVar.f12595lh = this.yu;
        vtVar.yu = jSONObject;
        return this.f13336lh.ouw(vtVar, 3);
    }

    public ra(String str, bs bsVar) {
        this.f13336lh = bsVar;
        this.yu = str;
    }
}
