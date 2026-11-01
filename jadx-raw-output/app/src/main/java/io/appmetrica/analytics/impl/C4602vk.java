package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.modulesapi.internal.service.RemoteConfigMetaInfo;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4602vk implements ModuleRemoteConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SdkIdentifiers f57845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RemoteConfigMetaInfo f57846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f57847c;

    public final C4602vk a(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        return new C4602vk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4602vk)) {
            return false;
        }
        C4602vk c4602vk = (C4602vk) obj;
        return ck.p.e(this.f57845a, c4602vk.f57845a) && ck.p.e(this.f57846b, c4602vk.f57846b) && ck.p.e(this.f57847c, c4602vk.f57847c);
    }

    public final SdkIdentifiers a() {
        return this.f57845a;
    }

    public final RemoteConfigMetaInfo b() {
        return this.f57846b;
    }

    public final Object c() {
        return this.f57847c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final Object getFeaturesConfig() {
        return this.f57847c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f57845a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig
    public final RemoteConfigMetaInfo getRemoteConfigMetaInfo() {
        return this.f57846b;
    }

    public final int hashCode() {
        int iHashCode = (this.f57846b.hashCode() + (this.f57845a.hashCode() * 31)) * 31;
        Object obj = this.f57847c;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ServiceModuleRemoteConfigModel(identifiers=" + this.f57845a + ", remoteConfigMetaInfo=" + this.f57846b + ", featuresConfig=" + this.f57847c + ')';
    }

    public C4602vk(SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj) {
        this.f57845a = sdkIdentifiers;
        this.f57846b = remoteConfigMetaInfo;
        this.f57847c = obj;
    }

    public static C4602vk a(C4602vk c4602vk, SdkIdentifiers sdkIdentifiers, RemoteConfigMetaInfo remoteConfigMetaInfo, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            sdkIdentifiers = c4602vk.f57845a;
        }
        if ((i10 & 2) != 0) {
            remoteConfigMetaInfo = c4602vk.f57846b;
        }
        if ((i10 & 4) != 0) {
            obj = c4602vk.f57847c;
        }
        c4602vk.getClass();
        return new C4602vk(sdkIdentifiers, remoteConfigMetaInfo, obj);
    }
}
