package yads;

import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io2 f78571a;

    public static jk a(JSONObject jSONObject) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("attributes"));
            objM3458constructorimpl = Result.m3458constructorimpl(new jk(jSONObject2.getString("campaignId"), jSONObject2.getString("bannerId"), jSONObject2.getString("placeId")));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        return (jk) objM3458constructorimpl;
    }

    public ic(at1 at1Var) {
        this.f78571a = at1Var;
    }
}
