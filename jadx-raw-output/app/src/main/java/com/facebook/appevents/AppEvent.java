package com.facebook.appevents;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.j0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.tools.SameMD5;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.text.Regex;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: AppEvent.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u001a\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002,-BG\b\u0016\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b'\u0010(B+\b\u0012\u0012\u0006\u0010)\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\b\u0010#\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b'\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\bH\u0016J=\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002R\u0017\u0010\u0017\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0017\u0010\u001f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0011\u0010$\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b$\u0010\u001d¨\u0006."}, d2 = {"Lcom/facebook/appevents/AppEvent;", "Ljava/io/Serializable;", "", "writeReplace", "", "getIsImplicit", "Lorg/json/JSONObject;", "getJSONObject", "", "toString", "contextName", C3426d4.i.f28547j0, "", "valueToSum", "Landroid/os/Bundle;", "parameters", "Ljava/util/UUID;", "currentSessionId", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Ljava/util/UUID;)Lorg/json/JSONObject;", "", InneractiveMediationDefs.GENDER_FEMALE, "d", "jsonObject", "Lorg/json/JSONObject;", "getJsonObject", "()Lorg/json/JSONObject;", "isImplicit", "Z", "()Z", "inBackground", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "checksum", "isChecksumValid", "isImplicitlyLogged", "isInBackground", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZZLjava/util/UUID;)V", "jsonString", "(Ljava/lang/String;ZZLjava/lang/String;)V", VastTagName.COMPANION, "a", "SerializationProxyV2", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class AppEvent implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet<String> f14161b = new HashSet<>();
    private static final long serialVersionUID = 1;
    private final String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;

    /* JADX INFO: compiled from: AppEvent.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB)\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/facebook/appevents/AppEvent$SerializationProxyV2;", "Ljava/io/Serializable;", "", "readResolve", "", "jsonString", "Ljava/lang/String;", "", "isImplicit", "Z", "inBackground", "checksum", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;)V", VastTagName.COMPANION, "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class SerializationProxyV2 implements Serializable {
        private static final long serialVersionUID = 20160803001L;
        private final String checksum;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;

        public SerializationProxyV2(String str, boolean z10, boolean z11, String str2) {
            ck.p.j(str, "jsonString");
            this.jsonString = str;
            this.isImplicit = z10;
            this.inBackground = z11;
            this.checksum = str2;
        }

        private final Object readResolve() throws ObjectStreamException, JSONException {
            return new AppEvent(this.jsonString, this.isImplicit, this.inBackground, this.checksum, null);
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.AppEvent$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AppEvent.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000ej\b\u0012\u0004\u0012\u00020\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/facebook/appevents/AppEvent$a;", "", "", "identifier", "Lmj/r;", "d", "toHash", "c", "", "MAX_IDENTIFIER_LENGTH", "I", "", "serialVersionUID", "J", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "validatedIdentifiers", "Ljava/util/HashSet;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final String c(String toHash) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                Charset charsetForName = Charset.forName("UTF-8");
                ck.p.i(charsetForName, "Charset.forName(charsetName)");
                if (toHash == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = toHash.getBytes(charsetForName);
                ck.p.i(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] bArrDigest = messageDigest.digest();
                ck.p.i(bArrDigest, "digest.digest()");
                return y1.g.c(bArrDigest);
            } catch (UnsupportedEncodingException e10) {
                j0.d0("Failed to generate checksum: ", e10);
                return "1";
            } catch (NoSuchAlgorithmException e11) {
                j0.d0("Failed to generate checksum: ", e11);
                return "0";
            }
        }

        public final void d(String str) {
            boolean zContains;
            if (str != null) {
                if (!(str.length() == 0) && str.length() <= 40) {
                    synchronized (AppEvent.f14161b) {
                        zContains = AppEvent.f14161b.contains(str);
                        mj.r rVar = mj.r.f64562a;
                    }
                    if (zContains) {
                        return;
                    }
                    if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").matches(str)) {
                        synchronized (AppEvent.f14161b) {
                            AppEvent.f14161b.add(str);
                        }
                        return;
                    } else {
                        ck.w wVar = ck.w.f6066a;
                        String str2 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                        ck.p.i(str2, "java.lang.String.format(format, *args)");
                        throw new FacebookException(str2);
                    }
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            ck.w wVar2 = ck.w.f6066a;
            String str3 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            ck.p.i(str3, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(str3);
        }
    }

    public AppEvent(String str, String str2, Double d10, Bundle bundle, boolean z10, boolean z11, UUID uuid) throws JSONException, FacebookException {
        ck.p.j(str, "contextName");
        ck.p.j(str2, C3426d4.i.f28547j0);
        this.isImplicit = z10;
        this.inBackground = z11;
        this.name = str2;
        this.jsonObject = e(str, str2, d10, bundle, uuid);
        this.checksum = d();
    }

    public /* synthetic */ AppEvent(String str, boolean z10, boolean z11, String str2, ck.i iVar) {
        this(str, z10, z11, str2);
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.jsonObject.toString();
        ck.p.i(string, "jsonObject.toString()");
        return new SerializationProxyV2(string, this.isImplicit, this.inBackground, this.checksum);
    }

    public final String d() {
        Companion companion = INSTANCE;
        String string = this.jsonObject.toString();
        ck.p.i(string, "jsonObject.toString()");
        return companion.c(string);
    }

    public final JSONObject e(String contextName, String eventName, Double valueToSum, Bundle parameters, UUID currentSessionId) throws JSONException {
        Companion companion = INSTANCE;
        companion.d(eventName);
        JSONObject jSONObject = new JSONObject();
        String strE = b2.a.e(eventName);
        jSONObject.put("_eventName", strE);
        jSONObject.put("_eventName_md5", companion.c(strE));
        jSONObject.put("_logTime", System.currentTimeMillis() / ((long) 1000));
        jSONObject.put("_ui", contextName);
        if (currentSessionId != null) {
            jSONObject.put("_session_id", currentSessionId);
        }
        if (parameters != null) {
            Map<String, String> mapF = f(parameters);
            for (String str : mapF.keySet()) {
                jSONObject.put(str, mapF.get(str));
            }
        }
        if (valueToSum != null) {
            jSONObject.put("_valueToSum", valueToSum.doubleValue());
        }
        if (this.inBackground) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.isImplicit) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            com.facebook.internal.a0.Companion companion2 = com.facebook.internal.a0.INSTANCE;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String string = jSONObject.toString();
            ck.p.i(string, "eventObject.toString()");
            companion2.c(loggingBehavior, "AppEvents", "Created app event '%s'", string);
        }
        return jSONObject;
    }

    public final Map<String, String> f(Bundle parameters) {
        HashMap map = new HashMap();
        for (String str : parameters.keySet()) {
            Companion companion = INSTANCE;
            ck.p.i(str, C3426d4.i.W);
            companion.d(str);
            Object obj = parameters.get(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                ck.w wVar = ck.w.f6066a;
                String str2 = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                ck.p.i(str2, "java.lang.String.format(format, *args)");
                throw new FacebookException(str2);
            }
            map.put(str, obj.toString());
        }
        x1.a.c(map);
        b2.a aVar = b2.a.f4746a;
        b2.a.f(map, this.name);
        v1.a aVar2 = v1.a.f73012a;
        v1.a.c(map, this.name);
        return map;
    }

    public final boolean getIsImplicit() {
        return this.isImplicit;
    }

    /* JADX INFO: renamed from: getJSONObject, reason: from getter */
    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean isChecksumValid() {
        if (this.checksum == null) {
            return true;
        }
        return ck.p.e(d(), this.checksum);
    }

    public final boolean isImplicit() {
        return this.isImplicit;
    }

    public String toString() {
        ck.w wVar = ck.w.f6066a;
        String str = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{this.jsonObject.optString("_eventName"), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()}, 3));
        ck.p.i(str, "java.lang.String.format(format, *args)");
        return str;
    }

    public AppEvent(String str, boolean z10, boolean z11, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.isImplicit = z10;
        String strOptString = jSONObject.optString("_eventName");
        ck.p.i(strOptString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.name = strOptString;
        this.checksum = str2;
        this.inBackground = z11;
    }
}
