package h;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.yk.e.callBack.MainMRECCallBack;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.subad.BannerView;
import com.yk.e.util.AdLog;
import com.yk.e.util.ImageHandler;
import com.yk.e.util.LogUtil;
import com.yk.e.util.MainPreloadService;
import com.yk.e.util.ScreenUtil;
import com.yk.e.util.StringUtil;
import gl.r0;
import j.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends j implements View.OnClickListener {
    public MainMRECCallBack E;
    public Activity F;
    public BannerView G;

    @Override // j.n0
    public final boolean b() {
        return false;
    }

    public static void F(i iVar, Bitmap bitmap, String str) {
        if (iVar.G != null) {
            LogUtil.info("destroyBannerView");
            gl.h.a(iVar.G);
            iVar.G = null;
        }
        BannerView bannerView = new BannerView(iVar.F);
        iVar.G = bannerView;
        bannerView.setNativeCallBack(new f(iVar));
        LogUtil.info("expressWidth = " + iVar.B);
        LogUtil.info("expressHeight = " + iVar.C);
        iVar.G.IL1Iii(str, iVar.B, iVar.C);
        iVar.G.setLayoutParams(new ViewGroup.LayoutParams(iVar.B, iVar.C));
        iVar.G.setOnClickListener(iVar);
    }

    @Override // h.j
    public final void B(Activity activity, z1 z1Var) {
        this.F = activity;
        this.E = z1Var;
        try {
            if (StringUtil.isAppInstalled(activity, this.f61589j.packageName)) {
                j(AdSdkStateCode.MAIN_OWN_FAILED, e("main_app_exist"));
            } else {
                Activity activity2 = this.F;
                String str = this.f61589j.imgUrl;
                String.valueOf(System.currentTimeMillis());
                new ImageHandler().preloadImg(activity2, str, new m(this, activity2, str));
            }
        } catch (Exception e10) {
            AdLog.e("MainMREC loadAd error, msg = " + e10.getMessage(), e10);
            n(e10);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m(this.F, 31);
        MainMRECCallBack mainMRECCallBack = this.E;
        if (mainMRECCallBack != null) {
            mainMRECCallBack.onAdClick();
        }
    }

    @Override // j.n0
    public final void z() {
        if (this.E == null || this.G == null) {
            s("adCallBack 为空！");
            return;
        }
        f(r0.a(this.f61589j.webPrice));
        this.E.onAdLoaded(this.G);
        MainPreloadService.IL1Iii(this.F);
    }

    public static void E(i iVar, Bitmap bitmap) {
        iVar.getClass();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = iVar.B;
        if (i10 == 0) {
            iVar.B = (iVar.C * width) / height;
        } else {
            int i11 = iVar.C;
            if (i11 == 0) {
                iVar.C = (i10 * height) / width;
            } else {
                iVar.B = (int) (width * (i11 / height));
            }
        }
        int screenWidth = ScreenUtil.getScreenWidth(iVar.F);
        if (iVar.B == 0 && iVar.C == 0) {
            iVar.B = screenWidth;
            iVar.C = (height * screenWidth) / width;
        }
        if (iVar.B >= screenWidth) {
            iVar.B = screenWidth;
            iVar.C = (screenWidth * height) / width;
        }
        int screenHeight = ScreenUtil.getScreenHeight(iVar.F);
        if (iVar.C >= screenHeight) {
            iVar.C = screenHeight;
            iVar.B = (width * screenHeight) / height;
        }
    }
}
