package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class ECommerceOrder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f54796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f54797c;

    @NonNull
    public List<ECommerceCartItem> getCartItems() {
        return this.f54796b;
    }

    @NonNull
    public String getIdentifier() {
        return this.f54795a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f54797c;
    }

    public ECommerceOrder setPayload(@Nullable Map<String, String> map) {
        this.f54797c = map;
        return this;
    }

    public String toString() {
        return "ECommerceOrder{identifier='" + this.f54795a + "', cartItems=" + this.f54796b + ", payload=" + this.f54797c + '}';
    }

    public ECommerceOrder(@NonNull String str, @NonNull List<ECommerceCartItem> list) {
        this.f54795a = str;
        this.f54796b = list;
    }
}
