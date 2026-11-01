package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.appcompat.widget.ActivityChooserModel;
import com.inmobi.media.D1;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes6.dex */
public final class D1 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1 f22489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f22490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f22491c;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.j(bundle, "outState");
    }

    public D1(Context context) {
        this.f22491c = context;
        Looper mainLooper = Looper.getMainLooper();
        ck.p.i(mainLooper, "getMainLooper(...)");
        this.f22489a = new C1(mainLooper);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        WeakReference weakReference = this.f22490b;
        if (!ck.p.e(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f22490b = new WeakReference(activity);
        }
        this.f22489a.removeMessages(1001);
        this.f22489a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        WeakReference weakReference = this.f22490b;
        if (!ck.p.e(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f22490b = new WeakReference(activity);
        }
        this.f22489a.removeMessages(1001);
        this.f22489a.sendEmptyMessage(1002);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        WeakReference weakReference = this.f22490b;
        if (ck.p.e(weakReference != null ? (Activity) weakReference.get() : null, activity)) {
            this.f22489a.sendEmptyMessageDelayed(1001, 3000L);
            return;
        }
        if (this.f22490b == null) {
            final Context context = this.f22491c;
            Runnable runnable = new Runnable() { // from class: b7.i
                @Override // java.lang.Runnable
                public final void run() {
                    D1.a(context, this);
                }
            };
            Context context2 = Ji.f22951a;
            ck.p.j(runnable, "runnable");
            Ji.f22957g.submit(runnable);
        }
    }

    public static final void a(Context context, D1 d10) {
        if (!E1.a(context) && d10.f22490b == null) {
            d10.f22489a.sendEmptyMessageDelayed(1001, 3000L);
        }
    }
}
