package com.bytedance.adsdk.ugeno.bly.ra;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ouw extends com.bytedance.adsdk.ugeno.vt.ouw<com.bytedance.adsdk.ugeno.bly.vt.ouw> {
    public ouw(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public void ouw(String str, String str2) {
        super.ouw(str, str2);
        str.hashCode();
        switch (str) {
            case "onVideoProgress":
            case "onVideoFinish":
            case "onVideoPlay":
            case "onVideoResume":
            case "onVideoPause":
                vt(str, str2);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.ouw, com.bytedance.adsdk.ugeno.vt.lh
    public void vt() {
        super.vt();
    }
}
