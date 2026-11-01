package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Wc {
    public static final List a(Sg sg2) {
        ck.p.j(sg2, "<this>");
        return nj.s.n(mj.h.a(sg2.f23524b, (short) 0), mj.h.a(sg2.f23523a.getTitleView$media_release(), (short) 3), mj.h.a(sg2.f23523a.getDescriptionView$media_release(), (short) 4), mj.h.a(sg2.f23523a.getIconView$media_release(), (short) 5), mj.h.a(sg2.f23523a.getCtaView$media_release(), (short) 6), mj.h.a(sg2.f23525c, (short) 7), mj.h.a(sg2.f23523a.getRatingView$media_release(), (short) 8), mj.h.a(sg2.f23523a.getAdvertiserView$media_release(), (short) 9));
    }

    public static final void a(Sg sg2, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(sg2, "<this>");
        ck.p.j("NativeRenderedState", "tag");
        if (interfaceC3028m9 == null) {
            return;
        }
        List<Pair> listA = a(sg2);
        ViewGroup parentView$media_release = sg2.f23523a.getParentView$media_release();
        JSONArray jSONArray = new JSONArray();
        for (Pair pair : listA) {
            View view = (View) pair.component1();
            short sShortValue = ((Number) pair.component2()).shortValue();
            if (view != null) {
                boolean z10 = view.getVisibility() == 0;
                jSONArray.put(((int) sShortValue) + " - " + z10 + com.ironsource.Z7.f27998r + AbstractC3266vn.a(view, parentView$media_release));
            }
        }
        String string = jSONArray.toString();
        ck.p.i(string, "toString(...)");
        ((C3053n9) interfaceC3028m9).a("NativeRenderedState", string);
    }
}
