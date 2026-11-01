package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhkg {
    private static final zzhkg zza = (zzhkg) zzhlm.zza(new zzhll() { // from class: com.google.android.gms.internal.ads.zzhkf
        @Override // com.google.android.gms.internal.ads.zzhll
        public final /* synthetic */ Object zza() throws GeneralSecurityException {
            zzhkg zzhkgVar = new zzhkg();
            zzhkgVar.zzb(new zzhjg(zzhjo.class, zzhlb.class, new zzhjh() { // from class: com.google.android.gms.internal.ads.zzhke
                @Override // com.google.android.gms.internal.ads.zzhjh
                public final /* synthetic */ zzhlg zza(zzhaz zzhazVar, zzhbt zzhbtVar) {
                    return ((zzhjo) zzhazVar).zzc(zzhbtVar);
                }
            }));
            return zzhkgVar;
        }
    });
    private final AtomicReference zzb = new AtomicReference(new zzhlk(new zzhlh(), null));

    public static zzhkg zza() {
        return zza;
    }

    public final synchronized void zzb(zzhji zzhjiVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhlh zzhlhVar = new zzhlh((zzhlk) atomicReference.get());
        zzhlhVar.zza(zzhjiVar);
        atomicReference.set(new zzhlk(zzhlhVar, null));
    }

    public final synchronized void zzc(zzhjf zzhjfVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhlh zzhlhVar = new zzhlh((zzhlk) atomicReference.get());
        zzhlhVar.zzb(zzhjfVar);
        atomicReference.set(new zzhlk(zzhlhVar, null));
    }

    public final synchronized void zzd(zzhkn zzhknVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhlh zzhlhVar = new zzhlh((zzhlk) atomicReference.get());
        zzhlhVar.zzc(zzhknVar);
        atomicReference.set(new zzhlk(zzhlhVar, null));
    }

    public final synchronized void zze(zzhkk zzhkkVar) throws GeneralSecurityException {
        AtomicReference atomicReference = this.zzb;
        zzhlh zzhlhVar = new zzhlh((zzhlk) atomicReference.get());
        zzhlhVar.zzd(zzhkkVar);
        atomicReference.set(new zzhlk(zzhlhVar, null));
    }

    public final boolean zzf(zzhlg zzhlgVar) {
        return ((zzhlk) this.zzb.get()).zza(zzhlgVar);
    }

    public final zzhaz zzg(zzhlg zzhlgVar, zzhbt zzhbtVar) throws GeneralSecurityException {
        return ((zzhlk) this.zzb.get()).zzb(zzhlgVar, zzhbtVar);
    }

    public final zzhlg zzh(zzhaz zzhazVar, Class cls, zzhbt zzhbtVar) throws GeneralSecurityException {
        return ((zzhlk) this.zzb.get()).zzc(zzhazVar, cls, zzhbtVar);
    }

    public final boolean zzi(zzhlg zzhlgVar) {
        return ((zzhlk) this.zzb.get()).zzd(zzhlgVar);
    }

    public final zzhbp zzj(zzhlg zzhlgVar) throws GeneralSecurityException {
        return ((zzhlk) this.zzb.get()).zze(zzhlgVar);
    }

    public final zzhlg zzk(zzhbp zzhbpVar, Class cls) throws GeneralSecurityException {
        return ((zzhlk) this.zzb.get()).zzf(zzhbpVar, cls);
    }
}
