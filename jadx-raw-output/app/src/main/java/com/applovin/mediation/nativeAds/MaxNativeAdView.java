package com.applovin.mediation.nativeAds;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.applovin.impl.d3;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@SuppressLint({"ViewConstructor"})
public class MaxNativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f10335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f10336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f10337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TextView f10338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Button f10339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImageView f10340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final FrameLayout f10341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ViewGroup f10342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final FrameLayout f10343i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ViewGroup f10344j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ViewGroup f10345k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final FrameLayout f10346l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.applovin.impl.mediation.ads.b f10347m;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WeakReference f10348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f10349b;

        public a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f10348a = weakReference;
            this.f10349b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f10348a.get();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                k.C0.O();
                if (o.a()) {
                    k.C0.O().k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            } else {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f10348a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f10349b.getLayoutParams();
            layoutParams.height = ((View) this.f10349b.getParent()).getWidth();
            this.f10349b.setLayoutParams(layoutParams);
            return true;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, activity, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Landroid/app/Activity;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAd p10, Activity p11, StatsEvent p12) {
        this(p10, (String) null, p11);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Landroid/app/Activity;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Landroid/app/Activity;)V" == 0) {
        } else {
            this(p10, (String) null, p11);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this(maxNativeAd, maxNativeAdViewBinder, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Activity activity) {
        this(maxNativeAd, str, activity, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/app/Activity;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Context context) {
        this(maxNativeAd, str, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this(maxNativeAdViewBinder, context, (StatsEvent) null);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        CreativeInfoManager.onMaxNativeAdCreated(this);
    }

    private void b(MaxNativeAd maxNativeAd) {
        if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f10336b.setText(maxNativeAd.getTitle());
        } else {
            this.f10336b.setVisibility(8);
        }
        if (this.f10337c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f10337c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f10337c.setVisibility(8);
            }
        }
        if (this.f10338d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f10338d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f10338d.setVisibility(8);
            } else {
                this.f10338d.setVisibility(4);
            }
        }
        if (this.f10339e != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f10339e.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f10339e.setVisibility(8);
            } else {
                this.f10339e.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f10341g;
        if (frameLayout != null) {
            if (icon == null || this.f10340f == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f10341g.removeAllViews();
                    this.f10341g.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f10340f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f10341g.setVisibility(8);
            } else {
                ImageViewUtils.setAndDownscaleImageUri(this.f10340f, icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f10343i;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f10343i.addView(optionsView);
            this.f10343i.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f10346l != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f10346l.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f10346l.setVisibility(8);
            }
        }
        if (this.f10344j != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f10344j.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f10344j.addView(appLovinStarRatingView);
            } else {
                this.f10344j.setVisibility(8);
            }
        }
        b();
        postDelayed(new Runnable() { // from class: com.applovin.mediation.nativeAds.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f10395b.a();
            }
        }, 2000L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44955a, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void recycle() {
        setOnClickListener(null);
        com.applovin.impl.mediation.ads.b bVar = this.f10347m;
        if (bVar != null) {
            bVar.a();
            this.f10347m = null;
        }
        View view = this.f10335a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f10335a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f10335a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAd p10, String p11, Activity p12, StatsEvent p13) {
        this(p10, p11, p12.getApplicationContext());
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/app/Activity;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/app/Activity;)V" == 0) {
        } else {
            this(p10, p11, p12.getApplicationContext());
        }
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            if ("vertical_banner_template".equals(str)) {
                return R.layout.max_native_ad_vertical_banner_view;
            }
            if ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) {
                return R.layout.max_native_ad_media_banner_view;
            }
            return "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        }
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            throw new IllegalArgumentException("Attempting to render MAX native ad with invalid template: " + str);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    @Nullable
    public com.applovin.impl.mediation.ads.b getAdViewTracker() {
        return this.f10347m;
    }

    public TextView getAdvertiserTextView() {
        return this.f10337c;
    }

    public TextView getBodyTextView() {
        return this.f10338d;
    }

    public Button getCallToActionButton() {
        return this.f10339e;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f10336b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f10337c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f10338d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f10339e;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f10340f;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f10341g;
    }

    public ImageView getIconImageView() {
        return this.f10340f;
    }

    public View getMainView() {
        return this.f10335a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f10346l;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f10345k;
        return viewGroup != null ? viewGroup : this.f10346l;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f10343i;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f10342h;
        return viewGroup != null ? viewGroup : this.f10343i;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f10344j;
    }

    public TextView getTitleTextView() {
        return this.f10336b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private MaxNativeAdView(MaxNativeAd p10, String p11, Context p12, StatsEvent p13) {
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Ljava/lang/String;Landroid/content/Context;)V" == 0) {
            MaxNativeAdViewBinder.Builder iconContentViewId = new MaxNativeAdViewBinder.Builder(-1).setTemplateType(p11).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view);
            int i10 = R.id.applovin_native_options_view;
            MaxNativeAdViewBinder.Builder starRatingContentViewGroupId = iconContentViewId.setOptionsContentViewGroupId(i10).setOptionsContentFrameLayoutId(i10).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view);
            int i11 = R.id.applovin_native_media_content_view;
            this(p10, starRatingContentViewGroupId.setMediaContentViewGroupId(i11).setMediaContentFrameLayoutId(i11).build(), p12);
            return;
        }
        MaxNativeAdViewBinder.Builder iconContentViewId2 = new MaxNativeAdViewBinder.Builder(-1).setTemplateType(p11).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view);
        int i12 = R.id.applovin_native_options_view;
        MaxNativeAdViewBinder.Builder starRatingContentViewGroupId2 = iconContentViewId2.setOptionsContentViewGroupId(i12).setOptionsContentFrameLayoutId(i12).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view);
        int i13 = R.id.applovin_native_media_content_view;
        this(p10, starRatingContentViewGroupId2.setMediaContentViewGroupId(i13).setMediaContentFrameLayoutId(i13).build(), p12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.applovin.impl.mediation.ads.b bVar = this.f10347m;
        if (bVar != null) {
            bVar.c();
        }
        if (!isHardwareAccelerated()) {
            o.j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
        }
    }

    public void render(d3 d3Var, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a, k kVar) {
        recycle();
        if (!d3Var.v0().get() || !d3Var.u0().get()) {
            this.f10347m = new com.applovin.impl.mediation.ads.b(d3Var, this, interfaceC0040a, kVar);
        }
        final MaxNativeAd nativeAd = d3Var.getNativeAd();
        if (d3Var.w0() && nativeAd.isContainerClickable()) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new View.OnClickListener() { // from class: com.applovin.mediation.nativeAds.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nativeAd.performClick();
                }
            });
        }
        kVar.O();
        if (o.a()) {
            kVar.O().a("MaxNativeAdView", "Rendering custom ad view");
        }
        a(nativeAd);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAdViewBinder p10, Context p11, StatsEvent p12) {
        this((MaxNativeAd) null, p10, p11);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V" == 0) {
        } else {
            this((MaxNativeAd) null, p10, p11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MaxNativeAdView(MaxNativeAd p10, MaxNativeAdViewBinder p11, Context p12, StatsEvent p13) {
        int iA;
        super(p12);
        Logger.d("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V");
        if ("AppLovin|SafeDK: Execution> Lcom/applovin/mediation/nativeAds/MaxNativeAdView;-><init>(Lcom/applovin/mediation/nativeAds/MaxNativeAd;Lcom/applovin/mediation/nativeAds/MaxNativeAdViewBinder;Landroid/content/Context;)V" == 0) {
            return;
        }
        super(p12);
        boolean z10 = p11.templateType != null;
        MaxAdFormat format = p10 != null ? p10.getFormat() : MaxAdFormat.NATIVE;
        View view = p11.mainView;
        if (view != null) {
            this.f10335a = view;
        } else {
            if (z10) {
                iA = a(p11.templateType, format);
            } else {
                iA = p11.layoutResourceId;
            }
            this.f10335a = LayoutInflater.from(p12).inflate(iA, (ViewGroup) this, false);
        }
        addView(this.f10335a);
        this.f10336b = (TextView) findViewById(p11.titleTextViewId);
        this.f10337c = (TextView) findViewById(p11.advertiserTextViewId);
        this.f10338d = (TextView) findViewById(p11.bodyTextViewId);
        this.f10339e = (Button) findViewById(p11.callToActionButtonId);
        this.f10340f = (ImageView) findViewById(p11.iconImageViewId);
        this.f10341g = (FrameLayout) findViewById(p11.iconContentViewId);
        this.f10342h = (ViewGroup) findViewById(p11.optionsContentViewGroupId);
        this.f10343i = (FrameLayout) findViewById(p11.optionsContentFrameLayoutId);
        this.f10344j = (ViewGroup) findViewById(p11.starRatingContentViewGroupId);
        this.f10345k = (ViewGroup) findViewById(p11.mediaContentViewGroupId);
        this.f10346l = (FrameLayout) findViewById(p11.mediaContentFrameLayoutId);
        if (p10 != null) {
            b(p10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        setSelected(true);
    }

    private void a(MaxNativeAd maxNativeAd) {
        TextView textView = this.f10336b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f10338d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f10337c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f10339e;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f10340f;
        if (imageView != null) {
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    this.f10340f.setImageDrawable(icon.getDrawable());
                } else if (icon.getUri() != null) {
                    ImageViewUtils.setAndDownscaleImageUri(this.f10340f, icon.getUri());
                } else {
                    this.f10340f.setImageDrawable(null);
                }
            } else {
                imageView.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f10345k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f10345k.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f10342h;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f10342h.addView(optionsView);
                this.f10342h.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f10344j;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f10344j.addView(appLovinStarRatingView);
            }
        }
    }

    private void b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new a(new WeakReference(viewTreeObserver), viewGroup));
        }
    }
}
