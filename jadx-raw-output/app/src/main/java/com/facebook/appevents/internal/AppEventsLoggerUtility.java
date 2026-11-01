package com.facebook.appevents.internal;

import android.content.Context;
import ck.p;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.a0;
import com.facebook.internal.b;
import com.facebook.internal.j0;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import mj.h;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: AppEventsLoggerUtility.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/internal/AppEventsLoggerUtility;", "", "Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;", "activityType", "Lcom/facebook/internal/b;", "attributionIdentifiers", "", "anonymousAppDeviceGUID", "", "limitEventUsage", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lorg/json/JSONObject;", "a", "", "b", "Ljava/util/Map;", "API_ACTIVITY_TYPE_TO_STRING", "<init>", "()V", "GraphAPIActivityType", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AppEventsLoggerUtility {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AppEventsLoggerUtility f14244a = new AppEventsLoggerUtility();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Map<GraphAPIActivityType, String> API_ACTIVITY_TYPE_TO_STRING = a.l(h.a(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), h.a(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    /* JADX INFO: compiled from: AppEventsLoggerUtility.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;", "", "(Ljava/lang/String;I)V", "MOBILE_INSTALL_EVENT", "CUSTOM_APP_EVENTS", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static GraphAPIActivityType[] valuesCustom() {
            GraphAPIActivityType[] graphAPIActivityTypeArrValuesCustom = values();
            return (GraphAPIActivityType[]) Arrays.copyOf(graphAPIActivityTypeArrValuesCustom, graphAPIActivityTypeArrValuesCustom.length);
        }
    }

    public static final JSONObject a(GraphAPIActivityType activityType, b attributionIdentifiers, String anonymousAppDeviceGUID, boolean limitEventUsage, Context context) throws JSONException {
        p.j(activityType, "activityType");
        p.j(context, GAMConfig.KEY_CONTEXT);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", API_ACTIVITY_TYPE_TO_STRING.get(activityType));
        String strE = AppEventsLogger.INSTANCE.e();
        if (strE != null) {
            jSONObject.put("app_user_id", strE);
        }
        j0.x0(jSONObject, attributionIdentifiers, anonymousAppDeviceGUID, limitEventUsage, context);
        try {
            j0.y0(jSONObject, context);
        } catch (Exception e10) {
            a0.INSTANCE.c(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e10.toString());
        }
        JSONObject jSONObjectA = j0.A();
        if (jSONObjectA != null) {
            Iterator<String> itKeys = jSONObjectA.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectA.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
