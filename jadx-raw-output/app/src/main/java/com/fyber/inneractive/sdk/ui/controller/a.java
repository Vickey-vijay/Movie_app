package com.fyber.inneractive.sdk.ui.controller;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f18541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f18542b = new AtomicBoolean(false);

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public final void destroy() {
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.ui.controller.b
    public final void a(float f10) {
        if (f10 >= 0.01f && this.f18542b.compareAndSet(false, true)) {
            IAlog.a("%sVisibility requirement met. visibleViewArea: %.1f%%", IAlog.a(this), Float.valueOf(f10 * 100.0f));
            this.f18541a.u();
        }
    }
}
