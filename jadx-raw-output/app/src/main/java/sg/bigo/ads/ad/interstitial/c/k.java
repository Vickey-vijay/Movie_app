package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes5.dex */
public class k extends a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f68031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public RoundedImageView f68032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f68033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f68034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public RoundedImageView f68035s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RoundedImageView f68036t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Button f68037u;

    public k(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, cVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void a(double d10) {
        if (d10 <= 3.0d) {
            TextView textView = this.f67932l;
            if (textView != null) {
                textView.setTextColor(sg.bigo.ads.common.w.b.a(sg.bigo.ads.ad.interstitial.d.f68105b, 0.6f));
                return;
            }
            return;
        }
        TextView textView2 = this.f67932l;
        if (textView2 != null) {
            textView2.setTextColor(sg.bigo.ads.common.w.b.a(sg.bigo.ads.ad.interstitial.d.f68104a, 0.6f));
        }
    }

    public void a(int i10) {
        Button button = (Button) this.f67931k.findViewById(R.id.inter_btn_cta);
        this.f68037u = button;
        if (button != null) {
            float fA = sg.bigo.ads.common.utils.e.a(this.f67931k.getContext(), 8);
            this.f68037u.setBackground(sg.bigo.ads.common.utils.d.a(fA, fA, fA, fA, (Rect) null, i10));
            sg.bigo.ads.ad.interstitial.d.a(this.f68037u, sg.bigo.ads.common.w.b.a(i10));
            l().a(this.f68037u);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public void a(int i10, boolean z10, boolean z11) {
        sg.bigo.ads.ad.b.a.a(this.f68035s, 5);
        sg.bigo.ads.ad.b.a.a(this.f68036t, 5);
        if (z10) {
            sg.bigo.ads.ad.b.a.a(this.f67930j, this.f68035s, 4, this.f68982f, i10);
            sg.bigo.ads.ad.b.a.a(this.f67930j, this.f68036t, 4, this.f68982f, i10);
        } else {
            ViewGroup viewGroup = this.f67930j;
            RoundedImageView roundedImageView = this.f68035s;
            sg.bigo.ads.core.adview.h hVar = sg.bigo.ads.ad.interstitial.q.F;
            sg.bigo.ads.ad.b.a.a(viewGroup, roundedImageView, 4, hVar, 0);
            sg.bigo.ads.ad.b.a.a(this.f67930j, this.f68036t, 4, hVar, 0);
        }
        sg.bigo.ads.ad.b.a.a(this.f67931k, 9);
        if (z11) {
            sg.bigo.ads.ad.b.a.a(this.f67930j, this.f67931k, 4, this.f68982f, i10);
        } else {
            sg.bigo.ads.ad.b.a.a(this.f67930j, this.f67931k, 4, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void a(final Runnable runnable) {
        super.a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.k.2
            @Override // java.lang.Runnable
            public final void run() {
                k.this.m();
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
    }

    public void a(sg.bigo.ads.ad.interstitial.q qVar, @NonNull Rect rect) {
        sg.bigo.ads.common.p pVarB = b(qVar);
        int iA = sg.bigo.ads.common.utils.e.a(this.f68034r.getContext(), 16);
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i10 = iA * 2;
        int i11 = iWidth - i10;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f68034r.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f68035s.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f68036t.getLayoutParams();
        sg.bigo.ads.common.p pVarA = sg.bigo.ads.common.p.a(pVarB.f69806b, pVarB.f69807c, iWidth, iHeight - i10);
        sg.bigo.ads.common.p pVarA2 = sg.bigo.ads.common.p.a(pVarB.f69806b, pVarB.f69807c, i11, iHeight);
        if (pVarA.a(pVarA2)) {
            layoutParams.width = pVarA.f69806b;
            layoutParams.height = pVarA.f69807c + i10;
            marginLayoutParams.topMargin = iA;
            marginLayoutParams.bottomMargin = iA;
            marginLayoutParams2.leftMargin = iA;
            marginLayoutParams2.rightMargin = iA;
        } else {
            layoutParams.width = pVarA2.f69806b + i10;
            layoutParams.height = pVarA2.f69807c;
            marginLayoutParams.leftMargin = iA;
            marginLayoutParams.rightMargin = iA;
            marginLayoutParams2.topMargin = iA;
            marginLayoutParams2.bottomMargin = iA;
        }
        this.f68034r.requestLayout();
        this.f68035s.requestLayout();
        this.f68036t.requestLayout();
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public void d(final sg.bigo.ads.ad.interstitial.q qVar) {
        ViewGroup viewGroup = this.f67931k;
        if (viewGroup == null) {
            return;
        }
        this.f68031o = viewGroup.findViewById(R.id.inter_end_page);
        this.f68032p = (RoundedImageView) this.f67931k.findViewById(R.id.inter_icon);
        this.f68033q = (TextView) this.f67931k.findViewById(R.id.inter_title);
        l().a(this.f68032p);
        l().a(this.f68033q, null);
        this.f68034r = this.f67931k.findViewById(R.id.inter_end_page_image_layout);
        this.f68035s = (RoundedImageView) this.f67931k.findViewById(R.id.inter_end_page_image);
        this.f68036t = (RoundedImageView) this.f67931k.findViewById(R.id.inter_end_page_image_background);
        float fA = sg.bigo.ads.common.utils.e.a(this.f68035s.getContext(), 8);
        this.f68035s.setCornerRadius(fA);
        this.f68036t.setCornerRadius(fA);
        this.f68036t.setBackgroundColor(654311423);
        sg.bigo.ads.common.utils.u.a(this.f68034r, new sg.bigo.ads.common.utils.u.a() { // from class: sg.bigo.ads.ad.interstitial.c.k.1
            @Override // sg.bigo.ads.common.utils.u.a
            public final void a(@NonNull Rect rect) {
                k.this.a(qVar, rect);
            }
        });
        a(f(qVar));
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean d() {
        sg.bigo.ads.core.a.a aVar;
        sg.bigo.ads.ad.b.b bVar = this.f68982f;
        if (bVar == null || (aVar = (sg.bigo.ads.core.a.a) bVar.f()) == null) {
            return true;
        }
        return aVar.aR();
    }

    @Override // sg.bigo.ads.ad.interstitial.u
    public final boolean f() {
        return true;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_18;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.a
    public final void i() {
        String strI = ((sg.bigo.ads.core.a.a) this.f68982f.f()).i();
        TextView textView = (TextView) this.f67931k.findViewById(R.id.inter_advertiser);
        if (TextUtils.isEmpty(strI)) {
            textView.setVisibility(8);
        } else {
            textView.setText(strI);
        }
    }

    @NonNull
    public sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.f67867d;
    }

    public final void m() {
        if (this.f68037u == null || !j()) {
            return;
        }
        sg.bigo.ads.ad.interstitial.c.e(this.f68037u);
    }
}
