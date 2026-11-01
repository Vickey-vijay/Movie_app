package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: InitializationDataKt.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class InitializationDataKt {
    public static final InitializationDataKt INSTANCE = new InitializationDataKt();

    /* JADX INFO: compiled from: InitializationDataKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationDataOuterClass.InitializationData.Builder _builder;

        /* JADX INFO: compiled from: InitializationDataKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationDataOuterClass.InitializationData.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(InitializationDataOuterClass.InitializationData.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(InitializationDataOuterClass.InitializationData.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationDataOuterClass.InitializationData _build() {
            InitializationDataOuterClass.InitializationData initializationDataBuild = this._builder.build();
            p.i(initializationDataBuild, "_builder.build()");
            return initializationDataBuild;
        }

        public final void clearInitializationRequest() {
            this._builder.clearInitializationRequest();
        }

        public final void clearSharedData() {
            this._builder.clearSharedData();
        }

        public final InitializationRequestOuterClass.InitializationRequest getInitializationRequest() {
            InitializationRequestOuterClass.InitializationRequest initializationRequest = this._builder.getInitializationRequest();
            p.i(initializationRequest, "_builder.getInitializationRequest()");
            return initializationRequest;
        }

        public final InitializationRequestOuterClass.InitializationRequest getInitializationRequestOrNull(Dsl dsl) {
            p.j(dsl, "<this>");
            return InitializationDataKtKt.getInitializationRequestOrNull(dsl._builder);
        }

        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedData() {
            UniversalRequestOuterClass.UniversalRequest.SharedData sharedData = this._builder.getSharedData();
            p.i(sharedData, "_builder.getSharedData()");
            return sharedData;
        }

        public final UniversalRequestOuterClass.UniversalRequest.SharedData getSharedDataOrNull(Dsl dsl) {
            p.j(dsl, "<this>");
            return InitializationDataKtKt.getSharedDataOrNull(dsl._builder);
        }

        public final boolean hasInitializationRequest() {
            return this._builder.hasInitializationRequest();
        }

        public final boolean hasSharedData() {
            return this._builder.hasSharedData();
        }

        public final void setInitializationRequest(InitializationRequestOuterClass.InitializationRequest initializationRequest) {
            p.j(initializationRequest, "value");
            this._builder.setInitializationRequest(initializationRequest);
        }

        public final void setSharedData(UniversalRequestOuterClass.UniversalRequest.SharedData sharedData) {
            p.j(sharedData, "value");
            this._builder.setSharedData(sharedData);
        }
    }

    private InitializationDataKt() {
    }
}
