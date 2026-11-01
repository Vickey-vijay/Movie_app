package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzq extends AsyncTask {
    public final /* synthetic */ zzs zza;

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zza.zzN();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzs zzsVar = this.zza;
        String str = (String) obj;
        if (zzsVar.zzW() == null || str == null) {
            return;
        }
        AdMobNetworkBridge.webviewLoadUrl(zzsVar.zzW(), str);
    }

    public /* synthetic */ zzq(zzs zzsVar, byte[] bArr) {
        Objects.requireNonNull(zzsVar);
        this.zza = zzsVar;
    }
}
