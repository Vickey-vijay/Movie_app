package m2;

import android.util.Base64;
import android.util.Log;
import ck.p;
import com.ironsource.C3426d4;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$ObjectRef;
import lk.x;
import mj.r;
import org.json.JSONObject;
import q1.t;
import yj.k;

/* JADX INFO: compiled from: OidcSecurityUtil.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0007R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lm2/c;", "", "", "kid", "c", C3426d4.i.W, "Ljava/security/PublicKey;", "b", "publicKey", "data", InAppPurchaseMetaData.KEY_SIGNATURE, "", "e", "Ljava/lang/String;", "getOPENID_KEYS_PATH", "()Ljava/lang/String;", "OPENID_KEYS_PATH", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f63944a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String OPENID_KEYS_PATH = "/.well-known/oauth/openid/keys/";

    public static final PublicKey b(String key) throws InvalidKeySpecException {
        p.j(key, C3426d4.i.W);
        byte[] bArrDecode = Base64.decode(x.N(x.N(x.N(key, "\n", "", false, 4, null), "-----BEGIN PUBLIC KEY-----", "", false, 4, null), "-----END PUBLIC KEY-----", "", false, 4, null), 0);
        p.i(bArrDecode, "decode(pubKeyString, Base64.DEFAULT)");
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        p.i(publicKeyGeneratePublic, "kf.generatePublic(x509publicKey)");
        return publicKeyGeneratePublic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String c(final String kid) {
        p.j(kid, "kid");
        final URL url = new URL("https", p.s("www.", t.u()), OPENID_KEYS_PATH);
        final ReentrantLock reentrantLock = new ReentrantLock();
        final Condition conditionNewCondition = reentrantLock.newCondition();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        t.t().execute(new Runnable() { // from class: m2.b
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                c.d(url, ref$ObjectRef, kid, reentrantLock, conditionNewCondition);
            }
        });
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) ref$ObjectRef.element;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    public static final void d(URL url, Ref$ObjectRef ref$ObjectRef, String str, ReentrantLock reentrantLock, Condition condition) throws IOException {
        p.j(url, "$openIdKeyUrl");
        p.j(ref$ObjectRef, "$result");
        p.j(str, "$kid");
        p.j(reentrantLock, "$lock");
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (uRLConnectionOpenConnection == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        try {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                p.i(inputStream, "connection.inputStream");
                Reader inputStreamReader = new InputStreamReader(inputStream, lk.c.f63591b);
                String strE = k.e(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192));
                httpURLConnection.getInputStream().close();
                ref$ObjectRef.element = new JSONObject(strE).optString(str);
                httpURLConnection.disconnect();
                reentrantLock.lock();
                try {
                    condition.signal();
                    r rVar = r.f64562a;
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Exception e10) {
                String name = f63944a.getClass().getName();
                String message = e10.getMessage();
                if (message == null) {
                    message = "Error getting public key";
                }
                Log.d(name, message);
                httpURLConnection.disconnect();
                reentrantLock.lock();
                try {
                    condition.signal();
                    r rVar2 = r.f64562a;
                } finally {
                    reentrantLock.unlock();
                }
            }
        } catch (Throwable th2) {
            httpURLConnection.disconnect();
            reentrantLock.lock();
            try {
                condition.signal();
                r rVar3 = r.f64562a;
                throw th2;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public static final boolean e(PublicKey publicKey, String data, String signature) {
        p.j(publicKey, "publicKey");
        p.j(data, "data");
        p.j(signature, InAppPurchaseMetaData.KEY_SIGNATURE);
        try {
            Signature signature2 = Signature.getInstance("SHA256withRSA");
            signature2.initVerify(publicKey);
            byte[] bytes = data.getBytes(lk.c.f63591b);
            p.i(bytes, "(this as java.lang.String).getBytes(charset)");
            signature2.update(bytes);
            byte[] bArrDecode = Base64.decode(signature, 8);
            p.i(bArrDecode, "decode(signature, Base64.URL_SAFE)");
            return signature2.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }
}
