package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfux extends zzfus {
    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzful zzfulVar = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfud.zzg(jSONObject, zzfulVar.zzd())) {
            return null;
        }
        zzfulVar.zze(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfut, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    public zzfux(zzful zzfulVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfulVar, hashSet, jSONObject, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzfut
    /* JADX INFO: renamed from: zza */
    public final void onPostExecute(String str) {
        zzfth zzfthVarZza;
        if (!TextUtils.isEmpty(str) && (zzfthVarZza = zzfth.zza()) != null) {
            for (zzfsn zzfsnVar : zzfthVarZza.zze()) {
                if (((zzfus) this).zza.contains(zzfsnVar.zzh())) {
                    zzfsnVar.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
