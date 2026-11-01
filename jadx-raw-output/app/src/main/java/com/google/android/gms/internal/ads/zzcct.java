package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcct implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ zzccw zza;
    private final String zzb;

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzccw zzccwVar = this.zza;
        synchronized (zzccwVar) {
            Iterator it = zzccwVar.zzd().iterator();
            while (it.hasNext()) {
                ((zzccu) it.next()).zza(sharedPreferences, this.zzb, str);
            }
        }
    }

    public zzcct(zzccw zzccwVar, String str) {
        Objects.requireNonNull(zzccwVar);
        this.zza = zzccwVar;
        this.zzb = str;
    }
}
