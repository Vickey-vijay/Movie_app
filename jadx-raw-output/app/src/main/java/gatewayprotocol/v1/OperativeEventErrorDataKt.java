package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: OperativeEventErrorDataKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class OperativeEventErrorDataKt {
    public static final OperativeEventErrorDataKt INSTANCE = new OperativeEventErrorDataKt();

    /* JADX INFO: compiled from: OperativeEventErrorDataKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final OperativeEventRequestOuterClass.OperativeEventErrorData.Builder _builder;

        /* JADX INFO: compiled from: OperativeEventErrorDataKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ OperativeEventRequestOuterClass.OperativeEventErrorData _build() {
            OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorDataBuild = this._builder.build();
            p.i(operativeEventErrorDataBuild, "_builder.build()");
            return operativeEventErrorDataBuild;
        }

        public final void clearErrorToken() {
            this._builder.clearErrorToken();
        }

        public final void clearErrorType() {
            this._builder.clearErrorType();
        }

        public final void clearMessage() {
            this._builder.clearMessage();
        }

        public final ByteString getErrorToken() {
            ByteString errorToken = this._builder.getErrorToken();
            p.i(errorToken, "_builder.getErrorToken()");
            return errorToken;
        }

        public final OperativeEventRequestOuterClass.OperativeEventErrorType getErrorType() {
            OperativeEventRequestOuterClass.OperativeEventErrorType errorType = this._builder.getErrorType();
            p.i(errorType, "_builder.getErrorType()");
            return errorType;
        }

        public final int getErrorTypeValue() {
            return this._builder.getErrorTypeValue();
        }

        public final String getMessage() {
            String message = this._builder.getMessage();
            p.i(message, "_builder.getMessage()");
            return message;
        }

        public final boolean hasErrorToken() {
            return this._builder.hasErrorToken();
        }

        public final void setErrorToken(ByteString byteString) {
            p.j(byteString, "value");
            this._builder.setErrorToken(byteString);
        }

        public final void setErrorType(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType) {
            p.j(operativeEventErrorType, "value");
            this._builder.setErrorType(operativeEventErrorType);
        }

        public final void setErrorTypeValue(int i10) {
            this._builder.setErrorTypeValue(i10);
        }

        public final void setMessage(String str) {
            p.j(str, "value");
            this._builder.setMessage(str);
        }
    }

    private OperativeEventErrorDataKt() {
    }
}
