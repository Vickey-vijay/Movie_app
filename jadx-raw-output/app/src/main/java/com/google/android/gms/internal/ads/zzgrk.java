package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgrk extends zzgrp {
    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzd(int i10) {
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzc(int i10) {
        int i11 = i10 + 4000;
        if (i11 < ((zzgrp) this).zzb.length()) {
            return i11;
        }
        return -1;
    }

    public zzgrk(zzgrr zzgrrVar, CharSequence charSequence, int i10) {
        super(zzgrrVar, charSequence);
    }
}
