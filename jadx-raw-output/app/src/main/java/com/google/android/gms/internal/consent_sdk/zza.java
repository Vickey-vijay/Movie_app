package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;
import androidx.annotation.GuardedBy;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zza {

    @GuardedBy("AppComponent.class")
    private static zza zza;

    public abstract zzj zzb();

    public abstract zzbo zzc();

    public static zza zza(Context context) {
        zza zzaVar;
        synchronized (zza.class) {
            if (zza == null) {
                zzai zzaiVar = new zzai(null);
                zzaiVar.zzb((Application) context.getApplicationContext());
                zza = zzaiVar.zza();
            }
            zzaVar = zza;
        }
        return zzaVar;
    }
}
