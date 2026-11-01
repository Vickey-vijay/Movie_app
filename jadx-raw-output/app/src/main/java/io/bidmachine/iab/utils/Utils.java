package io.bidmachine.iab.utils;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.rendering.Rendering;
import io.bidmachine.util.network.NetworkUtils;
import java.io.Closeable;
import java.io.Flushable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public class Utils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f59407a = new Handler(Looper.getMainLooper());

    public class a implements View.OnApplyWindowInsetsListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f59408a;

        public a(int i10) {
            this.f59408a = i10;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            Insets insets = windowInsets.getInsets(this.f59408a);
            view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
            return windowInsets;
        }
    }

    private static float a(float f10, float f11) {
        return f10 / f11;
    }

    private static float a(int i10) {
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 != 3) {
            return i10 != 17 ? 1.0f : 0.5f;
        }
        return 0.0f;
    }

    private static void a(Window window, boolean z10) {
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
            if (windowInsetsController == null) {
                return;
            }
            windowInsetsController.setSystemBarsBehavior(2);
            if (z10) {
                windowInsetsController.hide(WindowInsets$Type.statusBars());
                return;
            }
            return;
        }
        int i10 = 0;
        if (z10) {
            window.setFlags(1024, 1024);
            i10 = 4;
        }
        if (i10 > 0) {
            window.getDecorView().setSystemUiVisibility(i10);
        }
    }

    public static void applyFullscreenActivityFlags(@NonNull Activity activity) {
        applyFullscreenActivityFlags(activity, true);
    }

    public static void applyWindowInsets(@NonNull Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            Window window = activity.getWindow();
            applyWindowInsets(window != null ? window.getDecorView() : activity.findViewById(R.id.content));
        }
    }

    private static float b(int i10) {
        if (i10 == 16 || i10 == 17) {
            return 0.5f;
        }
        return i10 != 80 ? 0.0f : 1.0f;
    }

    public static void cancelOnUiThread(@NonNull Runnable runnable) {
        f59407a.removeCallbacks(runnable);
    }

    public static void close(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                CommonLog.e("Utils", th2);
            }
        }
    }

    public static Float convertCssSizeToPx(@NonNull String str) {
        return Float.valueOf(str.replace("px", ""));
    }

    public static int dpToPx(@NonNull Context context, float f10) {
        return (int) TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public static void flush(@Nullable Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Throwable th2) {
                CommonLog.e("Utils", th2);
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static int generateViewId() {
        return View.generateViewId();
    }

    @NonNull
    public static Point getClickPoint(int i10, int i11, int i12, int i13) {
        Random random = new Random();
        return new Point((int) (((double) i10) * a(random, 0.1f, a(i12))), (int) (((double) i11) * a(random, 0.1f, b(i13))));
    }

    @NonNull
    public static Point getDefaultClickPoint(int i10, int i11) {
        return new Point(Math.round(i10 * 0.5f), Math.round(i11 * 0.7f));
    }

    public static int getScreenOrientation(@NonNull Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i10 = context.getResources().getConfiguration().orientation;
        if (i10 == 1) {
            return (rotation == 2 || rotation == 3) ? 9 : 1;
        }
        if (i10 == 2) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        return 9;
    }

    public static boolean isLandscapeOrientation(@NonNull Context context) {
        int screenOrientation = getScreenOrientation(context);
        return screenOrientation == 0 || screenOrientation == 8 || screenOrientation == 6 || screenOrientation == 11;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isNetworkAvailable(@NonNull Context context) {
        NetworkInfo activeNetworkInfo;
        CommonLog.d("Utils", "Testing connectivity:", new Object[0]);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            CommonLog.d("Utils", "No Internet connection", new Object[0]);
            return false;
        }
        CommonLog.d("Utils", "Connected to Internet", new Object[0]);
        return true;
    }

    public static boolean isTablet(@NonNull Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        double d10 = displayMetrics.widthPixels / displayMetrics.xdpi;
        double d11 = displayMetrics.heightPixels / displayMetrics.ydpi;
        return Math.sqrt((d10 * d10) + (d11 * d11)) >= 6.6d;
    }

    public static boolean isViewTransparent(View view) {
        return view.getAlpha() == 0.0f;
    }

    @Nullable
    public static Float max(@Nullable Float f10, @Nullable Float f11) {
        if (f10 == null) {
            return f11;
        }
        return f11 == null ? f10 : Float.valueOf(Math.max(f10.floatValue(), f11.floatValue()));
    }

    @Nullable
    public static Float min(@Nullable Float f10, @Nullable Float f11) {
        if (f10 == null) {
            return f11;
        }
        return f11 == null ? f10 : Float.valueOf(Math.min(f10.floatValue(), f11.floatValue()));
    }

    @NonNull
    public static MotionEvent obtainMotionEvent(int i10, int i11, int i12) {
        return MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), i10, i11, i12, 0);
    }

    public static void onUiThread(@NonNull Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f59407a.post(runnable);
        }
    }

    public static int orientationBySize(int i10, int i11) {
        return i10 > i11 ? 2 : 1;
    }

    public static String orientationToString(int i10) {
        if (i10 == 0) {
            return "UNDEFINED";
        }
        if (i10 != 1) {
            return i10 != 2 ? "UNKNOWN" : "LANDSCAPE";
        }
        return "PORTRAIT";
    }

    public static int pixelsToIntDips(float f10, float f11) {
        return (int) (a(f10, f11) + 0.5f);
    }

    public static void postOnUiThread(@NonNull Runnable runnable) {
        f59407a.post(runnable);
    }

    public static void removeFromParent(@Nullable View view) {
        if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static void simpleTrackUrl(@Nullable String str) {
        simpleTrackUrl(str, Executors.newSingleThreadExecutor());
    }

    @NonNull
    public static String stringifyRect(@NonNull Rect rect) {
        return rect.left + StringUtils.COMMA + rect.top + StringUtils.COMMA + rect.width() + StringUtils.COMMA + rect.height();
    }

    @NonNull
    public static String stringifySize(@NonNull Rect rect) {
        return rect.width() + StringUtils.COMMA + rect.height();
    }

    private static double a(Random random, float f10, float f11) {
        double d10;
        double dSqrt = Math.sqrt(Math.log(Math.abs(((random.nextLong() % 100000) + 1) / 100000.0d)) * (-2.0d)) * Math.sin(Math.abs(((random.nextLong() % 100000) + 1) / 100000.0d) * 6.283185307179586d);
        double d11 = f11;
        if (d11 < 0.4d || d11 > 0.6d) {
            d10 = d11 < 0.4d ? d11 + (((double) f10) / (dSqrt * dSqrt)) : d11 - (((double) f10) / (dSqrt * dSqrt));
        } else {
            d10 = (dSqrt * ((double) f10)) + d11;
        }
        return Math.min(1.0d, Math.max(0.0d, d10));
    }

    public static void applyFullscreenActivityFlags(@NonNull Activity activity, boolean z10) {
        activity.requestWindowFeature(1);
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(128);
            a(window, z10);
        }
        a(activity);
    }

    @RequiresApi(api = 30)
    public static void applyWindowInsets(@NonNull View view) {
        applyWindowInsets(view, WindowInsets$Type.systemBars() | WindowInsets$Type.displayCutout());
    }

    @NonNull
    public static Point getClickPoint(@NonNull Rect rect, int i10, int i11) {
        return getClickPoint(rect.width(), rect.height(), i10, i11);
    }

    @NonNull
    public static Point getDefaultClickPoint(@NonNull Rect rect) {
        return getDefaultClickPoint(rect.width(), rect.height());
    }

    public static void onUiThread(@NonNull Runnable runnable, long j10) {
        f59407a.postDelayed(runnable, j10);
    }

    public static void simpleTrackUrl(@Nullable final String str, @NonNull Executor executor) {
        if (TextUtils.isEmpty(str)) {
            CommonLog.d("Utils", "url is null or empty", new Object[0]);
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: uf.a
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    Utils.a(str);
                }
            });
        } catch (Exception e10) {
            CommonLog.e("Utils", e10);
        }
    }

    private static void a(Activity activity) {
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    @RequiresApi(api = 30)
    public static void applyWindowInsets(@NonNull View view, int i10) {
        view.setOnApplyWindowInsetsListener(new a(i10));
        view.requestApplyInsets();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0074: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:19:0x0074 */
    public static /* synthetic */ void a(String str) throws Throwable {
        HttpURLConnection httpURLConnection;
        Exception e10;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3 = null;
        try {
            try {
                CommonLog.d("Utils", "Connection to URL: %s", str);
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setInstanceFollowRedirects(true);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setRequestProperty("Connection", "close");
                    httpURLConnection.setRequestMethod("GET");
                    String userAgent = Rendering.getUserAgent();
                    if (!TextUtils.isEmpty(userAgent)) {
                        httpURLConnection.setRequestProperty("User-Agent", userAgent);
                    }
                    CommonLog.d("Utils", "Response code: %d, for URL: %s", Integer.valueOf(httpURLConnection.getResponseCode()), str);
                } catch (Exception e11) {
                    e10 = e11;
                    CommonLog.e("Utils", "%s: %s: %s", str, e10.getMessage(), e10.toString());
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection3 = httpURLConnection2;
                NetworkUtils.disconnectSafely(httpURLConnection3);
                throw th;
            }
        } catch (Exception e12) {
            httpURLConnection = null;
            e10 = e12;
        } catch (Throwable th3) {
            th = th3;
            NetworkUtils.disconnectSafely(httpURLConnection3);
            throw th;
        }
        NetworkUtils.disconnectSafely(httpURLConnection);
    }
}
