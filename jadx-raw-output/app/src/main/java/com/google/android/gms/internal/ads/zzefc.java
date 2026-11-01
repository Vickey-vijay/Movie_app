package com.google.android.gms.internal.ads;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzefc implements zzefe {
    private final Map zza;
    private final zzgzy zzb;
    private final zzdej zzc;

    public zzefc(Map map, zzgzy zzgzyVar, zzdej zzdejVar) {
        this.zza = map;
        this.zzb = zzgzyVar;
        this.zzc = zzdejVar;
    }

    public final /* synthetic */ zzdej zzb() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzefe
    public final q5.i zza(final zzbzu zzbzuVar) {
        this.zzc.zzdO(zzbzuVar);
        q5.i iVarZzc = zzgzo.zzc(new zzecr(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjz)).split(StringUtils.COMMA)) {
            final zzikv zzikvVar = (zzikv) this.zza.get(str.trim());
            if (zzikvVar != null) {
                iVarZzc = zzgzo.zzh(iVarZzc, zzecr.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzefb
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ q5.i zza(Object obj) {
                        return ((zzefe) zzikvVar.zzb()).zza(zzbzuVar);
                    }
                }, this.zzb);
            }
        }
        zzgzo.zzr(iVarZzc, new zzefa(this), zzcei.zzg);
        return iVarZzc;
    }
}
