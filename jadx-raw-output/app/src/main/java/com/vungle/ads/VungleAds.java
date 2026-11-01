package com.vungle.ads;

import android.app.Application;
import android.content.Context;
import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.VungleInitializer;
import com.vungle.ads.internal.VungleInternal;
import com.vungle.ads.internal.model.Placement;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;

/* JADX INFO: compiled from: VungleAds.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/vungle/ads/VungleAds;", "", "()V", VastTagName.COMPANION, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VungleAds {
    public static final String TAG = "VungleAds";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static VungleInternal vungleInternal = new VungleInternal();
    private static VungleInitializer initializer = new VungleInitializer();
    public static final FirstPartyData firstPartyData = new FirstPartyData();

    /* JADX INFO: compiled from: VungleAds.kt */
    @Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\fH\u0007J\b\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/vungle/ads/VungleAds$Companion;", "", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "", "appId", "Lcom/vungle/ads/InitializationListener;", "callback", "Lmj/r;", C3426d4.a.f28413f, "", "isInitialized", "Lcom/vungle/ads/BidTokenCallback;", "getBiddingToken", "getSdkVersion", "placementId", "isInline", "Lcom/vungle/ads/VungleWrapperFramework;", "wrapperFramework", "wrapperFrameworkVersion", "setIntegrationName", "deInit", "TAG", "Ljava/lang/String;", "Lcom/vungle/ads/fpd/FirstPartyData;", "firstPartyData", "Lcom/vungle/ads/fpd/FirstPartyData;", "Lcom/vungle/ads/internal/VungleInitializer;", "initializer", "Lcom/vungle/ads/internal/VungleInitializer;", "Lcom/vungle/ads/internal/VungleInternal;", "vungleInternal", "Lcom/vungle/ads/internal/VungleInternal;", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final void deInit(Context context) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            VungleAds.initializer.deInit$vungle_ads_release();
        }

        public final void getBiddingToken(Context context, BidTokenCallback bidTokenCallback) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(bidTokenCallback, "callback");
            VungleAds.vungleInternal.getAvailableBidTokensAsync(context, bidTokenCallback);
        }

        public final void init(Context context, String str, InitializationListener initializationListener) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(str, "appId");
            p.j(initializationListener, "callback");
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            VungleInitializer vungleInitializer = VungleAds.initializer;
            p.i(context, "appContext");
            vungleInitializer.init(str, context, initializationListener);
        }

        public final boolean isInline(String placementId) {
            p.j(placementId, "placementId");
            Placement placement = ConfigManager.INSTANCE.getPlacement(placementId);
            if (placement != null) {
                return placement.isInline();
            }
            return false;
        }

        public final String getSdkVersion() {
            return VungleAds.vungleInternal.getSdkVersion();
        }

        public final boolean isInitialized() {
            return VungleAds.initializer.isInitialized();
        }

        public final void setIntegrationName(VungleWrapperFramework vungleWrapperFramework, String str) {
            p.j(vungleWrapperFramework, "wrapperFramework");
            p.j(str, "wrapperFrameworkVersion");
            VungleAds.initializer.setIntegrationName(vungleWrapperFramework, str);
        }
    }

    public static final void deInit(Context context) {
        INSTANCE.deInit(context);
    }

    public static final void getBiddingToken(Context context, BidTokenCallback bidTokenCallback) {
        INSTANCE.getBiddingToken(context, bidTokenCallback);
    }

    public static final String getSdkVersion() {
        return INSTANCE.getSdkVersion();
    }

    public static final void init(Context context, String str, InitializationListener initializationListener) {
        INSTANCE.init(context, str, initializationListener);
    }

    public static final boolean isInitialized() {
        return INSTANCE.isInitialized();
    }

    public static final boolean isInline(String str) {
        return INSTANCE.isInline(str);
    }

    public static final void setIntegrationName(VungleWrapperFramework vungleWrapperFramework, String str) {
        INSTANCE.setIntegrationName(vungleWrapperFramework, str);
    }
}
