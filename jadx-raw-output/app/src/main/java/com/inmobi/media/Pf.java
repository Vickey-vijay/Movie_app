package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
public final class Pf implements Application.ActivityLifecycleCallbacks {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(Pf pf2, Activity activity, ContinuationImpl continuationImpl) throws Throwable {
        Nf nf2;
        Activity activity2;
        wk.a aVar;
        WeakReference weakReference;
        if (continuationImpl instanceof Nf) {
            nf2 = (Nf) continuationImpl;
            int i10 = nf2.f23244e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nf2.f23244e = i10 - Integer.MIN_VALUE;
            } else {
                nf2 = new Nf(pf2, continuationImpl);
            }
        } else {
            nf2 = new Nf(pf2, continuationImpl);
        }
        Object obj = nf2.f23242c;
        Object objF = sj.a.f();
        int i11 = nf2.f23244e;
        if (i11 == 0) {
            kotlin.c.b(obj);
            wk.a aVar2 = Qf.f23388b;
            nf2.f23240a = activity;
            nf2.f23241b = aVar2;
            nf2.f23244e = 1;
            if (aVar2.a(null, nf2) == objF) {
                return objF;
            }
            activity2 = activity;
            aVar = aVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = nf2.f23241b;
            activity2 = nf2.f23240a;
            kotlin.c.b(obj);
        }
        try {
            if (Qf.f23387a != null) {
                int i12 = 0;
                int size = Qf.f23389c.size();
                while (true) {
                    if (i12 >= size) {
                        weakReference = null;
                        break;
                    }
                    ArrayList arrayList = Qf.f23389c;
                    if (ck.p.e((Context) ((WeakReference) arrayList.get(i12)).get(), activity2)) {
                        weakReference = (WeakReference) arrayList.get(i12);
                        break;
                    }
                    i12++;
                }
                if (weakReference != null) {
                    ArrayList arrayList2 = Qf.f23389c;
                    arrayList2.remove(weakReference);
                    if (arrayList2.isEmpty()) {
                        pf2.a(activity2);
                    }
                    mj.r rVar = mj.r.f64562a;
                }
            }
            return mj.r.f64562a;
        } finally {
            aVar.b(null);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        ck.p.j(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) throws InterruptedException {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        nk.i.b(null, new Of(this, activity, null), 1, null);
    }

    public final void a(Activity activity) {
        Picasso picasso = Qf.f23387a;
        ck.p.i("Qf", "access$getTAG$p(...)");
        Objects.toString(Qf.f23387a);
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        Picasso picasso2 = Qf.f23387a;
        if (picasso2 != null) {
            picasso2.shutdown();
        }
        Qf.f23387a = null;
    }
}
