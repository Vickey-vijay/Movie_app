package sg.bigo.ads.ad.interstitial.c;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends ab {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ViewGroup f68081t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final sg.bigo.ads.ad.b.a.a.b f68082u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f68083v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f68084w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f68085x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f68086y;

    public w(@NonNull sg.bigo.ads.ad.b.b bVar, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, mVar, cVar);
        this.f68085x = 0;
        this.f68086y = 1;
        this.f68082u = (sg.bigo.ads.ad.b.a.a.b) bVar;
        this.f67937o = mVar.a("multi_ads_endpage.ad_component_layout");
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab, sg.bigo.ads.ad.interstitial.c.a
    public final void a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, int i10) {
        super.a(qVar, i10);
        a((Button) this.f68081t.findViewById(R.id.inter_btn_cta), qVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    public final void a(boolean z10) {
        super.a(z10);
        if (this.f68084w) {
            return;
        }
        this.f68084w = true;
        if (z10) {
            sg.bigo.ads.ad.b.a.a(this.f67930j, this.f68081t, 13, this.f68082u.f(1), this.f67940r);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f67930j, this.f68081t, 13, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab, sg.bigo.ads.ad.interstitial.u
    public final boolean a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, @NonNull ViewGroup viewGroup, @NonNull View view, sg.bigo.ads.ad.interstitial.t.a aVar, int i10, int i11, int i12, @Nullable View... viewArr) {
        sg.bigo.ads.ad.b.b bVarF = this.f68082u.f(0);
        if (bVarF != null) {
            super.a(bVarF, qVar, viewGroup, this.f67938p, aVar, i10, 13, i12, viewArr);
        } else {
            this.f67938p.setVisibility(8);
        }
        sg.bigo.ads.ad.b.b bVarF2 = this.f68082u.f(1);
        if (bVarF2 != null) {
            super.a(bVarF2, qVar, viewGroup, this.f68081t, aVar, i10, 13, i12, viewArr);
        } else {
            this.f68081t.setVisibility(8);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    @Override // sg.bigo.ads.ad.interstitial.c.ab, sg.bigo.ads.ad.interstitial.c.a
    public final void d(sg.bigo.ads.ad.interstitial.q qVar) {
        ViewGroup viewGroup;
        int i10;
        ViewGroup viewGroup2;
        super.d(qVar);
        int i11 = this.f67937o;
        if (i11 == 2) {
            viewGroup = this.f67931k;
            i10 = R.id.bigo_ad_end_stub_2_all_wrap;
            this.f68081t = (ViewGroup) ((ViewStub) viewGroup.findViewById(i10)).inflate();
        } else {
            if (i11 != 3) {
                if (i11 == 4) {
                    viewGroup = this.f67931k;
                    i10 = R.id.bigo_ad_end_stub_2_all_wrap;
                } else if (i11 != 5) {
                    viewGroup = this.f67931k;
                    i10 = R.id.bigo_ad_end_stub_2_half_wrap;
                }
                this.f68081t = (ViewGroup) ((ViewStub) viewGroup.findViewById(i10)).inflate();
            }
            ViewGroup viewGroup3 = (ViewGroup) ((ViewStub) this.f67931k.findViewById(R.id.bigo_ad_end_stub_2_img_wrap)).inflate();
            this.f68081t = viewGroup3;
            a(qVar, viewGroup3, this.f68082u.f(1));
        }
        if (1 == this.f67937o && (viewGroup2 = this.f68081t) != null) {
            ((ViewGroup.MarginLayoutParams) viewGroup2.getLayoutParams()).topMargin = sg.bigo.ads.common.utils.e.a(this.f67931k.getContext(), 58);
        }
        ab.a((ViewGroup) this.f68081t.findViewById(R.id.bigo_ad_inter_layout_end_page));
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab, sg.bigo.ads.ad.interstitial.c.a
    public final int h() {
        return R.layout.bigo_ad_activity_interstitial_multi_mix_end;
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
    public final sg.bigo.ads.ad.b.b m() {
        sg.bigo.ads.ad.b.a.a.b bVar = this.f68082u;
        if (bVar != null) {
            return bVar.f(0);
        }
        return null;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    public final ViewGroup n() {
        return this.f68081t;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.ab
    public final void o() {
        super.o();
        if (this.f68083v) {
            return;
        }
        ViewGroup viewGroup = this.f68081t;
        View viewFindViewWithTag = viewGroup != null ? viewGroup.findViewWithTag(9) : null;
        if (this.f67939q && viewFindViewWithTag != null) {
            this.f68083v = true;
            sg.bigo.ads.ad.b.a.a(this.f67930j, viewFindViewWithTag, 13, this.f68082u.f(1), this.f67940r);
        } else if (viewFindViewWithTag != null) {
            this.f68083v = true;
            sg.bigo.ads.ad.b.a.a(this.f67930j, viewFindViewWithTag, 13, sg.bigo.ads.ad.interstitial.q.F, this.f67940r);
        }
    }
}
