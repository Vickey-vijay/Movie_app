package sg.bigo.ads.ad.interstitial.c;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes10.dex */
public final class ac extends ab {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f67973t;

    public ac(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, mVar, cVar);
        this.f67973t = false;
        this.f67941s = false;
    }

    public final void a(int i10) {
        this.f67937o = i10;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    public final void a(boolean z10, boolean z11) {
        if (this.f67973t) {
            if (z10) {
                ViewGroup viewGroup = (ViewGroup) this.f67930j.findViewById(R.id.bigo_ad_end_page_content);
                if (viewGroup != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                    marginLayoutParams.topMargin = sg.bigo.ads.common.utils.e.a(viewGroup.getContext(), 146);
                    viewGroup.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            }
            if (z11) {
                ViewGroup viewGroup2 = (ViewGroup) this.f67930j.findViewById(R.id.bigo_ad_end_page_content);
                if (viewGroup2 != null) {
                    int iA = sg.bigo.ads.common.utils.e.a(viewGroup2.getContext(), 10);
                    int iA2 = sg.bigo.ads.common.utils.e.a(viewGroup2.getContext(), 20);
                    viewGroup2.setPadding(iA2, iA, iA2, iA);
                }
                View viewFindViewById = this.f67930j.findViewById(R.id.inter_icon);
                if (viewFindViewById != null) {
                    viewFindViewById.setTranslationY(sg.bigo.ads.common.utils.e.a(viewFindViewById.getContext(), -80));
                }
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab, sg.bigo.ads.ad.interstitial.u
    public final boolean a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, @NonNull ViewGroup viewGroup, @NonNull View view, sg.bigo.ads.ad.interstitial.t.a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        return super.a(this.f68982f, qVar, viewGroup, view, aVar, i10, 13, i12, viewArr);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab, sg.bigo.ads.ad.interstitial.c.a
    public final void d(sg.bigo.ads.ad.interstitial.q qVar) {
        ViewGroup viewGroup;
        this.f67973t = sg.bigo.ads.common.utils.e.c(this.f68982f.f67537b.f69380e) <= 2000;
        super.d(qVar);
        ViewGroup viewGroup2 = this.f67931k;
        if (viewGroup2 != null) {
            viewGroup2.setBackgroundColor(0);
            ViewGroup viewGroup3 = (ViewGroup) this.f67931k.findViewById(R.id.bigo_ad_bottom_privacy_content);
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
            ViewGroup viewGroup4 = (ViewGroup) this.f67931k.findViewById(R.id.bigo_ad_inter_layout_end_page);
            if (viewGroup4 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup4.getLayoutParams();
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.rightMargin = 0;
            }
            String str = this.f68982f.R().f69325g;
            if (!sg.bigo.ads.common.utils.q.b((CharSequence) str) || (viewGroup = this.f67930j) == null) {
                return;
            }
            Context context = viewGroup.getContext();
            sg.bigo.ads.common.view.c.a(context, this.f67930j, new sg.bigo.ads.common.view.c(context, str));
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final boolean k() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    public final int l() {
        return 13;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    public final int p() {
        return 20;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    public final int q() {
        if (this.f67973t) {
            return 138;
        }
        return super.q();
    }
}
