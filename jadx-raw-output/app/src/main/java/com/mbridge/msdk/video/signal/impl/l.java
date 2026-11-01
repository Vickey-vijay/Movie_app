package com.mbridge.msdk.video.signal.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: JSCommonDiff.java */
/* JADX INFO: loaded from: classes10.dex */
public class l extends d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f39456s = true;

    public void a(JSONObject jSONObject) {
        try {
            jSONObject.put(C3426d4.i.G, new t(com.mbridge.msdk.foundation.controller.c.n().d()).a());
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void b(JSONObject jSONObject) {
    }

    private com.mbridge.msdk.click.a q() {
        if (this.f39429l == null) {
            this.f39429l = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f39427j);
        }
        return this.f39429l;
    }

    public void a(CampaignEx campaignEx, Context context) {
        String queryParameter;
        try {
            queryParameter = Uri.parse(campaignEx.getNoticeUrl()).getQueryParameter(com.mbridge.msdk.foundation.same.a.f34903m);
        } catch (Throwable unused) {
        }
        this.f39430m.a((!TextUtils.isEmpty(queryParameter) ? Integer.parseInt(queryParameter) : 0) == 2);
        q().a(this.f39430m);
        q().a(campaignEx);
        com.mbridge.msdk.video.module.report.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
    }
}
