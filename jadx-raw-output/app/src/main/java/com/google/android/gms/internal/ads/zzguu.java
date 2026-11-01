package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzguu extends zzgsd {
    public final /* synthetic */ Iterator zza;
    public final /* synthetic */ zzgrd zzb;

    public zzguu(Iterator it, zzgrd zzgrdVar) {
        this.zza = it;
        this.zzb = zzgrdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsd
    public final Object zza() {
        zzgrd zzgrdVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzgrdVar = this.zzb;
            next = it.next();
        } while (!zzgrdVar.zza(next));
        return next;
    }
}
