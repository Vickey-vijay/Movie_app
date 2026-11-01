package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzapz {
    public final int zza;

    @Nullable
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public final int zza() {
        int i10 = this.zzc;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return 2048;
    }

    public zzapz(int i10, @Nullable String str, int i11, @Nullable List list, byte[] bArr) {
        List listUnmodifiableList;
        this.zza = i10;
        this.zzb = str;
        this.zzc = i11;
        if (list == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list);
        }
        this.zzd = listUnmodifiableList;
        this.zze = bArr;
    }
}
