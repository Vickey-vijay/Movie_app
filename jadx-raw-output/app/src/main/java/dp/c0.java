package dp;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.yk.e.util.IDUtil;

/* JADX INFO: loaded from: classes11.dex */
public final class c0 implements NativeAdvancedAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f52244a;

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void closeFullScreen(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onClose(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLeaveApp(MBridgeIds mBridgeIds) {
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void showFullScreen(MBridgeIds mBridgeIds) {
    }

    public c0(v vVar) {
        this.f52244a = vVar;
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onClick(MBridgeIds mBridgeIds) {
        this.f52244a.G.onAdClick();
        v vVar = this.f52244a;
        if (vVar.D) {
            vVar.C();
            this.f52244a.G.onAdClose();
        }
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLoadFailed(MBridgeIds mBridgeIds, String str) {
        this.f52244a.v(str);
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLoadSuccessed(MBridgeIds mBridgeIds) {
        v vVar = this.f52244a;
        if (vVar.H != null) {
            int layoutID = IDUtil.getLayoutID(vVar.F, "main_layout_native_mintergral");
            v vVar2 = this.f52244a;
            vVar2.I = LayoutInflater.from(vVar2.F).inflate(layoutID, (ViewGroup) null);
            v vVar3 = this.f52244a;
            RelativeLayout relativeLayout = (RelativeLayout) vVar3.I.findViewById(IDUtil.getViewID(vVar3.F, "main_min_native_root_rl"));
            v vVar4 = this.f52244a;
            LinearLayout linearLayout = (LinearLayout) vVar4.I.findViewById(IDUtil.getViewID(vVar4.F, "main_min_native_content_ly"));
            v vVar5 = this.f52244a;
            ImageView imageView = (ImageView) vVar5.I.findViewById(IDUtil.getViewID(vVar5.F, "main_min_native_im_close"));
            if (this.f52244a.H.getAdViewGroup() == null) {
                this.f52244a.v("Mintegral adView is null");
                return;
            }
            linearLayout.addView(this.f52244a.H.getAdViewGroup());
            imageView.setVisibility(0);
            imageView.setOnClickListener(this.f52244a.N);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            v vVar6 = this.f52244a;
            layoutParams.width = vVar6.B;
            layoutParams.height = vVar6.C;
            vVar6.I.setLayoutParams(layoutParams);
            v vVar7 = this.f52244a;
            vVar7.G.onAdLoaded(vVar7.I);
        }
    }

    @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
    public final void onLogImpression(MBridgeIds mBridgeIds) {
        v vVar = this.f52244a;
        vVar.G.onAdShow(gl.r0.b(null, vVar.f61585f));
    }
}
