package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4407o extends A7 implements ActivityLifecycleRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Application f57370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile EnumC4382n f57371b = EnumC4382n.f57298d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4468qa f57372c = new C4468qa(true);

    @AnyThread
    public final synchronized void a(@NonNull Context context) {
        if (this.f57370a == null) {
            try {
                this.f57370a = (Application) context.getApplicationContext();
            } catch (Throwable unused) {
            }
        }
        b();
    }

    public final synchronized void b() {
        EnumC4382n enumC4382n = this.f57371b;
        EnumC4382n enumC4382n2 = EnumC4382n.f57296b;
        if (enumC4382n != enumC4382n2 && !this.f57372c.f57557a.isEmpty()) {
            if (this.f57370a == null) {
                this.f57371b = EnumC4382n.f57297c;
            } else {
                this.f57371b = enumC4382n2;
                this.f57370a.registerActivityLifecycleCallbacks(this);
            }
        }
    }

    public final synchronized void c() {
        if (this.f57371b == EnumC4382n.f57296b && this.f57372c.f57557a.isEmpty()) {
            this.f57371b = EnumC4382n.f57298d;
            Application application = this.f57370a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0006 A[Catch: all -> 0x001d, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000a, B:9:0x000e, B:10:0x0018, B:6:0x0006), top: B:16:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x000e A[Catch: all -> 0x001d, LOOP:0: B:8:0x000c->B:9:0x000e, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000a, B:9:0x000e, B:10:0x0018, B:6:0x0006), top: B:16:0x0003 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    @AnyThread
    public final synchronized void registerListener(@NonNull ActivityLifecycleListener activityLifecycleListener, @NonNull ActivityEvent... activityEventArr) {
        int i10;
        if (activityEventArr != null) {
            if (activityEventArr.length == 0) {
                activityEventArr = ActivityEvent.values();
            }
            for (ActivityEvent activityEvent : activityEventArr) {
                this.f57372c.a(activityEvent, activityLifecycleListener);
            }
            b();
        } else {
            activityEventArr = ActivityEvent.values();
            while (i10 < r0) {
                this.f57372c.a(activityEvent, activityLifecycleListener);
            }
            b();
        }
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0006 A[Catch: all -> 0x003e, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000a, B:9:0x000e, B:11:0x001c, B:13:0x0022, B:15:0x0028, B:17:0x002c, B:18:0x0031, B:19:0x0036, B:20:0x0039, B:6:0x0006), top: B:26:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:9:0x000e A[Catch: all -> 0x003e, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000a, B:9:0x000e, B:11:0x001c, B:13:0x0022, B:15:0x0028, B:17:0x002c, B:18:0x0031, B:19:0x0036, B:20:0x0039, B:6:0x0006), top: B:26:0x0003 }] */
    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleRegistry
    @AnyThread
    public final synchronized void unregisterListener(@NonNull ActivityLifecycleListener activityLifecycleListener, @NonNull ActivityEvent... activityEventArr) {
        int i10;
        Collection collection;
        if (activityEventArr != null) {
            if (activityEventArr.length == 0) {
                activityEventArr = ActivityEvent.values();
            }
            for (ActivityEvent activityEvent : activityEventArr) {
                C4468qa c4468qa = this.f57372c;
                collection = (Collection) c4468qa.f57557a.get(activityEvent);
                if (collection == null && collection.remove(activityLifecycleListener)) {
                    if (collection.isEmpty() && c4468qa.f57558b) {
                        c4468qa.f57557a.remove(activityEvent);
                    }
                    new ArrayList(collection);
                }
            }
            c();
        } else {
            activityEventArr = ActivityEvent.values();
            while (i10 < r0) {
                C4468qa c4468qa2 = this.f57372c;
                collection = (Collection) c4468qa2.f57557a.get(activityEvent);
                if (collection == null) {
                }
            }
            c();
        }
        throw th;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        a(activity, ActivityEvent.CREATED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
        a(activity, ActivityEvent.DESTROYED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityPaused(@NonNull Activity activity) {
        a(activity, ActivityEvent.PAUSED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    @MainThread
    public final void onActivityResumed(@NonNull Activity activity) {
        a(activity, ActivityEvent.RESUMED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
        a(activity, ActivityEvent.STARTED);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
        a(activity, ActivityEvent.STOPPED);
    }

    @AnyThread
    public final synchronized void a(@NonNull Application application) {
        if (this.f57370a == null) {
            this.f57370a = application;
        }
        b();
    }

    @NonNull
    @AnyThread
    public final EnumC4382n a() {
        return this.f57371b;
    }

    public final void a(Activity activity, ActivityEvent activityEvent) {
        Collection collection;
        synchronized (this) {
            collection = (Collection) this.f57372c.f57557a.get(activityEvent);
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleListener) it.next()).onEvent(activity, activityEvent);
            }
        }
    }
}
