package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class Gc {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f26640d = "Ironsrc";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f26641e = "7";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f26642f = Omid.getVersion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f26643g = "omidVersion";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f26644h = "omidPartnerName";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f26645i = "omidPartnerVersion";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f26646j = "omidActiveAdSessions";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f26647k = "Invalid OMID impressionOwner";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f26648l = "Invalid OMID videoEventsOwner";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f26649m = "Missing OMID impressionOwner";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f26650n = "Missing OMID videoEventsOwner";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f26651o = "OMID has not been activated";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f26652p = "Missing OMID creativeType";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f26653q = "Missing adview id in OMID params";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f26654r = "No adview found with the provided adViewId";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f26655s = "OMID Session has already started";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f26656t = "OMID Session has not started";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Partner f26657a = Partner.createPartner(f26640d, f26641e);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26659c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, AdSession> f26658b = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f26660i = "isolateVerificationScripts";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final String f26661j = "impressionOwner";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f26662k = "videoEventsOwner";

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f26663l = "customReferenceData";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f26664m = "creativeType";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String f26665n = "impressionType";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f26666o = "adViewId";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f26667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Owner f26668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Owner f26669c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f26670d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ImpressionType f26671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CreativeType f26672f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f26673g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Owner f26674h;

        public static a a(JSONObject jSONObject) throws IllegalArgumentException {
            a aVar = new a();
            aVar.f26667a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String strOptString = jSONObject.optString("impressionOwner", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(Gc.f26649m);
            }
            try {
                aVar.f26668b = Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
                String strOptString2 = jSONObject.optString("videoEventsOwner", "");
                if (TextUtils.isEmpty(strOptString)) {
                    throw new IllegalArgumentException(Gc.f26650n);
                }
                try {
                    aVar.f26669c = Owner.valueOf(strOptString2.toUpperCase(Locale.getDefault()));
                    aVar.f26670d = jSONObject.optString("customReferenceData", "");
                    aVar.f26672f = b(jSONObject);
                    aVar.f26671e = c(jSONObject);
                    aVar.f26673g = e(jSONObject);
                    aVar.f26674h = d(jSONObject);
                    return aVar;
                } catch (IllegalArgumentException e10) {
                    C3676r4.d().a(e10);
                    throw new IllegalArgumentException("Invalid OMID videoEventsOwner " + strOptString2);
                }
            } catch (IllegalArgumentException e11) {
                C3676r4.d().a(e11);
                throw new IllegalArgumentException("Invalid OMID impressionOwner " + strOptString);
            }
        }

        private static CreativeType b(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("creativeType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(Gc.f26652p + strOptString);
            }
            for (CreativeType creativeType : CreativeType.values()) {
                if (strOptString.equalsIgnoreCase(creativeType.toString())) {
                    return creativeType;
                }
            }
            throw new IllegalArgumentException(Gc.f26652p + strOptString);
        }

        private static ImpressionType c(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("impressionType", "");
            if (TextUtils.isEmpty(strOptString)) {
                throw new IllegalArgumentException(Gc.f26652p + strOptString);
            }
            for (ImpressionType impressionType : ImpressionType.values()) {
                if (strOptString.equalsIgnoreCase(impressionType.toString())) {
                    return impressionType;
                }
            }
            throw new IllegalArgumentException(Gc.f26652p + strOptString);
        }

        private static Owner d(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(strOptString.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException e10) {
                C3676r4.d().a(e10);
                return owner;
            }
        }

        private static String e(JSONObject jSONObject) throws IllegalArgumentException {
            String strOptString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(strOptString)) {
                return strOptString;
            }
            throw new IllegalArgumentException(Gc.f26653q + strOptString);
        }
    }

    public void a(Context context) throws IllegalArgumentException {
        if (this.f26659c) {
            return;
        }
        Omid.activate(context);
        this.f26659c = true;
    }

    public void b(JSONObject jSONObject) throws IllegalStateException {
        a(jSONObject);
        String strOptString = jSONObject.optString("adViewId");
        AdSession adSession = this.f26658b.get(strOptString);
        if (adSession != null) {
            adSession.finish();
            this.f26658b.remove(strOptString);
            return;
        }
        throw new IllegalStateException(f26656t);
    }

    public void c(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(jSONObject);
        AdSession adSession = this.f26658b.get(jSONObject.optString("adViewId"));
        if (adSession != null) {
            AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
            if (jSONObject.optBoolean("signalLoaded")) {
                adEventsCreateAdEvents.loaded();
            }
            adEventsCreateAdEvents.impressionOccurred();
            return;
        }
        throw new IllegalStateException(f26656t);
    }

    public void d(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        a(a.a(jSONObject));
    }

    public C3490ge a() {
        C3490ge c3490ge = new C3490ge();
        c3490ge.b(f26643g, SDKUtils.encodeString(f26642f));
        c3490ge.b(f26644h, SDKUtils.encodeString(f26640d));
        c3490ge.b(f26645i, SDKUtils.encodeString(f26641e));
        c3490ge.b(f26646j, SDKUtils.encodeString(Arrays.toString(this.f26658b.keySet().toArray())));
        return c3490ge;
    }

    public void a(a aVar) throws IllegalStateException, IllegalArgumentException {
        if (this.f26659c) {
            if (!TextUtils.isEmpty(aVar.f26673g)) {
                String str = aVar.f26673g;
                if (!this.f26658b.containsKey(str)) {
                    K8 k8A = C3664q8.a().a(str);
                    if (k8A != null) {
                        AdSession adSessionA = a(aVar, k8A);
                        adSessionA.start();
                        this.f26658b.put(str, adSessionA);
                        return;
                    }
                    throw new IllegalStateException(f26654r);
                }
                throw new IllegalStateException(f26655s);
            }
            throw new IllegalStateException(f26653q);
        }
        throw new IllegalStateException(f26651o);
    }

    private AdSession a(a aVar, K8 k10) throws IllegalArgumentException {
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(aVar.f26672f, aVar.f26671e, aVar.f26668b, aVar.f26669c, aVar.f26667a), AdSessionContext.createHtmlAdSessionContext(this.f26657a, k10.getPresentingView(), null, aVar.f26670d));
        adSessionCreateAdSession.registerAdView(k10.getPresentingView());
        return adSessionCreateAdSession;
    }

    private void a(JSONObject jSONObject) throws IllegalStateException {
        if (!this.f26659c) {
            throw new IllegalStateException(f26651o);
        }
        if (jSONObject == null) {
            throw new IllegalStateException(f26656t);
        }
    }
}
