package com.iab.omid.library.appodeal.adsession.media;

import com.iab.omid.library.appodeal.utils.d;
import com.iab.omid.library.appodeal.utils.g;
import com.ironsource.C3426d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f21084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f21086d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f21083a = z10;
        this.f21084b = f10;
        this.f21085c = z11;
        this.f21086d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f21083a);
            if (this.f21083a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f21084b);
            }
            jSONObject.put("autoPlay", this.f21085c);
            jSONObject.put(C3426d4.i.L, this.f21086d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f21086d;
    }

    public Float getSkipOffset() {
        return this.f21084b;
    }

    public boolean isAutoPlay() {
        return this.f21085c;
    }

    public boolean isSkippable() {
        return this.f21083a;
    }
}
