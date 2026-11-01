package com.ironsource;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Pf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pf f27382a = new Pf();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f27383b = ",";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f27384c = "[";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f27385d = "]";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f27386e = 118;

    public final List<Object> a(Object... objArr) {
        ck.p.j(objArr, "items");
        return nj.s.n(Arrays.copyOf(objArr, objArr.length));
    }

    private final String a(List<?> list) {
        Iterator<?> it = list.iterator();
        String str = "[";
        while (it.hasNext()) {
            str = ((Object) str) + f27382a.a(it.next()) + ",";
        }
        return ((Object) lk.a0.F0(str, ",")) + "]";
    }

    public final String b(List<? extends Object> list) {
        ck.p.j(list, "methodArgs");
        String str = new String();
        for (Object obj : list) {
            str = ((Object) (((Object) str) + (obj instanceof List ? f27382a.a((List<?>) obj) : f27382a.a(obj)))) + ",";
        }
        return lk.a0.F0(str, ",");
    }

    private Pf() {
    }

    private final String a(Object obj) {
        if (obj instanceof String) {
            return "'" + obj + "'";
        }
        return String.valueOf(obj);
    }

    public final AdInfo a(LevelPlayAdInfo levelPlayAdInfo) {
        ck.p.j(levelPlayAdInfo, "<this>");
        return new AdInfo(new Z8(levelPlayAdInfo), null);
    }

    public final IronSourceError a(LevelPlayAdError levelPlayAdError) {
        ck.p.j(levelPlayAdError, "<this>");
        return new IronSourceError(levelPlayAdError.getErrorCode(), levelPlayAdError.getErrorMessage());
    }

    public final ViewGroup.LayoutParams a(Context context) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        layoutParams.bottomMargin = a(context, 118);
        return layoutParams;
    }

    private final int a(Context context, int i10) {
        Resources resources;
        DisplayMetrics displayMetrics;
        return (int) (i10 * ((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density));
    }
}
