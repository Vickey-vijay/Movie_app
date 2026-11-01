package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzgtf extends zzgti {
    public final /* synthetic */ zzgtm zza;

    @Override // com.google.android.gms.internal.ads.zzgti
    public final /* bridge */ /* synthetic */ Object zza(int i10) {
        return new zzgtk(this.zza, i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgtf(zzgtm zzgtmVar) {
        super(zzgtmVar, null);
        Objects.requireNonNull(zzgtmVar);
        this.zza = zzgtmVar;
    }
}
