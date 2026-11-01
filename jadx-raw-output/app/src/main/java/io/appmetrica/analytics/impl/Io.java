package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class Io {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f55365a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PublicLogger f55366b;

    public final synchronized void a(Consumer consumer) {
        PublicLogger publicLogger = this.f55366b;
        if (publicLogger == null) {
            this.f55365a.add(consumer);
        } else {
            consumer.consume(publicLogger);
        }
    }
}
