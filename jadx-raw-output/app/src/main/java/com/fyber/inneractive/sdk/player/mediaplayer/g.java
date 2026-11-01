package com.fyber.inneractive.sdk.player.mediaplayer;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f17996a;

    public g(p pVar) {
        this.f17996a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.b(this.f17996a);
        Handler handler = this.f17996a.f18018o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f17996a.f18018o = null;
        }
        this.f17996a.f18017n = null;
        Looper.myLooper().quit();
    }
}
