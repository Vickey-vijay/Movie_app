package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class jae extends Handler {
    public WeakReference<ouw> vt;

    public interface ouw {
        void ouw(Message message);
    }

    public jae(ouw ouwVar) {
        this.vt = new WeakReference<>(ouwVar);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        ouw ouwVar;
        WeakReference<ouw> weakReference = this.vt;
        if (weakReference == null || (ouwVar = weakReference.get()) == null || message == null) {
            return;
        }
        ouwVar.ouw(message);
    }

    public jae(Looper looper, ouw ouwVar) {
        super(looper);
        if (ouwVar != null) {
            this.vt = new WeakReference<>(ouwVar);
        }
    }
}
