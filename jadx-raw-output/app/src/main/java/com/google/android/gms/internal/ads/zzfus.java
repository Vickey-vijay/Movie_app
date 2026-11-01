package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public abstract class zzfus extends zzfut {
    public final HashSet zza;
    public final JSONObject zzb;
    public final long zzc;

    public zzfus(zzful zzfulVar, HashSet hashSet, JSONObject jSONObject, long j10) {
        super(zzfulVar);
        this.zza = new HashSet(hashSet);
        this.zzb = jSONObject;
        this.zzc = j10;
    }
}
