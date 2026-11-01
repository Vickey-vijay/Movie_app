package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: RequestUrlOverrideKt.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class RequestUrlOverrideKt {
    public static final RequestUrlOverrideKt INSTANCE = new RequestUrlOverrideKt();

    /* JADX INFO: compiled from: RequestUrlOverrideKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final InitializationResponseOuterClass.RequestUrlOverride.Builder _builder;

        /* JADX INFO: compiled from: RequestUrlOverrideKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(InitializationResponseOuterClass.RequestUrlOverride.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ InitializationResponseOuterClass.RequestUrlOverride _build() {
            InitializationResponseOuterClass.RequestUrlOverride requestUrlOverrideBuild = this._builder.build();
            p.i(requestUrlOverrideBuild, "_builder.build()");
            return requestUrlOverrideBuild;
        }

        public final void clearRequestType() {
            this._builder.clearRequestType();
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }

        public final InitializationResponseOuterClass.RequestType getRequestType() {
            InitializationResponseOuterClass.RequestType requestType = this._builder.getRequestType();
            p.i(requestType, "_builder.getRequestType()");
            return requestType;
        }

        public final int getRequestTypeValue() {
            return this._builder.getRequestTypeValue();
        }

        public final String getUrl() {
            String url = this._builder.getUrl();
            p.i(url, "_builder.getUrl()");
            return url;
        }

        public final void setRequestType(InitializationResponseOuterClass.RequestType requestType) {
            p.j(requestType, "value");
            this._builder.setRequestType(requestType);
        }

        public final void setRequestTypeValue(int i10) {
            this._builder.setRequestTypeValue(i10);
        }

        public final void setUrl(String str) {
            p.j(str, "value");
            this._builder.setUrl(str);
        }
    }

    private RequestUrlOverrideKt() {
    }
}
