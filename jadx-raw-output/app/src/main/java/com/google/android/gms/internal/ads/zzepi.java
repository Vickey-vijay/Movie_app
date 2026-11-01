package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzepi implements zzekg {
    private final zzeki zza;
    private final zzekm zzb;
    private final zzfnu zzc;
    private final zzgzy zzd;

    public zzepi(zzfnu zzfnuVar, zzgzy zzgzyVar, zzeki zzekiVar, zzekm zzekmVar) {
        this.zzc = zzfnuVar;
        this.zzd = zzgzyVar;
        this.zzb = zzekmVar;
        this.zza = zzekiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final boolean zza(zzfjc zzfjcVar, zzfir zzfirVar) {
        return !zzfirVar.zzt.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzekg
    public final q5.i zzb(final zzfjc zzfjcVar, final zzfir zzfirVar) {
        final zzekj zzekjVarZza;
        Iterator it = zzfirVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzekjVarZza = null;
                break;
            }
            try {
                zzekjVarZza = this.zza.zza((String) it.next(), zzfirVar.zzv);
                break;
            } catch (zzfjr unused) {
            }
        }
        if (zzekjVarZza == null) {
            return zzgzo.zzc(new zzemz("Unable to instantiate mediation adapter class."));
        }
        zzcen zzcenVar = new zzcen();
        zzekjVarZza.zzc.zza(new zzepf(this, zzekjVarZza, zzcenVar));
        if (zzfirVar.zzM) {
            Bundle bundle = zzfjcVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfnu zzfnuVar = this.zzc;
        zzfno zzfnoVar = zzfno.ADAPTER_LOAD_AD_SYN;
        Objects.requireNonNull(zzfnuVar);
        return zzfnf.zzd(new zzfna() { // from class: com.google.android.gms.internal.ads.zzeph
            @Override // com.google.android.gms.internal.ads.zzfna
            public final /* synthetic */ void zza() throws zzfjr {
                this.zza.zzc(zzfjcVar, zzfirVar, zzekjVarZza);
            }
        }, this.zzd, zzfnoVar, zzfnuVar).zzj(zzfno.ADAPTER_LOAD_AD_ACK).zze(zzcenVar).zzj(zzfno.ADAPTER_WRAP_ADAPTER).zzb(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzepg
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj) {
                return this.zza.zzd(zzfjcVar, zzfirVar, zzekjVarZza, (Void) obj);
            }
        }).zzi();
    }

    public final /* synthetic */ void zzc(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar) throws zzfjr {
        this.zzb.zza(zzfjcVar, zzfirVar, zzekjVar);
    }

    public final /* synthetic */ Object zzd(zzfjc zzfjcVar, zzfir zzfirVar, zzekj zzekjVar, Void r10) {
        return this.zzb.zzb(zzfjcVar, zzfirVar, zzekjVar);
    }

    @VisibleForTesting
    public static final String zze(String str, int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i10).length());
        sb2.append("Error from: ");
        sb2.append(str);
        sb2.append(", code: ");
        sb2.append(i10);
        return sb2.toString();
    }
}
