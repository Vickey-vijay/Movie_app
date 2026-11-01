package com.iab.omid.library.unity3d.adsession.media;

import com.iab.omid.library.unity3d.utils.d;
import com.iab.omid.library.unity3d.utils.g;
import com.ironsource.C3426d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f22016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f22017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f22018c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f22019d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f22016a = z10;
        this.f22017b = f10;
        this.f22018c = z11;
        this.f22019d = position;
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
            jSONObject.put("skippable", this.f22016a);
            if (this.f22016a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f22017b);
            }
            jSONObject.put("autoPlay", this.f22018c);
            jSONObject.put(C3426d4.i.L, this.f22019d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public Position getPosition() {
        return this.f22019d;
    }

    public Float getSkipOffset() {
        return this.f22017b;
    }

    public boolean isAutoPlay() {
        return this.f22018c;
    }

    public boolean isSkippable() {
        return this.f22016a;
    }
}
