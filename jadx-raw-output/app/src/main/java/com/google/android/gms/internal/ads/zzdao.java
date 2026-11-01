package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdao {
    private final Context zza;
    private final zzfjk zzb;
    private final Bundle zzc;

    @Nullable
    private final zzfjd zzd;

    @Nullable
    private final zzdag zze;

    @Nullable
    private final zzekl zzf;
    private final int zzg;

    public /* synthetic */ zzdao(zzdan zzdanVar, byte[] bArr) {
        this.zza = zzdanVar.zzi();
        this.zzb = zzdanVar.zzj();
        this.zzc = zzdanVar.zzk();
        this.zzd = zzdanVar.zzl();
        this.zze = zzdanVar.zzm();
        this.zzf = zzdanVar.zzn();
        this.zzg = zzdanVar.zzo();
    }

    public final zzfjk zzb() {
        return this.zzb;
    }

    @Nullable
    public final zzfjd zzc() {
        return this.zzd;
    }

    @Nullable
    public final Bundle zzd() {
        return this.zzc;
    }

    @Nullable
    public final zzdag zze() {
        return this.zze;
    }

    public final Context zzf(Context context) {
        return this.zza;
    }

    public final int zzh() {
        return this.zzg;
    }

    public final zzdan zza() {
        zzdan zzdanVar = new zzdan();
        zzdanVar.zza(this.zza);
        zzdanVar.zzb(this.zzb);
        zzdanVar.zzc(this.zzc);
        zzdanVar.zzd(this.zze);
        zzdanVar.zzg(this.zzf);
        return zzdanVar;
    }

    public final zzekl zzg(String str) {
        zzekl zzeklVar = this.zzf;
        return zzeklVar != null ? zzeklVar : new zzekl(str);
    }
}
