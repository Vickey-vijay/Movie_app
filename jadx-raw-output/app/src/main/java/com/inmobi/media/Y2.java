package com.inmobi.media;

import android.content.ContentValues;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Y2 {
    public static final ContentValues a(S2 s10) {
        String string;
        ck.p.j(s10, "<this>");
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(s10.f23478a));
        contentValues.put("url", s10.f23479b);
        contentValues.put("pending_attempts", Integer.valueOf(s10.f23483f));
        contentValues.put("ts", Long.valueOf(s10.f23484g));
        contentValues.put("created_ts", Long.valueOf(s10.f23485h));
        contentValues.put("follow_redirect", Boolean.valueOf(s10.f23481d));
        contentValues.put("ping_in_webview", Boolean.valueOf(s10.f23482e));
        Map map = s10.f23480c;
        if (map != null && !map.isEmpty()) {
            try {
                Map map2 = s10.f23480c;
                ck.p.h(map2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                string = new JSONObject(map2).toString();
            } catch (Exception unused) {
                string = "";
            }
            ck.p.g(string);
            contentValues.put("track_extras", string);
        }
        return contentValues;
    }
}
