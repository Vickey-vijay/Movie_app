package com.mbridge.msdk.video.signal.impl;

import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.tools.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: JSRewardVideoV1Diff.java */
/* JADX INFO: loaded from: classes10.dex */
public class p extends g {
    public void a(JSONObject jSONObject) {
        try {
            jSONObject.put(C3426d4.i.G, new t(com.mbridge.msdk.foundation.controller.c.n().d()).a());
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }
}
