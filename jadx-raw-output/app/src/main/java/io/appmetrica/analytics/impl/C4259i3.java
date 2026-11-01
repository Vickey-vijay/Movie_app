package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceCartItem;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4259i3 extends ECommerceEvent {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f56938d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f56939e = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final C4336l3 f56941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4109c8 f56942c;

    public C4259i3(int i10, @NonNull ECommerceCartItem eCommerceCartItem) {
        this(i10, new C4336l3(eCommerceCartItem), new C4284j3());
    }

    @VisibleForTesting
    public C4259i3(int i10, @NonNull C4336l3 c4336l3, @NonNull InterfaceC4109c8 interfaceC4109c8) {
        this.f56940a = i10;
        this.f56941b = c4336l3;
        this.f56942c = interfaceC4109c8;
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC4109c8 a() {
        return this.f56942c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        int i10 = this.f56940a;
        if (i10 != 4) {
            return i10 != 5 ? "unknown cart action info" : "remove cart item info";
        }
        return "add cart item info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Lf
    public final List<Ei> toProto() {
        return (List) this.f56942c.fromModel(this);
    }

    @NonNull
    public final String toString() {
        return "CartActionInfoEvent{eventType=" + this.f56940a + ", cartItem=" + this.f56941b + ", converter=" + this.f56942c + '}';
    }
}
