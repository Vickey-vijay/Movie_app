package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: PrivacyUpdateRequestKt.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class PrivacyUpdateRequestKt {
    public static final PrivacyUpdateRequestKt INSTANCE = new PrivacyUpdateRequestKt();

    /* JADX INFO: compiled from: PrivacyUpdateRequestKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder _builder;

        /* JADX INFO: compiled from: PrivacyUpdateRequestKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest _build() {
            PrivacyUpdateRequestOuterClass.PrivacyUpdateRequest privacyUpdateRequestBuild = this._builder.build();
            p.i(privacyUpdateRequestBuild, "_builder.build()");
            return privacyUpdateRequestBuild;
        }

        public final void clearContent() {
            this._builder.clearContent();
        }

        public final void clearVersion() {
            this._builder.clearVersion();
        }

        public final ByteString getContent() {
            ByteString content = this._builder.getContent();
            p.i(content, "_builder.getContent()");
            return content;
        }

        public final int getVersion() {
            return this._builder.getVersion();
        }

        public final void setContent(ByteString byteString) {
            p.j(byteString, "value");
            this._builder.setContent(byteString);
        }

        public final void setVersion(int i10) {
            this._builder.setVersion(i10);
        }
    }

    private PrivacyUpdateRequestKt() {
    }
}
