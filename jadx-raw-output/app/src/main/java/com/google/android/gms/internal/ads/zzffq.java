package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzffq implements zzfgj {
    private final zzfgj zza;
    private final zzfgj zzb;
    private final zzflv zzc;
    private final String zzd;
    private zzdam zze;
    private final Executor zzf;

    public zzffq(zzfgj zzfgjVar, zzfgj zzfgjVar2, zzflv zzflvVar, String str, Executor executor) {
        this.zza = zzfgjVar;
        this.zzb = zzfgjVar2;
        this.zzc = zzflvVar;
        this.zzd = str;
        this.zzf = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzdam zzd() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfgj
    public final /* bridge */ /* synthetic */ q5.i zzc(zzfgk zzfgkVar, zzfgi zzfgiVar, Object obj) {
        return zzb(zzfgkVar, zzfgiVar, null);
    }

    private final q5.i zzg(zzfli zzfliVar, zzfgk zzfgkVar) {
        zzdam zzdamVar = zzfliVar.zza;
        this.zze = zzdamVar;
        if (zzfliVar.zzc != null) {
            if (zzdamVar.zzc() != null) {
                zzfliVar.zzc.zzp().zzu(zzfliVar.zza.zzc());
            }
            return zzgzo.zza(zzfliVar.zzc);
        }
        zzdamVar.zza().zzh(zzfliVar.zzb);
        return ((zzfga) this.zza).zzb(zzfgkVar, null, zzfliVar.zza);
    }

    public final synchronized q5.i zzb(final zzfgk zzfgkVar, final zzfgi zzfgiVar, zzdam zzdamVar) {
        zzdal zzdalVarZza = zzfgiVar.zza(zzfgkVar.zzb);
        zzdalVarZza.zzi(new zzffr(this.zzd));
        final zzdam zzdamVar2 = (zzdam) zzdalVarZza.zzh();
        zzdamVar2.zzb();
        zzdamVar2.zzb();
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzdamVar2.zzb().zzd;
        if (zzmVar.zzs == null && zzmVar.zzx == null) {
            zzfjk zzfjkVarZzb = zzdamVar2.zzb();
            com.google.android.gms.ads.internal.client.zzm zzmVar2 = zzfjkVarZzb.zzd;
            String str = zzfjkVarZzb.zzg;
            com.google.android.gms.ads.internal.client.zzx zzxVar = zzfjkVarZzb.zzk;
            Executor executor = this.zzf;
            final zzffp zzffpVar = new zzffp(zzfgiVar, zzfgkVar, zzmVar2, str, executor, zzxVar, null);
            return (zzgzg) zzgzo.zzj(zzgzg.zzw(((zzffw) this.zzb).zza(zzfgkVar, zzfgiVar, zzdamVar2)), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzffo
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ q5.i zza(Object obj) {
                    return this.zza.zze(zzfgkVar, zzffpVar, zzfgiVar, zzdamVar2, (zzffv) obj);
                }
            }, executor);
        }
        this.zze = zzdamVar2;
        return ((zzfga) this.zza).zzb(zzfgkVar, zzfgiVar, zzdamVar2);
    }

    public final /* synthetic */ q5.i zze(zzfgk zzfgkVar, zzffp zzffpVar, zzfgi zzfgiVar, zzdam zzdamVar, zzffv zzffvVar) {
        if (zzffvVar != null) {
            zzffp zzffpVar2 = new zzffp(zzffpVar.zza, zzffpVar.zzb, zzffpVar.zzc, zzffpVar.zzd, zzffpVar.zze, zzffpVar.zzf, zzffvVar.zza);
            zzfli zzfliVar = zzffvVar.zzc;
            if (zzfliVar != null) {
                this.zze = null;
                this.zzc.zza(zzffpVar2);
                return zzg(zzfliVar, zzfgkVar);
            }
            zzflv zzflvVar = this.zzc;
            q5.i iVarZzb = zzflvVar.zzb(zzffpVar2);
            if (iVarZzb != null) {
                this.zze = null;
                return zzgzo.zzj(iVarZzb, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzffn
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ q5.i zza(Object obj) {
                        return this.zza.zzf((zzflr) obj);
                    }
                }, this.zzf);
            }
            zzflvVar.zza(zzffpVar2);
            zzfgkVar = new zzfgk(zzfgkVar.zzb, zzffvVar.zzb);
        }
        q5.i iVarZzb2 = ((zzfga) this.zza).zzb(zzfgkVar, zzfgiVar, zzdamVar);
        this.zze = zzdamVar;
        return iVarZzb2;
    }

    public final /* synthetic */ q5.i zzf(zzflr zzflrVar) throws zzecr {
        zzfli zzfliVar;
        zzflt zzfltVar;
        if (zzflrVar == null || (zzfliVar = zzflrVar.zza) == null || (zzfltVar = zzflrVar.zzb) == null) {
            throw new zzecr(1, "Empty prefetch");
        }
        zzbgj.zzb.zzc zzcVarZzs = zzbgj.zzb.zzs();
        zzbgj.zzb.zza.C0193zza c0193zzaZzs = zzbgj.zzb.zza.zzs();
        c0193zzaZzs.zzc(zzbgj.zzb.zzd.IN_MEMORY);
        c0193zzaZzs.zzg(zzbgj.zzb.zze.zzs());
        zzcVarZzs.zzh(c0193zzaZzs);
        zzfliVar.zza.zza().zzd().zzl(zzcVarZzs.zzbu());
        return zzg(zzfliVar, ((zzffp) zzfltVar).zzb);
    }
}
