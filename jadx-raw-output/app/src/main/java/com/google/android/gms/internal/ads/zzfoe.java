package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public interface zzfoe {
    zzfoe zza();

    boolean zzb();

    zzfoe zzc();

    zzfoe zzd(boolean z10);

    zzfoe zze(String str);

    zzfoe zzf(zzfot zzfotVar);

    zzfoe zzg(zzfjb zzfjbVar);

    zzfoe zzh(com.google.android.gms.ads.internal.client.zze zzeVar);

    zzfoe zzi(String str);

    zzfoe zzj(Throwable th2);

    zzfoe zzk(String str);

    boolean zzl();

    @Nullable
    zzfoh zzm();

    zzfoe zzp(int i10);

    static zzfoe zzn(Context context, int i10) {
        boolean zBooleanValue;
        if (zzfor.zza()) {
            int i11 = i10 - 2;
            if (i11 != 20 && i11 != 21) {
                if (i11 != 110) {
                    switch (i11) {
                        case 2:
                        case 3:
                        case 6:
                        case 7:
                        case 8:
                            zBooleanValue = ((Boolean) zzbix.zzc.zze()).booleanValue();
                            break;
                        case 4:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            zBooleanValue = ((Boolean) zzbix.zzd.zze()).booleanValue();
                            break;
                        case 5:
                            zBooleanValue = ((Boolean) zzbix.zzb.zze()).booleanValue();
                            break;
                    }
                } else {
                    zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkm)).booleanValue();
                }
            } else {
                zBooleanValue = ((Boolean) zzbix.zze.zze()).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfog(context, i10);
            }
        }
        return new zzfph();
    }

    static zzfoe zzo(Context context, int i10, int i11, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzfoe zzfoeVarZzn = zzn(context, i10);
        if (zzfoeVarZzn instanceof zzfog) {
            zzfoeVarZzn.zza();
            zzfoeVarZzn.zzp(i11);
            zzfoeVarZzn.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (zzfon.zza(str)) {
                zzfoeVarZzn.zze(str);
            }
        }
        return zzfoeVarZzn;
    }
}
