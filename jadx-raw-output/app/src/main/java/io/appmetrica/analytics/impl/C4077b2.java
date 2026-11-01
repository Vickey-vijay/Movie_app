package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4077b2 implements AppSetIdProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f56394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IAppSetIdRetriever f56395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile AppSetId f56396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CountDownLatch f56397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f56398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C4051a2 f56399f;

    @VisibleForTesting
    public C4077b2(Context context, IAppSetIdRetriever iAppSetIdRetriever) {
        this.f56394a = context;
        this.f56395b = iAppSetIdRetriever;
        this.f56397d = new CountDownLatch(1);
        this.f56398e = 20L;
        this.f56399f = new C4051a2(this);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdProvider
    @WorkerThread
    public final synchronized AppSetId getAppSetId() {
        AppSetId appSetId;
        if (this.f56396c == null) {
            try {
                this.f56397d = new CountDownLatch(1);
                this.f56395b.retrieveAppSetId(this.f56394a, this.f56399f);
                this.f56397d.await(this.f56398e, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
        appSetId = this.f56396c;
        if (appSetId == null) {
            appSetId = new AppSetId(null, AppSetIdScope.UNKNOWN);
            this.f56396c = appSetId;
        }
        return appSetId;
    }

    public C4077b2(Context context) {
        this(context, AbstractC4103c2.a());
    }
}
