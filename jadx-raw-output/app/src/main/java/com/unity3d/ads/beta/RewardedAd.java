package com.unity3d.ads.beta;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.i;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: compiled from: RewardedAd.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class RewardedAd {
    public static final Companion Companion = new Companion(null);
    private final AdObject adObject;
    private final LoadOptions loadOptions;

    /* JADX INFO: compiled from: RewardedAd.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final void load(LoadOptions loadOptions, LoadListener<RewardedAd> loadListener) {
            p.j(loadOptions, "options");
            p.j(loadListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
    }

    public static final void load(LoadOptions loadOptions, LoadListener<RewardedAd> loadListener) {
        Companion.load(loadOptions, loadListener);
    }

    public final void show(Activity activity, ShowOptions showOptions, RewardedShowListener rewardedShowListener) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        p.j(rewardedShowListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public RewardedAd(AdObject adObject, LoadOptions loadOptions) {
        p.j(adObject, "adObject");
        p.j(loadOptions, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        this.adObject = adObject;
        this.loadOptions = loadOptions;
    }

    public static /* synthetic */ void show$default(RewardedAd rewardedAd, Activity activity, ShowOptions showOptions, RewardedShowListener rewardedShowListener, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            showOptions = null;
        }
        rewardedAd.show(activity, showOptions, rewardedShowListener);
    }
}
