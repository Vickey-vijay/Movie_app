package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes3.dex */
public final class cf extends YogaNodeJNIBase {
    public final void finalize() throws Throwable {
        try {
            long j10 = this.ouw;
            if (j10 != 0) {
                this.ouw = 0L;
                YogaNative.jni_YGNodeFinalizeJNI(j10);
            }
        } finally {
            super.finalize();
        }
    }
}
