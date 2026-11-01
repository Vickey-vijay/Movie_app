package sg.bigo.ads.ad.interstitial.e;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes10.dex */
public class e extends d {
    public e(@NonNull sg.bigo.ads.ad.interstitial.e.b.a aVar, @NonNull List<NativeAd> list, @NonNull sg.bigo.ads.ad.interstitial.e.a.b bVar) {
        super(aVar, list, bVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.e.d
    @Nullable
    public List<View> a(@NonNull a aVar) {
        ArrayList arrayList;
        sg.bigo.ads.ad.interstitial.e.b.a aVar2;
        Space space;
        LinearLayout.LayoutParams layoutParams;
        c();
        this.f68396a.setOrientation(0);
        int size = this.f68397b.size();
        if (size == 0) {
            return new ArrayList();
        }
        if (size == 1) {
            this.f68401f = true;
            View viewA = sg.bigo.ads.common.utils.a.a(this.f68399d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.f68396a, false);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(viewA);
            a(16, 10, 16, 14);
            this.f68396a.addView(viewA, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(this.f68399d, 60)));
            return arrayList2;
        }
        if (size == 2) {
            Context context = this.f68399d;
            int i10 = R.layout.bigo_ad_layout_interstitial_icon_item_cta_style1;
            View viewA2 = sg.bigo.ads.common.utils.a.a(context, i10, this.f68396a, false);
            View viewA3 = sg.bigo.ads.common.utils.a.a(this.f68399d, i10, this.f68396a, false);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(viewA2);
            arrayList3.add(viewA3);
            a(16, 12, 16, 12);
            int iA = sg.bigo.ads.common.utils.e.a(this.f68399d, 60);
            this.f68396a.addView(viewA2, new LinearLayout.LayoutParams(0, iA, 1.0f));
            this.f68396a.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(this.f68399d, 15), iA));
            this.f68396a.addView(viewA3, new LinearLayout.LayoutParams(0, iA, 1.0f));
            return arrayList3;
        }
        if (size != 3) {
            Context context2 = this.f68399d;
            int i11 = R.layout.bigo_ad_layout_interstitial_icon_item_style;
            View viewA4 = sg.bigo.ads.common.utils.a.a(context2, i11, this.f68396a, false);
            View viewA5 = sg.bigo.ads.common.utils.a.a(this.f68399d, i11, this.f68396a, false);
            View viewA6 = sg.bigo.ads.common.utils.a.a(this.f68399d, i11, this.f68396a, false);
            View viewA7 = sg.bigo.ads.common.utils.a.a(this.f68399d, i11, this.f68396a, false);
            arrayList = new ArrayList();
            arrayList.add(viewA4);
            arrayList.add(viewA5);
            arrayList.add(viewA6);
            arrayList.add(viewA7);
            a(0, 12, 0, 8);
            int iA2 = sg.bigo.ads.common.utils.e.a(this.f68399d, 72);
            this.f68396a.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.f68396a.addView(viewA4, new LinearLayout.LayoutParams(iA2, -2));
            this.f68396a.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.f68396a.addView(viewA5, new LinearLayout.LayoutParams(iA2, -2));
            this.f68396a.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.f68396a.addView(viewA6, new LinearLayout.LayoutParams(iA2, -2));
            this.f68396a.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.f68396a.addView(viewA7, new LinearLayout.LayoutParams(iA2, -2));
            aVar2 = this.f68396a;
            space = new Space(this.f68399d);
            layoutParams = new LinearLayout.LayoutParams(0, 60, 1.0f);
        } else {
            Context context3 = this.f68399d;
            int i12 = R.layout.bigo_ad_layout_interstitial_icon_item_style;
            View viewA8 = sg.bigo.ads.common.utils.a.a(context3, i12, this.f68396a, false);
            View viewA9 = sg.bigo.ads.common.utils.a.a(this.f68399d, i12, this.f68396a, false);
            View viewA10 = sg.bigo.ads.common.utils.a.a(this.f68399d, i12, this.f68396a, false);
            arrayList = new ArrayList();
            arrayList.add(viewA8);
            arrayList.add(viewA9);
            arrayList.add(viewA10);
            a(0, 12, 0, 8);
            int iA3 = sg.bigo.ads.common.utils.e.a(this.f68399d, 72);
            this.f68396a.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.f68396a.addView(viewA8, new LinearLayout.LayoutParams(iA3, -2));
            this.f68396a.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.f68396a.addView(viewA9, new LinearLayout.LayoutParams(iA3, -2));
            this.f68396a.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.f68396a.addView(viewA10, new LinearLayout.LayoutParams(iA3, -2));
            aVar2 = this.f68396a;
            space = new Space(this.f68399d);
            layoutParams = new LinearLayout.LayoutParams(0, 60, 1.0f);
        }
        aVar2.addView(space, layoutParams);
        return arrayList;
    }

    @Override // sg.bigo.ads.ad.interstitial.e.d
    public final b a() {
        return new b(sg.bigo.ads.common.utils.e.a(this.f68399d, 8), this.f68403h, this.f68402g);
    }
}
