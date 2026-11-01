package com.inmobi.media;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ProgressBar;
import com.mbridge.msdk.MBridgeConstans;

/* JADX INFO: renamed from: com.inmobi.media.vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3266vn {
    public static final void a(ProgressBar progressBar, int i10) {
        ck.p.j(progressBar, "<this>");
        progressBar.setProgress(i10, true);
    }

    public static final boolean a(View view, ViewGroup viewGroup) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(viewGroup, "parentView");
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            if (ck.p.e(parent, viewGroup)) {
                return true;
            }
            parent = parent instanceof ViewGroup ? ((ViewGroup) parent).getParent() : null;
        }
        return false;
    }

    public static final boolean b(View view, ViewGroup viewGroup) {
        ck.p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ck.p.j(viewGroup, "parentView");
        if (view.isAttachedToWindow()) {
            return a(view, viewGroup);
        }
        return false;
    }

    public static final void a(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
}
