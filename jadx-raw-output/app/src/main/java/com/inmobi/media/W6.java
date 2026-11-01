package com.inmobi.media;

import android.content.SharedPreferences;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.sdk.InMobiSdk;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class W6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static JSONObject f23727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static JSONObject f23728b;

    public static final void a(JSONObject jSONObject) {
        ck.p.i("W6", "TAG");
        JSONObject jSONObject2 = f23727a;
        Objects.toString(jSONObject);
        Objects.toString(jSONObject2);
        if (jSONObject != null) {
            f23727a = jSONObject;
        }
    }

    public static final JSONObject b() {
        String string;
        int i10;
        JSONObject jSONObject;
        String string2;
        String string3;
        ck.p.i("W6", "TAG");
        SharedPreferences sharedPreferencesA = Ri.a();
        if (sharedPreferencesA != null) {
            try {
                ck.p.i("W6", "TAG");
                string = sharedPreferencesA.getString("IABTCF_TCString", null);
                try {
                    i10 = sharedPreferencesA.getInt("IABTCF_gdprApplies", -1);
                } catch (Exception unused) {
                    i10 = -1;
                }
            } catch (Exception unused2) {
                string = null;
            }
            if (string != null) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_IAB, string);
                    if (i10 != -1) {
                        jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, String.valueOf(i10));
                    }
                } catch (JSONException unused3) {
                    jSONObject = null;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject == null) {
                try {
                    ck.p.i("W6", "TAG");
                    string2 = sharedPreferencesA.getString(io.bidmachine.z3.IAB_CONSENT_STRING, null);
                    try {
                        string3 = sharedPreferencesA.getString(io.bidmachine.z3.IAB_SUBJECT_TO_GDPR, null);
                    } catch (Exception unused4) {
                        string3 = null;
                    }
                } catch (Exception unused5) {
                    string2 = null;
                }
                if (string2 != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(InMobiSdk.IM_GDPR_CONSENT_IAB, string2);
                        if (string3 != null) {
                            jSONObject2.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, string3);
                        }
                        jSONObject = jSONObject2;
                    } catch (JSONException unused6) {
                        jSONObject = null;
                    }
                } else {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                return jSONObject;
            }
        }
        JSONObject jSONObject3 = f23728b;
        if (jSONObject3 == null) {
            return f23727a;
        }
        if (f23727a != null) {
            jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = f23728b;
            Iterator<String> itKeys = jSONObject4 != null ? jSONObject4.keys() : null;
            if (itKeys != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        JSONObject jSONObject5 = f23728b;
                        jSONObject3.put(next, jSONObject5 != null ? jSONObject5.opt(next) : null);
                    } catch (JSONException unused7) {
                    }
                }
            }
            JSONObject jSONObject6 = f23727a;
            Iterator<String> itKeys2 = jSONObject6 != null ? jSONObject6.keys() : null;
            if (itKeys2 != null) {
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    try {
                        JSONObject jSONObject7 = f23727a;
                        jSONObject3.put(next2, jSONObject7 != null ? jSONObject7.opt(next2) : null);
                    } catch (JSONException unused8) {
                    }
                }
            }
        }
        return jSONObject3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public static boolean a() {
        ?? r10;
        JSONObject jSONObjectB = b();
        if (jSONObjectB == null) {
            r10 = -1;
        } else if (jSONObjectB.has(InMobiSdk.IM_GDPR_CONSENT_IAB)) {
            r10 = 1;
        } else if (jSONObjectB.has(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE)) {
            try {
                r10 = jSONObjectB.getBoolean(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE);
            } catch (JSONException unused) {
                r10 = -1;
            }
        } else {
            r10 = -1;
        }
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(RootConfig.class, "clazz");
        boolean zShouldTransmitRequest = ((RootConfig) Y3.f23815a.a(RootConfig.class)).shouldTransmitRequest();
        ck.p.i("W6", "TAG");
        return r10 == 1 || zShouldTransmitRequest;
    }
}
