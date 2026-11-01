package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzezl implements zzfav {

    @Nullable
    private final String zza;

    @Nullable
    private final Integer zzb;

    @Nullable
    private final String zzc;

    @Nullable
    private final String zzd;

    @Nullable
    private final String zze;

    @Nullable
    private final String zzf;

    public zzezl(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.zza = str;
        this.zzb = num;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = str5;
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzdah) obj).zza;
        zzfjz.zze(bundle, "pn", this.zza);
        zzfjz.zzh(bundle, "vc", this.zzb);
        zzfjz.zze(bundle, "vnm", this.zzc);
        zzfjz.zze(bundle, "dl", this.zzd);
        zzfjz.zze(bundle, "ins_pn", this.zze);
        zzfjz.zze(bundle, "ini_pn", this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzfav
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzdah) obj).zzb;
        zzfjz.zze(bundle, "pn", this.zza);
        zzfjz.zze(bundle, "dl", this.zzd);
    }
}
