package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcwn implements zzens {
    public final List zza;

    public zzcwn(List list) {
        this.zza = list;
    }

    public static zzekg zza(@NonNull zzemm zzemmVar) {
        return new zzekh(zzemmVar, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzcwm
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return new zzcwn((List) obj);
            }
        });
    }

    public static zzekg zzb(@NonNull zzekg zzekgVar) {
        return new zzekh(zzekgVar, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzcwl
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return new zzcwn((zzcwf) obj);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzens
    public final void zzm() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgzo.zzr((q5.i) it.next(), new zzcwk(this), zzhaf.zza());
        }
    }

    public zzcwn(zzcwf zzcwfVar) {
        this.zza = Collections.singletonList(zzgzo.zza(zzcwfVar));
    }
}
