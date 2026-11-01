package sg.bigo.ads.ad.interstitial.d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends o {
    public p(@NonNull sg.bigo.ads.ad.b.b bVar) {
        super(bVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.o
    public final boolean L() {
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.d.o, sg.bigo.ads.ad.interstitial.d.m
    public final void a(sg.bigo.ads.ad.interstitial.q qVar) {
        super.a(qVar);
        ((m) this).f68188y.setVisibility(4);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f68123v.getLayoutParams();
        marginLayoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.f68123v.getContext(), 0);
        this.f68123v.setLayoutParams(marginLayoutParams);
    }

    @Override // sg.bigo.ads.ad.interstitial.d.o, sg.bigo.ads.ad.interstitial.d.m
    public final void b(int i10) {
        super.b(i10);
        if (B() == null) {
            return;
        }
        final View viewFindViewById = this.f68118q.findViewById(R.id.inter_btn_cta_layout);
        final Button button = (Button) this.f68118q.findViewById(R.id.inter_btn_cta);
        if (button == null) {
            return;
        }
        button.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.d.p.1
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.ad.c.a((sg.bigo.ads.ad.c) ((sg.bigo.ads.ad.interstitial.t) p.this).f68936c)) {
                    return;
                }
                a.C0679a c0679aU = p.this.u();
                sg.bigo.ads.common.w.b.a aVar = new sg.bigo.ads.common.w.b.a() { // from class: sg.bigo.ads.ad.interstitial.d.p.1.1
                    @Override // sg.bigo.ads.common.w.b.a
                    public final void b(int i11) {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        if (viewFindViewById == null || !p.this.v()) {
                            return;
                        }
                        sg.bigo.ads.ad.interstitial.c.e(viewFindViewById);
                    }
                };
                if (c0679aU.f68147b) {
                    p.this.a(button, aVar);
                } else {
                    sg.bigo.ads.ad.interstitial.d.a(button, c0679aU.f68146a, aVar);
                }
            }
        }, ((long) Math.max(1, i10)) * 1000);
    }
}
