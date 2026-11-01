package com.vungle.ads.internal.omsdk;

import android.util.Base64;
import android.view.View;
import bk.l;
import ck.p;
import ck.s;
import cl.d;
import cl.m;
import com.iab.omid.library.vungle.Omid;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.CreativeType;
import com.iab.omid.library.vungle.adsession.ImpressionType;
import com.iab.omid.library.vungle.adsession.Owner;
import com.iab.omid.library.vungle.adsession.Partner;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.mbridge.msdk.MBridgeConstans;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.internal.model.OmSdkData;
import com.vungle.ads.internal.util.Logger;
import java.net.URL;
import kotlin.Metadata;
import lk.c;
import mj.r;
import xk.b;
import xk.h;

/* JADX INFO: compiled from: NativeOMTracker.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/vungle/ads/internal/omsdk/NativeOMTracker;", "", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lmj/r;", "start", "stop", "impressionOccurred", "Lcl/a;", "json", "Lcl/a;", "Lcom/iab/omid/library/vungle/adsession/AdSession;", "adSession", "Lcom/iab/omid/library/vungle/adsession/AdSession;", "Lcom/iab/omid/library/vungle/adsession/AdEvents;", "adEvents", "Lcom/iab/omid/library/vungle/adsession/AdEvents;", "", "omSdkData", "omSdkJS", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class NativeOMTracker {
    private AdEvents adEvents;
    private AdSession adSession;
    private final cl.a json;

    public NativeOMTracker(String str, String str2) {
        OmSdkData omSdkData;
        p.j(str, "omSdkData");
        p.j(str2, "omSdkJS");
        cl.a aVarB = m.b(null, new l<d, r>() { // from class: com.vungle.ads.internal.omsdk.NativeOMTracker$json$1
            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(d dVar) {
                invoke2(dVar);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(d dVar) {
                p.j(dVar, "$this$Json");
                dVar.f(true);
                dVar.d(true);
                dVar.e(false);
            }
        }, 1, null);
        this.json = aVarB;
        try {
            AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
            Partner partnerCreatePartner = Partner.createPartner(BuildConfig.OMSDK_PARTNER_NAME, BuildConfig.VERSION_NAME);
            byte[] bArrDecode = Base64.decode(str, 0);
            if (bArrDecode != null) {
                String str3 = new String(bArrDecode, c.f63591b);
                b<Object> bVarB = h.b(aVarB.a(), s.l(OmSdkData.class));
                p.h(bVarB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                omSdkData = (OmSdkData) aVarB.b(bVarB, str3);
            } else {
                omSdkData = null;
            }
            VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(omSdkData != null ? omSdkData.getVendorKey() : null, new URL(omSdkData != null ? omSdkData.getVendorURL() : null), omSdkData != null ? omSdkData.getParams() : null);
            p.i(verificationScriptResourceCreateVerificationScriptResourceWithParameters, "verificationScriptResource");
            this.adSession = AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(partnerCreatePartner, str2, nj.r.e(verificationScriptResourceCreateVerificationScriptResourceWithParameters), null, null));
        } catch (Exception e10) {
            Logger.INSTANCE.e("NativeOMTracker", "error occured when create omsdk adSession:", e10);
        }
    }

    public final void impressionOccurred() {
        AdEvents adEvents = this.adEvents;
        if (adEvents != null) {
            adEvents.impressionOccurred();
        }
    }

    public final void stop() {
        AdSession adSession = this.adSession;
        if (adSession != null) {
            adSession.finish();
        }
        this.adSession = null;
    }

    public final void start(View view) {
        AdSession adSession;
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        if (Omid.isActive() && (adSession = this.adSession) != null) {
            adSession.registerAdView(view);
            adSession.start();
            AdEvents adEventsCreateAdEvents = AdEvents.createAdEvents(adSession);
            this.adEvents = adEventsCreateAdEvents;
            if (adEventsCreateAdEvents != null) {
                adEventsCreateAdEvents.loaded();
            }
        }
    }
}
