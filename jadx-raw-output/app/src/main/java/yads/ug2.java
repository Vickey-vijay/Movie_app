package yads;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ug2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sa3 f83463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l83 f83464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wq0 f83465c;

    public /* synthetic */ ug2(Context context, sa3 sa3Var) {
        this(sa3Var, new l83(), new xq0(context));
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    public final sg2 a(JSONObject jSONObject) throws JSONException, z02 {
        Map mapC;
        Object objM3458constructorimpl;
        Object next;
        String strOptString;
        Object obj;
        JSONObject jSONObject2 = jSONObject.has("deeplinkLaunchParams") ? jSONObject.getJSONObject("deeplinkLaunchParams") : jSONObject;
        String strOptString2 = jSONObject2.optString("package");
        if (strOptString2 == null || strOptString2.length() == 0 || ck.p.e(strOptString2, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("extras");
        wq0 wq0Var = this.f83465c;
        wq0Var.getClass();
        if (jSONObjectOptJSONObject == null) {
            mapC = null;
        } else {
            Map mapD = nj.l0.d();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next2 = itKeys.next();
                if (!jSONObjectOptJSONObject.isNull(next2)) {
                    Object sq0Var = jSONObjectOptJSONObject.get(next2);
                    if (sq0Var instanceof JSONObject) {
                        uq0 uq0Var = wq0Var.f84293a;
                        JSONObject jSONObject3 = (JSONObject) sq0Var;
                        uq0Var.getClass();
                        String strOptString3 = jSONObject3.optString("type");
                        try {
                            obj = jSONObject3.get("value");
                        } catch (JSONException unused) {
                            obj = null;
                        }
                        if (ck.p.e(strOptString3, "parcelable") && ck.p.e(obj, "null")) {
                            sq0Var = vq0.f83985a;
                        } else if (ck.p.e(strOptString3, "intent") && (obj instanceof JSONObject)) {
                            sq0Var = new sq0(uq0Var.f83573a, uq0Var.f83574b.a((JSONObject) obj), new tg2());
                        } else {
                            sq0Var = null;
                        }
                    }
                    if (sq0Var != null) {
                        mapD.put(next2, sq0Var);
                    }
                }
            }
            mapC = nj.l0.c(mapD);
            if (mapC.isEmpty()) {
                mapC = null;
            }
        }
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(Integer.valueOf(jSONObject2.getInt("flags")));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        Integer num = (Integer) objM3458constructorimpl;
        String strA = he1.a("launchMode", jSONObject2);
        bb0.f75771b.getClass();
        Iterator<E> it = bb0.f75775f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!lk.x.E(((bb0) next).name(), strA, true));
        bb0 bb0Var = (bb0) next;
        if (bb0Var == null) {
            bb0Var = bb0.f75772c;
        }
        String strA2 = he1.a("className", jSONObject2);
        if (strA2 == null) {
            this.f83463a.getClass();
            strOptString = sa3.a("url", jSONObject);
        } else {
            strOptString = jSONObject.optString("url");
        }
        String str = strOptString;
        String strA3 = he1.a("deeplinkType", jSONObject);
        this.f83464b.getClass();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("trackingUrls");
        List listA = jSONArrayOptJSONArray == null ? null : l83.a(jSONArrayOptJSONArray);
        this.f83464b.getClass();
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("fallbackTrackingUrls");
        return new sg2(strOptString2, str, mapC, num, bb0Var, listA, jSONArrayOptJSONArray2 == null ? null : l83.a(jSONArrayOptJSONArray2), strA3, strA2);
    }

    public ug2(sa3 sa3Var, l83 l83Var, xq0 xq0Var) {
        this.f83463a = sa3Var;
        this.f83464b = l83Var;
        this.f83465c = xq0Var.a(this);
    }
}
