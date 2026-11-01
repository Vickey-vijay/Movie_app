package com.iab.omid.library.fyber.adsession.media;

import com.iab.omid.library.fyber.utils.d;
import com.iab.omid.library.fyber.utils.g;
import com.ironsource.C3426d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f21470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f21472d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f21469a = z10;
        this.f21470b = f10;
        this.f21471c = z11;
        this.f21472d = position;
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
            jSONObject.put("skippable", this.f21469a);
            if (this.f21469a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f21470b);
            }
            jSONObject.put("autoPlay", this.f21471c);
            jSONObject.put(C3426d4.i.L, this.f21472d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f21472d;
    }

    public Float getSkipOffset() {
        return this.f21470b;
    }

    public boolean isAutoPlay() {
        return this.f21471c;
    }

    public boolean isSkippable() {
        return this.f21469a;
    }
}
