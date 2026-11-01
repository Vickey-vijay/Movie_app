package io.bidmachine.util;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets$Type;
import androidx.annotation.RequiresApi;
import bk.l;
import ck.p;
import com.ironsource.C3537j8;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: ViewUtils.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0007J#\u0010\u000f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u001a\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0002H\u0007J\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0007J$\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007J\u0018\u0010 \u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004H\u0007J$\u0010 \u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0007J1\u0010$\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010!*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0007¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J$\u0010)\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0'H\u0007J\b\u0010*\u001a\u00020\u001eH\u0007¨\u0006-"}, d2 = {"Lio/bidmachine/util/ViewUtils;", "", "", "generateViewId", "Landroid/view/View;", "child", "Landroid/view/ViewGroup;", "parent", "", "belongTo", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lmj/r;", "showViewSafely", "hideViewSafely", "color", "setBackgroundColorSafely", "(Landroid/view/View;Ljava/lang/Integer;)V", "removeFromParent", "(Landroid/view/View;)Lmj/r;", C3537j8.f29260n, "visibility", "", "visibilityToString", "Landroid/graphics/Rect;", "getLocationInWindow", "isViewTransparent", "setInsetsChanger", "typeInsets", "container", "addViewSafely", "Landroid/view/ViewGroup$LayoutParams;", "layoutParams", "addSingleViewSafely", "T", "Ljava/lang/Class;", "viewClass", "findViewByClassName", "(Landroid/view/ViewGroup;Ljava/lang/Class;)Landroid/view/View;", "findContentOrRootView", "Lkotlin/Function1;", "action", "doOnLayout", "createMatchParentParams", "<init>", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public final class ViewUtils {
    public static final ViewUtils INSTANCE = new ViewUtils();

    private ViewUtils() {
    }

    public static final void addSingleViewSafely(ViewGroup viewGroup, View view) {
        p.j(viewGroup, "container");
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        addSingleViewSafely(viewGroup, view, null);
    }

    public static final void addViewSafely(ViewGroup viewGroup, View view) {
        p.j(viewGroup, "container");
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        addViewSafely(viewGroup, view, null);
    }

    public static final boolean isViewVisible(int visibility) {
        return visibility == 0;
    }

    @RequiresApi(api = 30)
    public static final void setInsetsChanger(View view) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        setInsetsChanger(view, WindowInsets$Type.systemBars() | WindowInsets$Type.displayCutout());
    }

    public static final String visibilityToString(int visibility) {
        if (visibility == 0) {
            return "VISIBLE";
        }
        if (visibility != 4) {
            return visibility != 8 ? "unknown" : "GONE";
        }
        return "INVISIBLE";
    }

    public static final void addSingleViewSafely(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        p.j(viewGroup, "container");
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ViewUtilsKt.addSingleViewSafely(viewGroup, view, layoutParams);
    }

    public static /* synthetic */ void addSingleViewSafely$default(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            layoutParams = null;
        }
        addSingleViewSafely(viewGroup, view, layoutParams);
    }

    public static final void addViewSafely(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        p.j(viewGroup, "container");
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ViewUtilsKt.addViewSafely(viewGroup, view, layoutParams);
    }

    public static /* synthetic */ void addViewSafely$default(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            layoutParams = null;
        }
        addViewSafely(viewGroup, view, layoutParams);
    }

    public static final boolean belongTo(View child, ViewGroup parent) {
        p.j(child, "child");
        p.j(parent, "parent");
        return ViewUtilsKt.belongTo(child, parent);
    }

    public static final ViewGroup.LayoutParams createMatchParentParams() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    public static final void doOnLayout(View view, l<? super View, r> lVar) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.j(lVar, "action");
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new ViewUtilsKt.AnonymousClass1(lVar));
        } else {
            lVar.invoke(view);
        }
    }

    public static final View findContentOrRootView(View view) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return ViewUtilsKt.findContentOrRootView(view);
    }

    public static final <T extends View> T findViewByClassName(ViewGroup parent, Class<T> viewClass) {
        p.j(parent, "parent");
        p.j(viewClass, "viewClass");
        return (T) ViewUtilsKt.findViewByClassName(parent, viewClass);
    }

    public static final Rect getLocationInWindow(View view) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return ViewUtilsKt.getLocationInWindow(view);
    }

    public static final boolean isViewTransparent(View view) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return ViewUtilsKt.isViewTransparent(view);
    }

    public static final boolean isViewVisible(View view) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return ViewUtilsKt.isViewVisible(view);
    }

    public static final r removeFromParent(View view) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return ViewUtilsKt.removeFromParent(view);
    }

    @RequiresApi(api = 30)
    public static final void setInsetsChanger(View view, int i10) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ViewUtilsKt.setInsetsChanger(view, i10);
    }

    public static /* synthetic */ void setInsetsChanger$default(View view, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = WindowInsets$Type.systemBars() | WindowInsets$Type.displayCutout();
        }
        setInsetsChanger(view, i10);
    }

    public static final int generateViewId() {
        return View.generateViewId();
    }

    public static final void hideViewSafely(View view) {
        ViewUtilsKt.hideViewSafely(view);
    }

    public static final void setBackgroundColorSafely(View view, Integer color) {
        ViewUtilsKt.setBackgroundColorSafely(view, color);
    }

    public static final void showViewSafely(View view) {
        ViewUtilsKt.showViewSafely(view);
    }
}
