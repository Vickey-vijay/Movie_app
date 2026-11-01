package d;

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ImageLoader;
import com.yk.e.util.ScreenUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f51779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f51780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f51781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f51782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f51783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f51784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f51785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f51786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RelativeLayout f51787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f51788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f51789k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f51790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f51791m;

    public q(Activity activity) {
        this.f51779a = activity;
    }

    public final void a(Activity activity) {
        View viewInflate = LayoutInflater.from(activity).inflate(IDUtil.getLayoutID(activity, "main_layout_native_pgl"), (ViewGroup) null);
        this.f51781c = viewInflate;
        this.f51788j = (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(this.f51779a, "main_pgl_native_content_ly"));
        this.f51782d = (TextView) this.f51781c.findViewById(IDUtil.getViewID(this.f51779a, "main_pgl_tv_ad_title"));
        this.f51783e = (TextView) this.f51781c.findViewById(IDUtil.getViewID(this.f51779a, "main_pgl_native_tv_ad_desc"));
        this.f51784f = (ImageView) this.f51781c.findViewById(IDUtil.getViewID(this.f51779a, "main_pgl_native_im_icon"));
        this.f51785g = (ImageView) this.f51781c.findViewById(IDUtil.getViewID(this.f51779a, "main_plg_native_im_dislike"));
        this.f51786h = (Button) this.f51781c.findViewById(IDUtil.getViewID(this.f51779a, "main_pgl_native_btn_creative"));
        this.f51787i = (RelativeLayout) this.f51781c.findViewById(IDUtil.getViewID(this.f51779a, "main_pgl_native_rl_ad_logo"));
        this.f51789k = (FrameLayout) this.f51781c.findViewById(IDUtil.getViewID(this.f51779a, "main_pgl_native_fl_video"));
        this.f51785g.setVisibility(4);
    }

    public final void b(PAGNativeAd pAGNativeAd, int i10, int i11, int i12, int i13) {
        String buttonText;
        PAGNativeAdData nativeAdData = pAGNativeAd.getNativeAdData();
        this.f51782d.setText(nativeAdData.getTitle());
        this.f51783e.setText(nativeAdData.getDescription());
        PAGImageItem icon = nativeAdData.getIcon();
        if (icon != null && icon.getImageUrl() != null) {
            new ImageLoader().loadImg(this.f51779a, icon.getImageUrl(), new p(this));
        }
        Button button = this.f51786h;
        if (TextUtils.isEmpty(nativeAdData.getButtonText())) {
            buttonText = "Download";
        } else {
            buttonText = nativeAdData.getButtonText();
        }
        button.setText(buttonText);
        ImageView imageView = (ImageView) nativeAdData.getAdLogoView();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.f51787i.removeAllViews();
        this.f51787i.addView(imageView, layoutParams);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f51783e);
        arrayList.add(this.f51789k);
        arrayList.add(this.f51786h);
        pAGNativeAd.registerViewForInteraction((ViewGroup) this.f51781c, (List<View>) arrayList, (List<View>) arrayList, this.f51785g, new l(this));
        PAGMediaView mediaView = nativeAdData.getMediaView();
        if (mediaView != null) {
            mediaView.setVideoAdListener(new g(this));
            if (mediaView.getParent() == null) {
                this.f51789k.removeAllViews();
                this.f51789k.addView(mediaView);
            }
        }
        this.f51790l = i12;
        this.f51791m = i13;
        if (i12 == 0) {
            this.f51790l = (i13 * i10) / i11;
        } else if (i13 == 0) {
            this.f51791m = (i12 * i11) / i10;
        } else {
            this.f51790l = (int) (i10 * (i13 / i11));
        }
        int screenWidth = ScreenUtil.getScreenWidth(this.f51779a);
        if (this.f51790l == 0 && this.f51791m == 0) {
            this.f51790l = screenWidth;
            this.f51791m = (i11 * screenWidth) / i10;
        }
        if (this.f51790l >= screenWidth) {
            this.f51790l = screenWidth;
            this.f51791m = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(this.f51779a);
        if (this.f51791m >= screenHeight) {
            this.f51791m = screenHeight;
            this.f51790l = (i10 * screenHeight) / i11;
        }
        AdLog.i("okt_pangle", "native, " + ("expressWidth " + this.f51790l));
        AdLog.i("okt_pangle", "native, " + ("expressHeight " + this.f51791m));
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f51788j.getLayoutParams();
        layoutParams2.width = this.f51790l;
        layoutParams2.height = this.f51791m;
        this.f51781c.setLayoutParams(layoutParams2);
        this.f51780b.onAdLoaded(this.f51781c);
    }
}
