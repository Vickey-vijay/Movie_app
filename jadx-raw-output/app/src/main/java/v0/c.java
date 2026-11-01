package v0;

import android.util.Pair;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f73009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f73010c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecretKey f73008a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlgorithmParameterSpec f73011d = new w0.a().a();

    public final void c() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        r0.b.a("%s : init", "EncryptionManager");
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("dtx_ignite_service_storage")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(this.f73011d);
            keyGenerator.generateKey();
        }
        Key key = keyStore.getKey("dtx_ignite_service_storage", null);
        if (key instanceof SecretKey) {
            this.f73008a = (SecretKey) key;
            this.f73009b = new d();
            this.f73010c = new b();
        }
    }

    public final Pair a(String str) {
        if (this.f73009b != null) {
            return d.a(this.f73008a, str);
        }
        return null;
    }

    public final String b(String str, byte[] bArr) {
        if (this.f73010c != null) {
            return a.a(a.b(2, bArr, this.f73008a), str);
        }
        return null;
    }
}
