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
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdOptionsView;
import com.vungle.ads.internal.ui.view.MediaView;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ScreenUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f51766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f51767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f51768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f51769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f51771f;

    public i(Activity activity, NativeAd nativeAd, int i10, int i11, int i12, int i13) {
        this.f51770e = i12;
        this.f51771f = i13;
        View viewInflate = LayoutInflater.from(activity).inflate(IDUtil.getLayoutID(activity, "main_layout_native_vungle"), (ViewGroup) null);
        this.f51766a = viewInflate;
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(activity, "main_vungle_native_content_ly"));
        this.f51767b = linearLayout;
        LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(activity, "main_vungle_native_title_ly"));
        this.f51768c = linearLayout2;
        ImageView imageView = (ImageView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_vungle_native_im_close"));
        this.f51769d = imageView;
        FrameLayout frameLayout = (NativeAdOptionsView) viewInflate.findViewById(IDUtil.getViewID(activity, "native_ad_container"));
        ImageView imageView2 = (ImageView) frameLayout.findViewById(IDUtil.getViewID(activity, "main_vungle_native_ad_icon"));
        TextView textView = (TextView) frameLayout.findViewById(IDUtil.getViewID(activity, "main_vungle_native_ad_title"));
        MediaView mediaView = (MediaView) frameLayout.findViewById(IDUtil.getViewID(activity, "main_vungle_native_ad_media"));
        TextView textView2 = (TextView) frameLayout.findViewById(IDUtil.getViewID(activity, "main_vungle_native_rateTV"));
        TextView textView3 = (TextView) frameLayout.findViewById(IDUtil.getViewID(activity, "main_vungle_native_ad_body"));
        Button button = (Button) frameLayout.findViewById(IDUtil.getViewID(activity, "main_vungle_native_ad_call_to_action"));
        imageView.setVisibility(8);
        String adTitle = nativeAd.getAdTitle();
        textView.setText(TextUtils.isEmpty(adTitle) ? "" : adTitle);
        String adBodyText = nativeAd.getAdBodyText();
        textView3.setText(TextUtils.isEmpty(adBodyText) ? "" : adBodyText);
        textView2.setText(a(nativeAd.getAdStarRating()));
        button.setVisibility(nativeAd.hasCallToAction() ? 0 : 4);
        String adCallToActionText = nativeAd.getAdCallToActionText();
        button.setText(TextUtils.isEmpty(adCallToActionText) ? "" : adCallToActionText);
        if (TextUtils.isEmpty(a(nativeAd.getAdStarRating()))) {
            textView2.setVisibility(8);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(textView);
        arrayList.add(button);
        arrayList.add(mediaView);
        arrayList.add(linearLayout2);
        nativeAd.registerViewForInteraction(frameLayout, mediaView, imageView2, arrayList);
        if (i12 == 0) {
            this.f51770e = (i10 * i13) / i11;
        } else if (i13 == 0) {
            this.f51771f = (i12 * i11) / i10;
        } else {
            this.f51770e = (int) (i10 * (i13 / i11));
        }
        int screenWidth = ScreenUtil.getScreenWidth(activity);
        if (this.f51770e == 0 && this.f51771f == 0) {
            this.f51770e = screenWidth;
            this.f51771f = (i11 * screenWidth) / i10;
        }
        if (this.f51770e >= screenWidth) {
            this.f51770e = screenWidth;
            this.f51771f = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(activity);
        if (this.f51771f >= screenHeight) {
            this.f51771f = screenHeight;
            this.f51770e = (i10 * screenHeight) / i11;
        }
        AdLog.i("expressHeight " + this.f51771f);
        AdLog.i("expressWidth " + this.f51770e);
        int i14 = this.f51770e;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(IDUtil.getDimen(activity, "dp_18"));
        int i15 = (int) (((double) i14) / 17.8d);
        int iMax = Math.max(i15, dimensionPixelSize);
        int iMax2 = Math.max(i15, dimensionPixelSize);
        ((ViewGroup.MarginLayoutParams) layoutParams).width = iMax;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = iMax2;
        int i16 = (int) (((double) i15) / 3.0d);
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i16;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i16;
        imageView.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams2.width = this.f51770e;
        layoutParams2.height = this.f51771f;
        viewInflate.setLayoutParams(layoutParams2);
    }

    public static String a(Double d10) {
        Exception e10;
        String strValueOf;
        try {
            strValueOf = String.valueOf(d10);
            try {
                if ("null".equals(strValueOf)) {
                    return "";
                }
            } catch (Exception e11) {
                e10 = e11;
                AdLog.e(e10.getMessage(), e10);
            }
        } catch (Exception e12) {
            e10 = e12;
            strValueOf = "";
        }
        return strValueOf;
    }
}
