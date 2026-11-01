package w0;

import android.security.keystore.KeyGenParameterSpec;
import java.security.spec.AlgorithmParameterSpec;
import r0.b;

/* JADX INFO: loaded from: classes11.dex */
public final class a {
    public final AlgorithmParameterSpec a() {
        b.a("%s : create specs", "KeyGeneratorSpecCreator");
        return new KeyGenParameterSpec.Builder("dtx_ignite_service_storage", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build();
    }
}
