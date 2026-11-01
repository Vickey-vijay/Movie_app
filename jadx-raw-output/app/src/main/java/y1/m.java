package y1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.work.PeriodicWorkRequest;
import ck.p;
import ck.w;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.x;
import com.facebook.internal.a0;
import com.vungle.ads.internal.signals.SignalManager;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: compiled from: SessionLogger.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0016\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007J$\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J\b\u0010\u0012\u001a\u00020\tH\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u001c\u0010\u0016\u001a\n \u0014*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018¨\u0006\u001c"}, d2 = {"Ly1/m;", "", "", "activityName", "Ly1/n;", "sourceApplicationInfo", "appId", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lmj/r;", "c", "Ly1/l;", "sessionInfo", "e", "", "timeBetweenSessions", "", "b", "d", "a", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "", "[J", "INACTIVE_SECONDS_QUANTA", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f75239a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = m.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final long[] INACTIVE_SECONDS_QUANTA = {300000, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS, 1800000, 3600000, 21600000, 43200000, SignalManager.TWENTY_FOUR_HOURS_MILLIS, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    public static final void e(String str, l lVar, String str2) {
        long jLongValue;
        String string;
        if (i2.a.d(m.class)) {
            return;
        }
        try {
            p.j(str, "activityName");
            if (lVar == null) {
                return;
            }
            Long lB = lVar.b();
            long jLongValue2 = 0;
            if (lB == null) {
                Long sessionLastEventTime = lVar.getSessionLastEventTime();
                jLongValue = 0 - (sessionLastEventTime == null ? 0L : sessionLastEventTime.longValue());
            } else {
                jLongValue = lB.longValue();
            }
            if (jLongValue < 0) {
                f75239a.d();
                jLongValue = 0;
            }
            long jF = lVar.f();
            if (jF < 0) {
                f75239a.d();
                jF = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", lVar.getInterruptionCount());
            w wVar = w.f6066a;
            String str3 = String.format(Locale.ROOT, "session_quanta_%d", Arrays.copyOf(new Object[]{Integer.valueOf(b(jLongValue))}, 1));
            p.i(str3, "java.lang.String.format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", str3);
            n sourceApplicationInfo = lVar.getSourceApplicationInfo();
            String str4 = "Unclassified";
            if (sourceApplicationInfo != null && (string = sourceApplicationInfo.toString()) != null) {
                str4 = string;
            }
            bundle.putString("fb_mobile_launch_source", str4);
            Long sessionLastEventTime2 = lVar.getSessionLastEventTime();
            if (sessionLastEventTime2 != null) {
                jLongValue2 = sessionLastEventTime2.longValue();
            }
            bundle.putLong("_logTime", jLongValue2 / ((long) 1000));
            x.INSTANCE.a(str, str2, null).c("fb_mobile_deactivate_app", jF / 1000, bundle);
        } catch (Throwable th2) {
            i2.a.b(th2, m.class);
        }
    }

    public static final int b(long timeBetweenSessions) {
        if (i2.a.d(m.class)) {
            return 0;
        }
        int i10 = 0;
        while (true) {
            try {
                long[] jArr = INACTIVE_SECONDS_QUANTA;
                if (i10 >= jArr.length || jArr[i10] >= timeBetweenSessions) {
                    break;
                }
                i10++;
            } catch (Throwable th2) {
                i2.a.b(th2, m.class);
                return 0;
            }
        }
        return i10;
    }

    public static final void c(String str, n nVar, String str2, Context context) {
        String string;
        if (i2.a.d(m.class)) {
            return;
        }
        try {
            p.j(str, "activityName");
            p.j(context, GAMConfig.KEY_CONTEXT);
            String str3 = "Unclassified";
            if (nVar != null && (string = nVar.toString()) != null) {
                str3 = string;
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", str3);
            bundle.putString("fb_mobile_pckg_fp", f75239a.a(context));
            bundle.putString("fb_mobile_app_cert_hash", m2.a.a(context));
            x.Companion companion = x.INSTANCE;
            x xVarA = companion.a(str, str2, null);
            xVarA.d("fb_mobile_activate_app", bundle);
            if (companion.c() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                xVarA.a();
            }
        } catch (Throwable th2) {
            i2.a.b(th2, m.class);
        }
    }

    public final String a(Context context) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String strS = p.s("PCKGCHKSUM;", packageManager.getPackageInfo(context.getPackageName(), 0).versionName);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(strS, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String strC = k.c(context, null);
            if (strC == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                p.i(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                strC = k.b(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(strS, strC).apply();
            return strC;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final void d() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            a0.Companion companion = a0.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = TAG;
            p.g(str);
            companion.b(loggingBehavior, str, "Clock skew detected");
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
