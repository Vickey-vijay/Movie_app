package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f58397a;

    public final void a(C4717l c4717l) {
        for (T t10 : this.f58397a) {
            C4718m c4718m = null;
            if (c4717l != null) {
                C4717l c4717l2 = Boolean.valueOf(c4717l.f58443a).booleanValue() ? c4717l : null;
                if (c4717l2 != null) {
                    c4718m = c4717l2.f58444b;
                }
            }
            t10.a(c4718m);
        }
    }

    public V(InterfaceC4714i interfaceC4714i) {
        this.f58397a = interfaceC4714i.a();
    }
}
