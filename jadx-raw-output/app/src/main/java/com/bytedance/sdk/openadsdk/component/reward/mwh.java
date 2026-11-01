package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTClientBidding;

/* JADX INFO: loaded from: classes11.dex */
public final class mwh implements TTClientBidding {
    public final le ouw;

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public final void loss(Double d10, String str, String str2) {
        this.ouw.loss(d10, str, str2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public final void win(Double d10) {
        this.ouw.win(d10);
    }

    public mwh(Context context, com.bytedance.sdk.openadsdk.core.model.ouw ouwVar) {
        this.ouw = new le(context, ouwVar);
    }
}
