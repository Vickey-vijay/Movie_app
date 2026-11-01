package sg.bigo.ads;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: sg.bigo.ads.c$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f69445a;

        static {
            int[] iArr = new int[ConsentOptions.values().length];
            f69445a = iArr;
            try {
                iArr[ConsentOptions.LGPD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69445a[ConsentOptions.CCPA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69445a[ConsentOptions.COPPA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f69445a[ConsentOptions.GDPR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final List<a> f69446h = new ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f69447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f69448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f69449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f69450d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f69451e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f69452f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f69453g;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f69447a = str;
            this.f69448b = str2;
            this.f69449c = str3;
            this.f69450d = str4;
            this.f69451e = str5;
            this.f69452f = str6;
            this.f69453g = str7;
        }

        public static List<a> a() {
            return f69446h;
        }

        public static void a(a aVar) {
            f69446h.add(aVar);
        }

        public static JSONObject b(a aVar) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("consent_type", aVar.f69447a);
                jSONObject.put("last_status", aVar.f69448b);
                jSONObject.put("cur_status", aVar.f69449c);
                jSONObject.put("get_token", aVar.f69450d);
                jSONObject.put("tcf_applias", aVar.f69451e);
                jSONObject.put("tcf_purpose", aVar.f69452f);
                jSONObject.put("tcf_interests", aVar.f69453g);
            } catch (JSONException unused) {
            }
            return jSONObject;
        }

        public static void b() {
            f69446h.clear();
        }

        public static Map<String, String> c() {
            HashMap map = new HashMap();
            JSONArray jSONArray = new JSONArray();
            Iterator<a> it = f69446h.iterator();
            while (it.hasNext()) {
                jSONArray.put(b(it.next()));
            }
            map.put("user_consent_event", jSONArray.toString());
            map.put(CommonUrlParts.UUID, sg.bigo.ads.common.x.a.r());
            return map;
        }
    }
}
