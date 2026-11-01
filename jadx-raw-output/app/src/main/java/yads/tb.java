package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes11.dex */
public abstract class tb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f82949a = (long) (Math.floor(Math.random() * 4294967295L) + ((double) 1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f82950b = 0;

    public static Bitmap a(String str) {
        try {
            String strSubstring = str.substring(lk.a0.l0(str, StringUtils.COMMA, 0, false, 6, null) + 1);
            ck.p.i(strSubstring, "substring(...)");
            if (strSubstring.length() <= 0) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strSubstring, 0);
            return BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String a(Object obj) {
        String string = obj != null ? obj.toString() : null;
        return string == null ? "" : string;
    }

    public static boolean a(mu muVar) {
        return muVar == null || muVar.a();
    }

    public static final boolean a(Context context) {
        try {
            return wn3.a(context) != null;
        } catch (Throwable unused) {
        }
    }
}
