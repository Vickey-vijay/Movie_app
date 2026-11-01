package com.iab.omid.library.ironsrc.adsession.media;

import com.iab.omid.library.ironsrc.utils.d;
import com.iab.omid.library.ironsrc.utils.g;
import com.ironsource.C3426d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f21746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f21748d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f21745a = z10;
        this.f21746b = f10;
        this.f21747c = z11;
        this.f21748d = position;
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
            jSONObject.put("skippable", this.f21745a);
            if (this.f21745a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f21746b);
            }
            jSONObject.put("autoPlay", this.f21747c);
            jSONObject.put(C3426d4.i.L, this.f21748d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f21748d;
    }

    public Float getSkipOffset() {
        return this.f21746b;
    }

    public boolean isAutoPlay() {
        return this.f21747c;
    }

    public boolean isSkippable() {
        return this.f21745a;
    }
}
