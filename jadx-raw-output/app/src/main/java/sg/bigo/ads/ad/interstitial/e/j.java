package sg.bigo.ads.ad.interstitial.e;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f68405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final b f68406j;

    public j(@NonNull sg.bigo.ads.ad.interstitial.e.b.a aVar, @NonNull List<NativeAd> list, @NonNull sg.bigo.ads.ad.interstitial.e.a.b bVar) {
        super(aVar, list, bVar);
        this.f68405i = sg.bigo.ads.common.utils.e.a(this.f68399d, 72);
        this.f68406j = new b(sg.bigo.ads.common.utils.e.a(this.f68399d, 8), this.f68403h, this.f68402g);
    }

    private List<View> a(@NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5, @Nullable View view6) {
        c();
        this.f68396a.setOrientation(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        arrayList.add(view2);
        arrayList.add(view3);
        arrayList.add(view4);
        arrayList.add(view5);
        a(0, 0, 0, 16);
        LinearLayout linearLayout = new LinearLayout(this.f68399d);
        linearLayout.setOrientation(0);
        this.f68396a.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view, new LinearLayout.LayoutParams(this.f68405i, -2));
        linearLayout.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view2, new LinearLayout.LayoutParams(this.f68405i, -2));
        linearLayout.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout.addView(view3, new LinearLayout.LayoutParams(this.f68405i, -2));
        linearLayout.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        LinearLayout linearLayout2 = new LinearLayout(this.f68399d);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = sg.bigo.ads.common.utils.e.a(this.f68399d, 12);
        this.f68396a.addView(linearLayout2, layoutParams);
        linearLayout2.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(view4, new LinearLayout.LayoutParams(this.f68405i, -2));
        linearLayout2.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        linearLayout2.addView(view5, new LinearLayout.LayoutParams(this.f68405i, -2));
        linearLayout2.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        if (view6 != null) {
            arrayList.add(view6);
            linearLayout2.addView(view6, new LinearLayout.LayoutParams(this.f68405i, -2));
        } else {
            linearLayout2.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(this.f68405i, -2));
        }
        linearLayout2.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        return arrayList;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // sg.bigo.ads.ad.interstitial.e.d
    @Nullable
    public final List<View> a(@NonNull a aVar) {
        ArrayList arrayList;
        LinearLayout linearLayout;
        View space;
        ViewGroup.LayoutParams layoutParams;
        View viewA;
        View viewA2;
        View viewA3;
        View viewA4;
        View viewA5;
        View viewA6;
        int size = this.f68397b.size();
        if (size == 0) {
            return new ArrayList();
        }
        if (size == 1) {
            this.f68401f = true;
            View viewA7 = sg.bigo.ads.common.utils.a.a(this.f68399d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.f68396a, false);
            a(this.f68406j);
            this.f68396a.setOrientation(0);
            arrayList = new ArrayList();
            arrayList.add(viewA7);
            a(20, 16, 20, 16);
            this.f68396a.addView(viewA7, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(this.f68399d, 60)));
        } else if (size != 2) {
            if (size == 3) {
                Context context = this.f68399d;
                int i10 = R.layout.bigo_ad_layout_interstitial_icon_item_style;
                View viewA8 = sg.bigo.ads.common.utils.a.a(context, i10, this.f68396a, false);
                View viewA9 = sg.bigo.ads.common.utils.a.a(this.f68399d, i10, this.f68396a, false);
                View viewA10 = sg.bigo.ads.common.utils.a.a(this.f68399d, i10, this.f68396a, false);
                c();
                this.f68396a.setOrientation(0);
                arrayList = new ArrayList();
                arrayList.add(viewA8);
                arrayList.add(viewA9);
                arrayList.add(viewA10);
                a(0, 0, 0, 16);
                this.f68396a.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                this.f68396a.addView(viewA8, new LinearLayout.LayoutParams(this.f68405i, -2));
                this.f68396a.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                this.f68396a.addView(viewA9, new LinearLayout.LayoutParams(this.f68405i, -2));
                this.f68396a.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                this.f68396a.addView(viewA10, new LinearLayout.LayoutParams(this.f68405i, -2));
                linearLayout = this.f68396a;
                space = new Space(this.f68399d);
                layoutParams = new LinearLayout.LayoutParams(0, 60, 1.0f);
            } else {
                if (size != 4) {
                    if (size != 5) {
                        Context context2 = this.f68399d;
                        int i11 = R.layout.bigo_ad_layout_interstitial_icon_item_style;
                        viewA = sg.bigo.ads.common.utils.a.a(context2, i11, this.f68396a, false);
                        viewA2 = sg.bigo.ads.common.utils.a.a(this.f68399d, i11, this.f68396a, false);
                        viewA3 = sg.bigo.ads.common.utils.a.a(this.f68399d, i11, this.f68396a, false);
                        viewA4 = sg.bigo.ads.common.utils.a.a(this.f68399d, i11, this.f68396a, false);
                        viewA5 = sg.bigo.ads.common.utils.a.a(this.f68399d, i11, this.f68396a, false);
                        viewA6 = sg.bigo.ads.common.utils.a.a(this.f68399d, i11, this.f68396a, false);
                    } else {
                        Context context3 = this.f68399d;
                        int i12 = R.layout.bigo_ad_layout_interstitial_icon_item_style;
                        viewA = sg.bigo.ads.common.utils.a.a(context3, i12, this.f68396a, false);
                        viewA2 = sg.bigo.ads.common.utils.a.a(this.f68399d, i12, this.f68396a, false);
                        viewA3 = sg.bigo.ads.common.utils.a.a(this.f68399d, i12, this.f68396a, false);
                        viewA4 = sg.bigo.ads.common.utils.a.a(this.f68399d, i12, this.f68396a, false);
                        viewA5 = sg.bigo.ads.common.utils.a.a(this.f68399d, i12, this.f68396a, false);
                        viewA6 = null;
                    }
                    return a(viewA, viewA2, viewA3, viewA4, viewA5, viewA6);
                }
                Context context4 = this.f68399d;
                int i13 = R.layout.bigo_ad_layout_interstitial_icon_item_style;
                View viewA11 = sg.bigo.ads.common.utils.a.a(context4, i13, this.f68396a, false);
                View viewA12 = sg.bigo.ads.common.utils.a.a(this.f68399d, i13, this.f68396a, false);
                View viewA13 = sg.bigo.ads.common.utils.a.a(this.f68399d, i13, this.f68396a, false);
                View viewA14 = sg.bigo.ads.common.utils.a.a(this.f68399d, i13, this.f68396a, false);
                c();
                this.f68396a.setOrientation(1);
                this.f68396a.setGravity(1);
                arrayList = new ArrayList();
                arrayList.add(viewA11);
                arrayList.add(viewA12);
                arrayList.add(viewA13);
                arrayList.add(viewA14);
                arrayList.add(viewA14);
                a(0, 0, 0, 16);
                LinearLayout linearLayout2 = new LinearLayout(this.f68399d);
                linearLayout2.setOrientation(0);
                this.f68396a.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
                linearLayout2.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                linearLayout2.addView(viewA11, new LinearLayout.LayoutParams(this.f68405i, -2));
                linearLayout2.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                linearLayout2.addView(viewA12, new LinearLayout.LayoutParams(this.f68405i, -2));
                linearLayout2.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                linearLayout = new LinearLayout(this.f68399d);
                linearLayout.setOrientation(0);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.topMargin = sg.bigo.ads.common.utils.e.a(this.f68399d, 12);
                this.f68396a.addView(linearLayout, layoutParams2);
                linearLayout.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                linearLayout.addView(viewA13, new LinearLayout.LayoutParams(this.f68405i, -1));
                linearLayout.addView(new Space(this.f68399d), new LinearLayout.LayoutParams(0, 60, 1.0f));
                linearLayout.addView(viewA14, new LinearLayout.LayoutParams(this.f68405i, -2));
                space = new Space(this.f68399d);
                layoutParams = new LinearLayout.LayoutParams(0, 60, 1.0f);
            }
            linearLayout.addView(space, layoutParams);
        } else {
            this.f68401f = true;
            Context context5 = this.f68399d;
            int i14 = R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1;
            View viewA15 = sg.bigo.ads.common.utils.a.a(context5, i14, this.f68396a, false);
            View viewA16 = sg.bigo.ads.common.utils.a.a(this.f68399d, i14, this.f68396a, false);
            a(this.f68406j);
            this.f68396a.setOrientation(1);
            arrayList = new ArrayList();
            arrayList.add(viewA15);
            arrayList.add(viewA16);
            a(20, 16, 20, 16);
            int iA = sg.bigo.ads.common.utils.e.a(this.f68399d, 60);
            this.f68396a.addView(viewA15, new LinearLayout.LayoutParams(-1, iA));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, iA);
            layoutParams3.topMargin = sg.bigo.ads.common.utils.e.a(this.f68399d, 20);
            this.f68396a.addView(viewA16, layoutParams3);
        }
        return arrayList;
    }

    @Override // sg.bigo.ads.ad.interstitial.e.d
    public final b a() {
        float fA = sg.bigo.ads.common.utils.e.a(this.f68399d, 8);
        return new b(fA, fA, fA, fA, new Rect(0, sg.bigo.ads.common.utils.e.a(this.f68399d, 12), 0, 0), this.f68403h, null, this.f68402g);
    }
}
