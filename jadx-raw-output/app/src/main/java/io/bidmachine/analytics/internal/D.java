package io.bidmachine.analytics.internal;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lio/bidmachine/analytics/internal/D;", "", "Ljava/security/KeyPairGenerator;", "a", "()Ljava/security/KeyPairGenerator;", "keyPairGenerator", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public interface D {
    KeyPairGenerator a();

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public static KeyPair a(D d10) {
            return d10.a().generateKeyPair();
        }
    }
}
