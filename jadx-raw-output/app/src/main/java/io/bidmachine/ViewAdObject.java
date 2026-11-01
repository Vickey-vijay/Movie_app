package io.bidmachine;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdRequest;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.internal.utils.visibility.VisibilityTrackerHolder;
import io.bidmachine.internal.utils.visibility.VisibilityTrackerListener;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.unified.UnifiedViewAd;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.ViewHelper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewAdObject<AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, UnifiedAdType extends UnifiedViewAd<UnifiedBannerAdCallback, UnifiedAdRequestParamsType>, UnifiedAdRequestParamsType extends UnifiedAdRequestParams> extends AdObjectImpl<AdRequestType, AdObjectParams, UnifiedAdType, UnifiedBannerAdCallback, UnifiedAdRequestParamsType> {

    @Nullable
    private View adView;
    private int height;

    @NonNull
    private MeasureMode heightMeasureMode;

    @NonNull
    private final VisibilityTrackerHolder visibilityTrackerHolder;
    private int width;

    @NonNull
    private MeasureMode widthMeasureMode;

    public enum MeasureMode {
        Match,
        Wrap,
        Direct;

        public int getSize(@NonNull Context context, int i10) {
            int i11 = b.$SwitchMap$io$bidmachine$ViewAdObject$MeasureMode[ordinal()];
            if (i11 != 1) {
                return i11 != 2 ? -1 : -2;
            }
            return Math.round(i10 * Utils.getScreenDensity(context));
        }
    }

    public class a implements VisibilityTrackerListener {
        public a() {
        }

        @Override // io.bidmachine.internal.utils.visibility.VisibilityTrackerListener
        public boolean onViewShown() {
            return ViewAdObject.this.getProcessCallback().processVisibilityTrackerShown();
        }

        @Override // io.bidmachine.internal.utils.visibility.VisibilityTrackerListener
        public void onViewTrackingFinished() {
            ViewAdObject.this.getProcessCallback().processVisibilityTrackerImpression();
        }
    }

    public static final class c extends AdObjectImpl.BaseUnifiedAdCallback implements UnifiedBannerAdCallback {

        @NonNull
        private final WeakReference<ViewAdObject<?, ?, ?>> weakAdObject;

        @Override // io.bidmachine.unified.UnifiedBannerAdCallback
        public void onAdLoaded(@Nullable View view) {
            ViewAdObject<?, ?, ?> viewAdObject = this.weakAdObject.get();
            if (viewAdObject == null) {
                this.processCallback.processLoadFail(BMError.internal("ViewAdObject is null"));
            } else {
                viewAdObject.setAdView(view);
                this.processCallback.processLoadSuccess();
            }
        }

        public c(@NonNull ViewAdObject<?, ?, ?> viewAdObject, @NonNull AdProcessCallback adProcessCallback) {
            super(adProcessCallback);
            this.weakAdObject = new WeakReference<>(viewAdObject);
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] $SwitchMap$io$bidmachine$ViewAdObject$MeasureMode;

        static {
            int[] iArr = new int[MeasureMode.values().length];
            $SwitchMap$io$bidmachine$ViewAdObject$MeasureMode = iArr;
            try {
                iArr[MeasureMode.Direct.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$bidmachine$ViewAdObject$MeasureMode[MeasureMode.Wrap.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private int getHeight() {
        return this.height;
    }

    private int getScaledHeight(@NonNull Context context) {
        return this.heightMeasureMode.getSize(context, getHeight());
    }

    private int getScaledWidth(@NonNull Context context) {
        return this.widthMeasureMode.getSize(context, getWidth());
    }

    private int getWidth() {
        return this.width;
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    @NonNull
    public UnifiedBannerAdCallback createUnifiedCallback(@NonNull AdProcessCallback adProcessCallback) {
        return new c(this, adProcessCallback);
    }

    @NonNull
    public MeasureMode getHeightMeasureMode() {
        return this.heightMeasureMode;
    }

    @NonNull
    public MeasureMode getWidthMeasureMode() {
        return this.widthMeasureMode;
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setHeightMeasureMode(@NonNull MeasureMode measureMode) {
        this.heightMeasureMode = measureMode;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }

    public void setWidthMeasureMode(@NonNull MeasureMode measureMode) {
        this.widthMeasureMode = measureMode;
    }

    public void show(@Nullable ViewGroup viewGroup) {
        if (viewGroup == null) {
            getUnifiedAdCallback().onAdShowFailed(BMError.notFound("Target container"));
            return;
        }
        View view = this.adView;
        if (view == null) {
            getUnifiedAdCallback().onAdShowFailed(BMError.internal("Ad view is null"));
            return;
        }
        MeasureMode widthMeasureMode = getWidthMeasureMode();
        MeasureMode measureMode = MeasureMode.Direct;
        if ((widthMeasureMode == measureMode && getWidth() == 0) || (getHeightMeasureMode() == measureMode && getHeight() == 0)) {
            getUnifiedAdCallback().onAdShowFailed(BMError.incorrectContent("Width or height are not provided"));
            return;
        }
        Context context = viewGroup.getContext();
        ViewGroup.LayoutParams layoutParams = viewGroup instanceof FrameLayout ? new FrameLayout.LayoutParams(getScaledWidth(context), getScaledHeight(context), 17) : new ViewGroup.LayoutParams(getScaledWidth(context), getScaledHeight(context));
        getProcessCallback().processStartVisibilityTracker();
        this.visibilityTrackerHolder.startTracking(view, getParams().getVisibilityParams(), new a());
        ViewHelper.safeAddSingleView(viewGroup, view, layoutParams);
        getProcessCallback().processFillAd();
        try {
            getUnifiedAd().prepareToShow();
        } catch (Throwable th2) {
            Logger.w(th2);
        }
    }

    public ViewAdObject(@NonNull ContextProvider contextProvider, @NonNull AdProcessCallback adProcessCallback, @NonNull AdRequestType adrequesttype, @NonNull AdObjectParams adObjectParams, @NonNull UnifiedAdType unifiedadtype) {
        super(contextProvider, adProcessCallback, adrequesttype, adObjectParams, unifiedadtype);
        MeasureMode measureMode = MeasureMode.Direct;
        this.widthMeasureMode = measureMode;
        this.heightMeasureMode = measureMode;
        this.visibilityTrackerHolder = new VisibilityTrackerHolder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdView(@Nullable View view) {
        hide();
        this.adView = view;
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    public void hide() {
        super.hide();
        this.visibilityTrackerHolder.stopTracking();
        View view = this.adView;
        if (view != null) {
            ViewHelper.removeViewFromParent(view);
        }
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    public void onDestroy() {
        hide();
        super.onDestroy();
    }

    @Override // io.bidmachine.AdObjectImpl, io.bidmachine.models.AdObject
    public void onImpression() {
        super.onImpression();
        this.visibilityTrackerHolder.stopTracking();
    }
}
