package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes7.dex */
public class AESEncrypter implements Encrypter {
    public static final String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final String TAG = "[AESEncrypter]";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f54728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f54729c;

    @Nullable
    @SuppressLint({"TrulyRandom"})
    public byte[] decrypt(@NonNull byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Nullable
    public byte[] decrypt(@NonNull byte[] bArr, int i10, int i11) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f54728b, "AES");
            Cipher cipher = Cipher.getInstance(this.f54727a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(this.f54729c));
            return cipher.doFinal(bArr, i10, i11);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @Nullable
    @SuppressLint({"TrulyRandom"})
    public byte[] encrypt(@NonNull byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f54728b, "AES");
            Cipher cipher = Cipher.getInstance(this.f54727a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(this.f54729c));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    @VisibleForTesting
    public String getAlgorithm() {
        return this.f54727a;
    }

    @VisibleForTesting
    public byte[] getIV() {
        return this.f54729c;
    }

    @VisibleForTesting
    public byte[] getPassword() {
        return this.f54728b;
    }

    public AESEncrypter(String str, byte[] bArr, byte[] bArr2) {
        this.f54727a = str;
        this.f54728b = bArr;
        this.f54729c = bArr2;
    }
}
