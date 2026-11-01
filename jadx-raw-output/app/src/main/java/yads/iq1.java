package yads;

import com.ironsource.Q6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class iq1 implements dq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g82 f78770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ir1 f78771b;

    public /* synthetic */ iq1() {
        this(new h82(), new ir1());
    }

    @Override // yads.dq2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hq1 a(wp2 wp2Var) {
        String strA = ((h82) this.f78770a).a(wp2Var);
        if (strA == null || strA.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(strA);
            try {
                cl.a aVar = ge1.f77787a;
                JSONObject jSONObject2 = jSONObject.getJSONObject("passback_parameters");
                Map mapD = nj.l0.d();
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    mapD.put(next, jSONObject2.getString(next));
                }
                Map mapC = nj.l0.c(mapD);
                if (!(!mapC.isEmpty())) {
                    return null;
                }
                JSONArray jSONArray = jSONObject.getJSONArray(Q6.E1);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    qq1 qq1VarA = this.f78771b.a(jSONArray.getJSONObject(i10));
                    if (qq1VarA != null) {
                        arrayList.add(qq1VarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new hq1(arrayList, mapC);
            } catch (JSONException e10) {
                boolean z10 = ad1.f75480a;
                throw new JSONException(e10.getMessage());
            }
        } catch (JSONException unused) {
            boolean z11 = ad1.f75480a;
            return null;
        }
    }

    public iq1(g82 g82Var, ir1 ir1Var) {
        this.f78770a = g82Var;
        this.f78771b = ir1Var;
    }
}
