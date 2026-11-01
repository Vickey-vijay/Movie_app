package com.inmobi.media;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Un {
    public static final boolean a(View view, C3348z5 c3348z5) {
        ck.p.j(view, "adView");
        ck.p.j(c3348z5, "minDimension");
        if (view.getVisibility() == 0 && view.getParent() != null && view.isShown() && view.getWidth() >= c3348z5.f25827a && view.getHeight() >= c3348z5.f25828b) {
            if (view.getHeight() * view.getWidth() > 0) {
                return true;
            }
        }
        return false;
    }

    public static final boolean a(View view, Rect rect, int i10, C3348z5 c3348z5) {
        ck.p.j(view, "adView");
        ck.p.j(rect, "adViewRect");
        ck.p.j(c3348z5, "minDimension");
        if (a(view, c3348z5)) {
            return ((long) 100) * (((long) rect.height()) * ((long) rect.width())) >= ((long) (i10 * (view.getHeight() * view.getWidth())));
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x0109  */
    /* JADX WARN: Code duplicated, block: B:47:0x010b  */
    public static final boolean a(View view, Rect rect, int i10, List list) {
        boolean z10;
        boolean z11;
        ck.p.j(view, "adView");
        ck.p.j(rect, "adViewRect");
        ck.p.j(list, "friendlyViews");
        float height = (i10 / 100.0f) * view.getHeight() * view.getWidth();
        View view2 = view;
        while (view2.getParent() instanceof ViewGroup) {
            ViewParent parent = view2.getParent();
            ck.p.h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            Iterable iterableQ = ik.k.q(viewGroup.indexOfChild(view2) + 1, viewGroup.getChildCount());
            if (!(iterableQ instanceof Collection) || !((Collection) iterableQ).isEmpty()) {
                Iterator it = iterableQ.iterator();
                while (it.hasNext()) {
                    View childAt = viewGroup.getChildAt(((nj.g0) it).nextInt());
                    if (childAt.getVisibility() == 0) {
                        ck.p.g(childAt);
                        if (list.contains(childAt)) {
                            continue;
                        } else {
                            Rect rect2 = new Rect();
                            childAt.getGlobalVisibleRect(rect2);
                            Rect rect3 = new Rect();
                            boolean intersect = rect3.setIntersect(rect, rect2);
                            ck.p.j(rect, "<this>");
                            int i11 = (rect.bottom - rect.top) * (rect.right - rect.left);
                            ck.p.j(rect3, "<this>");
                            int i12 = i11 - ((rect3.bottom - rect3.top) * (rect3.right - rect3.left));
                            if (intersect && i12 < height) {
                                ck.p.j(childAt, "<this>");
                                if (childAt.getAlpha() > 0.3f) {
                                    if (!(childAt instanceof ImageView) || ((ImageView) childAt).getDrawable() == null) {
                                        if (childAt.getBackground() instanceof ColorDrawable) {
                                            Drawable background = childAt.getBackground();
                                            ck.p.h(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                            if (((ColorDrawable) background).getColor() == 0) {
                                                z10 = true;
                                            } else {
                                                z10 = false;
                                            }
                                        } else if (childAt.getBackground() == null) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (childAt.getForeground() instanceof ColorDrawable) {
                                            Drawable foreground = childAt.getForeground();
                                            ck.p.h(foreground, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                            if (((ColorDrawable) foreground).getColor() == 0) {
                                                z11 = true;
                                            } else {
                                                z11 = false;
                                            }
                                        } else if (childAt.getForeground() == null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (!z10 || !z11) {
                                        }
                                    }
                                    return false;
                                }
                                continue;
                            }
                        }
                    }
                }
            }
            view2 = viewGroup;
        }
        return true;
    }
}
