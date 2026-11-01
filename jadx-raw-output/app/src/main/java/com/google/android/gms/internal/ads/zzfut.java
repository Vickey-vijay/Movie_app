package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzfut extends AsyncTask {
    private zzfuu zza;
    public final zzful zzd;

    public final void zzb(zzfuu zzfuuVar) {
        this.zza = zzfuuVar;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfuu zzfuuVar = this.zza;
        if (zzfuuVar != null) {
            zzfuuVar.zzb(this);
        }
    }

    public zzfut(zzful zzfulVar) {
        this.zzd = zzfulVar;
    }
}
