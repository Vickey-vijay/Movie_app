package f0;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: ProxyCacheUtils.java */
/* JADX INFO: loaded from: classes9.dex */
public class m {
    public static void a(byte[] bArr, long j10, int i10) {
        k.d(bArr, "Buffer must be not null!");
        k.b(j10 >= 0, "Data offset must be positive!");
        k.b(i10 >= 0 && i10 <= bArr.length, "Length must be in range [0..buffer.length]");
    }

    public static String b(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : bArr) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return stringBuffer.toString();
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                j.b("Error closing resource");
            }
        }
    }

    public static String d(String str) {
        try {
            return b(MessageDigest.getInstance(SameMD5.TAG).digest(str.getBytes()));
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static String e(String str) {
        try {
            return URLDecoder.decode(str, G5.N);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Error decoding url", e10);
        }
    }

    public static String f(String str) {
        try {
            return URLEncoder.encode(str, G5.N);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("Error encoding url", e10);
        }
    }

    public static String g(String str) {
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            return null;
        }
        return singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
    }
}
