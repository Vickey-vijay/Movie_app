package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: ClientInfoKt.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ClientInfoKt {
    public static final ClientInfoKt INSTANCE = new ClientInfoKt();

    /* JADX INFO: compiled from: ClientInfoKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ClientInfoOuterClass.ClientInfo.Builder _builder;

        /* JADX INFO: compiled from: ClientInfoKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ClientInfoOuterClass.ClientInfo.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(ClientInfoOuterClass.ClientInfo.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(ClientInfoOuterClass.ClientInfo.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ ClientInfoOuterClass.ClientInfo _build() {
            ClientInfoOuterClass.ClientInfo clientInfoBuild = this._builder.build();
            p.i(clientInfoBuild, "_builder.build()");
            return clientInfoBuild;
        }

        public final void clearAdQualitySdkVersion() {
            this._builder.clearAdQualitySdkVersion();
        }

        public final void clearCustomMediationName() {
            this._builder.clearCustomMediationName();
        }

        public final void clearGameId() {
            this._builder.clearGameId();
        }

        public final void clearIsFidAvailable() {
            this._builder.clearIsFidAvailable();
        }

        public final void clearMediationAdapterVersion() {
            this._builder.clearMediationAdapterVersion();
        }

        public final void clearMediationProvider() {
            this._builder.clearMediationProvider();
        }

        public final void clearMediationVersion() {
            this._builder.clearMediationVersion();
        }

        public final void clearOfferwallVersion() {
            this._builder.clearOfferwallVersion();
        }

        public final void clearOmidPartnerVersion() {
            this._builder.clearOmidPartnerVersion();
        }

        public final void clearOmidVersion() {
            this._builder.clearOmidVersion();
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final void clearScarVersionName() {
            this._builder.clearScarVersionName();
        }

        public final void clearSdkDevelopmentPlatform() {
            this._builder.clearSdkDevelopmentPlatform();
        }

        public final void clearSdkVersion() {
            this._builder.clearSdkVersion();
        }

        public final void clearSdkVersionName() {
            this._builder.clearSdkVersionName();
        }

        public final void clearTest() {
            this._builder.clearTest();
        }

        public final String getAdQualitySdkVersion() {
            String adQualitySdkVersion = this._builder.getAdQualitySdkVersion();
            p.i(adQualitySdkVersion, "_builder.getAdQualitySdkVersion()");
            return adQualitySdkVersion;
        }

        public final String getCustomMediationName() {
            String customMediationName = this._builder.getCustomMediationName();
            p.i(customMediationName, "_builder.getCustomMediationName()");
            return customMediationName;
        }

        public final String getGameId() {
            String gameId = this._builder.getGameId();
            p.i(gameId, "_builder.getGameId()");
            return gameId;
        }

        public final boolean getIsFidAvailable() {
            return this._builder.getIsFidAvailable();
        }

        public final String getMediationAdapterVersion() {
            String mediationAdapterVersion = this._builder.getMediationAdapterVersion();
            p.i(mediationAdapterVersion, "_builder.getMediationAdapterVersion()");
            return mediationAdapterVersion;
        }

        public final ClientInfoOuterClass.MediationProvider getMediationProvider() {
            ClientInfoOuterClass.MediationProvider mediationProvider = this._builder.getMediationProvider();
            p.i(mediationProvider, "_builder.getMediationProvider()");
            return mediationProvider;
        }

        public final int getMediationProviderValue() {
            return this._builder.getMediationProviderValue();
        }

        public final String getMediationVersion() {
            String mediationVersion = this._builder.getMediationVersion();
            p.i(mediationVersion, "_builder.getMediationVersion()");
            return mediationVersion;
        }

        public final String getOfferwallVersion() {
            String offerwallVersion = this._builder.getOfferwallVersion();
            p.i(offerwallVersion, "_builder.getOfferwallVersion()");
            return offerwallVersion;
        }

        public final String getOmidPartnerVersion() {
            String omidPartnerVersion = this._builder.getOmidPartnerVersion();
            p.i(omidPartnerVersion, "_builder.getOmidPartnerVersion()");
            return omidPartnerVersion;
        }

        public final String getOmidVersion() {
            String omidVersion = this._builder.getOmidVersion();
            p.i(omidVersion, "_builder.getOmidVersion()");
            return omidVersion;
        }

        public final ClientInfoOuterClass.Platform getPlatform() {
            ClientInfoOuterClass.Platform platform = this._builder.getPlatform();
            p.i(platform, "_builder.getPlatform()");
            return platform;
        }

        public final int getPlatformValue() {
            return this._builder.getPlatformValue();
        }

        public final String getScarVersionName() {
            String scarVersionName = this._builder.getScarVersionName();
            p.i(scarVersionName, "_builder.getScarVersionName()");
            return scarVersionName;
        }

        public final String getSdkDevelopmentPlatform() {
            String sdkDevelopmentPlatform = this._builder.getSdkDevelopmentPlatform();
            p.i(sdkDevelopmentPlatform, "_builder.getSdkDevelopmentPlatform()");
            return sdkDevelopmentPlatform;
        }

        public final int getSdkVersion() {
            return this._builder.getSdkVersion();
        }

        public final String getSdkVersionName() {
            String sdkVersionName = this._builder.getSdkVersionName();
            p.i(sdkVersionName, "_builder.getSdkVersionName()");
            return sdkVersionName;
        }

        public final boolean getTest() {
            return this._builder.getTest();
        }

        public final boolean hasAdQualitySdkVersion() {
            return this._builder.hasAdQualitySdkVersion();
        }

        public final boolean hasCustomMediationName() {
            return this._builder.hasCustomMediationName();
        }

        public final boolean hasIsFidAvailable() {
            return this._builder.hasIsFidAvailable();
        }

        public final boolean hasMediationAdapterVersion() {
            return this._builder.hasMediationAdapterVersion();
        }

        public final boolean hasMediationVersion() {
            return this._builder.hasMediationVersion();
        }

        public final boolean hasOfferwallVersion() {
            return this._builder.hasOfferwallVersion();
        }

        public final boolean hasOmidPartnerVersion() {
            return this._builder.hasOmidPartnerVersion();
        }

        public final boolean hasOmidVersion() {
            return this._builder.hasOmidVersion();
        }

        public final boolean hasScarVersionName() {
            return this._builder.hasScarVersionName();
        }

        public final boolean hasSdkDevelopmentPlatform() {
            return this._builder.hasSdkDevelopmentPlatform();
        }

        public final void setAdQualitySdkVersion(String str) {
            p.j(str, "value");
            this._builder.setAdQualitySdkVersion(str);
        }

        public final void setCustomMediationName(String str) {
            p.j(str, "value");
            this._builder.setCustomMediationName(str);
        }

        public final void setGameId(String str) {
            p.j(str, "value");
            this._builder.setGameId(str);
        }

        public final void setIsFidAvailable(boolean z10) {
            this._builder.setIsFidAvailable(z10);
        }

        public final void setMediationAdapterVersion(String str) {
            p.j(str, "value");
            this._builder.setMediationAdapterVersion(str);
        }

        public final void setMediationProvider(ClientInfoOuterClass.MediationProvider mediationProvider) {
            p.j(mediationProvider, "value");
            this._builder.setMediationProvider(mediationProvider);
        }

        public final void setMediationProviderValue(int i10) {
            this._builder.setMediationProviderValue(i10);
        }

        public final void setMediationVersion(String str) {
            p.j(str, "value");
            this._builder.setMediationVersion(str);
        }

        public final void setOfferwallVersion(String str) {
            p.j(str, "value");
            this._builder.setOfferwallVersion(str);
        }

        public final void setOmidPartnerVersion(String str) {
            p.j(str, "value");
            this._builder.setOmidPartnerVersion(str);
        }

        public final void setOmidVersion(String str) {
            p.j(str, "value");
            this._builder.setOmidVersion(str);
        }

        public final void setPlatform(ClientInfoOuterClass.Platform platform) {
            p.j(platform, "value");
            this._builder.setPlatform(platform);
        }

        public final void setPlatformValue(int i10) {
            this._builder.setPlatformValue(i10);
        }

        public final void setScarVersionName(String str) {
            p.j(str, "value");
            this._builder.setScarVersionName(str);
        }

        public final void setSdkDevelopmentPlatform(String str) {
            p.j(str, "value");
            this._builder.setSdkDevelopmentPlatform(str);
        }

        public final void setSdkVersion(int i10) {
            this._builder.setSdkVersion(i10);
        }

        public final void setSdkVersionName(String str) {
            p.j(str, "value");
            this._builder.setSdkVersionName(str);
        }

        public final void setTest(boolean z10) {
            this._builder.setTest(z10);
        }
    }

    private ClientInfoKt() {
    }
}
