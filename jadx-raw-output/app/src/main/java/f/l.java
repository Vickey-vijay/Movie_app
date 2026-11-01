package f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.yk.e.util.IDUtil;
import gl.r0;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements NativeAdvancedAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f52749a;

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void closeFullScreen(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLeaveApp(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void showFullScreen(MBridgeIds mBridgeIds) {
    }

    public l(q qVar) {
        this.f52749a = qVar;
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onClick(MBridgeIds mBridgeIds) {
        this.f52749a.E.onAdClick();
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onClose(MBridgeIds mBridgeIds) {
        this.f52749a.E.onAdClose();
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLoadFailed(MBridgeIds mBridgeIds, String str) {
        this.f52749a.v(str);
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLoadSuccessed(MBridgeIds mBridgeIds) {
        q qVar = this.f52749a;
        if (qVar.F != null) {
            View viewInflate = LayoutInflater.from(this.f52749a.D).inflate(IDUtil.getLayoutID(qVar.D, "main_layout_native_mintergral"), (ViewGroup) null);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(IDUtil.getViewID(this.f52749a.D, "main_min_native_root_rl"));
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(this.f52749a.D, "main_min_native_content_ly"));
            if (this.f52749a.F.getAdViewGroup() == null) {
                this.f52749a.v("Mintegral adView is null");
                return;
            }
            gl.h.a(this.f52749a.F.getAdViewGroup());
            linearLayout.addView(this.f52749a.F.getAdViewGroup());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            q qVar2 = this.f52749a;
            layoutParams.width = qVar2.B;
            layoutParams.height = qVar2.C;
            viewInflate.setLayoutParams(layoutParams);
            this.f52749a.E.onAdLoaded(viewInflate);
        }
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLogImpression(MBridgeIds mBridgeIds) {
        q qVar = this.f52749a;
        qVar.E.onAdShow(r0.b(null, qVar.f61585f));
    }
}
