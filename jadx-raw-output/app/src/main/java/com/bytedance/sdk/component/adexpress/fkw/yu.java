package com.bytedance.sdk.component.adexpress.fkw;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.ouw.qbp;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes8.dex */
public final class yu {
    private WeakReference<qbp> ouw;

    @JavascriptInterface
    public final void invokeMethod(String str) {
        WeakReference<qbp> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get().invokeMethod(str);
    }

    public final void ouw(qbp qbpVar) {
        this.ouw = new WeakReference<>(qbpVar);
    }

    public yu(qbp qbpVar) {
        this.ouw = new WeakReference<>(qbpVar);
    }
}
