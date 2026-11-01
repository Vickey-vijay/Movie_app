package y1;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import ck.w;
import com.facebook.internal.j0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import lk.a0;
import lk.x;
import q1.t;

/* JADX INFO: compiled from: AppEventUtility.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0007J\b\u0010\r\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\u0005H\u0007J\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007¨\u0006\u0015"}, d2 = {"Ly1/g;", "", "Lmj/r;", "b", "a", "", "value", "", "g", "", "bytes", "c", "", InneractiveMediationDefs.GENDER_FEMALE, "d", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Landroid/view/View;", "e", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f75214a = new g();

    public static final void a() {
    }

    public static final void b() {
    }

    public static final String c(byte[] bytes) {
        p.j(bytes, "bytes");
        StringBuffer stringBuffer = new StringBuffer();
        int length = bytes.length;
        int i10 = 0;
        while (i10 < length) {
            byte b10 = bytes[i10];
            i10++;
            w wVar = w.f6066a;
            String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
            p.i(str, "java.lang.String.format(format, *args)");
            stringBuffer.append(str);
        }
        String string = stringBuffer.toString();
        p.i(string, "sb.toString()");
        return string;
    }

    public static final View e(Activity activity) {
        if (i2.a.d(g.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, g.class);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006b  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    public static final boolean f() {
        String str = Build.FINGERPRINT;
        p.i(str, "FINGERPRINT");
        if (!x.R(str, "generic", false, 2, null)) {
            p.i(str, "FINGERPRINT");
            if (!x.R(str, "unknown", false, 2, null)) {
                String str2 = Build.MODEL;
                p.i(str2, "MODEL");
                if (!a0.X(str2, "google_sdk", false, 2, null)) {
                    p.i(str2, "MODEL");
                    if (!a0.X(str2, "Emulator", false, 2, null)) {
                        p.i(str2, "MODEL");
                        if (!a0.X(str2, "Android SDK built for x86", false, 2, null)) {
                            String str3 = Build.MANUFACTURER;
                            p.i(str3, "MANUFACTURER");
                            if (!a0.X(str3, "Genymotion", false, 2, null)) {
                                String str4 = Build.BRAND;
                                p.i(str4, "BRAND");
                                if (x.R(str4, "generic", false, 2, null)) {
                                    String str5 = Build.DEVICE;
                                    p.i(str5, "DEVICE");
                                    if (!x.R(str5, "generic", false, 2, null)) {
                                        if (p.e("google_sdk", Build.PRODUCT)) {
                                            return false;
                                        }
                                    }
                                } else if (p.e("google_sdk", Build.PRODUCT)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static final double g(String value) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(value);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(j0.y()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    public static final String d() {
        Context contextL = t.l();
        try {
            String str = contextL.getPackageManager().getPackageInfo(contextL.getPackageName(), 0).versionName;
            p.i(str, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }
}
