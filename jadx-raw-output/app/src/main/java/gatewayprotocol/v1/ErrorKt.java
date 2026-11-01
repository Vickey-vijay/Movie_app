package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: ErrorKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class ErrorKt {
    public static final ErrorKt INSTANCE = new ErrorKt();

    /* JADX INFO: compiled from: ErrorKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final ErrorOuterClass.Error.Builder _builder;

        /* JADX INFO: compiled from: ErrorKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(ErrorOuterClass.Error.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(ErrorOuterClass.Error.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(ErrorOuterClass.Error.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ ErrorOuterClass.Error _build() {
            ErrorOuterClass.Error errorBuild = this._builder.build();
            p.i(errorBuild, "_builder.build()");
            return errorBuild;
        }

        public final void clearErrorCode() {
            this._builder.clearErrorCode();
        }

        public final void clearErrorText() {
            this._builder.clearErrorText();
        }

        public final void clearErrorToken() {
            this._builder.clearErrorToken();
        }

        public final ErrorOuterClass.PublicErrorCode getErrorCode() {
            ErrorOuterClass.PublicErrorCode errorCode = this._builder.getErrorCode();
            p.i(errorCode, "_builder.getErrorCode()");
            return errorCode;
        }

        public final int getErrorCodeValue() {
            return this._builder.getErrorCodeValue();
        }

        public final String getErrorText() {
            String errorText = this._builder.getErrorText();
            p.i(errorText, "_builder.getErrorText()");
            return errorText;
        }

        public final ByteString getErrorToken() {
            ByteString errorToken = this._builder.getErrorToken();
            p.i(errorToken, "_builder.getErrorToken()");
            return errorToken;
        }

        public final void setErrorCode(ErrorOuterClass.PublicErrorCode publicErrorCode) {
            p.j(publicErrorCode, "value");
            this._builder.setErrorCode(publicErrorCode);
        }

        public final void setErrorCodeValue(int i10) {
            this._builder.setErrorCodeValue(i10);
        }

        public final void setErrorText(String str) {
            p.j(str, "value");
            this._builder.setErrorText(str);
        }

        public final void setErrorToken(ByteString byteString) {
            p.j(byteString, "value");
            this._builder.setErrorToken(byteString);
        }
    }

    private ErrorKt() {
    }
}
