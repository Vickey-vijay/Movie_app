package com.bytedance.adsdk.vt;

import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class mwh<V> {
    public final V ouw;
    public final Throwable vt;

    public mwh(V v10) {
        this.ouw = v10;
        this.vt = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwh)) {
            return false;
        }
        mwh mwhVar = (mwh) obj;
        V v10 = this.ouw;
        if (v10 != null && v10.equals(mwhVar.ouw)) {
            return true;
        }
        Throwable th2 = this.vt;
        if (th2 == null || mwhVar.vt == null) {
            return false;
        }
        return th2.toString().equals(this.vt.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.ouw, this.vt});
    }

    public mwh(Throwable th2) {
        this.vt = th2;
        this.ouw = null;
    }
}
