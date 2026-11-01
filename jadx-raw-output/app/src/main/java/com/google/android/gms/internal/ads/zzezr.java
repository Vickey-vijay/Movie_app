package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzezr implements zzfax {
    private final Context zza;
    private final zzgzy zzb;
    private final zzfjk zzc;
    private final VersionInfoParcel zzd;

    public zzezr(Context context, zzgzy zzgzyVar, zzfjk zzfjkVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzgzyVar;
        this.zzc = zzfjkVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 53;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0044 A[Catch: IOException -> 0x0126, TryCatch #0 {IOException -> 0x0126, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00ef, B:28:0x0113, B:30:0x011e, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0056 A[Catch: IOException -> 0x0126, TryCatch #0 {IOException -> 0x0126, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00ef, B:28:0x0113, B:30:0x011e, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x00bf A[Catch: IOException -> 0x0126, TryCatch #0 {IOException -> 0x0126, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00ef, B:28:0x0113, B:30:0x011e, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00d1 A[Catch: IOException -> 0x0126, TryCatch #0 {IOException -> 0x0126, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00ef, B:28:0x0113, B:30:0x011e, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ef A[Catch: IOException -> 0x0126, TryCatch #0 {IOException -> 0x0126, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:8:0x0030, B:13:0x0056, B:14:0x007a, B:16:0x008c, B:18:0x00a2, B:20:0x00ab, B:25:0x00d1, B:27:0x00ef, B:28:0x0113, B:30:0x011e, B:23:0x00bf, B:11:0x0044), top: B:35:0x0000 }] */
    public final /* synthetic */ zzezs zzc() {
        zzgah zzgahVar;
        boolean z10;
        boolean zZze;
        zzgam zzgamVarZzh;
        zzgai zzgaiVarZza;
        try {
            Context context = this.zza;
            boolean zZza = this.zzc.zza();
            zzgah zzgahVar2 = new zzgah();
            zzgah zzgahVar3 = new zzgah();
            boolean zZzc = true;
            if (zZza) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdV)).booleanValue()) {
                    return new zzezs(true);
                }
            }
            if (!zZza) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdR)).booleanValue()) {
                    zzgahVar2 = zzgal.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzec)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                } else if (zZza) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdT)).booleanValue()) {
                        zzgahVar2 = zzgal.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzec)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                    }
                }
            } else if (zZza) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdT)).booleanValue()) {
                    zzgahVar2 = zzgal.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzec)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdZ)).booleanValue()) {
                if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdY)).intValue()) {
                    zzgam.zzh(context).zzj();
                }
            }
            if (zZza) {
                if (zZza) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdU)).booleanValue()) {
                        zzgamVarZzh = zzgam.zzh(context);
                        zzgaiVarZza = zzgai.zza(context);
                        if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdY)).intValue()) {
                            zzgahVar3 = zzgamVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzed)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                            zZzc = zzgaiVarZza.zzc();
                        }
                        zZze = zzgaiVarZza.zze();
                        zzgahVar = zzgahVar3;
                        z10 = zZzc;
                    }
                }
                zzgahVar = zzgahVar3;
                z10 = true;
                zZze = true;
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdS)).booleanValue()) {
                    zzgamVarZzh = zzgam.zzh(context);
                    zzgaiVarZza = zzgai.zza(context);
                    if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdY)).intValue()) {
                        zzgahVar3 = zzgamVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzed)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                        zZzc = zzgaiVarZza.zzc();
                    }
                    zZze = zzgaiVarZza.zze();
                    zzgahVar = zzgahVar3;
                    z10 = zZzc;
                } else {
                    if (zZza) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdU)).booleanValue()) {
                            zzgamVarZzh = zzgam.zzh(context);
                            zzgaiVarZza = zzgai.zza(context);
                            if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdY)).intValue()) {
                                zzgahVar3 = zzgamVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzed)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                                zZzc = zzgaiVarZza.zzc();
                            }
                            zZze = zzgaiVarZza.zze();
                            zzgahVar = zzgahVar3;
                            z10 = zZzc;
                        }
                    }
                    zzgahVar = zzgahVar3;
                    z10 = true;
                    zZze = true;
                }
            }
            return new zzezs(zzgahVar2, zzgahVar, z10, zZze, zZza);
        } catch (IOException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "PerAppIdSignal");
            return new zzezs(this.zzc.zza());
        }
    }
}
