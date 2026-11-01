package com.bytedance.sdk.component.adexpress.dynamic.yu;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class bly {
    public float ouw;
    public float vt;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bly.class == obj.getClass()) {
            bly blyVar = (bly) obj;
            if (Float.compare(blyVar.ouw, this.ouw) == 0 && Float.compare(blyVar.vt, this.vt) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.ouw), Float.valueOf(this.vt)});
    }

    public bly(float f10, float f11) {
        this.ouw = f10;
        this.vt = f11;
    }
}
