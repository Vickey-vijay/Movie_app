package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import ck.i;
import ck.p;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import me.goldze.mvvmhabit.base.ContainerActivity;
import mj.h;
import mj.r;
import nj.b0;
import nj.x;

/* JADX INFO: compiled from: FragmentNavigator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Navigator.Name(ContainerActivity.FRAGMENT)
@Metadata(bv = {}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\b\b\u0017\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003,-.B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b*\u0010+J$\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016J*\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0017J*\u0010\n\u001a\u00020\t2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0018H\u0016R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006/"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Landroidx/navigation/NavBackStackEntry;", "entry", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "Lmj/r;", "navigate", "Landroidx/fragment/app/FragmentTransaction;", "createFragmentTransaction", "popUpTo", "", "savedState", "popBackStack", "createDestination", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "className", "Landroid/os/Bundle;", "args", "Landroidx/fragment/app/Fragment;", "instantiateFragment", "", "entries", "backStackEntry", "onLaunchSingleTop", "onSaveState", "onRestoreState", "Landroid/content/Context;", "Landroidx/fragment/app/FragmentManager;", "", "containerId", "I", "", "savedIds", "Ljava/util/Set;", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", VastTagName.COMPANION, "Destination", "Extras", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0})
public class FragmentNavigator extends Navigator<Destination> {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final String KEY_SAVED_IDS = "androidx-nav-fragment:navigator:savedIds";

    @Deprecated
    private static final String TAG = "FragmentNavigator";
    private final int containerId;
    private final Context context;
    private final FragmentManager fragmentManager;
    private final Set<String> savedIds;

    /* JADX INFO: compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Companion;", "", "()V", "KEY_SAVED_IDS", "", "TAG", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: FragmentNavigator.kt */
    @Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0016¢\u0006\u0004\b\u0018\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000b\u001a\u00020\bH\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001d"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "Lmj/r;", "onInflate", "", "className", "setClassName", "toString", "", "other", "", "equals", "", "hashCode", "_className", "Ljava/lang/String;", "getClassName", "()Ljava/lang/String;", "Landroidx/navigation/Navigator;", "fragmentNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0})
    @NavDestination.ClassType(Fragment.class)
    public static class Destination extends NavDestination {
        private String _className;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Destination(Navigator<? extends Destination> navigator) {
            super(navigator);
            p.j(navigator, "fragmentNavigator");
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(Object other) {
            return other != null && (other instanceof Destination) && super.equals(other) && p.e(this._className, ((Destination) other)._className);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(FragmentNavigator.class));
            p.j(navigatorProvider, "navigatorProvider");
        }

        public final String getClassName() {
            String str = this._className;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set".toString());
            }
            if (str != null) {
                return str;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }

        @Override // androidx.navigation.NavDestination
        @CallSuper
        public void onInflate(Context context, AttributeSet attributeSet) {
            p.j(context, GAMConfig.KEY_CONTEXT);
            p.j(attributeSet, "attrs");
            super.onInflate(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.FragmentNavigator);
            p.i(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = typedArrayObtainAttributes.getString(R.styleable.FragmentNavigator_android_name);
            if (string != null) {
                setClassName(string);
            }
            r rVar = r.f64562a;
            typedArrayObtainAttributes.recycle();
        }

        public final Destination setClassName(String className) {
            p.j(className, "className");
            this._className = className;
            return this;
        }

        @Override // androidx.navigation.NavDestination
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this._className;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            String string = sb2.toString();
            p.i(string, "sb.toString()");
            return string;
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int iHashCode;
            int iHashCode2 = super.hashCode() * 31;
            String str = this._className;
            if (str != null) {
                iHashCode = str.hashCode();
            } else {
                iHashCode = 0;
            }
            return iHashCode2 + iHashCode;
        }
    }

    /* JADX INFO: compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB\u001b\b\u0000\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "sharedElements", "", "Landroid/view/View;", "", "(Ljava/util/Map;)V", "_sharedElements", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getSharedElements", "()Ljava/util/Map;", "Builder", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Extras implements Navigator.Extras {
        private final LinkedHashMap<View, String> _sharedElements;

        /* JADX INFO: compiled from: FragmentNavigator.kt */
        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0006J\u001a\u0010\u000b\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\rJ\u0006\u0010\u000e\u001a\u00020\u000fR*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;", "", "()V", "_sharedElements", "Ljava/util/LinkedHashMap;", "Landroid/view/View;", "", "Lkotlin/collections/LinkedHashMap;", "addSharedElement", "sharedElement", "name", "addSharedElements", "sharedElements", "", BillingClientBuilderBridgeCommon.buildMethodName, "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "navigation-fragment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
        public static final class Builder {
            private final LinkedHashMap<View, String> _sharedElements = new LinkedHashMap<>();

            public final Extras build() {
                return new Extras(this._sharedElements);
            }

            public final Builder addSharedElement(View sharedElement, String name) {
                p.j(sharedElement, "sharedElement");
                p.j(name, "name");
                this._sharedElements.put(sharedElement, name);
                return this;
            }

            public final Builder addSharedElements(Map<View, String> sharedElements) {
                p.j(sharedElements, "sharedElements");
                for (Map.Entry<View, String> entry : sharedElements.entrySet()) {
                    addSharedElement(entry.getKey(), entry.getValue());
                }
                return this;
            }
        }

        public final Map<View, String> getSharedElements() {
            return kotlin.collections.a.x(this._sharedElements);
        }

        public Extras(Map<View, String> map) {
            p.j(map, "sharedElements");
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this._sharedElements = linkedHashMap;
            linkedHashMap.putAll(map);
        }
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras) {
        p.j(list, "entries");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<NavBackStackEntry> it = list.iterator();
        while (it.hasNext()) {
            navigate(it.next(), navOptions, extras);
        }
    }

    public FragmentNavigator(Context context, FragmentManager fragmentManager, int i10) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(fragmentManager, "fragmentManager");
        this.context = context;
        this.fragmentManager = fragmentManager;
        this.containerId = i10;
        this.savedIds = new LinkedHashSet();
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this);
    }

    public Fragment instantiateFragment(Context context, FragmentManager fragmentManager, String className, Bundle args) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(fragmentManager, "fragmentManager");
        p.j(className, "className");
        Fragment fragmentInstantiate = fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), className);
        p.i(fragmentInstantiate, "fragmentManager.fragment…t.classLoader, className)");
        return fragmentInstantiate;
    }

    @Override // androidx.navigation.Navigator
    public void onLaunchSingleTop(NavBackStackEntry navBackStackEntry) {
        p.j(navBackStackEntry, "backStackEntry");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        FragmentTransaction fragmentTransactionCreateFragmentTransaction = createFragmentTransaction(navBackStackEntry, null);
        if (getState().getBackStack().getValue().size() > 1) {
            this.fragmentManager.popBackStack(navBackStackEntry.getId(), 1);
            fragmentTransactionCreateFragmentTransaction.addToBackStack(navBackStackEntry.getId());
        }
        fragmentTransactionCreateFragmentTransaction.commit();
        getState().onLaunchSingleTop(navBackStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void onRestoreState(Bundle bundle) {
        p.j(bundle, "savedState");
        ArrayList<String> stringArrayList = bundle.getStringArrayList(KEY_SAVED_IDS);
        if (stringArrayList != null) {
            this.savedIds.clear();
            x.C(this.savedIds, stringArrayList);
        }
    }

    @Override // androidx.navigation.Navigator
    public Bundle onSaveState() {
        if (this.savedIds.isEmpty()) {
            return null;
        }
        return BundleKt.bundleOf(h.a(KEY_SAVED_IDS, new ArrayList(this.savedIds)));
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry navBackStackEntry, boolean z10) {
        p.j(navBackStackEntry, "popUpTo");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        if (z10) {
            List<NavBackStackEntry> value = getState().getBackStack().getValue();
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) b0.f0(value);
            for (NavBackStackEntry navBackStackEntry3 : b0.B0(value.subList(value.indexOf(navBackStackEntry), value.size()))) {
                if (p.e(navBackStackEntry3, navBackStackEntry2)) {
                    Log.i(TAG, "FragmentManager cannot save the state of the initial destination " + navBackStackEntry3);
                } else {
                    this.fragmentManager.saveBackStack(navBackStackEntry3.getId());
                    this.savedIds.add(navBackStackEntry3.getId());
                }
            }
        } else {
            this.fragmentManager.popBackStack(navBackStackEntry.getId(), 1);
        }
        getState().pop(navBackStackEntry, z10);
    }

    private final FragmentTransaction createFragmentTransaction(NavBackStackEntry entry, NavOptions navOptions) {
        int enterAnim;
        int exitAnim;
        int popEnterAnim;
        int popExitAnim;
        Destination destination = (Destination) entry.getDestination();
        Bundle arguments = entry.getArguments();
        String className = destination.getClassName();
        int i10 = 0;
        if (className.charAt(0) == '.') {
            className = this.context.getPackageName() + className;
        }
        Fragment fragmentInstantiate = this.fragmentManager.getFragmentFactory().instantiate(this.context.getClassLoader(), className);
        p.i(fragmentInstantiate, "fragmentManager.fragment…t.classLoader, className)");
        fragmentInstantiate.setArguments(arguments);
        FragmentTransaction fragmentTransactionBeginTransaction = this.fragmentManager.beginTransaction();
        p.i(fragmentTransactionBeginTransaction, "fragmentManager.beginTransaction()");
        if (navOptions != null) {
            enterAnim = navOptions.getEnterAnim();
        } else {
            enterAnim = -1;
        }
        if (navOptions != null) {
            exitAnim = navOptions.getExitAnim();
        } else {
            exitAnim = -1;
        }
        if (navOptions != null) {
            popEnterAnim = navOptions.getPopEnterAnim();
        } else {
            popEnterAnim = -1;
        }
        if (navOptions != null) {
            popExitAnim = navOptions.getPopExitAnim();
        } else {
            popExitAnim = -1;
        }
        if (enterAnim != -1 || exitAnim != -1 || popEnterAnim != -1 || popExitAnim != -1) {
            if (enterAnim == -1) {
                enterAnim = 0;
            }
            if (exitAnim == -1) {
                exitAnim = 0;
            }
            if (popEnterAnim == -1) {
                popEnterAnim = 0;
            }
            if (popExitAnim != -1) {
                i10 = popExitAnim;
            }
            fragmentTransactionBeginTransaction.setCustomAnimations(enterAnim, exitAnim, popEnterAnim, i10);
        }
        fragmentTransactionBeginTransaction.replace(this.containerId, fragmentInstantiate);
        fragmentTransactionBeginTransaction.setPrimaryNavigationFragment(fragmentInstantiate);
        fragmentTransactionBeginTransaction.setReorderingAllowed(true);
        return fragmentTransactionBeginTransaction;
    }

    private final void navigate(NavBackStackEntry navBackStackEntry, NavOptions navOptions, Navigator.Extras extras) {
        boolean zIsEmpty = getState().getBackStack().getValue().isEmpty();
        if (navOptions != null && !zIsEmpty && navOptions.getRestoreState() && this.savedIds.remove(navBackStackEntry.getId())) {
            this.fragmentManager.restoreBackStack(navBackStackEntry.getId());
            getState().push(navBackStackEntry);
            return;
        }
        FragmentTransaction fragmentTransactionCreateFragmentTransaction = createFragmentTransaction(navBackStackEntry, navOptions);
        if (!zIsEmpty) {
            fragmentTransactionCreateFragmentTransaction.addToBackStack(navBackStackEntry.getId());
        }
        if (extras instanceof Extras) {
            for (Map.Entry<View, String> entry : ((Extras) extras).getSharedElements().entrySet()) {
                fragmentTransactionCreateFragmentTransaction.addSharedElement(entry.getKey(), entry.getValue());
            }
        }
        fragmentTransactionCreateFragmentTransaction.commit();
        getState().push(navBackStackEntry);
    }
}
