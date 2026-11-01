package com.unity3d.ads.core.domain;

import ck.i;
import ck.p;
import com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader;
import gatewayprotocol.v1.TestDataKt;
import gatewayprotocol.v1.TestDataOuterClass;

/* JADX INFO: compiled from: AndroidTestDataInfo.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidTestDataInfo implements GetTestDataInfo {
    public static final Companion Companion = new Companion(null);
    public static final String EXCHANGE_TEST_MODE = "ExchangeTestMode";
    private final AndroidManifestIntPropertyReader androidManifestIntPropertyReader;

    /* JADX INFO: compiled from: AndroidTestDataInfo.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public AndroidTestDataInfo(AndroidManifestIntPropertyReader androidManifestIntPropertyReader) {
        p.j(androidManifestIntPropertyReader, "androidManifestIntPropertyReader");
        this.androidManifestIntPropertyReader = androidManifestIntPropertyReader;
    }

    @Override // com.unity3d.ads.core.domain.GetTestDataInfo
    public TestDataOuterClass.TestData invoke() {
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.Companion;
        TestDataOuterClass.TestData.Builder builderNewBuilder = TestDataOuterClass.TestData.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        TestDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        Integer propertyByName = this.androidManifestIntPropertyReader.getPropertyByName(EXCHANGE_TEST_MODE);
        if (propertyByName != null) {
            dsl_create.setForceExchangeTestMode(propertyByName.intValue());
        }
        TestDataOuterClass.TestData testData_build = dsl_create._build();
        if (testData_build.hasForceExchangeTestMode()) {
            return testData_build;
        }
        return null;
    }
}
