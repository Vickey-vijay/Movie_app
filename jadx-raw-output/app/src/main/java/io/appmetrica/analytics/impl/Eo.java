package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class Eo extends SimpleThreadSafeToggle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakHashMap f55210a;

    public Eo() {
        super(false, "[WakelocksToggle]");
        this.f55210a = new WeakHashMap();
    }

    public final synchronized void a(Object obj) {
        this.f55210a.put(obj, null);
        if (this.f55210a.size() == 1) {
            updateState(true);
        }
    }

    public final synchronized void b(Object obj) {
        this.f55210a.remove(obj);
        if (this.f55210a.isEmpty()) {
            updateState(false);
        }
    }
}
