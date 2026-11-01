package androidx.navigation.ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.widget.Openable;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptions;
import androidx.navigation.ui.NavigationUI;
import androidx.profileinstaller.ProfileVerifier;
import ck.p;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.utils.i;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationUI.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b*\u0010+J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0007J\"\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\"\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\"\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\"\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J*\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J*\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\fH\u0007J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u0016\u0010\u001c\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\u0014\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0007J\u001d\u0010$\u001a\u00020\u0006*\u00020\u001f2\b\b\u0001\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b\"\u0010#J#\u0010)\u001a\u00020\u0006*\u00020\u001f2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0%H\u0001¢\u0006\u0004\b'\u0010(¨\u0006,"}, d2 = {"Landroidx/navigation/ui/NavigationUI;", "", "Landroid/view/MenuItem;", "item", "Landroidx/navigation/NavController;", "navController", "", "onNavDestinationSelected", "saveState", "Landroidx/customview/widget/Openable;", "openableLayout", "navigateUp", "Landroidx/navigation/ui/AppBarConfiguration;", i.f44984c, "Landroidx/appcompat/app/AppCompatActivity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lmj/r;", "setupActionBarWithNavController", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "setupWithNavController", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "collapsingToolbarLayout", "Lcom/google/android/material/navigation/NavigationView;", "navigationView", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "findBottomSheetBehavior", "Lcom/google/android/material/navigation/NavigationBarView;", "navigationBarView", "Landroidx/navigation/NavDestination;", "", "destId", "matchDestination$navigation_ui_release", "(Landroidx/navigation/NavDestination;I)Z", "matchDestination", "", "destinationIds", "matchDestinations$navigation_ui_release", "(Landroidx/navigation/NavDestination;Ljava/util/Set;)Z", "matchDestinations", "<init>", "()V", "navigation-ui_release"}, k = 1, mv = {1, 6, 0})
public final class NavigationUI {
    public static final NavigationUI INSTANCE = new NavigationUI();

    private NavigationUI() {
    }

    public static final boolean navigateUp(NavController navController, Openable openableLayout) {
        p.j(navController, "navController");
        return navigateUp(navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openableLayout).build());
    }

    public static final boolean onNavDestinationSelected(MenuItem item, NavController navController) {
        p.j(item, "item");
        p.j(navController, "navController");
        NavOptions.Builder restoreState = new NavOptions.Builder().setLaunchSingleTop(true).setRestoreState(true);
        NavDestination currentDestination = navController.getCurrentDestination();
        p.g(currentDestination);
        NavGraph parent = currentDestination.getParent();
        p.g(parent);
        if (parent.findNode(item.getItemId()) instanceof ActivityNavigator.Destination) {
            restoreState.setEnterAnim(R.anim.nav_default_enter_anim).setExitAnim(R.anim.nav_default_exit_anim).setPopEnterAnim(R.anim.nav_default_pop_enter_anim).setPopExitAnim(R.anim.nav_default_pop_exit_anim);
        } else {
            restoreState.setEnterAnim(R.animator.nav_default_enter_anim).setExitAnim(R.animator.nav_default_exit_anim).setPopEnterAnim(R.animator.nav_default_pop_enter_anim).setPopExitAnim(R.animator.nav_default_pop_exit_anim);
        }
        if ((item.getOrder() & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            restoreState.setPopUpTo(NavGraph.INSTANCE.findStartDestination(navController.getGraph()).getId(), false, true);
        }
        try {
            navController.navigate(item.getItemId(), (Bundle) null, restoreState.build());
            NavDestination currentDestination2 = navController.getCurrentDestination();
            return currentDestination2 != null && matchDestination$navigation_ui_release(currentDestination2, item.getItemId());
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static final void setupActionBarWithNavController(AppCompatActivity appCompatActivity, NavController navController) {
        p.j(appCompatActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        p.j(navController, "navController");
        setupActionBarWithNavController$default(appCompatActivity, navController, null, 4, null);
    }

    public static final void setupActionBarWithNavController(AppCompatActivity appCompatActivity, NavController navController, Openable openable) {
        p.j(appCompatActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        p.j(navController, "navController");
        setupActionBarWithNavController(appCompatActivity, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static final void setupWithNavController(Toolbar toolbar, NavController navController) {
        p.j(toolbar, "toolbar");
        p.j(navController, "navController");
        setupWithNavController$default(toolbar, navController, null, 4, null);
    }

    public static final void setupWithNavController(Toolbar toolbar, NavController navController, Openable openable) {
        p.j(toolbar, "toolbar");
        p.j(navController, "navController");
        setupWithNavController(toolbar, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController) {
        p.j(collapsingToolbarLayout, "collapsingToolbarLayout");
        p.j(toolbar, "toolbar");
        p.j(navController, "navController");
        setupWithNavController$default(collapsingToolbarLayout, toolbar, navController, null, 8, null);
    }

    public static /* synthetic */ void setupWithNavController$default(Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupWithNavController(toolbar, navController, appBarConfiguration);
    }

    public static final boolean matchDestination$navigation_ui_release(NavDestination navDestination, @IdRes int i10) {
        boolean z10;
        p.j(navDestination, "<this>");
        Iterator<NavDestination> it = NavDestination.INSTANCE.getHierarchy(navDestination).iterator();
        do {
            z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            if (it.next().getId() == i10) {
                z10 = true;
            }
        } while (!z10);
        return true;
    }

    public static final boolean matchDestinations$navigation_ui_release(NavDestination navDestination, Set<Integer> set) {
        p.j(navDestination, "<this>");
        p.j(set, "destinationIds");
        Iterator<NavDestination> it = NavDestination.INSTANCE.getHierarchy(navDestination).iterator();
        while (it.hasNext()) {
            if (set.contains(Integer.valueOf(it.next().getId()))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void setupActionBarWithNavController$default(AppCompatActivity appCompatActivity, NavController navController, AppBarConfiguration appBarConfiguration, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupActionBarWithNavController(appCompatActivity, navController, appBarConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-1, reason: not valid java name */
    public static final void m32setupWithNavController$lambda1(NavController navController, AppBarConfiguration appBarConfiguration, View view) {
        p.j(navController, "$navController");
        p.j(appBarConfiguration, "$configuration");
        navigateUp(navController, appBarConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-2, reason: not valid java name */
    public static final void m33setupWithNavController$lambda2(NavController navController, AppBarConfiguration appBarConfiguration, View view) {
        p.j(navController, "$navController");
        p.j(appBarConfiguration, "$configuration");
        navigateUp(navController, appBarConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-3, reason: not valid java name */
    public static final boolean m34setupWithNavController$lambda3(NavController navController, NavigationView navigationView, MenuItem menuItem) {
        p.j(navController, "$navController");
        p.j(navigationView, "$navigationView");
        p.j(menuItem, "item");
        boolean zOnNavDestinationSelected = onNavDestinationSelected(menuItem, navController);
        if (zOnNavDestinationSelected) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof Openable) {
                ((Openable) parent).close();
            } else {
                BottomSheetBehavior<?> bottomSheetBehaviorFindBottomSheetBehavior = findBottomSheetBehavior(navigationView);
                if (bottomSheetBehaviorFindBottomSheetBehavior != null) {
                    bottomSheetBehaviorFindBottomSheetBehavior.setState(5);
                }
            }
        }
        return zOnNavDestinationSelected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-5, reason: not valid java name */
    public static final boolean m35setupWithNavController$lambda5(NavController navController, boolean z10, NavigationView navigationView, MenuItem menuItem) {
        p.j(navController, "$navController");
        p.j(navigationView, "$navigationView");
        p.j(menuItem, "item");
        boolean zOnNavDestinationSelected = onNavDestinationSelected(menuItem, navController, z10);
        if (zOnNavDestinationSelected) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof Openable) {
                ((Openable) parent).close();
            } else {
                BottomSheetBehavior<?> bottomSheetBehaviorFindBottomSheetBehavior = findBottomSheetBehavior(navigationView);
                if (bottomSheetBehaviorFindBottomSheetBehavior != null) {
                    bottomSheetBehaviorFindBottomSheetBehavior.setState(5);
                }
            }
        }
        return zOnNavDestinationSelected;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-6, reason: not valid java name */
    public static final boolean m36setupWithNavController$lambda6(NavController navController, MenuItem menuItem) {
        p.j(navController, "$navController");
        p.j(menuItem, "item");
        return onNavDestinationSelected(menuItem, navController);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: setupWithNavController$lambda-8, reason: not valid java name */
    public static final boolean m37setupWithNavController$lambda8(NavController navController, boolean z10, MenuItem menuItem) {
        p.j(navController, "$navController");
        p.j(menuItem, "item");
        return onNavDestinationSelected(menuItem, navController, z10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final BottomSheetBehavior<?> findBottomSheetBehavior(View view) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return null;
            }
            return findBottomSheetBehavior((View) parent);
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (!(behavior instanceof BottomSheetBehavior)) {
            return null;
        }
        return (BottomSheetBehavior) behavior;
    }

    public static /* synthetic */ void setupWithNavController$default(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupWithNavController(collapsingToolbarLayout, toolbar, navController, appBarConfiguration);
    }

    public static final boolean navigateUp(NavController navController, AppBarConfiguration configuration) {
        p.j(navController, "navController");
        p.j(configuration, i.f44984c);
        Openable openableLayout = configuration.getOpenableLayout();
        NavDestination currentDestination = navController.getCurrentDestination();
        Set<Integer> topLevelDestinations = configuration.getTopLevelDestinations();
        if (openableLayout != null && currentDestination != null && matchDestinations$navigation_ui_release(currentDestination, topLevelDestinations)) {
            openableLayout.open();
            return true;
        }
        if (navController.navigateUp()) {
            return true;
        }
        AppBarConfiguration.OnNavigateUpListener fallbackOnNavigateUpListener = configuration.getFallbackOnNavigateUpListener();
        if (fallbackOnNavigateUpListener != null) {
            return fallbackOnNavigateUpListener.onNavigateUp();
        }
        return false;
    }

    public static final void setupActionBarWithNavController(AppCompatActivity appCompatActivity, NavController navController, AppBarConfiguration appBarConfiguration) {
        p.j(appCompatActivity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        p.j(navController, "navController");
        p.j(appBarConfiguration, i.f44984c);
        navController.addOnDestinationChangedListener(new ActionBarOnDestinationChangedListener(appCompatActivity, appBarConfiguration));
    }

    public static final void setupWithNavController(Toolbar toolbar, final NavController navController, final AppBarConfiguration appBarConfiguration) {
        p.j(toolbar, "toolbar");
        p.j(navController, "navController");
        p.j(appBarConfiguration, i.f44984c);
        navController.addOnDestinationChangedListener(new ToolbarOnDestinationChangedListener(toolbar, appBarConfiguration));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NavigationUI.m32setupWithNavController$lambda1(navController, appBarConfiguration, view);
            }
        });
    }

    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, Openable openable) {
        p.j(collapsingToolbarLayout, "collapsingToolbarLayout");
        p.j(toolbar, "toolbar");
        p.j(navController, "navController");
        setupWithNavController(collapsingToolbarLayout, toolbar, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openable).build());
    }

    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, final NavController navController, final AppBarConfiguration appBarConfiguration) {
        p.j(collapsingToolbarLayout, "collapsingToolbarLayout");
        p.j(toolbar, "toolbar");
        p.j(navController, "navController");
        p.j(appBarConfiguration, i.f44984c);
        navController.addOnDestinationChangedListener(new CollapsingToolbarOnDestinationChangedListener(collapsingToolbarLayout, toolbar, appBarConfiguration));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NavigationUI.m33setupWithNavController$lambda2(navController, appBarConfiguration, view);
            }
        });
    }

    public static final void setupWithNavController(final NavigationView navigationView, final NavController navController) {
        p.j(navigationView, "navigationView");
        p.j(navController, "navController");
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() { // from class: o.d
            @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return NavigationUI.m34setupWithNavController$lambda3(navController, navigationView, menuItem);
            }
        });
        final WeakReference weakReference = new WeakReference(navigationView);
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.4
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public void onDestinationChanged(NavController navController2, NavDestination navDestination, Bundle bundle) {
                p.j(navController2, "controller");
                p.j(navDestination, "destination");
                NavigationView navigationView2 = weakReference.get();
                if (navigationView2 == null) {
                    navController.removeOnDestinationChangedListener(this);
                    return;
                }
                Menu menu = navigationView2.getMenu();
                p.i(menu, "view.menu");
                int size = menu.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MenuItem item = menu.getItem(i10);
                    p.f(item, "getItem(index)");
                    item.setChecked(NavigationUI.matchDestination$navigation_ui_release(navDestination, item.getItemId()));
                }
            }
        });
    }

    @NavigationUiSaveStateControl
    public static final boolean onNavDestinationSelected(MenuItem item, NavController navController, boolean saveState) {
        p.j(item, "item");
        p.j(navController, "navController");
        if (!saveState) {
            NavOptions.Builder launchSingleTop = new NavOptions.Builder().setLaunchSingleTop(true);
            NavDestination currentDestination = navController.getCurrentDestination();
            p.g(currentDestination);
            NavGraph parent = currentDestination.getParent();
            p.g(parent);
            if (parent.findNode(item.getItemId()) instanceof ActivityNavigator.Destination) {
                launchSingleTop.setEnterAnim(R.anim.nav_default_enter_anim).setExitAnim(R.anim.nav_default_exit_anim).setPopEnterAnim(R.anim.nav_default_pop_enter_anim).setPopExitAnim(R.anim.nav_default_pop_exit_anim);
            } else {
                launchSingleTop.setEnterAnim(R.animator.nav_default_enter_anim).setExitAnim(R.animator.nav_default_exit_anim).setPopEnterAnim(R.animator.nav_default_pop_enter_anim).setPopExitAnim(R.animator.nav_default_pop_exit_anim);
            }
            if ((item.getOrder() & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                NavOptions.Builder.setPopUpTo$default(launchSingleTop, NavGraph.INSTANCE.findStartDestination(navController.getGraph()).getId(), false, false, 4, (Object) null);
            }
            try {
                navController.navigate(item.getItemId(), (Bundle) null, launchSingleTop.build());
                NavDestination currentDestination2 = navController.getCurrentDestination();
                return currentDestination2 != null && matchDestination$navigation_ui_release(currentDestination2, item.getItemId());
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
    }

    @NavigationUiSaveStateControl
    public static final void setupWithNavController(final NavigationView navigationView, final NavController navController, final boolean z10) {
        p.j(navigationView, "navigationView");
        p.j(navController, "navController");
        if (!z10) {
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() { // from class: o.a
                @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
                public final boolean onNavigationItemSelected(MenuItem menuItem) {
                    return NavigationUI.m35setupWithNavController$lambda5(navController, z10, navigationView, menuItem);
                }
            });
            final WeakReference weakReference = new WeakReference(navigationView);
            navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.7
                @Override // androidx.navigation.NavController.OnDestinationChangedListener
                public void onDestinationChanged(NavController navController2, NavDestination navDestination, Bundle bundle) {
                    p.j(navController2, "controller");
                    p.j(navDestination, "destination");
                    NavigationView navigationView2 = weakReference.get();
                    if (navigationView2 == null) {
                        navController.removeOnDestinationChangedListener(this);
                        return;
                    }
                    Menu menu = navigationView2.getMenu();
                    p.i(menu, "view.menu");
                    int size = menu.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        MenuItem item = menu.getItem(i10);
                        p.f(item, "getItem(index)");
                        item.setChecked(NavigationUI.matchDestination$navigation_ui_release(navDestination, item.getItemId()));
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
    }

    public static final void setupWithNavController(NavigationBarView navigationBarView, final NavController navController) {
        p.j(navigationBarView, "navigationBarView");
        p.j(navController, "navController");
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { // from class: o.c
            @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return NavigationUI.m36setupWithNavController$lambda6(navController, menuItem);
            }
        });
        final WeakReference weakReference = new WeakReference(navigationBarView);
        navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.9
            @Override // androidx.navigation.NavController.OnDestinationChangedListener
            public void onDestinationChanged(NavController navController2, NavDestination navDestination, Bundle bundle) {
                p.j(navController2, "controller");
                p.j(navDestination, "destination");
                NavigationBarView navigationBarView2 = weakReference.get();
                if (navigationBarView2 == null) {
                    navController.removeOnDestinationChangedListener(this);
                    return;
                }
                Menu menu = navigationBarView2.getMenu();
                p.i(menu, "view.menu");
                int size = menu.size();
                for (int i10 = 0; i10 < size; i10++) {
                    MenuItem item = menu.getItem(i10);
                    p.f(item, "getItem(index)");
                    if (NavigationUI.matchDestination$navigation_ui_release(navDestination, item.getItemId())) {
                        item.setChecked(true);
                    }
                }
            }
        });
    }

    @NavigationUiSaveStateControl
    public static final void setupWithNavController(NavigationBarView navigationBarView, final NavController navController, final boolean z10) {
        p.j(navigationBarView, "navigationBarView");
        p.j(navController, "navController");
        if (!z10) {
            navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() { // from class: o.f
                @Override // com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
                public final boolean onNavigationItemSelected(MenuItem menuItem) {
                    return NavigationUI.m37setupWithNavController$lambda8(navController, z10, menuItem);
                }
            });
            final WeakReference weakReference = new WeakReference(navigationBarView);
            navController.addOnDestinationChangedListener(new NavController.OnDestinationChangedListener() { // from class: androidx.navigation.ui.NavigationUI.setupWithNavController.12
                @Override // androidx.navigation.NavController.OnDestinationChangedListener
                public void onDestinationChanged(NavController navController2, NavDestination navDestination, Bundle bundle) {
                    p.j(navController2, "controller");
                    p.j(navDestination, "destination");
                    NavigationBarView navigationBarView2 = weakReference.get();
                    if (navigationBarView2 == null) {
                        navController.removeOnDestinationChangedListener(this);
                        return;
                    }
                    Menu menu = navigationBarView2.getMenu();
                    p.i(menu, "view.menu");
                    int size = menu.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        MenuItem item = menu.getItem(i10);
                        p.f(item, "getItem(index)");
                        if (NavigationUI.matchDestination$navigation_ui_release(navDestination, item.getItemId())) {
                            item.setChecked(true);
                        }
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
    }
}
