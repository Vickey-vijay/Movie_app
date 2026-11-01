package yads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class jf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r0 f79025a;

    public /* synthetic */ jf1(Context context, io2 io2Var) {
        this(new r0(context.getApplicationContext(), io2Var));
    }

    public static String a(String str, JSONObject jSONObject) throws z02 {
        if (!jSONObject.has(str)) {
            return null;
        }
        String strOptString = jSONObject.optString(str);
        if (strOptString == null || strOptString.length() == 0 || ck.p.e(strOptString, "null")) {
            throw new z02("Native Ad json has not required attributes");
        }
        return strOptString;
    }

    public jf1(r0 r0Var) {
        this.f79025a = r0Var;
    }

    public final if1 a(JSONObject jSONObject, kn knVar) {
        int i10;
        ArrayList arrayList;
        List listA;
        Object objM3458constructorimpl;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("actions");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList2 = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            int i11 = 0;
            while (i11 < length) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                r0 r0Var = this.f79025a;
                r0Var.getClass();
                String strOptString = jSONObject2.optString("type");
                if (strOptString != null && strOptString.length() != 0 && !ck.p.e(strOptString, "null")) {
                    Map mapM = r0Var.f82060f;
                    if (mapM == null) {
                        Pair pairA = mj.h.a("adtune", new tc(r0Var.f82056b, r0Var.f82057c));
                        Pair pairA2 = mj.h.a("divkit_adtune", new th0(r0Var.f82058d, r0Var.f82059e, r0Var.f82057c, knVar.f79481b));
                        Pair pairA3 = mj.h.a("close", new bw());
                        Context context = r0Var.f82055a;
                        sa3 sa3Var = r0Var.f82056b;
                        mapM = kotlin.collections.a.m(pairA, pairA2, pairA3, mj.h.a("deeplink", new za0(sa3Var, new vg2(context, sa3Var), new l83())), mj.h.a("feedback", new iu0(r0Var.f82056b)));
                        r0Var.f82060f = mapM;
                    }
                    q0 q0Var = (q0) mapM.get(strOptString);
                    if (q0Var != null) {
                        arrayList2.add(q0Var.a(jSONObject2));
                    }
                    i11++;
                    jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                } else {
                    throw new z02("Native Ad json has not required attributes");
                }
            }
            i10 = 0;
            arrayList = arrayList2;
        } else {
            i10 = 0;
            arrayList = null;
        }
        String strA = a("falseClickUrl", jSONObject);
        dr0 dr0Var = strA != null ? new dr0(strA, jSONObject.optLong("falseClickInterval", 0L)) : null;
        Set setB = nj.p0.b();
        String strA2 = a("trackingUrl", jSONObject);
        if (strA2 != null) {
            setB.add(strA2);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("trackingUrls");
        if (jSONArrayOptJSONArray2 != null) {
            List listC = nj.r.c();
            int length2 = jSONArrayOptJSONArray2.length();
            while (i10 < length2) {
                try {
                    Result.a aVar = Result.Companion;
                    objM3458constructorimpl = Result.m3458constructorimpl(jSONArrayOptJSONArray2.getString(i10));
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
                }
                if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                    listC.add((String) objM3458constructorimpl);
                }
                i10++;
            }
            listA = nj.r.a(listC);
        } else {
            listA = null;
        }
        if (listA != null) {
            setB.addAll(listA);
        }
        return new if1(arrayList, dr0Var, nj.b0.O0(nj.p0.a(setB)), a("url", jSONObject), jSONObject.optLong("clickableDelay", 0L));
    }
}
