package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ke {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Rect f2971 = new Rect();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static <E extends View> boolean m2885(View view, Class<E> cls, String str, List<Integer> list, List<String> list2) {
        if (!cls.isInstance(view)) {
            return false;
        }
        if ((m2896(list) || list.contains(Integer.valueOf(view.getId()))) && !m2897(list2, view)) {
            return str == null || view.getClass().getName().startsWith(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static <E extends View> E m2886(Activity activity, Class<E> cls, int i10, List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        m2887(activity, cls, i10, str, true, false, null, list, arrayList);
        if (arrayList.size() > 0) {
            return (E) arrayList.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static <E extends View> E m2891(View view, Class<E> cls, boolean z10) {
        ArrayList arrayList = new ArrayList();
        m2894(view, cls, true, z10, null, null, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (E) arrayList.get(0);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static View m2892(Activity activity) {
        return activity.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static <E extends View> void m2894(View view, Class<E> cls, boolean z10, boolean z11, List<Integer> list, List<String> list2, List<E> list3) {
        m2893(view, cls, null, z10, z11, list, list2, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static <E extends View> void m2893(View view, Class<E> cls, String str, boolean z10, boolean z11, List<Integer> list, List<String> list2, List<E> list3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (m2885(childAt, cls, str, list, list2)) {
                    list3.add(childAt);
                    if (z10) {
                        return;
                    }
                    if (z11) {
                        m2893(childAt, cls, str, z10, z11, list, list2, list3);
                    }
                } else {
                    m2893(childAt, cls, str, z10, z11, list, list2, list3);
                    if (list3 != 0 && list3.size() > 0 && z10) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static View m2884(View view) {
        while (view.getParent() instanceof View) {
            view = (View) view.getParent();
        }
        return view;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static <E extends View> void m2888(Activity activity, Class<E> cls, boolean z10, List<Integer> list, List<String> list2, List<E> list3) {
        m2887(activity, cls, -1, null, false, z10, list, list2, list3);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Activity m2890(View view) {
        if (view != null) {
            View view2 = view;
            while (view2.getId() != 16908290 && (view2.getParent() instanceof View)) {
                view2 = (View) view2.getParent();
            }
            for (Context context = view2.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            View viewFindViewById = view.findViewById(R.id.content);
            if (viewFindViewById != null && (viewFindViewById.getContext() instanceof Activity)) {
                return (Activity) viewFindViewById.getContext();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static <E extends View> void m2887(Activity activity, Class<E> cls, int i10, String str, boolean z10, boolean z11, List<Integer> list, List<String> list2, List<E> list3) {
        if (i10 != -1) {
            View viewFindViewById = activity.findViewById(i10);
            if (cls.isInstance(viewFindViewById)) {
                list3.add(viewFindViewById);
                if (z10) {
                    return;
                }
            }
            m2893(viewFindViewById, cls, str, z10, z11, list, list2, list3);
            if (list3.size() > 0 && z10) {
                return;
            }
        }
        View viewFindViewById2 = activity.findViewById(R.id.content);
        if (viewFindViewById2 != null) {
            m2889(viewFindViewById2, cls, str, z10, z11, list, list2, list3);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m2896(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static <E extends View> void m2889(View view, Class<E> cls, String str, boolean z10, boolean z11, List<Integer> list, List<String> list2, List<E> list3) {
        View view2 = view;
        while (view2.getParent() != null && (view2.getParent() instanceof ViewGroup)) {
            view2 = (View) view2.getParent();
        }
        m2893(view2, cls, str, z10, z11, list, list2, list3);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m2897(List<String> list, View view) {
        return list != null && list.contains(view.getClass().getName());
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m2895(View view) {
        view.getHitRect(f2971);
        return view.getGlobalVisibleRect(f2971);
    }
}
