package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgrj extends zzgrp {
    public final /* synthetic */ zzgqr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgrj(zzgrr zzgrrVar, CharSequence charSequence, zzgqr zzgqrVar) {
        super(zzgrrVar, charSequence);
        this.zza = zzgqrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzc(int i10) {
        Matcher matcher = ((zzgqu) this.zza).zza;
        if (matcher.find(i10)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final int zzd(int i10) {
        return ((zzgqu) this.zza).zza.end();
    }
}
