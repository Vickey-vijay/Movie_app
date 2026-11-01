package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;

/* JADX INFO: renamed from: com.ironsource.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class HandlerC3517i5 extends Handler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f29136b = "DownloadHandler";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Oc f29137a;

    public void a(Oc oc2) {
        if (oc2 == null) {
            throw new IllegalArgumentException();
        }
        this.f29137a = oc2;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Oc oc2 = this.f29137a;
        if (oc2 == null) {
            Logger.i(f29136b, "OnPreCacheCompletion listener is null, msg: " + message.toString());
            return;
        }
        try {
            int i10 = message.what;
            if (i10 == 1016) {
                oc2.a((C8) message.obj);
            } else {
                this.f29137a.a((C8) message.obj, new C3731u8(i10, C3527ig.a(i10)));
            }
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            Logger.i(f29136b, "handleMessage | Got exception: " + th2.getMessage());
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    public HandlerC3517i5(Looper looper) {
        super(looper);
    }

    public void a() {
        this.f29137a = null;
    }
}
