package f;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.subad.BannerView;
import com.yk.e.util.AdLog;
import com.yk.e.util.ImageHandler;
import com.yk.e.util.LogUtil;
import com.yk.e.util.MainPreloadService;
import com.yk.e.util.ScreenUtil;
import com.yk.e.util.StringUtil;
import gl.r0;
import j.p1;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends x implements View.OnClickListener {
    public MainBannerCallBack D;
    public Activity E;
    public BannerView F;

    @Override // j.n0
    public final boolean b() {
        return false;
    }

    public static void D(g gVar, Bitmap bitmap, String str) {
        if (gVar.F != null) {
            LogUtil.info("destroyBannerView");
            gl.h.a(gVar.F);
            gVar.F = null;
        }
        BannerView bannerView = new BannerView(gVar.E);
        gVar.F = bannerView;
        bannerView.setNativeCallBack(new j0(gVar));
        LogUtil.info("expressWidth = " + gVar.B);
        LogUtil.info("expressHeight = " + gVar.C);
        gVar.F.IL1Iii(str, gVar.B, gVar.C);
        gVar.F.setLayoutParams(new ViewGroup.LayoutParams(gVar.B, gVar.C));
        gVar.F.setOnClickListener(gVar);
    }

    @Override // f.x
    public final void B(Activity activity, p1 p1Var) {
        this.E = activity;
        this.D = p1Var;
        try {
            if (StringUtil.isAppInstalled(activity, this.f61589j.packageName)) {
                j(AdSdkStateCode.MAIN_OWN_FAILED, e("main_app_exist"));
            } else {
                Activity activity2 = this.E;
                String str = this.f61589j.imgUrl;
                String.valueOf(System.currentTimeMillis());
                new ImageHandler().preloadImg(activity2, str, new v(this, activity2, str));
            }
        } catch (Exception e10) {
            AdLog.e("Mainbanner loadAd error, msg = " + e10.getMessage(), e10);
            n(e10);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m(this.E, 7);
        MainBannerCallBack mainBannerCallBack = this.D;
        if (mainBannerCallBack != null) {
            mainBannerCallBack.onAdClick();
        }
    }

    @Override // j.n0
    public final void z() {
        if (this.D == null || this.F == null) {
            s("adCallBack 为空！");
            return;
        }
        f(r0.a(this.f61589j.webPrice));
        this.D.onAdLoaded(this.F);
        MainPreloadService.IL1Iii(this.E);
    }

    public static void C(g gVar, Bitmap bitmap) {
        gVar.getClass();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = gVar.B;
        if (i10 == 0) {
            gVar.B = (gVar.C * width) / height;
        } else {
            int i11 = gVar.C;
            if (i11 == 0) {
                gVar.C = (i10 * height) / width;
            } else {
                gVar.B = (int) (width * (i11 / height));
            }
        }
        int screenWidth = ScreenUtil.getScreenWidth(gVar.E);
        if (gVar.B == 0 && gVar.C == 0) {
            gVar.B = screenWidth;
            gVar.C = (height * screenWidth) / width;
        }
        if (gVar.B >= screenWidth) {
            gVar.B = screenWidth;
            gVar.C = (screenWidth * height) / width;
        }
        int screenHeight = ScreenUtil.getScreenHeight(gVar.E);
        if (gVar.C >= screenHeight) {
            gVar.C = screenHeight;
            gVar.B = (width * screenHeight) / height;
        }
    }
}
