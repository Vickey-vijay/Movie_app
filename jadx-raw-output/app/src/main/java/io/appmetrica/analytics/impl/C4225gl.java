package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4225gl extends ECommerceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final C4146dj f56829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC4109c8 f56830b;

    public C4225gl(@NonNull ECommerceScreen eCommerceScreen) {
        this(new C4146dj(eCommerceScreen), new C4251hl());
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @VisibleForTesting
    public C4225gl(@NonNull C4146dj c4146dj, @NonNull InterfaceC4109c8 interfaceC4109c8) {
        this.f56829a = c4146dj;
        this.f56830b = interfaceC4109c8;
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC4109c8 a() {
        return this.f56830b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Lf
    public final List<Ei> toProto() {
        return (List) this.f56830b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f56829a + ", converter=" + this.f56830b + '}';
    }
}
