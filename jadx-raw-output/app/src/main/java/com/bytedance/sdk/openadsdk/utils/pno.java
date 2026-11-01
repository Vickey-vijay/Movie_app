package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.lifecycle.e;
import com.ironsource.Q6;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.core.fid.Constants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class pno {
    private static final AtomicReference<Boolean> ouw = new AtomicReference<>(null);
    private static final AtomicReference<String> vt = new AtomicReference<>(null);

    private static PackageInfo bly(Context context) {
        try {
            String str = (String) Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean fkw(Context context) {
        try {
            Class.forName("com.facebook.react.ReactActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libreactnativejni.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static String le(Context context) {
        try {
            return String.valueOf(context.getApplicationInfo().targetSdkVersion);
        } catch (Throwable unused) {
            return "";
        }
    }

    private static boolean lh(Context context) {
        try {
            Class.forName("com.unity3d.player.UnityPlayerActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libunity.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    public static void ouw(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (ryl()) {
                com.bytedance.sdk.openadsdk.core.lh.ouw();
                com.bytedance.sdk.openadsdk.core.lh.ouw("w_ver", ra(context));
                com.bytedance.sdk.openadsdk.core.lh.ouw("bp", vt(context));
                com.bytedance.sdk.openadsdk.core.lh.ouw("is_fold", vt() ? 1 : 0);
                com.bytedance.sdk.openadsdk.core.lh.ouw("abi", tlj());
                com.bytedance.sdk.openadsdk.core.lh.ouw("t_ver", le(context));
                com.bytedance.sdk.openadsdk.core.lh.ouw(CampaignEx.JSON_KEY_AAB, ouw());
            }
        } catch (Throwable unused) {
        }
    }

    private static PackageInfo pno(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                return WebView.getCurrentWebViewPackage();
            }
            PackageInfo packageInfo = (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
            return packageInfo != null ? packageInfo : bly(context);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    private static String ra(Context context) {
        try {
            AtomicReference<String> atomicReference = vt;
            String str = atomicReference.get();
            if (str != null) {
                return str;
            }
            PackageInfo packageInfoPno = pno(context);
            String str2 = packageInfoPno != null ? packageInfoPno.versionName : "";
            e.a(atomicReference, null, str2);
            return str2;
        } catch (Throwable unused) {
            e.a(vt, null, "");
            return "";
        }
    }

    private static int vt(Context context) {
        if (lh(context)) {
            return 1;
        }
        if (yu(context)) {
            return 2;
        }
        return fkw(context) ? 3 : 4;
    }

    private static boolean yu(Context context) {
        try {
            Class.forName("io.flutter.embedding.android.FlutterActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            if (context == null) {
                return false;
            }
            try {
                return new File(context.getApplicationInfo().nativeLibraryDir + "/libflutter.so").exists();
            } catch (Throwable unused2) {
                return false;
            }
        }
    }

    private static boolean cf() {
        try {
            Class<?> cls = Class.forName("com.samsung.android.feature.SemFloatingFeature");
            Object objInvoke = cls.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
            Method declaredMethod = cls.getDeclaredMethod("getString", String.class);
            return "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FOLD")) || "TRUE".equalsIgnoreCase((String) declaredMethod.invoke(objInvoke, "SEC_FLOATING_FEATURE_FRAMEWORK_SUPPORT_FOLDABLE_TYPE_FLIP"));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            com.bytedance.sdk.component.utils.qbp.lh("PAG_BANNER", "get ss fold device error: " + e10.getMessage());
            return false;
        }
    }

    private static String mwh() {
        return com.bytedance.sdk.openadsdk.vpp.ouw.ouw("fold_config", "fold_default", "");
    }

    private static boolean ryl() {
        return com.bytedance.sdk.openadsdk.vpp.ouw.ouw("fold_config", a.f29888j, 0) == 1;
    }

    private static String tlj() {
        try {
            return Build.SUPPORTED_ABIS[0];
        } catch (Exception unused) {
            return "";
        }
    }

    private static boolean le() {
        try {
            return "foldable".equals(Class.forName("android.util.FtDeviceInfo").getMethod("getDeviceType", new Class[0]).invoke(null, new Object[0]));
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("BED", "isVIVOFoldDevice return false " + th2.getMessage());
            return false;
        }
    }

    private static boolean fkw() {
        if (le()) {
            return true;
        }
        String[] strArr = {"V2330", "V2178A", "V2229A", "V2303A", "V2337A", "V2256A", "V2266A"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 7; i10++) {
                    if (lowerCase.contains(strArr[i10].toLowerCase())) {
                        return true;
                    }
                }
                if (ryl()) {
                    String strMwh = mwh();
                    if (TextUtils.isEmpty(strMwh)) {
                        return false;
                    }
                    for (String str : strMwh.split(StringUtils.COMMA)) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean lh() {
        if (cf()) {
            return true;
        }
        String[] strArr = {"sm-f9000", "sm-f9160", "sm-f9260", "sm-f9360", "sm-f9460", "sm-f9560", "sm-f7000", "sm-f7070", "sm-f7110", "sm-f7210", "sm-f7310", "sm-f7410"};
        String[] strArr2 = {"winner", "f2q", "q2q", "q4q", "q5q", "q6q", "bloomq", "bloomxq", "b2q", "b4q", "b5q", "b6q"};
        try {
            String lowerCase = Build.DEVICE.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 12; i10++) {
                    if (lowerCase.contains(strArr2[i10])) {
                        return true;
                    }
                }
            }
            String lowerCase2 = Build.MODEL.toLowerCase();
            if (TextUtils.isEmpty(lowerCase2)) {
                return false;
            }
            for (int i11 = 0; i11 < 12; i11++) {
                if (lowerCase2.contains(strArr[i11])) {
                    return true;
                }
            }
            if (ryl()) {
                String strOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("fold_config", "fold_samung", "");
                if (TextUtils.isEmpty(strOuw)) {
                    return false;
                }
                for (String str : strOuw.split(StringUtils.COMMA)) {
                    if (lowerCase2.contains(str)) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean vt() {
        boolean zPno;
        boolean z10;
        byte b10;
        try {
            AtomicReference<Boolean> atomicReference = ouw;
            Boolean bool = atomicReference.get();
            if (bool != null) {
                return bool.booleanValue();
            }
            String lowerCase = Build.BRAND;
            if (!TextUtils.isEmpty(lowerCase)) {
                lowerCase = lowerCase.toLowerCase();
            }
            String lowerCase2 = Build.MANUFACTURER;
            if (!TextUtils.isEmpty(lowerCase2)) {
                lowerCase2 = lowerCase2.toLowerCase();
            }
            if (TextUtils.isEmpty(lowerCase) && TextUtils.isEmpty(lowerCase2)) {
                e.a(atomicReference, null, Boolean.FALSE);
                return false;
            }
            byte b11 = -1;
            if (TextUtils.isEmpty(lowerCase)) {
                zPno = false;
                z10 = false;
            } else {
                switch (lowerCase.hashCode()) {
                    case -759499589:
                        if (!lowerCase.equals("xiaomi")) {
                            b10 = -1;
                        } else {
                            b10 = 2;
                        }
                        break;
                    case 3418016:
                        if (!lowerCase.equals("oppo")) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case 3620012:
                        if (!lowerCase.equals("vivo")) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case 1864941562:
                        if (!lowerCase.equals("samsung")) {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                if (b10 == 0) {
                    zPno = pno();
                } else if (b10 == 1) {
                    zPno = fkw();
                } else if (b10 == 2) {
                    zPno = yu();
                } else if (b10 != 3) {
                    zPno = false;
                    z10 = true;
                } else {
                    zPno = lh();
                }
                z10 = false;
            }
            if (z10 && !TextUtils.isEmpty(lowerCase2)) {
                switch (lowerCase2.hashCode()) {
                    case -759499589:
                        if (lowerCase2.equals("xiaomi")) {
                            b11 = 2;
                        }
                        break;
                    case 3418016:
                        if (lowerCase2.equals("oppo")) {
                            b11 = 0;
                        }
                        break;
                    case 3620012:
                        if (lowerCase2.equals("vivo")) {
                            b11 = 1;
                        }
                        break;
                    case 1864941562:
                        if (lowerCase2.equals("samsung")) {
                            b11 = 3;
                        }
                        break;
                }
                if (b11 == 0) {
                    zPno = pno();
                } else if (b11 == 1) {
                    zPno = fkw();
                } else if (b11 != 2) {
                    zPno = b11 != 3 ? false : lh();
                } else {
                    zPno = yu();
                }
            }
            e.a(atomicReference, null, Boolean.valueOf(zPno));
            return zPno;
        } catch (Throwable unused) {
            e.a(ouw, null, Boolean.FALSE);
            return false;
        }
    }

    private static boolean yu() {
        if (ra()) {
            return true;
        }
        String[] strArr = {"M2011J18C", "22061218C", "2308CPXD0C", "24072PX77C", "2405CPX3DC", "2405CPX3DG"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 6; i10++) {
                    if (lowerCase.contains(strArr[i10])) {
                        return true;
                    }
                }
                if (ryl()) {
                    String strMwh = mwh();
                    if (TextUtils.isEmpty(strMwh)) {
                        return false;
                    }
                    for (String str : strMwh.split(StringUtils.COMMA)) {
                        if (lowerCase.contains(str)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static boolean bly() {
        try {
            Class<?> cls = Class.forName("com.oplus.content.OplusFeatureConfigManager");
            Object objInvoke = cls.getDeclaredMethod("hasFeature", String.class).invoke(cls.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]), "oplus.hardware.type.fold");
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (ClassNotFoundException e10) {
            e = e10;
            com.bytedance.sdk.component.utils.qbp.lh("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (IllegalAccessException e11) {
            e = e11;
            com.bytedance.sdk.component.utils.qbp.lh("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (NoSuchMethodException e12) {
            e = e12;
            com.bytedance.sdk.component.utils.qbp.lh("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (InvocationTargetException e13) {
            e = e13;
            com.bytedance.sdk.component.utils.qbp.lh("BED", "get oppo fold properties error, msg: " + e.getMessage());
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static boolean ra() {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", String.class, Integer.TYPE).invoke(null, "persist.sys.muiltdisplay_type", 0)).intValue() == 2;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.lh("BED", "isXiaomiFold return false " + th2.getMessage());
            return false;
        }
    }

    private static boolean pno() {
        if (bly()) {
            return true;
        }
        String[] strArr = {"CPH2439", "CPH2437", "CPH2499", "CPH2519", "PEUM00", "PGU110", "PGT110", "PHN110", "PHT110"};
        try {
            String lowerCase = Build.MODEL.toLowerCase();
            if (!TextUtils.isEmpty(lowerCase)) {
                for (int i10 = 0; i10 < 9; i10++) {
                    if (lowerCase.contains(strArr[i10].toLowerCase())) {
                        return true;
                    }
                }
                if (ryl()) {
                    String strMwh = mwh();
                    if (TextUtils.isEmpty(strMwh)) {
                        return false;
                    }
                    for (String str : strMwh.split(StringUtils.COMMA)) {
                        if (lowerCase.contains(str.toLowerCase())) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private static int ouw() {
        try {
            Class.forName("com.google.android.play.core.splitinstall.SplitInstallManager");
            return 1;
        } catch (ClassNotFoundException unused) {
            return 0;
        }
    }

    public static void ouw(JSONObject jSONObject, Context context) {
        if (context == null) {
            return;
        }
        try {
            if (ryl()) {
                com.bytedance.sdk.openadsdk.core.lh.ouw();
                String strVt = com.bytedance.sdk.openadsdk.core.lh.vt(Q6.f27472u, com.bytedance.sdk.openadsdk.core.bly.ouw().ra());
                if (!TextUtils.isEmpty(strVt)) {
                    jSONObject.put(Q6.f27472u, strVt);
                }
                int iVt = com.bytedance.sdk.openadsdk.core.lh.vt("bp", vt(context));
                if (iVt != 4) {
                    jSONObject.put("bp", iVt);
                }
                String strVt2 = com.bytedance.sdk.openadsdk.core.lh.vt("t_ver", le(context));
                if (!TextUtils.isEmpty(strVt2)) {
                    jSONObject.put("t_ver", strVt2);
                }
                jSONObject.put("is_fold", com.bytedance.sdk.openadsdk.core.lh.vt("is_fold", vt() ? 1 : 0));
                jSONObject.put(CampaignEx.JSON_KEY_AAB, com.bytedance.sdk.openadsdk.core.lh.vt(CampaignEx.JSON_KEY_AAB, ouw()));
                String strVt3 = com.bytedance.sdk.openadsdk.core.lh.vt("w_ver", ra(context));
                if (!TextUtils.isEmpty(strVt3)) {
                    jSONObject.put("w_ver", strVt3);
                }
                String strVt4 = com.bytedance.sdk.openadsdk.core.lh.vt("abi", tlj());
                if (TextUtils.isEmpty(strVt4)) {
                    return;
                }
                jSONObject.put("abi", strVt4);
            }
        } catch (Throwable unused) {
        }
    }
}
