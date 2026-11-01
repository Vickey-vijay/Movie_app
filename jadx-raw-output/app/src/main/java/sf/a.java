package sf;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import io.bidmachine.iab.mraid.MraidLog;
import io.bidmachine.iab.mraid.MraidWebView;
import io.bidmachine.iab.utils.Base32;
import io.bidmachine.iab.utils.Utils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Base32 f67243a = new Base32();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ boolean f67244b = true;

    private static boolean a(MraidWebView mraidWebView, String... strArr) {
        if (mraidWebView == null || mraidWebView.isDestroyed() || mraidWebView.getContext() == null) {
            a(mraidWebView);
            return true;
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (TextUtils.isEmpty(str)) {
                    a(mraidWebView);
                    return true;
                }
            }
        }
        return false;
    }

    public static void b(MraidWebView mraidWebView, String str) {
        FileInputStream fileInputStreamOpenFileInput;
        if (a(mraidWebView, str)) {
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            String strDecode = f67243a.decode(URLDecoder.decode(str, "UTF-8"));
            if (!f67244b && mraidWebView == null) {
                throw new AssertionError();
            }
            Context applicationContext = mraidWebView.getContext().getApplicationContext();
            File file = strDecode.contains("/") ? new File(strDecode) : applicationContext.getFileStreamPath(strDecode);
            if (file != null && file.exists()) {
                fileInputStreamOpenFileInput = applicationContext.openFileInput(strDecode);
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        if (fileInputStreamOpenFileInput != null) {
                            while (true) {
                                int i10 = fileInputStreamOpenFileInput.read(bArr);
                                if (-1 == i10) {
                                    break;
                                } else {
                                    byteArrayOutputStream2.write(bArr, 0, i10);
                                }
                            }
                        }
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        if (byteArray.length > 0) {
                            if (!f67244b && str == null) {
                                throw new AssertionError();
                            }
                            a(mraidWebView, "fireReadFileSuccessEvent", str, Base64.encodeToString(byteArray, 2));
                        } else {
                            a(mraidWebView);
                        }
                        Utils.close(fileInputStreamOpenFileInput);
                        Utils.close(byteArrayOutputStream2);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        try {
                            a(mraidWebView);
                            MraidLog.e("NativeStorage", th);
                            return;
                        } finally {
                            Utils.close(fileInputStreamOpenFileInput);
                            Utils.close(byteArrayOutputStream);
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            a(mraidWebView);
            Utils.close(null);
            Utils.close(null);
        } catch (Throwable th4) {
            th = th4;
            fileInputStreamOpenFileInput = null;
        }
    }

    private static void a(MraidWebView mraidWebView) {
        if (mraidWebView != null) {
            mraidWebView.injectJs("nativeStorage.fireErrorEvent('internal error');");
        }
    }

    public static void b(MraidWebView mraidWebView, String str, String str2) {
        if (a(mraidWebView, str, str2)) {
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            String strDecode = f67243a.decode(URLDecoder.decode(str, "UTF-8"));
            byte[] bArrDecode = Base64.decode(URLDecoder.decode(str2, "UTF-8"), 2);
            if (!a(mraidWebView, strDecode, new String(bArrDecode))) {
                if (!f67244b && mraidWebView == null) {
                    throw new AssertionError();
                }
                fileOutputStream = strDecode.contains("/") ? new FileOutputStream(strDecode) : mraidWebView.getContext().getApplicationContext().openFileOutput(strDecode, 0);
                fileOutputStream.write(bArrDecode);
            }
        } catch (Throwable th2) {
            try {
                a(mraidWebView);
                MraidLog.e("NativeStorage", th2);
            } finally {
                Utils.flush(null);
                Utils.close(null);
            }
        }
    }

    private static void a(MraidWebView mraidWebView, String str, String str2, String str3) {
        if (mraidWebView != null) {
            mraidWebView.injectJs(String.format("nativeStorage.%s(\"%s\", \"%s\");", str, str2, str3));
        }
    }

    public static void a(MraidWebView mraidWebView, String str) {
        if (a(mraidWebView, str)) {
            return;
        }
        try {
            Pair pairA = a(f67243a.decode(URLDecoder.decode(str, "UTF-8")));
            if (a(mraidWebView, (String) pairA.first, (String) pairA.second)) {
                return;
            }
            boolean z10 = f67244b;
            if (!z10 && mraidWebView == null) {
                throw new AssertionError();
            }
            Object obj = mraidWebView.getContext().getApplicationContext().getSharedPreferences((String) pairA.first, 0).getAll().get(pairA.second);
            if (obj == null) {
                a(mraidWebView);
                return;
            }
            String strValueOf = String.valueOf(obj);
            if (a(mraidWebView, strValueOf)) {
                return;
            }
            if (!z10 && str == null) {
                throw new AssertionError();
            }
            a(mraidWebView, "fireReadDefaultsSuccessEvent", str, Base64.encodeToString(strValueOf.getBytes(), 2));
        } catch (Throwable th2) {
            a(mraidWebView);
            MraidLog.e("NativeStorage", th2);
        }
    }

    private static Pair a(String str) {
        String[] strArrSplit = str.split("/");
        return new Pair(strArrSplit[0], strArrSplit[1]);
    }

    public static void a(MraidWebView mraidWebView, String str, String str2) {
        if (a(mraidWebView, str, str2)) {
            return;
        }
        try {
            String strDecode = f67243a.decode(URLDecoder.decode(str, "UTF-8"));
            byte[] bArrDecode = Base64.decode(URLDecoder.decode(str2, "UTF-8"), 2);
            Pair pairA = a(strDecode);
            if (a(mraidWebView, (String) pairA.first, (String) pairA.second)) {
                return;
            }
            if (!f67244b && mraidWebView == null) {
                throw new AssertionError();
            }
            mraidWebView.getContext().getApplicationContext().getSharedPreferences((String) pairA.first, 0).edit().putString((String) pairA.second, new String(bArrDecode)).apply();
        } catch (Throwable th2) {
            a(mraidWebView);
            MraidLog.e("NativeStorage", th2);
        }
    }
}
