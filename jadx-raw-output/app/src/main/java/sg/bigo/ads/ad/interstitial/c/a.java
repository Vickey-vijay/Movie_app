package sg.bigo.ads.ad.interstitial.c;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends sg.bigo.ads.ad.interstitial.u {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f67928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.f f67929i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewGroup f67930j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ViewGroup f67931k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public TextView f67932l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final sg.bigo.ads.ad.interstitial.e.c f67933m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ValueCallback<Double> f67934n;

    /* JADX WARN: Type inference failed for: r2v1, types: [sg.bigo.ads.api.core.b] */
    public a(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, mVar);
        this.f67934n = new ValueCallback<Double>() { // from class: sg.bigo.ads.ad.interstitial.c.a.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Double d10) {
                Double d11 = d10;
                if (d11 != null) {
                    a.this.a(d11.doubleValue());
                }
            }
        };
        this.f67928h = i10;
        ?? F = bVar.f();
        this.f67929i = new sg.bigo.ads.ad.interstitial.f(mVar.a("endpage.gp_element"), 0, F != 0 ? F.n() : "");
        this.f67933m = cVar;
    }

    public static int a(@Nullable sg.bigo.ads.api.a.m mVar) {
        return sg.bigo.ads.ad.interstitial.d.a.a(mVar, "endpage.webview_layout");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static a a(@NonNull sg.bigo.ads.ad.b.b bVar, @Nullable sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.multi_img.b bVar2, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar, boolean z10) {
        if (mVar == null || z10) {
            return null;
        }
        if (bVar instanceof sg.bigo.ads.api.b.e) {
            return new w(bVar, mVar, cVar);
        }
        if (bVar instanceof sg.bigo.ads.api.b.f) {
            sg.bigo.ads.api.b.f fVar = (sg.bigo.ads.api.b.f) bVar;
            if (!fVar.K()) {
                return fVar.i_() == 3 ? new ab(bVar, mVar, cVar) : new ac(bVar, mVar, cVar);
            }
        }
        int iA = mVar.a("endpage.ad_component_layout");
        switch (iA) {
            case 6:
                if (bVar2 == null) {
                    return null;
                }
                return new s(bVar, iA, mVar, bVar2, cVar);
            case 7:
                if (bVar2 == null) {
                    return null;
                }
                return new t(bVar, iA, mVar, bVar2, cVar);
            case 8:
                if (bVar2 == null) {
                    return null;
                }
                return new u(bVar, iA, mVar, bVar2, cVar);
            case 9:
                if (bVar2 == null) {
                    return null;
                }
                return new v(bVar, iA, mVar, bVar2, cVar);
            case 10:
                if (bVar2 == null) {
                    return null;
                }
                return new c(bVar, iA, mVar, bVar2, cVar);
            case 11:
                if (bVar2 == null) {
                    return null;
                }
                return new d(bVar, iA, mVar, bVar2, cVar);
            case 12:
                if (bVar2 == null) {
                    return null;
                }
                return new e(bVar, iA, mVar, bVar2, cVar);
            case 13:
                if (bVar2 == null) {
                    return null;
                }
                return new f(bVar, iA, mVar, bVar2, cVar);
            case 14:
                return new g(bVar, iA, mVar, cVar);
            case 15:
                return new h(bVar, iA, mVar, cVar);
            case 16:
                return new i(bVar, iA, mVar, cVar);
            case 17:
                return new j(bVar, iA, mVar, cVar);
            case 18:
                return new k(bVar, iA, mVar, cVar);
            case 19:
                return new l(bVar, iA, mVar, cVar);
            case 20:
                return new m(bVar, iA, mVar, cVar);
            case 21:
                return new n(bVar, iA, mVar, cVar);
            case 22:
                return new o(bVar, iA, mVar, cVar);
            case 23:
                return new p(bVar, iA, mVar, cVar);
            case 24:
                return new q(bVar, iA, mVar, cVar);
            case 25:
                return new r(bVar, iA, mVar, cVar);
            default:
                return null;
        }
    }

    public static boolean a(a aVar, sg.bigo.ads.api.a.m mVar) {
        if (aVar != null && aVar.d()) {
            return true;
        }
        if (mVar == null) {
            return false;
        }
        int iA = mVar.a("endpage.ad_component_layout");
        return iA == 3 || iA == 4;
    }

    public static int b(@Nullable sg.bigo.ads.api.a.m mVar) {
        return sg.bigo.ads.ad.interstitial.d.a.b(mVar, "endpage.webview_force_time");
    }

    public View a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, @NonNull ViewGroup viewGroup, int i10) {
        String str;
        String str2;
        String str3;
        if (qVar == null || viewGroup == null) {
            return this.f67930j;
        }
        this.f67930j = viewGroup;
        if (this.f67931k == null) {
            ViewGroup viewGroup2 = (ViewGroup) sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), h(), null, false);
            this.f67931k = viewGroup2;
            this.f67930j.addView(viewGroup2, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f67932l = (TextView) this.f67931k.findViewById(R.id.inter_warning);
        d(qVar);
        a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                sg.bigo.ads.ad.interstitial.e.c cVar = aVar.f67933m;
                if (cVar != null) {
                    cVar.a(aVar.f67931k, 1);
                }
            }
        });
        a(qVar, 1);
        if (k()) {
            str = "multi_ads_endpage.click_type";
            str2 = "multi_ads_endpage.media_view_clickable_switch";
            str3 = "multi_ads_endpage.other_space_clickable_switch";
        } else {
            str = "endpage.click_type";
            str2 = "endpage.media_view_clickable_switch";
            str3 = "endpage.other_space_clickable_switch";
        }
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        ViewGroup viewGroup3 = this.f67930j;
        ViewGroup viewGroup4 = this.f67931k;
        sg.bigo.ads.api.a.m mVar = this.f68983g;
        a(qVar, viewGroup3, viewGroup4, null, i10, 4, mVar == null ? 0 : mVar.a(str4), this.f67931k);
        i();
        sg.bigo.ads.api.a.m mVar2 = this.f68983g;
        int iA = mVar2 != null ? mVar2.a(str4) : 0;
        sg.bigo.ads.api.a.m mVar3 = this.f68983g;
        boolean z10 = mVar3 == null || mVar3.a(str5) == 1;
        sg.bigo.ads.api.a.m mVar4 = this.f68983g;
        a(iA, z10, mVar4 == null || mVar4.a(str6) == 1);
        sg.bigo.ads.ad.interstitial.u.a(qVar).e().a(this.f67934n);
        return this.f67931k;
    }

    public abstract void a(double d10);

    public abstract void a(int i10, boolean z10, boolean z11);

    public void a(Runnable runnable) {
        sg.bigo.ads.ad.interstitial.c.a(this.f67931k, this.f67930j, runnable);
    }

    public void a(@NonNull sg.bigo.ads.ad.interstitial.q qVar, int i10) {
    }

    public abstract void d(sg.bigo.ads.ad.interstitial.q qVar);

    @Override // sg.bigo.ads.ad.interstitial.u
    public final int e() {
        sg.bigo.ads.api.a.m mVar = this.f68983g;
        return sg.bigo.ads.ad.interstitial.multi_img.e.a(mVar != null ? mVar.a("endpage.mediaview_colour") : 3);
    }

    @NonNull
    public final Pair<Integer, Boolean> e(@NonNull sg.bigo.ads.ad.interstitial.q qVar) {
        return Pair.create(Integer.valueOf(f(qVar)), Boolean.valueOf(j()));
    }

    public final int f(@NonNull sg.bigo.ads.ad.interstitial.q qVar) {
        int i10;
        sg.bigo.ads.api.a.m mVar = this.f68983g;
        if (mVar == null) {
            return -16736769;
        }
        int iA = mVar.a("endpage.cta_color");
        return (iA == 3 && d() && (i10 = sg.bigo.ads.ad.interstitial.u.a(qVar).f68942i) != 0) ? i10 : sg.bigo.ads.ad.interstitial.r.a(this.f68982f, iA, null);
    }

    public boolean g() {
        return false;
    }

    @LayoutRes
    public abstract int h();

    public void i() {
        String strI = ((sg.bigo.ads.core.a.a) this.f68982f.f()).i();
        TextView textView = (TextView) this.f67931k.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.f67931k.findViewById(R.id.inter_ad_label);
        if (textView != null && TextUtils.isEmpty(strI)) {
            textView.setVisibility(8);
        } else {
            if (textView == null || textView2 == null) {
                return;
            }
            textView.setText(strI);
            textView.setPadding(sg.bigo.ads.common.utils.e.a(this.f67931k.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView.getContext(), 1), sg.bigo.ads.common.utils.e.a(textView.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView.getContext(), 1));
            textView2.setText(R.string.bigo_ad_tag);
        }
    }

    public final boolean j() {
        sg.bigo.ads.api.a.m mVar = this.f68983g;
        return mVar != null && mVar.c("endpage.is_cta_show_animation");
    }

    public boolean k() {
        return false;
    }
}
