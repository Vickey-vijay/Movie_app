package w1;

import android.content.SharedPreferences;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.media.core.config.models.TelemetryConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import lk.a0;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: InAppPurchaseLoggerManager.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u000fJ2\u0010\t\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J/\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00062\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006H\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\bH\u0002J\u001c\u0010\u0013\u001a\u00020\b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006H\u0002R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001e"}, d2 = {"Lw1/j;", "", "", "", "Lorg/json/JSONObject;", "purchaseDetailsMap", "", "skuDetailsMap", "Lmj/r;", "e", "", "d", "a", "(Ljava/util/Map;)Ljava/util/Map;", "b", "()V", "c", "(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;", "g", InneractiveMediationDefs.GENDER_FEMALE, "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "sharedPreferences", "", "Ljava/util/Set;", "cachedPurchaseSet", "", "Ljava/util/Map;", "cachedPurchaseMap", "<init>", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f73313a = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Set<String> cachedPurchaseSet = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Map<String, Long> cachedPurchaseMap = new ConcurrentHashMap();

    public static final boolean d() {
        if (i2.a.d(j.class)) {
            return false;
        }
        try {
            f73313a.g();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 == null) {
                p.B("sharedPreferences");
                throw null;
            }
            long j10 = sharedPreferences2.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j10 != 0 && jCurrentTimeMillis - j10 < 86400) {
                return false;
            }
            SharedPreferences sharedPreferences3 = sharedPreferences;
            if (sharedPreferences3 != null) {
                sharedPreferences3.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", jCurrentTimeMillis).apply();
                return true;
            }
            p.B("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            i2.a.b(th2, j.class);
            return false;
        }
    }

    public static final void e(Map<String, JSONObject> map, Map<String, ? extends JSONObject> map2) {
        if (i2.a.d(j.class)) {
            return;
        }
        try {
            p.j(map, "purchaseDetailsMap");
            p.j(map2, "skuDetailsMap");
            j jVar = f73313a;
            jVar.g();
            jVar.f(jVar.c(jVar.a(map), map2));
        } catch (Throwable th2) {
            i2.a.b(th2, j.class);
        }
    }

    @VisibleForTesting(otherwise = 2)
    public final Map<String, JSONObject> a(Map<String, JSONObject> purchaseDetailsMap) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            p.j(purchaseDetailsMap, "purchaseDetailsMap");
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : kotlin.collections.a.x(purchaseDetailsMap).entrySet()) {
                String str = (String) entry.getKey();
                JSONObject jSONObject = (JSONObject) entry.getValue();
                try {
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (cachedPurchaseMap.containsKey(string)) {
                            purchaseDetailsMap.remove(str);
                        } else {
                            Set<String> set = cachedPurchaseSet;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((Object) string);
                            sb2.append(';');
                            sb2.append(jCurrentTimeMillis);
                            set.add(sb2.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 != null) {
                sharedPreferences2.edit().putStringSet("PURCHASE_DETAILS_SET", cachedPurchaseSet).apply();
                return new HashMap(purchaseDetailsMap);
            }
            p.B("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    @VisibleForTesting(otherwise = 2)
    public final void b() {
        if (i2.a.d(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences2 = sharedPreferences;
            if (sharedPreferences2 == null) {
                p.B("sharedPreferences");
                throw null;
            }
            long j10 = sharedPreferences2.getLong("LAST_CLEARED_TIME", 0L);
            if (j10 == 0) {
                SharedPreferences sharedPreferences3 = sharedPreferences;
                if (sharedPreferences3 != null) {
                    sharedPreferences3.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                    return;
                } else {
                    p.B("sharedPreferences");
                    throw null;
                }
            }
            if (jCurrentTimeMillis - j10 > TelemetryConfig.DEFAULT_EVENT_TTL_SEC) {
                for (Map.Entry entry : kotlin.collections.a.x(cachedPurchaseMap).entrySet()) {
                    String str = (String) entry.getKey();
                    long jLongValue = ((Number) entry.getValue()).longValue();
                    if (jCurrentTimeMillis - jLongValue > 86400) {
                        cachedPurchaseSet.remove(str + ';' + jLongValue);
                        cachedPurchaseMap.remove(str);
                    }
                }
                SharedPreferences sharedPreferences4 = sharedPreferences;
                if (sharedPreferences4 == null) {
                    p.B("sharedPreferences");
                    throw null;
                }
                sharedPreferences4.edit().putStringSet("PURCHASE_DETAILS_SET", cachedPurchaseSet).putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            }
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }

    @VisibleForTesting(otherwise = 2)
    public final Map<String, String> c(Map<String, ? extends JSONObject> purchaseDetailsMap, Map<String, ? extends JSONObject> skuDetailsMap) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            p.j(purchaseDetailsMap, "purchaseDetailsMap");
            p.j(skuDetailsMap, "skuDetailsMap");
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends JSONObject> entry : purchaseDetailsMap.entrySet()) {
                String key = entry.getKey();
                JSONObject value = entry.getValue();
                JSONObject jSONObject = skuDetailsMap.get(key);
                if (value != null && value.has("purchaseTime")) {
                    try {
                        if (jCurrentTimeMillis - (value.getLong("purchaseTime") / 1000) <= 86400 && jSONObject != null) {
                            String string = value.toString();
                            p.i(string, "purchaseDetail.toString()");
                            String string2 = jSONObject.toString();
                            p.i(string2, "skuDetail.toString()");
                            linkedHashMap.put(string, string2);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final void f(Map<String, String> map) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    y1.h.f(key, value, false);
                }
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
            SharedPreferences sharedPreferences2 = t.l().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences3 = t.l().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences2.contains("LAST_CLEARED_TIME")) {
                sharedPreferences2.edit().clear().apply();
                sharedPreferences3.edit().clear().apply();
            }
            SharedPreferences sharedPreferences4 = t.l().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            p.i(sharedPreferences4, "getApplicationContext().getSharedPreferences(PRODUCT_DETAILS_STORE, Context.MODE_PRIVATE)");
            sharedPreferences = sharedPreferences4;
            Set<String> set = cachedPurchaseSet;
            if (sharedPreferences4 != null) {
                Set<String> stringSet = sharedPreferences4.getStringSet("PURCHASE_DETAILS_SET", new HashSet());
                if (stringSet == null) {
                    stringSet = new HashSet<>();
                }
                set.addAll(stringSet);
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    List listN0 = a0.N0(it.next(), new String[]{";"}, false, 2, 2, null);
                    cachedPurchaseMap.put((String) listN0.get(0), Long.valueOf(Long.parseLong((String) listN0.get(1))));
                }
                b();
                return;
            }
            p.B("sharedPreferences");
            throw null;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
