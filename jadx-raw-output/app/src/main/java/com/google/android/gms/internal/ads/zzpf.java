package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzpf implements zzpo {
    public static final zzgru zza = new zzgru() { // from class: com.google.android.gms.internal.ads.zzpd
        @Override // com.google.android.gms.internal.ads.zzgru
        public final /* synthetic */ Object zza() {
            return zzpf.zzp();
        }
    };
    private static final Random zzb = new Random();
    private final zzbe zzc;
    private final zzbd zzd;
    private final HashMap zze;
    private zzpn zzf;
    private zzbf zzg;

    @Nullable
    private String zzh;
    private long zzi;

    public zzpf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final void zza(zzpn zzpnVar) {
        this.zzf = zzpnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized String zzb(zzbf zzbfVar, zzwk zzwkVar) {
        return zzo(zzbfVar.zzo(zzwkVar.zza, this.zzd).zzc, zzwkVar).zze();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0040 A[Catch: all -> 0x00b2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001c, B:14:0x0024, B:16:0x0030, B:18:0x0038, B:20:0x0040, B:22:0x004a, B:25:0x0053, B:27:0x0059, B:29:0x006e, B:30:0x0087, B:32:0x008d, B:33:0x0090, B:35:0x009c, B:37:0x00a2), top: B:45:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004a A[Catch: all -> 0x00b2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001c, B:14:0x0024, B:16:0x0030, B:18:0x0038, B:20:0x0040, B:22:0x004a, B:25:0x0053, B:27:0x0059, B:29:0x006e, B:30:0x0087, B:32:0x008d, B:33:0x0090, B:35:0x009c, B:37:0x00a2), top: B:45:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x006e A[Catch: all -> 0x00b2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001c, B:14:0x0024, B:16:0x0030, B:18:0x0038, B:20:0x0040, B:22:0x004a, B:25:0x0053, B:27:0x0059, B:29:0x006e, B:30:0x0087, B:32:0x008d, B:33:0x0090, B:35:0x009c, B:37:0x00a2), top: B:45:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008d A[Catch: all -> 0x00b2, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001c, B:14:0x0024, B:16:0x0030, B:18:0x0038, B:20:0x0040, B:22:0x004a, B:25:0x0053, B:27:0x0059, B:29:0x006e, B:30:0x0087, B:32:0x008d, B:33:0x0090, B:35:0x009c, B:37:0x00a2), top: B:45:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized void zzc(zzmy zzmyVar) {
        int i10;
        zzpe zzpeVarZzo;
        Object obj;
        int i11;
        zzpe zzpeVarZzo2;
        zzpe zzpeVar;
        this.zzf.getClass();
        zzbf zzbfVar = zzmyVar.zzb;
        if (!zzbfVar.zzg()) {
            zzwk zzwkVar = zzmyVar.zzd;
            if (zzwkVar != null) {
                long j10 = zzwkVar.zzd;
                if ((j10 == -1 || j10 >= zzi()) && ((zzpeVar = (zzpe) this.zze.get(this.zzh)) == null || zzpeVar.zzg() != -1 || zzpeVar.zzf() == zzmyVar.zzc)) {
                    i10 = zzmyVar.zzc;
                    zzpeVarZzo = zzo(i10, zzwkVar);
                    if (this.zzh == null) {
                        this.zzh = zzpeVarZzo.zze();
                    }
                    if (zzwkVar != null && zzwkVar.zzb()) {
                        obj = zzwkVar.zza;
                        long j11 = zzwkVar.zzd;
                        i11 = zzwkVar.zzb;
                        zzpeVarZzo2 = zzo(i10, new zzwk(obj, j11, i11));
                        if (!zzpeVarZzo2.zzi()) {
                            zzpeVarZzo2.zzj(true);
                            zzbd zzbdVar = this.zzd;
                            zzbfVar.zzo(obj, zzbdVar);
                            zzbdVar.zzc(i11);
                            Math.max(0L, zzfj.zzp(0L) + zzfj.zzp(0L));
                        }
                    }
                    if (!zzpeVarZzo.zzi()) {
                        zzpeVarZzo.zzj(true);
                    }
                    if (zzpeVarZzo.zze().equals(this.zzh) && !zzpeVarZzo.zzk()) {
                        zzpeVarZzo.zzl(true);
                        this.zzf.zzc(zzmyVar, zzpeVarZzo.zze());
                    }
                }
            } else {
                i10 = zzmyVar.zzc;
                zzpeVarZzo = zzo(i10, zzwkVar);
                if (this.zzh == null) {
                    this.zzh = zzpeVarZzo.zze();
                }
                if (zzwkVar != null) {
                    obj = zzwkVar.zza;
                    long j12 = zzwkVar.zzd;
                    i11 = zzwkVar.zzb;
                    zzpeVarZzo2 = zzo(i10, new zzwk(obj, j12, i11));
                    if (!zzpeVarZzo2.zzi()) {
                        zzpeVarZzo2.zzj(true);
                        zzbd zzbdVar2 = this.zzd;
                        zzbfVar.zzo(obj, zzbdVar2);
                        zzbdVar2.zzc(i11);
                        Math.max(0L, zzfj.zzp(0L) + zzfj.zzp(0L));
                    }
                }
                if (!zzpeVarZzo.zzi()) {
                    zzpeVarZzo.zzj(true);
                }
                if (zzpeVarZzo.zze().equals(this.zzh)) {
                    zzpeVarZzo.zzl(true);
                    this.zzf.zzc(zzmyVar, zzpeVarZzo.zze());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized void zzd(zzmy zzmyVar) {
        this.zzf.getClass();
        zzbf zzbfVar = this.zzg;
        this.zzg = zzmyVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpe zzpeVar = (zzpe) it.next();
            if (!zzpeVar.zza(zzbfVar, this.zzg) || zzpeVar.zzd(zzmyVar)) {
                it.remove();
                if (zzpeVar.zze().equals(this.zzh)) {
                    zzm(zzpeVar);
                }
                if (zzpeVar.zzi()) {
                    this.zzf.zzd(zzmyVar, zzpeVar.zze(), false);
                }
            }
        }
        zzl(zzmyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized void zze(zzmy zzmyVar, int i10) {
        this.zzf.getClass();
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpe zzpeVar = (zzpe) it.next();
            if (zzpeVar.zzd(zzmyVar)) {
                it.remove();
                boolean zEquals = zzpeVar.zze().equals(this.zzh);
                if (zEquals) {
                    zzm(zzpeVar);
                }
                if (zzpeVar.zzi()) {
                    boolean z10 = false;
                    if (i10 == 0 && zEquals && zzpeVar.zzk()) {
                        z10 = true;
                    }
                    this.zzf.zzd(zzmyVar, zzpeVar.zze(), z10);
                }
            }
        }
        zzl(zzmyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    @Nullable
    public final synchronized String zzf() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzpo
    public final synchronized void zzg(zzmy zzmyVar) {
        zzpn zzpnVar;
        String str = this.zzh;
        if (str != null) {
            zzpe zzpeVar = (zzpe) this.zze.get(str);
            zzpeVar.getClass();
            zzm(zzpeVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzpe zzpeVar2 = (zzpe) it.next();
            it.remove();
            if (zzpeVar2.zzi() && (zzpnVar = this.zzf) != null) {
                zzpnVar.zzd(zzmyVar, zzpeVar2.zze(), false);
            }
        }
    }

    public final /* synthetic */ zzbe zzj() {
        return this.zzc;
    }

    public final /* synthetic */ zzbd zzk() {
        return this.zzd;
    }

    private final void zzl(zzmy zzmyVar) {
        if (zzmyVar.zzb.zzg()) {
            String str = this.zzh;
            if (str != null) {
                zzpe zzpeVar = (zzpe) this.zze.get(str);
                zzpeVar.getClass();
                zzm(zzpeVar);
                return;
            }
            return;
        }
        zzpe zzpeVar2 = (zzpe) this.zze.get(this.zzh);
        int i10 = zzmyVar.zzc;
        zzwk zzwkVar = zzmyVar.zzd;
        this.zzh = zzo(i10, zzwkVar).zze();
        zzc(zzmyVar);
        if (zzwkVar == null || !zzwkVar.zzb()) {
            return;
        }
        if (zzpeVar2 != null) {
            if (zzpeVar2.zzg() == zzwkVar.zzd && zzpeVar2.zzh() != null) {
                zzwk zzwkVarZzh = zzpeVar2.zzh();
                if (zzwkVarZzh.zzb == zzwkVar.zzb) {
                    zzwk zzwkVarZzh2 = zzpeVar2.zzh();
                    if (zzwkVarZzh2.zzc == zzwkVar.zzc) {
                        return;
                    }
                }
            }
        }
        zzo(i10, new zzwk(zzwkVar.zza, zzwkVar.zzd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final long zzi() {
        zzpe zzpeVar = (zzpe) this.zze.get(this.zzh);
        return (zzpeVar == null || zzpeVar.zzg() == -1) ? this.zzi + 1 : zzpeVar.zzg();
    }

    private final zzpe zzo(int i10, @Nullable zzwk zzwkVar) {
        HashMap map = this.zze;
        long j10 = Long.MAX_VALUE;
        zzpe zzpeVar = null;
        for (zzpe zzpeVar2 : map.values()) {
            zzpeVar2.zzc(i10, zzwkVar);
            if (zzpeVar2.zzb(i10, zzwkVar)) {
                long jZzg = zzpeVar2.zzg();
                if (jZzg == -1 || jZzg < j10) {
                    zzpeVar = zzpeVar2;
                    j10 = jZzg;
                } else if (jZzg == j10) {
                    String str = zzfj.zza;
                    if (zzpeVar.zzh() != null && zzpeVar2.zzh() != null) {
                        zzpeVar = zzpeVar2;
                    }
                }
            }
        }
        if (zzpeVar != null) {
            return zzpeVar;
        }
        String strZzp = zzp();
        zzpe zzpeVar3 = new zzpe(this, strZzp, i10, zzwkVar);
        map.put(strZzp, zzpeVar3);
        return zzpeVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzp() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    public zzpf(zzgru zzgruVar) {
        this.zzc = new zzbe();
        this.zzd = new zzbd();
        this.zze = new HashMap();
        this.zzg = zzbf.zza;
        this.zzi = -1L;
    }

    private final void zzm(zzpe zzpeVar) {
        if (zzpeVar.zzg() != -1 && zzpeVar.zzi()) {
            this.zzi = zzpeVar.zzg();
        }
        this.zzh = null;
    }
}
