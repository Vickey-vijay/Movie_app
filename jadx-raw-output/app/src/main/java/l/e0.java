package l;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.subad.NativeView;
import com.yk.e.util.AdLog;
import com.yk.e.util.ImageHandler;
import com.yk.e.util.LogUtil;
import com.yk.e.util.MainPreloadService;
import com.yk.e.util.ScreenUtil;
import com.yk.e.util.StringUtil;
import gl.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 extends r implements View.OnClickListener {
    public MainNativeAdCallBack B;
    public Activity C;
    public int D;
    public int E;
    public NativeView F;

    @Override // j.n0
    public final boolean b() {
        return false;
    }

    public static void D(e0 e0Var, Bitmap bitmap, String str) {
        if (e0Var.F != null) {
            LogUtil.info("destroyNativeView");
            gl.h.a(e0Var.F);
            e0Var.F = null;
        }
        NativeView nativeView = new NativeView(e0Var.C);
        e0Var.F = nativeView;
        nativeView.setNativeCallBack(new c(e0Var));
        LogUtil.info("expressWidth = " + e0Var.D);
        LogUtil.info("expressHeight = " + e0Var.E);
        NativeView nativeView2 = e0Var.F;
        int i10 = e0Var.D;
        int i11 = e0Var.E;
        nativeView2.f3369IL.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) nativeView2.f3369IL.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        nativeView2.f3369IL.setLayoutParams(layoutParams);
        nativeView2.setVisibility(0);
        new ImageHandler().loadImg(nativeView2.IL1Iii, str, nativeView2.f3369IL, "", new j.b());
        e0Var.F.setLayoutParams(new ViewGroup.LayoutParams(e0Var.D, e0Var.E));
        e0Var.F.setOnClickListener(e0Var);
    }

    @Override // l.r
    public final void B(Activity activity, int i10, int i11, j.z zVar) {
        this.C = activity;
        this.D = i10;
        this.E = i11;
        this.B = zVar;
        try {
            if (StringUtil.isAppInstalled(activity, this.f61589j.packageName)) {
                j(AdSdkStateCode.MAIN_OWN_FAILED, e("main_app_exist"));
            } else {
                Activity activity2 = this.C;
                String str = this.f61589j.imgUrl;
                String.valueOf(System.currentTimeMillis());
                new ImageHandler().preloadImg(activity2, str, new u(this, activity2, str));
            }
        } catch (Exception e10) {
            AdLog.e("MainNative loadAd error, msg = " + e10.getMessage(), e10);
            n(e10);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m(this.C, 4);
        MainNativeAdCallBack mainNativeAdCallBack = this.B;
        if (mainNativeAdCallBack != null) {
            mainNativeAdCallBack.onAdClick();
        }
    }

    @Override // j.n0
    public final void z() {
        f(r0.a(this.f61589j.webPrice));
        MainNativeAdCallBack mainNativeAdCallBack = this.B;
        if (mainNativeAdCallBack == null) {
            s("adCallBack 为空！");
        } else {
            mainNativeAdCallBack.onAdLoaded(this.F);
            MainPreloadService.IL1Iii(this.C);
        }
    }

    public static void C(e0 e0Var, Bitmap bitmap) {
        e0Var.getClass();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i10 = e0Var.D;
        if (i10 == 0) {
            e0Var.D = (e0Var.E * width) / height;
            LogUtil.info("自动适应的宽度 = " + e0Var.D);
        } else {
            int i11 = e0Var.E;
            if (i11 == 0) {
                e0Var.E = (i10 * height) / width;
                LogUtil.info("自动适应的高度 = " + e0Var.E);
            } else {
                e0Var.D = (int) (width * (i11 / height));
            }
        }
        int screenWidth = ScreenUtil.getScreenWidth(e0Var.C);
        if (e0Var.D == 0 && e0Var.E == 0) {
            e0Var.D = screenWidth;
            e0Var.E = (height * screenWidth) / width;
        }
        LogUtil.info("ScreenWidth = " + screenWidth);
        if (e0Var.D >= screenWidth) {
            e0Var.D = screenWidth;
            LogUtil.info("宽度太宽，适应之后宽度 = " + e0Var.D);
            e0Var.E = (e0Var.D * height) / width;
            LogUtil.info("宽度太宽，适应之后高度 = " + e0Var.E);
        }
        int screenHeight = ScreenUtil.getScreenHeight(e0Var.C);
        LogUtil.info("ScreenHeight = " + screenHeight);
        if (e0Var.E >= screenHeight) {
            e0Var.E = screenHeight;
            e0Var.D = (width * screenHeight) / height;
            LogUtil.info("高度太高，适应之后宽度 = " + e0Var.D);
            LogUtil.info("高度太高，适应之后高度 = " + e0Var.E);
        }
    }
}
