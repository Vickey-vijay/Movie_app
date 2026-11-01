package io.bidmachine.analytics.internal;

import com.ironsource.C3426d4;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000e¨\u0006\u0011"}, d2 = {"Lio/bidmachine/analytics/internal/w;", "Lio/bidmachine/analytics/internal/B;", "", "macAlgorithm", "", C3426d4.i.W, "salt", "info", "", "size", "a", "(Ljava/lang/String;[B[B[BI)[B", "sharedSecret", "sharedInfo", "([B[B[B)[B", "<init>", "()V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class C4752w implements B {
    private final byte[] a(String macAlgorithm, byte[] key, byte[] salt, byte[] info, int size) throws GeneralSecurityException {
        Mac mac = Mac.getInstance(macAlgorithm);
        if (size > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (salt == null || salt.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], macAlgorithm));
        } else {
            mac.init(new SecretKeySpec(salt, macAlgorithm));
        }
        byte[] bArr = new byte[size];
        mac.init(new SecretKeySpec(mac.doFinal(key), macAlgorithm));
        byte[] bArrDoFinal = new byte[0];
        int i10 = 1;
        int length = 0;
        while (true) {
            mac.update(bArrDoFinal);
            if (info != null) {
                mac.update(info);
            }
            mac.update((byte) i10);
            bArrDoFinal = mac.doFinal();
            if (bArrDoFinal.length + length >= size) {
                System.arraycopy(bArrDoFinal, 0, bArr, length, size - length);
                return bArr;
            }
            System.arraycopy(bArrDoFinal, 0, bArr, length, bArrDoFinal.length);
            length += bArrDoFinal.length;
            i10++;
        }
    }

    @Override // io.bidmachine.analytics.internal.B
    public byte[] a(byte[] sharedSecret, byte[] sharedInfo, byte[] salt) {
        return a("HMACSHA256", sharedSecret, salt, sharedInfo, 32);
    }
}
