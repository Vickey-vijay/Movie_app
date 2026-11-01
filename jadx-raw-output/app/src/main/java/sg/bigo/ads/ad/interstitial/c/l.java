package sg.bigo.ads.ad.interstitial.c;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.multi_img.view.IconListView;
import sg.bigo.ads.common.view.RoundedImageView;

/* JADX INFO: loaded from: classes3.dex */
public class l extends k {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextView f68042v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TextView f68043w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private IconListView f68044x;

    public l(@NonNull sg.bigo.ads.ad.b.b bVar, int i10, @NonNull sg.bigo.ads.api.a.m mVar, @Nullable sg.bigo.ads.ad.interstitial.e.c cVar) {
        super(bVar, i10, mVar, cVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k
    public final void a(int i10) {
        super.a(i10);
        sg.bigo.ads.ad.interstitial.b.f67864a.a(this.f68037u);
        ViewGroup viewGroup = this.f67931k;
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.inter_company);
            this.f68042v = textView;
            if (textView != null) {
                textView.setTextColor(i10);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k, sg.bigo.ads.ad.interstitial.c.a
    public final void a(int i10, boolean z10, boolean z11) {
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
        ViewGroup viewGroup2 = this.f67930j;
        if (z11) {
            sg.bigo.ads.ad.b.a.a(viewGroup2, this.f67931k, 4, this.f68982f, i10);
        } else {
            sg.bigo.ads.ad.b.a.a(viewGroup2, this.f67931k, 4, sg.bigo.ads.ad.interstitial.q.F, 0);
        }
        sg.bigo.ads.api.a.m mVar = this.f68983g;
        boolean z12 = true;
        if (mVar != null && mVar.a("endpage.ad_component_clickable_switch") != 1) {
            z12 = false;
        }
        View view = this.f68031o;
        if (view != null) {
            sg.bigo.ads.ad.b.a.a(view, 18);
            ViewGroup viewGroup3 = this.f67930j;
            if (z12) {
                sg.bigo.ads.ad.b.a.a(viewGroup3, this.f68031o, 8, this.f68982f, i10);
            } else {
                sg.bigo.ads.ad.b.a.a(viewGroup3, this.f68031o, 8, sg.bigo.ads.ad.interstitial.q.F, 0);
            }
        }
        IconListView iconListView = this.f68044x;
        if (iconListView != null) {
            List<IconListView.a> items = iconListView.getItems();
            for (int i11 = 0; items != null && i11 < items.size(); i11++) {
                IconListView.a aVar = items.get(i11);
                sg.bigo.ads.ad.b.a.a(aVar.f68701d, 26);
                sg.bigo.ads.ad.b.a.a(this.f67930j, aVar.f68701d, 8, this.f68982f, i10);
                sg.bigo.ads.ad.b.a.a(aVar.f68704g, 26);
                sg.bigo.ads.ad.b.a.a(this.f67930j, aVar.f68704g, 8, this.f68982f, i10);
            }
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k
    public final void a(sg.bigo.ads.ad.interstitial.q qVar, @NonNull Rect rect) {
        sg.bigo.ads.common.p pVarB = b(qVar);
        int iA = sg.bigo.ads.common.utils.e.a(this.f68034r.getContext(), 16);
        int iWidth = rect.width();
        int iHeight = rect.height();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f68034r.getLayoutParams();
        int i10 = sg.bigo.ads.common.p.b(pVarB.f69806b, pVarB.f69807c, iWidth).f69807c;
        if (i10 <= iHeight) {
            layoutParams.height = i10;
        } else {
            int i11 = iA * 2;
            layoutParams.height = sg.bigo.ads.common.p.a(pVarB.f69806b, pVarB.f69807c, iWidth - i11, iHeight - i11).f69807c + i11;
            ((ViewGroup.MarginLayoutParams) this.f68035s.getLayoutParams()).setMargins(iA, iA, iA, iA);
            this.f68035s.requestLayout();
        }
        this.f68034r.requestLayout();
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k, sg.bigo.ads.ad.interstitial.c.a
    public final void d(sg.bigo.ads.ad.interstitial.q qVar) {
        IconListView iconListView;
        int i10;
        super.d(qVar);
        ViewGroup viewGroup = this.f67931k;
        if (viewGroup == null) {
            return;
        }
        TextView textView = (TextView) viewGroup.findViewById(R.id.inter_description);
        this.f68043w = textView;
        sg.bigo.ads.ad.interstitial.b bVar = sg.bigo.ads.ad.interstitial.b.f67864a;
        bVar.a(null, textView);
        IconListView iconListView2 = (IconListView) this.f67931k.findViewById(R.id.inter_download_msg);
        this.f68044x = iconListView2;
        iconListView2.a(((a) this).f67929i);
        if (sg.bigo.ads.common.utils.k.a((Collection) this.f68044x.getItems())) {
            iconListView = this.f68044x;
            i10 = 8;
        } else {
            iconListView = this.f68044x;
            i10 = 0;
        }
        iconListView.setVisibility(i10);
        int iA = sg.bigo.ads.common.utils.e.a(this.f67931k.getContext(), 16);
        View view = this.f68031o;
        if (view != null) {
            float f10 = iA;
            view.setBackground(sg.bigo.ads.common.utils.d.a(f10, f10, f10, f10, (Rect) null, -1));
            bVar.b(this.f68031o);
        }
        a(qVar, this.f68036t);
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k, sg.bigo.ads.ad.interstitial.c.a
    public final int h() {
        return R.layout.bigo_ad_activity_interstitial_rich_video_end_19;
    }

    @Override // sg.bigo.ads.ad.interstitial.c.k
    @NonNull
    public final sg.bigo.ads.ad.interstitial.b l() {
        return sg.bigo.ads.ad.interstitial.b.f67864a;
    }
}
