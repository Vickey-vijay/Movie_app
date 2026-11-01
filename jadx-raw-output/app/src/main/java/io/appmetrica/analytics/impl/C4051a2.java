package io.appmetrica.analytics.impl;

import androidx.annotation.MainThread;
import io.appmetrica.analytics.appsetid.internal.AppSetIdListener;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4051a2 implements AppSetIdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4077b2 f56316a;

    public C4051a2(C4077b2 c4077b2) {
        this.f56316a = c4077b2;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    @MainThread
    public final void onAppSetIdRetrieved(String str, AppSetIdScope appSetIdScope) {
        this.f56316a.f56396c = new AppSetId(str, appSetIdScope);
        this.f56316a.f56397d.countDown();
    }

    @Override // io.appmetrica.analytics.appsetid.internal.AppSetIdListener
    @MainThread
    public final void onFailure(Throwable th2) {
        this.f56316a.f56397d.countDown();
    }
}
