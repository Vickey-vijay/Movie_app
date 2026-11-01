package com.unity3d.services.ads.gmascar.utils;

import ck.p;
import com.ironsource.C3754ve;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import com.unity3d.services.core.configuration.IExperiments;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ScarAdFormatProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ScarAdFormatProvider implements IScarAdFormatProvider {
    private final IExperiments experiments;
    private final TokenConfiguration tokenConfiguration;

    /* JADX INFO: compiled from: ScarAdFormatProvider.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdFormat.values().length];
            try {
                iArr[AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ScarAdFormatProvider(TokenConfiguration tokenConfiguration, IExperiments iExperiments) {
        p.j(iExperiments, C3754ve.f31473d);
        this.tokenConfiguration = tokenConfiguration;
        this.experiments = iExperiments;
    }

    @Override // com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider
    public List<UnityAdFormat> buildAdFormatList() {
        ArrayList arrayList = new ArrayList();
        TokenConfiguration tokenConfiguration = this.tokenConfiguration;
        if (tokenConfiguration == null) {
            arrayList.add(UnityAdFormat.REWARDED);
            arrayList.add(UnityAdFormat.INTERSTITIAL);
            if (this.experiments.isScarBannerHbEnabled()) {
                arrayList.add(UnityAdFormat.BANNER);
            }
        } else {
            if (WhenMappings.$EnumSwitchMapping$0[tokenConfiguration.getAdFormat().ordinal()] != 1) {
                arrayList.add(AdFormatExtensions.toUnityAdFormat(this.tokenConfiguration.getAdFormat()));
            } else if (this.experiments.isScarBannerHbEnabled()) {
                arrayList.add(UnityAdFormat.BANNER);
            }
        }
        return arrayList;
    }

    public final IExperiments getExperiments() {
        return this.experiments;
    }

    public final TokenConfiguration getTokenConfiguration() {
        return this.tokenConfiguration;
    }
}
