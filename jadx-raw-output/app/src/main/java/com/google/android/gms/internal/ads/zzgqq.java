package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public abstract class zzgqq implements zzgrd {
    public static zzgqq zzc(char c10) {
        return new zzgqn(c10);
    }

    public abstract boolean zzb(char c10);

    @Override // com.google.android.gms.internal.ads.zzgrd
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }
}
