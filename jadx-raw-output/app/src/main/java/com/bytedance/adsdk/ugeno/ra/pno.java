package com.bytedance.adsdk.ugeno.ra;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class pno extends Handler {
    private final WeakReference<ouw> ouw;

    public interface ouw {
        void ouw(Message message);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ouw ouwVar = this.ouw.get();
        if (ouwVar == null || message == null) {
            return;
        }
        ouwVar.ouw(message);
    }

    public pno(Looper looper, ouw ouwVar) {
        super(looper);
        this.ouw = new WeakReference<>(ouwVar);
    }
}
