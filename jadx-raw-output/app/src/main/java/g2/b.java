package g2;

import android.app.ActivityManager;
import android.os.Looper;
import android.os.Process;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import com.facebook.internal.instrument.InstrumentData;
import f2.j;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import q1.t;

/* JADX INFO: compiled from: ANRDetector.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lg2/b;", "", "Landroid/app/ActivityManager;", "am", "Lmj/r;", "c", "d", "", "b", "I", "myUid", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutorService", "", "Ljava/lang/String;", "previousStackTrace", "Ljava/lang/Runnable;", "e", "Ljava/lang/Runnable;", "anrDetectorRunnable", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f53013a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final int myUid = Process.myUid();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static String previousStackTrace = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Runnable anrDetectorRunnable = new Runnable() { // from class: g2.a
        @Override // java.lang.Runnable
        public final void run() {
            b.b();
        }
    };

    public static final void b() {
        if (i2.a.d(b.class)) {
            return;
        }
        try {
            Object systemService = t.l().getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            c((ActivityManager) systemService);
        } catch (Exception unused) {
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
        }
    }

    @VisibleForTesting
    public static final void c(ActivityManager activityManager) {
        if (i2.a.d(b.class) || activityManager == null) {
            return;
        }
        try {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState == null) {
                return;
            }
            for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                if (processErrorStateInfo.condition == 2 && processErrorStateInfo.uid == myUid) {
                    Thread thread = Looper.getMainLooper().getThread();
                    p.i(thread, "getMainLooper().thread");
                    String strG = j.g(thread);
                    if (!p.e(strG, previousStackTrace) && j.k(thread)) {
                        previousStackTrace = strG;
                        InstrumentData.a aVar = InstrumentData.a.f14416a;
                        InstrumentData.a.a(processErrorStateInfo.shortMsg, strG).g();
                    }
                }
            }
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
        }
    }

    @VisibleForTesting
    public static final void d() {
        if (i2.a.d(b.class)) {
            return;
        }
        try {
            scheduledExecutorService.scheduleAtFixedRate(anrDetectorRunnable, 0L, 500, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
        }
    }
}
