package k;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ironsource.Z7;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.object.MainParams;
import com.yk.e.pl.OktVideoView;
import com.yk.e.pl.PreloadManager;
import com.yk.e.util.AdLog;
import com.yk.e.util.AdPlayer;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ImageHandler;
import com.yk.e.util.MainPreloadService;
import com.yk.e.util.StringUtil;
import j.e2;
import java.util.Timer;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends t0 {
    public int C;
    public TextView D;
    public Timer E;
    public MainSplashAdCallBack F;
    public Activity G;
    public ImageView H;
    public AdPlayer I;
    public OktVideoView J;
    public ViewGroup M;
    public i0 N;
    public boolean K = false;
    public boolean L = false;
    public boolean O = false;
    public final v0 P = new v0(this);
    public final Handler Q = new Handler(Looper.getMainLooper(), new w0(this));

    @Override // k.t0
    public final void B(Activity activity, ViewGroup viewGroup, e2 e2Var) {
        this.G = activity;
        this.F = e2Var;
        this.M = viewGroup;
        i0 i0Var = new i0(this, this.G);
        this.N = i0Var;
        this.H = (ImageView) i0Var.findViewById(IDUtil.getViewID(this.G, "main_im_gif_splash"));
        this.J = (OktVideoView) this.N.findViewById(IDUtil.getViewID(this.G, "main_splash_player_view"));
        TextView textView = (TextView) this.N.findViewById(IDUtil.getViewID(this.G, "main_txt_skip"));
        this.D = textView;
        textView.setOnClickListener(new a());
        this.N.setOnClickListener(this.P);
        this.O = false;
        try {
            if (StringUtil.isAppInstalled(this.G, this.f61589j.packageName)) {
                j(AdSdkStateCode.MAIN_OWN_FAILED, e("main_app_exist"));
            } else {
                MainParams mainParams = this.f61589j;
                this.C = mainParams.countDownTime;
                if (TextUtils.isEmpty(mainParams.videoUrl)) {
                    Activity activity2 = this.G;
                    String str = this.f61589j.imgUrl;
                    String.valueOf(System.currentTimeMillis());
                    new ImageHandler().preloadImg(activity2, str, new r(this, activity2, str));
                } else {
                    this.H.setVisibility(8);
                    this.J.setVisibility(0);
                    PreloadManager.getInstance(this.G.getApplicationContext()).addSplashLoadTask(this.f61589j.videoUrl, (int) System.currentTimeMillis(), false, new z(this));
                    new Handler().postDelayed(new k0(this), 60000L);
                }
            }
        } catch (Exception e10) {
            AdLog.e("loadData MainSplash error, msg = " + e10.getMessage(), e10);
            n(e10);
        }
    }

    @Override // k.t0
    public final void C() {
        try {
            Activity activity = this.G;
            if (activity == null || activity.isFinishing()) {
                a("SplashAD activity is finish!");
                return;
            }
            if (!TextUtils.isEmpty(this.f61589j.videoUrl)) {
                this.I.play4PreLoad();
            }
            D();
            this.M.removeAllViews();
            this.M.addView(this.N);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            n(e10);
        }
    }

    public final void D() {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.D.getLayoutParams();
        layoutParams.width = StringUtil.dip2px(this.G, 60.0f);
        this.D.setLayoutParams(layoutParams);
        this.D.setText(IDUtil.getString(this.G, "main_skip") + Z7.f27998r + this.C);
        this.D.setVisibility(0);
        Timer timer = this.E;
        if (timer != null) {
            timer.cancel();
            this.E = null;
        }
        this.E = new Timer();
        this.E.schedule(new m0(this), 1000L, 1000L);
        if (this.O) {
            this.O = false;
            this.F.onAdShow(gl.r0.b(null, this.f61585f));
        }
        o(new u0(this));
    }

    @Override // j.n0
    public final void z() {
        if (this.O) {
            f(gl.r0.a(this.f61589j.webPrice));
            this.F.onAdLoaded();
            MainPreloadService.IL1Iii(this.G);
        }
    }
}
