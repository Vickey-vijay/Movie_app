package com.inmobi.media;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.n7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3051n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f24877a;

    public final boolean b(View view, View view2, int i10) {
        if (view2 != null && view2.getVisibility() == 0) {
            if ((view != null ? view.getParent() : null) != null && view2.isShown()) {
                GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = view2 instanceof GestureDetectorOnGestureListenerC2785ci ? (GestureDetectorOnGestureListenerC2785ci) view2 : null;
                if (gestureDetectorOnGestureListenerC2785ci == null) {
                    return false;
                }
                if (gestureDetectorOnGestureListenerC2785ci.getPlacementType() != 1 && (gestureDetectorOnGestureListenerC2785ci.getHeight() <= 0 || gestureDetectorOnGestureListenerC2785ci.getWidth() <= 0)) {
                    return false;
                }
                Rect rect = new Rect();
                if (!gestureDetectorOnGestureListenerC2785ci.getGlobalVisibleRect(rect)) {
                    return false;
                }
                this.f24877a = ((long) rect.height()) * ((long) rect.width());
                if (gestureDetectorOnGestureListenerC2785ci.getPlacementType() == 1) {
                    gestureDetectorOnGestureListenerC2785ci.setConfiguredArea(gestureDetectorOnGestureListenerC2785ci.getHeight() * gestureDetectorOnGestureListenerC2785ci.getWidth());
                }
                if (gestureDetectorOnGestureListenerC2785ci.getArea() > 0) {
                    if (((long) 100) * this.f24877a >= gestureDetectorOnGestureListenerC2785ci.getConfiguredArea() * ((long) i10)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x0112  */
    /* JADX WARN: Code duplicated, block: B:62:0x0114  */
    /* JADX WARN: Code duplicated, block: B:65:0x0119  */
    public final boolean a(View view, View view2, int i10) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        ck.p.j(view, "rootView");
        ck.p.j(view2, "adView");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        boolean z14 = viewGroup == null || a(viewGroup, view2, i10);
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int iIndexOfChild = viewGroup.indexOfChild(view) + 1; iIndexOfChild < childCount; iIndexOfChild++) {
                View childAt = viewGroup.getChildAt(iIndexOfChild);
                ck.p.i(childAt, "getChildAt(...)");
                if (childAt.getVisibility() == 0) {
                    if (view2 instanceof GestureDetectorOnGestureListenerC2785ci) {
                        if (!(childAt instanceof C2932ic)) {
                            if (!(childAt instanceof C2987ki)) {
                                GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) view2;
                                Map<View, FriendlyObstructionPurpose> friendlyViews = gestureDetectorOnGestureListenerC2785ci.getFriendlyViews();
                                if (!(friendlyViews != null ? friendlyViews.containsKey(childAt) : false)) {
                                    Rect rect = new Rect();
                                    view2.getGlobalVisibleRect(rect);
                                    Rect rect2 = new Rect();
                                    childAt.getGlobalVisibleRect(rect2);
                                    Rect rect3 = new Rect();
                                    boolean intersect = rect3.setIntersect(rect, rect2);
                                    ck.p.j(rect, "<this>");
                                    int i11 = (rect.bottom - rect.top) * (rect.right - rect.left);
                                    ck.p.j(rect3, "<this>");
                                    int i12 = i11 - ((rect3.bottom - rect3.top) * (rect3.right - rect3.left));
                                    float configuredArea = (i10 / 100) * gestureDetectorOnGestureListenerC2785ci.getConfiguredArea();
                                    if (intersect && i12 < configuredArea) {
                                        if (childAt.getAlpha() > 0.3f) {
                                            if (!(childAt instanceof ImageView) || ((ImageView) childAt).getDrawable() == null) {
                                                if (childAt.getBackground() instanceof ColorDrawable) {
                                                    Drawable background = childAt.getBackground();
                                                    ck.p.h(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                                    if (((ColorDrawable) background).getColor() == 0) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                } else if (childAt.getBackground() == null) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                if (childAt.getForeground() instanceof ColorDrawable) {
                                                    Drawable foreground = childAt.getForeground();
                                                    ck.p.h(foreground, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
                                                    if (((ColorDrawable) foreground).getColor() == 0) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                } else if (childAt.getForeground() == null) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                if (z12 && z13) {
                                                    z11 = true;
                                                }
                                            }
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        if (!z11) {
                                        }
                                    }
                                }
                            }
                            z10 = true;
                        }
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        return false;
                    }
                }
            }
        }
        return z14;
    }
}
