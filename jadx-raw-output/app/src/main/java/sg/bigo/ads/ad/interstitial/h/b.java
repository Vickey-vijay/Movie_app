package sg.bigo.ads.ad.interstitial.h;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.q;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.common.p;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f68572s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f68573t;

    public b(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull m mVar, @NonNull p pVar) {
        super(bVar, mVar, pVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public final void d(@NonNull q qVar) {
        ViewGroup viewGroup = this.f68551k;
        if (viewGroup == null || qVar == null) {
            return;
        }
        this.f68572s = (TextView) viewGroup.findViewById(R.id.inter_title);
        this.f68573t = (TextView) this.f68551k.findViewById(R.id.inter_description);
        sg.bigo.ads.ad.interstitial.d.a(this.f68572s, -234881024);
        sg.bigo.ads.ad.interstitial.d.a(this.f68573t, -234881024);
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean d() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public final boolean g() {
        p pVar = ((a) this).f68548h;
        return pVar != null && pVar.f69807c > 960;
    }

    @Override // sg.bigo.ads.ad.interstitial.h.a
    public final int h() {
        return R.layout.bigo_ad_view_click_guide_1;
    }
}
