package com.facebook.appevents;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: AppEventCollection.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/facebook/appevents/c;", "", "Lcom/facebook/appevents/PersistedEvents;", "persistedEvents", "Lmj/r;", "b", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppIdPair", "Lcom/facebook/appevents/AppEvent;", "appEvent", "a", "", InneractiveMediationDefs.GENDER_FEMALE, "Lcom/facebook/appevents/y;", "c", "accessTokenAppId", "e", "Ljava/util/HashMap;", "Ljava/util/HashMap;", "stateMap", "", "d", "()I", "eventCount", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final HashMap<AccessTokenAppIdPair, y> stateMap = new HashMap<>();

    public final synchronized void a(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        ck.p.j(accessTokenAppIdPair, "accessTokenAppIdPair");
        ck.p.j(appEvent, "appEvent");
        y yVarE = e(accessTokenAppIdPair);
        if (yVarE != null) {
            yVarE.a(appEvent);
        }
    }

    public final synchronized void b(PersistedEvents persistedEvents) {
        if (persistedEvents == null) {
            return;
        }
        for (Map.Entry<AccessTokenAppIdPair, List<AppEvent>> entry : persistedEvents.entrySet()) {
            y yVarE = e(entry.getKey());
            if (yVarE != null) {
                Iterator<AppEvent> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    yVarE.a(it.next());
                }
            }
        }
    }

    public final synchronized y c(AccessTokenAppIdPair accessTokenAppIdPair) {
        ck.p.j(accessTokenAppIdPair, "accessTokenAppIdPair");
        return this.stateMap.get(accessTokenAppIdPair);
    }

    public final synchronized int d() {
        int iC;
        iC = 0;
        Iterator<y> it = this.stateMap.values().iterator();
        while (it.hasNext()) {
            iC += it.next().c();
        }
        return iC;
    }

    public final synchronized y e(AccessTokenAppIdPair accessTokenAppId) {
        Context contextL;
        com.facebook.internal.b bVarE;
        y yVar = this.stateMap.get(accessTokenAppId);
        if (yVar == null && (bVarE = com.facebook.internal.b.INSTANCE.e((contextL = q1.t.l()))) != null) {
            yVar = new y(bVarE, AppEventsLogger.INSTANCE.c(contextL));
        }
        if (yVar == null) {
            return null;
        }
        this.stateMap.put(accessTokenAppId, yVar);
        return yVar;
    }

    public final synchronized Set<AccessTokenAppIdPair> f() {
        Set<AccessTokenAppIdPair> setKeySet;
        setKeySet = this.stateMap.keySet();
        ck.p.i(setKeySet, "stateMap.keys");
        return setKeySet;
    }
}
