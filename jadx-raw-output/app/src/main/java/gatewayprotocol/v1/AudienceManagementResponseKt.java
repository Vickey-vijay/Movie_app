package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: AudienceManagementResponseKt.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class AudienceManagementResponseKt {
    public static final AudienceManagementResponseKt INSTANCE = new AudienceManagementResponseKt();

    /* JADX INFO: compiled from: AudienceManagementResponseKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder _builder;

        /* JADX INFO: compiled from: AudienceManagementResponseKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(AudienceManagementResponseOuterClass.AudienceManagementResponse.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ AudienceManagementResponseOuterClass.AudienceManagementResponse _build() {
            AudienceManagementResponseOuterClass.AudienceManagementResponse audienceManagementResponseBuild = this._builder.build();
            p.i(audienceManagementResponseBuild, "_builder.build()");
            return audienceManagementResponseBuild;
        }

        public final void clearAudienceManagementData() {
            this._builder.clearAudienceManagementData();
        }

        public final void clearError() {
            this._builder.clearError();
        }

        public final ByteString getAudienceManagementData() {
            ByteString audienceManagementData = this._builder.getAudienceManagementData();
            p.i(audienceManagementData, "_builder.getAudienceManagementData()");
            return audienceManagementData;
        }

        public final ErrorOuterClass.Error getError() {
            ErrorOuterClass.Error error = this._builder.getError();
            p.i(error, "_builder.getError()");
            return error;
        }

        public final ErrorOuterClass.Error getErrorOrNull(Dsl dsl) {
            p.j(dsl, "<this>");
            return AudienceManagementResponseKtKt.getErrorOrNull(dsl._builder);
        }

        public final boolean hasError() {
            return this._builder.hasError();
        }

        public final void setAudienceManagementData(ByteString byteString) {
            p.j(byteString, "value");
            this._builder.setAudienceManagementData(byteString);
        }

        public final void setError(ErrorOuterClass.Error error) {
            p.j(error, "value");
            this._builder.setError(error);
        }
    }

    private AudienceManagementResponseKt() {
    }
}
