package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.j0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.vungle.ads.internal.ui.AdActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SessionEventsState.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0005B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J0\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0006H\u0002R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010!R\u0011\u0010$\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010#R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020%8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010&¨\u0006*"}, d2 = {"Lcom/facebook/appevents/y;", "", "Lcom/facebook/appevents/AppEvent;", "event", "Lmj/r;", "a", "", "moveToAccumulated", "b", "Lcom/facebook/GraphRequest;", AdActivity.REQUEST_KEY_EXTRA, "Landroid/content/Context;", "applicationContext", "includeImplicitEvents", "limitEventUsage", "", "e", "numSkipped", "Lorg/json/JSONArray;", "events", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/facebook/internal/b;", "Lcom/facebook/internal/b;", "attributionIdentifiers", "", "Ljava/lang/String;", "anonymousAppDeviceGUID", "", "c", "Ljava/util/List;", "accumulatedEvents", "d", "inFlightEvents", "I", "numSkippedEventsDueToFullBuffer", "()I", "accumulatedEventCount", "", "()Ljava/util/List;", "eventsToPersist", "<init>", "(Lcom/facebook/internal/b;Ljava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f14295g = y.class.getSimpleName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f14296h = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final com.facebook.internal.b attributionIdentifiers;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String anonymousAppDeviceGUID;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public List<AppEvent> accumulatedEvents;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final List<AppEvent> inFlightEvents;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int numSkippedEventsDueToFullBuffer;

    public final synchronized void a(AppEvent appEvent) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            ck.p.j(appEvent, "event");
            if (this.accumulatedEvents.size() + this.inFlightEvents.size() >= f14296h) {
                this.numSkippedEventsDueToFullBuffer++;
            } else {
                this.accumulatedEvents.add(appEvent);
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    public final synchronized void b(boolean z10) {
        if (i2.a.d(this)) {
            return;
        }
        if (z10) {
            try {
                this.accumulatedEvents.addAll(this.inFlightEvents);
            } catch (Throwable th2) {
                i2.a.b(th2, this);
                return;
            }
        }
        this.inFlightEvents.clear();
        this.numSkippedEventsDueToFullBuffer = 0;
    }

    public final synchronized int c() {
        if (i2.a.d(this)) {
            return 0;
        }
        try {
            return this.accumulatedEvents.size();
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return 0;
        }
    }

    public final synchronized List<AppEvent> d() {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            List<AppEvent> list = this.accumulatedEvents;
            this.accumulatedEvents = new ArrayList();
            return list;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public y(com.facebook.internal.b bVar, String str) {
        ck.p.j(bVar, "attributionIdentifiers");
        ck.p.j(str, "anonymousAppDeviceGUID");
        this.attributionIdentifiers = bVar;
        this.anonymousAppDeviceGUID = str;
        this.accumulatedEvents = new ArrayList();
        this.inFlightEvents = new ArrayList();
    }

    public final int e(GraphRequest request, Context applicationContext, boolean includeImplicitEvents, boolean limitEventUsage) {
        if (i2.a.d(this)) {
            return 0;
        }
        try {
            ck.p.j(request, AdActivity.REQUEST_KEY_EXTRA);
            ck.p.j(applicationContext, "applicationContext");
            synchronized (this) {
                int i10 = this.numSkippedEventsDueToFullBuffer;
                v1.a aVar = v1.a.f73012a;
                v1.a.d(this.accumulatedEvents);
                this.inFlightEvents.addAll(this.accumulatedEvents);
                this.accumulatedEvents.clear();
                JSONArray jSONArray = new JSONArray();
                for (AppEvent appEvent : this.inFlightEvents) {
                    if (appEvent.isChecksumValid()) {
                        if (includeImplicitEvents || !appEvent.isImplicit()) {
                            jSONArray.put(appEvent.getJsonObject());
                        }
                    } else {
                        j0 j0Var = j0.f14425a;
                        j0.e0(f14295g, ck.p.s("Event with invalid checksum: ", appEvent));
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                mj.r rVar = mj.r.f64562a;
                f(request, applicationContext, i10, jSONArray, limitEventUsage);
                return jSONArray.length();
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return 0;
        }
    }

    public final void f(GraphRequest graphRequest, Context context, int i10, JSONArray jSONArray, boolean z10) {
        JSONObject jSONObject;
        try {
            if (i2.a.d(this)) {
                return;
            }
            try {
                AppEventsLoggerUtility appEventsLoggerUtility = AppEventsLoggerUtility.f14244a;
                jSONObject = AppEventsLoggerUtility.a(AppEventsLoggerUtility.GraphAPIActivityType.CUSTOM_APP_EVENTS, this.attributionIdentifiers, this.anonymousAppDeviceGUID, z10, context);
                if (this.numSkippedEventsDueToFullBuffer > 0) {
                    jSONObject.put("num_skipped_events", i10);
                }
            } catch (JSONException unused) {
                jSONObject = new JSONObject();
            }
            graphRequest.E(jSONObject);
            Bundle parameters = graphRequest.getParameters();
            String string = jSONArray.toString();
            ck.p.i(string, "events.toString()");
            parameters.putString("custom_events", string);
            graphRequest.H(string);
            graphRequest.G(parameters);
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
