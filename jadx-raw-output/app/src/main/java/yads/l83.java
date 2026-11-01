package yads;

import java.util.List;
import kotlin.Result;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes9.dex */
public final class l83 {
    public static List a(JSONArray jSONArray) {
        Object objM3458constructorimpl;
        List listC = nj.r.c();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                Result.a aVar = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(jSONArray.getString(i10));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                listC.add((String) objM3458constructorimpl);
            }
        }
        return nj.r.a(listC);
    }
}
