package io.appmetrica.analytics.location.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.locationapi.internal.LocationFilter;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocationFilter f58133a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Location f58136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f58137e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f58135c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimePassedChecker f58134b = new TimePassedChecker();

    public t(LocationFilter locationFilter) {
        this.f58133a = locationFilter;
    }
}
