package d;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.ads.nativead.NativeAd;
import com.yk.e.adview.AdmobNativeMediaView;
import com.yk.e.adview.AdmobNativeSmallView;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ScreenUtil;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f51752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdmobNativeSmallView f51753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdmobNativeMediaView f51754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f51757f;

    public final void a(Activity activity, int i10, int i11, int i12, int i13) {
        this.f51755d = i12;
        this.f51756e = i13;
        View view = this.f51757f ? this.f51754c : this.f51753b;
        if (i12 == 0) {
            this.f51755d = (i13 * i10) / i11;
        } else if (i13 == 0) {
            this.f51756e = (i12 * i11) / i10;
        } else {
            this.f51755d = (int) (i10 * (i13 / i11));
        }
        int screenWidth = ScreenUtil.getScreenWidth(activity);
        if (this.f51755d == 0 && this.f51756e == 0) {
            this.f51755d = screenWidth;
            this.f51756e = (i11 * screenWidth) / i10;
        }
        if (this.f51755d >= screenWidth) {
            this.f51755d = screenWidth;
            this.f51756e = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(activity);
        if (this.f51756e >= screenHeight) {
            this.f51756e = screenHeight;
            this.f51755d = (i10 * screenHeight) / i11;
        }
        AdLog.d("expressWidth " + this.f51755d);
        AdLog.d("expressHeight " + this.f51756e);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = this.f51755d;
        layoutParams.height = this.f51756e;
        this.f51752a.setLayoutParams(layoutParams);
    }

    public b(Activity activity, NativeAd nativeAd) {
        this.f51757f = false;
        View viewInflate = LayoutInflater.from(activity).inflate(IDUtil.getLayoutID(activity, "main_layout_native_admob"), (ViewGroup) null);
        this.f51752a = viewInflate;
        AdmobNativeMediaView admobNativeMediaView = (AdmobNativeMediaView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_admob_native_content_adv"));
        this.f51754c = admobNativeMediaView;
        AdmobNativeSmallView admobNativeSmallView = (AdmobNativeSmallView) viewInflate.findViewById(IDUtil.getViewID(activity, "main_admob_native_sm_content_adv"));
        this.f51753b = admobNativeSmallView;
        this.f51757f = true;
        ColorDrawable colorDrawable = new ColorDrawable(-1);
        f fVar = new f();
        fVar.f51764a = colorDrawable;
        AdLog.i("AdmobNativeView isShowMediaView true");
        admobNativeMediaView.setVisibility(0);
        admobNativeSmallView.setVisibility(8);
        admobNativeMediaView.setStyles(fVar);
        admobNativeMediaView.setNativeAd(nativeAd);
    }
}
