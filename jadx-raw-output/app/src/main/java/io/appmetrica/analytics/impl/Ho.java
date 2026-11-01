package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes5.dex */
public final class Ho implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f55330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f55331b = "WebView interface setup failed because of an exception.";

    public Ho(Throwable th2) {
        this.f55330a = th2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        ((PublicLogger) obj).error(this.f55330a, this.f55331b, new Object[0]);
    }
}
