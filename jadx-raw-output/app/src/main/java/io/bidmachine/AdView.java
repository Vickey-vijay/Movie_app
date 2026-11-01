package io.bidmachine;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.AdView;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;
import io.bidmachine.models.AuctionResult;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AdView<SelfType extends AdView<SelfType, AdType, AdRequestType, AdObjectType, ExternalAdListenerType>, AdType extends ViewAd<AdType, AdRequestType, AdObjectType, ?, AdListener<AdType>>, AdRequestType extends AdRequest<AdRequestType, ?, ?>, AdObjectType extends ViewAdObject<AdRequestType, ?, ?>, ExternalAdListenerType extends AdListener<SelfType>> extends FrameLayout implements IAd<SelfType, AdRequestType> {
    private final AdListener<AdType> adListener;

    @Nullable
    private AdType currentAd;

    @Nullable
    private ExternalAdListenerType externalListener;
    private boolean isAttachedToWindow;
    private boolean isShowPending;

    @Nullable
    private AdType pendingAd;

    public class a implements AdListener<AdType> {
        public a() {
        }

        @Override // io.bidmachine.AdListener
        public void onAdClicked(@NonNull AdType adtype) {
            if (AdView.this.externalListener != null) {
                AdView.this.externalListener.onAdClicked(AdView.this);
            }
        }

        @Override // io.bidmachine.AdListener
        public void onAdExpired(@NonNull AdType adtype) {
            if (AdView.this.externalListener != null) {
                AdView.this.externalListener.onAdExpired(AdView.this);
            }
        }

        @Override // io.bidmachine.AdListener
        public void onAdImpression(@NonNull AdType adtype) {
            if (AdView.this.externalListener != null) {
                AdView.this.externalListener.onAdImpression(AdView.this);
            }
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoadFailed(@NonNull AdType adtype, @NonNull BMError bMError) {
            if (AdView.this.externalListener != null) {
                AdView.this.externalListener.onAdLoadFailed(AdView.this, bMError);
            }
        }

        @Override // io.bidmachine.AdListener
        public void onAdLoaded(@NonNull AdType adtype) {
            if (AdView.this.externalListener != null) {
                AdView.this.externalListener.onAdLoaded(AdView.this);
            }
            AdView.this.performShow();
        }

        @Override // io.bidmachine.AdListener
        public void onAdShowFailed(@NonNull AdType adtype, @NonNull BMError bMError) {
            if (AdView.this.externalListener != null) {
                AdView.this.externalListener.onAdShowFailed(AdView.this, bMError);
            }
        }
    }

    public AdView(@NonNull Context context) {
        this(context, null);
    }

    @Override // io.bidmachine.IAd
    public boolean canShow() {
        return canShow(this.currentAd) || canShow(this.pendingAd);
    }

    public abstract AdType createAd(Context context);

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // io.bidmachine.IAd
    public boolean isLoaded() {
        return isLoaded(this.currentAd) || isLoaded(this.pendingAd);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public AdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean canPerformShow() {
        return this.isAttachedToWindow && this.isShowPending && getVisibility() != 8;
    }

    private boolean canShow(@Nullable AdType adtype) {
        return adtype != null && adtype.canShow();
    }

    private boolean isLoaded(@Nullable AdType adtype) {
        return adtype != null && adtype.isLoaded();
    }

    private void performHide() {
        AdType adtype = this.currentAd;
        if (adtype != null) {
            adtype.hide();
        }
    }

    private void prepareDisplayRequest() {
        AdType adtype;
        if (this.currentAd == null || ((adtype = this.pendingAd) != null && adtype.isLoaded())) {
            AdType adtype2 = this.currentAd;
            if (adtype2 != null) {
                adtype2.destroy();
            }
            this.currentAd = this.pendingAd;
            this.pendingAd = null;
        }
    }

    @Override // io.bidmachine.IAd
    public void destroy() {
        AdType adtype = this.currentAd;
        if (adtype != null) {
            adtype.destroy();
            this.currentAd = null;
        }
        AdType adtype2 = this.pendingAd;
        if (adtype2 != null) {
            adtype2.destroy();
            this.pendingAd = null;
        }
    }

    @Override // io.bidmachine.IAd
    @Nullable
    public AuctionResult getAuctionResult() {
        AdType adtype = this.currentAd;
        if (adtype != null) {
            return adtype.getAuctionResult();
        }
        AdType adtype2 = this.pendingAd;
        if (adtype2 != null) {
            return adtype2.getAuctionResult();
        }
        return null;
    }

    @Nullable
    public AdType getCurrentAd() {
        return this.currentAd;
    }

    @Nullable
    public AdType getPendingAd() {
        return this.pendingAd;
    }

    @Override // io.bidmachine.IAd
    public boolean isDestroyed() {
        AdType adtype = this.pendingAd;
        if (adtype != null) {
            return adtype.isDestroyed();
        }
        AdType adtype2 = this.currentAd;
        return adtype2 != null && adtype2.isDestroyed();
    }

    @Override // io.bidmachine.IAd
    public boolean isExpired() {
        AdType adtype = this.pendingAd;
        if (adtype != null) {
            return adtype.isExpired();
        }
        AdType adtype2 = this.currentAd;
        return adtype2 != null && adtype2.isExpired();
    }

    @Override // io.bidmachine.IAd
    public boolean isLoading() {
        AdType adtype = this.pendingAd;
        return adtype != null && adtype.isLoading();
    }

    @Override // io.bidmachine.IAd
    public SelfType load(AdRequestType adrequesttype) {
        this.isShowPending = true;
        AdType adtype = this.pendingAd;
        if (adtype != null) {
            adtype.destroy();
        }
        AdType adtype2 = (AdType) createAd(getContext());
        this.pendingAd = adtype2;
        adtype2.setListener(this.adListener);
        this.pendingAd.load(adrequesttype);
        return this;
    }

    public SelfType setListener(ExternalAdListenerType externaladlistenertype) {
        this.externalListener = externaladlistenertype;
        return this;
    }

    public AdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.isShowPending = false;
        this.isAttachedToWindow = false;
        this.adListener = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void performShow() {
        if (canPerformShow()) {
            prepareDisplayRequest();
            AdType adtype = this.currentAd;
            if (adtype != null) {
                adtype.show(this);
                this.isShowPending = false;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        performShow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        this.isShowPending = true;
        performHide();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (getVisibility() == 0) {
            performShow();
        }
    }
}
