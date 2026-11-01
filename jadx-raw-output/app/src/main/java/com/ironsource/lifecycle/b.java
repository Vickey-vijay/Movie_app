package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.ironsource.EnumC3613na;
import com.ironsource.InterfaceC3593ma;
import com.ironsource.environment.thread.IronSourceThreadManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final b f29420m = new b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static AtomicBoolean f29421n = new AtomicBoolean(false);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f29422o = 700;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29423a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f29424b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f29425c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29426d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private EnumC3613na f29427e = EnumC3613na.NONE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<InterfaceC3593ma> f29428f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f29429g = new Runnable() { // from class: com.ironsource.lifecycle.c
        @Override // java.lang.Runnable
        public final void run() {
            this.f29436b.f();
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f29430h = new Runnable() { // from class: com.ironsource.lifecycle.d
        @Override // java.lang.Runnable
        public final void run() {
            this.f29437b.g();
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f29431i = new Runnable() { // from class: com.ironsource.lifecycle.e
        @Override // java.lang.Runnable
        public final void run() {
            this.f29438b.h();
        }
    };

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f29432j = new Runnable() { // from class: com.ironsource.lifecycle.f
        @Override // java.lang.Runnable
        public final void run() {
            this.f29439b.i();
        }
    };

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f29433k = new Runnable() { // from class: com.ironsource.lifecycle.g
        @Override // java.lang.Runnable
        public final void run() {
            this.f29440b.j();
        }
    };

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final com.ironsource.lifecycle.a.InterfaceC0276a f29434l = new a();

    public class a implements com.ironsource.lifecycle.a.InterfaceC0276a {
        @Override // com.ironsource.lifecycle.a.InterfaceC0276a
        public void b(Activity activity) {
        }

        public a() {
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0276a
        public void a(Activity activity) {
            b.this.c(activity);
        }

        @Override // com.ironsource.lifecycle.a.InterfaceC0276a
        public void onResume(Activity activity) {
            b.this.b(activity);
        }
    }

    public static b d() {
        return f29420m;
    }

    public void a(InterfaceC3593ma interfaceC3593ma) {
        if (!IronsourceLifecycleProvider.a() || interfaceC3593ma == null || this.f29428f.contains(interfaceC3593ma)) {
            return;
        }
        this.f29428f.add(interfaceC3593ma);
    }

    public void b(InterfaceC3593ma interfaceC3593ma) {
        if (this.f29428f.contains(interfaceC3593ma)) {
            this.f29428f.remove(interfaceC3593ma);
        }
    }

    public EnumC3613na c() {
        return this.f29427e;
    }

    public boolean e() {
        return this.f29427e == EnumC3613na.STOPPED;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g() {
        Iterator<InterfaceC3593ma> it = this.f29428f.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        Iterator<InterfaceC3593ma> it = this.f29428f.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        Iterator<InterfaceC3593ma> it = this.f29428f.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j() {
        Iterator<InterfaceC3593ma> it = this.f29428f.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public void c(Activity activity) {
        int i10 = this.f29423a + 1;
        this.f29423a = i10;
        if (i10 == 1 && this.f29426d) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f29433k);
            this.f29426d = false;
            this.f29427e = EnumC3613na.STARTED;
        }
    }

    public void d(Activity activity) {
        this.f29423a--;
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        a();
        b();
    }

    public void b(Activity activity) {
        int i10 = this.f29424b + 1;
        this.f29424b = i10;
        if (i10 == 1) {
            if (this.f29425c) {
                IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f29432j);
                this.f29425c = false;
                this.f29427e = EnumC3613na.RESUMED;
                return;
            }
            IronSourceThreadManager.INSTANCE.removeUiThreadTask(this.f29429g);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        com.ironsource.lifecycle.a.b(activity);
        com.ironsource.lifecycle.a aVarA = com.ironsource.lifecycle.a.a(activity);
        if (aVarA != null) {
            aVarA.d(this.f29434l);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        d(activity);
    }

    public void a(Context context) {
        Application application;
        if (!f29421n.compareAndSet(false, true) || (application = (Application) context.getApplicationContext()) == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
    }

    public void a(Activity activity) {
        int i10 = this.f29424b - 1;
        this.f29424b = i10;
        if (i10 == 0) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(this.f29429g, 700L);
        }
    }

    private void a() {
        if (this.f29424b == 0) {
            this.f29425c = true;
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f29430h);
            this.f29427e = EnumC3613na.PAUSED;
        }
    }

    private void b() {
        if (this.f29423a == 0 && this.f29425c) {
            IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(this.f29431i);
            this.f29426d = true;
            this.f29427e = EnumC3613na.STOPPED;
        }
    }
}
