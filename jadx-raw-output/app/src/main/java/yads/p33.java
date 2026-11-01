package yads;

import java.util.Map;
import java.util.Objects;
import kotlin.Result;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class p33 {
    public static Map a(JSONObject jSONObject) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(ge1.a(jSONObject));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            Objects.toString(jSONObject);
            boolean z10 = ad1.f75480a;
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        return (Map) objM3458constructorimpl;
    }

    public static String a(Map map) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            cl.s sVar = new cl.s();
            for (Map.Entry entry : map.entrySet()) {
                cl.h.d(sVar, (String) entry.getKey(), (String) entry.getValue());
            }
            objM3458constructorimpl = Result.m3458constructorimpl(sVar.a().toString());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            boolean z10 = ad1.f75480a;
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        return (String) objM3458constructorimpl;
    }

    public static Map a(String str) {
        Object objM3458constructorimpl;
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(a(new JSONObject(str)));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            boolean z10 = ad1.f75480a;
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        return (Map) objM3458constructorimpl;
    }
}
