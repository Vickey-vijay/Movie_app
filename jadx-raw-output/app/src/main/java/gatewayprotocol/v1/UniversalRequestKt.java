package gatewayprotocol.v1;

import bk.l;
import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import mj.r;

/* JADX INFO: compiled from: UniversalRequestKt.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class UniversalRequestKt {
    public static final UniversalRequestKt INSTANCE = new UniversalRequestKt();

    /* JADX INFO: compiled from: UniversalRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final UniversalRequestOuterClass.UniversalRequest.Builder _builder;

        /* JADX INFO: compiled from: UniversalRequestKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest _build() {
            UniversalRequestOuterClass.UniversalRequest universalRequestBuild = this._builder.build();
            p.i(universalRequestBuild, "_builder.build()");
            return universalRequestBuild;
        }

        public final void clearPayload() {
            this._builder.clearPayload();
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        public final UniversalRequestOuterClass.UniversalRequest.Payload getPayload() {
            UniversalRequestOuterClass.UniversalRequest.Payload payload = this._builder.getPayload();
            p.i(payload, "_builder.getPayload()");
            return payload;
        }

        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this._builder.getSharedData();
            p.i(sharedData, "_builder.getSharedData()");
            return sharedData;
        }

        public final boolean hasPayload() {
            return this._builder.hasPayload();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        public final void setPayload(UniversalRequestOuterClass.UniversalRequest.Payload payload) {
            p.j(payload, "value");
            this._builder.setPayload(payload);
        }

        public final void setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            p.j(sharedData, "value");
            this._builder.setSharedData(sharedData);
        }
    }

    /* JADX INFO: compiled from: UniversalRequestKt.kt */
    public static final class PayloadKt {
        public static final PayloadKt INSTANCE = new PayloadKt();

        /* JADX INFO: compiled from: UniversalRequestKt.kt */
        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final UniversalRequestOuterClass.UniversalRequest.Payload.Builder _builder;

            /* JADX INFO: compiled from: UniversalRequestKt.kt */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(i iVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                    p.j(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            private Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder) {
                this._builder = builder;
            }

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.Payload.Builder builder, i iVar) {
                this(builder);
            }

            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.Payload _build() {
                UniversalRequestOuterClass.UniversalRequest.Payload payloadBuild = this._builder.build();
                p.i(payloadBuild, "_builder.build()");
                return payloadBuild;
            }

            public final void clearAdDataRefreshRequest() {
                this._builder.clearAdDataRefreshRequest();
            }

            public final void clearAdPlayerConfigRequest() {
                this._builder.clearAdPlayerConfigRequest();
            }

            public final void clearAdRequest() {
                this._builder.clearAdRequest();
            }

            public final void clearAudienceManagementRequest() {
                this._builder.clearAudienceManagementRequest();
            }

            public final void clearDiagnosticEventRequest() {
                this._builder.clearDiagnosticEventRequest();
            }

            public final void clearGetTokenEventRequest() {
                this._builder.clearGetTokenEventRequest();
            }

            public final void clearInitializationCompletedEventRequest() {
                this._builder.clearInitializationCompletedEventRequest();
            }

            public final void clearInitializationRequest() {
                this._builder.clearInitializationRequest();
            }

            public final void clearOperativeEvent() {
                this._builder.clearOperativeEvent();
            }

            public final void clearPrivacyUpdateRequest() {
                this._builder.clearPrivacyUpdateRequest();
            }

            public final void clearTransactionEventRequest() {
                this._builder.clearTransactionEventRequest();
            }

            public final void clearValue() {
                this._builder.clearValue();
            }

            public final AdDataRefreshRequestOuterClass.AdDataRefreshRequest getAdDataRefreshRequest() {
                AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest = this._builder.getAdDataRefreshRequest();
                p.i(adDataRefreshRequest, "_builder.getAdDataRefreshRequest()");
                return adDataRefreshRequest;
            }

            public final AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest getAdPlayerConfigRequest() {
                AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest = this._builder.getAdPlayerConfigRequest();
                p.i(adPlayerConfigRequest, "_builder.getAdPlayerConfigRequest()");
                return adPlayerConfigRequest;
            }

            public final AdRequestOuterClass.AdRequest getAdRequest() {
                AdRequestOuterClass.AdRequest adRequest = this._builder.getAdRequest();
                p.i(adRequest, "_builder.getAdRequest()");
                return adRequest;
            }

            public final AudienceManagementRequestOuterClass.AudienceManagementRequest getAudienceManagementRequest() {
                AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest = this._builder.getAudienceManagementRequest();
                p.i(audienceManagementRequest, "_builder.getAudienceManagementRequest()");
                return audienceManagementRequest;
            }

            public final DiagnosticEventRequestOuterClass.DiagnosticEventRequest getDiagnosticEventRequest() {
                DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest = this._builder.getDiagnosticEventRequest();
                p.i(diagnosticEventRequest, "_builder.getDiagnosticEventRequest()");
                return diagnosticEventRequest;
            }

            public final GetTokenEventRequestOuterClass.GetTokenEventRequest getGetTokenEventRequest() {
                GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest = this._builder.getGetTokenEventRequest();
                p.i(getTokenEventRequest, "_builder.getGetTokenEventRequest()");
                return getTokenEventRequest;
            }

            public final InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest getInitializationCompletedEventRequest() {
                InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest = this._builder.getInitializationCompletedEventRequest();
                p.i(initializationCompletedEventRequest, "_builder.getInitializationCompletedEventRequest()");
                return initializationCompletedEventRequest;
            }

            public final InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
                InitializationRequestOuterClass.InitializationRequest initializationRequest = this._builder.getInitializationRequest();
                p.i(initializationRequest, "_builder.getInitializationRequest()");
                return initializationRequest;
            }

            public final OperativeEventRequestOuterClass.OperativeEventRequest getOperativeEvent() {
                OperativeEventRequestOuterClass.OperativeEventRequest operativeEvent = this._builder.getOperativeEvent();
                p.i(operativeEvent, "_builder.getOperativeEvent()");
                return operativeEvent;
            }

            public final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest getPrivacyUpdateRequest() {
                PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest = this._builder.getPrivacyUpdateRequest();
                p.i(privacyUpdateRequest, "_builder.getPrivacyUpdateRequest()");
                return privacyUpdateRequest;
            }

            public final TransactionEventRequestOuterClass.TransactionEventRequest getTransactionEventRequest() {
                TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = this._builder.getTransactionEventRequest();
                p.i(transactionEventRequest, "_builder.getTransactionEventRequest()");
                return transactionEventRequest;
            }

            public final UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase getValueCase() {
                UniversalRequestOuterClass.UniversalRequest.Payload.ValueCase valueCase = this._builder.getValueCase();
                p.i(valueCase, "_builder.getValueCase()");
                return valueCase;
            }

            public final boolean hasAdDataRefreshRequest() {
                return this._builder.hasAdDataRefreshRequest();
            }

            public final boolean hasAdPlayerConfigRequest() {
                return this._builder.hasAdPlayerConfigRequest();
            }

            public final boolean hasAdRequest() {
                return this._builder.hasAdRequest();
            }

            public final boolean hasAudienceManagementRequest() {
                return this._builder.hasAudienceManagementRequest();
            }

            public final boolean hasDiagnosticEventRequest() {
                return this._builder.hasDiagnosticEventRequest();
            }

            public final boolean hasGetTokenEventRequest() {
                return this._builder.hasGetTokenEventRequest();
            }

            public final boolean hasInitializationCompletedEventRequest() {
                return this._builder.hasInitializationCompletedEventRequest();
            }

            public final boolean hasInitializationRequest() {
                return this._builder.hasInitializationRequest();
            }

            public final boolean hasOperativeEvent() {
                return this._builder.hasOperativeEvent();
            }

            public final boolean hasPrivacyUpdateRequest() {
                return this._builder.hasPrivacyUpdateRequest();
            }

            public final boolean hasTransactionEventRequest() {
                return this._builder.hasTransactionEventRequest();
            }

            public final void setAdDataRefreshRequest(AdDataRefreshRequestOuterClass.AdDataRefreshRequest adDataRefreshRequest) {
                p.j(adDataRefreshRequest, "value");
                this._builder.setAdDataRefreshRequest(adDataRefreshRequest);
            }

            public final void setAdPlayerConfigRequest(AdPlayerConfigRequestOuterClass.AdPlayerConfigRequest adPlayerConfigRequest) {
                p.j(adPlayerConfigRequest, "value");
                this._builder.setAdPlayerConfigRequest(adPlayerConfigRequest);
            }

            public final void setAdRequest(AdRequestOuterClass.AdRequest adRequest) {
                p.j(adRequest, "value");
                this._builder.setAdRequest(adRequest);
            }

            public final void setAudienceManagementRequest(AudienceManagementRequestOuterClass.AudienceManagementRequest audienceManagementRequest) {
                p.j(audienceManagementRequest, "value");
                this._builder.setAudienceManagementRequest(audienceManagementRequest);
            }

            public final void setDiagnosticEventRequest(DiagnosticEventRequestOuterClass.DiagnosticEventRequest diagnosticEventRequest) {
                p.j(diagnosticEventRequest, "value");
                this._builder.setDiagnosticEventRequest(diagnosticEventRequest);
            }

            public final void setGetTokenEventRequest(GetTokenEventRequestOuterClass.GetTokenEventRequest getTokenEventRequest) {
                p.j(getTokenEventRequest, "value");
                this._builder.setGetTokenEventRequest(getTokenEventRequest);
            }

            public final void setInitializationCompletedEventRequest(InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest) {
                p.j(initializationCompletedEventRequest, "value");
                this._builder.setInitializationCompletedEventRequest(initializationCompletedEventRequest);
            }

            public final void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
                p.j(initializationRequest, "value");
                this._builder.setInitializationRequest(initializationRequest);
            }

            public final void setOperativeEvent(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest) {
                p.j(operativeEventRequest, "value");
                this._builder.setOperativeEvent(operativeEventRequest);
            }

            public final void setPrivacyUpdateRequest(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequest) {
                p.j(privacyUpdateRequest, "value");
                this._builder.setPrivacyUpdateRequest(privacyUpdateRequest);
            }

            public final void setTransactionEventRequest(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest) {
                p.j(transactionEventRequest, "value");
                this._builder.setTransactionEventRequest(transactionEventRequest);
            }
        }

        private PayloadKt() {
        }
    }

    /* JADX INFO: compiled from: UniversalRequestKt.kt */
    public static final class SharedDataKt {
        public static final SharedDataKt INSTANCE = new SharedDataKt();

        /* JADX INFO: compiled from: UniversalRequestKt.kt */
        @ProtoDslMarker
        public static final class Dsl {
            public static final Companion Companion = new Companion(null);
            private final UniversalRequestOuterClass.UniversalRequest.SharedData.Builder _builder;

            /* JADX INFO: compiled from: UniversalRequestKt.kt */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(i iVar) {
                    this();
                }

                public final /* synthetic */ Dsl _create(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                    p.j(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            private Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder) {
                this._builder = builder;
            }

            public /* synthetic */ Dsl(UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builder, i iVar) {
                this(builder);
            }

            public final /* synthetic */ UniversalRequestOuterClass.UniversalRequest.SharedData _build() {
                UniversalRequestOuterClass.UniversalRequest.SharedData sharedDataBuild = this._builder.build();
                p.i(sharedDataBuild, "_builder.build()");
                return sharedDataBuild;
            }

            public final void clearAppStartTime() {
                this._builder.clearAppStartTime();
            }

            public final void clearCurrentState() {
                this._builder.clearCurrentState();
            }

            public final void clearDeveloperConsent() {
                this._builder.clearDeveloperConsent();
            }

            public final void clearLimitedSessionToken() {
                this._builder.clearLimitedSessionToken();
            }

            public final void clearPii() {
                this._builder.clearPii();
            }

            public final void clearSdkStartTime() {
                this._builder.clearSdkStartTime();
            }

            public final void clearSessionToken() {
                this._builder.clearSessionToken();
            }

            public final void clearTestData() {
                this._builder.clearTestData();
            }

            public final void clearTimestamps() {
                this._builder.clearTimestamps();
            }

            public final void clearWebviewVersion() {
                this._builder.clearWebviewVersion();
            }

            public final Timestamp getAppStartTime() {
                Timestamp appStartTime = this._builder.getAppStartTime();
                p.i(appStartTime, "_builder.getAppStartTime()");
                return appStartTime;
            }

            public final ByteString getCurrentState() {
                ByteString currentState = this._builder.getCurrentState();
                p.i(currentState, "_builder.getCurrentState()");
                return currentState;
            }

            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsent() {
                DeveloperConsentOuterClass.DeveloperConsent developerConsent = this._builder.getDeveloperConsent();
                p.i(developerConsent, "_builder.getDeveloperConsent()");
                return developerConsent;
            }

            public final DeveloperConsentOuterClass.DeveloperConsent getDeveloperConsentOrNull(Dsl dsl) {
                p.j(dsl, "<this>");
                return UniversalRequestKtKt.getDeveloperConsentOrNull(dsl._builder);
            }

            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionToken() {
                UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken = this._builder.getLimitedSessionToken();
                p.i(limitedSessionToken, "_builder.getLimitedSessionToken()");
                return limitedSessionToken;
            }

            public final UniversalRequestOuterClass.LimitedSessionToken getLimitedSessionTokenOrNull(Dsl dsl) {
                p.j(dsl, "<this>");
                return UniversalRequestKtKt.getLimitedSessionTokenOrNull(dsl._builder);
            }

            public final PiiOuterClass.Pii getPii() {
                PiiOuterClass.Pii pii = this._builder.getPii();
                p.i(pii, "_builder.getPii()");
                return pii;
            }

            public final PiiOuterClass.Pii getPiiOrNull(Dsl dsl) {
                p.j(dsl, "<this>");
                return UniversalRequestKtKt.getPiiOrNull(dsl._builder);
            }

            public final Timestamp getSdkStartTime() {
                Timestamp sdkStartTime = this._builder.getSdkStartTime();
                p.i(sdkStartTime, "_builder.getSdkStartTime()");
                return sdkStartTime;
            }

            public final ByteString getSessionToken() {
                ByteString sessionToken = this._builder.getSessionToken();
                p.i(sessionToken, "_builder.getSessionToken()");
                return sessionToken;
            }

            public final TestDataOuterClass.TestData getTestData() {
                TestDataOuterClass.TestData testData = this._builder.getTestData();
                p.i(testData, "_builder.getTestData()");
                return testData;
            }

            public final TestDataOuterClass.TestData getTestDataOrNull(Dsl dsl) {
                p.j(dsl, "<this>");
                return UniversalRequestKtKt.getTestDataOrNull(dsl._builder);
            }

            public final TimestampsOuterClass.Timestamps getTimestamps() {
                TimestampsOuterClass.Timestamps timestamps = this._builder.getTimestamps();
                p.i(timestamps, "_builder.getTimestamps()");
                return timestamps;
            }

            public final int getWebviewVersion() {
                return this._builder.getWebviewVersion();
            }

            public final boolean hasAppStartTime() {
                return this._builder.hasAppStartTime();
            }

            public final boolean hasCurrentState() {
                return this._builder.hasCurrentState();
            }

            public final boolean hasDeveloperConsent() {
                return this._builder.hasDeveloperConsent();
            }

            public final boolean hasLimitedSessionToken() {
                return this._builder.hasLimitedSessionToken();
            }

            public final boolean hasPii() {
                return this._builder.hasPii();
            }

            public final boolean hasSdkStartTime() {
                return this._builder.hasSdkStartTime();
            }

            public final boolean hasSessionToken() {
                return this._builder.hasSessionToken();
            }

            public final boolean hasTestData() {
                return this._builder.hasTestData();
            }

            public final boolean hasTimestamps() {
                return this._builder.hasTimestamps();
            }

            public final boolean hasWebviewVersion() {
                return this._builder.hasWebviewVersion();
            }

            public final void setAppStartTime(Timestamp timestamp) {
                p.j(timestamp, "value");
                this._builder.setAppStartTime(timestamp);
            }

            public final void setCurrentState(ByteString byteString) {
                p.j(byteString, "value");
                this._builder.setCurrentState(byteString);
            }

            public final void setDeveloperConsent(DeveloperConsentOuterClass.DeveloperConsent developerConsent) {
                p.j(developerConsent, "value");
                this._builder.setDeveloperConsent(developerConsent);
            }

            public final void setLimitedSessionToken(UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken) {
                p.j(limitedSessionToken, "value");
                this._builder.setLimitedSessionToken(limitedSessionToken);
            }

            public final void setPii(PiiOuterClass.Pii pii) {
                p.j(pii, "value");
                this._builder.setPii(pii);
            }

            public final void setSdkStartTime(Timestamp timestamp) {
                p.j(timestamp, "value");
                this._builder.setSdkStartTime(timestamp);
            }

            public final void setSessionToken(ByteString byteString) {
                p.j(byteString, "value");
                this._builder.setSessionToken(byteString);
            }

            public final void setTestData(TestDataOuterClass.TestData testData) {
                p.j(testData, "value");
                this._builder.setTestData(testData);
            }

            public final void setTimestamps(TimestampsOuterClass.Timestamps timestamps) {
                p.j(timestamps, "value");
                this._builder.setTimestamps(timestamps);
            }

            public final void setWebviewVersion(int i10) {
                this._builder.setWebviewVersion(i10);
            }
        }

        private SharedDataKt() {
        }
    }

    private UniversalRequestKt() {
    }

    /* JADX INFO: renamed from: -initializepayload, reason: not valid java name */
    public final UniversalRequestOuterClass.UniversalRequest.Payload m3449initializepayload(l<? super PayloadKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        PayloadKt.Dsl.Companion companion = PayloadKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    /* JADX INFO: renamed from: -initializesharedData, reason: not valid java name */
    public final UniversalRequestOuterClass.UniversalRequest.SharedData m3450initializesharedData(l<? super SharedDataKt.Dsl, r> lVar) {
        p.j(lVar, "block");
        SharedDataKt.Dsl.Companion companion = SharedDataKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        SharedDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
