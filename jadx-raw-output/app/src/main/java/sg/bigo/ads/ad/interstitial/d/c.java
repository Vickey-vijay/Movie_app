package sg.bigo.ads.ad.interstitial.d;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RealtimeBlurLinearLayout;

/* JADX INFO: loaded from: classes11.dex */
public class c extends b {
    public c(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.b
    public final void F() {
        super.F();
        RealtimeBlurLinearLayout realtimeBlurLinearLayout = ((b) this).f68153y;
        if (realtimeBlurLinearLayout != null) {
            ViewGroup.LayoutParams layoutParams = realtimeBlurLinearLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += -sg.bigo.ads.common.utils.e.a(((b) this).f68153y.getContext(), 60);
                ((b) this).f68153y.requestLayout();
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.d.b
    public int z() {
        return R.id.inter_component_20;
    }
}
