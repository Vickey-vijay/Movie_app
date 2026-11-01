package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f15130a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public UnitDisplayType f15131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f15132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Integer f15133d;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, ToolBar.REFRESH, this.f15130a);
        c1.a(jSONObject, "unitDisplayType", this.f15131b);
        c1.a(jSONObject, "close", this.f15132c);
        c1.a(jSONObject, "hideDelay", this.f15133d);
        return jSONObject;
    }
}
