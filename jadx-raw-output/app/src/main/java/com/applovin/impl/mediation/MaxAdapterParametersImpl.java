package com.applovin.impl.mediation;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.applovin.impl.d5;
import com.applovin.impl.k3;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f8014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f8015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f8016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f8017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f8018f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f8019g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8020h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f8021i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f8022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f8023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private MaxAdFormat f8024l;

    private MaxAdapterParametersImpl() {
    }

    public static MaxAdapterParametersImpl a(y2 y2Var) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a((k3) y2Var);
        maxAdapterParametersImplA.f8021i = y2Var.R();
        maxAdapterParametersImplA.f8022j = y2Var.D();
        maxAdapterParametersImplA.f8023k = y2Var.C();
        return maxAdapterParametersImplA;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.f8024l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.f8013a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.f8023k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.f8022j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public String getConsentString() {
        return this.f8019g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.f8016d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.f8014b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.f8015c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.f8021i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean hasUserConsent() {
        return this.f8017e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    @Nullable
    public Boolean isDoNotSell() {
        return this.f8018f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.f8020h;
    }

    public static MaxAdapterParametersImpl a(d5 d5Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl maxAdapterParametersImplA = a(d5Var);
        maxAdapterParametersImplA.f8013a = str;
        maxAdapterParametersImplA.f8024l = maxAdFormat;
        return maxAdapterParametersImplA;
    }

    public static MaxAdapterParametersImpl a(k3 k3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.f8013a = k3Var.getAdUnitId();
        maxAdapterParametersImpl.f8017e = k3Var.n();
        maxAdapterParametersImpl.f8018f = k3Var.o();
        maxAdapterParametersImpl.f8019g = k3Var.d();
        maxAdapterParametersImpl.f8014b = k3Var.i();
        maxAdapterParametersImpl.f8015c = k3Var.l();
        maxAdapterParametersImpl.f8016d = k3Var.f();
        maxAdapterParametersImpl.f8020h = k3Var.p();
        return maxAdapterParametersImpl;
    }
}
