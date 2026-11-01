package gl;

import android.content.Context;
import android.content.Intent;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.ironsource.Z7;
import com.yk.e.util.AdLog;
import com.yk.e.util.LocalSaveUtil;
import com.yk.e.util.LogUtil;
import java.util.Random;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u1 {
    public static int a(Context context) {
        Boolean boolValueOf;
        try {
            Intent intent = new Intent();
            intent.setData(Uri.parse("tel:123456"));
            intent.setAction("android.intent.action.DIAL");
            boolean z10 = intent.resolveActivity(context.getPackageManager()) != null;
            String str = Build.FINGERPRINT;
            if (!str.startsWith("generic") && !str.toLowerCase().contains("vbox") && !str.toLowerCase().contains("test-keys")) {
                String str2 = Build.MODEL;
                if (!str2.contains("google_sdk") && !str2.contains("Emulator") && !str2.contains("MuMu") && !str2.contains("virtual") && !Build.SERIAL.equalsIgnoreCase("android") && !Build.MANUFACTURER.contains("Genymotion") && ((!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) && !"google_sdk".equals(Build.PRODUCT) && !((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName().toLowerCase().equals("android") && z10)) {
                    try {
                        boolValueOf = Boolean.valueOf(((SensorManager) context.getSystemService("sensor")).getDefaultSensor(5) == null);
                    } catch (Exception unused) {
                        boolValueOf = Boolean.FALSE;
                    }
                    if (!boolValueOf.booleanValue()) {
                        return 0;
                    }
                }
            }
            return 1;
        } catch (Exception unused2) {
        }
    }

    public static String b() {
        if (!TextUtils.isEmpty("")) {
            LogUtil.info("能获取到的androidId = ");
            return "";
        }
        LogUtil.info("随机生成androidId");
        Random random = new Random();
        return new UUID((Integer.toHexString(random.nextInt()) + Integer.toHexString(random.nextInt()) + Integer.toHexString(random.nextInt())).hashCode(), (Build.BRAND + "/" + Build.PRODUCT + "/" + Build.DEVICE + "/" + Build.ID + "/" + Build.VERSION.INCREMENTAL).hashCode()).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String c(Context context) {
        String str;
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return "UNKNOWN";
            }
            if (activeNetworkInfo.getType() == 1) {
                str = Z7.f27999s;
            } else {
                if (activeNetworkInfo.getType() != 0) {
                    return "UNKNOWN";
                }
                String subtypeName = activeNetworkInfo.getSubtypeName();
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        str = "2G";
                        break;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return "3G";
                    case 13:
                        str = "4G";
                        break;
                    default:
                        if (!subtypeName.equalsIgnoreCase("TD-SCDMA") && !subtypeName.equalsIgnoreCase("WCDMA") && !subtypeName.equalsIgnoreCase("CDMA2000")) {
                            return subtypeName;
                        }
                        return "3G";
                }
            }
            return str;
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public static void d(Context context, s sVar) {
        String string = LocalSaveUtil.getString(context, "DeviceGPADID", "");
        if (!TextUtils.isEmpty(string)) {
            sVar.a(string);
            return;
        }
        if (w1.f53604d == null) {
            w1.f53604d = new w1();
        }
        w1 w1Var = w1.f53604d;
        j1 j1Var = new j1(context, sVar);
        w1Var.getClass();
        try {
            w1Var.f53606b = false;
            w1Var.f53605a = j1Var;
            Handler handler = new Handler(Looper.getMainLooper());
            k0 k0Var = new k0(w1Var, handler, j1Var);
            handler.postDelayed(k0Var, 1000L);
            new Thread(new f1(w1Var, context, j1Var, handler, k0Var)).start();
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            w1Var.a("", j1Var);
        }
    }

    public static String e() {
        try {
            String property = System.getProperty("http.agent");
            if (property == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            int length = property.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = property.charAt(i10);
                if (cCharAt <= 31 || cCharAt >= 127) {
                    sb2.append(String.format("\\u%04x", Integer.valueOf(cCharAt)));
                } else {
                    sb2.append(cCharAt);
                }
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String f(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        return context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0 ? ((TelephonyManager) context.getSystemService("phone")).getSimOperator() : "46009";
    }
}
