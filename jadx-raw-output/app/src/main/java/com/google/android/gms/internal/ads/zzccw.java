package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import androidx.annotation.GuardedBy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzccw {

    @GuardedBy("this")
    private final Map zza = new HashMap();

    @GuardedBy("this")
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzccj zzd;

    public final synchronized void zza(zzccu zzccuVar) {
        this.zzb.add(zzccuVar);
    }

    public final synchronized void zzb(String str) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            return;
        }
        SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
        zzcct zzcctVar = new zzcct(this, str);
        map.put(str, zzcctVar);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzcctVar);
    }

    public final /* synthetic */ List zzd() {
        return this.zzb;
    }

    public zzccw(Context context, zzccj zzccjVar) {
        this.zzc = context;
        this.zzd = zzccjVar;
    }

    public final /* synthetic */ void zzc(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zzb();
        }
    }
}
