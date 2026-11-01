package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfuw extends zzfus {
    @Override // android.os.AsyncTask
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfut, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    public zzfuw(zzful zzfulVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfulVar, hashSet, jSONObject, j10);
    }

    private final void zzc(String str) {
        zzfth zzfthVarZza = zzfth.zza();
        if (zzfthVarZza != null) {
            for (zzfsn zzfsnVar : zzfthVarZza.zze()) {
                if (((zzfus) this).zza.contains(zzfsnVar.zzh())) {
                    zzfsnVar.zzg().zzi(str, this.zzc);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfut
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
