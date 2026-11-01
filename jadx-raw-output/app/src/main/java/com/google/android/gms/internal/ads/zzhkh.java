package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzhkh {
    public static final zzhye zza = zzhye.zza(new byte[0]);

    public static final zzhye zza(int i10) {
        return zzhye.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(i10).array());
    }

    public static final zzhye zzb(int i10) {
        return zzhye.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(i10).array());
    }
}
