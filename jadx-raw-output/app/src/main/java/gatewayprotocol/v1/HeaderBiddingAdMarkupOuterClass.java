package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
public final class HeaderBiddingAdMarkupOuterClass {

    public static final class HeaderBiddingAdMarkup extends GeneratedMessageLite<HeaderBiddingAdMarkup, Builder> implements HeaderBiddingAdMarkupOrBuilder {
        public static final int AD_DATA_FIELD_NUMBER = 1;
        public static final int AD_DATA_VERSION_FIELD_NUMBER = 2;
        public static final int CONFIGURATION_TOKEN_FIELD_NUMBER = 3;
        private static final HeaderBiddingAdMarkup DEFAULT_INSTANCE;
        private static volatile Parser<HeaderBiddingAdMarkup> PARSER;
        private int adDataVersion_;
        private ByteString adData_;
        private ByteString configurationToken_;

        public static final class Builder extends GeneratedMessageLite.Builder<HeaderBiddingAdMarkup, Builder> implements HeaderBiddingAdMarkupOrBuilder {
            public /* synthetic */ Builder(a aVar) {
                this();
            }

            private Builder() {
                super(HeaderBiddingAdMarkup.DEFAULT_INSTANCE);
            }

            @Override // gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkupOrBuilder
            public ByteString getAdData() {
                return ((HeaderBiddingAdMarkup) this.instance).getAdData();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkupOrBuilder
            public int getAdDataVersion() {
                return ((HeaderBiddingAdMarkup) this.instance).getAdDataVersion();
            }

            @Override // gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkupOrBuilder
            public ByteString getConfigurationToken() {
                return ((HeaderBiddingAdMarkup) this.instance).getConfigurationToken();
            }

            public Builder clearAdData() {
                copyOnWrite();
                ((HeaderBiddingAdMarkup) this.instance).clearAdData();
                return this;
            }

            public Builder clearAdDataVersion() {
                copyOnWrite();
                ((HeaderBiddingAdMarkup) this.instance).clearAdDataVersion();
                return this;
            }

            public Builder clearConfigurationToken() {
                copyOnWrite();
                ((HeaderBiddingAdMarkup) this.instance).clearConfigurationToken();
                return this;
            }

            public Builder setAdData(ByteString byteString) {
                copyOnWrite();
                ((HeaderBiddingAdMarkup) this.instance).setAdData(byteString);
                return this;
            }

            public Builder setAdDataVersion(int i10) {
                copyOnWrite();
                ((HeaderBiddingAdMarkup) this.instance).setAdDataVersion(i10);
                return this;
            }

            public Builder setConfigurationToken(ByteString byteString) {
                copyOnWrite();
                ((HeaderBiddingAdMarkup) this.instance).setConfigurationToken(byteString);
                return this;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdDataVersion() {
            this.adDataVersion_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static HeaderBiddingAdMarkup parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        static {
            HeaderBiddingAdMarkup headerBiddingAdMarkup = new HeaderBiddingAdMarkup();
            DEFAULT_INSTANCE = headerBiddingAdMarkup;
            GeneratedMessageLite.registerDefaultInstance(HeaderBiddingAdMarkup.class, headerBiddingAdMarkup);
        }

        public static HeaderBiddingAdMarkup getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(HeaderBiddingAdMarkup headerBiddingAdMarkup) {
            return DEFAULT_INSTANCE.createBuilder(headerBiddingAdMarkup);
        }

        public static HeaderBiddingAdMarkup parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Parser<HeaderBiddingAdMarkup> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdDataVersion(int i10) {
            this.adDataVersion_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f53249a[methodToInvoke.ordinal()]) {
                case 1:
                    return new HeaderBiddingAdMarkup();
                case 2:
                    return new Builder(aVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\n", new Object[]{"adData_", "adDataVersion_", "configurationToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<HeaderBiddingAdMarkup> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (HeaderBiddingAdMarkup.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkupOrBuilder
        public ByteString getAdData() {
            return this.adData_;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkupOrBuilder
        public int getAdDataVersion() {
            return this.adDataVersion_;
        }

        @Override // gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkupOrBuilder
        public ByteString getConfigurationToken() {
            return this.configurationToken_;
        }

        private HeaderBiddingAdMarkup() {
            ByteString byteString = ByteString.EMPTY;
            this.adData_ = byteString;
            this.configurationToken_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdData() {
            this.adData_ = getDefaultInstance().getAdData();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearConfigurationToken() {
            this.configurationToken_ = getDefaultInstance().getConfigurationToken();
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdData(ByteString byteString) {
            byteString.getClass();
            this.adData_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConfigurationToken(ByteString byteString) {
            byteString.getClass();
            this.configurationToken_ = byteString;
        }

        public static HeaderBiddingAdMarkup parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static HeaderBiddingAdMarkup parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static HeaderBiddingAdMarkup parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static HeaderBiddingAdMarkup parseFrom(InputStream inputStream) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static HeaderBiddingAdMarkup parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static HeaderBiddingAdMarkup parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static HeaderBiddingAdMarkup parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (HeaderBiddingAdMarkup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface HeaderBiddingAdMarkupOrBuilder extends MessageLiteOrBuilder {
        ByteString getAdData();

        int getAdDataVersion();

        ByteString getConfigurationToken();
    }

    private HeaderBiddingAdMarkupOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53249a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f53249a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53249a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f53249a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53249a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53249a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53249a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f53249a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }
}
