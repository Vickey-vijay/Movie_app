package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.Nullable;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbfz {

    @Nullable
    private zzbfo zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbfz(Context context) {
        this.zzc = context;
    }

    public final /* synthetic */ zzbfo zzc() {
        return this.zza;
    }

    public final /* synthetic */ boolean zzd() {
        return this.zzb;
    }

    public final /* synthetic */ void zze(boolean z10) {
        this.zzb = true;
    }

    public final /* synthetic */ Object zzf() {
        return this.zzd;
    }

    public final Future zza(zzbfp zzbfpVar) {
        zzbft zzbftVar = new zzbft(this);
        zzbfx zzbfxVar = new zzbfx(this, zzbfpVar, zzbftVar);
        zzbfy zzbfyVar = new zzbfy(this, zzbftVar);
        synchronized (this.zzd) {
            zzbfo zzbfoVar = new zzbfo(this.zzc, com.google.android.gms.ads.internal.zzt.zzs().zza(), zzbfxVar, zzbfyVar);
            this.zza = zzbfoVar;
            zzbfoVar.checkAvailabilityAndConnect();
        }
        return zzbftVar;
    }

    public final /* synthetic */ void zzb() {
        synchronized (this.zzd) {
            zzbfo zzbfoVar = this.zza;
            if (zzbfoVar == null) {
                return;
            }
            zzbfoVar.disconnect();
            this.zza = null;
            Binder.flushPendingCommands();
        }
    }
}
