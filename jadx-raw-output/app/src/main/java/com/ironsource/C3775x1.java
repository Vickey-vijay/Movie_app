package com.ironsource;

import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.unity3d.mediation.LevelPlay;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3775x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<LevelPlay.AdFormat, C3638p> f31566a;

    public C3775x1(JSONObject jSONObject) {
        ck.p.j(jSONObject, "applicationAuctionSettings");
        LevelPlay.AdFormat[] adFormatArrValues = LevelPlay.AdFormat.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ik.k.d(nj.l0.f(adFormatArrValues.length), 16));
        for (LevelPlay.AdFormat adFormat : adFormatArrValues) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(C3772wf.a(adFormat));
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = IronSourceVideoBridge.jsonObjectInit();
            } else {
                ck.p.i(jSONObjectOptJSONObject, "applicationAuctionSettin…ormatKey) ?: JSONObject()");
            }
            linkedHashMap.put(adFormat, new C3638p(jSONObjectOptJSONObject));
        }
        this.f31566a = linkedHashMap;
    }

    public final Map<LevelPlay.AdFormat, C3638p> a() {
        return this.f31566a;
    }
}
