package f;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.NativeAdView;
import com.yk.e.util.AdLog;
import com.yk.e.util.IDUtil;
import com.yk.e.util.ScreenUtil;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f52751b;

    public n(c0 c0Var) {
        this.f52751b = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        f fVar = this.f52751b.f52736b;
        i.e eVar = fVar.f61590k;
        if (eVar == null || (i10 = eVar.f54039d) == 0) {
            i10 = 1000;
        }
        if (eVar == null || (i11 = eVar.f54040e) == 0) {
            i11 = 570;
        }
        Activity activity = fVar.D;
        int i12 = fVar.B;
        if (i12 == 0) {
            fVar.B = (fVar.C * i10) / i11;
        } else {
            int i13 = fVar.C;
            if (i13 == 0) {
                fVar.C = (i12 * i11) / i10;
            } else {
                fVar.B = (int) (i10 * (i13 / i11));
            }
        }
        int screenWidth = ScreenUtil.getScreenWidth(activity);
        if (fVar.B == 0 && fVar.C == 0) {
            fVar.B = screenWidth;
            fVar.C = (i11 * screenWidth) / i10;
        }
        if (fVar.B >= screenWidth) {
            fVar.B = screenWidth;
            fVar.C = (screenWidth * i11) / i10;
        }
        int screenHeight = ScreenUtil.getScreenHeight(activity);
        if (fVar.C >= screenHeight) {
            fVar.C = screenHeight;
            fVar.B = (i10 * screenHeight) / i11;
        }
        AdLog.d("expressWidth " + fVar.B);
        AdLog.d("expressHeight " + fVar.C);
        f fVar2 = this.f52751b.f52736b;
        View viewRender = NativeAdView.render(fVar2.D, fVar2.F);
        View viewInflate = LayoutInflater.from(this.f52751b.f52736b.D).inflate(IDUtil.getLayoutID(this.f52751b.f52736b.D, "main_layout_native_facebook_render"), (ViewGroup) null);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(IDUtil.getViewID(this.f52751b.f52736b.D, "main_fb_native_root_rl"));
        ((LinearLayout) viewInflate.findViewById(IDUtil.getViewID(this.f52751b.f52736b.D, "main_fb_native_content_ly"))).addView(viewRender, -1, -1);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
        f fVar3 = this.f52751b.f52736b;
        layoutParams.width = fVar3.B;
        layoutParams.height = fVar3.C;
        viewInflate.setLayoutParams(layoutParams);
        this.f52751b.f52736b.E.onAdLoaded(viewInflate);
    }
}
