package com.google.android.gms.internal.ads;

import android.os.IBinder;
import androidx.annotation.Nullable;
import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class zzgpq {
    public abstract IBinder zza();

    @Nullable
    public abstract String zzb();

    public abstract int zzc();

    public abstract float zzd();

    public abstract int zze();

    public abstract int zzf();

    @Nullable
    public abstract String zzg();

    public abstract int zzh();

    @Nullable
    public abstract String zzi();

    @Nullable
    public abstract String zzj();

    @Nullable
    public abstract String zzk();

    public static zzgpp zzl() {
        zzgoo zzgooVar = new zzgoo();
        zzgooVar.zzc(BadgeDrawable.BOTTOM_START);
        zzgooVar.zzd(-1.0f);
        zzgooVar.zze(0);
        zzgooVar.zzf(0);
        return zzgooVar;
    }
}
