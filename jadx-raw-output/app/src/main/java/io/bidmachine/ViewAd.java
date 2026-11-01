package io.bidmachine;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;
import io.bidmachine.core.Logger;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ViewAd<AdType extends ViewAd<AdType, AdRequestType, AdObjectType, UnifiedAdRequestParamsType, AdListenerType>, AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectType extends ViewAdObject<AdRequestType, ?, UnifiedAdRequestParamsType>, UnifiedAdRequestParamsType extends UnifiedAdRequestParams, AdListenerType extends AdListener<AdType>> extends BidMachineAd<AdType, AdRequestType, AdObjectType, AdObjectParams, UnifiedAdRequestParamsType, AdListenerType> {
    public void show(ViewGroup viewGroup) {
        AdObjectType adobjecttypePrepareShow = prepareShow(false);
        if (adobjecttypePrepareShow == null) {
            return;
        }
        try {
            adobjecttypePrepareShow.show(viewGroup);
        } catch (Throwable th2) {
            Logger.w(th2);
            processShowFail(BMError.throwable("Exception showing view ad object", th2));
        }
    }

    public ViewAd(@NonNull Context context, @NonNull AdsType adsType) {
        super(context, adsType);
    }

    public void hide() {
        AdObjectType loadedAdObject = getLoadedAdObject();
        if (loadedAdObject == null) {
            return;
        }
        loadedAdObject.hide();
    }
}
