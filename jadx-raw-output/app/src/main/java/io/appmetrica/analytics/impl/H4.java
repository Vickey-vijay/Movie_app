package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: loaded from: classes5.dex */
public abstract class H4 extends AbstractC4438p5 {
    @Override // io.appmetrica.analytics.impl.AbstractC4438p5
    public final void a(@NonNull Object obj) {
        C4437p4 c4437p4 = (C4437p4) obj;
        synchronized (this) {
            super.a((Object) c4437p4);
        }
    }

    public H4(@NonNull BaseRequestConfig.ComponentLoader<Object, Object, M5> componentLoader, @NonNull C4226gm c4226gm, @NonNull BaseRequestConfig.BaseRequestArguments<C4437p4, Object> baseRequestArguments) {
        super(componentLoader, c4226gm, baseRequestArguments);
    }

    public final synchronized void a(@NonNull C4437p4 c4437p4) {
        super.a((Object) c4437p4);
    }
}
