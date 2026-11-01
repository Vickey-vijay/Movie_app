package yads;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class x41 implements bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l41 f84448a;

    public /* synthetic */ x41() {
        this(new l41());
    }

    @Override // yads.bj
    public final Object a(JSONObject jSONObject) throws JSONException, z02 {
        if (!jSONObject.has("value") || jSONObject.isNull("value")) {
            boolean z10 = ad1.f75480a;
            throw new z02("Native Ad json has not required attributes");
        }
        return this.f84448a.a(jSONObject.getJSONObject("value"));
    }

    public x41(l41 l41Var) {
        this.f84448a = l41Var;
    }
}
