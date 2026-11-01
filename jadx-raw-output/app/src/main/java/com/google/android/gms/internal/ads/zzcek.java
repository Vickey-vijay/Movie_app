package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcek implements zzgzl {
    public final /* synthetic */ String zza;

    public zzcek(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zzb(@Nullable Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, this.zza);
    }
}
