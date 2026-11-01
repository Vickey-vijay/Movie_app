package yads;

import com.ironsource.C3432da;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.PublicKey;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes5.dex */
public final class it1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78794a;

    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, PublicKey publicKey) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr2.length + bArr3.length);
            try {
                byteArrayOutputStream.write(bArr2);
                byteArrayOutputStream.write(bArr3);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                yj.b.a(byteArrayOutputStream, null);
                Cipher cipher = Cipher.getInstance(C3432da.f28686b);
                cipher.init(1, publicKey);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(bArr.length);
                try {
                    byteArrayOutputStream2.write(ByteBuffer.allocate(4).putInt(this.f78794a).array());
                    byteArrayOutputStream2.write(cipher.doFinal(byteArray));
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
                    Cipher cipher2 = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                    cipher2.init(1, secretKeySpec, new IvParameterSpec(bArr3));
                    byteArrayOutputStream2.write(cipher2.doFinal(bArr));
                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                    yj.b.a(byteArrayOutputStream2, null);
                    return byteArray2;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        yj.b.a(byteArrayOutputStream2, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    yj.b.a(byteArrayOutputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
            return null;
        }
    }

    public it1(int i10, String str) {
        this.f78794a = i10;
    }
}
