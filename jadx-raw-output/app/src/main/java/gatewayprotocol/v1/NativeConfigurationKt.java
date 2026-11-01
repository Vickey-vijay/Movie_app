package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.google.protobuf.kotlin.ProtoDslMarker;
import java.util.List;

/* JADX INFO: compiled from: NativeConfigurationKt.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class NativeConfigurationKt {
    public static final NativeConfigurationKt INSTANCE = new NativeConfigurationKt();

    /* JADX INFO: compiled from: NativeConfigurationKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.NativeConfiguration.Builder _builder;

        /* JADX INFO: compiled from: NativeConfigurationKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.NativeConfiguration.Builder builder, i iVar) {
            this(builder);
        }

        /* JADX INFO: compiled from: NativeConfigurationKt.kt */
        public static final class AdditionalStorePackagesProxy extends DslProxy {
            private AdditionalStorePackagesProxy() {
            }
        }

        /* JADX INFO: compiled from: NativeConfigurationKt.kt */
        public static final class ObservableAndroidActivitiesProxy extends DslProxy {
            private ObservableAndroidActivitiesProxy() {
            }
        }

        public final /* synthetic */ NativeConfigurationOuterClass.NativeConfiguration _build() {
            NativeConfigurationOuterClass.NativeConfiguration nativeConfigurationBuild = this._builder.build();
            p.i(nativeConfigurationBuild, "_builder.build()");
            return nativeConfigurationBuild;
        }

        public final /* synthetic */ void addAdditionalStorePackages(DslList dslList, String str) {
            p.j(dslList, "<this>");
            p.j(str, "value");
            this._builder.addAdditionalStorePackages(str);
        }

        public final /* synthetic */ void addAllAdditionalStorePackages(DslList dslList, Iterable iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            this._builder.addAllAdditionalStorePackages(iterable);
        }

        public final /* synthetic */ void addAllObservableAndroidActivities(DslList dslList, Iterable iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            this._builder.addAllObservableAndroidActivities(iterable);
        }

        public final /* synthetic */ void addObservableAndroidActivities(DslList dslList, ByteString byteString) {
            p.j(dslList, "<this>");
            p.j(byteString, "value");
            this._builder.addObservableAndroidActivities(byteString);
        }

        public final void clearAdOperations() {
            this._builder.clearAdOperations();
        }

        public final void clearAdPolicy() {
            this._builder.clearAdPolicy();
        }

        public final /* synthetic */ void clearAdditionalStorePackages(DslList dslList) {
            p.j(dslList, "<this>");
            this._builder.clearAdditionalStorePackages();
        }

        public final void clearCachedAssetsConfiguration() {
            this._builder.clearCachedAssetsConfiguration();
        }

        public final void clearCachedWebviewFilesConfiguration() {
            this._builder.clearCachedWebviewFilesConfiguration();
        }

        public final void clearDebugSettings() {
            this._builder.clearDebugSettings();
        }

        public final void clearDefaultShowCompletionState() {
            this._builder.clearDefaultShowCompletionState();
        }

        public final void clearDiagnosticEvents() {
            this._builder.clearDiagnosticEvents();
        }

        public final void clearDownloadPolicy() {
            this._builder.clearDownloadPolicy();
        }

        public final void clearEnableIapEvent() {
            this._builder.clearEnableIapEvent();
        }

        public final void clearEnableOm() {
            this._builder.clearEnableOm();
        }

        public final void clearFeatureFlags() {
            this._builder.clearFeatureFlags();
        }

        public final void clearInitPolicy() {
            this._builder.clearInitPolicy();
        }

        public final void clearMaxExtrasSizeKb() {
            this._builder.clearMaxExtrasSizeKb();
        }

        public final /* synthetic */ void clearObservableAndroidActivities(DslList dslList) {
            p.j(dslList, "<this>");
            this._builder.clearObservableAndroidActivities();
        }

        public final void clearOperativeEventPolicy() {
            this._builder.clearOperativeEventPolicy();
        }

        public final void clearOtherPolicy() {
            this._builder.clearOtherPolicy();
        }

        public final NativeConfigurationOuterClass.AdOperationsConfiguration getAdOperations() {
            NativeConfigurationOuterClass.AdOperationsConfiguration adOperations = this._builder.getAdOperations();
            p.i(adOperations, "_builder.getAdOperations()");
            return adOperations;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getAdPolicy() {
            NativeConfigurationOuterClass.RequestPolicy adPolicy = this._builder.getAdPolicy();
            p.i(adPolicy, "_builder.getAdPolicy()");
            return adPolicy;
        }

        public final DslList<String, AdditionalStorePackagesProxy> getAdditionalStorePackages() {
            List<String> additionalStorePackagesList = this._builder.getAdditionalStorePackagesList();
            p.i(additionalStorePackagesList, "_builder.getAdditionalStorePackagesList()");
            return new DslList<>(additionalStorePackagesList);
        }

        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedAssetsConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration = this._builder.getCachedAssetsConfiguration();
            p.i(cachedAssetsConfiguration, "_builder.getCachedAssetsConfiguration()");
            return cachedAssetsConfiguration;
        }

        public final NativeConfigurationOuterClass.CachedAssetsConfiguration getCachedWebviewFilesConfiguration() {
            NativeConfigurationOuterClass.CachedAssetsConfiguration cachedWebviewFilesConfiguration = this._builder.getCachedWebviewFilesConfiguration();
            p.i(cachedWebviewFilesConfiguration, "_builder.getCachedWebviewFilesConfiguration()");
            return cachedWebviewFilesConfiguration;
        }

        public final NativeConfigurationOuterClass.DebugSettings getDebugSettings() {
            NativeConfigurationOuterClass.DebugSettings debugSettings = this._builder.getDebugSettings();
            p.i(debugSettings, "_builder.getDebugSettings()");
            return debugSettings;
        }

        public final NativeConfigurationOuterClass.ShowCompletionState getDefaultShowCompletionState() {
            NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = this._builder.getDefaultShowCompletionState();
            p.i(defaultShowCompletionState, "_builder.getDefaultShowCompletionState()");
            return defaultShowCompletionState;
        }

        public final int getDefaultShowCompletionStateValue() {
            return this._builder.getDefaultShowCompletionStateValue();
        }

        public final NativeConfigurationOuterClass.DiagnosticEventsConfiguration getDiagnosticEvents() {
            NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this._builder.getDiagnosticEvents();
            p.i(diagnosticEvents, "_builder.getDiagnosticEvents()");
            return diagnosticEvents;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getDownloadPolicy() {
            NativeConfigurationOuterClass.RequestPolicy downloadPolicy = this._builder.getDownloadPolicy();
            p.i(downloadPolicy, "_builder.getDownloadPolicy()");
            return downloadPolicy;
        }

        public final boolean getEnableIapEvent() {
            return this._builder.getEnableIapEvent();
        }

        public final boolean getEnableOm() {
            return this._builder.getEnableOm();
        }

        public final NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
            NativeConfigurationOuterClass.FeatureFlags featureFlags = this._builder.getFeatureFlags();
            p.i(featureFlags, "_builder.getFeatureFlags()");
            return featureFlags;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getInitPolicy() {
            NativeConfigurationOuterClass.RequestPolicy initPolicy = this._builder.getInitPolicy();
            p.i(initPolicy, "_builder.getInitPolicy()");
            return initPolicy;
        }

        public final int getMaxExtrasSizeKb() {
            return this._builder.getMaxExtrasSizeKb();
        }

        public final /* synthetic */ DslList getObservableAndroidActivities() {
            List<ByteString> observableAndroidActivitiesList = this._builder.getObservableAndroidActivitiesList();
            p.i(observableAndroidActivitiesList, "_builder.getObservableAndroidActivitiesList()");
            return new DslList(observableAndroidActivitiesList);
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOperativeEventPolicy() {
            NativeConfigurationOuterClass.RequestPolicy operativeEventPolicy = this._builder.getOperativeEventPolicy();
            p.i(operativeEventPolicy, "_builder.getOperativeEventPolicy()");
            return operativeEventPolicy;
        }

        public final NativeConfigurationOuterClass.RequestPolicy getOtherPolicy() {
            NativeConfigurationOuterClass.RequestPolicy otherPolicy = this._builder.getOtherPolicy();
            p.i(otherPolicy, "_builder.getOtherPolicy()");
            return otherPolicy;
        }

        public final boolean hasAdOperations() {
            return this._builder.hasAdOperations();
        }

        public final boolean hasAdPolicy() {
            return this._builder.hasAdPolicy();
        }

        public final boolean hasCachedAssetsConfiguration() {
            return this._builder.hasCachedAssetsConfiguration();
        }

        public final boolean hasCachedWebviewFilesConfiguration() {
            return this._builder.hasCachedWebviewFilesConfiguration();
        }

        public final boolean hasDebugSettings() {
            return this._builder.hasDebugSettings();
        }

        public final boolean hasDiagnosticEvents() {
            return this._builder.hasDiagnosticEvents();
        }

        public final boolean hasDownloadPolicy() {
            return this._builder.hasDownloadPolicy();
        }

        public final boolean hasFeatureFlags() {
            return this._builder.hasFeatureFlags();
        }

        public final boolean hasInitPolicy() {
            return this._builder.hasInitPolicy();
        }

        public final boolean hasOperativeEventPolicy() {
            return this._builder.hasOperativeEventPolicy();
        }

        public final boolean hasOtherPolicy() {
            return this._builder.hasOtherPolicy();
        }

        public final /* synthetic */ void plusAssignAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, String str) {
            p.j(dslList, "<this>");
            p.j(str, "value");
            addAdditionalStorePackages(dslList, str);
        }

        public final /* synthetic */ void plusAssignAllAdditionalStorePackages(DslList<String, AdditionalStorePackagesProxy> dslList, Iterable<String> iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            addAllAdditionalStorePackages(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignAllObservableAndroidActivities(DslList<ByteString, ObservableAndroidActivitiesProxy> dslList, Iterable<? extends ByteString> iterable) {
            p.j(dslList, "<this>");
            p.j(iterable, "values");
            addAllObservableAndroidActivities(dslList, iterable);
        }

        public final /* synthetic */ void plusAssignObservableAndroidActivities(DslList<ByteString, ObservableAndroidActivitiesProxy> dslList, ByteString byteString) {
            p.j(dslList, "<this>");
            p.j(byteString, "value");
            addObservableAndroidActivities(dslList, byteString);
        }

        public final void setAdOperations(NativeConfigurationOuterClass.AdOperationsConfiguration adOperationsConfiguration) {
            p.j(adOperationsConfiguration, "value");
            this._builder.setAdOperations(adOperationsConfiguration);
        }

        public final void setAdPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            p.j(requestPolicy, "value");
            this._builder.setAdPolicy(requestPolicy);
        }

        public final /* synthetic */ void setAdditionalStorePackages(DslList dslList, int i10, String str) {
            p.j(dslList, "<this>");
            p.j(str, "value");
            this._builder.setAdditionalStorePackages(i10, str);
        }

        public final void setCachedAssetsConfiguration(NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration) {
            p.j(cachedAssetsConfiguration, "value");
            this._builder.setCachedAssetsConfiguration(cachedAssetsConfiguration);
        }

        public final void setCachedWebviewFilesConfiguration(NativeConfigurationOuterClass.CachedAssetsConfiguration cachedAssetsConfiguration) {
            p.j(cachedAssetsConfiguration, "value");
            this._builder.setCachedWebviewFilesConfiguration(cachedAssetsConfiguration);
        }

        public final void setDebugSettings(NativeConfigurationOuterClass.DebugSettings debugSettings) {
            p.j(debugSettings, "value");
            this._builder.setDebugSettings(debugSettings);
        }

        public final void setDefaultShowCompletionState(NativeConfigurationOuterClass.ShowCompletionState showCompletionState) {
            p.j(showCompletionState, "value");
            this._builder.setDefaultShowCompletionState(showCompletionState);
        }

        public final void setDefaultShowCompletionStateValue(int i10) {
            this._builder.setDefaultShowCompletionStateValue(i10);
        }

        public final void setDiagnosticEvents(NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEventsConfiguration) {
            p.j(diagnosticEventsConfiguration, "value");
            this._builder.setDiagnosticEvents(diagnosticEventsConfiguration);
        }

        public final void setDownloadPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            p.j(requestPolicy, "value");
            this._builder.setDownloadPolicy(requestPolicy);
        }

        public final void setEnableIapEvent(boolean z10) {
            this._builder.setEnableIapEvent(z10);
        }

        public final void setEnableOm(boolean z10) {
            this._builder.setEnableOm(z10);
        }

        public final void setFeatureFlags(NativeConfigurationOuterClass.FeatureFlags featureFlags) {
            p.j(featureFlags, "value");
            this._builder.setFeatureFlags(featureFlags);
        }

        public final void setInitPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            p.j(requestPolicy, "value");
            this._builder.setInitPolicy(requestPolicy);
        }

        public final void setMaxExtrasSizeKb(int i10) {
            this._builder.setMaxExtrasSizeKb(i10);
        }

        public final /* synthetic */ void setObservableAndroidActivities(DslList dslList, int i10, ByteString byteString) {
            p.j(dslList, "<this>");
            p.j(byteString, "value");
            this._builder.setObservableAndroidActivities(i10, byteString);
        }

        public final void setOperativeEventPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            p.j(requestPolicy, "value");
            this._builder.setOperativeEventPolicy(requestPolicy);
        }

        public final void setOtherPolicy(NativeConfigurationOuterClass.RequestPolicy requestPolicy) {
            p.j(requestPolicy, "value");
            this._builder.setOtherPolicy(requestPolicy);
        }
    }

    private NativeConfigurationKt() {
    }
}
