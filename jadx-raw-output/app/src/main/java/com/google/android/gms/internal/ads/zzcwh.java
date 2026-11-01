package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcwh implements zzcwi {
    private final Map zza;

    public zzcwh(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcwi
    @Nullable
    public final zzekg zza(int i10, String str) {
        return (zzekg) this.zza.get(str);
    }
}
