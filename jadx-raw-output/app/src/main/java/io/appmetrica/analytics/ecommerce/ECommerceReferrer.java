package io.appmetrica.analytics.ecommerce;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class ECommerceReferrer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f54807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f54808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ECommerceScreen f54809c;

    @Nullable
    public String getIdentifier() {
        return this.f54808b;
    }

    @Nullable
    public ECommerceScreen getScreen() {
        return this.f54809c;
    }

    @Nullable
    public String getType() {
        return this.f54807a;
    }

    @NonNull
    public ECommerceReferrer setIdentifier(@Nullable String str) {
        this.f54808b = str;
        return this;
    }

    @NonNull
    public ECommerceReferrer setScreen(@Nullable ECommerceScreen eCommerceScreen) {
        this.f54809c = eCommerceScreen;
        return this;
    }

    @NonNull
    public ECommerceReferrer setType(@Nullable String str) {
        this.f54807a = str;
        return this;
    }

    public String toString() {
        return "ECommerceReferrer{type='" + this.f54807a + "', identifier='" + this.f54808b + "', screen=" + this.f54809c + '}';
    }
}
