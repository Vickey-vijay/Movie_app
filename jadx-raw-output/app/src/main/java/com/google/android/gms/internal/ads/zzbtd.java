package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbtd implements zzbsp {
    private final zzbsr zza;
    private final zzbss zzb;
    private final zzbsl zzc;
    private final String zzd;

    public zzbtd(zzbsl zzbslVar, String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        this.zzc = zzbslVar;
        this.zzd = str;
        this.zzb = zzbssVar;
        this.zza = zzbsrVar;
    }

    public final /* synthetic */ zzbsr zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final q5.i zzb(Object obj) {
        zzcen zzcenVar = new zzcen();
        zzbsf zzbsfVarZzb = this.zzc.zzb(null);
        com.google.android.gms.ads.internal.util.zze.zza("callJs > getEngine: Promise created");
        zzbsfVarZzb.zze(new zzbta(this, zzbsfVarZzb, obj, zzcenVar), new zzbtb(this, zzcenVar, zzbsfVarZzb));
        return zzcenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final q5.i zza(@Nullable Object obj) throws Exception {
        return zzb(obj);
    }

    public final /* synthetic */ void zzc(zzbsf zzbsfVar, zzbsm zzbsmVar, Object obj, zzcen zzcenVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            String string = UUID.randomUUID().toString();
            zzbog.zzo.zzb(string, new zzbtc(this, zzbsfVar, zzcenVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", string);
            jSONObject.put("args", this.zzb.zzb(obj));
            zzbsmVar.zzb(this.zzd, jSONObject);
        } catch (Exception e10) {
            try {
                zzcenVar.zzd(e10);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to invokeJavascript", e10);
            } finally {
                zzbsfVar.zza();
            }
        }
    }
}
