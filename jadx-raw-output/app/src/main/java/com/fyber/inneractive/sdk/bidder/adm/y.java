package com.fyber.inneractive.sdk.bidder.adm;

import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.flow.c0;
import com.fyber.inneractive.sdk.network.f1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class y implements com.fyber.inneractive.sdk.response.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdmParametersOuterClass$AdmParameters f14879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f14882d;

    public final void a(c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        try {
            AdmParametersOuterClass$AdmParameters from = AdmParametersOuterClass$AdmParameters.parseFrom(Base64.decode(this.f14880b, 0));
            this.f14879a = from;
            if (from != null) {
                c0Var.a();
            }
            b(c0Var, rVar);
        } catch (Exception e10) {
            IAlog.f("failed to parse ad markup payload %s", e10.getMessage());
            com.fyber.inneractive.sdk.util.r.f18607b.post(new u(c0Var, e10));
        }
    }

    public final void b(c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f14879a;
        com.fyber.inneractive.sdk.response.e eVar = null;
        String markupUrl = (admParametersOuterClass$AdmParameters == null || !admParametersOuterClass$AdmParameters.hasMarkupUrl()) ? null : this.f14879a.getMarkupUrl();
        if (TextUtils.isEmpty(markupUrl)) {
            com.fyber.inneractive.sdk.util.r.f18607b.post(new x(c0Var));
            return;
        }
        try {
            AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = this.f14879a;
            int iA = admParametersOuterClass$AdmParameters2 != null ? admParametersOuterClass$AdmParameters2.getAdType().a() : c.OTHER.a();
            com.fyber.inneractive.sdk.response.a aVarA = com.fyber.inneractive.sdk.response.a.a(iA);
            if (aVarA == null) {
                aVarA = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.factories.e eVar2 = (com.fyber.inneractive.sdk.factories.e) com.fyber.inneractive.sdk.factories.d.f15324a.f15325a.get(aVarA);
            com.fyber.inneractive.sdk.response.b bVarB = eVar2 != null ? eVar2.b() : null;
            if (bVarB != null) {
                bVarB.f18421a = bVarB.a();
                a(bVarB);
                eVar = bVarB.f18421a;
            } else {
                IAlog.a("failed parse adm network request with no input stream - received ad type %s does not have an appropriate parser", Integer.valueOf(iA));
            }
        } catch (Exception e10) {
            IAlog.a("failed parse adm network request with no input stream", e10, new Object[0]);
        }
        com.fyber.inneractive.sdk.response.e eVar3 = eVar;
        f1 f1Var = new f1(new v(this, c0Var, eVar3), markupUrl, this, rVar, eVar3);
        f1Var.f16088d = new w(this);
        IAConfigManager.O.f15024s.a(f1Var);
    }

    public y(String str, String str2) {
        this.f14880b = str;
        this.f14882d = str2;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x0363  */
    @Override // com.fyber.inneractive.sdk.response.j
    public final void a(com.fyber.inneractive.sdk.response.b bVar) {
        int i10;
        com.fyber.inneractive.sdk.ignite.m mVar;
        bVar.f18421a.D = true;
        IAConfigManager.O.f15029x.f15225e = true;
        ImpressionData impressionData = new ImpressionData();
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f14879a;
        if (admParametersOuterClass$AdmParameters == null) {
            return;
        }
        int iA = admParametersOuterClass$AdmParameters.getAdType().a();
        if (this.f14879a.hasErrorMessage()) {
            this.f14879a.getErrorMessage();
        }
        String sessionId = this.f14879a.hasSessionId() ? this.f14879a.getSessionId() : null;
        Long lValueOf = this.f14879a.hasContentId() ? Long.valueOf(this.f14879a.getContentId()) : null;
        if (this.f14879a.hasPublisherId()) {
            this.f14879a.getPublisherId();
        }
        Integer numValueOf = this.f14879a.hasAdWidth() ? Integer.valueOf(this.f14879a.getAdWidth()) : null;
        Integer numValueOf2 = this.f14879a.hasAdHeight() ? Integer.valueOf(this.f14879a.getAdHeight()) : null;
        String sdkImpressionUrl = this.f14879a.hasSdkImpressionUrl() ? this.f14879a.getSdkImpressionUrl() : null;
        String sdkClickUrl = this.f14879a.hasSdkClickUrl() ? this.f14879a.getSdkClickUrl() : null;
        Integer numValueOf3 = this.f14879a.hasAdExpirationInterval() ? Integer.valueOf(this.f14879a.getAdExpirationInterval()) : null;
        String adCompletionUrl = this.f14879a.hasAdCompletionUrl() ? this.f14879a.getAdCompletionUrl() : null;
        String attributionImpressionUrl = this.f14879a.hasAttributionImpressionUrl() ? this.f14879a.getAttributionImpressionUrl() : null;
        String attributionClickUrl = this.f14879a.hasAttributionClickUrl() ? this.f14879a.getAttributionClickUrl() : null;
        bVar.f18422b = this.f14879a.hasAdUnitId() ? this.f14879a.getAdUnitId() : null;
        String strName = this.f14879a.getAdUnitType().name();
        Locale locale = Locale.US;
        strName.toLowerCase(locale);
        String lowerCase = this.f14879a.hasAdUnitId() ? this.f14879a.getAdUnitDisplayType().name().toLowerCase(locale) : null;
        String adNetworkName = this.f14879a.hasAdNetworkName() ? this.f14879a.getAdNetworkName() : null;
        Long lValueOf2 = this.f14879a.hasAdNetworkId() ? Long.valueOf(this.f14879a.getAdNetworkId()) : null;
        String creativeId = this.f14879a.hasCreativeId() ? this.f14879a.getCreativeId() : null;
        String adDomain = this.f14879a.hasAdDomain() ? this.f14879a.getAdDomain() : null;
        String appBundleId = this.f14879a.hasAppBundleId() ? this.f14879a.getAppBundleId() : null;
        String campaignId = this.f14879a.hasCampaignId() ? this.f14879a.getCampaignId() : null;
        String string = this.f14879a.hasPricingValue() ? Double.toString(this.f14879a.getPricingValue()) : null;
        String strValueOf = this.f14879a.hasSpotId() ? String.valueOf(this.f14879a.getSpotId()) : null;
        impressionData.setCpmValue(string);
        impressionData.setCurrency("USD");
        if (this.f14879a.hasMrcData()) {
            int pixelPercent = this.f14879a.getMrcData().hasPixelPercent() ? this.f14879a.getMrcData().getPixelPercent() : 0;
            int pixelDuration = this.f14879a.getMrcData().hasPixelDuration() ? this.f14879a.getMrcData().getPixelDuration() : -1;
            String pixelImpressionUrl = this.f14879a.getMrcData().hasPixelImpressionUrl() ? this.f14879a.getMrcData().getPixelImpressionUrl() : null;
            com.fyber.inneractive.sdk.response.e eVar = bVar.f18421a;
            eVar.f18453v = pixelPercent;
            eVar.f18454w = pixelDuration;
            eVar.f18455x = pixelImpressionUrl;
        } else {
            numValueOf2 = numValueOf2;
            sdkImpressionUrl = sdkImpressionUrl;
            sdkClickUrl = sdkClickUrl;
        }
        Boolean boolValueOf = this.f14879a.hasSkipMode() ? Boolean.valueOf(this.f14879a.getSkipMode()) : null;
        if (bVar.c()) {
            bVar.f18421a.f18450s = this.f14879a.toString();
        }
        bVar.f18421a.a(numValueOf3 != null ? numValueOf3.toString() : "");
        impressionData.setImpressionId(sessionId);
        impressionData.setDemandSource(adNetworkName);
        bVar.f18421a.f18435d = lValueOf != null ? lValueOf.toString() : "";
        bVar.f18421a.getClass();
        bVar.f18421a.getClass();
        com.fyber.inneractive.sdk.response.e eVar2 = bVar.f18421a;
        eVar2.A = appBundleId;
        eVar2.B = this.f14882d;
        eVar2.C = strValueOf;
        if (lValueOf2 != null) {
            impressionData.setDemandId(lValueOf2);
        }
        com.fyber.inneractive.sdk.response.e eVar3 = bVar.f18421a;
        eVar3.f18438g = iA;
        if (numValueOf != null) {
            eVar3.f18436e = numValueOf.intValue();
        }
        if (numValueOf2 != null) {
            bVar.f18421a.f18437f = numValueOf2.intValue();
        }
        com.fyber.inneractive.sdk.response.e eVar4 = bVar.f18421a;
        eVar4.f18442k = sdkImpressionUrl;
        eVar4.f18443l = sdkClickUrl;
        eVar4.f18448q = adCompletionUrl;
        eVar4.f18444m = attributionImpressionUrl;
        eVar4.f18445n = attributionClickUrl;
        eVar4.f18446o = bVar.f18422b;
        try {
            eVar4.f18447p = UnitDisplayType.fromValue(lowerCase);
        } catch (IllegalArgumentException unused) {
            bVar.f18421a.f18447p = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(creativeId)) {
            impressionData.setCreativeId(creativeId);
        }
        if (!TextUtils.isEmpty(adDomain)) {
            impressionData.setAdvertiserDomain(adDomain);
        }
        if (!TextUtils.isEmpty(campaignId)) {
            impressionData.setCampaignId(campaignId);
        }
        impressionData.setCountry(com.fyber.inneractive.sdk.util.k.i());
        bVar.f18421a.f18451t = impressionData;
        if (boolValueOf == null) {
            i10 = -1;
        } else {
            i10 = boolValueOf.booleanValue() ? 1 : 0;
        }
        bVar.f18421a.f18456y = i10;
        String igniteInstallUrl = this.f14879a.hasIgniteInstallUrl() ? this.f14879a.getIgniteInstallUrl() : null;
        if (!TextUtils.isEmpty(igniteInstallUrl)) {
            bVar.f18421a.G = igniteInstallUrl;
        }
        com.fyber.inneractive.sdk.response.e eVar5 = bVar.f18421a;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = this.f14879a;
        if (admParametersOuterClass$AdmParameters2 == null) {
            mVar = mVar2;
        } else {
            n igniteMode = admParametersOuterClass$AdmParameters2.hasIgniteMode() ? this.f14879a.getIgniteMode() : null;
            if (igniteMode == null || igniteMode.equals(n.NONE)) {
                mVar = mVar2;
            } else {
                mVar = igniteMode.equals(n.SINGLETAP) ? com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP;
            }
        }
        if (mVar != null) {
            mVar2 = mVar;
        } else {
            eVar5.getClass();
        }
        eVar5.H = mVar2;
        String igniteLauncherActivity = this.f14879a.hasIgniteLauncherActivity() ? this.f14879a.getIgniteLauncherActivity() : null;
        if (!TextUtils.isEmpty(igniteLauncherActivity)) {
            bVar.f18421a.I = igniteLauncherActivity;
        }
        Boolean boolValueOf2 = this.f14879a.hasBrandBidderDontShowEndcard() ? Boolean.valueOf(this.f14879a.getBrandBidderDontShowEndcard()) : null;
        if (boolValueOf2 != null) {
            bVar.f18421a.E = boolValueOf2.booleanValue() ? "1" : "0";
        }
        String brandBidderCtaText = this.f14879a.getBrandBidderCtaText();
        if (!TextUtils.isEmpty(brandBidderCtaText)) {
            bVar.f18421a.F = brandBidderCtaText;
        }
        Boolean boolValueOf3 = this.f14879a.hasMraidVideoOMSignal() ? Boolean.valueOf(this.f14879a.getMraidVideoOMSignal()) : null;
        if (boolValueOf3 != null) {
            bVar.f18421a.J = boolValueOf3.booleanValue();
        }
        bVar.f18421a.M = CreativeType.fromValue(this.f14879a.getCreativeType());
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public final String a() {
        return this.f14881c;
    }
}
