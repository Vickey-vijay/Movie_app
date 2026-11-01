package com.mbridge.msdk.config.component.status;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: MBActivityLifecyclePublisher.java */
/* JADX INFO: loaded from: classes10.dex */
public class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a> f33555a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33556b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f33557c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f33558d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33559e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f33560f = new Handler();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f33561g = new Runnable() { // from class: com.mbridge.msdk.config.component.status.g
        @Override // java.lang.Runnable
        public final void run() {
            this.f33580b.c();
        }
    };

    public void a(a aVar) {
        this.f33555a.add(aVar);
    }

    public void b(a aVar) {
        this.f33555a.add(aVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    private void a(com.mbridge.msdk.config.component.base.b bVar) {
        Iterator<a> it = this.f33555a.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
    }

    private void b() {
        if (this.f33556b == 0 && this.f33558d) {
            a("OnAppBackground", "");
            this.f33559e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        a("LifecycleChanged", "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        a("LifecycleChanged", "onActivityDestroyed");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        this.f33557c--;
        a("LifecycleChanged", "onActivityPaused");
        if (this.f33557c == 0) {
            this.f33560f.postDelayed(this.f33561g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        this.f33557c++;
        a("LifecycleChanged", "onActivityResumed");
        if (this.f33557c == 1) {
            if (!this.f33558d) {
                this.f33560f.removeCallbacks(this.f33561g);
            } else {
                a("OnAppForeground", "");
                this.f33558d = false;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        this.f33556b++;
        a("LifecycleChanged", "onActivityStarted");
        if (this.f33556b == 1 && this.f33559e) {
            this.f33559e = false;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        this.f33556b--;
        a("LifecycleChanged", "onActivityStopped");
        b();
    }

    public b(Context context) {
        if (context == null) {
            return;
        }
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        a();
        b();
    }

    private void a(String str, String str2) {
        com.mbridge.msdk.config.component.base.b bVar = new com.mbridge.msdk.config.component.base.b();
        bVar.b(str);
        HashMap map = new HashMap();
        map.put("event", str2);
        bVar.a(map);
        a(bVar);
    }

    private void a() {
        if (this.f33557c == 0) {
            this.f33558d = true;
        }
    }
}
