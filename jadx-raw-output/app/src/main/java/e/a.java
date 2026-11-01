package e;

import android.app.Activity;
import android.graphics.Bitmap;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.yk.e.adview.WorldNativeView;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.object.MainParams;
import com.yk.e.object.WorldNativeImgParams;
import com.yk.e.util.AdLog;
import com.yk.e.util.ImageHandler;
import com.yk.e.util.LogUtil;
import com.yk.e.util.ScreenUtil;
import com.yk.e.util.StringUtil;
import gl.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends c0 {
    public MainWdNativeAdCallback L;
    public Activity M;
    public WorldNativeView N;
    public int O;
    public int P;

    @Override // j.n0
    public final boolean b() {
        return false;
    }

    public static void D(a aVar, MainParams mainParams, Bitmap bitmap, String str) {
        aVar.N.setTitle(mainParams.adTitle);
        aVar.N.setDes(mainParams.adDes);
        aVar.N.setContent(mainParams.adContent);
        aVar.N.setTags(mainParams.adTags);
        WorldNativeView worldNativeView = aVar.N;
        int i10 = aVar.O;
        int i11 = aVar.P;
        worldNativeView.getClass();
        worldNativeView.f3344IL.setVisibility(0);
        worldNativeView.I1I.setVisibility(8);
        new ImageHandler().loadImg(worldNativeView.IL1Iii, str, worldNativeView.f3344IL, "", null);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) worldNativeView.f3344IL.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        worldNativeView.f3344IL.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) worldNativeView.f3345IiL.getLayoutParams();
        layoutParams2.width = i10;
        worldNativeView.f3345IiL.setLayoutParams(layoutParams2);
        aVar.N.setTagTvParams(aVar.K);
        aVar.N.setCenterLyParams(aVar.I);
        aVar.N.setTagLyParams(aVar.J);
        aVar.N.setContentLyParams(aVar.H);
        aVar.N.setDetailsParams(aVar.F);
        aVar.N.setTitle2Params(aVar.E);
        aVar.N.setTitleParams(aVar.D);
        aVar.N.setIconImageParams(aVar.G);
        WorldNativeView worldNativeView2 = aVar.N;
        WorldNativeView.IL1Iii(worldNativeView2.f3348iILLL1, worldNativeView2.iIi1);
        WorldNativeView.IL1Iii(worldNativeView2.f3352lLi1LL, worldNativeView2.iIlLiL);
        WorldNativeView.IL1Iii(worldNativeView2.Ilil, worldNativeView2.I11li1);
        WorldNativeView.IL1Iii(worldNativeView2.f3347L11I, worldNativeView2.f51170Lil);
        WorldNativeView.IL1Iii(worldNativeView2.f3353il, worldNativeView2.LlLI1);
        WorldNativeView.IL1Iii(worldNativeView2.ILL, worldNativeView2.f3351llL1ii);
        RelativeLayout relativeLayout = worldNativeView2.f3345IiL;
        WorldNativeImgParams worldNativeImgParams = worldNativeView2.f3350lIlii;
        if (relativeLayout == null) {
            AdLog.subAd("setIconViewParams: View is null");
        } else if (worldNativeImgParams != null) {
            WorldNativeView.IL1Iii(relativeLayout, worldNativeImgParams);
        }
        RelativeLayout relativeLayout2 = worldNativeView2.f3345IiL;
        WorldNativeImgParams worldNativeImgParams2 = worldNativeView2.f3350lIlii;
        if (relativeLayout2 == null) {
            AdLog.subAd("setIconViewParams: View is null");
        } else if (worldNativeImgParams2 != null) {
            WorldNativeView.IL1Iii(relativeLayout2, worldNativeImgParams2);
        }
        WorldNativeView.IL1Iii(worldNativeView2.f3346Ll1, worldNativeView2.f3354lL);
        WorldNativeView.IL1Iii(worldNativeView2.f3349lIiI, worldNativeView2.f3354lL);
        WorldNativeView.IL1Iii(worldNativeView2.f3343ILl, worldNativeView2.f3354lL);
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) worldNativeView2.f3348iILLL1.getLayoutParams();
        layoutParams3.height = worldNativeView2.getItemDefHeight();
        worldNativeView2.f3348iILLL1.setLayoutParams(layoutParams3);
    }

    @Override // e.c0
    public final void B(Activity activity, j.d0 d0Var) {
        this.M = activity;
        this.L = d0Var;
        try {
            if (StringUtil.isAppInstalled(activity, this.f61589j.packageName)) {
                j(AdSdkStateCode.MAIN_OWN_FAILED, e("main_app_exist"));
                return;
            }
            if (this.N != null) {
                LogUtil.info("destroyBannerView");
                gl.h.a(this.N);
                this.N = null;
            }
            WorldNativeView worldNativeView = new WorldNativeView(this.M);
            this.N = worldNativeView;
            worldNativeView.setViewCallback(new e0(this));
            Activity activity2 = this.M;
            String str = this.f61589j.imgUrl;
            String.valueOf(System.currentTimeMillis());
            new ImageHandler().preloadImg(activity2, str, new b(this, activity2, str));
        } catch (Exception e10) {
            AdLog.e("MainWorldNative load error, msg = " + e10.getMessage(), e10);
            n(e10);
        }
    }

    @Override // j.n0
    public final void z() {
        if (this.L == null || this.N == null) {
            s("adCallBack 为空！");
        } else {
            f(r0.a(this.f61589j.webPrice));
            this.L.onAdLoaded(this.N);
        }
    }

    public static void C(a aVar, Bitmap bitmap) {
        aVar.getClass();
        AdLog.d("initIconSize");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        double d10 = ((double) width) / ((double) height);
        AdLog.i("bWidth = " + width);
        AdLog.i("bHeight = " + height);
        WorldNativeImgParams worldNativeImgParams = aVar.G;
        if (worldNativeImgParams != null) {
            aVar.O = worldNativeImgParams.getWidth();
            aVar.P = aVar.G.getHeight();
        }
        AdLog.i("iconWidth = " + aVar.O);
        AdLog.i("iconHeight = " + aVar.P);
        int screenWidth = (ScreenUtil.getScreenWidth(aVar.M) / 5) * 4;
        int itemDefHeight = aVar.N.getItemDefHeight();
        int iconDefWidth = aVar.O;
        if (iconDefWidth == 0) {
            iconDefWidth = aVar.N.getIconDefWidth();
        }
        aVar.O = iconDefWidth;
        int itemDefHeight2 = aVar.P;
        if (itemDefHeight2 == 0) {
            itemDefHeight2 = aVar.N.getItemDefHeight();
        }
        aVar.P = itemDefHeight2;
        aVar.O = Math.min(aVar.O, screenWidth);
        int iMin = Math.min(aVar.P, itemDefHeight);
        aVar.P = iMin;
        if (Math.abs((((double) aVar.O) / ((double) iMin)) - d10) > 0.06d) {
            AdLog.e("MainWorldNative Icon 参数比例失真");
            int iconDefWidth2 = aVar.N.getIconDefWidth();
            aVar.O = iconDefWidth2;
            aVar.P = (int) (((double) iconDefWidth2) / d10);
        }
        AdLog.i("adp iconWidth = " + aVar.O);
        AdLog.i("adp iconHeight = " + aVar.P);
    }
}
