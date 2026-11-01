package yads;

import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class xw0 {
    public static vw0 a(JSONObject jSONObject) {
        Object objM3458constructorimpl;
        cl.a aVarB = cl.m.b(null, ww0.f84364b, 1, null);
        try {
            Result.a aVar = Result.Companion;
            String string = jSONObject.toString();
            aVarB.a();
            objM3458constructorimpl = Result.m3458constructorimpl((vw0) aVarB.b(vw0.Companion.serializer(), string));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        return (vw0) (Result.m3463isFailureimpl(objM3458constructorimpl) ? null : objM3458constructorimpl);
    }
}
