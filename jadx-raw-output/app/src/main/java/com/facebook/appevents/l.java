package com.facebook.appevents;

import kotlin.Metadata;

/* JADX INFO: compiled from: AppEventStore.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007R\u001c\u0010\u000e\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/facebook/appevents/l;", "", "Lcom/facebook/appevents/AccessTokenAppIdPair;", "accessTokenAppIdPair", "Lcom/facebook/appevents/y;", "appEvents", "Lmj/r;", "a", "Lcom/facebook/appevents/c;", "eventsToPersist", "b", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f14254a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TAG = l.class.getName();

    public static final synchronized void a(AccessTokenAppIdPair accessTokenAppIdPair, y yVar) {
        if (i2.a.d(l.class)) {
            return;
        }
        try {
            ck.p.j(accessTokenAppIdPair, "accessTokenAppIdPair");
            ck.p.j(yVar, "appEvents");
            y1.g.b();
            PersistedEvents persistedEventsA = d.a();
            persistedEventsA.addEvents(accessTokenAppIdPair, yVar.d());
            d.b(persistedEventsA);
        } catch (Throwable th2) {
            i2.a.b(th2, l.class);
        }
    }

    public static final synchronized void b(c cVar) {
        if (i2.a.d(l.class)) {
            return;
        }
        try {
            ck.p.j(cVar, "eventsToPersist");
            y1.g.b();
            PersistedEvents persistedEventsA = d.a();
            for (AccessTokenAppIdPair accessTokenAppIdPair : cVar.f()) {
                y yVarC = cVar.c(accessTokenAppIdPair);
                if (yVarC == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                persistedEventsA.addEvents(accessTokenAppIdPair, yVarC.d());
            }
            d.b(persistedEventsA);
        } catch (Throwable th2) {
            i2.a.b(th2, l.class);
        }
    }
}
