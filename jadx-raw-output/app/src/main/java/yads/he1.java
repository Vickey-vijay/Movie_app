package yads;

import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class he1 {
    public static final String a(String str, JSONObject jSONObject) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(jSONObject.getString(str));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        return (String) objM3458constructorimpl;
    }
}
