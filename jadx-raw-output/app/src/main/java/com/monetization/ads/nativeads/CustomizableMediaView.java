package com.monetization.ads.nativeads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.R$layout;
import com.yandex.mobile.ads.R$styleable;
import yads.hk;
import yads.iv2;
import yads.kj3;
import yads.lj3;
import yads.lv2;
import yads.x20;
import yads.yz2;

/* JADX INFO: loaded from: classes3.dex */
public class CustomizableMediaView extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f42998f = R$layout.monetization_ads_internal_outstream_controls_default;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f43000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final kj3 f43002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private x20 f43003e;

    @SuppressLint({"CustomViewStyleable"})
    public CustomizableMediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MonetizationAdsInternalMediaView);
            this.f42999a = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MonetizationAdsInternalMediaView_monetization_internal_video_controls_layout, f42998f);
            this.f43002d = lj3.a(typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f42999a = f42998f;
            this.f43002d = null;
        }
        addOnAttachStateChangeListener(new hk(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: nb.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                CustomizableMediaView.a(this.f64714b);
            }
        }));
    }

    public final void a(int i10) {
        this.f42999a = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CustomizableMediaView customizableMediaView) {
        x20 x20Var = customizableMediaView.f43003e;
        if (x20Var != null) {
            int width = customizableMediaView.getWidth();
            int height = customizableMediaView.getHeight();
            lv2 lv2Var = (lv2) ((iv2) x20Var).f78839a.get();
            if (lv2Var != null) {
                yz2 yz2Var = lv2Var.f79944f;
                if (width < yz2Var.f85156b || height < yz2Var.f85157c) {
                    lv2Var.f79947i.setValue(lv2Var, lv2.f79941j[2], lv2Var.f79943e);
                }
            }
        }
    }

    public final int getHeightMeasureSpec() {
        return this.f43001c;
    }

    public final x20 getOnSizeChangedListener$mobileads_externalRelease() {
        return this.f43003e;
    }

    public final int getVideoControlsLayoutId() {
        return this.f42999a;
    }

    public final kj3 getVideoScaleType() {
        return this.f43002d;
    }

    public final int getWidthMeasureSpec() {
        return this.f43000b;
    }

    public final void setOnSizeChangedListener$mobileads_externalRelease(x20 x20Var) {
        this.f43003e = x20Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f43000b = i10;
        this.f43001c = i11;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        lv2 lv2Var;
        super.onSizeChanged(i10, i11, i12, i13);
        x20 x20Var = this.f43003e;
        if (x20Var != null && (lv2Var = (lv2) ((iv2) x20Var).f78839a.get()) != null) {
            yz2 yz2Var = lv2Var.f79944f;
            if (i10 < yz2Var.f85156b || i11 < yz2Var.f85157c) {
                lv2Var.f79947i.setValue(lv2Var, lv2.f79941j[2], lv2Var.f79943e);
            }
        }
    }

    public CustomizableMediaView(Context context) {
        this(context, null);
    }

    public CustomizableMediaView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
