package sg.bigo.ads.ad.interstitial.e;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends d {
    public i(@NonNull sg.bigo.ads.ad.interstitial.e.b.a aVar, @NonNull List<NativeAd> list, @NonNull sg.bigo.ads.ad.interstitial.e.a.b bVar) {
        super(aVar, list, bVar);
        this.f68401f = true;
    }

    @Override // sg.bigo.ads.ad.interstitial.e.d
    @Nullable
    public final List<View> a(@NonNull a aVar) {
        View viewA;
        ArrayList arrayList;
        LinearLayout linearLayout;
        LinearLayout.LayoutParams layoutParams;
        int size = this.f68397b.size();
        if (size == 0) {
            return new ArrayList();
        }
        if (size == 1) {
            View viewA2 = sg.bigo.ads.common.utils.a.a(this.f68399d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2, this.f68396a, false);
            c();
            this.f68396a.setOrientation(0);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(viewA2);
            a(12, 0, 12, 12);
            this.f68396a.addView(viewA2, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(this.f68399d, 60)));
            return arrayList2;
        }
        if (size != 2) {
            Context context = this.f68399d;
            int i10 = R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2;
            View viewA3 = sg.bigo.ads.common.utils.a.a(context, i10, this.f68396a, false);
            View viewA4 = sg.bigo.ads.common.utils.a.a(this.f68399d, i10, this.f68396a, false);
            viewA = sg.bigo.ads.common.utils.a.a(this.f68399d, i10, this.f68396a, false);
            this.f68396a.setOrientation(1);
            arrayList = new ArrayList();
            int iA = sg.bigo.ads.common.utils.e.a(this.f68399d, 60);
            LinearLayout linearLayout2 = new LinearLayout(this.f68399d);
            linearLayout2.setOrientation(0);
            a(linearLayout2);
            b(linearLayout2);
            this.f68396a.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
            linearLayout2.addView(viewA3, new LinearLayout.LayoutParams(-1, iA));
            arrayList.add(linearLayout2);
            LinearLayout linearLayout3 = new LinearLayout(this.f68399d);
            linearLayout3.setOrientation(0);
            a(linearLayout3);
            b(linearLayout3);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = sg.bigo.ads.common.utils.e.a(this.f68399d, 8);
            layoutParams2.bottomMargin = sg.bigo.ads.common.utils.e.a(this.f68399d, 8);
            this.f68396a.addView(linearLayout3, layoutParams2);
            linearLayout3.addView(viewA4, new LinearLayout.LayoutParams(-1, iA));
            arrayList.add(linearLayout3);
            linearLayout = new LinearLayout(this.f68399d);
            linearLayout.setOrientation(0);
            a(linearLayout);
            b(linearLayout);
            this.f68396a.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
            layoutParams = new LinearLayout.LayoutParams(-1, iA);
        } else {
            Context context2 = this.f68399d;
            int i11 = R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style2;
            View viewA5 = sg.bigo.ads.common.utils.a.a(context2, i11, this.f68396a, false);
            viewA = sg.bigo.ads.common.utils.a.a(this.f68399d, i11, this.f68396a, false);
            this.f68396a.setOrientation(1);
            arrayList = new ArrayList();
            int iA2 = sg.bigo.ads.common.utils.e.a(this.f68399d, 60);
            LinearLayout linearLayout4 = new LinearLayout(this.f68399d);
            linearLayout4.setOrientation(0);
            a(linearLayout4);
            b(linearLayout4);
            this.f68396a.addView(linearLayout4, new LinearLayout.LayoutParams(-1, -2));
            linearLayout4.addView(viewA5, new LinearLayout.LayoutParams(-1, iA2));
            arrayList.add(linearLayout4);
            linearLayout = new LinearLayout(this.f68399d);
            linearLayout.setOrientation(0);
            a(linearLayout);
            b(linearLayout);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.topMargin = sg.bigo.ads.common.utils.e.a(this.f68399d, 8);
            this.f68396a.addView(linearLayout, layoutParams3);
            layoutParams = new LinearLayout.LayoutParams(-1, iA2);
        }
        linearLayout.addView(viewA, layoutParams);
        arrayList.add(linearLayout);
        return arrayList;
    }

    @Override // sg.bigo.ads.ad.interstitial.e.d
    public final b a() {
        float fA = sg.bigo.ads.common.utils.e.a(this.f68399d, 8);
        return new b(fA, fA, fA, fA, new Rect(0, sg.bigo.ads.common.utils.e.a(this.f68399d, 10), 0, 0), this.f68403h, null, this.f68402g);
    }
}
