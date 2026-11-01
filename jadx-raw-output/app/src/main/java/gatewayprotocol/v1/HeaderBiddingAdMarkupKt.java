package gatewayprotocol.v1;

import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;

/* JADX INFO: compiled from: HeaderBiddingAdMarkupKt.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class HeaderBiddingAdMarkupKt {
    public static final HeaderBiddingAdMarkupKt INSTANCE = new HeaderBiddingAdMarkupKt();

    /* JADX INFO: compiled from: HeaderBiddingAdMarkupKt.kt */
    @ProtoDslMarker
    public static final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder _builder;

        /* JADX INFO: compiled from: HeaderBiddingAdMarkupKt.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }

            public final /* synthetic */ Dsl _create(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder) {
                p.j(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        private Dsl(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder) {
            this._builder = builder;
        }

        public /* synthetic */ Dsl(HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.Builder builder, i iVar) {
            this(builder);
        }

        public final /* synthetic */ HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup _build() {
            HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkupBuild = this._builder.build();
            p.i(headerBiddingAdMarkupBuild, "_builder.build()");
            return headerBiddingAdMarkupBuild;
        }

        public final void clearAdData() {
            this._builder.clearAdData();
        }

        public final void clearAdDataVersion() {
            this._builder.clearAdDataVersion();
        }

        public final void clearConfigurationToken() {
            this._builder.clearConfigurationToken();
        }

        public final ByteString getAdData() {
            ByteString adData = this._builder.getAdData();
            p.i(adData, "_builder.getAdData()");
            return adData;
        }

        public final int getAdDataVersion() {
            return this._builder.getAdDataVersion();
        }

        public final ByteString getConfigurationToken() {
            ByteString configurationToken = this._builder.getConfigurationToken();
            p.i(configurationToken, "_builder.getConfigurationToken()");
            return configurationToken;
        }

        public final void setAdData(ByteString byteString) {
            p.j(byteString, "value");
            this._builder.setAdData(byteString);
        }

        public final void setAdDataVersion(int i10) {
            this._builder.setAdDataVersion(i10);
        }

        public final void setConfigurationToken(ByteString byteString) {
            p.j(byteString, "value");
            this._builder.setConfigurationToken(byteString);
        }
    }

    private HeaderBiddingAdMarkupKt() {
    }
}
