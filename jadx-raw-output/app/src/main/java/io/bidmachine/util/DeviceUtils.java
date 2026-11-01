package io.bidmachine.util;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import ck.p;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.util.file.FileUtilsKt;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import kotlin.Metadata;

/* JADX INFO: compiled from: DeviceUtils.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u0015\u001a\u00020\u0006H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\rH\u0007J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0006H\u0007J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0006H\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u001e\u001a\u00020\u0006H\u0007J\b\u0010\u001f\u001a\u00020\u0006H\u0007J\u0010\u0010 \u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010!\u001a\u00020\u0006H\u0007J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0012\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0017\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u0012J\u0010\u0010'\u001a\u00020(2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010*\u001a\u00020+2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0017\u0010,\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010-J\u0017\u0010.\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010-J\u0017\u0010/\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010-J\u0010\u00100\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0017\u00101\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010-J\u0010\u00102\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u00103\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0017\u00104\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010-J\u0010\u00105\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u00066"}, d2 = {"Lio/bidmachine/util/DeviceUtils;", "", "()V", "MIN_TABLET_DP", "", "hwv", "", "isDeviceRooted", "", "Ljava/lang/Boolean;", "getActiveNetworkCapabilities", "Landroid/net/NetworkCapabilities;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "getActiveNetworkInfo", "Landroid/net/NetworkInfo;", "getBatteryLevel", "", "(Landroid/content/Context;)Ljava/lang/Double;", "getBluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getBuildId", "getConfiguration", "Landroid/content/res/Configuration;", "getDeviceName", "getDisplayMetrics", "Landroid/util/DisplayMetrics;", "getHWV", "getKernelVersionThroughProcVersion", "getKernelVersionThroughUName", "getManufacturer", "getModel", "getOrientation", "getOsVersion", "getPhoneMCCMNC", "getPhoneOperatorName", "getScreenBrightness", "(Landroid/content/Context;)Ljava/lang/Integer;", "getScreenBrightnessRatio", "getScreenDensity", "", "getScreenOrientation", "getScreenSize", "Landroid/graphics/Point;", "isAirplaneModeOn", "(Landroid/content/Context;)Ljava/lang/Boolean;", "isBatterySaverEnabled", C3426d4.j.f28601k0, "isDarkModeEnabled", "isDoNotDisturbOn", "isLandscapeOrientation", "isNetworkAvailable", "isRingMuted", "isTablet", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DeviceUtils {
    public static final DeviceUtils INSTANCE = new DeviceUtils();
    private static final int MIN_TABLET_DP = 600;
    private static String hwv;
    private static Boolean isDeviceRooted;

    private DeviceUtils() {
    }

    private final String getKernelVersionThroughProcVersion() throws Throwable {
        RandomAccessFile randomAccessFile;
        Throwable th2;
        try {
            randomAccessFile = new RandomAccessFile("/proc/version", "r");
            try {
                String line = randomAccessFile.readLine();
                UtilsKt.closeSafely(randomAccessFile);
                return line;
            } catch (Exception unused) {
                UtilsKt.closeSafely(randomAccessFile);
                return null;
            } catch (Throwable th3) {
                th2 = th3;
                UtilsKt.closeSafely(randomAccessFile);
                throw th2;
            }
        } catch (Exception unused2) {
            randomAccessFile = null;
        } catch (Throwable th4) {
            randomAccessFile = null;
            th2 = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.BufferedReader, java.io.Closeable] */
    private final String getKernelVersionThroughUName() throws Throwable {
        InputStreamReader inputStreamReader;
        ?? bufferedReader;
        Throwable th2;
        Process processExec;
        try {
            processExec = Runtime.getRuntime().exec("uname -a");
            try {
                inputStreamReader = new InputStreamReader(processExec.getInputStream());
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        String line = bufferedReader.readLine();
                        UtilsKt.closeSafely(bufferedReader);
                        UtilsKt.closeSafely(inputStreamReader);
                        processExec.destroy();
                        return line;
                    } catch (Exception unused) {
                        UtilsKt.closeSafely(bufferedReader);
                        UtilsKt.closeSafely(inputStreamReader);
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        return null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        UtilsKt.closeSafely(bufferedReader);
                        UtilsKt.closeSafely(inputStreamReader);
                        if (processExec != null) {
                            processExec.destroy();
                        }
                        throw th2;
                    }
                } catch (Exception unused2) {
                    bufferedReader = 0;
                } catch (Throwable th4) {
                    bufferedReader = 0;
                    th2 = th4;
                }
            } catch (Exception unused3) {
                inputStreamReader = null;
                bufferedReader = inputStreamReader;
                UtilsKt.closeSafely(bufferedReader);
                UtilsKt.closeSafely(inputStreamReader);
                if (processExec != null) {
                    processExec.destroy();
                }
                return null;
            } catch (Throwable th5) {
                bufferedReader = 0;
                th2 = th5;
                inputStreamReader = null;
            }
        } catch (Exception unused4) {
            processExec = null;
            inputStreamReader = null;
        } catch (Throwable th6) {
            inputStreamReader = null;
            bufferedReader = 0;
            th2 = th6;
            processExec = null;
        }
    }

    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_NETWORK_STATE")
    @RequiresApi(api = 23)
    public static final NetworkCapabilities getActiveNetworkCapabilities(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getActiveNetworkCapabilities(context);
    }

    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_NETWORK_STATE")
    public static final NetworkInfo getActiveNetworkInfo(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getActiveNetworkInfo(context);
    }

    public static final Double getBatteryLevel(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getBatteryLevel(context);
    }

    @RequiresPermission(conditional = true, value = "android.permission.BLUETOOTH_CONNECT")
    public static final BluetoothAdapter getBluetoothAdapter(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getBluetoothAdapter(context);
    }

    public static final String getBuildId() {
        String str = Build.ID;
        p.i(str, "ID");
        return str;
    }

    public static final Configuration getConfiguration(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getConfiguration(context);
    }

    @RequiresPermission(conditional = true, value = "android.permission.BLUETOOTH_CONNECT")
    public static final String getDeviceName(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getDeviceName(context);
    }

    public static final DisplayMetrics getDisplayMetrics(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getDisplayMetrics(context);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001b  */
    public static final String getHWV() throws Throwable {
        boolean z10;
        String str = hwv;
        if (str != null) {
            return str;
        }
        DeviceUtils deviceUtils = INSTANCE;
        String kernelVersionThroughProcVersion = deviceUtils.getKernelVersionThroughProcVersion();
        if (kernelVersionThroughProcVersion != null) {
            z10 = kernelVersionThroughProcVersion.length() > 0;
        }
        if (!z10) {
            kernelVersionThroughProcVersion = deviceUtils.getKernelVersionThroughUName();
        }
        hwv = kernelVersionThroughProcVersion;
        return kernelVersionThroughProcVersion;
    }

    public static final String getManufacturer() {
        String str = Build.MANUFACTURER;
        p.i(str, "MANUFACTURER");
        return str;
    }

    public static final String getModel() {
        String str = Build.MODEL;
        p.i(str, "MODEL");
        return str;
    }

    public static final int getOrientation(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getOrientation(context);
    }

    public static final String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        p.i(str, "RELEASE");
        return str;
    }

    public static final String getPhoneMCCMNC(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getPhoneMCCMNC(context);
    }

    public static final String getPhoneOperatorName(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getPhoneOperatorName(context);
    }

    public static final Integer getScreenBrightness(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getScreenBrightness(context);
    }

    public static final Double getScreenBrightnessRatio(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getScreenBrightnessRatio(context);
    }

    public static final float getScreenDensity(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getScreenDensity(context);
    }

    public static final int getScreenOrientation(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getScreenOrientation(context);
    }

    public static final Point getScreenSize(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getScreenSize(context);
    }

    public static final Boolean isAirplaneModeOn(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isAirplaneModeOn(context);
    }

    public static final Boolean isBatterySaverEnabled(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isBatterySaverEnabled(context);
    }

    public static final Boolean isCharging(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isCharging(context);
    }

    public static final boolean isDarkModeEnabled(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isDarkModeEnabled(context);
    }

    public static final boolean isDeviceRooted() {
        Boolean bool = isDeviceRooted;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = true;
        try {
            String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
            for (int i10 = 0; i10 < 8; i10++) {
                if (FileUtilsKt.existsSafely(new File(strArr[i10]))) {
                    isDeviceRooted = Boolean.TRUE;
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        Process processExec = null;
        try {
            processExec = Runtime.getRuntime().exec(new String[]{"/system/xbin/which", "su"});
            if (new BufferedReader(new InputStreamReader(processExec.getInputStream())).readLine() == null) {
                z10 = false;
            }
            isDeviceRooted = Boolean.valueOf(z10);
            processExec.destroy();
            return z10;
        } catch (Exception unused2) {
            if (processExec != null) {
                processExec.destroy();
            }
            isDeviceRooted = Boolean.FALSE;
            return false;
        } catch (Throwable th2) {
            if (processExec != null) {
                processExec.destroy();
            }
            throw th2;
        }
    }

    public static final Boolean isDoNotDisturbOn(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isDoNotDisturbOn(context);
    }

    public static final boolean isLandscapeOrientation(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isLandscapeOrientation(context);
    }

    @RequiresPermission(conditional = true, value = "android.permission.ACCESS_NETWORK_STATE")
    public static final boolean isNetworkAvailable(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isNetworkAvailable(context);
    }

    public static final Boolean isRingMuted(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.isRingMuted(context);
    }

    public static final boolean isTablet(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return DeviceUtilsKt.getConfiguration(context).smallestScreenWidthDp >= 600;
    }
}
