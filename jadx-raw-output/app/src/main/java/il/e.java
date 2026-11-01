package il;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yk.e.callBack.MainFloatViewCallback;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ImageHandler;
import com.yk.e.util.MainPreloadService;
import com.yk.e.util.PixValue;
import com.yk.e.util.ScreenUtil;
import com.yk.e.util.StringUtil;
import j.n0;
import j.x0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends n0 {
    public Activity B;
    public MainFloatViewCallback C;
    public ViewGroup H;
    public WindowManager I;
    public ImageView K;
    public ImageView L;
    public RelativeLayout M;
    public boolean D = false;
    public float E = 1.0f;
    public float F = 0.5f;
    public int G = 80;
    public int J = 80;
    public int N = 0;
    public final d O = new d(this);
    public final f P = new f(this);

    public final void B(Activity activity, x0 x0Var) {
        this.B = activity;
        this.C = x0Var;
        if (activity != null) {
            try {
                if (!activity.isFinishing()) {
                    if (StringUtil.isAppInstalled(activity, this.f61589j.packageName)) {
                        j(AdSdkStateCode.MAIN_OWN_FAILED, e("main_app_exist"));
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("开启广告误触 ");
                    boolean z10 = true;
                    if (this.f61589j.adAreaType != 1) {
                        z10 = false;
                    }
                    sb2.append(z10);
                    AdLog.d(sb2.toString());
                    ViewGroup viewGroup = this.H;
                    if (viewGroup != null && this.I != null && viewGroup.getParent() != null) {
                        this.I.removeViewImmediate(this.H);
                        this.H = null;
                    }
                    this.I = activity.getWindowManager();
                    ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(activity).inflate(IDUtil.getLayoutID(activity, "main_layout_float_view"), (ViewGroup) null);
                    this.H = viewGroup2;
                    this.M = (RelativeLayout) viewGroup2.findViewById(IDUtil.getViewID(activity, "main_ry_float_root"));
                    this.K = (ImageView) this.H.findViewById(IDUtil.getViewID(activity, "main_img_float_close"));
                    this.L = (ImageView) this.H.findViewById(IDUtil.getViewID(activity, "main_im_gif_float"));
                    PixValue pixValue = PixValue.pix;
                    this.J = pixValue.valueOf((float) this.G) <= 0 ? this.J : pixValue.valueOf(this.G);
                    int i10 = this.G;
                    this.M.setLayoutParams(new LinearLayout.LayoutParams(i10, i10));
                    this.I.addView(this.H, C());
                    this.H.setVisibility(8);
                    this.L.setOnClickListener(this.O);
                    this.K.setOnClickListener(this.P);
                    new ImageHandler().loadImg(activity, this.f61589j.imgUrl, this.L, "", new a(this, activity));
                    return;
                }
            } catch (Exception e10) {
                AdLog.e("createFloatView error, msg = " + e10.getMessage(), e10);
                n(e10);
                return;
            }
        }
        a("FloatViewAD activity is finish!");
    }

    public final WindowManager.LayoutParams C() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.format = -3;
        layoutParams.flags = IronSourceError.ERROR_NO_INTERNET_CONNECTION;
        layoutParams.gravity = 51;
        layoutParams.width = -2;
        layoutParams.height = -2;
        float f10 = this.B.getResources().getDisplayMetrics().widthPixels * this.E;
        PixValue pixValue = PixValue.dip;
        layoutParams.x = (int) (f10 - pixValue.valueOf(this.J));
        layoutParams.y = (int) (((this.B.getResources().getDisplayMetrics().heightPixels * this.F) - pixValue.valueOf(this.J)) - ScreenUtil.getStatusBarHeight(this.B));
        return layoutParams;
    }

    public final void D() {
        ViewGroup viewGroup = this.H;
        if (viewGroup != null && this.I != null && viewGroup.getParent() != null) {
            this.I.removeViewImmediate(this.H);
        }
        this.H = null;
        this.I = null;
        this.D = true;
    }

    @Override // j.n0
    public final void z() {
        MainFloatViewCallback mainFloatViewCallback;
        if (!this.D && (mainFloatViewCallback = this.C) != null) {
            mainFloatViewCallback.onAdLoaded();
        }
        MainPreloadService.IL1Iii(this.B);
    }
}
