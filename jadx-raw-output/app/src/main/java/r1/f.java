package r1;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.i;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.unified.UnifiedMediationParams;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.text.Regex;
import lk.a0;
import lk.x;
import y1.g;

/* JADX INFO: compiled from: MetadataViewObserver.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\"B\u0011\b\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b \u0010!J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lr1/f;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Landroid/view/View;", "oldView", "newView", "Lmj/r;", "onGlobalFocusChanged", "h", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "d", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/Runnable;", "runnable", "g", "", "", "b", "Ljava/util/Set;", "processedText", "Landroid/os/Handler;", "c", "Landroid/os/Handler;", "uiThreadHandler", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "Ljava/util/concurrent/atomic/AtomicBoolean;", "e", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracking", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "<init>", "(Landroid/app/Activity;)V", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class f implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map<Integer, f> f66651g = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Set<String> processedText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final WeakReference<Activity> activityWeakReference;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final AtomicBoolean isTracking;

    /* JADX INFO: renamed from: r1.f$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MetadataViewObserver.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J,\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lr1/f$a;", "", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lmj/r;", "e", "", C3426d4.i.W, "value", "c", "", "userData", "d", "", "MAX_TEXT_LENGTH", "I", "Lr1/f;", "observers", "Ljava/util/Map;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final String c(String key, String value) {
            return p.e(UnifiedMediationParams.KEY_R2, key) ? new Regex("[^\\d.]").replace(value, "") : value;
        }

        @UiThread
        public final void e(Activity activity) {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            int iHashCode = activity.hashCode();
            Map mapB = f.b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object fVar = mapB.get(numValueOf);
            if (fVar == null) {
                fVar = new f(activity, null);
                mapB.put(numValueOf, fVar);
            }
            f.c((f) fVar);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:21:0x004e  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void d(Map<String, String> map, String str, String str2) {
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        if (!x.R(str2, InneractiveMediationDefs.GENDER_MALE, false, 2, null) && !x.R(str2, "b", false, 2, null) && !x.R(str2, "ge", false, 2, null)) {
                            str2 = InneractiveMediationDefs.GENDER_FEMALE;
                        } else {
                            str2 = InneractiveMediationDefs.GENDER_MALE;
                        }
                    }
                    map.put(str, str2);
                    return;
                case 3586:
                    if (str.equals("r4")) {
                        str2 = new Regex("[^a-z]+").replace(str2, "");
                    }
                    map.put(str, str2);
                    return;
                case 3587:
                    if (str.equals("r5")) {
                        str2 = new Regex("[^a-z]+").replace(str2, "");
                    }
                    map.put(str, str2);
                    return;
                case 3588:
                    if (str.equals("r6") && a0.X(str2, "-", false, 2, null)) {
                        Object[] array = new Regex("-").split(str2, 0).toArray(new String[0]);
                        if (array != null) {
                            str2 = ((String[]) array)[0];
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                    map.put(str, str2);
                    return;
                default:
                    map.put(str, str2);
                    return;
            }
        }
    }

    public f(Activity activity) {
        this.processedText = new LinkedHashSet();
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.activityWeakReference = new WeakReference<>(activity);
        this.isTracking = new AtomicBoolean(false);
    }

    public /* synthetic */ f(Activity activity, i iVar) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (i2.a.d(f.class)) {
            return null;
        }
        try {
            return f66651g;
        } catch (Throwable th2) {
            i2.a.b(th2, f.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(f fVar) {
        if (i2.a.d(f.class)) {
            return;
        }
        try {
            fVar.h();
        } catch (Throwable th2) {
            i2.a.b(th2, f.class);
        }
    }

    public static final void e(View view, f fVar) {
        if (i2.a.d(f.class)) {
            return;
        }
        try {
            p.j(view, "$view");
            p.j(fVar, "this$0");
            if (view instanceof EditText) {
                fVar.f(view);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, f.class);
        }
    }

    public final void d(final View view) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            g(new Runnable() { // from class: r1.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.e(view, this);
                }
            });
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void f(View view) {
        boolean z10;
        boolean z11;
        if (i2.a.d(this)) {
            return;
        }
        try {
            String string = ((EditText) view).getText().toString();
            if (string != null) {
                String string2 = a0.k1(string).toString();
                if (string2 != null) {
                    String lowerCase = string2.toLowerCase();
                    p.i(lowerCase, "(this as java.lang.String).toLowerCase()");
                    if (lowerCase.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && !this.processedText.contains(lowerCase) && lowerCase.length() <= 100) {
                        this.processedText.add(lowerCase);
                        HashMap map = new HashMap();
                        List<String> listB = c.b(view);
                        List<String> listA = null;
                        for (d dVar : d.INSTANCE.c()) {
                            Companion companion = INSTANCE;
                            String strC = companion.c(dVar.c(), lowerCase);
                            if (dVar.d().length() > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                c cVar = c.f66642a;
                                if (!c.f(strC, dVar.d())) {
                                }
                            }
                            c cVar2 = c.f66642a;
                            if (c.e(listB, dVar.b())) {
                                companion.d(map, dVar.c(), strC);
                            } else {
                                if (listA == null) {
                                    listA = c.a(view);
                                }
                                if (c.e(listA, dVar.b())) {
                                    companion.d(map, dVar.c(), strC);
                                }
                            }
                        }
                        com.facebook.appevents.x.INSTANCE.e(map);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void g(Runnable runnable) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
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
            if (this.isTracking.getAndSet(true)) {
                return;
            }
            g gVar = g.f75214a;
            View viewE = g.e(this.activityWeakReference.get());
            if (viewE == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = viewE.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (i2.a.d(this)) {
            return;
        }
        if (view != null) {
            try {
                d(view);
            } catch (Throwable th2) {
                i2.a.b(th2, this);
                return;
            }
        }
        if (view2 != null) {
            d(view2);
        }
    }
}
