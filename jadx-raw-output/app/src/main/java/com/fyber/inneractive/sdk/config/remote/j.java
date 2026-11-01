package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f15180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f15181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f15182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Skip f15183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f15184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TapAction f15185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Orientation f15186g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f15187h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Integer f15188i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UnitDisplayType f15189j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f15190k = new ArrayList();

    public static j a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        j jVar = new j();
        int iOptInt = jSONObject.optInt(VastAttributes.MAX_BITRATE, Integer.MIN_VALUE);
        Integer numValueOf = Integer.valueOf(iOptInt);
        int iOptInt2 = jSONObject.optInt(VastAttributes.MIN_BITRATE, Integer.MIN_VALUE);
        Integer numValueOf2 = Integer.valueOf(iOptInt2);
        int iOptInt3 = jSONObject.optInt("pivotBitrate", Integer.MIN_VALUE);
        Integer numValueOf3 = Integer.valueOf(iOptInt3);
        int iOptInt4 = jSONObject.optInt(VastAttributes.PADDING, Integer.MIN_VALUE);
        Integer numValueOf4 = Integer.valueOf(iOptInt4);
        if (iOptInt == Integer.MIN_VALUE) {
            numValueOf = null;
        }
        jVar.f15181b = numValueOf;
        if (iOptInt2 == Integer.MIN_VALUE) {
            numValueOf2 = null;
        }
        jVar.f15182c = numValueOf2;
        jVar.f15183d = Skip.fromValue(Integer.valueOf(jSONObject.optInt("skip", Integer.MIN_VALUE)));
        jVar.f15184e = jSONObject.has("muted") ? Boolean.valueOf(jSONObject.optBoolean("muted", true)) : null;
        jVar.f15180a = jSONObject.has("autoPlay") ? Boolean.valueOf(jSONObject.optBoolean("autoPlay", true)) : null;
        jVar.f15186g = Orientation.fromValue(jSONObject.optString("orientation"));
        jVar.f15185f = TapAction.fromValue(jSONObject.optString("tap"));
        if (iOptInt3 == Integer.MIN_VALUE) {
            numValueOf3 = null;
        }
        jVar.f15187h = numValueOf3;
        jVar.f15188i = iOptInt4 != Integer.MIN_VALUE ? numValueOf4 : null;
        jVar.f15189j = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("filterApi");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                int iOptInt5 = jSONArrayOptJSONArray.optInt(i10, Integer.MIN_VALUE);
                if (iOptInt5 != Integer.MIN_VALUE) {
                    jVar.f15190k.add(Integer.valueOf(iOptInt5));
                }
            }
        }
        return jVar;
    }
}
