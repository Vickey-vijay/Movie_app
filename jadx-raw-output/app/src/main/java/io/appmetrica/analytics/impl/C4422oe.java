package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceOrder;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.oe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4422oe extends ECommerceEvent {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f57433d = 6;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f57434e = 7;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final C4472qe f57436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4109c8 f57437c;

    public C4422oe(int i10, @NonNull ECommerceOrder eCommerceOrder) {
        this(i10, new C4472qe(eCommerceOrder), new C4447pe());
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "order info";
    }

    @VisibleForTesting
    public C4422oe(int i10, @NonNull C4472qe c4472qe, @NonNull InterfaceC4109c8 interfaceC4109c8) {
        this.f57435a = i10;
        this.f57436b = c4472qe;
        this.f57437c = interfaceC4109c8;
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC4109c8 a() {
        return this.f57437c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Lf
    public final List<Ei> toProto() {
        return (List) this.f57437c.fromModel(this);
    }

    public final String toString() {
        return "OrderInfoEvent{eventType=" + this.f57435a + ", order=" + this.f57436b + ", converter=" + this.f57437c + '}';
    }
}
