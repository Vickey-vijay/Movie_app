package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ECommercePrice {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ECommerceAmount f54798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f54799b;

    @NonNull
    public ECommerceAmount getFiat() {
        return this.f54798a;
    }

    @Nullable
    public List<ECommerceAmount> getInternalComponents() {
        return this.f54799b;
    }

    public ECommercePrice setInternalComponents(@Nullable List<ECommerceAmount> list) {
        this.f54799b = list;
        return this;
    }

    public String toString() {
        return "ECommercePrice{fiat=" + this.f54798a + ", internalComponents=" + this.f54799b + '}';
    }

    public ECommercePrice(@NonNull ECommerceAmount eCommerceAmount) {
        this.f54798a = eCommerceAmount;
    }
}
