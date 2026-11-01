package com.yk.e.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import gl.j0;
import gl.k;
import gl.l1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class IL1Iii implements Application.ActivityLifecycleCallbacks {
    public static volatile IL1Iii ILil;
    public final List IL1Iii = Collections.synchronizedList(new ArrayList());

    public static IL1Iii IL1Iii() {
        if (ILil == null) {
            synchronized (IL1Iii.class) {
                if (ILil == null) {
                    ILil = new IL1Iii();
                }
            }
        }
        return ILil;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            Iterator it = this.IL1Iii.iterator();
            while (it.hasNext()) {
                ((k) it.next()).getClass();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        try {
            Iterator it = this.IL1Iii.iterator();
            while (it.hasNext()) {
                ((k) it.next()).getClass();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Iterator it = this.IL1Iii.iterator();
        while (it.hasNext()) {
            ((k) it.next()).getClass();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        new WeakReference(activity);
        try {
            Iterator it = this.IL1Iii.iterator();
            while (it.hasNext()) {
                ((k) it.next()).onActivityResumed(activity);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        try {
            Iterator it = this.IL1Iii.iterator();
            while (it.hasNext()) {
                ((k) it.next()).getClass();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        try {
            Iterator it = this.IL1Iii.iterator();
            while (it.hasNext()) {
                ((k) it.next()).getClass();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        try {
            Iterator it = this.IL1Iii.iterator();
            while (it.hasNext()) {
                ((k) it.next()).getClass();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public final void IL1Iii(Context context) {
        try {
            if (context instanceof Activity) {
                new WeakReference((Activity) context);
            }
            IL1Iii IL1Iii = IL1Iii();
            l1 l1Var = j0.a().f53521l;
            IL1Iii.getClass();
            try {
                IL1Iii.IL1Iii.add(l1Var);
            } catch (Exception e10) {
                AdLog.e(e10.getMessage(), e10);
            }
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        } catch (Exception e11) {
            AdLog.e(e11.getMessage(), e11);
        }
    }
}
