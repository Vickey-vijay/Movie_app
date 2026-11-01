package com.facebook.appevents.codeless.internal;

import ck.i;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.events.base.StatsEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import u1.a;

/* JADX INFO: compiled from: EventBinding.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 +2\u00020\u0001:\u0003,\u0003-B[\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0016\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u0004\u001a\u0004\b\"\u0010\u0006R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168F¢\u0006\u0006\u001a\u0004\b\u0013\u0010&R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168F¢\u0006\u0006\u001a\u0004\b\u000e\u0010&¨\u0006."}, d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", C3426d4.i.f28547j0, "Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "getMethod", "()Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "method", "Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "c", "Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "getType", "()Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "type", "d", "getAppVersion", "appVersion", "", "Lcom/facebook/appevents/codeless/internal/PathComponent;", "e", "Ljava/util/List;", "path", "Lu1/a;", InneractiveMediationDefs.GENDER_FEMALE, "parameters", "g", "getComponentId", "componentId", "h", "getPathType", "pathType", "i", "activityName", "()Ljava/util/List;", "viewPath", "viewParameters", "<init>", "(Ljava/lang/String;Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "j", "ActionType", "MappingMethod", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class EventBinding {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String eventName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final MappingMethod method;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final ActionType type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String appVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final List<PathComponent> path;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final List<a> parameters;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final String componentId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final String pathType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final String activityName;

    /* JADX INFO: compiled from: EventBinding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$ActionType;", "", "(Ljava/lang/String;I)V", "CLICK", "SELECTED", "TEXT_CHANGED", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum ActionType {
        CLICK,
        SELECTED,
        TEXT_CHANGED;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static ActionType[] valuesCustom() {
            ActionType[] actionTypeArrValuesCustom = values();
            return (ActionType[]) Arrays.copyOf(actionTypeArrValuesCustom, actionTypeArrValuesCustom.length);
        }
    }

    /* JADX INFO: compiled from: EventBinding.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$MappingMethod;", "", "(Ljava/lang/String;I)V", "MANUAL", "INFERENCE", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum MappingMethod {
        MANUAL,
        INFERENCE;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static MappingMethod[] valuesCustom() {
            MappingMethod[] mappingMethodArrValuesCustom = values();
            return (MappingMethod[]) Arrays.copyOf(mappingMethodArrValuesCustom, mappingMethodArrValuesCustom.length);
        }
    }

    /* JADX INFO: renamed from: com.facebook.appevents.codeless.internal.EventBinding$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: EventBinding.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\f"}, d2 = {"Lcom/facebook/appevents/codeless/internal/EventBinding$a;", "", "Lorg/json/JSONArray;", "array", "", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "b", "Lorg/json/JSONObject;", "mapping", "a", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final EventBinding a(JSONObject mapping) throws JSONException, IllegalArgumentException {
            int length;
            p.j(mapping, "mapping");
            String string = mapping.getString("event_name");
            String string2 = mapping.getString("method");
            p.i(string2, "mapping.getString(\"method\")");
            Locale locale = Locale.ENGLISH;
            p.i(locale, "ENGLISH");
            String upperCase = string2.toUpperCase(locale);
            p.i(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            MappingMethod mappingMethodValueOf = MappingMethod.valueOf(upperCase);
            String string3 = mapping.getString(StatsEvent.f44666z);
            p.i(string3, "mapping.getString(\"event_type\")");
            p.i(locale, "ENGLISH");
            String upperCase2 = string3.toUpperCase(locale);
            p.i(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            ActionType actionTypeValueOf = ActionType.valueOf(upperCase2);
            String string4 = mapping.getString("app_version");
            JSONArray jSONArray = mapping.getJSONArray("path");
            ArrayList arrayList = new ArrayList();
            int length2 = jSONArray.length();
            int i10 = 0;
            if (length2 > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    p.i(jSONObject, "jsonPath");
                    arrayList.add(new PathComponent(jSONObject));
                    if (i12 >= length2) {
                        break;
                    }
                    i11 = i12;
                }
            }
            String strOptString = mapping.optString("path_type", "absolute");
            JSONArray jSONArrayOptJSONArray = mapping.optJSONArray("parameters");
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
                while (true) {
                    int i13 = i10 + 1;
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                    p.i(jSONObject2, "jsonParameter");
                    arrayList2.add(new a(jSONObject2));
                    if (i13 >= length) {
                        break;
                    }
                    i10 = i13;
                }
            }
            String strOptString2 = mapping.optString("component_id");
            String strOptString3 = mapping.optString("activity_name");
            p.i(string, C3426d4.i.f28547j0);
            p.i(string4, "appVersion");
            p.i(strOptString2, "componentId");
            p.i(strOptString, "pathType");
            p.i(strOptString3, "activityName");
            return new EventBinding(string, mappingMethodValueOf, actionTypeValueOf, string4, arrayList, arrayList2, strOptString2, strOptString, strOptString3);
        }

        public final List<EventBinding> b(JSONArray array) {
            ArrayList arrayList = new ArrayList();
            if (array != null) {
                int i10 = 0;
                try {
                    int length = array.length();
                    if (length > 0) {
                        while (true) {
                            int i11 = i10 + 1;
                            JSONObject jSONObject = array.getJSONObject(i10);
                            p.i(jSONObject, "array.getJSONObject(i)");
                            arrayList.add(a(jSONObject));
                            if (i11 >= length) {
                                break;
                            }
                            i10 = i11;
                        }
                    }
                } catch (IllegalArgumentException | JSONException unused) {
                }
            }
            return arrayList;
        }
    }

    public EventBinding(String str, MappingMethod mappingMethod, ActionType actionType, String str2, List<PathComponent> list, List<a> list2, String str3, String str4, String str5) {
        p.j(str, C3426d4.i.f28547j0);
        p.j(mappingMethod, "method");
        p.j(actionType, "type");
        p.j(str2, "appVersion");
        p.j(list, "path");
        p.j(list2, "parameters");
        p.j(str3, "componentId");
        p.j(str4, "pathType");
        p.j(str5, "activityName");
        this.eventName = str;
        this.method = mappingMethod;
        this.type = actionType;
        this.appVersion = str2;
        this.path = list;
        this.parameters = list2;
        this.componentId = str3;
        this.pathType = str4;
        this.activityName = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActivityName() {
        return this.activityName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    public final List<a> c() {
        List<a> listUnmodifiableList = Collections.unmodifiableList(this.parameters);
        p.i(listUnmodifiableList, "unmodifiableList(parameters)");
        return listUnmodifiableList;
    }

    public final List<PathComponent> d() {
        List<PathComponent> listUnmodifiableList = Collections.unmodifiableList(this.path);
        p.i(listUnmodifiableList, "unmodifiableList(path)");
        return listUnmodifiableList;
    }

    public final ActionType getType() {
        return this.type;
    }
}
