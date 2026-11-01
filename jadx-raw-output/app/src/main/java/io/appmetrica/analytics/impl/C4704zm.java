package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.ConfigProvider;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4704zm implements UnderlyingNetworkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bm f58068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4174em f58069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Kl f58070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RequestDataHolder f58071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConfigProvider f58072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ResponseDataHolder f58073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FullUrlFormer f58074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Sl f58075h;

    public C4704zm(@NonNull Bm bm2, @NonNull FullUrlFormer<C4123cm> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull ConfigProvider<C4123cm> configProvider) {
        this(bm2, new Sl(), fullUrlFormer, requestDataHolder, responseDataHolder, configProvider);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
    }

    public C4704zm(Bm bm2, Sl sl2, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, ConfigProvider configProvider) {
        this.f58068a = bm2;
        this.f58075h = sl2;
        this.f58071d = requestDataHolder;
        this.f58073f = responseDataHolder;
        this.f58072e = configProvider;
        this.f58074g = fullUrlFormer;
        fullUrlFormer.setHosts(((C4123cm) configProvider.getConfig()).k());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "Startup task for component: " + this.f58068a.f55042a.f55119f.toString();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f58074g;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.f58071d;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f58073f;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C4123cm) this.f58072e.getConfig()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        ((Bl) C4418oa.I.z()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        this.f58071d.setHeader("Accept-Encoding", "encrypted");
        return this.f58068a.g();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z10) {
        if (z10) {
            return;
        }
        this.f58070c = Kl.PARSE;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        C4174em c4174emHandle = this.f58075h.handle(this.f58073f);
        this.f58069b = c4174emHandle;
        return c4174emHandle != null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(@Nullable Throwable th2) {
        this.f58070c = Kl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f58070c = Kl.NETWORK;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        if (this.f58069b == null || this.f58073f.getResponseHeaders() == null) {
            return;
        }
        this.f58068a.a(this.f58069b, (C4123cm) this.f58072e.getConfig(), this.f58073f.getResponseHeaders());
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
        if (this.f58070c == null) {
            this.f58070c = Kl.UNKNOWN;
        }
        this.f58068a.a(this.f58070c);
    }
}
