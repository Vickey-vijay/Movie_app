package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C3426d4;
import com.ironsource.C3444e4;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4435p2 {
    public static void a(C4174em c4174em, JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C3444e4.f28728c);
        if (jSONObjectOptJSONObject != null) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("deeplink_conditions");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i10);
                    String strOptString = jSONObjectOptJSONObject2.optString(C3426d4.i.W, null);
                    if (!TextUtils.isEmpty(strOptString)) {
                        String strOptString2 = jSONObjectOptJSONObject2.optString("value", null);
                        arrayList.add(new Pair(strOptString, strOptString2 != null ? new C4360m2(strOptString2) : null));
                    }
                }
            }
            c4174em.f56693s = new C4385n2(arrayList);
        }
    }
}
