package com.iab.omid.library.bigosg.adsession.media;

import com.iab.omid.library.bigosg.d.c;
import com.iab.omid.library.bigosg.d.e;
import com.ironsource.C3426d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f21224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f21226d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f21223a = z10;
        this.f21224b = f10;
        this.f21225c = z11;
        this.f21226d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f21223a);
            if (this.f21223a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f21224b);
            }
            jSONObject.put("autoPlay", this.f21225c);
            jSONObject.put(C3426d4.i.L, this.f21226d);
        } catch (JSONException e10) {
            c.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f21226d;
    }

    public final Float getSkipOffset() {
        return this.f21224b;
    }

    public final boolean isAutoPlay() {
        return this.f21225c;
    }

    public final boolean isSkippable() {
        return this.f21223a;
    }
}
