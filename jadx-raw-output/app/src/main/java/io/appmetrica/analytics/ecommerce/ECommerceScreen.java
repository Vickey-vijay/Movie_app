package io.appmetrica.analytics.ecommerce;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class ECommerceScreen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f54810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f54811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f54812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f54813d;

    @Nullable
    public List<String> getCategoriesPath() {
        return this.f54811b;
    }

    @Nullable
    public String getName() {
        return this.f54810a;
    }

    @Nullable
    public Map<String, String> getPayload() {
        return this.f54813d;
    }

    @Nullable
    public String getSearchQuery() {
        return this.f54812c;
    }

    public ECommerceScreen setCategoriesPath(@Nullable List<String> list) {
        this.f54811b = list;
        return this;
    }

    public ECommerceScreen setName(@Nullable String str) {
        this.f54810a = str;
        return this;
    }

    public ECommerceScreen setPayload(@Nullable Map<String, String> map) {
        this.f54813d = map;
        return this;
    }

    public ECommerceScreen setSearchQuery(@Nullable String str) {
        this.f54812c = str;
        return this;
    }

    public String toString() {
        return "ECommerceScreen{name='" + this.f54810a + "', categoriesPath=" + this.f54811b + ", searchQuery='" + this.f54812c + "', payload=" + this.f54813d + '}';
    }
}
