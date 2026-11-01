package a2;

import android.os.Bundle;
import ck.p;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.j0;
import com.facebook.internal.q;
import java.util.List;
import kotlin.Metadata;
import nj.b0;
import org.json.JSONArray;

/* JADX INFO: compiled from: RemoteServiceParametersHelper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u001c\u0010\u0011\u001a\n \u000f*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0014"}, d2 = {"La2/d;", "", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "eventType", "", "applicationId", "", "Lcom/facebook/appevents/AppEvent;", "appEvents", "Landroid/os/Bundle;", "a", "Lorg/json/JSONArray;", "b", "", "c", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f3433a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = RemoteServiceWrapper.class.getSimpleName();

    public static final Bundle a(RemoteServiceWrapper.EventType eventType, String applicationId, List<AppEvent> appEvents) {
        if (i2.a.d(d.class)) {
            return null;
        }
        try {
            p.j(eventType, "eventType");
            p.j(applicationId, "applicationId");
            p.j(appEvents, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.getEventType());
            bundle.putString("app_id", applicationId);
            if (RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS == eventType) {
                JSONArray jSONArrayB = f3433a.b(appEvents, applicationId);
                if (jSONArrayB.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", jSONArrayB.toString());
            }
            return bundle;
        } catch (Throwable th2) {
            i2.a.b(th2, d.class);
            return null;
        }
    }

    public final JSONArray b(List<AppEvent> appEvents, String applicationId) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<AppEvent> listR0 = b0.R0(appEvents);
            v1.a.d(listR0);
            boolean zC = c(applicationId);
            for (AppEvent appEvent : listR0) {
                if (appEvent.isChecksumValid()) {
                    if ((!appEvent.isImplicit()) || (appEvent.isImplicit() && zC)) {
                        jSONArray.put(appEvent.getJsonObject());
                    }
                } else {
                    j0 j0Var = j0.f14425a;
                    j0.e0(TAG, p.s("Event with invalid checksum: ", appEvent));
                }
            }
            return jSONArray;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final boolean c(String applicationId) {
        if (i2.a.d(this)) {
            return false;
        }
        try {
            q qVarN = FetchedAppSettingsManager.n(applicationId, false);
            if (qVarN == null) {
                return false;
            }
            return qVarN.getSupportsImplicitLogging();
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }
}
