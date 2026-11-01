package d;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ScreenUtil;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f51759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaxNativeAdView f51760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51762d;

    public d(Activity activity, int i10, int i11, int i12, int i13) {
        this.f51759a = activity;
        int layoutID = IDUtil.getLayoutID(activity, "main_layout_native_applovin_view");
        LayoutInflater.from(activity).inflate(layoutID, (ViewGroup) null);
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(layoutID).setTitleTextViewId(IDUtil.getViewID(activity, "title_text_view")).setBodyTextViewId(IDUtil.getViewID(activity, "body_text_view")).setAdvertiserTextViewId(IDUtil.getViewID(activity, "advertiser_text_view")).setIconImageViewId(IDUtil.getViewID(activity, "icon_image_view")).setMediaContentViewGroupId(IDUtil.getViewID(activity, "media_view_container")).setOptionsContentViewGroupId(IDUtil.getViewID(activity, "options_view")).setCallToActionButtonId(IDUtil.getViewID(activity, "cta_button")).build(), activity);
        this.f51760b = maxNativeAdView;
        this.f51761c = i12;
        this.f51762d = i13;
        if (i12 == 0) {
            this.f51761c = (i13 * i10) / i11;
        } else if (i13 == 0) {
            this.f51762d = (i12 * i11) / i10;
        } else {
            this.f51761c = (int) (i10 * (i13 / i11));
        }
        int screenWidth = ScreenUtil.getScreenWidth(activity);
        if (this.f51761c == 0 && this.f51762d == 0) {
            this.f51761c = screenWidth;
            this.f51762d = (i11 * screenWidth) / i10;
        }
        if (this.f51761c >= screenWidth) {
            this.f51761c = screenWidth;
            this.f51762d = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(activity);
        if (this.f51762d >= screenHeight) {
            this.f51762d = screenHeight;
            this.f51761c = (i10 * screenHeight) / i11;
        }
        AdLog.d("ApplovinNativeView", "expressWidth " + this.f51761c);
        AdLog.d("ApplovinNativeView", "expressHeight " + this.f51762d);
        LinearLayout linearLayout = (LinearLayout) maxNativeAdView.findViewById(IDUtil.getViewID(activity, "main_applovin_native_content_ly"));
        if (linearLayout == null) {
            AdLog.e("ApplovinNativeView", "ApplovinNativeView contentLayout == null");
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.width = this.f51761c;
        layoutParams.height = this.f51762d;
        maxNativeAdView.setLayoutParams(layoutParams);
    }
}
