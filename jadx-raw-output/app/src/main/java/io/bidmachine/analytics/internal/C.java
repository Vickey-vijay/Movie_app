package io.bidmachine.analytics.internal;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\tJ\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\nJ%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u000e\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lio/bidmachine/analytics/internal/C;", "", "Ljava/security/Key;", "ourPrivateKey", "", "outPublicKeyBytes", "a", "(Ljava/security/Key;[B)[B", "ourPublicKeyBytes", "([B[B)[B", "()Ljava/security/Key;", "(Ljava/security/Key;[B[B)Ljava/security/Key;", "[B", "", "b", "Ljava/lang/String;", "algorithm", "c", "salt", "", "d", "Z", "isEnableSharingKeyInfo", "e", "()[B", "clientPublicKeyBytes", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/security/Key;", "clientPrivateKey", "Lio/bidmachine/analytics/internal/B;", "g", "Lio/bidmachine/analytics/internal/B;", "keyDeriveMethod", "<init>", "([BLjava/lang/String;[BZ)V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final byte[] outPublicKeyBytes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String algorithm;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final byte[] salt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isEnableSharingKeyInfo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final byte[] clientPublicKeyBytes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Key clientPrivateKey;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final B keyDeriveMethod;

    public C(byte[] bArr, String str, byte[] bArr2, boolean z10) {
        this.outPublicKeyBytes = bArr;
        this.algorithm = str;
        this.salt = bArr2;
        this.isEnableSharingKeyInfo = z10;
        KeyPair keyPairB = new r().b();
        this.clientPublicKeyBytes = keyPairB.getPublic().getEncoded();
        this.clientPrivateKey = keyPairB.getPrivate();
        this.keyDeriveMethod = new C4752w();
    }

    public final Key a() {
        return a(this.clientPrivateKey, this.clientPublicKeyBytes, this.outPublicKeyBytes);
    }

    public /* synthetic */ C(byte[] bArr, String str, byte[] bArr2, boolean z10, int i10, ck.i iVar) {
        this(bArr, str, (i10 & 4) != 0 ? null : bArr2, (i10 & 8) != 0 ? false : z10);
    }

    public final Key a(Key ourPrivateKey, byte[] ourPublicKeyBytes, byte[] outPublicKeyBytes) {
        return new SecretKeySpec(this.keyDeriveMethod.a(a(ourPrivateKey, outPublicKeyBytes), this.isEnableSharingKeyInfo ? a(ourPublicKeyBytes, outPublicKeyBytes) : null, this.salt), this.algorithm);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getClientPublicKeyBytes() {
        return this.clientPublicKeyBytes;
    }

    private final byte[] a(byte[] ourPublicKeyBytes, byte[] outPublicKeyBytes) throws IOException {
        List listQ = nj.s.q(ByteBuffer.wrap(ourPublicKeyBytes), ByteBuffer.wrap(outPublicKeyBytes));
        nj.w.A(listQ);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(((ByteBuffer) listQ.get(0)).array());
        byteArrayOutputStream.write(((ByteBuffer) listQ.get(1)).array());
        return byteArrayOutputStream.toByteArray();
    }

    private final byte[] a(Key ourPrivateKey, byte[] outPublicKeyBytes) throws InvalidKeySpecException, NoSuchAlgorithmException, InvalidKeyException {
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(outPublicKeyBytes));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("ECDH");
        keyAgreement.init(ourPrivateKey);
        keyAgreement.doPhase(publicKeyGeneratePublic, true);
        return keyAgreement.generateSecret();
    }
}
