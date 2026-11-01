package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.annotation.CallSuper;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import ck.i;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import kotlin.Metadata;
import me.goldze.mvvmhabit.base.ContainerActivity;
import mj.r;

/* JADX INFO: compiled from: NavHostFragment.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0007¢\u0006\u0004\b3\u00104J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0017J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0015J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0015J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0017J\u0010\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013H\u0015J&\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010 \u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0017J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0007H\u0017J\b\u0010#\u001a\u00020\u0005H\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010'\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavHost;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lmj/r;", "onAttach", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroidx/navigation/NavHostController;", "navHostController", "onCreateNavHostController", "Landroidx/navigation/NavController;", "navController", "onCreateNavController", "", "isPrimaryNavigationFragment", "onPrimaryNavigationFragmentChanged", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "createFragmentNavigator", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "onViewCreated", "Landroid/util/AttributeSet;", "attrs", "onInflate", "outState", "onSaveInstanceState", "onDestroyView", "Landroidx/navigation/NavHostController;", "isPrimaryBeforeOnCreate", "Ljava/lang/Boolean;", "viewParent", "Landroid/view/View;", "", "graphId", "I", "defaultNavHost", "Z", "getContainerId", "()I", "containerId", "getNavController", "()Landroidx/navigation/NavController;", "<init>", "()V", VastTagName.COMPANION, "navigation-fragment_release"}, k = 1, mv = {1, 6, 0})
public class NavHostFragment extends Fragment implements NavHost {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String KEY_DEFAULT_NAV_HOST = "android-support-nav:fragment:defaultHost";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_GRAPH_ID = "android-support-nav:fragment:graphId";
    private static final String KEY_NAV_CONTROLLER_STATE = "android-support-nav:fragment:navControllerState";

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String KEY_START_DESTINATION_ARGS = "android-support-nav:fragment:startDestinationArgs";
    private boolean defaultNavHost;
    private int graphId;
    private Boolean isPrimaryBeforeOnCreate;
    private NavHostController navHostController;
    private View viewParent;

    /* JADX INFO: compiled from: NavHostFragment.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment$Companion;", "", "()V", "KEY_DEFAULT_NAV_HOST", "", "KEY_GRAPH_ID", "KEY_NAV_CONTROLLER_STATE", "KEY_START_DESTINATION_ARGS", "create", "Landroidx/navigation/fragment/NavHostFragment;", "graphResId", "", "startDestinationArgs", "Landroid/os/Bundle;", "findNavController", "Landroidx/navigation/NavController;", ContainerActivity.FRAGMENT, "Landroidx/fragment/app/Fragment;", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final NavHostFragment create(@NavigationRes int i10) {
            return create$default(this, i10, null, 2, null);
        }

        public static /* synthetic */ NavHostFragment create$default(Companion companion, int i10, Bundle bundle, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                bundle = null;
            }
            return companion.create(i10, bundle);
        }

        public final NavHostFragment create(@NavigationRes int graphResId, Bundle startDestinationArgs) {
            Bundle bundle;
            if (graphResId != 0) {
                bundle = new Bundle();
                bundle.putInt(NavHostFragment.KEY_GRAPH_ID, graphResId);
            } else {
                bundle = null;
            }
            if (startDestinationArgs != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle(NavHostFragment.KEY_START_DESTINATION_ARGS, startDestinationArgs);
            }
            NavHostFragment navHostFragment = new NavHostFragment();
            if (bundle != null) {
                navHostFragment.setArguments(bundle);
            }
            return navHostFragment;
        }

        public final NavController findNavController(Fragment fragment) {
            Dialog dialog;
            Window window;
            p.j(fragment, ContainerActivity.FRAGMENT);
            for (Fragment parentFragment = fragment; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                if (parentFragment instanceof NavHostFragment) {
                    NavHostController navHostController = ((NavHostFragment) parentFragment).navHostController;
                    if (navHostController != null) {
                        return navHostController;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
                Fragment primaryNavigationFragment = parentFragment.getParentFragmentManager().getPrimaryNavigationFragment();
                if (primaryNavigationFragment instanceof NavHostFragment) {
                    NavHostController navHostController2 = ((NavHostFragment) primaryNavigationFragment).navHostController;
                    if (navHostController2 != null) {
                        return navHostController2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavController");
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return Navigation.findNavController(view);
            }
            View decorView = null;
            DialogFragment dialogFragment = fragment instanceof DialogFragment ? (DialogFragment) fragment : null;
            if (dialogFragment != null && (dialog = dialogFragment.getDialog()) != null && (window = dialog.getWindow()) != null) {
                decorView = window.getDecorView();
            }
            if (decorView != null) {
                return Navigation.findNavController(decorView);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
        }
    }

    public static final NavHostFragment create(@NavigationRes int i10) {
        return INSTANCE.create(i10);
    }

    public static final NavHostFragment create(@NavigationRes int i10, Bundle bundle) {
        return INSTANCE.create(i10, bundle);
    }

    public static final NavController findNavController(Fragment fragment) {
        return INSTANCE.findNavController(fragment);
    }

    public Navigator<? extends FragmentNavigator.Destination> createFragmentNavigator() {
        Context contextRequireContext = requireContext();
        p.i(contextRequireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        p.i(childFragmentManager, "childFragmentManager");
        return new FragmentNavigator(contextRequireContext, childFragmentManager, getContainerId());
    }

    @Override // androidx.navigation.NavHost
    public final NavController getNavController() {
        NavHostController navHostController = this.navHostController;
        if (navHostController == null) {
            throw new IllegalStateException("NavController is not available before onCreate()".toString());
        }
        if (navHostController != null) {
            return navHostController;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavHostController");
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        super.onAttach(context);
        if (this.defaultNavHost) {
            getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
    }

    @CallSuper
    public void onCreateNavController(NavController navController) {
        p.j(navController, "navController");
        NavigatorProvider navigatorProvider = navController.get_navigatorProvider();
        Context contextRequireContext = requireContext();
        p.i(contextRequireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        p.i(childFragmentManager, "childFragmentManager");
        navigatorProvider.addNavigator(new DialogFragmentNavigator(contextRequireContext, childFragmentManager));
        navController.get_navigatorProvider().addNavigator(createFragmentNavigator());
    }

    @CallSuper
    public void onCreateNavHostController(NavHostController navHostController) {
        p.j(navHostController, "navHostController");
        onCreateNavController(navHostController);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        p.j(inflater, "inflater");
        Context context = inflater.getContext();
        p.i(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(getContainerId());
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(attributeSet, "attrs");
        super.onInflate(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.navigation.R.styleable.NavHost);
        p.i(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…yleable.NavHost\n        )");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.navigation.R.styleable.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        r rVar = r.f64562a;
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.NavHostFragment);
        p.i(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(R.styleable.NavHostFragment_defaultNavHost, false)) {
            this.defaultNavHost = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onPrimaryNavigationFragmentChanged(boolean z10) {
        NavHostController navHostController = this.navHostController;
        if (navHostController == null) {
            this.isPrimaryBeforeOnCreate = Boolean.valueOf(z10);
        } else if (navHostController != null) {
            navHostController.enableOnBackPressed(z10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onSaveInstanceState(Bundle bundle) {
        p.j(bundle, "outState");
        super.onSaveInstanceState(bundle);
        NavHostController navHostController = this.navHostController;
        p.g(navHostController);
        Bundle bundleSaveState = navHostController.saveState();
        if (bundleSaveState != null) {
            bundle.putBundle(KEY_NAV_CONTROLLER_STATE, bundleSaveState);
        }
        if (this.defaultNavHost) {
            bundle.putBoolean(KEY_DEFAULT_NAV_HOST, true);
        }
        int i10 = this.graphId;
        if (i10 != 0) {
            bundle.putInt(KEY_GRAPH_ID, i10);
        }
    }

    private final int getContainerId() {
        int id2 = getId();
        if (id2 == 0 || id2 == -1) {
            return R.id.nav_host_fragment_container;
        }
        return id2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onCreate(Bundle bundle) {
        boolean z10;
        Bundle bundle2;
        Context contextRequireContext = requireContext();
        p.i(contextRequireContext, "requireContext()");
        NavHostController navHostController = new NavHostController(contextRequireContext);
        this.navHostController = navHostController;
        p.g(navHostController);
        navHostController.setLifecycleOwner(this);
        Object obj = contextRequireContext;
        while (obj instanceof ContextWrapper) {
            if (obj instanceof OnBackPressedDispatcherOwner) {
                NavHostController navHostController2 = this.navHostController;
                p.g(navHostController2);
                OnBackPressedDispatcher onBackPressedDispatcher = ((OnBackPressedDispatcherOwner) obj).getOnBackPressedDispatcher();
                p.i(onBackPressedDispatcher, "context as OnBackPressed…).onBackPressedDispatcher");
                navHostController2.setOnBackPressedDispatcher(onBackPressedDispatcher);
                break;
            }
            Context baseContext = ((ContextWrapper) obj).getBaseContext();
            p.i(baseContext, "context.baseContext");
            obj = baseContext;
        }
        NavHostController navHostController3 = this.navHostController;
        p.g(navHostController3);
        Boolean bool = this.isPrimaryBeforeOnCreate;
        int i10 = 0;
        if (bool != null) {
            if (bool != null) {
                if (bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
        } else {
            z10 = false;
        }
        navHostController3.enableOnBackPressed(z10);
        Bundle bundle3 = null;
        this.isPrimaryBeforeOnCreate = null;
        NavHostController navHostController4 = this.navHostController;
        p.g(navHostController4);
        ViewModelStore viewModelStore = getViewModelStore();
        p.i(viewModelStore, "viewModelStore");
        navHostController4.setViewModelStore(viewModelStore);
        NavHostController navHostController5 = this.navHostController;
        p.g(navHostController5);
        onCreateNavHostController(navHostController5);
        if (bundle != null) {
            bundle2 = bundle.getBundle(KEY_NAV_CONTROLLER_STATE);
            if (bundle.getBoolean(KEY_DEFAULT_NAV_HOST, false)) {
                this.defaultNavHost = true;
                getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
            }
            this.graphId = bundle.getInt(KEY_GRAPH_ID);
        } else {
            bundle2 = null;
        }
        if (bundle2 != null) {
            NavHostController navHostController6 = this.navHostController;
            p.g(navHostController6);
            navHostController6.restoreState(bundle2);
        }
        if (this.graphId != 0) {
            NavHostController navHostController7 = this.navHostController;
            p.g(navHostController7);
            navHostController7.setGraph(this.graphId);
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                i10 = arguments.getInt(KEY_GRAPH_ID);
            }
            if (arguments != null) {
                bundle3 = arguments.getBundle(KEY_START_DESTINATION_ARGS);
            }
            if (i10 != 0) {
                NavHostController navHostController8 = this.navHostController;
                p.g(navHostController8);
                navHostController8.setGraph(i10, bundle3);
            }
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view = this.viewParent;
        if (view != null && Navigation.findNavController(view) == this.navHostController) {
            Navigation.setViewNavController(view, null);
        }
        this.viewParent = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            Navigation.setViewNavController(view, this.navHostController);
            if (view.getParent() != null) {
                Object parent = view.getParent();
                if (parent != null) {
                    View view2 = (View) parent;
                    this.viewParent = view2;
                    p.g(view2);
                    if (view2.getId() == getId()) {
                        View view3 = this.viewParent;
                        p.g(view3);
                        Navigation.setViewNavController(view3, this.navHostController);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }
}
