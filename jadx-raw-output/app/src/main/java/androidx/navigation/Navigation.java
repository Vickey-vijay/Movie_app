package androidx.navigation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.core.app.ActivityCompat;
import bk.l;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import kk.r;
import kotlin.Metadata;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: Navigation.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u001e\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u001a\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¨\u0006\u0018"}, d2 = {"Landroidx/navigation/Navigation;", "", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "", "viewId", "Landroidx/navigation/NavController;", "findNavController", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "resId", "Landroid/os/Bundle;", "args", "Landroid/view/View$OnClickListener;", "createNavigateOnClickListener", "Landroidx/navigation/NavDirections;", "directions", "controller", "Lmj/r;", "setViewNavController", "findViewNavController", "getViewNavController", "<init>", "()V", "navigation-runtime_release"}, k = 1, mv = {1, 6, 0})
public final class Navigation {
    public static final Navigation INSTANCE = new Navigation();

    private Navigation() {
    }

    public static final View.OnClickListener createNavigateOnClickListener(@IdRes int i10) {
        return createNavigateOnClickListener$default(i10, null, 2, null);
    }

    public static final View.OnClickListener createNavigateOnClickListener(@IdRes final int resId, final Bundle args) {
        return new View.OnClickListener() { // from class: androidx.navigation.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.m28createNavigateOnClickListener$lambda0(resId, args, view);
            }
        };
    }

    public static final NavController findNavController(Activity activity, @IdRes int viewId) {
        p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        View viewRequireViewById = ActivityCompat.requireViewById(activity, viewId);
        p.i(viewRequireViewById, "requireViewById<View>(activity, viewId)");
        NavController navControllerFindViewNavController = INSTANCE.findViewNavController(viewRequireViewById);
        if (navControllerFindViewNavController != null) {
            return navControllerFindViewNavController;
        }
        throw new IllegalStateException("Activity " + activity + " does not have a NavController set on " + viewId);
    }

    public static final View.OnClickListener createNavigateOnClickListener(final NavDirections directions) {
        p.j(directions, "directions");
        return new View.OnClickListener() { // from class: androidx.navigation.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Navigation.m29createNavigateOnClickListener$lambda1(directions, view);
            }
        };
    }

    public static /* synthetic */ View.OnClickListener createNavigateOnClickListener$default(int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return createNavigateOnClickListener(i10, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createNavigateOnClickListener$lambda-1, reason: not valid java name */
    public static final void m29createNavigateOnClickListener$lambda1(NavDirections navDirections, View view) {
        p.j(navDirections, "$directions");
        p.i(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        findNavController(view).navigate(navDirections);
    }

    private final NavController findViewNavController(View view) {
        return (NavController) SequencesKt___SequencesKt.D(SequencesKt___SequencesKt.L(r.p(view, new l<View, View>() { // from class: androidx.navigation.Navigation.findViewNavController.1
            @Override // bk.l
            public final View invoke(View view2) {
                p.j(view2, "it");
                Object parent = view2.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            }
        }), new l<View, NavController>() { // from class: androidx.navigation.Navigation.findViewNavController.2
            @Override // bk.l
            public final NavController invoke(View view2) {
                p.j(view2, "it");
                return Navigation.INSTANCE.getViewNavController(view2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavController getViewNavController(View view) {
        Object tag = view.getTag(R.id.nav_controller_view_tag);
        if (tag instanceof WeakReference) {
            return (NavController) ((WeakReference) tag).get();
        }
        if (tag instanceof NavController) {
            return (NavController) tag;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: createNavigateOnClickListener$lambda-0, reason: not valid java name */
    public static final void m28createNavigateOnClickListener$lambda0(int i10, Bundle bundle, View view) {
        p.i(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        findNavController(view).navigate(i10, bundle);
    }

    public static final void setViewNavController(View view, NavController navController) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        view.setTag(R.id.nav_controller_view_tag, navController);
    }

    public static final NavController findNavController(View view) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        NavController navControllerFindViewNavController = INSTANCE.findViewNavController(view);
        if (navControllerFindViewNavController != null) {
            return navControllerFindViewNavController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
