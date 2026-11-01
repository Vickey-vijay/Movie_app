package com.fyber.inneractive.sdk.flow;

import android.os.Handler;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Handler f15347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.interfaces.b f15348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f15349c = new b(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f15350d = new c(this);

    public d(com.fyber.inneractive.sdk.interfaces.b bVar) {
        this.f15348b = bVar;
    }

    public final void a() {
        IAlog.a("%s : ContentLoadTimeoutHandler destroying timeout handler", IAlog.a(this));
        if (this.f15347a != null) {
            IAlog.a("%s : ContentLoadTimeoutHandler stopping timeout handler", IAlog.a(this));
            Handler handler = this.f15347a;
            if (handler != null) {
                handler.removeCallbacks(this.f15350d);
            }
            this.f15347a.getLooper().quitSafely();
            this.f15347a = null;
        }
    }
}
