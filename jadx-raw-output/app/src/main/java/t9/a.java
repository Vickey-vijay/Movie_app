package t9;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.ironsource.C3426d4;
import em.k;
import em.o;

/* JADX INFO: compiled from: DeviceIdUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public class a {
    public static String a(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("deviceId", 0);
        String string = sharedPreferences.getString(C3426d4.i.W, "");
        if (string != null && !string.isEmpty()) {
            return string;
        }
        String string2 = Settings.System.getString(context.getContentResolver(), "android_id");
        if (string2 == null || string2.isEmpty() || string2.equals("0000000000000000")) {
            string2 = f();
        }
        String str = string2;
        sharedPreferences.edit().putString(C3426d4.i.W, str).apply();
        return str;
    }

    public static void c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("deviceId", 0);
        String string = sharedPreferences.getString(C3426d4.i.W, "");
        if (o.b(string)) {
            return;
        }
        if (string.equals("0000000000000000") || string.length() == 20) {
            k.i(context).o("KEY_PREF_USER_TOKEN", "");
            sharedPreferences.edit().putString(C3426d4.i.W, f()).apply();
        }
    }

    public static String d(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
            return telephonyManager != null ? telephonyManager.getDeviceId() : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String e(Context context) {
        if (ContextCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") != 0) {
            return "";
        }
        String strD = d(context);
        return TextUtils.isEmpty(strD) ? b(context) : strD;
    }

    public static String f() {
        char[] cArr = new char[22];
        for (int i10 = 0; i10 < 22; i10++) {
            if (((int) (Math.random() * 2.0d)) == 0) {
                cArr[i10] = (char) ((Math.random() * 10.0d) + 48.0d);
            } else {
                cArr[i10] = (char) ((Math.random() * 6.0d) + 97.0d);
            }
        }
        return new String(cArr);
    }

    public static String b(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
            return TelephonyManager.class.getDeclaredMethod("getDeviceId", Integer.TYPE).invoke(telephonyManager, TelephonyManager.class.getDeclaredMethod("getDefaultSim", new Class[0]).invoke(telephonyManager, new Object[0])).toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
