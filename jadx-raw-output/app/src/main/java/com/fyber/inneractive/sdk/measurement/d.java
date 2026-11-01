package com.fyber.inneractive.sdk.measurement;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.network.z;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.Omid;
import com.iab.omid.library.fyber.adsession.Partner;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f15804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f15805b;

    public d(e eVar, Context context) {
        this.f15805b = eVar;
        this.f15804a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Omid.activate(this.f15804a);
            this.f15805b.f15810e = Partner.createPartner("Fyber", InneractiveAdManager.getVersion());
            e.a(this.f15805b, this.f15804a);
            IAlog.a("OMID SDK was activated - version %s", Omid.getVersion());
            IAlog.d("OMID SDK was activated - version %s", Omid.getVersion());
        } catch (Throwable th2) {
            IAlog.a("Failed starting omsdk with exception %s", th2.getLocalizedMessage());
            this.f15805b.getClass();
            z.a(th2.getClass().getSimpleName(), "OpenMeasurementMeasurer - " + th2.getMessage(), null, null);
        }
    }
}
