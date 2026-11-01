package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzazs implements zzazy {
    public final /* synthetic */ Activity zza;

    public zzazs(zzazz zzazzVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzazzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzazy
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.zza);
    }
}
