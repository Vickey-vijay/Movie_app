package io.appmetrica.analytics.impl;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.impl.C4297jg;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4297jg implements Pa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f57019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstallReferrerClient f57020b;

    public static final void b(InterfaceC4548tg interfaceC4548tg, Throwable th2) {
        interfaceC4548tg.a(th2);
    }

    public C4297jg(Context context, ICommonExecutor iCommonExecutor) {
        this.f57019a = iCommonExecutor;
        this.f57020b = InstallReferrerClient.newBuilder(context).build();
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(InterfaceC4548tg interfaceC4548tg) throws Throwable {
        this.f57020b.startConnection(new C4271ig(this, interfaceC4548tg));
    }

    public final void a(final InterfaceC4548tg interfaceC4548tg, final Throwable th2) {
        this.f57019a.execute(new Runnable() { // from class: af.j0
            @Override // java.lang.Runnable
            public final void run() {
                C4297jg.b(interfaceC4548tg, th2);
            }
        });
    }
}
