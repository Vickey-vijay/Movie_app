package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceProduct;
import io.appmetrica.analytics.ecommerce.ECommerceReferrer;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.el, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4173el extends ECommerceEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final If f56672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final C4673yg f56673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4109c8 f56674c;

    public C4173el(@NonNull ECommerceProduct eCommerceProduct, @Nullable ECommerceReferrer eCommerceReferrer) {
        this(new If(eCommerceProduct), eCommerceReferrer == null ? null : new C4673yg(eCommerceReferrer), new C4199fl());
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown product details info";
    }

    @NonNull
    @VisibleForTesting
    public final InterfaceC4109c8 a() {
        return this.f56674c;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.Lf
    public final List<Ei> toProto() {
        return (List) this.f56674c.fromModel(this);
    }

    public final String toString() {
        return "ShownProductDetailInfoEvent{product=" + this.f56672a + ", referrer=" + this.f56673b + ", converter=" + this.f56674c + '}';
    }

    @VisibleForTesting
    public C4173el(@NonNull If r10, @Nullable C4673yg c4673yg, @NonNull InterfaceC4109c8 interfaceC4109c8) {
        this.f56672a = r10;
        this.f56673b = c4673yg;
        this.f56674c = interfaceC4109c8;
    }
}
