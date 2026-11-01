package yads;

import com.ironsource.C3426d4;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class pn1 implements bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm1 f81467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bi3 f81468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l41 f81469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a51 f81470d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws JSONException, z02 {
        ?? Q;
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            boolean z10 = ad1.f75480a;
            throw new z02("Native Ad json has not required attributes");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("value");
        oj1 oj1Var = (oj1) ((!jSONObject2.has(C3426d4.i.I0) || jSONObject2.isNull(C3426d4.i.I0)) ? null : this.f81467a.a(jSONObject2.getJSONObject(C3426d4.i.I0)));
        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            a51 a51Var = this.f81470d;
            a51Var.getClass();
            Q = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                Q.add(a51Var.f75403a.a(jSONArrayOptJSONArray.getJSONObject(i10)));
            }
        } else {
            Q = 0;
        }
        u41 u41VarA = (!jSONObject2.has("image") || jSONObject2.isNull("image")) ? null : this.f81469c.a(jSONObject2.getJSONObject("image"));
        if ((Q == 0 || Q.isEmpty()) && u41VarA != null) {
            Q = nj.s.q(u41VarA);
        }
        sd3 sd3Var = (sd3) ((!jSONObject2.has("video") || jSONObject2.isNull("video")) ? null : this.f81468b.a(jSONObject2.getJSONObject("video")));
        if (oj1Var != null || ((Q != 0 && !Q.isEmpty()) || sd3Var != null)) {
            return new on1(oj1Var, sd3Var, Q != 0 ? nj.b0.R0(Q) : null);
        }
        boolean z11 = ad1.f75480a;
        throw new z02("Native Ad json has not required attributes");
    }

    public pn1(nm1 nm1Var, bi3 bi3Var, l41 l41Var, a51 a51Var) {
        this.f81467a = nm1Var;
        this.f81468b = bi3Var;
        this.f81469c = l41Var;
        this.f81470d = a51Var;
    }
}
