package com.iab.omid.library.vungle.adsession.media;

import com.iab.omid.library.vungle.utils.d;
import com.iab.omid.library.vungle.utils.g;
import com.ironsource.C3426d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f22144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f22146d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f22143a = z10;
        this.f22144b = f10;
        this.f22145c = z11;
        this.f22146d = position;
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
            jSONObject.put("skippable", this.f22143a);
            if (this.f22143a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f22144b);
            }
            jSONObject.put("autoPlay", this.f22145c);
            jSONObject.put(C3426d4.i.L, this.f22146d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f22146d;
    }

    public Float getSkipOffset() {
        return this.f22144b;
    }

    public boolean isAutoPlay() {
        return this.f22145c;
    }

    public boolean isSkippable() {
        return this.f22143a;
    }
}
