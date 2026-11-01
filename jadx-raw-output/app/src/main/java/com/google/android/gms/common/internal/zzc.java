package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class zzc {

    @Nullable
    private Object zza;
    private boolean zzb;
    public final /* synthetic */ BaseGmsClient zzd;

    public abstract void zzc(Object obj);

    public final void zzf() {
        synchronized (this) {
            this.zza = null;
        }
    }

    public final void zzd() {
        Object obj;
        synchronized (this) {
            obj = this.zza;
            if (this.zzb) {
                String string = toString();
                StringBuilder sb2 = new StringBuilder(string.length() + 47);
                sb2.append("Callback proxy ");
                sb2.append(string);
                sb2.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb2.toString());
            }
        }
        if (obj != null) {
            try {
                zzc(obj);
            } catch (RuntimeException e10) {
                throw e10;
            }
        }
        synchronized (this) {
            this.zzb = true;
        }
        zze();
    }

    public zzc(BaseGmsClient baseGmsClient, Object obj) {
        java.util.Objects.requireNonNull(baseGmsClient);
        this.zzd = baseGmsClient;
        this.zza = obj;
        this.zzb = false;
    }

    public final void zze() {
        zzf();
        BaseGmsClient baseGmsClient = this.zzd;
        synchronized (baseGmsClient.zzj()) {
            baseGmsClient.zzj().remove(this);
        }
    }
}
