package dp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.yk.e.adview.PauseInterstitialView;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.pl.PreloadManager;
import com.yk.e.util.AdLog;
import com.yk.e.util.AdPlayer;
import com.yk.e.util.ImageHandler;
import com.yk.e.util.LogUtil;
import com.yk.e.util.ScreenUtil;
import com.yk.e.util.StringUtil;
import j.l1;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends u implements View.OnClickListener {
    public MainMaterialCallback F;
    public Activity G;
    public PauseInterstitialView H;
    public boolean I = false;
    public boolean J = false;

    @Override // j.n0
    public final boolean b() {
        return false;
    }

    public static void E(n nVar, Bitmap bitmap, String str) {
        LogUtil.info("expressWidth = " + nVar.B);
        LogUtil.info("expressHeight = " + nVar.C);
        PauseInterstitialView pauseInterstitialView = nVar.H;
        int i10 = nVar.B;
        int i11 = nVar.C;
        pauseInterstitialView.f3342il.setVisibility(8);
        pauseInterstitialView.f3336IL.setVisibility(0);
        new ImageHandler().loadImg(pauseInterstitialView.IL1Iii, str, pauseInterstitialView.f3336IL, "", null);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) pauseInterstitialView.f3336IL.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        pauseInterstitialView.f3336IL.setLayoutParams(layoutParams);
        pauseInterstitialView.f3341lLi1LL.setLayoutParams(new LinearLayout.LayoutParams(i10, i11));
        ImageView imageView = pauseInterstitialView.Ilil;
        PauseInterstitialView.IL1Iii(imageView, i10, (RelativeLayout.LayoutParams) imageView.getLayoutParams());
        pauseInterstitialView.setVisibility(0);
        nVar.H.setLayoutParams(new ViewGroup.LayoutParams(nVar.B, nVar.C));
    }

    @Override // dp.u
    public final void B(Activity activity, l1 l1Var) {
        this.G = activity;
        this.F = l1Var;
        try {
            if (StringUtil.isAppInstalled(activity, this.f61589j.packageName)) {
                j(AdSdkStateCode.MAIN_OWN_FAILED, e("main_app_exist"));
            } else {
                F();
                PauseInterstitialView pauseInterstitialView = new PauseInterstitialView(this.G);
                this.H = pauseInterstitialView;
                pauseInterstitialView.setContentClickListener(this);
                this.H.setMaterialAdCallBack(new q(this));
                if (TextUtils.isEmpty(this.f61589j.videoUrl)) {
                    new ImageHandler().preloadImg(this.G.getApplicationContext(), this.f61589j.imgUrl, new e0(this));
                } else {
                    PreloadManager.getInstance(this.G.getApplicationContext()).addPauseInsertLoadTask(this.f61589j.videoUrl, (int) System.currentTimeMillis(), false, new q0(this));
                    new Handler().postDelayed(new x(this), 60000L);
                }
            }
        } catch (Exception e10) {
            AdLog.e("MainPauseInterstitial error, msg = " + e10.getMessage(), e10);
            n(e10);
        }
    }

    @Override // dp.u
    public final void C() {
        AdLog.d("MainPauseInterstitial destroyView");
        try {
            PauseInterstitialView pauseInterstitialView = this.H;
            if (pauseInterstitialView != null) {
                AdPlayer adPlayer = pauseInterstitialView.ILL;
                if (adPlayer != null) {
                    adPlayer.release();
                }
                gl.h.a(this.H);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    public final void D(int i10, int i11) {
        int i12 = this.B;
        if (i12 == 0) {
            this.B = (this.C * i10) / i11;
        } else {
            int i13 = this.C;
            if (i13 == 0) {
                this.C = (i12 * i11) / i10;
            } else {
                this.B = (int) (i10 * (i13 / i11));
            }
        }
        int screenWidth = ScreenUtil.getScreenWidth(this.G);
        if (this.B == 0 && this.C == 0) {
            this.B = screenWidth;
            this.C = (i11 * screenWidth) / i10;
        }
        if (this.B >= screenWidth) {
            this.B = screenWidth;
            this.C = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(this.G);
        if (this.C >= screenHeight) {
            this.C = screenHeight;
            this.B = (i10 * screenHeight) / i11;
        }
    }

    public final void F() {
        try {
            PauseInterstitialView pauseInterstitialView = this.H;
            if (pauseInterstitialView != null) {
                AdPlayer adPlayer = pauseInterstitialView.ILL;
                if (adPlayer != null) {
                    adPlayer.release();
                }
                AdLog.d("destroyPauseInterstitialView");
                gl.h.a(this.H);
                this.H = null;
            }
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("removeCurView error, msg = "), e10);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.D) {
            AdLog.d("MainPauseInterstitial onClick removeCurView");
            F();
        }
        m(this.G, 28);
        MainMaterialCallback mainMaterialCallback = this.F;
        if (mainMaterialCallback != null) {
            mainMaterialCallback.onAdClick();
        }
    }

    @Override // j.n0
    public final void z() {
        if (this.F == null || this.H == null) {
            s("adCallBack 为空！");
        } else {
            f(gl.r0.a(this.f61589j.webPrice));
            this.F.onAdLoaded(this.H);
        }
    }
}
