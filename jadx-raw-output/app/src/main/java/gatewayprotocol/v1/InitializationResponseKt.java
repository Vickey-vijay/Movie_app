package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslMap;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import com.ironsource.C3426d4;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: InitializationResponseKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class InitializationResponseKt {
    public static final InitializationResponseKt INSTANCE = new InitializationResponseKt();

    /* JADX INFO: compiled from: InitializationResponseKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationResponseOuterClass.InitializationResponse.Builder _builder;

        /* JADX INFO: compiled from: InitializationResponseKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.InitializationResponse.Builder builder, i iVar) {
            this(builder);
        }

        /* JADX INFO: compiled from: InitializationResponseKt.kt */
        public static final class RequestUrlOverridesProxy extends DslProxy {
            private RequestUrlOverridesProxy() {
            }
        }

        /* JADX INFO: compiled from: InitializationResponseKt.kt */
        public static final class ScarEligibleFormatsProxy extends DslProxy {
            private ScarEligibleFormatsProxy() {
            }
        }

        /* JADX INFO: compiled from: InitializationResponseKt.kt */
        public static final class ScarPlacementsProxy extends DslProxy {
            private ScarPlacementsProxy() {
            }
        }

        public final /* synthetic */ InitializationResponseOuterClass.InitializationResponse _build() {
            InitializationResponseOuterClass.InitializationResponse initializationResponseBuild = this._builder.build();
            p.i(initializationResponseBuild, "_builder.build()");
            return initializationResponseBuild;
        }

        public final /* synthetic */ void addAllRequestUrlOverrides(DslList dslList, Iterable iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            this._builder.addAllRequestUrlOverrides(iterable);
        }

        public final /* synthetic */ void addAllScarEligibleFormats(DslList dslList, Iterable iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            this._builder.addAllScarEligibleFormats(iterable);
        }

        public final /* synthetic */ void addRequestUrlOverrides(DslList dslList, InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride) {
            p.j(dslList, "<this>");
            p.j(requestUrlOverride, "value");
            this._builder.addRequestUrlOverrides(requestUrlOverride);
        }

        public final /* synthetic */ void addScarEligibleFormats(DslList dslList, AdFormatOuterClass.AdFormat adFormat) {
            p.j(dslList, "<this>");
            p.j(adFormat, "value");
            this._builder.addScarEligibleFormats(adFormat);
        }

        public final void clearCountOfLastShownCampaigns() {
            this._builder.clearCountOfLastShownCampaigns();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final void clearNativeConfiguration() {
            this._builder.clearNativeConfiguration();
        }

        public final /* synthetic */ void clearRequestUrlOverrides(DslList dslList) {
            p.j(dslList, "<this>");
            this._builder.clearRequestUrlOverrides();
        }

        public final /* synthetic */ void clearScarEligibleFormats(DslList dslList) {
            p.j(dslList, "<this>");
            this._builder.clearScarEligibleFormats();
        }

        public final /* synthetic */ void clearScarPlacements(DslMap dslMap) {
            p.j(dslMap, "<this>");
            this._builder.clearScarPlacements();
        }

        public final void clearTriggerInitializationCompletedRequest() {
            this._builder.clearTriggerInitializationCompletedRequest();
        }

        public final void clearUniversalRequestUrl() {
            this._builder.clearUniversalRequestUrl();
        }

        public final int getCountOfLastShownCampaigns() {
            return this._builder.getCountOfLastShownCampaigns();
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            p.i(error, "_builder.getError()");
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            p.j(dsl, "<this>");
            return InitializationResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = this._builder.getNativeConfiguration();
            p.i(nativeConfiguration, "_builder.getNativeConfiguration()");
            return nativeConfiguration;
        }

        public final /* synthetic */ DslList getRequestUrlOverrides() {
            List<InitializationResponseOuterClass.RequestUrlOverride> requestUrlOverridesList = this._builder.getRequestUrlOverridesList();
            p.i(requestUrlOverridesList, "_builder.getRequestUrlOverridesList()");
            return new DslList(requestUrlOverridesList);
        }

        public final /* synthetic */ DslList getScarEligibleFormats() {
            List<AdFormatOuterClass.AdFormat> scarEligibleFormatsList = this._builder.getScarEligibleFormatsList();
            p.i(scarEligibleFormatsList, "_builder.getScarEligibleFormatsList()");
            return new DslList(scarEligibleFormatsList);
        }

        public final /* synthetic */ DslMap getScarPlacementsMap() {
            Map<String, InitializationResponseOuterClass.Placement> scarPlacementsMap = this._builder.getScarPlacementsMap();
            p.i(scarPlacementsMap, "_builder.getScarPlacementsMap()");
            return new DslMap(scarPlacementsMap);
        }

        public final boolean getTriggerInitializationCompletedRequest() {
            return this._builder.getTriggerInitializationCompletedRequest();
        }

        public final String getUniversalRequestUrl() {
            String universalRequestUrl = this._builder.getUniversalRequestUrl();
            p.i(universalRequestUrl, "_builder.getUniversalRequestUrl()");
            return universalRequestUrl;
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final boolean hasNativeConfiguration() {
            return this._builder.hasNativeConfiguration();
        }

        public final boolean hasUniversalRequestUrl() {
            return this._builder.hasUniversalRequestUrl();
        }

        public final /* synthetic */ void plusAssignAllRequestUrlOverrides(DslList<InitializationResponseOuterClass.RequestUrlOverride, RequestUrlOverridesProxy> dslList, Iterable<InitializationResponseOuterClass.RequestUrlOverride> iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            addAllRequestUrlOverrides(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllScarEligibleFormats(DslList<AdFormatOuterClass.AdFormat, ScarEligibleFormatsProxy> dslList, Iterable<? extends AdFormatOuterClass.AdFormat> iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            addAllScarEligibleFormats(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignRequestUrlOverrides(DslList<InitializationResponseOuterClass.RequestUrlOverride, RequestUrlOverridesProxy> dslList, InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride) {
            p.j(dslList, "<this>");
            p.j(requestUrlOverride, "value");
            addRequestUrlOverrides(dslList, requestUrlOverride);
        }

        public final /* synthetic */ void plusAssignScarEligibleFormats(DslList<AdFormatOuterClass.AdFormat, ScarEligibleFormatsProxy> dslList, AdFormatOuterClass.AdFormat adFormat) {
            p.j(dslList, "<this>");
            p.j(adFormat, "value");
            addScarEligibleFormats(dslList, adFormat);
        }

        public final /* synthetic */ void putAllScarPlacements(DslMap dslMap, Map map) {
            p.j(dslMap, "<this>");
            p.j(map, "map");
            this._builder.putAllScarPlacements(map);
        }

        public final void putScarPlacements(DslMap<String, InitializationResponseOuterClass.Placement, ScarPlacementsProxy> dslMap, String str, InitializationResponseOuterClass.Placement placement) {
            p.j(dslMap, "<this>");
            p.j(str, C3426d4.i.W);
            p.j(placement, "value");
            this._builder.putScarPlacements(str, placement);
        }

        public final /* synthetic */ void removeScarPlacements(DslMap dslMap, String str) {
            p.j(dslMap, "<this>");
            p.j(str, C3426d4.i.W);
            this._builder.removeScarPlacements(str);
        }

        public final void setCountOfLastShownCampaigns(int i10) {
            this._builder.setCountOfLastShownCampaigns(i10);
        }

        public final void setError(ErrorOuterClass.Error error) {
            p.j(error, "value");
            this._builder.setError(error);
        }

        public final void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
            p.j(nativeConfiguration, "value");
            this._builder.setNativeConfiguration(nativeConfiguration);
        }

        public final /* synthetic */ void setRequestUrlOverrides(DslList dslList, int i10, InitializationResponseOuterClass.RequestUrlOverride requestUrlOverride) {
            p.j(dslList, "<this>");
            p.j(requestUrlOverride, "value");
            this._builder.setRequestUrlOverrides(i10, requestUrlOverride);
        }

        public final /* synthetic */ void setScarEligibleFormats(DslList dslList, int i10, AdFormatOuterClass.AdFormat adFormat) {
            p.j(dslList, "<this>");
            p.j(adFormat, "value");
            this._builder.setScarEligibleFormats(i10, adFormat);
        }

        public final /* synthetic */ void setScarPlacements(DslMap<String, InitializationResponseOuterClass.Placement, ScarPlacementsProxy> dslMap, String str, InitializationResponseOuterClass.Placement placement) {
            p.j(dslMap, "<this>");
            p.j(str, C3426d4.i.W);
            p.j(placement, "value");
            putScarPlacements(dslMap, str, placement);
        }

        public final void setTriggerInitializationCompletedRequest(boolean z10) {
            this._builder.setTriggerInitializationCompletedRequest(z10);
        }

        public final void setUniversalRequestUrl(String str) {
            p.j(str, "value");
            this._builder.setUniversalRequestUrl(str);
        }
    }

    private InitializationResponseKt() {
    }
}
