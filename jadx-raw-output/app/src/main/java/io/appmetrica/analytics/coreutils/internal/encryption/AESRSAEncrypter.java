package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3432da;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes8.dex */
public class AESRSAEncrypter implements Encrypter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f54731b;

    public AESRSAEncrypter() {
        this(0);
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3, PublicKey publicKey) {
        ByteArrayOutputStream byteArrayOutputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(bArr2.length + bArr3.length);
            byteArrayOutputStream2.write(bArr2);
            byteArrayOutputStream2.write(bArr3);
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            byteArrayOutputStream2.close();
            Cipher cipher = Cipher.getInstance(this.f54731b);
            cipher.init(1, publicKey);
            byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            try {
                byteArrayOutputStream.write(cipher.doFinal(byteArray));
                byte[] bArrEncrypt = new AESEncrypter(this.f54730a, bArr2, bArr3).encrypt(bArr);
                if (bArrEncrypt != null) {
                    byteArrayOutputStream.write(bArrEncrypt);
                    byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                    CloseableUtilsKt.closeSafely(byteArrayOutputStream);
                    return byteArray2;
                }
                CloseableUtilsKt.closeSafely(byteArrayOutputStream);
            } catch (Throwable unused) {
                CloseableUtilsKt.closeSafely(byteArrayOutputStream);
            }
        } catch (Throwable unused2) {
            byteArrayOutputStream = null;
        }
        return null;
    }

    public AESRSAEncrypter(int i10) {
        this.f54730a = AESEncrypter.DEFAULT_ALGORITHM;
        this.f54731b = C3432da.f28686b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @Nullable
    @SuppressLint({"TrulyRandom"})
    public byte[] encrypt(@NonNull byte[] bArr) {
        try {
            SecureRandom secureRandom = new SecureRandom();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[16];
            secureRandom.nextBytes(bArr3);
            secureRandom.nextBytes(bArr2);
            return a(bArr, bArr3, bArr2, KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDhmH/m2qrRjxDHP794CeaZpENQNYydf8pqyXJilo6XxK+n+pvo27VxWfB3Z1yHrtKow+eZXKLQzrQ8wZMfRgADrYCQJ20y2hGZEUCN1tGSM+xqVKMeCtVi3NvQa54Cx7mT5ECVsH5DKEs/aeScDHP56FzcgEbtOSwyRZ8dsEM0wwIDAQAB", 0))));
        } catch (Throwable unused) {
            return null;
        }
    }
}
