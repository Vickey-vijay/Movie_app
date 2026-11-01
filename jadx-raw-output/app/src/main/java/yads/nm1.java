package yads;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class nm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ub3 f80706a;

    public final Object a(JSONObject jSONObject) {
        String strA = this.f80706a.a(CreativeInfo.f44315al, jSONObject);
        float f10 = (float) jSONObject.getDouble("aspectRatio");
        if (f10 == 0.0f) {
            f10 = 1.7777778f;
        }
        return new oj1(strA, f10);
    }

    public nm1(ub3 ub3Var) {
        this.f80706a = ub3Var;
    }
}
