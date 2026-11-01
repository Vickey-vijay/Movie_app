package com.pgl.ssdk;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class a4 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference<a> f43181a;

    public interface a {
        void a(Message message);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        a aVar;
        WeakReference<a> weakReference = this.f43181a;
        if (weakReference == null || (aVar = weakReference.get()) == null || message == null) {
            return;
        }
        aVar.a(message);
    }

    public a4(Looper looper, a aVar) {
        super(looper);
        if (aVar != null) {
            this.f43181a = new WeakReference<>(aVar);
        }
    }
}
