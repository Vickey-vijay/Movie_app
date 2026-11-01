package io.appmetrica.analytics.screenshot.impl;

import android.app.Activity;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityEvent;
import io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4725u implements ActivityLifecycleListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4726v f58459a;

    public C4725u(C4726v c4726v) {
        this.f58459a = c4726v;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.lifecycle.ActivityLifecycleListener
    public final void onEvent(Activity activity, ActivityEvent activityEvent) {
        int i10 = AbstractC4724t.f58458a[activityEvent.ordinal()];
        try {
            if (i10 == 1) {
                C4716k c4716k = this.f58459a.f58462c;
                if (c4716k == null || !c4716k.f58437a) {
                } else {
                    this.f58459a.f58460a.getContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, this.f58459a.f58463d);
                }
            } else if (i10 != 2) {
            } else {
                this.f58459a.f58460a.getContext().getContentResolver().unregisterContentObserver(this.f58459a.f58463d);
            }
        } catch (Throwable unused) {
        }
    }
}
