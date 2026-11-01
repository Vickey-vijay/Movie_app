package com.applovin.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class t6 extends v6 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.b f9615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinAdRewardListener f9616h;

    @Override // com.applovin.impl.q6
    public void a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f9615g.getAdZone().e());
        String clCode = this.f9615g.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.q6
    public String f() {
        return "2.0/vr";
    }

    public t6(com.applovin.impl.sdk.ad.b bVar, AppLovinAdRewardListener appLovinAdRewardListener, com.applovin.impl.sdk.k kVar) {
        super("TaskValidateAppLovinReward", kVar);
        this.f9615g = bVar;
        this.f9616h = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.v6
    public boolean h() {
        return this.f9615g.K0();
    }

    @Override // com.applovin.impl.v6
    public void a(o4 o4Var) {
        this.f9615g.a(o4Var);
        String strB = o4Var.b();
        Map<String, String> mapA = o4Var.a();
        if (strB.equals("accepted")) {
            this.f9616h.userRewardVerified(this.f9615g, mapA);
            return;
        }
        if (strB.equals("quota_exceeded")) {
            this.f9616h.userOverQuota(this.f9615g, mapA);
        } else if (strB.equals("rejected")) {
            this.f9616h.userRewardRejected(this.f9615g, mapA);
        } else {
            this.f9616h.validationRequestFailed(this.f9615g, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.q6
    public void a(int i10) {
        String str;
        super.a(i10);
        if (i10 >= 400 && i10 < 500) {
            this.f9616h.userRewardRejected(this.f9615g, Collections.emptyMap());
            str = "rejected";
        } else {
            this.f9616h.validationRequestFailed(this.f9615g, i10);
            str = "network_timeout";
        }
        this.f9615g.a(o4.a(str));
    }
}
