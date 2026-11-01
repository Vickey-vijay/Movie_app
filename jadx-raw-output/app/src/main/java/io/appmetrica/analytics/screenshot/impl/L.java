package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class L implements JsonParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f58378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f58379b;

    /* JADX WARN: Multi-variable type inference failed */
    public L() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public L(Y y10, X x10) {
        this.f58378a = y10;
        this.f58379b = x10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J parse(JSONObject jSONObject) {
        N n10;
        P p10;
        Q q10;
        boolean zExtractFeature = RemoteConfigJsonUtils.extractFeature(jSONObject, "screenshot", AbstractC4720o.f58452a);
        Y y10 = this.f58378a;
        X x10 = this.f58379b;
        x10.getClass();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("screenshot");
        if (jSONObjectOptJSONObject == null) {
            q10 = new Q();
            q10.f58391a = new N();
            q10.f58392b = new P();
            O o10 = new O();
            o10.f58386c = AbstractC4720o.f58453b;
            q10.f58393c = o10;
        } else {
            Q q11 = new Q();
            x10.f58401a.getClass();
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("api_captor_config");
            O o11 = null;
            if (jSONObjectOptJSONObject2 == null) {
                n10 = null;
            } else {
                n10 = new N();
                Boolean boolOptBooleanOrNull = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject2, "enabled");
                if (boolOptBooleanOrNull != null) {
                    n10.f58382a = boolOptBooleanOrNull.booleanValue();
                }
            }
            if (n10 != null) {
                q11.f58391a = n10;
            }
            x10.f58402b.getClass();
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("service_captor_config");
            if (jSONObjectOptJSONObject3 == null) {
                p10 = null;
            } else {
                p10 = new P();
                Boolean boolOptBooleanOrNull2 = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject3, "enabled");
                if (boolOptBooleanOrNull2 != null) {
                    p10.f58388a = boolOptBooleanOrNull2.booleanValue();
                }
                Long lOptLongOrNull = JsonUtils.optLongOrNull(jSONObjectOptJSONObject3, "delay_seconds");
                if (lOptLongOrNull != null) {
                    p10.f58389b = lOptLongOrNull.longValue();
                }
            }
            if (p10 != null) {
                q11.f58392b = p10;
            }
            x10.f58403c.getClass();
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("content_observer_captor_config");
            if (jSONObjectOptJSONObject4 != null) {
                o11 = new O();
                Boolean boolOptBooleanOrNull3 = JsonUtils.optBooleanOrNull(jSONObjectOptJSONObject4, "enabled");
                if (boolOptBooleanOrNull3 != null) {
                    o11.f58384a = boolOptBooleanOrNull3.booleanValue();
                }
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("media_store_column_names");
                if (jSONArrayOptJSONArray != null) {
                    ik.i iVarQ = ik.k.q(0, jSONArrayOptJSONArray.length());
                    ArrayList arrayList = new ArrayList(nj.t.v(iVarQ, 10));
                    Iterator<Integer> it = iVarQ.iterator();
                    while (it.hasNext()) {
                        arrayList.add(jSONArrayOptJSONArray.getString(((nj.g0) it).nextInt()));
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                    o11.f58386c = (String[]) array;
                }
                Long lOptLongOrNull2 = JsonUtils.optLongOrNull(jSONObjectOptJSONObject4, "detect_window_seconds");
                if (lOptLongOrNull2 != null) {
                    o11.f58385b = lOptLongOrNull2.longValue();
                }
            }
            if (o11 != null) {
                q11.f58393c = o11;
            }
            q10 = q11;
        }
        return new J(zExtractFeature, y10.toModel(q10));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public final J b(JSONObject jSONObject) {
        return (J) JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public /* synthetic */ L(Y y10, X x10, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new Y(null, null, null, 7, null) : y10, (i10 & 2) != 0 ? new X() : x10);
    }
}
