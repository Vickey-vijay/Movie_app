package c2;

import android.app.Activity;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.p;
import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.q;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: SuggestedEventsManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0002R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016¨\u0006\u001b"}, d2 = {"Lc2/e;", "", "Lmj/r;", "b", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "h", "", "event", "", InneractiveMediationDefs.GENDER_FEMALE, "(Ljava/lang/String;)Z", "e", "rawSuggestedEventSetting", "g", "(Ljava/lang/String;)V", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "", "c", "Ljava/util/Set;", "productionEvents", "eligibleEvents", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f5613a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean enabled = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Set<String> productionEvents = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Set<String> eligibleEvents = new LinkedHashSet();

    public static final synchronized void b() {
        if (i2.a.d(e.class)) {
            return;
        }
        try {
            t.t().execute(new Runnable() { // from class: c2.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.c();
                }
            });
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
        }
    }

    public static final void c() {
        if (i2.a.d(e.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = enabled;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            f5613a.d();
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
        }
    }

    public static final boolean e(String event) {
        if (i2.a.d(e.class)) {
            return false;
        }
        try {
            p.j(event, "event");
            return eligibleEvents.contains(event);
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
            return false;
        }
    }

    public static final boolean f(String event) {
        if (i2.a.d(e.class)) {
            return false;
        }
        try {
            p.j(event, "event");
            return productionEvents.contains(event);
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
            return false;
        }
    }

    public static final void h(Activity activity) {
        if (i2.a.d(e.class)) {
            return;
        }
        try {
            p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
            try {
                if (enabled.get() && a.f() && (!productionEvents.isEmpty() || !eligibleEvents.isEmpty())) {
                    g.INSTANCE.a(activity);
                } else {
                    g.INSTANCE.b(activity);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
        }
    }

    @VisibleForTesting(otherwise = 2)
    public final void g(String rawSuggestedEventSetting) {
        JSONArray jSONArray;
        int length;
        JSONArray jSONArray2;
        int length2;
        if (i2.a.d(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(rawSuggestedEventSetting);
            int i10 = 0;
            if (jSONObject.has("production_events") && (length2 = (jSONArray2 = jSONObject.getJSONArray("production_events")).length()) > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    Set<String> set = productionEvents;
                    String string = jSONArray2.getString(i11);
                    p.i(string, "jsonArray.getString(i)");
                    set.add(string);
                    if (i12 >= length2) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            }
            if (!jSONObject.has("eligible_for_prediction_events") || (length = (jSONArray = jSONObject.getJSONArray("eligible_for_prediction_events")).length()) <= 0) {
                return;
            }
            while (true) {
                int i13 = i10 + 1;
                Set<String> set2 = eligibleEvents;
                String string2 = jSONArray.getString(i10);
                p.i(string2, "jsonArray.getString(i)");
                set2.add(string2);
                if (i13 >= length) {
                    return;
                } else {
                    i10 = i13;
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final void d() {
        String suggestedEventsSetting;
        if (i2.a.d(this)) {
            return;
        }
        try {
            FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f14327a;
            q qVarN = FetchedAppSettingsManager.n(t.m(), false);
            if (qVarN == null || (suggestedEventsSetting = qVarN.getSuggestedEventsSetting()) == null) {
                return;
            }
            g(suggestedEventsSetting);
            if ((!productionEvents.isEmpty()) || (!eligibleEvents.isEmpty())) {
                ModelManager modelManager = ModelManager.f14256a;
                File fileL = ModelManager.l(ModelManager.Task.MTML_APP_EVENT_PREDICTION);
                if (fileL == null) {
                    return;
                }
                a.d(fileL);
                Activity activityL = y1.f.l();
                if (activityL != null) {
                    h(activityL);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
