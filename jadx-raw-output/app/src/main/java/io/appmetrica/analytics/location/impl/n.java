package io.appmetrica.analytics.location.impl;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements LocationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f58122a;

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i10, Bundle bundle) {
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location != null) {
            p pVar = this.f58122a;
            pVar.getClass();
            String provider = location.getProvider();
            t tVar = (t) pVar.f58128e.get(provider);
            if (tVar == null) {
                t tVar2 = new t(pVar.f58124a.f58101a);
                tVar2.f58135c.add(pVar.f58126c);
                Iterator it = pVar.f58127d.iterator();
                while (it.hasNext()) {
                    tVar2.f58135c.add((Consumer) it.next());
                }
                pVar.f58128e.put(provider, tVar2);
                tVar = tVar2;
            } else {
                tVar.f58133a = pVar.f58124a.f58101a;
            }
            if (tVar.f58136d != null) {
                boolean zDidTimePassMillis = tVar.f58134b.didTimePassMillis(tVar.f58137e, tVar.f58133a.getUpdateTimeInterval(), "isSavedLocationOutdated");
                boolean z10 = true;
                boolean z11 = location.distanceTo(tVar.f58136d) > tVar.f58133a.getUpdateDistanceInterval();
                if (tVar.f58136d != null && location.getTime() - tVar.f58136d.getTime() < 0) {
                    z10 = false;
                }
                if ((!zDidTimePassMillis && !z11) || !z10) {
                    return;
                }
            }
            tVar.f58136d = location;
            tVar.f58137e = System.currentTimeMillis();
            Iterator it2 = tVar.f58135c.iterator();
            while (it2.hasNext()) {
                ((Consumer) it2.next()).consume(location);
            }
        }
    }

    public n(p pVar) {
        this.f58122a = pVar;
    }
}
