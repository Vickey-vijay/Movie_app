package androidx.navigation;

import androidx.annotation.IdRes;
import ck.p;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.services.store.gpbl.bridges.billingclient.common.BillingClientBuilderBridgeCommon;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavGraphBuilder.kt */
/* JADX INFO: loaded from: classes2.dex */
@NavDestinationDsl
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cB#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001b\u0010\u001eJ\u001e\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001J\r\u0010\b\u001a\u00020\u0006*\u00020\u0003H\u0086\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "D", "navDestination", "Lmj/r;", "destination", "unaryPlus", "addDestination", BillingClientBuilderBridgeCommon.buildMethodName, "Landroidx/navigation/NavigatorProvider;", IronSourceConstants.EVENTS_PROVIDER, "Landroidx/navigation/NavigatorProvider;", "getProvider", "()Landroidx/navigation/NavigatorProvider;", "", "startDestinationId", "I", "", "startDestinationRoute", "Ljava/lang/String;", "", "destinations", "Ljava/util/List;", "id", "startDestination", "<init>", "(Landroidx/navigation/NavigatorProvider;II)V", "route", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;)V", "navigation-common_release"}, k = 1, mv = {1, 6, 0})
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {
    private final List<NavDestination> destinations;
    private final NavigatorProvider provider;

    @IdRes
    private int startDestinationId;
    private String startDestinationRoute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, @IdRes int i10, @IdRes int i11) {
        super(navigatorProvider.getNavigator(NavGraphNavigator.class), i10);
        p.j(navigatorProvider, IronSourceConstants.EVENTS_PROVIDER);
        this.destinations = new ArrayList();
        this.provider = navigatorProvider;
        this.startDestinationId = i11;
    }

    public final void addDestination(NavDestination navDestination) {
        p.j(navDestination, "destination");
        this.destinations.add(navDestination);
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public NavGraph build() {
        NavGraph navGraph = (NavGraph) super.build();
        navGraph.addDestinations(this.destinations);
        int i10 = this.startDestinationId;
        if (i10 == 0 && this.startDestinationRoute == null) {
            if (getRoute() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.startDestinationRoute;
        if (str != null) {
            p.g(str);
            navGraph.setStartDestination(str);
        } else {
            navGraph.setStartDestination(i10);
        }
        return navGraph;
    }

    public final <D extends NavDestination> void destination(NavDestinationBuilder<? extends D> navDestinationBuilder) {
        p.j(navDestinationBuilder, "navDestination");
        this.destinations.add(navDestinationBuilder.build());
    }

    public final NavigatorProvider getProvider() {
        return this.provider;
    }

    public final void unaryPlus(NavDestination navDestination) {
        p.j(navDestination, "<this>");
        addDestination(navDestination);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider navigatorProvider, String str, String str2) {
        super(navigatorProvider.getNavigator(NavGraphNavigator.class), str2);
        p.j(navigatorProvider, IronSourceConstants.EVENTS_PROVIDER);
        p.j(str, "startDestination");
        this.destinations = new ArrayList();
        this.provider = navigatorProvider;
        this.startDestinationRoute = str;
    }
}
