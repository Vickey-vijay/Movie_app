package com.iab.omid.library.bytedance2.adsession.media;

import com.iab.omid.library.bytedance2.utils.d;
import com.iab.omid.library.bytedance2.utils.g;
import com.ironsource.C3426d4;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f21340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f21342d;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position) {
        this.f21339a = z10;
        this.f21340b = f10;
        this.f21341c = z11;
        this.f21342d = position;
    }

    public static VastProperties createVastPropertiesForNonSkippableMedia(boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(false, null, z10, position);
    }

    public static VastProperties createVastPropertiesForSkippableMedia(float f10, boolean z10, Position position) {
        g.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position);
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f21339a);
            if (this.f21339a) {
                jSONObject.put(UnifiedMediationParams.KEY_SKIP_OFFSET, this.f21340b);
            }
            jSONObject.put("autoPlay", this.f21341c);
            jSONObject.put(C3426d4.i.L, this.f21342d);
        } catch (JSONException e10) {
            d.a("VastProperties: JSON error", e10);
        }
        return jSONObject;
    }

    public final Position getPosition() {
        return this.f21342d;
    }

    public final Float getSkipOffset() {
        return this.f21340b;
    }

    public final boolean isAutoPlay() {
        return this.f21341c;
    }

    public final boolean isSkippable() {
        return this.f21339a;
    }
}
