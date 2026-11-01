package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbtl implements zzgyw {
    private final String zza = "google.afma.activeView.handleUpdate";
    private final q5.i zzb;

    public zzbtl(q5.i iVar, String str, zzbss zzbssVar, zzbsr zzbsrVar) {
        this.zzb = iVar;
    }

    public final q5.i zzb(final Object obj) {
        return zzgzo.zzj(this.zzb, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzbtk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj2) {
                return this.zza.zzc(obj, (zzbsm) obj2);
            }
        }, zzcei.zzg);
    }

    public final /* synthetic */ q5.i zzc(Object obj, zzbsm zzbsmVar) throws JSONException {
        zzcen zzcenVar = new zzcen();
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        zzbog.zzo.zzb(string, new zzbtj(this, zzcenVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", string);
        jSONObject.put("args", (JSONObject) obj);
        zzbsmVar.zzb(this.zza, jSONObject);
        return zzcenVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final q5.i zza(Object obj) throws Exception {
        return zzb(obj);
    }
}
