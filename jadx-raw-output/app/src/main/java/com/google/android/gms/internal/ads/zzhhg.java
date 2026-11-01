package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
abstract class zzhhg {
    private final zzhhe zza;
    private final zzhhe zzb;

    public abstract zzhhe zza(byte[] bArr, int i10) throws InvalidKeyException;

    public zzhhg(byte[] bArr) throws GeneralSecurityException {
        if (zzhid.zza(1)) {
            this.zza = zza(bArr, 1);
            this.zzb = zza(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public final byte[] zzb(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i10;
        int i11;
        if (byteBuffer.remaining() >= 16) {
            int iPosition = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(iPosition);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr4 = new byte[32];
                this.zzb.zzd(bArr, 0).get(bArr4);
                int length = bArr2.length;
                int i12 = length & 15;
                if (i12 == 0) {
                    i10 = length;
                } else {
                    i10 = (length + 16) - i12;
                }
                int iRemaining = byteBuffer.remaining();
                int i13 = iRemaining % 16;
                if (i13 == 0) {
                    i11 = iRemaining;
                } else {
                    i11 = (iRemaining + 16) - i13;
                }
                int i14 = i11 + i10;
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(i14 + 16).order(ByteOrder.LITTLE_ENDIAN);
                byteBufferOrder.put(bArr2);
                byteBufferOrder.position(i10);
                byteBufferOrder.put(byteBuffer);
                byteBufferOrder.position(i14);
                byteBufferOrder.putLong(length);
                byteBufferOrder.putLong(iRemaining);
                if (MessageDigest.isEqual(zzhhk.zza(bArr4, byteBufferOrder.array()), bArr3)) {
                    byteBuffer.position(iPosition);
                    return this.zza.zzc(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e10) {
                throw new AEADBadTagException(e10.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
