package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.facebook.GraphRequest;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import e2.GateKeeper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FetchedAppGateKeepersManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001-B\t\b\u0002¢\u0006\u0004\b+\u0010,J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\"\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\bH\u0007J!\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0004J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0015\u001a\u00020\u0004H\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0019\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R \u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010)¨\u0006."}, d2 = {"Lcom/facebook/internal/p;", "", "Lcom/facebook/internal/p$a;", "callback", "Lmj/r;", "h", "", "applicationId", "", "forceRequery", "Lorg/json/JSONObject;", InneractiveMediationDefs.GENDER_MALE, "name", "defaultValue", "d", "gateKeepersJSON", "j", "(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "g", "", "e", CampaignEx.JSON_KEY_AD_K, "c", "", "timestamp", InneractiveMediationDefs.GENDER_FEMALE, "(Ljava/lang/Long;)Z", "b", "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLoading", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "callbacks", "", "Ljava/util/Map;", "fetchedAppGateKeepers", "Ljava/lang/Long;", "Le2/b;", "Le2/b;", "gateKeeperRuntimeCache", "<init>", "()V", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f14475a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = ck.s.b(p.class).i();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean isLoading = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final ConcurrentLinkedQueue<a> callbacks = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Map<String, JSONObject> fetchedAppGateKeepers = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static Long timestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static e2.b gateKeeperRuntimeCache;

    /* JADX INFO: compiled from: FetchedAppGateKeepersManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/facebook/internal/p$a;", "", "Lmj/r;", "onCompleted", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface a {
        void onCompleted();
    }

    public final boolean f(Long timestamp2) {
        return timestamp2 != null && System.currentTimeMillis() - timestamp2.longValue() < 3600000;
    }

    public final void g() {
        h(null);
    }

    public static final boolean d(String name, String applicationId, boolean defaultValue) {
        Boolean bool;
        ck.p.j(name, "name");
        Map<String, Boolean> mapE = f14475a.e(applicationId);
        return (mapE.containsKey(name) && (bool = mapE.get(name)) != null) ? bool.booleanValue() : defaultValue;
    }

    public static final synchronized void h(a aVar) {
        if (aVar != null) {
            try {
                callbacks.add(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        final String strM = q1.t.m();
        p pVar = f14475a;
        if (pVar.f(timestamp) && fetchedAppGateKeepers.containsKey(strM)) {
            pVar.k();
            return;
        }
        final Context contextL = q1.t.l();
        ck.w wVar = ck.w.f6066a;
        final String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{strM}, 1));
        ck.p.i(str, "java.lang.String.format(format, *args)");
        if (contextL == null) {
            return;
        }
        JSONObject jSONObject = null;
        String string = contextL.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str, null);
        if (!j0.X(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e10) {
                j0.d0("FacebookSDK", e10);
            }
            if (jSONObject != null) {
                j(strM, jSONObject);
            }
        }
        Executor executorT = q1.t.t();
        if (executorT == null) {
            return;
        }
        if (isLoading.compareAndSet(false, true)) {
            executorT.execute(new Runnable() { // from class: com.facebook.internal.n
                @Override // java.lang.Runnable
                public final void run() {
                    p.i(strM, contextL, str);
                }
            });
        }
    }

    public static final void i(String str, Context context, String str2) {
        ck.p.j(str, "$applicationId");
        ck.p.j(context, "$context");
        ck.p.j(str2, "$gateKeepersKey");
        p pVar = f14475a;
        JSONObject jSONObjectC = pVar.c(str);
        if (jSONObjectC.length() != 0) {
            j(str, jSONObjectC);
            context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str2, jSONObjectC.toString()).apply();
            timestamp = Long.valueOf(System.currentTimeMillis());
        }
        pVar.k();
        isLoading.set(false);
    }

    @VisibleForTesting(otherwise = 2)
    public static final synchronized JSONObject j(String applicationId, JSONObject gateKeepersJSON) {
        JSONObject jSONObject;
        JSONArray jSONArrayOptJSONArray;
        ck.p.j(applicationId, "applicationId");
        jSONObject = fetchedAppGateKeepers.get(applicationId);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        int i10 = 0;
        JSONObject jSONObjectOptJSONObject = null;
        if (gateKeepersJSON != null && (jSONArrayOptJSONArray = gateKeepersJSON.optJSONArray("data")) != null) {
            jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0);
        }
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = new JSONArray();
        }
        int length = jSONArrayOptJSONArray2.length();
        if (length > 0) {
            while (true) {
                int i11 = i10 + 1;
                try {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i10);
                    jSONObject.put(jSONObject2.getString(C3426d4.i.W), jSONObject2.getBoolean("value"));
                } catch (JSONException e10) {
                    j0.d0("FacebookSDK", e10);
                }
                if (i11 >= length) {
                    break;
                }
                i10 = i11;
            }
        }
        fetchedAppGateKeepers.put(applicationId, jSONObject);
        return jSONObject;
    }

    public static final JSONObject m(String applicationId, boolean forceRequery) {
        ck.p.j(applicationId, "applicationId");
        if (!forceRequery) {
            Map<String, JSONObject> map = fetchedAppGateKeepers;
            if (map.containsKey(applicationId)) {
                JSONObject jSONObject = map.get(applicationId);
                return jSONObject == null ? new JSONObject() : jSONObject;
            }
        }
        JSONObject jSONObjectC = f14475a.c(applicationId);
        Context contextL = q1.t.l();
        ck.w wVar = ck.w.f6066a;
        String str = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", Arrays.copyOf(new Object[]{applicationId}, 1));
        ck.p.i(str, "java.lang.String.format(format, *args)");
        contextL.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(str, jSONObjectC.toString()).apply();
        return j(applicationId, jSONObjectC);
    }

    public final JSONObject c(String applicationId) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", q1.t.B());
        bundle.putString("fields", "gatekeepers");
        GraphRequest.Companion companion = GraphRequest.INSTANCE;
        ck.w wVar = ck.w.f6066a;
        String str = String.format("app/%s", Arrays.copyOf(new Object[]{"mobile_sdk_gk"}, 1));
        ck.p.i(str, "java.lang.String.format(format, *args)");
        GraphRequest graphRequestX = companion.x(null, str, null);
        graphRequestX.G(bundle);
        JSONObject jsonObject = graphRequestX.k().getJsonObject();
        return jsonObject == null ? new JSONObject() : jsonObject;
    }

    public final void k() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<a> concurrentLinkedQueue = callbacks;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            final a aVarPoll = concurrentLinkedQueue.poll();
            if (aVarPoll != null) {
                handler.post(new Runnable() { // from class: com.facebook.internal.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.l(aVarPoll);
                    }
                });
            }
        }
    }

    public static final void l(a aVar) {
        aVar.onCompleted();
    }

    public final Map<String, Boolean> e(String applicationId) {
        List<GateKeeper> listA;
        g();
        if (applicationId != null) {
            Map<String, JSONObject> map = fetchedAppGateKeepers;
            if (map.containsKey(applicationId)) {
                e2.b bVar = gateKeeperRuntimeCache;
                if (bVar == null) {
                    listA = null;
                } else {
                    listA = bVar.a(applicationId);
                }
                if (listA != null) {
                    HashMap map2 = new HashMap();
                    for (GateKeeper gateKeeper : listA) {
                        map2.put(gateKeeper.getName(), Boolean.valueOf(gateKeeper.getValue()));
                    }
                    return map2;
                }
                HashMap map3 = new HashMap();
                JSONObject jSONObject = map.get(applicationId);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    ck.p.i(next, C3426d4.i.W);
                    map3.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                e2.b bVar2 = gateKeeperRuntimeCache;
                if (bVar2 == null) {
                    bVar2 = new e2.b();
                }
                ArrayList arrayList = new ArrayList(map3.size());
                for (Map.Entry entry : map3.entrySet()) {
                    arrayList.add(new GateKeeper((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                bVar2.b(applicationId, arrayList);
                gateKeeperRuntimeCache = bVar2;
                return map3;
            }
        }
        return new HashMap();
    }
}
