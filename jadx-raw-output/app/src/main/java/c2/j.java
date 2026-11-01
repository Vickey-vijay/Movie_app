package c2;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import ck.w;
import com.facebook.GraphRequest;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.appevents.x;
import com.facebook.internal.j0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: ViewOnClickListener.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB!\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u001d"}, d2 = {"Lc2/j;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lmj/r;", "onClick", "e", "", "pathID", "buttonText", "Lorg/json/JSONObject;", "viewData", "c", "b", "Landroid/view/View$OnClickListener;", "baseListener", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "rootViewWeakReference", "d", "hostViewWeakReference", "Ljava/lang/String;", "activityName", "hostView", "rootView", "<init>", "(Landroid/view/View;Landroid/view/View;Ljava/lang/String;)V", InneractiveMediationDefs.GENDER_FEMALE, "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set<Integer> f5630g = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final View.OnClickListener baseListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final WeakReference<View> rootViewWeakReference;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final WeakReference<View> hostViewWeakReference;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String activityName;

    /* JADX INFO: renamed from: c2.j$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ViewOnClickListener.kt */
    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J \u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J \u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0002R\u0014\u0010\u0014\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lc2/j$a;", "", "Landroid/view/View;", "hostView", "rootView", "", "activityName", "Lmj/r;", "d", "(Landroid/view/View;Landroid/view/View;Ljava/lang/String;)V", "pathID", "buttonText", "", InneractiveMediationDefs.GENDER_FEMALE, "predictedEvent", "", "dense", "e", "eventToPost", "h", "API_ENDPOINT", "Ljava/lang/String;", "OTHER_EVENT", "", "", "viewsAttachedListener", "Ljava/util/Set;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public static final void g(String str, String str2) {
            p.j(str, "$queriedEvent");
            p.j(str2, "$buttonText");
            j.INSTANCE.e(str, str2, new float[0]);
        }

        public final void d(View hostView, View rootView, String activityName) {
            p.j(hostView, "hostView");
            p.j(rootView, "rootView");
            p.j(activityName, "activityName");
            int iHashCode = hostView.hashCode();
            if (j.b().contains(Integer.valueOf(iHashCode))) {
                return;
            }
            u1.d dVar = u1.d.f72518a;
            u1.d.r(hostView, new j(hostView, rootView, activityName, null));
            j.b().add(Integer.valueOf(iHashCode));
        }

        public final void h(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString("event_name", str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                int length = fArr.length;
                int i10 = 0;
                while (i10 < length) {
                    float f10 = fArr[i10];
                    i10++;
                    sb2.append(f10);
                    sb2.append(StringUtils.COMMA);
                }
                jSONObject.put("dense", sb2.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                GraphRequest.Companion companion = GraphRequest.INSTANCE;
                w wVar = w.f6066a;
                String str3 = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{t.m()}, 1));
                p.i(str3, "java.lang.String.format(locale, format, *args)");
                GraphRequest graphRequestA = companion.A(null, str3, null, null);
                graphRequestA.G(bundle);
                graphRequestA.k();
            } catch (JSONException unused) {
            }
        }

        public final void e(String str, String str2, float[] fArr) {
            if (e.f(str)) {
                new x(t.l()).e(str, str2);
            } else if (e.e(str)) {
                h(str, str2, fArr);
            }
        }

        public final boolean f(String pathID, final String buttonText) {
            final String strD = b.d(pathID);
            if (strD == null) {
                return false;
            }
            if (!p.e(strD, "other")) {
                j0 j0Var = j0.f14425a;
                j0.w0(new Runnable() { // from class: c2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        j.Companion.g(strD, buttonText);
                    }
                });
                return true;
            }
            return true;
        }
    }

    public j(View view, View view2, String str) {
        this.baseListener = u1.d.g(view);
        this.rootViewWeakReference = new WeakReference<>(view2);
        this.hostViewWeakReference = new WeakReference<>(view);
        if (str == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        String lowerCase = str.toLowerCase();
        p.i(lowerCase, "(this as java.lang.String).toLowerCase()");
        this.activityName = lk.x.N(lowerCase, ActivityChooserModel.ATTRIBUTE_ACTIVITY, "", false, 4, null);
    }

    public /* synthetic */ j(View view, View view2, String str, ck.i iVar) {
        this(view, view2, str);
    }

    public static final /* synthetic */ Set b() {
        if (i2.a.d(j.class)) {
            return null;
        }
        try {
            return f5630g;
        } catch (Throwable th2) {
            i2.a.b(th2, j.class);
            return null;
        }
    }

    public static final void d(JSONObject jSONObject, String str, j jVar, String str2) {
        if (i2.a.d(j.class)) {
            return;
        }
        try {
            p.j(jSONObject, "$viewData");
            p.j(str, "$buttonText");
            p.j(jVar, "this$0");
            p.j(str2, "$pathID");
            try {
                j0 j0Var = j0.f14425a;
                String strU = j0.u(t.l());
                if (strU == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = strU.toLowerCase();
                p.i(lowerCase, "(this as java.lang.String).toLowerCase()");
                float[] fArrA = a.a(jSONObject, lowerCase);
                String strC = a.c(str, jVar.activityName, lowerCase);
                if (fArrA == null) {
                    return;
                }
                ModelManager modelManager = ModelManager.f14256a;
                String[] strArrQ = ModelManager.q(ModelManager.Task.MTML_APP_EVENT_PREDICTION, new float[][]{fArrA}, new String[]{strC});
                if (strArrQ == null) {
                    return;
                }
                String str3 = strArrQ[0];
                b.a(str2, str3);
                if (p.e(str3, "other")) {
                    return;
                }
                INSTANCE.e(str3, str, fArrA);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            i2.a.b(th2, j.class);
        }
    }

    public final void c(final String str, final String str2, final JSONObject jSONObject) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            j0 j0Var = j0.f14425a;
            j0.w0(new Runnable() { // from class: c2.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.d(jSONObject, str2, this, str);
                }
            });
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void e() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            View view = this.rootViewWeakReference.get();
            View view2 = this.hostViewWeakReference.get();
            if (view != null && view2 != null) {
                try {
                    String strD = c.d(view2);
                    String strB = b.b(view2, strD);
                    if (strB == null || INSTANCE.f(strB, strD)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, c.b(view, view2));
                    jSONObject.put("screenname", this.activityName);
                    c(strB, strD, jSONObject);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (i2.a.d(this)) {
                return;
            }
            try {
                p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                View.OnClickListener onClickListener = this.baseListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                e();
            } catch (Throwable th2) {
                i2.a.b(th2, this);
            }
        } catch (Throwable th3) {
            i2.a.b(th3, this);
        }
    }
}
