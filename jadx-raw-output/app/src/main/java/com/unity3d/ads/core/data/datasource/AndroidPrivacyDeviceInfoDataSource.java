package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import ck.p;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.OpenAdvertisingId;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.PiiKt;
import gatewayprotocol.v1.PiiOuterClass;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.UUID;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import qk.l;
import qk.v;

/* JADX INFO: compiled from: AndroidPrivacyDeviceInfoDataSource.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AndroidPrivacyDeviceInfoDataSource implements PrivacyDeviceInfoDataSource {
    private final AndroidAppSetIdDataSource appSetIdDataSource;
    private final Context context;
    private final FIdDataSource fIdDataSource;
    private final l<Boolean> idfaInitialized;

    public AndroidPrivacyDeviceInfoDataSource(Context context, FIdDataSource fIdDataSource, AndroidAppSetIdDataSource androidAppSetIdDataSource) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(fIdDataSource, "fIdDataSource");
        p.j(androidAppSetIdDataSource, "appSetIdDataSource");
        this.context = context;
        this.fIdDataSource = fIdDataSource;
        this.appSetIdDataSource = androidAppSetIdDataSource;
        this.idfaInitialized = v.a(Boolean.FALSE);
    }

    @Override // com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource
    public PiiOuterClass.Pii fetch(AllowedPiiOuterClass.AllowedPii allowedPii) {
        String appSetId;
        String strInvoke;
        p.j(allowedPii, "allowed");
        if (!this.idfaInitialized.getValue().booleanValue()) {
            this.idfaInitialized.setValue(Boolean.TRUE);
            AdvertisingId.init(this.context);
            OpenAdvertisingId.init(this.context);
        }
        PiiKt.Dsl.Companion companion = PiiKt.Dsl.Companion;
        PiiOuterClass.Pii.Builder builderNewBuilder = PiiOuterClass.Pii.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        final PiiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        if (allowedPii.getIdfa()) {
            String advertisingTrackingId = getAdvertisingTrackingId();
            if (advertisingTrackingId.length() > 0) {
                UUID uuidFromString = UUID.fromString(advertisingTrackingId);
                p.i(uuidFromString, "fromString(adId)");
                dsl_create.setAdvertisingId(ProtobufExtensionsKt.toByteString(uuidFromString));
            }
            String openAdvertisingTrackingId = getOpenAdvertisingTrackingId();
            if (openAdvertisingTrackingId.length() > 0) {
                UUID uuidFromString2 = UUID.fromString(openAdvertisingTrackingId);
                p.i(uuidFromString2, "fromString(openAdId)");
                dsl_create.setOpenAdvertisingTrackingId(ProtobufExtensionsKt.toByteString(uuidFromString2));
            }
        }
        if (allowedPii.getFid() && (strInvoke = this.fIdDataSource.invoke()) != null) {
            if (!(strInvoke.length() > 0)) {
                strInvoke = null;
            }
            if (strInvoke != null) {
                new MutablePropertyReference0Impl(dsl_create) { // from class: com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource$fetch$1$3
                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
                    public Object get() {
                        return ((PiiKt.Dsl) this.receiver).getFid();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0, jk.i
                    public void set(Object obj) {
                        ((PiiKt.Dsl) this.receiver).setFid((String) obj);
                    }
                }.set(strInvoke);
            }
        }
        if (allowedPii.getAppsetId() && (appSetId = this.appSetIdDataSource.getAppSetId()) != null) {
            String str = appSetId.length() > 0 ? appSetId : null;
            if (str != null) {
                new MutablePropertyReference0Impl(dsl_create) { // from class: com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource$fetch$1$6
                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0
                    public Object get() {
                        return ((PiiKt.Dsl) this.receiver).getAppsetId();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.jvm.internal.MutablePropertyReference0, jk.i
                    public void set(Object obj) {
                        ((PiiKt.Dsl) this.receiver).setAppsetId((String) obj);
                    }
                }.set(str);
            }
        }
        return dsl_create._build();
    }

    private final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        if (advertisingTrackingId == null) {
            return "";
        }
        return advertisingTrackingId;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        if (openAdvertisingTrackingId == null) {
            return "";
        }
        return openAdvertisingTrackingId;
    }
}
