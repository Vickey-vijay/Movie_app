package com.bytedance.sdk.openadsdk.core.cf.vt;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.vpp;

/* JADX INFO: loaded from: classes9.dex */
public final class ouw extends com.bytedance.adsdk.ugeno.bly.le.vt {
    public ouw(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.bly.le.vt
    public final void ryl(String str) {
        super.ryl(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            return;
        }
        try {
            String str2 = String.format(vpp.ouw(this.vt, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((com.bytedance.adsdk.ugeno.bly.le.ouw) this.fkw).setText("(" + str2 + ")");
        } catch (Exception unused) {
        }
    }
}
