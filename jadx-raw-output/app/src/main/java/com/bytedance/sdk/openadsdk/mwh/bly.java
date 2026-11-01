package com.bytedance.sdk.openadsdk.mwh;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes9.dex */
public final class bly {
    public final AudioManager ouw;
    public int vt = -1;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public boolean f13268lh = false;

    public bly(Context context) {
        this.ouw = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }
}
