package com.yandex.varioqub.appmetricaadapter;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3754ve;
import com.yandex.varioqub.analyticadapter.AdapterIdentifiersCallback;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.appmetricaadapter.impl.d;
import com.yandex.varioqub.appmetricaadapter.impl.e;
import com.yandex.varioqub.appmetricaadapter.impl.k;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import nj.b0;
import nj.q0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0007R\u001a\u0010\u0017\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/yandex/varioqub/appmetricaadapter/AppMetricaAdapter;", "Lcom/yandex/varioqub/analyticadapter/VarioqubConfigAdapter;", "Lcom/yandex/varioqub/analyticadapter/AdapterIdentifiersCallback;", "callback", "Lmj/r;", "requestDeviceId", "requestUserId", "", C3754ve.f31473d, "setExperiments", "", "", "triggeredTestIds", "setTriggeredTestIds", "Lcom/yandex/varioqub/analyticadapter/data/ConfigData;", "configData", "reportConfigChanged", "apiKey", "a", "e", "Ljava/lang/String;", "getAdapterName", "()Ljava/lang/String;", "adapterName", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "<init>", "(Landroid/content/Context;)V", InneractiveMediationDefs.GENDER_FEMALE, VastTagName.COMPANION, "appmetrica-adapter_release"}, k = 1, mv = {1, 6, 0})
public final class AppMetricaAdapter implements VarioqubConfigAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f51153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f51154b = e.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f51155c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f51156d = q0.f();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final String adapterName = "AppMetricaAdapter";

    public final void a(String str) {
        this.f51154b.a(this.f51153a, str);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter
    public String getAdapterName() {
        return this.adapterName;
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void reportConfigChanged(ConfigData configData) {
        d dVar = this.f51154b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("old_config", configData.getOldConfigVersion());
        linkedHashMap.put("new_config", configData.getNewConfigVersion());
        linkedHashMap.put("timestamp", Long.valueOf(configData.getConfigLoadTimestamp()));
        dVar.b(linkedHashMap);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public void requestDeviceId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f51154b.c(this.f51153a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigClientIdentifiersProvider
    public void requestUserId(AdapterIdentifiersCallback adapterIdentifiersCallback) {
        this.f51154b.a(this.f51153a, adapterIdentifiersCallback);
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void setExperiments(String str) {
        this.f51155c = str;
        Objects.toString(this.f51156d);
        d dVar = this.f51154b;
        k kVar = new k();
        kVar.f51163a = this.f51155c;
        kVar.f51164b = b0.P0(this.f51156d);
        dVar.a(MessageNano.toByteArray(kVar));
    }

    public AppMetricaAdapter(Context context) {
        this.f51153a = context;
    }

    @Override // com.yandex.varioqub.analyticadapter.VarioqubConfigReporter
    public void setTriggeredTestIds(Set<Long> set) {
        Objects.toString(set);
        Set setT0 = b0.T0(set);
        this.f51156d = setT0;
        Objects.toString(setT0);
        d dVar = this.f51154b;
        k kVar = new k();
        kVar.f51163a = this.f51155c;
        kVar.f51164b = b0.P0(this.f51156d);
        dVar.a(MessageNano.toByteArray(kVar));
    }
}
