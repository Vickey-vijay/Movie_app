package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgri extends zzgrp {
    public final /* synthetic */ zzgqq zza;

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzd(int i10) {
        return i10 + 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgri(zzgrr zzgrrVar, CharSequence charSequence, zzgqq zzgqqVar) {
        super(zzgrrVar, charSequence);
        this.zza = zzgqqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzc(int i10) {
        CharSequence charSequence = ((zzgrp) this).zzb;
        int length = charSequence.length();
        zzgrc.zzn(i10, length, "index");
        while (i10 < length) {
            if (this.zza.zzb(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
