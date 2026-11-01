package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4723s extends Lambda implements bk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4726v f58457a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4723s(C4726v c4726v) {
        super(0);
        this.f58457a = c4726v;
    }

    @Override // bk.a
    public final Object invoke() {
        ((C4728x) this.f58457a.f58461b).a("ContentObserverScreenshotCaptor");
        return mj.r.f64562a;
    }
}
