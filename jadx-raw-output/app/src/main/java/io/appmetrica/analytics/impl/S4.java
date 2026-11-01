package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class S4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f55849a = new CopyOnWriteArrayList();

    public final void a(@NonNull InterfaceC4208g4 interfaceC4208g4) {
        this.f55849a.add(interfaceC4208g4);
    }

    public final List<InterfaceC4208g4> a() {
        return this.f55849a;
    }

    public final void b(@NonNull InterfaceC4208g4 interfaceC4208g4) {
        this.f55849a.remove(interfaceC4208g4);
    }
}
