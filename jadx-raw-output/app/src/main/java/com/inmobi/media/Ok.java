package com.inmobi.media;

import com.inmobi.media.Ok;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Ok {
    /* JADX WARN: Code duplicated, block: B:56:0x012f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0142 A[LOOP:1: B:57:0x013c->B:59:0x0142, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x015b  */
    public static Pk a() throws JSONException {
        JSONArray jSONArray;
        C3136qh c3136qh = Yi.f23856a;
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(SignalsConfig.class, "clazz");
        boolean zIsEnabled = ((SignalsConfig) Y3.f23815a.a(SignalsConfig.class)).getUnifiedIdServiceConfig().isEnabled();
        if (!zIsEnabled) {
            InMobiUnifiedIdService.reset();
        }
        if (!zIsEnabled) {
            return new Pk();
        }
        if (c()) {
            return new Pk();
        }
        HashMap map = new HashMap();
        JSONObject jSONObjectA = F9.a();
        Iterator<String> itKeys = jSONObjectA != null ? jSONObjectA.keys() : null;
        if (itKeys != null) {
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("src", next);
                    jSONObject.put("envelope", jSONObjectA.get(next));
                    map.put(next, jSONObject);
                } catch (JSONException e10) {
                    lk.q.l(" Error in looping through publisher provided unif id " + e10.getMessage() + "\n                                        " + jSONObjectA.get(next) + "\n                    ", null, 1, null);
                }
            }
        }
        JSONObject jSONObjectB = F9.b();
        boolean z10 = false;
        z10 = false;
        z10 = false;
        if (jSONObjectB != null) {
            try {
                if (jSONObjectB.has("ufids")) {
                    JSONArray jSONArray2 = jSONObjectB.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    boolean z11 = false;
                    boolean z12 = false;
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            String string = jSONArray2.getJSONObject(i10).has("src") ? jSONArray2.getJSONObject(i10).getString("src") : null;
                            String string2 = jSONArray2.getJSONObject(i10).has("envelope") ? jSONArray2.getJSONObject(i10).getString("envelope") : null;
                            if (System.currentTimeMillis() > jSONArray2.getJSONObject(i10).getLong("expiry")) {
                                z11 = true;
                            } else if (string != null && string2 != null) {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("src", string);
                                jSONObject2.put("envelope", string2);
                                map.put(string, jSONObject2);
                                z12 = true;
                            }
                        } catch (JSONException e11) {
                            e = e11;
                            z10 = z12;
                            e.getMessage();
                            jSONObjectB.toString();
                            if (!map.isEmpty()) {
                                return new Pk();
                            }
                            jSONArray = new JSONArray();
                            for (Object obj : map.values()) {
                                ck.p.i(obj, "next(...)");
                                jSONArray.put((JSONObject) obj);
                            }
                            return new Pk(jSONArray.toString(), z10);
                        }
                    }
                    if (z11) {
                        nk.j.d(A9.f22351c, null, null, new Nk(null), 3, null);
                    }
                    z10 = z12;
                }
            } catch (JSONException e12) {
                e = e12;
            }
        }
        if (!map.isEmpty()) {
            return new Pk();
        }
        jSONArray = new JSONArray();
        while (r1.hasNext()) {
            ck.p.i(obj, "next(...)");
            jSONArray.put((JSONObject) obj);
        }
        return new Pk(jSONArray.toString(), z10);
    }

    public static boolean b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return true;
        }
        try {
            JSONArray jSONArray = jSONObject.has("ufids") ? jSONObject.getJSONArray("ufids") : null;
            return jSONArray == null || jSONArray.length() == 0;
        } catch (JSONException unused) {
        }
    }

    public static boolean c(JSONObject jSONObject) {
        boolean z10;
        ck.p.j(jSONObject, "ufids");
        try {
            if (jSONObject.has("ufids")) {
                JSONArray jSONArray = jSONObject.getJSONArray("ufids");
                int length = jSONArray.length();
                z10 = true;
                for (int i10 = 0; i10 < length; i10++) {
                    try {
                        z10 &= System.currentTimeMillis() <= jSONArray.getJSONObject(i10).getLong("expiry");
                    } catch (JSONException unused) {
                        Objects.toString(jSONObject);
                        return !z10;
                    }
                }
            } else {
                z10 = true;
            }
        } catch (JSONException unused2) {
            z10 = true;
        }
        return !z10;
    }

    public static final void b(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, JSONObject jSONObject, Error error) {
        if (inMobiUnifiedIdInterface != null) {
            inMobiUnifiedIdInterface.onFetchCompleted(jSONObject, error);
        }
    }

    public static JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObjectB = F9.b();
        if (jSONObjectB != null) {
            try {
                if (jSONObjectB.has("ufids")) {
                    JSONArray jSONArray2 = jSONObjectB.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string = jSONArray2.getJSONObject(i10).has("src") ? jSONArray2.getJSONObject(i10).getString("src") : null;
                        String string2 = jSONArray2.getJSONObject(i10).has(InAppPurchaseMetaData.KEY_SIGNATURE) ? jSONArray2.getJSONObject(i10).getString(InAppPurchaseMetaData.KEY_SIGNATURE) : null;
                        boolean z10 = System.currentTimeMillis() > jSONArray2.getJSONObject(i10).getLong("expiry");
                        if (string != null && string2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("src", string);
                            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, string2);
                            jSONObject.put("expired", z10);
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (JSONException e10) {
                e10.getMessage();
                jSONObjectB.toString();
            }
        }
        return jSONArray;
    }

    public static boolean c() {
        C3194t1 c3194t1 = AbstractC3363zk.f25867a;
        Boolean bool = c3194t1 != null ? c3194t1.f25367c : null;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        if (zBooleanValue) {
            InMobiUnifiedIdService.reset();
        }
        return zBooleanValue;
    }

    public static void a(final InMobiUnifiedIdInterface inMobiUnifiedIdInterface, final JSONObject jSONObject, final Error error) {
        short s10;
        String message = error != null ? error.getMessage() : null;
        if (ck.p.e(message, InMobiUnifiedIdInterface.NETWORK_FAILURE_AND_NO_LOCAL_DATA_PRESENT)) {
            s10 = 93;
        } else {
            s10 = ck.p.e(message, InMobiUnifiedIdInterface.NO_LOCAL_DATA_PRESENT) ? (short) 94 : (short) -1;
        }
        if (s10 >= 0) {
            Map mapO = kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10)));
            Wj wj2 = Wj.f23753a;
            Wj.b("FetchCallbackFailure", mapO, EnumC2735ak.SDK);
        }
        Oj.a(new Runnable() { // from class: b7.u3
            @Override // java.lang.Runnable
            public final void run() {
                Ok.b(inMobiUnifiedIdInterface, jSONObject, error);
            }
        });
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject != null) {
            try {
                if (jSONObject.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i10);
                        if (System.currentTimeMillis() < jSONObject3.getLong("expiry")) {
                            jSONArray.put(jSONObject3);
                        }
                    }
                }
            } catch (JSONException e10) {
                e10.getMessage();
                return null;
            }
        }
        if (jSONArray.length() <= 0) {
            return null;
        }
        jSONObject2.put("ufids", jSONArray);
        return jSONObject2;
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        HashMap map = new HashMap();
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObject2 != null) {
            try {
                if (jSONObject2.has("ufids")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("ufids");
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        map.put(jSONArray2.getJSONObject(i10).getString("src"), jSONArray2.getJSONObject(i10));
                    }
                }
            } catch (JSONException e10) {
                e10.getMessage();
                Objects.toString(jSONObject2);
                Objects.toString(jSONObject);
                return jSONObject3;
            }
        }
        if (jSONObject != null && jSONObject.has("ufids")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("ufids");
            int length2 = jSONArray3.length();
            for (int i11 = 0; i11 < length2; i11++) {
                map.put(jSONArray3.getJSONObject(i11).getString("src"), jSONArray3.getJSONObject(i11));
            }
        }
        Collection collectionValues = map.values();
        ck.p.i(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            jSONArray.put((JSONObject) it.next());
        }
        jSONObject3.put("ufids", jSONArray);
        return jSONObject3;
    }
}
