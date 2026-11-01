package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ECommerceProduct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f54801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f54802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f54803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ECommercePrice f54804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ECommercePrice f54805f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f54806g;

    @Nullable
    public ECommercePrice getActualPrice() {
        return this.f54804e;
    }

    @Nullable
    public List<String> getCategoriesPath() {
        return this.f54802c;
    }

    @Nullable
    public String getName() {
        return this.f54801b;
    }

    @Nullable
    public ECommercePrice getOriginalPrice() {
        return this.f54805f;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f54803d;
    }

    @Nullable
    public List<String> getPromocodes() {
        return this.f54806g;
    }

    @NonNull
    public String getSku() {
        return this.f54800a;
    }

    @NonNull
    public ECommerceProduct setActualPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f54804e = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setCategoriesPath(@Nullable List<String> list) {
        this.f54802c = list;
        return this;
    }

    @NonNull
    public ECommerceProduct setName(@Nullable String str) {
        this.f54801b = str;
        return this;
    }

    @NonNull
    public ECommerceProduct setOriginalPrice(@Nullable ECommercePrice eCommercePrice) {
        this.f54805f = eCommercePrice;
        return this;
    }

    @NonNull
    public ECommerceProduct setPayload(@Nullable Map<String, String> map) {
        this.f54803d = map;
        return this;
    }

    @NonNull
    public ECommerceProduct setPromocodes(@Nullable List<String> list) {
        this.f54806g = list;
        return this;
    }

    public String toString() {
        return "ECommerceProduct{sku='" + this.f54800a + "', name='" + this.f54801b + "', categoriesPath=" + this.f54802c + ", payload=" + this.f54803d + ", actualPrice=" + this.f54804e + ", originalPrice=" + this.f54805f + ", promocodes=" + this.f54806g + '}';
    }

    public ECommerceProduct(@NonNull String str) {
        this.f54800a = str;
    }
}
