package io.bidmachine.analytics.internal;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECGenParameterSpec;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lio/bidmachine/analytics/internal/r;", "Lio/bidmachine/analytics/internal/D;", "Ljava/security/KeyPairGenerator;", "a", "Ljava/security/KeyPairGenerator;", "()Ljava/security/KeyPairGenerator;", "keyPairGenerator", "<init>", "()V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class r implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final KeyPairGenerator keyPairGenerator;

    @Override // io.bidmachine.analytics.internal.D
    /* JADX INFO: renamed from: a, reason: from getter */
    public KeyPairGenerator getKeyPairGenerator() {
        return this.keyPairGenerator;
    }

    public r() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
        this.keyPairGenerator = keyPairGenerator;
    }

    public KeyPair b() {
        return D.a.a(this);
    }
}
