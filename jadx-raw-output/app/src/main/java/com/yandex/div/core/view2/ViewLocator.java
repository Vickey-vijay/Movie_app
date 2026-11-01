package com.yandex.div.core.view2;

import android.view.View;
import android.view.ViewGroup;
import ck.p;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import java.util.ArrayList;
import java.util.List;
import nj.b0;
import nj.s;

/* JADX INFO: compiled from: ViewLocator.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewLocator {
    public static final ViewLocator INSTANCE = new ViewLocator();

    private ViewLocator() {
    }

    public static final List<View> findViewsWithTag(Div2View div2View, String str) {
        return INSTANCE.findViewsWithTag((View) div2View.getView(), (Object) str);
    }

    private final List<View> findViewsWithTag(View view, Object obj) {
        if (obj == null) {
            return s.k();
        }
        ArrayList arrayList = new ArrayList();
        findViewsWithTagTraversal(view, obj, arrayList);
        return arrayList;
    }

    public static final View findSingleViewWithTag(Div2View div2View, String str) {
        List<View> listFindViewsWithTag = findViewsWithTag(div2View, str);
        if (listFindViewsWithTag.isEmpty()) {
            return null;
        }
        if (listFindViewsWithTag.size() > 1) {
            DivActionTypedUtilsKt.logError(div2View, new RuntimeException("Ambiguous scope id. There are " + listFindViewsWithTag.size() + " divs with id '" + str + '\''));
            return null;
        }
        return (View) b0.f0(listFindViewsWithTag);
    }

    private final List<View> findViewsWithTagTraversal(View view, Object obj, List<View> list) {
        if (p.e(obj, view.getTag())) {
            list.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                findViewsWithTagTraversal(viewGroup.getChildAt(i10), obj, list);
            }
        }
        return list;
    }
}
