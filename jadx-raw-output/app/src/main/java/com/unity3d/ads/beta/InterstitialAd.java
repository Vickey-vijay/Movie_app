package com.unity3d.ads.beta;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import ck.i;
import ck.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* JADX INFO: compiled from: InterstitialAd.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InterstitialAd {
    public static final Companion Companion = new Companion(null);
    private final AdObject adObject;
    private final LoadOptions loadOptions;

    /* JADX INFO: compiled from: InterstitialAd.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final void load(LoadOptions loadOptions, LoadListener<InterstitialAd> loadListener) {
            p.j(loadOptions, "options");
            p.j(loadListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        }
    }

    public static final void load(LoadOptions loadOptions, LoadListener<InterstitialAd> loadListener) {
        Companion.load(loadOptions, loadListener);
    }

    public final void show(Activity activity, ShowOptions showOptions, ShowListener<InterstitialAd> showListener) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        p.j(showListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
    }

    public InterstitialAd(AdObject adObject, LoadOptions loadOptions) {
        p.j(adObject, "adObject");
        p.j(loadOptions, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        this.adObject = adObject;
        this.loadOptions = loadOptions;
    }
}
