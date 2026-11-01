package com.facebook.internal;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.facebook.FacebookRequestError;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: FacebookRequestErrorClassification.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u0014\u0018\u0000  2\u00020\u0001:\u0001\u000eB\u0081\u0001\b\u0000\u0012\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0018\u00010\f\u0012\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0018\u00010\f\u0012\u001c\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0018\u00010\f\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u001e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tR-\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R-\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R-\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018¨\u0006!"}, d2 = {"Lcom/facebook/internal/j;", "", "Lcom/facebook/FacebookRequestError$Category;", "category", "", "d", "", IronSourceConstants.EVENTS_ERROR_CODE, "errorSubCode", "", "isTransient", "c", "", "", "a", "Ljava/util/Map;", "getOtherErrors", "()Ljava/util/Map;", "otherErrors", "b", "getTransientErrors", "transientErrors", "getLoginRecoverableErrors", "loginRecoverableErrors", "Ljava/lang/String;", "otherRecoveryMessage", "e", "transientRecoveryMessage", InneractiveMediationDefs.GENDER_FEMALE, "loginRecoverableRecoveryMessage", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "g", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static j f14418h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Map<Integer, Set<Integer>> otherErrors;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final Map<Integer, Set<Integer>> transientErrors;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final Map<Integer, Set<Integer>> loginRecoverableErrors;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String otherRecoveryMessage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String transientRecoveryMessage;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final String loginRecoverableRecoveryMessage;

    /* JADX INFO: renamed from: com.facebook.internal.j$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FacebookRequestErrorClassification.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\"\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010\u000fJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J&\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\t\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\n\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u001a\u0010\u0010\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010$\u001a\u00020\u001e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/facebook/internal/j$a;", "", "Lorg/json/JSONArray;", "jsonArray", "Lcom/facebook/internal/j;", "a", "Lorg/json/JSONObject;", "definition", "", "", "", "d", "b", "()Lcom/facebook/internal/j;", "getDefaultErrorClassification$annotations", "()V", "defaultErrorClassification", "c", "defaultErrorClassificationImpl", "EC_APP_NOT_INSTALLED", "I", "EC_APP_TOO_MANY_CALLS", "EC_INVALID_SESSION", "EC_INVALID_TOKEN", "EC_RATE", "EC_SERVICE_UNAVAILABLE", "EC_TOO_MANY_USER_ACTION_CALLS", "EC_USER_TOO_MANY_CALLS", "ESC_APP_INACTIVE", "ESC_APP_NOT_INSTALLED", "", "KEY_LOGIN_RECOVERABLE", "Ljava/lang/String;", "KEY_NAME", "KEY_OTHER", "KEY_RECOVERY_MESSAGE", "KEY_TRANSIENT", "defaultInstance", "Lcom/facebook/internal/j;", "<init>", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }

        public final synchronized j b() {
            j jVar;
            if (j.f14418h == null) {
                j.f14418h = c();
            }
            jVar = j.f14418h;
            if (jVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return jVar;
        }

        public final j c() {
            return new j(null, kotlin.collections.a.l(mj.h.a(2, null), mj.h.a(4, null), mj.h.a(9, null), mj.h.a(17, null), mj.h.a(341, null)), kotlin.collections.a.l(mj.h.a(102, null), mj.h.a(190, null), mj.h.a(Integer.valueOf(TTAdConstant.IMAGE_URL_CODE), null)), null, null, null);
        }

        public final j a(JSONArray jsonArray) {
            Map<Integer, Set<Integer>> map;
            Map<Integer, Set<Integer>> map2;
            Map<Integer, Set<Integer>> map3;
            String str;
            String str2;
            String str3;
            String strOptString;
            if (jsonArray == null) {
                return null;
            }
            int i10 = 0;
            int length = jsonArray.length();
            if (length > 0) {
                Map<Integer, Set<Integer>> mapD = null;
                Map<Integer, Set<Integer>> mapD2 = null;
                Map<Integer, Set<Integer>> mapD3 = null;
                String strOptString2 = null;
                String strOptString3 = null;
                String strOptString4 = null;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObjectOptJSONObject = jsonArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("name")) != null) {
                        if (lk.x.E(strOptString, "other", true)) {
                            strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapD = d(jSONObjectOptJSONObject);
                        } else if (lk.x.E(strOptString, "transient", true)) {
                            strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapD2 = d(jSONObjectOptJSONObject);
                        } else if (lk.x.E(strOptString, "login_recoverable", true)) {
                            strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                            mapD3 = d(jSONObjectOptJSONObject);
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
                map = mapD;
                map2 = mapD2;
                map3 = mapD3;
                str = strOptString2;
                str2 = strOptString3;
                str3 = strOptString4;
            } else {
                map = null;
                map2 = null;
                map3 = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            return new j(map, map2, map3, str, str2, str3);
        }

        public final Map<Integer, Set<Integer>> d(JSONObject definition) {
            int iOptInt;
            HashSet hashSet;
            JSONArray jSONArrayOptJSONArray = definition.optJSONArray("items");
            if (jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            HashMap map = new HashMap();
            int length = jSONArrayOptJSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                        if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet();
                            int length2 = jSONArrayOptJSONArray2.length();
                            if (length2 > 0) {
                                int i12 = 0;
                                while (true) {
                                    int i13 = i12 + 1;
                                    int iOptInt2 = jSONArrayOptJSONArray2.optInt(i12);
                                    if (iOptInt2 != 0) {
                                        hashSet.add(Integer.valueOf(iOptInt2));
                                    }
                                    if (i13 >= length2) {
                                        break;
                                    }
                                    i12 = i13;
                                }
                            }
                        }
                        map.put(Integer.valueOf(iOptInt), hashSet);
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return map;
        }
    }

    /* JADX INFO: compiled from: FacebookRequestErrorClassification.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FacebookRequestError.Category.valuesCustom().length];
            iArr[FacebookRequestError.Category.OTHER.ordinal()] = 1;
            iArr[FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final FacebookRequestError.Category c(int errorCode, int errorSubCode, boolean isTransient) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (isTransient) {
            return FacebookRequestError.Category.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.otherErrors;
        if (map != null && map.containsKey(Integer.valueOf(errorCode)) && ((set3 = this.otherErrors.get(Integer.valueOf(errorCode))) == null || set3.contains(Integer.valueOf(errorSubCode)))) {
            return FacebookRequestError.Category.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.loginRecoverableErrors;
        if (map2 != null && map2.containsKey(Integer.valueOf(errorCode)) && ((set2 = this.loginRecoverableErrors.get(Integer.valueOf(errorCode))) == null || set2.contains(Integer.valueOf(errorSubCode)))) {
            return FacebookRequestError.Category.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.transientErrors;
        return (map3 != null && map3.containsKey(Integer.valueOf(errorCode)) && ((set = this.transientErrors.get(Integer.valueOf(errorCode))) == null || set.contains(Integer.valueOf(errorSubCode)))) ? FacebookRequestError.Category.TRANSIENT : FacebookRequestError.Category.OTHER;
    }

    public final String d(FacebookRequestError.Category category) {
        int i10 = category == null ? -1 : b.$EnumSwitchMapping$0[category.ordinal()];
        if (i10 == 1) {
            return this.otherRecoveryMessage;
        }
        if (i10 == 2) {
            return this.loginRecoverableRecoveryMessage;
        }
        if (i10 != 3) {
            return null;
        }
        return this.transientRecoveryMessage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j(Map<Integer, ? extends Set<Integer>> map, Map<Integer, ? extends Set<Integer>> map2, Map<Integer, ? extends Set<Integer>> map3, String str, String str2, String str3) {
        this.otherErrors = map;
        this.transientErrors = map2;
        this.loginRecoverableErrors = map3;
        this.otherRecoveryMessage = str;
        this.transientRecoveryMessage = str2;
        this.loginRecoverableRecoveryMessage = str3;
    }
}
