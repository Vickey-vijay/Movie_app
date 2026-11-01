package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationState;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateObserver;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4232h2 implements InterfaceC4378mk, ApplicationStateProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f56871a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f56872b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile ApplicationState f56873c = ApplicationState.UNKNOWN;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f56874d = new CopyOnWriteArraySet();

    public final void a(int i10) {
        this.f56871a.remove(Integer.valueOf(i10));
        a();
    }

    public final void b(int i10) {
        this.f56872b.add(Integer.valueOf(i10));
        this.f56871a.remove(Integer.valueOf(i10));
        a();
    }

    public final void c(int i10) {
        this.f56871a.add(Integer.valueOf(i10));
        this.f56872b.remove(Integer.valueOf(i10));
        a();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState getCurrentState() {
        return this.f56873c;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4378mk
    public final void onDestroy() {
        if (this.f56873c == ApplicationState.VISIBLE) {
            this.f56873c = ApplicationState.BACKGROUND;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate.ApplicationStateProvider
    @NonNull
    public final ApplicationState registerStickyObserver(@Nullable ApplicationStateObserver applicationStateObserver) {
        if (applicationStateObserver != null) {
            this.f56874d.add(applicationStateObserver);
        }
        return this.f56873c;
    }

    public final void a() {
        ApplicationState applicationState = ApplicationState.UNKNOWN;
        if (!this.f56871a.isEmpty()) {
            applicationState = ApplicationState.VISIBLE;
        } else if (!this.f56872b.isEmpty()) {
            applicationState = ApplicationState.BACKGROUND;
        }
        if (this.f56873c != applicationState) {
            this.f56873c = applicationState;
            Iterator it = this.f56874d.iterator();
            while (it.hasNext()) {
                ((ApplicationStateObserver) it.next()).onApplicationStateChanged(this.f56873c);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4378mk
    public final void onCreate() {
        a();
    }
}
