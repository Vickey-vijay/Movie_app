package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class t0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f15200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f15201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Integer f15202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f15203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Orientation f15204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f15205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f15206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Skip f15207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TapAction f15208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public UnitDisplayType f15209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f15210k;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "autoPlay", this.f15200a);
        c1.a(jSONObject, VastAttributes.MAX_BITRATE, this.f15201b);
        c1.a(jSONObject, VastAttributes.MIN_BITRATE, this.f15202c);
        c1.a(jSONObject, "muted", this.f15203d);
        c1.a(jSONObject, "orientation", this.f15204e);
        c1.a(jSONObject, VastAttributes.PADDING, this.f15205f);
        c1.a(jSONObject, "pivotBitrate", this.f15206g);
        c1.a(jSONObject, "skip", this.f15207h);
        c1.a(jSONObject, "tapAction", this.f15208i);
        c1.a(jSONObject, "unitDisplayType", this.f15209j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.f15210k;
        if (list != null) {
            for (Integer num : list) {
                if (num != null) {
                    jSONArray.put(num);
                }
            }
        }
        c1.a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }

    public t0() {
        Boolean bool = Boolean.TRUE;
        this.f15200a = bool;
        this.f15201b = 5000;
        this.f15202c = 0;
        this.f15203d = bool;
        this.f15205f = 0;
        this.f15206g = 2048;
        this.f15207h = Skip.fromValue(0);
        this.f15210k = new ArrayList();
    }
}
