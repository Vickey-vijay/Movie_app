package com.bytedance.adsdk.vt.ra;

import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: loaded from: classes2.dex */
public final class lh {
    public float ouw;
    public float vt;

    public lh(float f10, float f11) {
        this.ouw = f10;
        this.vt = f11;
    }

    public final String toString() {
        return this.ouw + VastAttributes.HORIZONTAL_POSITION + this.vt;
    }

    public lh() {
        this(1.0f, 1.0f);
    }
}
