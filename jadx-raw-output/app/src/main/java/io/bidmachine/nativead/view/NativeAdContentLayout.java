package io.bidmachine.nativead.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.Executable;
import io.bidmachine.R;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.nativead.NativeAd;
import io.bidmachine.nativead.NativeData;
import io.bidmachine.nativead.NativePublicData;
import io.bidmachine.utils.ViewHelper;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class NativeAdContentLayout extends NativeAdContainer {

    @Nullable
    public View callToActionView;
    private int callToActionViewId;

    @NonNull
    private Set<WeakReference<View>> clickableViewRefs;

    @Nullable
    private NativeAd currentAd;

    @Nullable
    public View descriptionView;
    private int descriptionViewId;

    @Nullable
    public View iconView;
    private int iconViewId;

    @Nullable
    public NativeMediaView mediaView;
    private int mediaViewId;

    @Nullable
    public View providerView;
    private int providerViewId;

    @Nullable
    public View ratingView;
    private int ratingViewId;

    @Nullable
    public View titleView;
    private int titleViewId;

    public NativeAdContentLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // io.bidmachine.nativead.view.NativeAdContainer, android.view.ViewGroup
    public /* bridge */ /* synthetic */ void addView(View view) {
        super.addView(view);
    }

    @Override // io.bidmachine.nativead.view.NativeAdContainer, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // io.bidmachine.nativead.view.NativeAdContainer, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void registerViewForInteraction(@Nullable NativeAd nativeAd) {
        registerViewForInteraction(nativeAd, getAllAvailableClickableViews());
    }

    public NativeAdContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @NonNull
    private Set<View> getAllAvailableClickableViews() {
        final HashSet hashSet = new HashSet();
        Utils.ifNotNull(this.titleView, new g(hashSet));
        Utils.ifNotNull(this.callToActionView, new g(hashSet));
        Utils.ifNotNull(this.ratingView, new g(hashSet));
        Utils.ifNotNull(this.descriptionView, new g(hashSet));
        Utils.ifNotNull(this.providerView, new g(hashSet));
        Utils.ifNotNull(this.iconView, new g(hashSet));
        Utils.ifNotNull(this.mediaView, new Executable() { // from class: io.bidmachine.nativead.view.h
            @Override // io.bidmachine.Executable
            public final void execute(Object obj) {
                hashSet.add((NativeMediaView) obj);
            }
        });
        return hashSet;
    }

    @Override // io.bidmachine.nativead.view.NativeAdContainer, android.view.ViewGroup
    public /* bridge */ /* synthetic */ void addView(View view, int i10) {
        super.addView(view, i10);
    }

    public void bind(@Nullable NativeAd nativeAd) {
        if (nativeAd == null || !nativeAd.isLoaded()) {
            return;
        }
        View view = this.titleView;
        if (view instanceof TextView) {
            ((TextView) view).setText(nativeAd.getTitle());
        }
        View view2 = this.descriptionView;
        if (view2 instanceof TextView) {
            ((TextView) view2).setText(nativeAd.getDescription());
        }
        View view3 = this.ratingView;
        if (view3 instanceof RatingBar) {
            RatingBar ratingBar = (RatingBar) view3;
            if (nativeAd.getRating() == -1.0f) {
                ratingBar.setVisibility(4);
            } else {
                ratingBar.setVisibility(0);
                ratingBar.setStepSize(0.1f);
                ratingBar.setRating(nativeAd.getRating());
            }
        }
        View view4 = this.callToActionView;
        if (view4 instanceof TextView) {
            ((TextView) view4).setText(nativeAd.getCallToAction());
        }
        if (this.providerView instanceof ViewGroup) {
            View providerView = nativeAd.getProviderView(getContext());
            if (providerView instanceof NativeAdOverlayContainer) {
                providerView.setVisibility(8);
            } else if (providerView != null) {
                ViewHelper.removeViewFromParent(providerView);
                ((ViewGroup) this.providerView).addView(providerView, new ViewGroup.LayoutParams(-2, -2));
            }
        }
        NativePublicData adData = nativeAd.getAdData();
        if (adData instanceof NativeData) {
            this.overlayContainer.bindNativeData((NativeData) adData);
        }
    }

    public void destroy() {
        NativeAd nativeAd = this.currentAd;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
    }

    @Nullable
    public View getCallToActionView() {
        return this.callToActionView;
    }

    @NonNull
    public Set<View> getClickableViews() {
        HashSet hashSet = new HashSet();
        Iterator<WeakReference<View>> it = this.clickableViewRefs.iterator();
        while (it.hasNext()) {
            Utils.ifNotNull(it.next().get(), new g(hashSet));
        }
        return hashSet;
    }

    @Nullable
    public View getDescriptionView() {
        return this.descriptionView;
    }

    @Nullable
    public View getIconView() {
        return this.iconView;
    }

    @Nullable
    public NativeMediaView getMediaView() {
        return this.mediaView;
    }

    @Nullable
    public View getProviderView() {
        return this.providerView;
    }

    @Nullable
    public View getRatingView() {
        return this.ratingView;
    }

    @Nullable
    public View getTitleView() {
        return this.titleView;
    }

    public boolean isRegistered() {
        NativeAd nativeAd = this.currentAd;
        return nativeAd != null && nativeAd.isViewRegistered();
    }

    public void registerViewForInteraction(@Nullable NativeAd nativeAd, @Nullable Set<View> set) {
        if (nativeAd == null || !nativeAd.isLoaded()) {
            Logger.d("Native ad is not loaded. Please load it before registering");
            return;
        }
        if (set == null) {
            set = Collections.emptySet();
        }
        if (set.isEmpty()) {
            Logger.w("'registerViewForInteraction' called with empty 'clickableViews' list, native ad won't be interactive");
        }
        HashSet hashSet = new HashSet();
        Iterator<View> it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(new WeakReference(it.next()));
        }
        unregisterViewForInteraction();
        this.clickableViewRefs = hashSet;
        this.currentAd = nativeAd;
        nativeAd.registerView(this, getIconView(), getMediaView(), set);
    }

    public void setCallToActionView(@Nullable View view) {
        this.callToActionView = view;
    }

    public void setDescriptionView(@Nullable View view) {
        this.descriptionView = view;
    }

    public void setIconView(@Nullable View view) {
        this.iconView = view;
    }

    public void setMediaView(@Nullable NativeMediaView nativeMediaView) {
        this.mediaView = nativeMediaView;
    }

    public void setProviderView(@Nullable View view) {
        this.providerView = view;
    }

    public void setRatingView(@Nullable View view) {
        this.ratingView = view;
    }

    public void setTitleView(@Nullable View view) {
        this.titleView = view;
    }

    public void unregisterViewForInteraction() {
        NativeAd nativeAd = this.currentAd;
        if (nativeAd != null) {
            nativeAd.unregisterView();
        }
    }

    public NativeAdContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.clickableViewRefs = new HashSet();
        this.titleViewId = -1;
        this.callToActionViewId = -1;
        this.ratingViewId = -1;
        this.descriptionViewId = -1;
        this.providerViewId = -1;
        this.iconViewId = -1;
        this.mediaViewId = -1;
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.NativeAdContentLayout, i10, 0);
        try {
            this.titleViewId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NativeAdContentLayout_titleViewId, -1);
            this.callToActionViewId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NativeAdContentLayout_callToActionViewId, -1);
            this.ratingViewId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NativeAdContentLayout_ratingViewId, -1);
            this.descriptionViewId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NativeAdContentLayout_descriptionViewId, -1);
            this.providerViewId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NativeAdContentLayout_providerViewId, -1);
            this.iconViewId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NativeAdContentLayout_iconViewId, -1);
            this.mediaViewId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.NativeAdContentLayout_mediaViewId, -1);
            typedArrayObtainStyledAttributes.close();
        } catch (Throwable th2) {
            if (typedArrayObtainStyledAttributes != null) {
                try {
                    typedArrayObtainStyledAttributes.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // io.bidmachine.nativead.view.NativeAdContainer, android.view.ViewGroup
    public /* bridge */ /* synthetic */ void addView(View view, int i10, int i11) {
        super.addView(view, i10, i11);
    }

    @Override // io.bidmachine.nativead.view.NativeAdContainer, android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ void bringChildToFront(View view) {
        super.bringChildToFront(view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setTitleView(findViewById(this.titleViewId));
        setCallToActionView(findViewById(this.callToActionViewId));
        setRatingView(findViewById(this.ratingViewId));
        setDescriptionView(findViewById(this.descriptionViewId));
        setProviderView(findViewById(this.providerViewId));
        setIconView(findViewById(this.iconViewId));
        setMediaView((NativeMediaView) findViewById(this.mediaViewId));
    }

    @Override // io.bidmachine.nativead.view.NativeAdContainer, android.view.ViewGroup
    public /* bridge */ /* synthetic */ void removeAllViews() {
        super.removeAllViews();
    }

    @Override // io.bidmachine.nativead.view.NativeAdContainer, android.view.ViewGroup, android.view.ViewManager
    public /* bridge */ /* synthetic */ void removeView(View view) {
        super.removeView(view);
    }

    @Override // io.bidmachine.nativead.view.NativeAdContainer, android.view.ViewGroup
    public /* bridge */ /* synthetic */ void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    @Override // io.bidmachine.nativead.view.NativeAdContainer, android.view.ViewGroup, android.view.ViewManager
    public /* bridge */ /* synthetic */ void addView(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, layoutParams);
    }
}
