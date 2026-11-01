package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfon {
    public static zzfmu zzc(final zzfoe zzfoeVar) {
        return new zzfmu() { // from class: com.google.android.gms.internal.ads.zzfom
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj) {
                if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
                    zzfoeVar.zza();
                }
                return obj;
            }
        };
    }

    public static void zzd(q5.i iVar, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzh(iVar, zzfooVar, zzfoeVar, false);
    }

    public static void zze(q5.i iVar, zzfoo zzfooVar, zzfoe zzfoeVar) {
        zzh(iVar, zzfooVar, zzfoeVar, true);
    }

    public static int zzg(zzfjk zzfjkVar) {
        int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfjkVar) - 1;
        return (iZzg == 0 || iZzg == 1) ? 7 : 23;
    }

    public static void zzb(q5.i iVar, zzfoe zzfoeVar) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(iVar), new zzfoj(zzfoeVar), zzcei.zzg);
        }
    }

    public static void zzf(q5.i iVar, zzfoo zzfooVar, zzfoe zzfoeVar) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(iVar), new zzfol(zzfooVar, zzfoeVar), zzcei.zzg);
        }
    }

    private static void zzh(q5.i iVar, zzfoo zzfooVar, zzfoe zzfoeVar, boolean z10) {
        if (((Boolean) zzbix.zzc.zze()).booleanValue()) {
            zzgzo.zzr(zzgzg.zzw(iVar), new zzfok(zzfooVar, zzfoeVar, z10), zzcei.zzg);
        }
    }

    public static boolean zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzke), str);
    }
}
