package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: TestDataKt.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class TestDataKt {
    public static final TestDataKt INSTANCE = new TestDataKt();

    /* JADX INFO: compiled from: TestDataKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TestDataOuterClass.TestData.Builder _builder;

        /* JADX INFO: compiled from: TestDataKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(TestDataOuterClass.TestData.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(TestDataOuterClass.TestData.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(TestDataOuterClass.TestData.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ TestDataOuterClass.TestData _build() {
            TestDataOuterClass.TestData testDataBuild = this._builder.build();
            p.i(testDataBuild, "_builder.build()");
            return testDataBuild;
        }

        public final void clearForceCampaignId() {
            this._builder.clearForceCampaignId();
        }

        public final void clearForceCountry() {
            this._builder.clearForceCountry();
        }

        public final void clearForceCountrySubdivision() {
            this._builder.clearForceCountrySubdivision();
        }

        public final void clearForceExchangeTestMode() {
            this._builder.clearForceExchangeTestMode();
        }

        public final String getForceCampaignId() {
            String forceCampaignId = this._builder.getForceCampaignId();
            p.i(forceCampaignId, "_builder.getForceCampaignId()");
            return forceCampaignId;
        }

        public final String getForceCountry() {
            String forceCountry = this._builder.getForceCountry();
            p.i(forceCountry, "_builder.getForceCountry()");
            return forceCountry;
        }

        public final String getForceCountrySubdivision() {
            String forceCountrySubdivision = this._builder.getForceCountrySubdivision();
            p.i(forceCountrySubdivision, "_builder.getForceCountrySubdivision()");
            return forceCountrySubdivision;
        }

        public final int getForceExchangeTestMode() {
            return this._builder.getForceExchangeTestMode();
        }

        public final boolean hasForceCampaignId() {
            return this._builder.hasForceCampaignId();
        }

        public final boolean hasForceCountry() {
            return this._builder.hasForceCountry();
        }

        public final boolean hasForceCountrySubdivision() {
            return this._builder.hasForceCountrySubdivision();
        }

        public final boolean hasForceExchangeTestMode() {
            return this._builder.hasForceExchangeTestMode();
        }

        public final void setForceCampaignId(String str) {
            p.j(str, "value");
            this._builder.setForceCampaignId(str);
        }

        public final void setForceCountry(String str) {
            p.j(str, "value");
            this._builder.setForceCountry(str);
        }

        public final void setForceCountrySubdivision(String str) {
            p.j(str, "value");
            this._builder.setForceCountrySubdivision(str);
        }

        public final void setForceExchangeTestMode(int i10) {
            this._builder.setForceExchangeTestMode(i10);
        }
    }

    private TestDataKt() {
    }
}
