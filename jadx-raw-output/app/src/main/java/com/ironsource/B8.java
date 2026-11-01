package com.ironsource;

import android.content.Context;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class B8 {
    public static C3799y8 a(Context context, String str, String str2, Map<String, String> map) throws Exception {
        C3799y8.a aVar = new C3799y8.a();
        if (map != null && map.containsKey("sessionid")) {
            aVar.c(map.get("sessionid"));
        }
        aVar.a(context);
        return aVar.d(str).a(str2).a();
    }

    public static I5 a(JSONObject jSONObject) {
        return new I5.a(jSONObject.optString(G5.f26607r)).b().b(jSONObject.optBoolean("enabled")).a(new C3816z8()).a(a()).a(false).a();
    }

    private static ArrayList<Pair<String, String>> a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", G5.L));
        arrayList.add(new Pair<>(G5.M, G5.N));
        return arrayList;
    }

    public static boolean a(Y4 y10) {
        if (y10 == null || y10.g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(y10.g().get("inAppBidding"));
    }

    public static C3714t8.e a(Y4 y10, C3714t8.e eVar) {
        if (y10 == null || y10.g() == null || y10.g().get("rewarded") == null) {
            return eVar;
        }
        if (Boolean.parseBoolean(y10.g().get("rewarded"))) {
            return C3714t8.e.RewardedVideo;
        }
        return C3714t8.e.Interstitial;
    }
}
