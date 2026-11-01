package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.C3605n2;
import com.unity3d.services.core.fid.Constants;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, d2 = {"Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;", "Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLifecycleObserver;", "Lmj/r;", "onCreate", "onDestroy", "Lio/appmetrica/analytics/networktasks/internal/NetworkCore;", "a", "Lio/appmetrica/analytics/networktasks/internal/NetworkCore;", "getNetworkCore", "()Lio/appmetrica/analytics/networktasks/internal/NetworkCore;", "networkCore", "Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;", "executionPolicy", "<init>", "(Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;)V", VastTagName.COMPANION, "network-tasks_release"}, k = 1, mv = {1, 6, 0})
public final class NetworkServiceLocator implements NetworkServiceLifecycleObserver {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile NetworkServiceLocator f58279b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NetworkCore networkCore;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0007R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator$Companion;", "", "Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;", Constants.GET_INSTANCE, "Lio/appmetrica/analytics/coreapi/internal/io/IExecutionPolicy;", "executionPolicy", "Lmj/r;", C3426d4.a.f28413f, "networkServiceLocator", C3605n2.f30210p, "Lio/appmetrica/analytics/networktasks/internal/NetworkServiceLocator;", "network-tasks_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public /* synthetic */ Companion(i iVar) {
            this();
        }

        @AnyThread
        public final void init(IExecutionPolicy iExecutionPolicy) {
            if (NetworkServiceLocator.f58279b == null) {
                synchronized (NetworkServiceLocator.class) {
                    if (NetworkServiceLocator.f58279b == null) {
                        NetworkServiceLocator.f58279b = new NetworkServiceLocator(iExecutionPolicy);
                    }
                    r rVar = r.f64562a;
                }
            }
        }

        private Companion() {
        }

        public final NetworkServiceLocator getInstance() {
            NetworkServiceLocator networkServiceLocator = NetworkServiceLocator.f58279b;
            if (networkServiceLocator == null) {
                p.B(C3605n2.f30210p);
                return null;
            }
            return networkServiceLocator;
        }

        @VisibleForTesting
        public final void init(NetworkServiceLocator networkServiceLocator) {
            NetworkServiceLocator.f58279b = networkServiceLocator;
        }
    }

    public static final NetworkServiceLocator getInstance() {
        return INSTANCE.getInstance();
    }

    @AnyThread
    public static final void init(IExecutionPolicy iExecutionPolicy) {
        INSTANCE.init(iExecutionPolicy);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onCreate() {
    }

    @VisibleForTesting
    public static final void init(NetworkServiceLocator networkServiceLocator) {
        INSTANCE.init(networkServiceLocator);
    }

    public final NetworkCore getNetworkCore() {
        return this.networkCore;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.NetworkServiceLifecycleObserver
    public void onDestroy() {
        this.networkCore.stopTasks();
    }

    @AnyThread
    @VisibleForTesting
    public NetworkServiceLocator(IExecutionPolicy iExecutionPolicy) {
        NetworkCore networkCore = new NetworkCore(iExecutionPolicy);
        networkCore.setName("IAA-NC");
        networkCore.start();
        this.networkCore = networkCore;
    }
}
