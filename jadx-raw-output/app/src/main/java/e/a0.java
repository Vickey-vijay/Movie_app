package e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.NativeBannerAdView;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f52282b;

    public a0(x xVar) {
        this.f52282b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int dimensionPixelOffset = this.f52282b.f52311b.L.getResources().getDimensionPixelOffset(IDUtil.getDimen(this.f52282b.f52311b.L, "dp_135"));
        View viewInflate = LayoutInflater.from(this.f52282b.f52311b.L).inflate(IDUtil.getLayoutID(this.f52282b.f52311b.L, "main_layout_native_facebook_render"), (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(IDUtil.getViewID(this.f52282b.f52311b.L, "main_fb_native_root_rl"));
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(this.f52282b.f52311b.L, "main_fb_native_content_ly"));
        r rVar = this.f52282b.f52311b;
        linearLayout.addView(NativeBannerAdView.render(rVar.L, rVar.N, NativeBannerAdView.Type.HEIGHT_100), -1, -1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = dimensionPixelOffset;
        viewInflate.setLayoutParams(layoutParams);
        this.f52282b.f52311b.M.onAdLoaded(viewInflate);
    }
}
