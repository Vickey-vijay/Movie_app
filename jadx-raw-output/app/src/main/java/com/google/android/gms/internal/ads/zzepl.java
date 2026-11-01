package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzepl extends zzcue {
    @Override // com.google.android.gms.internal.ads.zzcue
    public final zzdcr zze(Set set) {
        return new zzdcr(Collections.emptySet());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzepl(zzepp zzeppVar, View view, zzcjl zzcjlVar, zzcwd zzcwdVar, zzfis zzfisVar) {
        super(view, null, zzcwdVar, zzfisVar);
        Objects.requireNonNull(zzeppVar);
    }
}
