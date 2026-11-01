package yads;

import com.ironsource.C3754ve;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    public static c a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.getString(C3754ve.f31473d), a(jSONObject.getJSONArray("test_ids")));
        } catch (Throwable unused) {
            boolean z10 = ad1.f75480a;
            return null;
        }
    }

    public static LinkedHashSet a(JSONArray jSONArray) {
        Object objM3458constructorimpl;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            try {
                Result.a aVar = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(Boolean.valueOf(linkedHashSet.add(Long.valueOf(jSONArray.getLong(i10)))));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            }
            if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
                Objects.toString(mj.h.a(jSONArray.get(i10), ck.q.f6059a));
                boolean z10 = ad1.f75480a;
            }
        }
        return linkedHashSet;
    }
}
