package com.applovin.shadow.okhttp3.internal.connection;

import ck.p;
import com.applovin.shadow.okhttp3.Route;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: RouteDatabase.kt */
/* JADX INFO: loaded from: classes3.dex */
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
