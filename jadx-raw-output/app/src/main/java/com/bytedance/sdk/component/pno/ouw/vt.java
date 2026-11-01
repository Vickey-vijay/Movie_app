package com.bytedance.sdk.component.pno.ouw;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.jae;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class vt extends jae implements lh {
    public final HandlerThread ouw;

    @Override // com.bytedance.sdk.component.pno.ouw.lh
    public final void ouw() {
        removeCallbacksAndMessages(null);
        WeakReference<jae.ouw> weakReference = this.vt;
        if (weakReference != null) {
            weakReference.clear();
            this.vt = null;
        }
    }

    public vt(HandlerThread handlerThread, jae.ouw ouwVar) {
        super(handlerThread.getLooper(), ouwVar);
        this.ouw = handlerThread;
    }

    public final void ouw(jae.ouw ouwVar) {
        this.vt = new WeakReference<>(ouwVar);
    }
}
