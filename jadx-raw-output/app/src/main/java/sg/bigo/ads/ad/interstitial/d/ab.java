package sg.bigo.ads.ad.interstitial.d;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;

/* JADX INFO: loaded from: classes10.dex */
public class ab extends w {
    public ab(@NonNull sg.bigo.ads.ad.b.b bVar, sg.bigo.ads.api.a.m mVar) {
        super(bVar, mVar);
    }

    @Override // sg.bigo.ads.ad.d.f
    public final void a(AdCountDownButton adCountDownButton, ViewGroup viewGroup, sg.bigo.ads.ad.d.f.a aVar) {
        if (viewGroup == null) {
            return;
        }
        if (this.f67672o == null) {
            this.f67672o = new sg.bigo.ads.ad.d.d();
        }
        this.f67672o.a();
        this.f67672o.a(viewGroup, m(), aVar);
    }
}
