package com.mbridge.msdk.foundation.tools;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: compiled from: ViewCoveredUtils.java */
/* JADX INFO: loaded from: classes10.dex */
public class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f35291a;

    private static int a(View view, ViewGroup viewGroup) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            if (viewGroup.getChildAt(i10) == view) {
                return i10;
            }
        }
        return -1;
    }

    private static boolean a(View view, View view2, float f10) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        Rect rect3 = new Rect();
        if (!rect3.setIntersect(rect, rect2)) {
            return false;
        }
        int iWidth = rect3.width() * rect3.height();
        int iWidth2 = rect.width() * rect.height();
        int measuredWidth = view.getMeasuredWidth() * view.getMeasuredHeight();
        if (f10 == 0.0f) {
            return iWidth2 < measuredWidth || iWidth >= measuredWidth;
        }
        float f11 = measuredWidth * f10;
        float f12 = iWidth;
        if (f12 >= f11) {
            return true;
        }
        int i10 = iWidth2 - iWidth;
        if (iWidth + i10 >= measuredWidth) {
            return f12 > f11;
        }
        return ((float) i10) <= f11;
    }

    private static boolean a(View view, ViewGroup viewGroup, float f10) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            q0.b("ViewUtils", "View Judge : Start Loop");
            View childAt = viewGroup.getChildAt(i10);
            if (childAt.getVisibility() == 0 && a(view, childAt, f10)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    q0.b("ViewUtils", "View Judge : View Covered by WebView.");
                    f35291a = true;
                }
                if (a(childAt)) {
                    q0.b("ViewUtils", "View Judge : View Covered and Cover ViewGroup is not transparent.");
                    f35291a = true;
                }
                if (f35291a) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    a(view, (ViewGroup) childAt, f10);
                }
            }
        }
        return f35291a;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:67:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0132 A[SYNTHETIC] */
    public static boolean a(View view, int i10) {
        if (view == null) {
            return true;
        }
        if (view.getVisibility() != 0) {
            q0.b("ViewUtils", "View Judge : View's not visible.");
            return true;
        }
        if (view.getAlpha() < 0.5f) {
            q0.b("ViewUtils", "View Judge : View's alpha must set up 50%.");
            return true;
        }
        if (view.getParent() == null) {
            q0.b("ViewUtils", "View Judge : view has no parent");
            return true;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup) && ((ViewGroup) view.getParent()).getVisibility() != 0) {
            q0.b("ViewUtils", "View Judge : View's container is not visible.");
            return true;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        float f10 = i10 == 1 ? 0.0f : 0.5f;
        boolean z10 = ((float) ((rect.bottom - rect.top) * (rect.right - rect.left))) > ((float) (view.getMeasuredHeight() * view.getMeasuredWidth())) * f10;
        boolean z11 = globalVisibleRect && z10;
        q0.b("ViewUtils", "View Judge : partVisible is " + globalVisibleRect + " halfPercentVisible is " + z10);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("View Judge : totalViewVisible is ");
        sb2.append(z11);
        q0.b("ViewUtils", sb2.toString());
        if (!z11) {
            return true;
        }
        View view2 = view;
        while (view2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int iA = a(view2, viewGroup);
            for (int i11 = iA + 1; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt.getVisibility() == 0) {
                    boolean zA = a(view, childAt, f10);
                    q0.b("ViewUtils", "View Judge : " + iA + "  intersects " + zA + " currentParent " + viewGroup + "currentView " + childAt);
                    if (!zA) {
                        continue;
                    } else if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (viewGroup2.getChildCount() > 0) {
                            q0.b("ViewUtils", "View Judge : Covered by ViewGroup.");
                            boolean zA2 = a(view, viewGroup2, f10);
                            f35291a = false;
                            if (zA2) {
                                return true;
                            }
                        } else if (a(childAt)) {
                            q0.b("ViewUtils", "View Judge : View Covered and Cover View is not transparent.");
                            return true;
                        }
                    } else if (a(childAt)) {
                        q0.b("ViewUtils", "View Judge : View Covered and Cover View is not transparent.");
                        return true;
                    }
                }
            }
            view2 = viewGroup;
        }
        q0.b("ViewUtils", "View Judge : Well done, View is not covered.");
        return false;
    }

    public static boolean a(View view) {
        if (view == null) {
            return true;
        }
        if (!((view.getTag() instanceof String) && "mb_wm".equals(view.getTag())) && view.getAlpha() > 0.5f) {
            return view.getBackground() == null || view.getBackground().getAlpha() > 127;
        }
        return false;
    }
}
