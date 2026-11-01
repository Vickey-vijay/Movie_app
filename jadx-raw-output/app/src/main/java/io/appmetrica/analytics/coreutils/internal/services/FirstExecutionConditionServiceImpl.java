package io.appmetrica.analytics.coreutils.internal.services;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class FirstExecutionConditionServiceImpl implements FirstExecutionConditionService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f54740a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UtilityServiceConfiguration f54741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UtilityServiceProvider f54742c;

    public static class FirstExecutionConditionChecker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f54743a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f54744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f54745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f54746d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final FirstExecutionDelayChecker f54747e;
        public final String tag;

        public final void a(long j10) {
            this.f54746d = TimeUnit.SECONDS.toMillis(j10);
        }

        public final void a() {
            this.f54743a = true;
        }

        public final boolean b() {
            if (this.f54743a) {
                return true;
            }
            return this.f54747e.delaySinceFirstStartupWasPassed(this.f54745c, this.f54744b, this.f54746d);
        }

        public FirstExecutionConditionChecker(@Nullable UtilityServiceConfiguration utilityServiceConfiguration, @NonNull FirstExecutionDelayChecker firstExecutionDelayChecker, @NonNull String str) {
            long initialConfigTime;
            this.f54747e = firstExecutionDelayChecker;
            if (utilityServiceConfiguration == null) {
                initialConfigTime = 0;
            } else {
                initialConfigTime = utilityServiceConfiguration.getInitialConfigTime();
            }
            this.f54745c = initialConfigTime;
            this.f54744b = utilityServiceConfiguration != null ? utilityServiceConfiguration.getLastUpdateConfigTime() : 0L;
            this.f54746d = Long.MAX_VALUE;
            this.tag = str;
        }

        public final void a(UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f54745c = utilityServiceConfiguration.getInitialConfigTime();
            this.f54744b = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long j10, long j11, long j12) {
            return j11 - j10 >= j12;
        }
    }

    public static class FirstExecutionHandler implements FirstExecutionDelayedTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FirstExecutionConditionChecker f54748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WaitForActivationDelayBarrier.ActivationBarrierHelper f54749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ICommonExecutor f54750c;

        public /* synthetic */ FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker, int i10) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        private FirstExecutionHandler(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.f54749b = activationBarrierHelper;
            this.f54748a = firstExecutionConditionChecker;
            this.f54750c = iCommonExecutor;
        }

        public boolean canExecute() {
            boolean zB = this.f54748a.b();
            if (zB) {
                this.f54748a.a();
            }
            return zB;
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public void setInitialDelaySeconds(long j10) {
            this.f54748a.a(j10);
        }

        @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionDelayedTask
        public boolean tryExecute(long j10) {
            if (!this.f54748a.b()) {
                return false;
            }
            this.f54749b.subscribeIfNeeded(TimeUnit.SECONDS.toMillis(j10), this.f54750c);
            this.f54748a.a();
            return true;
        }

        public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
            this.f54748a.a(utilityServiceConfiguration);
        }
    }

    public final synchronized FirstExecutionHandler a(ICommonExecutor iCommonExecutor, WaitForActivationDelayBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker) {
        FirstExecutionHandler firstExecutionHandler;
        firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, 0);
        this.f54740a.add(firstExecutionHandler);
        return firstExecutionHandler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.FirstExecutionConditionService
    @NonNull
    public synchronized FirstExecutionDelayedTask createDelayedTask(@NonNull String str, @NonNull ICommonExecutor iCommonExecutor, @NonNull Runnable runnable) {
        return a(iCommonExecutor, new WaitForActivationDelayBarrier.ActivationBarrierHelper(runnable, this.f54742c.getActivationBarrier()), new FirstExecutionConditionChecker(this.f54741b, new FirstExecutionDelayChecker(), str));
    }

    public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f54741b = utilityServiceConfiguration;
            arrayList = new ArrayList(this.f54740a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FirstExecutionHandler) it.next()).updateConfig(utilityServiceConfiguration);
        }
    }

    public FirstExecutionConditionServiceImpl(@NonNull UtilityServiceProvider utilityServiceProvider) {
        this.f54742c = utilityServiceProvider;
    }
}
