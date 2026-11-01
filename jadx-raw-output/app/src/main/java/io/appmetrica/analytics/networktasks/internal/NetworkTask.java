package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes8.dex */
public class NetworkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f58281a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f58282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IExecutionPolicy f58283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExponentialBackoffPolicy f58284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final UnderlyingNetworkTask f58285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f58286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f58287g;

    public enum Method {
        GET,
        POST
    }

    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i10);
    }

    private synchronized boolean a(int i10) {
        if (!a(i10)) {
            return false;
        }
        this.f58281a = i10;
        return true;
    }

    public boolean onCreateNetworkTask() {
        if (a(3)) {
            return this.f58285e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean zA = a(4);
        if (zA) {
            this.f58285e.getFullUrlFormer().incrementAttemptNumber();
            this.f58285e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f58285e.onPerformRequest();
        }
        return zA;
    }

    public boolean onRequestComplete() {
        boolean z10;
        boolean z11;
        synchronized (this) {
            z10 = false;
            if (a(5, 6)) {
                boolean zOnRequestComplete = this.f58285e.onRequestComplete();
                if (zOnRequestComplete) {
                    this.f58281a = 5;
                } else {
                    this.f58281a = 6;
                }
                z11 = zOnRequestComplete;
                z10 = true;
            } else {
                z11 = false;
            }
        }
        if (z10) {
            this.f58285e.onPostRequestComplete(z11);
        }
        return z11;
    }

    public void onRequestError(@Nullable Throwable th2) {
        if (a(6)) {
            this.f58285e.onRequestError(th2);
        }
    }

    public void onShouldNotExecute() {
        if (a(7)) {
            this.f58285e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean zA = a(2);
        if (zA) {
            this.f58285e.onTaskAdded();
        }
        return zA;
    }

    public void onTaskFinished() {
        int i10;
        boolean zA;
        synchronized (this) {
            i10 = this.f58281a;
            zA = a(8);
        }
        if (zA) {
            this.f58285e.onTaskFinished();
            if (i10 == 5) {
                this.f58285e.onSuccessfulTaskFinished();
            } else if (i10 == 6 || i10 == 7) {
                this.f58285e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean z10;
        boolean z11;
        boolean zHasMoreHosts = this.f58285e.getFullUrlFormer().hasMoreHosts();
        int responseCode = this.f58285e.getResponseDataHolder().getResponseCode();
        Iterator it = this.f58286f.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                z11 = true;
                break;
            }
            if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                z11 = false;
                break;
            }
        }
        int i10 = this.f58281a;
        if (i10 != 9 && i10 != 8 && zHasMoreHosts && z11) {
            z10 = true;
        }
        return z10;
    }

    @NonNull
    public String description() {
        return this.f58285e.description();
    }

    @NonNull
    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f58283c;
    }

    @NonNull
    public Executor getExecutor() {
        return this.f58282b;
    }

    @NonNull
    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f58284d;
    }

    @NonNull
    public RequestDataHolder getRequestDataHolder() {
        return this.f58285e.getRequestDataHolder();
    }

    @NonNull
    public ResponseDataHolder getResponseDataHolder() {
        return this.f58285e.getResponseDataHolder();
    }

    @Nullable
    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f58285e.getRetryPolicyConfig();
    }

    @Nullable
    public SSLSocketFactory getSslSocketFactory() {
        return this.f58285e.getSslSocketFactory();
    }

    @NonNull
    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f58285e;
    }

    @Nullable
    public String getUrl() {
        return this.f58285e.getFullUrlFormer().getUrl();
    }

    @NonNull
    public String getUserAgent() {
        return this.f58287g;
    }

    public boolean isRemoved() {
        return this.f58281a == 9;
    }

    public void onTaskRemoved() {
        if (a(9)) {
            this.f58285e.onTaskRemoved();
        }
    }

    public NetworkTask(@NonNull Executor executor, @NonNull IExecutionPolicy iExecutionPolicy, @NonNull ExponentialBackoffPolicy exponentialBackoffPolicy, @NonNull UnderlyingNetworkTask underlyingNetworkTask, @NonNull List<ShouldTryNextHostCondition> list, @NonNull String str) {
        this.f58282b = executor;
        this.f58283c = iExecutionPolicy;
        this.f58284d = exponentialBackoffPolicy;
        this.f58285e = underlyingNetworkTask;
        this.f58286f = list;
        this.f58287g = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0062 A[Catch: all -> 0x008c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x0018, B:7:0x001b, B:47:0x0074, B:50:0x007e, B:13:0x0027, B:23:0x003c, B:24:0x003f, B:26:0x0044, B:28:0x0049, B:30:0x004e, B:36:0x005a, B:37:0x005d, B:39:0x0062, B:41:0x0067, B:45:0x006e, B:51:0x0081), top: B:57:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0065 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0067 A[Catch: all -> 0x008c, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x0018, B:7:0x001b, B:47:0x0074, B:50:0x007e, B:13:0x0027, B:23:0x003c, B:24:0x003f, B:26:0x0044, B:28:0x0049, B:30:0x004e, B:36:0x005a, B:37:0x005d, B:39:0x0062, B:41:0x0067, B:45:0x006e, B:51:0x0081), top: B:57:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0073  */
    private synchronized boolean a(int... iArr) {
        Boolean bool;
        Boolean bool2;
        Boolean boolValueOf;
        bool = Boolean.TRUE;
        int i10 = this.f58281a;
        for (int i11 : iArr) {
            boolean z10 = true;
            switch (e.a(i11)) {
                case 0:
                    boolValueOf = null;
                    break;
                case 1:
                    if (i10 != 1) {
                        z10 = false;
                    }
                    boolValueOf = Boolean.valueOf(z10);
                    break;
                case 2:
                    if (i10 == 2) {
                        boolValueOf = Boolean.TRUE;
                    } else if (i10 == 9) {
                        boolValueOf = Boolean.FALSE;
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case 3:
                    if (i10 == 3 || i10 == 5 || i10 == 6) {
                        boolValueOf = Boolean.TRUE;
                    } else if (i10 == 9) {
                        boolValueOf = Boolean.FALSE;
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case 4:
                case 5:
                    if (i10 == 4) {
                        boolValueOf = Boolean.TRUE;
                    } else if (i10 == 9) {
                        boolValueOf = Boolean.FALSE;
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case 6:
                    if (i10 == 3) {
                        boolValueOf = Boolean.TRUE;
                    } else if (i10 == 2) {
                        boolValueOf = Boolean.TRUE;
                    } else if (i10 == 9) {
                        boolValueOf = Boolean.FALSE;
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case 7:
                    if (i10 == 5 || i10 == 6 || i10 == 7 || i10 == 2 || i10 == 3 || i10 == 4) {
                        boolValueOf = Boolean.TRUE;
                    } else if (i10 == 9) {
                        boolValueOf = Boolean.FALSE;
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case 8:
                    if (i10 == 1) {
                        boolValueOf = null;
                    } else {
                        if (i10 == 9) {
                            z10 = false;
                        }
                        boolValueOf = Boolean.valueOf(z10);
                    }
                    break;
                default:
                    boolValueOf = Boolean.FALSE;
                    break;
            }
            if (!Boolean.TRUE.equals(boolValueOf)) {
                bool = boolValueOf;
                bool2 = Boolean.TRUE;
                bool2.equals(bool);
            }
        }
        bool2 = Boolean.TRUE;
        bool2.equals(bool);
        return bool2.equals(bool);
    }
}
