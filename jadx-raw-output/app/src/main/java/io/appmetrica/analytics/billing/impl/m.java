package io.appmetrica.analytics.billing.impl;

import android.content.Context;
import io.appmetrica.analytics.billing.impl.m;
import io.appmetrica.analytics.billinginterface.internal.BillingType;
import io.appmetrica.analytics.billinginterface.internal.config.BillingConfig;
import io.appmetrica.analytics.billinginterface.internal.monitor.BillingMonitor;
import io.appmetrica.analytics.billinginterface.internal.monitor.DummyBillingMonitor;
import io.appmetrica.analytics.billingv8.internal.BillingLibraryMonitor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentContext;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.lang.reflect.Field;
import java.util.concurrent.Executor;
import lk.a0;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements ServiceModuleReporterComponentLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ServiceContext f54453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B f54454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BillingMonitor f54455c;

    public final void a(B b10) {
        BillingConfig billingConfig;
        BillingMonitor billingMonitor = this.f54455c;
        if (billingMonitor != null) {
            if (b10 != null) {
                A a10 = b10.f54430b;
                billingConfig = new BillingConfig(a10.f54427a, a10.f54428b);
            } else {
                billingConfig = null;
            }
            billingMonitor.onBillingConfigChanged(billingConfig);
        }
        this.f54454b = b10;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x012a A[Catch: all -> 0x012d, TRY_LEAVE, TryCatch #1 {all -> 0x012d, blocks: (B:52:0x0126, B:54:0x012a), top: B:59:0x0126 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0126 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleReporterComponentLifecycleListener
    public final void onMainReporterCreated(ServiceModuleReporterComponentContext serviceModuleReporterComponentContext) {
        String str;
        BillingType billingType;
        BillingMonitor billingLibraryMonitor;
        BillingMonitor dummyBillingMonitor;
        BillingMonitor billingMonitor;
        Field field;
        if (serviceModuleReporterComponentContext.getConfig().isRevenueAutoTrackingEnabled()) {
            Context context = this.f54453a.getContext();
            IHandlerExecutor defaultExecutor = this.f54453a.getExecutorProvider().getDefaultExecutor();
            Executor uiExecutor = this.f54453a.getExecutorProvider().getUiExecutor();
            try {
                Class<?> clsFindClass = ReflectionUtils.findClass("com.android.billingclient.BuildConfig");
                str = (String) ((clsFindClass == null || (field = clsFindClass.getField(com.safedk.android.analytics.brandsafety.creatives.discoveries.m.f44256e)) == null) ? null : field.get(null));
            } catch (Throwable unused) {
                str = null;
            }
            if (str == null || a0.n0(str) || lk.x.R(str, "2.", false, 2, null) || lk.x.R(str, "3.", false, 2, null) || lk.x.R(str, "4.", false, 2, null)) {
                billingType = BillingType.NONE;
            } else if (lk.x.R(str, "5.", false, 2, null) || lk.x.R(str, "6.", false, 2, null) || lk.x.R(str, "7.", false, 2, null)) {
                billingType = BillingType.LIBRARY_V6;
            } else {
                billingType = lk.x.R(str, "8.", false, 2, null) ? BillingType.LIBRARY_V8 : BillingType.LIBRARY_V8;
            }
            k kVar = new k(this.f54453a.getServiceStorageProvider().createBinaryStateStorageFactory("auto_inapp_collecting_info_data", new e(), new C4045b(null, 1, null)).create(this.f54453a.getContext()));
            j jVar = new j(serviceModuleReporterComponentContext.getReporter(), this.f54453a.getExecutorProvider().getReportRunnableExecutor(), null, 4, null);
            int i10 = l.f54452a[billingType.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    dummyBillingMonitor = new DummyBillingMonitor();
                } else {
                    billingLibraryMonitor = new BillingLibraryMonitor(context, defaultExecutor, uiExecutor, kVar, jVar, null, null, 96, null);
                }
                this.f54455c = dummyBillingMonitor;
                a(this.f54454b);
                if (this.f54453a.getApplicationStateProvider().registerStickyObserver(new ApplicationStateObserver() { // from class: ye.b
                    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
                    public final void onApplicationStateChanged(ApplicationState applicationState) {
                        m.a(this.f85746a, applicationState);
                    }
                }) == ApplicationState.VISIBLE) {
                    try {
                        billingMonitor = this.f54455c;
                        if (billingMonitor != null) {
                            billingMonitor.onSessionResumed();
                        }
                    } catch (Throwable unused2) {
                        return;
                    }
                }
            }
            billingLibraryMonitor = new io.appmetrica.analytics.billingv6.internal.BillingLibraryMonitor(context, defaultExecutor, uiExecutor, kVar, jVar, null, null, 96, null);
            dummyBillingMonitor = billingLibraryMonitor;
            this.f54455c = dummyBillingMonitor;
            a(this.f54454b);
            if (this.f54453a.getApplicationStateProvider().registerStickyObserver(new ApplicationStateObserver() { // from class: ye.b
                @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver
                public final void onApplicationStateChanged(ApplicationState applicationState) {
                    m.a(this.f85746a, applicationState);
                }
            }) == ApplicationState.VISIBLE) {
                billingMonitor = this.f54455c;
                if (billingMonitor != null) {
                    billingMonitor.onSessionResumed();
                }
            }
        }
    }

    public m(ServiceContext serviceContext, B b10) {
        this.f54453a = serviceContext;
        this.f54454b = b10;
    }

    public static final void a(m mVar, ApplicationState applicationState) {
        mVar.getClass();
        if (applicationState == ApplicationState.VISIBLE) {
            try {
                BillingMonitor billingMonitor = mVar.f54455c;
                if (billingMonitor != null) {
                    billingMonitor.onSessionResumed();
                }
            } catch (Throwable unused) {
            }
        }
    }
}
