package androidx.navigation;

import androidx.annotation.IdRes;
import ck.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavGraph.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\n\u001a\u0017\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002\u001a\u0015\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0086\n¨\u0006\u000e"}, d2 = {"Landroidx/navigation/NavGraph;", "", "id", "Landroidx/navigation/NavDestination;", "get", "", "route", "", "contains", "node", "Lmj/r;", "plusAssign", "other", "minusAssign", "navigation-common_release"}, k = 2, mv = {1, 6, 0})
public final class NavGraphKt {
    public static final boolean contains(NavGraph navGraph, @IdRes int i10) {
        p.j(navGraph, "<this>");
        return navGraph.findNode(i10) != null;
    }

    public static final NavDestination get(NavGraph navGraph, @IdRes int i10) {
        p.j(navGraph, "<this>");
        NavDestination navDestinationFindNode = navGraph.findNode(i10);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + i10 + " was found in " + navGraph);
    }

    public static final void plusAssign(NavGraph navGraph, NavDestination navDestination) {
        p.j(navGraph, "<this>");
        p.j(navDestination, "node");
        navGraph.addDestination(navDestination);
    }

    public static final boolean contains(NavGraph navGraph, String str) {
        p.j(navGraph, "<this>");
        p.j(str, "route");
        return navGraph.findNode(str) != null;
    }

    public static final NavDestination get(NavGraph navGraph, String str) {
        p.j(navGraph, "<this>");
        p.j(str, "route");
        NavDestination navDestinationFindNode = navGraph.findNode(str);
        if (navDestinationFindNode != null) {
            return navDestinationFindNode;
        }
        throw new IllegalArgumentException("No destination for " + str + " was found in " + navGraph);
    }

    public static final void minusAssign(NavGraph navGraph, NavDestination navDestination) {
        p.j(navGraph, "<this>");
        p.j(navDestination, "node");
        navGraph.remove(navDestination);
    }

    public static final void plusAssign(NavGraph navGraph, NavGraph navGraph2) {
        p.j(navGraph, "<this>");
        p.j(navGraph2, "other");
        navGraph.addAll(navGraph2);
    }
}
