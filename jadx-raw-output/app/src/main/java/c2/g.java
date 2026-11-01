package c2;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: ViewObserver.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lc2/g;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Lmj/r;", "onGlobalLayout", "g", "h", "e", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "b", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "uiThreadHandler", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracking", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "<init>", "(Landroid/app/Activity;)V", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map<Integer, g> f5619f = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final WeakReference<Activity> activityWeakReference;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final AtomicBoolean isTracking;

    /* JADX INFO: renamed from: c2.g$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ViewObserver.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lc2/g$a;", "", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lmj/r;", "a", "b", "", "MAX_TEXT_LENGTH", "I", "", "Lc2/g;", "observers", "Ljava/util/Map;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final void a(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            int iHashCode = activity.hashCode();
            Map mapB = g.b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object gVar = mapB.get(numValueOf);
            if (gVar == null) {
                gVar = new g(activity, null);
                mapB.put(numValueOf, gVar);
            }
            g.c((g) gVar);
        }

        public final void b(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            g gVar = (g) g.b().remove(Integer.valueOf(activity.hashCode()));
            if (gVar == null) {
                return;
            }
            g.d(gVar);
        }
    }

    public g(Activity activity) {
        this.activityWeakReference = new WeakReference<>(activity);
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.isTracking = new AtomicBoolean(false);
    }

    public /* synthetic */ g(Activity activity, ck.i iVar) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (i2.a.d(g.class)) {
            return null;
        }
        try {
            return f5619f;
        } catch (Throwable th2) {
            i2.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(g gVar) {
        if (i2.a.d(g.class)) {
            return;
        }
        try {
            gVar.g();
        } catch (Throwable th2) {
            i2.a.b(th2, g.class);
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (i2.a.d(g.class)) {
            return;
        }
        try {
            gVar.h();
        } catch (Throwable th2) {
            i2.a.b(th2, g.class);
        }
    }

    public static final void f(g gVar) {
        if (i2.a.d(g.class)) {
            return;
        }
        try {
            p.j(gVar, "this$0");
            try {
                y1.g gVar2 = y1.g.f75214a;
                View viewE = y1.g.e(gVar.activityWeakReference.get());
                Activity activity = gVar.activityWeakReference.get();
                if (viewE != null && activity != null) {
                    for (View view : c.a(viewE)) {
                        if (!u1.b.g(view)) {
                            String strD = c.d(view);
                            if ((strD.length() > 0) && strD.length() <= 300) {
                                j.Companion companion = j.INSTANCE;
                                String localClassName = activity.getLocalClassName();
                                p.i(localClassName, "activity.localClassName");
                                companion.d(view, viewE, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            i2.a.b(th2, g.class);
        }
    }

    public final void e() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: c2.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.f(this.f5617b);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void g() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (this.isTracking.getAndSet(true)) {
                return;
            }
            y1.g gVar = y1.g.f75214a;
            View viewE = y1.g.e(this.activityWeakReference.get());
            if (viewE == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewE.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this);
                e();
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void h() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (!this.isTracking.getAndSet(false)) {
                return;
            }
            y1.g gVar = y1.g.f75214a;
            View viewE = y1.g.e(this.activityWeakReference.get());
            if (viewE == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewE.getViewTreeObserver();
            if (!viewTreeObserver.isAlive()) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            e();
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
