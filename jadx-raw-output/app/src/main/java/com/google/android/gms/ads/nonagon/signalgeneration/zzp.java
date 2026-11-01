package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzdye;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzp extends QueryInfoGenerationCallback {
    private final zzo zza;
    private final zzdye zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();

    @Nullable
    private final Boolean zzf;

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("sgf_reason", str);
        pairArr[1] = new Pair("se", "query_g");
        pairArr[2] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[3] = new Pair("rtype", Integer.toString(6));
        pairArr[4] = new Pair("scar", "true");
        pairArr[5] = new Pair("lat_ms", Long.toString(zzb()));
        int i10 = this.zzd;
        pairArr[6] = new Pair("sgpc_rn", Integer.toString(i10));
        pairArr[7] = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        boolean z10 = this.zzc;
        pairArr[8] = new Pair("tpc", true != z10 ? "0" : "1");
        zzaa.zze(this.zzb, null, "sgpcf", pairArr);
        this.zza.zzc(z10, new zzq(null, str, zza(), i10));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", "true");
        pairArr[4] = new Pair("lat_ms", Long.toString(zzb()));
        int i10 = this.zzd;
        pairArr[5] = new Pair("sgpc_rn", Integer.toString(i10));
        pairArr[6] = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        boolean z10 = this.zzc;
        pairArr[7] = new Pair("tpc", true != z10 ? "0" : "1");
        zzaa.zze(this.zzb, null, "sgpcs", pairArr);
        this.zza.zzc(z10, new zzq(queryInfo, "", zza(), i10));
    }

    public zzp(zzo zzoVar, boolean z10, int i10, @Nullable Boolean bool, zzdye zzdyeVar) {
        this.zza = zzoVar;
        this.zzc = z10;
        this.zzd = i10;
        this.zzf = bool;
        this.zzb = zzdyeVar;
    }

    private static long zza() {
        return com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() + ((Long) zzbjj.zzh.zze()).longValue();
    }

    private final long zzb() {
        return com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zze;
    }
}
