package com.google.android.gms.internal.ads;

import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzati {
    public static int zzc(byte b10) {
        return b10 < 0 ? b10 + PublisherCallbacks.NORMAL_FLOW : b10;
    }

    public static double zze(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i10 = bArr[0] << 24;
        int i11 = bArr[1] << 16;
        int i12 = bArr[2] << 8;
        return ((double) ((((i10 & ViewCompat.MEASURED_STATE_MASK) | (i11 & ItemTouchHelper.ACTION_MODE_DRAG_MASK)) | (65280 & i12)) | (bArr[3] & 255))) / 65536.0d;
    }

    public static double zzf(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        int i10 = bArr[0] << 24;
        int i11 = bArr[1] << 16;
        int i12 = bArr[2] << 8;
        return ((double) ((((i10 & ViewCompat.MEASURED_STATE_MASK) | (i11 & ItemTouchHelper.ACTION_MODE_DRAG_MASK)) | (65280 & i12)) | (bArr[3] & 255))) / 1.073741824E9d;
    }

    public static long zza(ByteBuffer byteBuffer) {
        long j10 = byteBuffer.getInt();
        if (j10 < 0) {
            return j10 + 4294967296L;
        }
        return j10;
    }

    public static int zzb(ByteBuffer byteBuffer) {
        return (zzc(byteBuffer.get()) << 8) + zzc(byteBuffer.get());
    }

    public static long zzd(ByteBuffer byteBuffer) {
        long jZza = zza(byteBuffer) << 32;
        if (jZza >= 0) {
            return jZza + zza(byteBuffer);
        }
        throw new RuntimeException("I don't know how to deal with UInt64! long is not sufficient and I don't want to use BigInt");
    }
}
