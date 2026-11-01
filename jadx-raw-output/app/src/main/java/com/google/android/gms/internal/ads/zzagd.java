package com.google.android.gms.internal.ads;

import androidx.annotation.RestrictTo;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class zzagd extends zzafi {
    private final long zza;

    @Override // com.google.android.gms.internal.ads.zzafi, com.google.android.gms.internal.ads.zzaev
    public final long zzm() {
        return super.zzm() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafi, com.google.android.gms.internal.ads.zzaev
    public final long zzn() {
        return super.zzn() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafi, com.google.android.gms.internal.ads.zzaev
    public final long zzo() {
        return super.zzo() - this.zza;
    }

    public zzagd(zzaev zzaevVar, long j10) {
        boolean z10;
        super(zzaevVar);
        if (zzaevVar.zzn() >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgrc.zza(z10);
        this.zza = j10;
    }
}
