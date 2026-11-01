package e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.yk.e.util.IDUtil;
import gl.r0;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements NativeAdvancedAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f52298a;

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void closeFullScreen(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLeaveApp(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void showFullScreen(MBridgeIds mBridgeIds) {
    }

    public i0(q qVar) {
        this.f52298a = qVar;
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onClick(MBridgeIds mBridgeIds) {
        this.f52298a.M.onAdClick();
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onClose(MBridgeIds mBridgeIds) {
        this.f52298a.M.onAdClose();
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLoadFailed(MBridgeIds mBridgeIds, String str) {
        this.f52298a.v(str);
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLoadSuccessed(MBridgeIds mBridgeIds) {
        q qVar = this.f52298a;
        if (qVar.N != null) {
            View viewInflate = LayoutInflater.from(this.f52298a.L).inflate(IDUtil.getLayoutID(qVar.L, "main_layout_native_mintergral"), (ViewGroup) null);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(IDUtil.getViewID(this.f52298a.L, "main_min_native_root_rl"));
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(IDUtil.getViewID(this.f52298a.L, "main_min_native_content_ly"));
            if (this.f52298a.N.getAdViewGroup() == null) {
                this.f52298a.v("Mintegral adView is null");
                return;
            }
            linearLayout.addView(this.f52298a.N.getAdViewGroup());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            q qVar2 = this.f52298a;
            layoutParams.width = qVar2.B;
            layoutParams.height = qVar2.C;
            viewInflate.setLayoutParams(layoutParams);
            this.f52298a.M.onAdLoaded(viewInflate);
        }
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLogImpression(MBridgeIds mBridgeIds) {
        q qVar = this.f52298a;
        qVar.M.onAdShow(r0.b(null, qVar.f61585f));
    }
}
