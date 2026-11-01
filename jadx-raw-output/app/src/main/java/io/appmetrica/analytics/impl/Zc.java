package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreapi.internal.data.JsonParser;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigExtensionConfiguration;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class Zc implements JsonParser, Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigExtensionConfiguration f56282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ JsonParser f56283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Converter f56284c;

    public final byte[] a(Object obj) {
        return (byte[]) this.f56284c.fromModel(obj);
    }

    public final Object b(JSONObject jSONObject) {
        return this.f56283b.parseOrNull(jSONObject);
    }

    public final Object a(JSONObject jSONObject) {
        return this.f56283b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return (byte[]) this.f56284c.fromModel(obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parse(JSONObject jSONObject) {
        return this.f56283b.parse(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final Object parseOrNull(JSONObject jSONObject) {
        return this.f56283b.parseOrNull(jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return this.f56284c.toModel((byte[]) obj);
    }

    public Zc(RemoteConfigExtensionConfiguration<Object> remoteConfigExtensionConfiguration) {
        this.f56282a = remoteConfigExtensionConfiguration;
        this.f56283b = remoteConfigExtensionConfiguration.getJsonParser();
        this.f56284c = remoteConfigExtensionConfiguration.getProtobufConverter();
    }

    public final Object a(byte[] bArr) {
        return this.f56284c.toModel(bArr);
    }

    public final RemoteConfigExtensionConfiguration<Object> a() {
        return this.f56282a;
    }
}
