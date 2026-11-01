package io.bidmachine.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import bk.l;
import ck.p;
import com.ironsource.C3537j8;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.util.ViewUtilsKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import mj.r;
import rj.c;
import sj.a;
import tj.f;

/* JADX INFO: compiled from: ViewUtils.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\f\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0000\u001a\f\u0010\u0007\u001a\u00020\u0005*\u0004\u0018\u00010\u0000\u001a\u001d\u0010\n\u001a\u00020\u0005*\u0004\u0018\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005*\u00020\u0000¢\u0006\u0004\b\f\u0010\r\u001a\n\u0010\u000e\u001a\u00020\u0003*\u00020\u0000\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u0000\u001a\n\u0010\u0011\u001a\u00020\u0003*\u00020\u0000\u001a\u0016\u0010\u0013\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\bH\u0007\u001a\u001e\u0010\u0017\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u001a\u001e\u0010\u0018\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u001a+\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0019*\u00020\u0000*\u00020\u00012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\f\u0010\u001e\u001a\u0004\u0018\u00010\u0000*\u00020\u0000\u001a\f\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u0000\u001a\f\u0010\"\u001a\u0004\u0018\u00010!*\u00020\u0000\u001a&\u0010%\u001a\u00020\u0005*\u00020\u00002\u0014\b\u0004\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050#H\u0086\bø\u0001\u0000\u001a\u0017\u0010&\u001a\u00020\u0000*\u00020\u0000H\u0086@ø\u0001\u0001¢\u0006\u0004\b&\u0010'\u001a*\u0010,\u001a\u00020\u0005*\u00020\u00002\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\b\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroid/view/View;", "Landroid/view/ViewGroup;", "parent", "", "belongTo", "Lmj/r;", "showViewSafely", "hideViewSafely", "", "color", "setBackgroundColorSafely", "(Landroid/view/View;Ljava/lang/Integer;)V", "removeFromParent", "(Landroid/view/View;)Lmj/r;", C3537j8.f29260n, "Landroid/graphics/Rect;", "getLocationInWindow", "isViewTransparent", "typeInsets", "setInsetsChanger", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Landroid/view/ViewGroup$LayoutParams;", "layoutParams", "addViewSafely", "addSingleViewSafely", "T", "Ljava/lang/Class;", "viewClass", "findViewByClassName", "(Landroid/view/ViewGroup;Ljava/lang/Class;)Landroid/view/View;", "findContentOrRootView", "Landroid/app/Activity;", "findActivity", "Landroid/view/Window;", "findWindow", "Lkotlin/Function1;", "action", "doOnLayout", "awaitLayout", "(Landroid/view/View;Lrj/c;)Ljava/lang/Object;", "leftPx", "topPx", "rightPx", "bottomPx", "addPadding", "bidmachine-android-util_d_0_13_0"}, k = 2, mv = {1, 7, 1})
public final class ViewUtilsKt {

    /* JADX INFO: renamed from: io.bidmachine.util.ViewUtilsKt$doOnLayout$1, reason: invalid class name */
    /* JADX INFO: compiled from: ViewUtils.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"io/bidmachine/util/ViewUtilsKt$doOnLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lmj/r;", "onLayoutChange", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
    public static final class AnonymousClass1 implements View.OnLayoutChangeListener {
        public final /* synthetic */ l<View, r> $action;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(l<? super View, r> lVar) {
            this.$action = lVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            view.removeOnLayoutChangeListener(this);
            this.$action.invoke(view);
        }
    }

    public static final void addPadding(View view, int i10, int i11, int i12, int i13) {
        p.j(view, "<this>");
        view.setPadding(view.getPaddingLeft() + i10, view.getPaddingTop() + i11, view.getPaddingRight() + i12, view.getPaddingBottom() + i13);
    }

    public static final void addSingleViewSafely(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        p.j(viewGroup, "<this>");
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        try {
            viewGroup.removeAllViews();
            r rVar = r.f64562a;
        } catch (Throwable unused) {
        }
        addViewSafely(viewGroup, view, layoutParams);
    }

    public static /* synthetic */ void addSingleViewSafely$default(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            layoutParams = null;
        }
        addSingleViewSafely(viewGroup, view, layoutParams);
    }

    public static final void addViewSafely(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams) {
        p.j(viewGroup, "<this>");
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        try {
            removeFromParent(view);
            if (layoutParams != null) {
                viewGroup.addView(view, layoutParams);
            } else {
                viewGroup.addView(view);
            }
            r rVar = r.f64562a;
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void addViewSafely$default(ViewGroup viewGroup, View view, ViewGroup.LayoutParams layoutParams, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            layoutParams = null;
        }
        addViewSafely(viewGroup, view, layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.view.View$OnLayoutChangeListener, io.bidmachine.util.ViewUtilsKt$awaitLayout$2$listener$1] */
    public static final Object awaitLayout(final View view, c<? super View> cVar) {
        final kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            final ?? r10 = new View.OnLayoutChangeListener() { // from class: io.bidmachine.util.ViewUtilsKt$awaitLayout$2$listener$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    p.j(view2, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                    view.removeOnLayoutChangeListener(this);
                    cVar2.resumeWith(Result.m3458constructorimpl(view2));
                }
            };
            cVar2.p(new l<Throwable, r>() { // from class: io.bidmachine.util.ViewUtilsKt$awaitLayout$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                    invoke2(th2);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                    view.removeOnLayoutChangeListener(r10);
                }
            });
            view.addOnLayoutChangeListener(r10);
        } else {
            cVar2.resumeWith(Result.m3458constructorimpl(view));
        }
        Object objB = cVar2.B();
        if (objB == a.f()) {
            f.c(cVar);
        }
        return objB;
    }

    public static final boolean belongTo(View view, ViewGroup viewGroup) {
        p.j(view, "<this>");
        p.j(viewGroup, "parent");
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            return p.e(parent, viewGroup) || belongTo((View) parent, viewGroup);
        }
        return false;
    }

    public static final void doOnLayout(View view, l<? super View, r> lVar) {
        p.j(view, "<this>");
        p.j(lVar, "action");
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new AnonymousClass1(lVar));
        } else {
            lVar.invoke(view);
        }
    }

    public static final Activity findActivity(View view) {
        p.j(view, "<this>");
        View viewFindContentOrRootView = findContentOrRootView(view);
        Context context = viewFindContentOrRootView != null ? viewFindContentOrRootView.getContext() : null;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public static final View findContentOrRootView(View view) {
        p.j(view, "<this>");
        View view2 = null;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
        }
        return view2;
    }

    public static final <T extends View> T findViewByClassName(ViewGroup viewGroup, Class<T> cls) {
        T t10;
        p.j(viewGroup, "<this>");
        p.j(cls, "viewClass");
        try {
            if (p.e(viewGroup.getClass(), cls)) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof ViewGroup) && (t10 = (T) findViewByClassName((ViewGroup) childAt, cls)) != null) {
                    return t10;
                }
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Window findWindow(View view) {
        p.j(view, "<this>");
        Activity activityFindActivity = findActivity(view);
        if (activityFindActivity != null) {
            return activityFindActivity.getWindow();
        }
        return null;
    }

    public static final Rect getLocationInWindow(View view) {
        p.j(view, "<this>");
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static final void hideViewSafely(final View view) {
        if (view == null) {
            return;
        }
        UiUtils.onUiThread(new SafeRunnable() { // from class: io.bidmachine.util.ViewUtilsKt.hideViewSafely.1
            @Override // io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) throws Throwable {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }

            @Override // io.bidmachine.util.SafeRunnable
            public void onRun() {
                view.setVisibility(8);
            }
        });
    }

    public static final boolean isViewTransparent(View view) {
        p.j(view, "<this>");
        return view.getAlpha() == 0.0f;
    }

    public static final boolean isViewVisible(View view) {
        p.j(view, "<this>");
        return ViewUtils.isViewVisible(view.getVisibility());
    }

    public static final r removeFromParent(View view) {
        p.j(view, "<this>");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return null;
        }
        viewGroup.removeView(view);
        return r.f64562a;
    }

    public static final void setBackgroundColorSafely(View view, Integer num) {
        if (view == null || num == null) {
            return;
        }
        try {
            view.setBackgroundColor(num.intValue());
            r rVar = r.f64562a;
        } catch (Throwable unused) {
        }
    }

    @RequiresApi(api = 30)
    public static final void setInsetsChanger(View view, final int i10) {
        p.j(view, "<this>");
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: fi.a
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return ViewUtilsKt.setInsetsChanger$lambda$3(i10, view2, windowInsets);
            }
        });
    }

    public static /* synthetic */ void setInsetsChanger$default(View view, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = WindowInsets$Type.systemBars() | WindowInsets$Type.displayCutout();
        }
        setInsetsChanger(view, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets setInsetsChanger$lambda$3(int i10, View view, WindowInsets windowInsets) {
        p.j(view, "selfView");
        p.j(windowInsets, "windowInsets");
        Insets insets = windowInsets.getInsets(i10);
        p.i(insets, "windowInsets.getInsets(typeInsets)");
        view.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        return windowInsets;
    }

    public static final void showViewSafely(final View view) {
        if (view == null) {
            return;
        }
        UiUtils.onUiThread(new SafeRunnable() { // from class: io.bidmachine.util.ViewUtilsKt.showViewSafely.1
            @Override // io.bidmachine.util.SafeRunnable
            public /* bridge */ /* synthetic */ void onThrows(Throwable th2) throws Throwable {
                super.onThrows(th2);
            }

            @Override // io.bidmachine.util.SafeRunnable, java.lang.Runnable
            @CallSuper
            public /* bridge */ /* synthetic */ void run() {
                super.run();
            }

            @Override // io.bidmachine.util.SafeRunnable
            public void onRun() {
                view.setVisibility(0);
            }
        });
    }
}
