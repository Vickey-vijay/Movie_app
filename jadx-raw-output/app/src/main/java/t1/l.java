package t1;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.NotificationCompat;
import ck.p;
import ck.w;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.LoggingBehavior;
import com.facebook.internal.a0;
import com.facebook.internal.j0;
import com.facebook.internal.x;
import com.ironsource.C3605n2;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;
import q1.z;

/* JADX INFO: compiled from: ViewIndexer.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\r\u0012B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u001a\u0010\t\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0002R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006 "}, d2 = {"Lt1/l;", "", "Lmj/r;", "h", "l", "Lcom/facebook/GraphRequest;", AdActivity.REQUEST_KEY_EXTRA, "", "currentDigest", "g", "tree", "j", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "uiThreadHandler", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "b", "Ljava/lang/ref/WeakReference;", "activityReference", "Ljava/util/Timer;", "c", "Ljava/util/Timer;", "indexingTimer", "d", "Ljava/lang/String;", "previousDigest", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "<init>", "(Landroid/app/Activity;)V", "e", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f72159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static l f72160g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final WeakReference<Activity> activityReference;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Timer indexingTimer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String previousDigest;

    /* JADX INFO: renamed from: t1.l$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ViewIndexer.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J0\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lt1/l$a;", "", "", "appIndex", "Lcom/facebook/AccessToken;", "accessToken", "appId", "requestType", "Lcom/facebook/GraphRequest;", "b", "APP_VERSION_PARAM", "Ljava/lang/String;", "PLATFORM_PARAM", "REQUEST_TYPE", "SUCCESS", "TAG", "TREE_PARAM", "Lt1/l;", C3605n2.f30210p, "Lt1/l;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public static final void c(z zVar) {
            p.j(zVar, "it");
            a0.INSTANCE.b(LoggingBehavior.APP_EVENTS, l.d(), "App index sent to FB!");
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final GraphRequest b(String appIndex, AccessToken accessToken, String appId, String requestType) {
            p.j(requestType, "requestType");
            if (appIndex == null) {
                return null;
            }
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            w wVar = w.f6066a;
            String str = String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{appId}, 1));
            p.i(str, "java.lang.String.format(locale, format, *args)");
            GraphRequest graphRequestA = companion.A(accessToken, str, null, null);
            Bundle parameters = graphRequestA.getParameters();
            if (parameters == null) {
                parameters = new Bundle();
            }
            parameters.putString("tree", appIndex);
            parameters.putString("app_version", y1.g.d());
            parameters.putString("platform", "android");
            parameters.putString("request_type", requestType);
            if (p.e(requestType, "app_indexing")) {
                parameters.putString("device_session_id", e.g());
            }
            graphRequestA.G(parameters);
            graphRequestA.C(new GraphRequest.b() { // from class: t1.k
                @Override // com.facebook.GraphRequest.b
                public final void b(z zVar) {
                    l.Companion.c(zVar);
                }
            });
            return graphRequestA;
        }
    }

    /* JADX INFO: compiled from: ViewIndexer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lt1/l$b;", "Ljava/util/concurrent/Callable;", "", NotificationCompat.CATEGORY_CALL, "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "b", "Ljava/lang/ref/WeakReference;", "rootView", "<init>", "(Landroid/view/View;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements Callable<String> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final WeakReference<View> rootView;

        public b(View view) {
            p.j(view, "rootView");
            this.rootView = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        public String call() {
            View view = this.rootView.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return "";
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(bitmapCreateBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            p.i(strEncodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
            return strEncodeToString;
        }
    }

    /* JADX INFO: compiled from: ViewIndexer.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"t1/l$c", "Ljava/util/TimerTask;", "Lmj/r;", "run", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class c extends TimerTask {
        public c() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) l.c(l.this).get();
                View viewE = y1.g.e(activity);
                if (activity != null && viewE != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (e.h()) {
                        if (x.b()) {
                            u1.c.a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new b(viewE));
                        l.e(l.this).post(futureTask);
                        String str = "";
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e10) {
                            Log.e(l.d(), "Failed to take screenshot.", e10);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(u1.d.d(viewE));
                            jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, jSONArray);
                        } catch (JSONException unused) {
                            Log.e(l.d(), "Failed to create JSONObject");
                        }
                        String string = jSONObject.toString();
                        p.i(string, "viewTree.toString()");
                        l.f(l.this, string);
                    }
                }
            } catch (Exception e11) {
                Log.e(l.d(), "UI Component tree indexing failure!", e11);
            }
        }
    }

    static {
        String canonicalName = l.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        f72159f = canonicalName;
    }

    public l(Activity activity) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        this.activityReference = new WeakReference<>(activity);
        this.previousDigest = null;
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        f72160g = this;
    }

    public static final /* synthetic */ WeakReference c(l lVar) {
        if (i2.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.activityReference;
        } catch (Throwable th2) {
            i2.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ String d() {
        if (i2.a.d(l.class)) {
            return null;
        }
        try {
            return f72159f;
        } catch (Throwable th2) {
            i2.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ Handler e(l lVar) {
        if (i2.a.d(l.class)) {
            return null;
        }
        try {
            return lVar.uiThreadHandler;
        } catch (Throwable th2) {
            i2.a.b(th2, l.class);
            return null;
        }
    }

    public static final /* synthetic */ void f(l lVar, String str) {
        if (i2.a.d(l.class)) {
            return;
        }
        try {
            lVar.j(str);
        } catch (Throwable th2) {
            i2.a.b(th2, l.class);
        }
    }

    public static final void i(l lVar, TimerTask timerTask) {
        if (i2.a.d(l.class)) {
            return;
        }
        try {
            p.j(lVar, "this$0");
            p.j(timerTask, "$indexingTask");
            try {
                Timer timer = lVar.indexingTimer;
                if (timer != null) {
                    timer.cancel();
                }
                lVar.previousDigest = null;
                Timer timer2 = new Timer();
                timer2.scheduleAtFixedRate(timerTask, 0L, 1000L);
                lVar.indexingTimer = timer2;
            } catch (Exception e10) {
                Log.e(f72159f, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, l.class);
        }
    }

    public static final void k(String str, l lVar) {
        if (i2.a.d(l.class)) {
            return;
        }
        try {
            p.j(str, "$tree");
            p.j(lVar, "this$0");
            String strH0 = j0.h0(str);
            AccessToken accessTokenE = AccessToken.INSTANCE.e();
            if (strH0 == null || !p.e(strH0, lVar.previousDigest)) {
                lVar.g(INSTANCE.b(str, accessTokenE, t.m(), "app_indexing"), strH0);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, l.class);
        }
    }

    public final void g(GraphRequest graphRequest, String str) {
        if (i2.a.d(this) || graphRequest == null) {
            return;
        }
        try {
            z zVarK = graphRequest.k();
            try {
                JSONObject graphObject = zVarK.getGraphObject();
                if (graphObject == null) {
                    Log.e(f72159f, p.s("Error sending UI component tree to Facebook: ", zVarK.getError()));
                    return;
                }
                if (p.e("true", graphObject.optString("success"))) {
                    a0.INSTANCE.b(LoggingBehavior.APP_EVENTS, f72159f, "Successfully send UI component tree to server");
                    this.previousDigest = str;
                }
                if (graphObject.has("is_app_indexing_enabled")) {
                    e.n(graphObject.getBoolean("is_app_indexing_enabled"));
                }
            } catch (JSONException e10) {
                Log.e(f72159f, "Error decoding server response.", e10);
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
            final c cVar = new c();
            try {
                t.t().execute(new Runnable() { // from class: t1.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.i(this.f72154b, cVar);
                    }
                });
            } catch (RejectedExecutionException e10) {
                Log.e(f72159f, "Error scheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void j(final String str) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            t.t().execute(new Runnable() { // from class: t1.j
                @Override // java.lang.Runnable
                public final void run() {
                    l.k(str, this);
                }
            });
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void l() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (this.activityReference.get() == null) {
                return;
            }
            try {
                Timer timer = this.indexingTimer;
                if (timer != null) {
                    timer.cancel();
                }
                this.indexingTimer = null;
            } catch (Exception e10) {
                Log.e(f72159f, "Error unscheduling indexing job", e10);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
