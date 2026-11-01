package gl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile s1 f53591b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f53592a = new Object();

    public static s1 a() {
        if (f53591b == null) {
            synchronized (s1.class) {
                if (f53591b == null) {
                    f53591b = new s1();
                }
            }
        }
        return f53591b;
    }

    public static String b(String str) {
        try {
            int i10 = 0;
            byte[] bArrE = e(Base64.decode(str, 0), "0123456789".getBytes("UTF8"));
            byte[] bArr = new byte[bArrE.length / 2];
            int i11 = 0;
            while (i10 < bArrE.length) {
                bArr[i11] = (byte) (bArrE[i10] ^ bArrE[i10 + 1]);
                i10 += 2;
                i11++;
            }
            return new String(bArr, "UTF8");
        } catch (UnsupportedEncodingException e10) {
            AdLog.e(e10.getMessage(), e10);
            return "";
        }
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        byte[] bytes = r0.g(new String(bArr2)).toLowerCase().getBytes();
        byte[] bArr3 = new byte[bArr.length];
        int i10 = 0;
        byte b10 = 0;
        while (i10 < bArr.length) {
            if (b10 > 31) {
                b10 = 0;
            }
            bArr3[i10] = (byte) (bytes[b10] ^ bArr[i10]);
            i10++;
            b10 = (byte) (b10 + 1);
        }
        return bArr3;
    }

    public final JSONObject c(Context context, int i10, String str) {
        boolean z10 = true;
        String str2 = String.format(Constant.fileApiCache, Integer.valueOf(i10));
        try {
            synchronized (this.f53592a) {
                String strB = b(context.getSharedPreferences(str2, 0).getString(str, ""));
                if (TextUtils.isEmpty(strB)) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(strB);
                try {
                    if (Math.abs(System.currentTimeMillis() - jSONObject.optLong("acCacheNow", 0L)) / 60000 <= 60) {
                        z10 = false;
                    }
                } catch (Exception e10) {
                    AdLog.e(e10.getMessage(), e10);
                }
                AdLog.i("ac, key=" + str + ", isExpired=" + z10);
                if (z10) {
                    jSONObject = null;
                }
                return jSONObject;
            }
        } catch (Exception e11) {
            AdLog.e(e11.getMessage(), e11);
            return null;
        }
    }

    public final void d(Context context, String str, String str2, JSONObject jSONObject) {
        try {
            synchronized (this.f53592a) {
                try {
                    AdLog.i("ac, put " + str2);
                    SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
                    jSONObject.put("acCacheNow", System.currentTimeMillis());
                    String str3 = null;
                    try {
                        str3 = new String(f(jSONObject.toString().getBytes("UTF8"), "0123456789".getBytes("UTF8")), "UTF8");
                    } catch (UnsupportedEncodingException e10) {
                        AdLog.e(e10.getMessage(), e10);
                    }
                    editorEdit.putString(str2, str3.trim());
                    editorEdit.apply();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e11) {
            AdLog.e(e11.getMessage(), e11);
        }
    }

    public static byte[] f(byte[] bArr, byte[] bArr2) {
        byte[] bytes = r0.g(Long.toString(Calendar.getInstance().getTimeInMillis())).getBytes();
        byte[] bArr3 = new byte[bArr.length * 2];
        int i10 = 0;
        byte b10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            if (b10 > 31) {
                b10 = 0;
            }
            bArr3[i11] = bytes[b10];
            bArr3[i11 + 1] = (byte) (bytes[b10] ^ bArr[i10]);
            i10++;
            i11 += 2;
            b10 = (byte) (b10 + 1);
        }
        return Base64.encode(e(bArr3, bArr2), 0);
    }
}
