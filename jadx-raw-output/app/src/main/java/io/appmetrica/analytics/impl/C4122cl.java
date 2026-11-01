package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4122cl extends ECommerceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final If f56529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final C4146dj f56530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4109c8 f56531c;

    public C4122cl(@NonNull ECommerceProduct eCommerceProduct, @NonNull ECommerceScreen eCommerceScreen) {
        this(new If(eCommerceProduct), new C4146dj(eCommerceScreen), new C4148dl());
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product card info";
    }

    @VisibleForTesting
    public C4122cl(@NonNull If r10, @NonNull C4146dj c4146dj, @NonNull InterfaceC4109c8 interfaceC4109c8) {
        this.f56529a = r10;
        this.f56530b = c4146dj;
        this.f56531c = interfaceC4109c8;
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC4109c8 a() {
        return this.f56531c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Lf
    public final List<Ei> toProto() {
        return (List) this.f56531c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductCardInfoEvent{product=" + this.f56529a + ", screen=" + this.f56530b + ", converter=" + this.f56531c + '}';
    }
}
