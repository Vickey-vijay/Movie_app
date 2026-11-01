package dp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.NativeBannerAdView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ScreenUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class y implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f52280b;

    public y(z zVar) {
        this.f52280b = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        NativeBannerAdView.Type type;
        m0 m0Var = this.f52280b.f52281b;
        i.e eVar = m0Var.f61590k;
        if (eVar == null || (i10 = eVar.f54039d) == 0) {
            i10 = IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW;
        }
        if (eVar == null || (i11 = eVar.f54040e) == 0) {
            i11 = 465;
        }
        Activity activity = m0Var.F;
        int i12 = m0Var.B;
        if (i12 == 0) {
            m0Var.B = (m0Var.C * i10) / i11;
        } else {
            int i13 = m0Var.C;
            if (i13 == 0) {
                m0Var.C = (i12 * i11) / i10;
            } else {
                m0Var.B = (int) (i10 * (i13 / i11));
            }
        }
        int screenWidth = ScreenUtil.getScreenWidth(activity);
        if (m0Var.B == 0 && m0Var.C == 0) {
            m0Var.B = screenWidth;
            m0Var.C = (i11 * screenWidth) / i10;
        }
        if (m0Var.B >= screenWidth) {
            m0Var.B = screenWidth;
            m0Var.C = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(activity);
        if (m0Var.C >= screenHeight) {
            m0Var.C = screenHeight;
            m0Var.B = (i10 * screenHeight) / i11;
        }
        AdLog.d("expressWidth " + m0Var.B);
        AdLog.d("expressHeight " + m0Var.C);
        int layoutID = IDUtil.getLayoutID(this.f52280b.f52281b.F, "main_layout_native_facebook_render");
        m0 m0Var2 = this.f52280b.f52281b;
        m0Var2.I = LayoutInflater.from(m0Var2.F).inflate(layoutID, (ViewGroup) null);
        m0 m0Var3 = this.f52280b.f52281b;
        RelativeLayout relativeLayout = (RelativeLayout) m0Var3.I.findViewById(IDUtil.getViewID(m0Var3.F, "main_fb_native_root_rl"));
        m0 m0Var4 = this.f52280b.f52281b;
        LinearLayout linearLayout = (LinearLayout) m0Var4.I.findViewById(IDUtil.getViewID(m0Var4.F, "main_fb_native_content_ly"));
        m0 m0Var5 = this.f52280b.f52281b;
        ImageView imageView = (ImageView) m0Var5.I.findViewById(IDUtil.getViewID(m0Var5.F, "main_fb_native_im_close"));
        m0 m0Var6 = this.f52280b.f52281b;
        int i14 = m0Var6.C;
        if (i14 <= 50) {
            type = NativeBannerAdView.Type.HEIGHT_50;
        } else {
            type = i14 <= 100 ? NativeBannerAdView.Type.HEIGHT_100 : NativeBannerAdView.Type.HEIGHT_120;
        }
        linearLayout.addView(NativeBannerAdView.render(m0Var6.F, m0Var6.H, type), -1, -1);
        imageView.setOnClickListener(this.f52280b.f52281b.L);
        imageView.setVisibility(0);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        m0 m0Var7 = this.f52280b.f52281b;
        layoutParams.width = m0Var7.B;
        layoutParams.height = m0Var7.C;
        m0Var7.I.setLayoutParams(layoutParams);
        m0 m0Var8 = this.f52280b.f52281b;
        m0Var8.G.onAdLoaded(m0Var8.I);
    }
}
