package io.appmetrica.analytics.networktasks.impl;

import android.text.TextUtils;
import ck.p;
import com.ironsource.G5;
import com.safedk.android.utils.k;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import io.appmetrica.analytics.networktasks.internal.ExponentialBackoffPolicy;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import lk.a0;
import nj.b0;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NetworkTask f58246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterruptionSafeThread f58247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f58248c;

    /* JADX WARN: Code duplicated, block: B:58:0x01c0  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zOnRequestComplete;
        byte[] postData;
        ExponentialBackoffPolicy exponentialBackoffPolicy = this.f58246a.getExponentialBackoffPolicy();
        boolean zCanBeExecuted = this.f58246a.getConnectionExecutionPolicy().canBeExecuted();
        boolean zCanBeExecuted2 = this.f58246a.getExponentialBackoffPolicy().canBeExecuted(this.f58246a.getRetryPolicyConfig());
        if (!this.f58247b.isRunning() || !zCanBeExecuted || !zCanBeExecuted2) {
            this.f58246a.onShouldNotExecute();
            return;
        }
        boolean zOnCreateNetworkTask = this.f58246a.onCreateNetworkTask();
        Boolean boolValueOf = null;
        while (this.f58247b.isRunning() && zOnCreateNetworkTask && exponentialBackoffPolicy.canBeExecuted(this.f58246a.getRetryPolicyConfig())) {
            f fVar = this.f58248c;
            NetworkTask networkTask = this.f58246a;
            fVar.getClass();
            if (networkTask.onPerformRequest()) {
                String url = networkTask.getUrl();
                if (url == null || TextUtils.isEmpty(a0.k1(url).toString())) {
                    StringBuilder sb2 = new StringBuilder("Task ");
                    sb2.append(networkTask.description());
                    sb2.append(" url is `");
                    sb2.append(url);
                    sb2.append("`. All hosts = ");
                    List<String> allHosts = networkTask.getUnderlyingTask().getFullUrlFormer().getAllHosts();
                    sb2.append(allHosts != null ? allHosts.toString() : null);
                    networkTask.onRequestError(new IllegalArgumentException(sb2.toString()));
                } else {
                    Request.Builder builderAddHeader = new Request.Builder(url).addHeader(k.f45009b, G5.L).addHeader("User-Agent", networkTask.getUserAgent());
                    RequestDataHolder requestDataHolder = networkTask.getRequestDataHolder();
                    Iterator<T> it = requestDataHolder.getHeaders().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        builderAddHeader.addHeader((String) entry.getKey(), b0.p0((Iterable) entry.getValue(), StringUtils.COMMA, null, null, 0, null, null, 62, null));
                    }
                    if (NetworkTask.Method.POST == requestDataHolder.getMethod() && (postData = requestDataHolder.getPostData()) != null) {
                        if (!(postData.length == 0)) {
                            builderAddHeader.post(postData);
                            Long sendTimestamp = requestDataHolder.getSendTimestamp();
                            if (sendTimestamp != null) {
                                builderAddHeader.addHeader("Send-Timestamp", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(sendTimestamp.longValue())));
                            }
                            Integer sendTimezoneSec = requestDataHolder.getSendTimezoneSec();
                            if (sendTimezoneSec != null) {
                                builderAddHeader.addHeader("Send-Timezone", String.valueOf(sendTimezoneSec.intValue()));
                            }
                        }
                    }
                    NetworkClient.Builder builder = new NetworkClient.Builder();
                    int i10 = b.f58242a;
                    Response responseExecute = builder.withConnectTimeout(i10).withReadTimeout(i10).withSslSocketFactory(networkTask.getSslSocketFactory()).build().newCall(builderAddHeader.build()).execute();
                    int code = responseExecute.getCode();
                    ResponseDataHolder responseDataHolder = networkTask.getResponseDataHolder();
                    responseDataHolder.setResponseCode(code);
                    responseDataHolder.setResponseHeaders(CollectionUtils.convertMapKeysToLowerCase(responseExecute.getHeaders()));
                    if (responseDataHolder.isValidResponse()) {
                        responseDataHolder.setResponseData(responseExecute.getResponseData());
                    }
                    if (responseExecute.isCompleted()) {
                        zOnRequestComplete = networkTask.onRequestComplete();
                    } else {
                        networkTask.onRequestError(responseExecute.getException());
                    }
                    boolValueOf = Boolean.valueOf(zOnRequestComplete);
                    if (boolValueOf.booleanValue() && this.f58246a.shouldTryNextHost()) {
                        zOnCreateNetworkTask = true;
                    } else {
                        zOnCreateNetworkTask = false;
                    }
                    exponentialBackoffPolicy.onHostAttemptFinished(boolValueOf.booleanValue());
                }
            } else {
                networkTask.onRequestError(null);
            }
            zOnRequestComplete = false;
            boolValueOf = Boolean.valueOf(zOnRequestComplete);
            if (boolValueOf.booleanValue()) {
                zOnCreateNetworkTask = false;
            } else {
                zOnCreateNetworkTask = false;
            }
            exponentialBackoffPolicy.onHostAttemptFinished(boolValueOf.booleanValue());
        }
        exponentialBackoffPolicy.onAllHostsAttemptsFinished(p.e(boolValueOf, Boolean.TRUE));
    }

    public h(NetworkTask networkTask, InterruptionSafeThread interruptionSafeThread, f fVar) {
        this.f58246a = networkTask;
        this.f58247b = interruptionSafeThread;
        this.f58248c = fVar;
    }
}
