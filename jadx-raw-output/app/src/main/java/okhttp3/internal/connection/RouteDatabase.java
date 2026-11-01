package okhttp3.internal.connection;

import ck.p;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Route;

/* JADX INFO: compiled from: RouteDatabase.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(Route route) {
        p.j(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(Route route) {
        p.j(route, "failedRoute");
        this.failedRoutes.add(route);
    }

    public final synchronized boolean shouldPostpone(Route route) {
        p.j(route, "route");
        return this.failedRoutes.contains(route);
    }
}
