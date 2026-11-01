package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4344lb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4206g2 f57192a = new C4206g2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4339l6 f57193b = new C4339l6();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public An f57194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f57195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f57196e;

    public final synchronized void a(Context context, AppMetricaConfig appMetricaConfig, Ua ua2) {
        if (this.f57196e) {
            return;
        }
        nj.x.D(this.f57193b.f57175a, new Ga[]{this.f57192a.a(context, appMetricaConfig, ua2)});
        this.f57196e = true;
    }

    public final synchronized void b() {
        if (this.f57195d) {
            return;
        }
        C4339l6 c4339l6 = this.f57193b;
        ArrayList arrayList = C4105c4.l().f56444i.f57369a;
        ArrayList arrayList2 = new ArrayList(nj.t.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        c4339l6.f57175a.addAll(arrayList2);
        this.f57195d = true;
    }

    public final synchronized void c() {
        if (this.f57194c != null) {
            return;
        }
        P1 p10 = new P1(this.f57193b);
        this.f57194c = new An(p10);
        C4705zn c4705zn = new C4705zn();
        c4705zn.f58076a.add(p10);
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            c4705zn.f58076a.add(defaultUncaughtExceptionHandler);
        }
        Thread.setDefaultUncaughtExceptionHandler(c4705zn);
    }

    public final synchronized void a() {
        this.f57193b.f57175a.clear();
        this.f57195d = false;
        this.f57196e = false;
    }
}
