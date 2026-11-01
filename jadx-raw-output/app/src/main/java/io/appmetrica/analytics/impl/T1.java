package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.ActivityChooserModel;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class T1 implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f55887a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile C4689z7 f55888b = null;

    public final void a(@NonNull C4689z7 c4689z7) {
        ArrayList arrayListA;
        synchronized (this) {
            this.f55888b = c4689z7;
            arrayListA = a();
        }
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            ((InterfaceC4089be) it.next()).consume(c4689z7);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    @MainThread
    public final void onEvent(@NonNull Activity activity, @NonNull ActivityEvent activityEvent) {
        Intent intent = (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", ActivityChooserModel.ATTRIBUTE_ACTIVITY, new R1());
        String dataString = intent == null ? null : intent.getDataString();
        if (TextUtils.isEmpty(dataString)) {
            return;
        }
        S1 s10 = new S1(dataString);
        synchronized (this) {
            C4689z7 c4689z7 = this.f55888b;
            if (c4689z7 == null) {
                this.f55887a.add(s10);
            } else {
                ((A9) C4105c4.l().f56438c.a()).f54955b.post(new Q1(s10, c4689z7));
            }
        }
    }

    public final void b() {
        C4105c4.l().f56440e.registerListener(this, ActivityEvent.CREATED);
    }

    public final void c() {
        C4105c4.l().f56440e.unregisterListener(this, ActivityEvent.CREATED);
    }

    public final synchronized ArrayList a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f55887a);
        this.f55887a.clear();
        return arrayList;
    }
}
