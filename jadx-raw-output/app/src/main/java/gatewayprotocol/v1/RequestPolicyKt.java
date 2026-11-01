package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: RequestPolicyKt.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class RequestPolicyKt {
    public static final RequestPolicyKt INSTANCE = new RequestPolicyKt();

    /* JADX INFO: compiled from: RequestPolicyKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final NativeConfigurationOuterClass.RequestPolicy.Builder _builder;

        /* JADX INFO: compiled from: RequestPolicyKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(NativeConfigurationOuterClass.RequestPolicy.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(NativeConfigurationOuterClass.RequestPolicy.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ NativeConfigurationOuterClass.RequestPolicy _build() {
            NativeConfigurationOuterClass.RequestPolicy requestPolicyBuild = this._builder.build();
            p.i(requestPolicyBuild, "_builder.build()");
            return requestPolicyBuild;
        }

        public final void clearRetryPolicy() {
            this._builder.clearRetryPolicy();
        }

        public final void clearTimeoutPolicy() {
            this._builder.clearTimeoutPolicy();
        }

        public final NativeConfigurationOuterClass.RequestRetryPolicy getRetryPolicy() {
            NativeConfigurationOuterClass.RequestRetryPolicy retryPolicy = this._builder.getRetryPolicy();
            p.i(retryPolicy, "_builder.getRetryPolicy()");
            return retryPolicy;
        }

        public final NativeConfigurationOuterClass.RequestTimeoutPolicy getTimeoutPolicy() {
            NativeConfigurationOuterClass.RequestTimeoutPolicy timeoutPolicy = this._builder.getTimeoutPolicy();
            p.i(timeoutPolicy, "_builder.getTimeoutPolicy()");
            return timeoutPolicy;
        }

        public final boolean hasRetryPolicy() {
            return this._builder.hasRetryPolicy();
        }

        public final boolean hasTimeoutPolicy() {
            return this._builder.hasTimeoutPolicy();
        }

        public final void setRetryPolicy(NativeConfigurationOuterClass.RequestRetryPolicy requestRetryPolicy) {
            p.j(requestRetryPolicy, "value");
            this._builder.setRetryPolicy(requestRetryPolicy);
        }

        public final void setTimeoutPolicy(NativeConfigurationOuterClass.RequestTimeoutPolicy requestTimeoutPolicy) {
            p.j(requestTimeoutPolicy, "value");
            this._builder.setTimeoutPolicy(requestTimeoutPolicy);
        }
    }

    private RequestPolicyKt() {
    }
}
