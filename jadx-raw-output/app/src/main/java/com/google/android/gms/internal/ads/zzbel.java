package com.google.android.gms.internal.ads;

import com.ironsource.Z7;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbel extends zzbeg {
    private MessageDigest zzb;

    @Override // com.google.android.gms.internal.ads.zzbeg
    public final byte[] zza(String str) {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(Z7.f27998r);
        int length = strArrSplit.length;
        int i10 = 4;
        if (length == 1) {
            int iZza = zzbek.zza(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iZza);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                    int iZza2 = zzbek.zza(strArrSplit[i11]);
                    int i12 = (iZza2 >> 16) ^ ((char) iZza2);
                    int i13 = i11 + i11;
                    bArr[i13] = (byte) i12;
                    bArr[i13 + 1] = (byte) (i12 >> 8);
                }
            } else {
                bArr = new byte[length];
                for (int i14 = 0; i14 < strArrSplit.length; i14++) {
                    int iZza3 = zzbek.zza(strArrSplit[i14]);
                    bArr[i14] = (byte) ((iZza3 >> 24) ^ (((iZza3 & 255) ^ ((iZza3 >> 8) & 255)) ^ ((iZza3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.zzb = zzb();
        synchronized (this.zza) {
            MessageDigest messageDigest = this.zzb;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.zzb.update(bArrArray);
            byte[] bArrDigest = this.zzb.digest();
            int length2 = bArrDigest.length;
            if (length2 <= 4) {
                i10 = length2;
            }
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArrDigest, 0, bArr2, 0, i10);
            return bArr2;
        }
    }
}
