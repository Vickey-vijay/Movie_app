package em;

import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: compiled from: DesUtil.java */
/* JADX INFO: loaded from: classes11.dex */
public class f {
    public static String a(String str) {
        try {
            SecretKey secretKeyGenerateSecret = SecretKeyFactory.getInstance("desede").generateSecret(new DESedeKeySpec("dsawdf634eebGFHITR5UT9kS0".getBytes()));
            Cipher cipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
            cipher.init(2, secretKeyGenerateSecret, new IvParameterSpec("32456738".getBytes()));
            return new String(cipher.doFinal(Base64.decode(str, 2)), "UTF-8");
        } catch (Exception e10) {
            e10.printStackTrace();
            return str;
        }
    }
}
