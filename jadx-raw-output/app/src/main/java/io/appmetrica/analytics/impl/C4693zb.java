package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.ConfigProvider;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4693zb implements ConfigProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f58047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mj.g f58048b = kotlin.b.a(new C4668yb(this));

    @Override // io.appmetrica.analytics.networktasks.internal.ConfigProvider
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4350lh getConfig() {
        return (C4350lh) this.f58048b.getValue();
    }

    public C4693zb(Y4 y10) {
        this.f58047a = y10;
    }
}
