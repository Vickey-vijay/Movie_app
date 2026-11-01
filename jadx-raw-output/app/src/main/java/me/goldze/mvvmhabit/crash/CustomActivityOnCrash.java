package me.goldze.mvvmhabit.crash;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.ironsource.Z7;
import com.safedk.android.utils.Logger;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes10.dex */
public final class CustomActivityOnCrash {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    public static Application f64446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static CaocConfig f64447b = new CaocConfig();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Deque<String> f64448c = new ArrayDeque(50);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static WeakReference<Activity> f64449d = new WeakReference<>(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f64450e = true;

    public interface EventListener extends Serializable {
        void onCloseAppFromErrorActivity();

        void onLaunchErrorActivity();

        void onRestartAppFromErrorActivity();
    }

    public class a implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Thread.UncaughtExceptionHandler f64451a;

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            p10.startActivity(p11);
        }

        public a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f64451a = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
            if (CustomActivityOnCrash.f64447b.isEnabled()) {
                Log.e("CustomActivityOnCrash", "App has crashed, executing CustomActivityOnCrash's UncaughtExceptionHandler", th2);
                if (!CustomActivityOnCrash.D(CustomActivityOnCrash.f64446a)) {
                    CustomActivityOnCrash.K(CustomActivityOnCrash.f64446a, new Date().getTime());
                    Class<? extends Activity> errorActivityClass = CustomActivityOnCrash.f64447b.getErrorActivityClass();
                    if (errorActivityClass == null) {
                        errorActivityClass = CustomActivityOnCrash.B(CustomActivityOnCrash.f64446a);
                    }
                    if (CustomActivityOnCrash.F(th2, errorActivityClass)) {
                        Log.e("CustomActivityOnCrash", "Your application class or your error activity have crashed, the custom activity will not be launched!");
                        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f64451a;
                        if (uncaughtExceptionHandler2 != null) {
                            uncaughtExceptionHandler2.uncaughtException(thread, th2);
                            return;
                        }
                    } else if (CustomActivityOnCrash.f64447b.getBackgroundMode() != 1 && CustomActivityOnCrash.f64450e) {
                        if (CustomActivityOnCrash.f64447b.getBackgroundMode() == 2 && (uncaughtExceptionHandler = this.f64451a) != null) {
                            uncaughtExceptionHandler.uncaughtException(thread, th2);
                            return;
                        }
                    } else {
                        Intent intent = new Intent(CustomActivityOnCrash.f64446a, errorActivityClass);
                        StringWriter stringWriter = new StringWriter();
                        th2.printStackTrace(new PrintWriter(stringWriter));
                        String string = stringWriter.toString();
                        if (string.length() > 131071) {
                            string = string.substring(0, 131047) + " [stack trace too large]";
                        }
                        intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE", string);
                        if (CustomActivityOnCrash.f64447b.isTrackActivities()) {
                            String str = "";
                            while (!CustomActivityOnCrash.f64448c.isEmpty()) {
                                str = str + ((String) CustomActivityOnCrash.f64448c.poll());
                            }
                            intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_ACTIVITY_LOG", str);
                        }
                        if (CustomActivityOnCrash.f64447b.isShowRestartButton() && CustomActivityOnCrash.f64447b.getRestartActivityClass() == null) {
                            CustomActivityOnCrash.f64447b.setRestartActivityClass(CustomActivityOnCrash.C(CustomActivityOnCrash.f64446a));
                        }
                        intent.putExtra("cat.ereza.customactivityoncrash.EXTRA_CONFIG", CustomActivityOnCrash.f64447b);
                        intent.setFlags(268468224);
                        if (CustomActivityOnCrash.f64447b.getEventListener() != null) {
                            CustomActivityOnCrash.f64447b.getEventListener().onLaunchErrorActivity();
                        }
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(CustomActivityOnCrash.f64446a, intent);
                    }
                } else {
                    Log.e("CustomActivityOnCrash", "App already crashed recently, not starting custom error activity because we could enter a restart loop. Are you sure that your app does not crash directly on init?", th2);
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.f64451a;
                    if (uncaughtExceptionHandler3 != null) {
                        uncaughtExceptionHandler3.uncaughtException(thread, th2);
                        return;
                    }
                }
                Activity activity = (Activity) CustomActivityOnCrash.f64449d.get();
                if (activity != null) {
                    activity.finish();
                    CustomActivityOnCrash.f64449d.clear();
                }
                CustomActivityOnCrash.G();
                return;
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.f64451a;
            if (uncaughtExceptionHandler4 != null) {
                uncaughtExceptionHandler4.uncaughtException(thread, th2);
            }
        }
    }

    public class b implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f64452b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public DateFormat f64453c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            int i10 = this.f64452b + 1;
            this.f64452b = i10;
            boolean unused = CustomActivityOnCrash.f64450e = i10 == 0;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int i10 = this.f64452b - 1;
            this.f64452b = i10;
            boolean unused = CustomActivityOnCrash.f64450e = i10 == 0;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity.getClass() != CustomActivityOnCrash.f64447b.getErrorActivityClass()) {
                WeakReference unused = CustomActivityOnCrash.f64449d = new WeakReference(activity);
            }
            if (CustomActivityOnCrash.f64447b.isTrackActivities()) {
                CustomActivityOnCrash.f64448c.add(this.f64453c.format(new Date()) + ": " + activity.getClass().getSimpleName() + " created\n");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (CustomActivityOnCrash.f64447b.isTrackActivities()) {
                CustomActivityOnCrash.f64448c.add(this.f64453c.format(new Date()) + ": " + activity.getClass().getSimpleName() + " destroyed\n");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (CustomActivityOnCrash.f64447b.isTrackActivities()) {
                CustomActivityOnCrash.f64448c.add(this.f64453c.format(new Date()) + ": " + activity.getClass().getSimpleName() + " paused\n");
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (CustomActivityOnCrash.f64447b.isTrackActivities()) {
                CustomActivityOnCrash.f64448c.add(this.f64453c.format(new Date()) + ": " + activity.getClass().getSimpleName() + " resumed\n");
            }
        }
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void E(@Nullable Context context) {
        try {
            if (context == null) {
                Log.e("CustomActivityOnCrash", "Install failed: context is null!");
                return;
            }
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler == null || !defaultUncaughtExceptionHandler.getClass().getName().startsWith("cat.ereza.customactivityoncrash")) {
                if (defaultUncaughtExceptionHandler != null && !defaultUncaughtExceptionHandler.getClass().getName().startsWith("com.android.internal.os")) {
                    Log.e("CustomActivityOnCrash", "IMPORTANT WARNING! You already have an UncaughtExceptionHandler, are you sure this is correct? If you use a custom UncaughtExceptionHandler, you must initialize it AFTER CustomActivityOnCrash! Installing anyway, but your original handler will not be called.");
                }
                f64446a = (Application) context.getApplicationContext();
                Thread.setDefaultUncaughtExceptionHandler(new a(defaultUncaughtExceptionHandler));
                f64446a.registerActivityLifecycleCallbacks(new b());
            } else {
                Log.e("CustomActivityOnCrash", "CustomActivityOnCrash was already installed, doing nothing!");
            }
            Log.i("CustomActivityOnCrash", "CustomActivityOnCrash has been installed.");
        } catch (Throwable th2) {
            Log.e("CustomActivityOnCrash", "An unknown error occurred while installing CustomActivityOnCrash, it may not have been properly initialized. Please report this as a bug if needed.", th2);
        }
    }

    public static void H(@NonNull Activity activity, @NonNull CaocConfig caocConfig) {
        I(activity, new Intent(activity, caocConfig.getRestartActivityClass()), caocConfig);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void J(@NonNull CaocConfig caocConfig) {
        f64447b = caocConfig;
    }

    @SuppressLint({"ApplySharedPref"})
    public static void K(@NonNull Context context, long j10) {
        context.getSharedPreferences("custom_activity_on_crash", 0).edit().putLong("last_crash_timestamp", j10).commit();
    }

    @NonNull
    public static String n(@Nullable String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char cCharAt = str.charAt(0);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        return Character.toUpperCase(cCharAt) + str.substring(1);
    }

    @Nullable
    public static String p(@NonNull Intent intent) {
        return intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_ACTIVITY_LOG");
    }

    @NonNull
    public static String q(@NonNull Context context, @NonNull Intent intent) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        String strR = r(context, simpleDateFormat);
        String str = "Build version: " + A(context) + " \n";
        if (strR != null) {
            str = str + "Build date: " + strR + " \n";
        }
        String str2 = (((str + "Current date: " + simpleDateFormat.format(date) + " \n") + "Device: " + u() + " \n \n") + "Stack trace:  \n") + z(intent);
        String strP = p(intent);
        if (strP == null) {
            return str2;
        }
        return (str2 + "\nUser actions: \n") + strP;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static CaocConfig s() {
        return f64447b;
    }

    @NonNull
    public static CaocConfig t(@NonNull Intent intent) {
        return (CaocConfig) intent.getSerializableExtra("cat.ereza.customactivityoncrash.EXTRA_CONFIG");
    }

    @NonNull
    public static String u() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str2.startsWith(str)) {
            return n(str2);
        }
        return n(str) + Z7.f27998r + str2;
    }

    @Nullable
    public static Class<? extends Activity> v(@NonNull Context context) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.ERROR").setPackage(context.getPackageName()), 64);
        if (listQueryIntentActivities == null || listQueryIntentActivities.size() <= 0) {
            return null;
        }
        try {
            return Class.forName(listQueryIntentActivities.get(0).activityInfo.name);
        } catch (ClassNotFoundException e10) {
            Log.e("CustomActivityOnCrash", "Failed when resolving the error activity class via intent filter, stack trace follows!", e10);
            return null;
        }
    }

    public static long w(@NonNull Context context) {
        return context.getSharedPreferences("custom_activity_on_crash", 0).getLong("last_crash_timestamp", -1L);
    }

    @Nullable
    public static Class<? extends Activity> y(@NonNull Context context) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("cat.ereza.customactivityoncrash.RESTART").setPackage(context.getPackageName()), 64);
        if (listQueryIntentActivities == null || listQueryIntentActivities.size() <= 0) {
            return null;
        }
        try {
            return Class.forName(listQueryIntentActivities.get(0).activityInfo.name);
        } catch (ClassNotFoundException e10) {
            Log.e("CustomActivityOnCrash", "Failed when resolving the restart activity class via intent filter, stack trace follows!", e10);
            return null;
        }
    }

    @NonNull
    public static String z(@NonNull Intent intent) {
        return intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE");
    }

    @NonNull
    public static String A(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    @NonNull
    public static Class<? extends Activity> B(@NonNull Context context) {
        Class<? extends Activity> clsV = v(context);
        if (clsV == null) {
            return DefaultErrorActivity.class;
        }
        return clsV;
    }

    @Nullable
    public static Class<? extends Activity> C(@NonNull Context context) {
        Class<? extends Activity> clsY = y(context);
        if (clsY == null) {
            return x(context);
        }
        return clsY;
    }

    public static boolean D(@NonNull Context context) {
        long jW = w(context);
        long time = new Date().getTime();
        if (jW <= time && time - jW < f64447b.getMinTimeBetweenCrashesMs()) {
            return true;
        }
        return false;
    }

    public static boolean F(@NonNull Throwable th2, @NonNull Class<? extends Activity> cls) {
        do {
            for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                if ((stackTraceElement.getClassName().equals("android.app.ActivityThread") && stackTraceElement.getMethodName().equals("handleBindApplication")) || stackTraceElement.getClassName().equals(cls.getName())) {
                    return true;
                }
            }
            th2 = th2.getCause();
        } while (th2 != null);
        return false;
    }

    public static void G() {
        Process.killProcess(Process.myPid());
        System.exit(10);
    }

    public static void I(@NonNull Activity activity, @NonNull Intent intent, @NonNull CaocConfig caocConfig) {
        intent.addFlags(270565376);
        if (intent.getComponent() != null) {
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
        }
        if (caocConfig.getEventListener() != null) {
            caocConfig.getEventListener().onRestartAppFromErrorActivity();
        }
        activity.finish();
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
        G();
    }

    public static void o(@NonNull Activity activity, @NonNull CaocConfig caocConfig) {
        if (caocConfig.getEventListener() != null) {
            caocConfig.getEventListener().onCloseAppFromErrorActivity();
        }
        activity.finish();
        G();
    }

    @Nullable
    public static String r(@NonNull Context context, @NonNull DateFormat dateFormat) {
        long time;
        try {
            ZipFile zipFile = new ZipFile(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).sourceDir);
            time = zipFile.getEntry("classes.dex").getTime();
            zipFile.close();
        } catch (Exception unused) {
            time = 0;
        }
        if (time > 312764400000L) {
            return dateFormat.format(new Date(time));
        }
        return null;
    }

    @Nullable
    public static Class<? extends Activity> x(@NonNull Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            try {
                return Class.forName(launchIntentForPackage.getComponent().getClassName());
            } catch (ClassNotFoundException e10) {
                Log.e("CustomActivityOnCrash", "Failed when resolving the restart activity class via getLaunchIntentForPackage, stack trace follows!", e10);
                return null;
            }
        }
        return null;
    }
}
