package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.CrashConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3223u5 implements InterfaceC3173s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile CrashConfig f25429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3305xc f25430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f25431c;

    public C3223u5(Context context, CrashConfig crashConfig, C3305xc c3305xc) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(crashConfig, "crashConfig");
        ck.p.j(c3305xc, "eventBus");
        this.f25429a = crashConfig;
        this.f25430b = c3305xc;
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        ck.p.i(listSynchronizedList, "synchronizedList(...)");
        this.f25431c = listSynchronizedList;
        if (this.f25429a.getCrashConfig().getEnabled()) {
            listSynchronizedList.add(new S4(Thread.getDefaultUncaughtExceptionHandler(), this));
        }
        if (this.f25429a.getANRConfig().getAppExitReason().getEnabled()) {
            C3298x5.f25687a.getClass();
            if (C3298x5.r()) {
                listSynchronizedList.add(new C3319y1(context, this, this.f25429a.getANRConfig().getAppExitReason().getIncidentWaitInterval(), this.f25429a.getANRConfig().getAppExitReason().getMaxNumberOfLines()));
            }
        }
        if (this.f25429a.getANRConfig().getWatchdog().getEnabled()) {
            listSynchronizedList.add(new C2766c(this.f25429a.getANRConfig().getWatchdog().getInterval(), this));
        }
    }

    public final void a(Q9 q10) {
        int i10;
        ck.p.j(q10, "incidentEvent");
        if ((q10 instanceof C3344z1) && this.f25429a.getANRConfig().getAppExitReason().getEnabled()) {
            i10 = 152;
        } else if ((q10 instanceof T4) && this.f25429a.getCrashConfig().getEnabled()) {
            i10 = 150;
        } else if (!(q10 instanceof Wn) || !this.f25429a.getANRConfig().getWatchdog().getEnabled()) {
            return;
        } else {
            i10 = 151;
        }
        this.f25430b.b(new I2(i10, q10.f24528a, nj.l0.g(mj.h.a("data", q10))));
    }
}
