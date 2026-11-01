package com.ironsource;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final class rg {
    public static final boolean a(View view, Rect rect) {
        ck.p.j(view, "<this>");
        ck.p.j(rect, "rect");
        return view.isShown() && view.hasWindowFocus() && view.getGlobalVisibleRect(rect);
    }
}
