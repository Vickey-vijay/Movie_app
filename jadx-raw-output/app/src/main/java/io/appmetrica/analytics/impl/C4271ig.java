package io.appmetrica.analytics.impl;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.impl.C4271ig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ig, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4271ig implements InstallReferrerStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4297jg f56972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4548tg f56973b;

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }

    public C4271ig(C4297jg c4297jg, InterfaceC4548tg interfaceC4548tg) {
        this.f56972a = c4297jg;
        this.f56973b = interfaceC4548tg;
    }

    public static final void a(C4297jg c4297jg, InterfaceC4548tg interfaceC4548tg) {
        InstallReferrerClient installReferrerClient;
        try {
            try {
                ReferrerDetails installReferrer = c4297jg.f57020b.getInstallReferrer();
                interfaceC4548tg.a(new C4424og(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), EnumC4399ng.f57350c));
                installReferrerClient = c4297jg.f57020b;
            } catch (Throwable th2) {
                try {
                    interfaceC4548tg.a(th2);
                    installReferrerClient = c4297jg.f57020b;
                } catch (Throwable th3) {
                    try {
                        c4297jg.f57020b.endConnection();
                    } catch (Throwable unused) {
                    }
                    throw th3;
                }
            }
            installReferrerClient.endConnection();
        } catch (Throwable unused2) {
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerSetupFinished(int i10) {
        if (i10 == 0) {
            final C4297jg c4297jg = this.f56972a;
            ICommonExecutor iCommonExecutor = c4297jg.f57019a;
            final InterfaceC4548tg interfaceC4548tg = this.f56973b;
            iCommonExecutor.execute(new Runnable() { // from class: af.h0
                @Override // java.lang.Runnable
                public final void run() {
                    C4271ig.a(c4297jg, interfaceC4548tg);
                }
            });
            return;
        }
        this.f56972a.a(this.f56973b, new IllegalStateException("Referrer check failed with error " + i10));
    }
}
