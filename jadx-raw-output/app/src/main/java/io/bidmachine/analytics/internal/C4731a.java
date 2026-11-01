package io.bidmachine.analytics.internal;

import com.ironsource.C3426d4;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Metadata;

/* JADX INFO: renamed from: io.bidmachine.analytics.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\fR\u001a\u0010\u0011\u001a\u00020\r8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lio/bidmachine/analytics/internal/a;", "Lio/bidmachine/analytics/internal/b;", "", C3426d4.a.f28427t, "Ljava/security/Key;", C3426d4.i.W, "", "iv", "Ljavax/crypto/Cipher;", "a", "(ILjava/security/Key;[B)Ljavax/crypto/Cipher;", "messageBytes", "(Ljava/security/Key;[B)[B", "", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "<init>", "()V", "b", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class C4731a implements InterfaceC4732b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name = "AES";

    @Override // io.bidmachine.analytics.internal.InterfaceC4732b
    public byte[] a(Key key, byte[] messageBytes) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrA = f0.f58826a.a(12);
        byte[] bArrDoFinal = a(1, key, bArrA).doFinal(messageBytes);
        byte[] bArr = new byte[bArrDoFinal.length + 12];
        nj.l.g(bArrA, bArr, 0, 0, 12);
        nj.l.g(bArrDoFinal, bArr, 12, 0, bArrDoFinal.length);
        return bArr;
    }

    private final Cipher a(int mode, Key key, byte[] iv) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, iv);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(mode, key, gCMParameterSpec);
        return cipher;
    }

    @Override // io.bidmachine.analytics.internal.InterfaceC4732b
    public String getName() {
        return this.name;
    }
}
