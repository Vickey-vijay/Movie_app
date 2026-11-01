package em;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C3426d4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: KLog.java */
/* JADX INFO: loaded from: classes11.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f52672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52673b = System.getProperty("line.separator");

    public static void a(Object obj) {
        f(2, null, obj);
    }

    public static void b(Object obj) {
        f(5, null, obj);
    }

    public static void c(String str, Object obj) {
        f(5, str, obj);
    }

    public static void d(boolean z10) {
        f52672a = z10;
    }

    public static void e(String str, boolean z10) {
        if (z10) {
            Log.w(str, "╔═══════════════════════════════════════════════════════════════════════════════════════");
        } else {
            Log.w(str, "╚═══════════════════════════════════════════════════════════════════════════════════════");
        }
    }

    public static void f(int i10, String str, Object obj) {
        if (f52672a) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String fileName = stackTrace[4].getFileName();
            String methodName = stackTrace[4].getMethodName();
            int lineNumber = stackTrace[4].getLineNumber();
            if (str == null) {
                str = fileName;
            }
            String str2 = methodName.substring(0, 1).toUpperCase() + methodName.substring(1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[ (");
            sb2.append(fileName);
            sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb2.append(lineNumber);
            sb2.append(")#");
            sb2.append(str2);
            sb2.append(" ] ");
            String string = obj == null ? "Log with null Object" : obj.toString();
            if (string != null && i10 != 7) {
                sb2.append(string);
            }
            String string2 = sb2.toString();
            switch (i10) {
                case 1:
                    Log.v(str, string2);
                    break;
                case 2:
                    Log.d(str, string2);
                    break;
                case 3:
                    Log.i(str, string2);
                    break;
                case 4:
                    Log.w(str, string2);
                    break;
                case 5:
                    Log.e(str, string2);
                    break;
                case 6:
                    Log.wtf(str, string2);
                    break;
                case 7:
                    if (TextUtils.isEmpty(string)) {
                        Log.d(str, "Empty or Null json content");
                    } else {
                        String string3 = null;
                        try {
                            if (string.startsWith(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44171d)) {
                                string3 = new JSONObject(string).toString(4);
                            } else if (string.startsWith(C3426d4.j.f28586d)) {
                                string3 = new JSONArray(string).toString(4);
                            }
                            e(str, true);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(string2);
                            String str3 = f52673b;
                            sb3.append(str3);
                            sb3.append(string3);
                            String[] strArrSplit = sb3.toString().split(str3);
                            StringBuilder sb4 = new StringBuilder();
                            for (String str4 : strArrSplit) {
                                sb4.append("║ ");
                                sb4.append(str4);
                                sb4.append(f52673b);
                            }
                            if (sb4.toString().length() > 3200) {
                                Log.w(str, "jsonContent.length = " + sb4.toString().length());
                                int length = sb4.toString().length() / 3200;
                                int i11 = 0;
                                while (i11 <= length) {
                                    int i12 = i11 + 1;
                                    int i13 = i12 * 3200;
                                    if (i13 >= sb4.toString().length()) {
                                        Log.w(str, sb4.toString().substring(i11 * 3200));
                                    } else {
                                        Log.w(str, sb4.toString().substring(i11 * 3200, i13));
                                    }
                                    i11 = i12;
                                }
                            } else {
                                Log.w(str, sb4.toString());
                            }
                            e(str, false);
                        } catch (JSONException e10) {
                            c(str, e10.getCause().getMessage() + "\n" + string);
                            return;
                        }
                    }
                    break;
            }
        }
    }
}
