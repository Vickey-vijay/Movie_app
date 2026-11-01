package com.iab.omid.library.applovin.adsession.media;

import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import com.ironsource.C3426d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f20948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f20949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f20951d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f20948a = z10;
        this.f20949b = f10;
        this.f20950c = z11;
        this.f20951d = position;
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
            jSONObject.put("skippable", this.f20948a);
            if (this.f20948a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f20949b);
            }
            jSONObject.put("autoPlay", this.f20950c);
            jSONObject.put(C3426d4.i.L, this.f20951d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f20951d;
    }

    public Float getSkipOffset() {
        return this.f20949b;
    }

    public boolean isAutoPlay() {
        return this.f20950c;
    }

    public boolean isSkippable() {
        return this.f20948a;
    }
}
