package io.bidmachine.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.location.Location;
import android.media.MediaMetadataRetriever;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import io.bidmachine.Executable;
import io.bidmachine.Function;
import io.bidmachine.SimpleContextProvider;
import io.bidmachine.UserAgentManager;
import io.bidmachine.core.Utils;
import io.bidmachine.util.ViewUtils;
import io.bidmachine.util.network.NetworkUtils;
import io.bidmachine.utils.DeviceUtils;
import io.bidmachine.utils.ThrowableRunnable;
import io.bidmachine.utils.lazy.LazyCachedValue;
import io.bidmachine.utils.lazy.LazyValue;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class Utils {

    @NonNull
    private static final Handler BACKGROUND_HANDLER;

    @NonNull
    private static final LazyCachedValue<Integer> CURRENT_YEAR;
    private static String appName;
    private static String appVersion;

    @NonNull
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());

    @NonNull
    private static final char[] HEX_ARRAY = "0123456789abcdef".toCharArray();

    @NonNull
    private static final char[] UPPER_HEX_ARRAY = "0123456789ABCDEF".toCharArray();

    @NonNull
    public static Context findDialogContext(@NonNull Context context) {
        return findDialogContext(context, null);
    }

    @Nullable
    public static NetworkInfo getActiveNetworkInfo(@NonNull Context context) {
        try {
            ConnectivityManager connectivityManager = getConnectivityManager(context);
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (Throwable th2) {
            Logger.w(th2);
            return null;
        }
    }

    @Nullable
    public static File getExternalFilesDir(@NonNull Context context) {
        return context.getExternalFilesDir(null);
    }

    @Nullable
    public static File getExternalFilesDirDirty(@NonNull Context context) {
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory == null) {
                return null;
            }
            return new File(externalStorageDirectory, "/Android/data/" + context.getPackageName() + "/files");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static float getOrDefault(float f10, float f11, float f12) {
        return f10 == f11 ? f12 : f10;
    }

    public static long getOrDefault(long j10, long j11, long j12) {
        return j10 == j11 ? j12 : j10;
    }

    @NonNull
    public static Rect getViewRectangle(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    @Nullable
    @SafeVarargs
    public static Object invokeMethodByName(@NonNull Object obj, @NonNull String str, @Nullable Pair<Class<?>, Object>... pairArr) throws Exception {
        return invokeMethodByName(obj, obj.getClass(), str, pairArr);
    }

    public static boolean isEmpty(@Nullable Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @Nullable
    public static <T> String join(@Nullable List<T> list) {
        return join(list, ", ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getConnectivityManager$1() {
        return String.format("Manifest permission not found: %s. Check the integration.", "android.permission.ACCESS_NETWORK_STATE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static /* synthetic */ void lambda$simpleTrackUrl$2(String str) throws Throwable {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        Exception e10;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                try {
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setRequestProperty("Connection", "close");
                    httpURLConnection.setRequestMethod("GET");
                    String userAgent = UserAgentManager.getUserAgent();
                    if (!TextUtils.isEmpty(userAgent)) {
                        httpURLConnection.setRequestProperty("User-Agent", userAgent);
                    }
                    httpURLConnection.getResponseCode();
                    try {
                        close(httpURLConnection.getInputStream());
                    } catch (Exception e11) {
                        e = e11;
                        Logger.w(e);
                    }
                } catch (Exception e12) {
                    e10 = e12;
                    Logger.w(e10);
                    if (httpURLConnection != null) {
                        try {
                            close(httpURLConnection.getInputStream());
                        } catch (Exception e13) {
                            e = e13;
                            Logger.w(e);
                        }
                    }
                }
            } catch (Throwable th3) {
                th2 = th3;
                if (httpURLConnection != null) {
                    try {
                        close(httpURLConnection.getInputStream());
                    } catch (Exception e14) {
                        Logger.w(e14);
                    }
                }
                NetworkUtils.disconnectSafely(httpURLConnection);
                throw th2;
            }
        } catch (Exception e15) {
            e10 = e15;
            httpURLConnection = null;
        } catch (Throwable th4) {
            th2 = th4;
            httpURLConnection = null;
            if (httpURLConnection != null) {
                close(httpURLConnection.getInputStream());
            }
            NetworkUtils.disconnectSafely(httpURLConnection);
            throw th2;
        }
        NetworkUtils.disconnectSafely(httpURLConnection);
    }

    public static void onBackgroundThread(@NonNull Runnable runnable) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = BACKGROUND_HANDLER;
        if (looperMyLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void onUiThread(@NonNull Runnable runnable) {
        if (isUiThread()) {
            runnable.run();
        } else {
            UI_HANDLER.post(runnable);
        }
    }

    @Nullable
    public static <T> T oneOf(@Nullable T t10, @Nullable T t11) {
        return (T) oneOf(t10, t11, null);
    }

    @Nullable
    public static <T> T oneOf(@Nullable T t10, @Nullable T t11, @Nullable T t12) {
        if (t10 != null) {
            return t10;
        }
        return t11 != null ? t11 : t12;
    }

    public static int parseIntOrDefault(@Nullable String str, int i10) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (Throwable unused) {
            }
        }
        return i10;
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        com.safedk.android.utils.Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, "io.bidmachine");
        p10.startActivity(p11);
    }

    @Nullable
    public static String streamToString(@NonNull InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        String string = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
                string = byteArrayOutputStream.toString("UTF-8");
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            byteArrayOutputStream = null;
        }
        flush(byteArrayOutputStream);
        close(byteArrayOutputStream);
        close(inputStream);
        return string;
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BackgroundHandlerThread");
        handlerThread.start();
        BACKGROUND_HANDLER = new Handler(handlerThread.getLooper());
        CURRENT_YEAR = new LazyCachedValue<>(new LazyValue() { // from class: qf.c
            @Override // io.bidmachine.utils.lazy.LazyValue
            public final Object get() {
                return Utils.lambda$static$0();
            }
        });
    }

    public static boolean canAddWindowToActivity(@Nullable Activity activity) {
        return (activity == null || activity.getWindow() == null || !activity.getWindow().isActive() || activity.getWindow().getDecorView().getWindowToken() == null) ? false : true;
    }

    public static void cancelBackgroundThreadTask(@NonNull Runnable runnable) {
        BACKGROUND_HANDLER.removeCallbacks(runnable);
    }

    public static void cancelUiThreadTask(@NonNull Runnable runnable) {
        UI_HANDLER.removeCallbacks(runnable);
    }

    @NonNull
    public static String capitalize(@NonNull String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static void close(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e10) {
                Logger.w(e10);
            }
        }
    }

    @Nullable
    public static Float convertToFloatOrDefault(@Nullable Object obj, @Nullable Float f10) {
        if (obj == null) {
            return f10;
        }
        return obj instanceof Number ? Float.valueOf(((Number) obj).floatValue()) : parseFloatOrDefault(obj.toString(), f10);
    }

    @Nullable
    public static Integer convertToIntOrDefault(@Nullable Object obj, @Nullable Integer num) {
        if (obj == null) {
            return num;
        }
        return obj instanceof Number ? Integer.valueOf(((Number) obj).intValue()) : parseIntOrDefault(obj.toString(), num);
    }

    @NonNull
    public static Context findDialogContext(@NonNull Context context, @Nullable View view) {
        Activity activity = new SimpleContextProvider(context).getActivity();
        if (activity != null) {
            return activity;
        }
        if (view == null) {
            return context;
        }
        View viewFindContentOrRootView = ViewUtils.findContentOrRootView(view);
        return viewFindContentOrRootView != null ? viewFindContentOrRootView.getContext() : view.getContext();
    }

    public static void flush(@Nullable Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Exception e10) {
                Logger.w(e10);
            }
        }
    }

    @NonNull
    public static String generateTag(@NonNull String str, @NonNull Object obj) {
        return str + " @" + Integer.toHexString(obj.hashCode());
    }

    public static String getAppName(@NonNull Context context) {
        if (appName == null) {
            appName = (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
        }
        return appName;
    }

    @Nullable
    public static String getAppVersion(@NonNull Context context) {
        if (appVersion == null) {
            try {
                String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                if (str != null) {
                    appVersion = str;
                }
            } catch (Exception e10) {
                Logger.w(e10);
            }
        }
        return appVersion;
    }

    @Nullable
    @SuppressLint({"MissingPermission"})
    public static ConnectivityManager getConnectivityManager(@NonNull Context context) {
        if (!isPermissionGranted(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Logger.e((LazyValue<String>) new LazyValue() { // from class: qf.d
                @Override // io.bidmachine.utils.lazy.LazyValue
                public final Object get() {
                    return Utils.lambda$getConnectivityManager$1();
                }
            });
            return null;
        }
        try {
            return (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th2) {
            Logger.w(th2);
            return null;
        }
    }

    public static byte[] getMD5(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e10) {
            Logger.w(e10);
            return null;
        }
    }

    public static int getUtcOffsetMinutes() {
        return (int) TimeUnit.MILLISECONDS.toMinutes(TimeZone.getDefault().getOffset(System.currentTimeMillis()));
    }

    public static <T> void ifNotNull(@Nullable T t10, @NonNull Executable<T> executable) {
        if (t10 != null) {
            executable.execute(t10);
        }
    }

    @Nullable
    @SafeVarargs
    public static Object invokeMethodByName(@NonNull Object obj, @Nullable Class<?> cls, @NonNull String str, @Nullable Pair<Class<?>, Object>... pairArr) throws Exception {
        Class<?>[] clsArr;
        Object[] objArr;
        if (pairArr != null) {
            clsArr = new Class[pairArr.length];
            objArr = new Object[pairArr.length];
            for (int i10 = 0; i10 < pairArr.length; i10++) {
                clsArr[i10] = (Class) pairArr[i10].first;
                objArr[i10] = pairArr[i10].second;
            }
        } else {
            clsArr = null;
            objArr = null;
        }
        for (int i11 = 10; i11 > 0 && cls != null; i11--) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                declaredMethod.setAccessible(true);
                return declaredMethod.invoke(obj, objArr);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            } catch (NoSuchMethodException unused2) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }

    public static boolean isEmpty(@Nullable Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static boolean isHttpUrl(@NonNull String str) {
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static boolean isYearValid(int i10) {
        return i10 >= 1900 && i10 <= CURRENT_YEAR.get().intValue();
    }

    @Nullable
    public static <T> String join(@Nullable List<T> list, @NonNull CharSequence charSequence) {
        return join(list, charSequence, new Function() { // from class: qf.a
            @Override // io.bidmachine.Function
            public final Object apply(Object obj) {
                return obj.toString();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> void putAll(@Nullable Map<K, V> map, @Nullable Map<K, V> map2) {
        if (map == null || map2 == 0) {
            return;
        }
        map.putAll(map2);
    }

    @Nullable
    public static String readFile(@NonNull File file) {
        try {
            return streamToString(new FileInputStream(file));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable, java.io.Flushable] */
    @Nullable
    public static String retrieveAndSaveFrame(@NonNull Context context, @NonNull Uri uri, @NonNull String str) throws Throwable {
        FileOutputStream fileOutputStream;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
        ?? r10 = 0;
        if (strExtractMetadata == null) {
            return null;
        }
        Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(Long.parseLong(strExtractMetadata), 2);
        try {
            if (frameAtTime != null) {
                try {
                    File file = new File(getCacheDir(context, str), generateFileName(uri.toString()));
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        frameAtTime.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        String absolutePath = file.getAbsolutePath();
                        flush(fileOutputStream);
                        close(fileOutputStream);
                        return absolutePath;
                    } catch (Exception e10) {
                        e = e10;
                        Logger.w(e);
                        flush(fileOutputStream);
                        close(fileOutputStream);
                        return null;
                    }
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    flush(r10);
                    close(r10);
                    throw th;
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            r10 = context;
        }
    }

    public static void startActivity(@NonNull Context context, @NonNull Intent intent) {
        try {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
        } catch (Throwable th2) {
            Logger.w(th2);
        }
    }

    @Nullable
    public static String toHexString(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            int i11 = bArr[i10] & 255;
            int i12 = i10 * 2;
            char[] cArr2 = HEX_ARRAY;
            cArr[i12] = cArr2[i11 >>> 4];
            cArr[i12 + 1] = cArr2[i11 & 15];
        }
        return new String(cArr);
    }

    @NonNull
    public static Map<String, String> toMap(@NonNull JSONObject jSONObject) throws Exception {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt != null) {
                map.put(next, objOpt.toString());
            }
        }
        return map;
    }

    @Nullable
    public static String toSignatureHexString(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 3) - 1];
        int i10 = 0;
        for (int i11 = 0; i11 < bArr.length; i11++) {
            int i12 = bArr[i11] & 255;
            int i13 = i10 + 1;
            char[] cArr2 = UPPER_HEX_ARRAY;
            cArr[i10] = cArr2[i12 >>> 4];
            i10 = i13 + 1;
            cArr[i13] = cArr2[i12 & 15];
            if (i11 < bArr.length - 1) {
                cArr[i10] = ':';
                i10++;
            }
        }
        return new String(cArr);
    }

    @VisibleForTesting
    public static boolean writePermissionGranted(@NonNull Context context) {
        return isPermissionGranted(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static boolean canUseCleartextTraffic() {
        if (NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
            return true;
        }
        return false;
    }

    public static boolean canUseExternalFilesDir() {
        return isExternalMemoryAvailable();
    }

    @NonNull
    public static String checkIfEmpty(@Nullable String str, @NonNull String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str;
    }

    public static Handler createHandlerWithMyOrMainLooper() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return new Handler(looperMyLooper);
    }

    @NonNull
    public static String generateFileName(@NonNull String str) {
        return new BigInteger(getMD5(str.getBytes())).abs().toString(36);
    }

    @Nullable
    @RequiresApi(api = 23)
    public static NetworkCapabilities getActiveNetworkCapabilities(@NonNull Context context) {
        ConnectivityManager connectivityManager = getConnectivityManager(context);
        if (connectivityManager == null) {
            return null;
        }
        try {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return null;
            }
            return connectivityManager.getNetworkCapabilities(activeNetwork);
        } catch (Throwable th2) {
            Logger.w(th2);
            return null;
        }
    }

    @Nullable
    public static Location getBestLocation(@NonNull Context context, @Nullable Location location, @Nullable Location location2) {
        Location location3 = (Location) oneOf(location, location2);
        Location location4 = io.bidmachine.util.Utils.getLocation(context);
        if (location4 != null) {
            if (location3 == null || location4.getTime() >= location3.getTime()) {
                return location4;
            }
            return location3;
        }
        return location3;
    }

    @Nullable
    public static File getCacheDir(@NonNull Context context, @NonNull String str) {
        File externalFilesDir = getExternalFilesDir(context);
        if (externalFilesDir != null) {
            File file = new File(externalFilesDir.getPath() + "/" + str + "/");
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            return null;
        }
        return null;
    }

    public static float getScreenDensity(@NonNull Context context) {
        return DeviceUtils.getDisplayMetrics(context).density;
    }

    @NonNull
    public static Point getScreenSize(@NonNull Context context) {
        DisplayMetrics displayMetrics = DeviceUtils.getDisplayMetrics(context);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static void ifNotEmpty(@Nullable String str, @NonNull Executable<String> executable) {
        if (!TextUtils.isEmpty(str)) {
            executable.execute(str);
        }
    }

    public static boolean isExternalMemoryAvailable() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isNetworkAvailable(@NonNull Context context) {
        NetworkInfo activeNetworkInfo = getActiveNetworkInfo(context);
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public static boolean isPermissionGranted(@NonNull Context context, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isUiThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    public static boolean isUrlValid(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            new URL(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isViewTransparent(@NonNull View view) {
        if (view.getAlpha() == 0.0f) {
            return true;
        }
        return false;
    }

    @Nullable
    public static <T> String join(@Nullable List<T> list, @NonNull CharSequence charSequence, @NonNull Function<T, String> function) {
        String strApply;
        if (isEmpty(list)) {
            return null;
        }
        try {
            StringBuilder sb2 = new StringBuilder(list.size());
            for (T t10 : list) {
                if (t10 != null && (strApply = function.apply(t10)) != null) {
                    if (sb2.length() > 0) {
                        sb2.append(charSequence);
                    }
                    sb2.append(strApply);
                }
            }
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$static$0() {
        return Integer.valueOf(safeCalendarGetInstance().get(1));
    }

    @Nullable
    public static Float parseFloatOrDefault(@Nullable String str, @Nullable Float f10) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Float.valueOf(Float.parseFloat(str));
            } catch (Throwable unused) {
            }
        }
        return f10;
    }

    @Nullable
    @SuppressLint({"RtlHardcoded"})
    public static Integer parseHorizontalPosition(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "center":
                return 1;
            case "left":
                return 3;
            case "right":
                return 5;
            default:
                return null;
        }
    }

    @Nullable
    public static Integer parseIntOrDefault(@Nullable String str, @Nullable Integer num) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Integer.parseInt(str));
            } catch (Throwable unused) {
            }
        }
        return num;
    }

    @Nullable
    public static Integer parseVerticalPosition(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "bottom":
                return 80;
            case "center":
                return 16;
            case "top":
                return 48;
            default:
                return null;
        }
    }

    public static void runCatching(@NonNull ThrowableRunnable throwableRunnable) {
        try {
            throwableRunnable.run();
        } catch (Throwable unused) {
        }
    }

    @NonNull
    private static Calendar safeCalendarGetInstance() {
        try {
            try {
                return Calendar.getInstance();
            } catch (Throwable unused) {
                return Calendar.getInstance(Locale.US);
            }
        } catch (Throwable unused2) {
            return Calendar.getInstance(TimeZone.getTimeZone("GMT"), Locale.US);
        }
    }

    @Nullable
    public static Integer safeParseColor(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static void simpleTrackUrl(@Nullable final String str, @Nullable Executor executor) {
        if (!TextUtils.isEmpty(str) && executor != null) {
            try {
                executor.execute(new Runnable() { // from class: qf.b
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        Utils.lambda$simpleTrackUrl$2(str);
                    }
                });
            } catch (Exception e10) {
                Logger.w(e10);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void sort(@NonNull CopyOnWriteArrayList<T> copyOnWriteArrayList, @Nullable Comparator<? super T> comparator) {
        Object[] array = copyOnWriteArrayList.toArray();
        Arrays.sort(array, comparator);
        for (int i10 = 0; i10 < array.length; i10++) {
            copyOnWriteArrayList.set(i10, array[i10]);
        }
    }

    public static void onBackgroundThread(@NonNull Runnable runnable, long j10) {
        BACKGROUND_HANDLER.postDelayed(runnable, j10);
    }

    public static void onUiThread(@NonNull Runnable runnable, long j10) {
        UI_HANDLER.postDelayed(runnable, j10);
    }
}
