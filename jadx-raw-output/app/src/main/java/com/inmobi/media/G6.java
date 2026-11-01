package com.inmobi.media;

import io.bidmachine.iab.vast.tags.VastAttributes;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class G6 {
    public static final JSONObject a(F6 f10) throws JSONException {
        ck.p.j(f10, "<this>");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(VastAttributes.HORIZONTAL_POSITION, Float.valueOf(F3.a(f10.f22619a)));
        jSONObject.put(VastAttributes.VERTICAL_POSITION, Float.valueOf(F3.a(f10.f22620b)));
        jSONObject.put("width", f10.f22621c);
        jSONObject.put("height", f10.f22622d);
        return jSONObject;
    }
}
