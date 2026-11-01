package io.appmetrica.analytics.impl;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4357m implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f57234a = new HashSet();

    public final synchronized void a(@NonNull InterfaceC4332l interfaceC4332l) {
        this.f57234a.add(interfaceC4332l);
    }

    public final void a(@NonNull Activity activity) {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f57234a);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C4120cj) ((InterfaceC4332l) it.next())).a(activity);
        }
    }

    public C4357m(@NonNull C4407o c4407o) {
        c4407o.registerListener(this, new ActivityEvent[0]);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @MainThread
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        C4105c4.l().f56438c.a().execute(new RunnableC4306k(this, activity));
    }
}
