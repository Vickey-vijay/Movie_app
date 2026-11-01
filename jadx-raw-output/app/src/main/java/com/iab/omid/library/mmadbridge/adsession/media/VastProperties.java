package com.iab.omid.library.mmadbridge.adsession.media;

import com.iab.omid.library.mmadbridge.utils.d;
import com.iab.omid.library.mmadbridge.utils.g;
import com.ironsource.C3426d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f21881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f21883d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f21880a = z10;
        this.f21881b = f10;
        this.f21882c = z11;
        this.f21883d = position;
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
            jSONObject.put("skippable", this.f21880a);
            if (this.f21880a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f21881b);
            }
            jSONObject.put("autoPlay", this.f21882c);
            jSONObject.put(C3426d4.i.L, this.f21883d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f21883d;
    }

    public Float getSkipOffset() {
        return this.f21881b;
    }

    public boolean isAutoPlay() {
        return this.f21882c;
    }

    public boolean isSkippable() {
        return this.f21880a;
    }
}
