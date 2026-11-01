package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionResolutionStrategy;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;
import io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements LastKnownLocationExtractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f58090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PermissionResolutionStrategy f58091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocationListener f58092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IHandlerExecutor f58093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f58094e = new d();

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractor
    public final void updateLastKnownLocation() {
        IGplLibraryWrapper gplLibraryWrapper;
        if (this.f58091b.hasNecessaryPermissions(this.f58090a)) {
            try {
                d dVar = this.f58094e;
                Context context = this.f58090a;
                LocationListener locationListener = this.f58092c;
                IHandlerExecutor iHandlerExecutor = this.f58093d;
                dVar.getClass();
                if (ReflectionUtils.detectClassExists("com.google.android.gms.location.LocationRequest")) {
                    try {
                        gplLibraryWrapper = new GplLibraryWrapper(context, locationListener, iHandlerExecutor.getLooper(), iHandlerExecutor, TimeUnit.SECONDS.toMillis(1L));
                    } catch (Throwable unused) {
                        gplLibraryWrapper = new a();
                    }
                } else {
                    gplLibraryWrapper = new a();
                }
                gplLibraryWrapper.updateLastKnownLocation();
            } catch (Throwable unused2) {
            }
        }
    }

    public b(Context context, PermissionResolutionStrategy permissionResolutionStrategy, LocationListener locationListener, IHandlerExecutor iHandlerExecutor) {
        this.f58090a = context;
        this.f58091b = permissionResolutionStrategy;
        this.f58092c = locationListener;
        this.f58093d = iHandlerExecutor;
    }
}
