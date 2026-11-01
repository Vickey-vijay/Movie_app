package com.bytedance.sdk.openadsdk.core.cf.vt;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes11.dex */
public final class yu extends com.bytedance.adsdk.ugeno.bly.lh.ouw {
    public yu(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.bly.lh.ouw
    public final String ryl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "unmuted":
                return "tt_reward_full_unmute";
            case "feedback":
                return "tt_reward_full_feedback";
            case "right_arrow":
                return "tt_skip_btn";
            case "logo":
                return "tt_ad_logo";
            case "close":
                return "tt_close_btn";
            case "muted":
                return "tt_reward_full_mute";
            default:
                return null;
        }
    }
}
