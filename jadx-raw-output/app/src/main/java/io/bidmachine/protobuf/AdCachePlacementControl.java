package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class AdCachePlacementControl extends GeneratedMessageV3 implements AdCachePlacementControlOrBuilder {
    public static final int MAX_AGE_FIELD_NUMBER = 3;
    public static final int MAX_CACHE_SIZE_FIELD_NUMBER = 2;
    public static final int MAX_RETAIN_COUNT_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int maxAge_;
    private int maxCacheSize_;
    private int maxRetainCount_;
    private byte memoizedIsInitialized;
    private static final AdCachePlacementControl DEFAULT_INSTANCE = new AdCachePlacementControl();
    private static final Parser<AdCachePlacementControl> PARSER = new AbstractParser<AdCachePlacementControl>() { // from class: io.bidmachine.protobuf.AdCachePlacementControl.1
        @Override // com.explorestack.protobuf.Parser
        public AdCachePlacementControl parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AdCachePlacementControl(codedInputStream, extensionRegistryLite);
        }
    };

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdCachePlacementControlOrBuilder {
        private int maxAge_;
        private int maxCacheSize_;
        private int maxRetainCount_;

        public Builder clearMaxAge() {
            this.maxAge_ = 0;
            onChanged();
            return this;
        }

        public Builder clearMaxCacheSize() {
            this.maxCacheSize_ = 0;
            onChanged();
            return this;
        }

        public Builder clearMaxRetainCount() {
            this.maxRetainCount_ = 0;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return InitProto.internal_static_bidmachine_protobuf_AdCachePlacementControl_descriptor;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return InitProto.internal_static_bidmachine_protobuf_AdCachePlacementControl_descriptor;
        }

        @Override // io.bidmachine.protobuf.AdCachePlacementControlOrBuilder
        public int getMaxAge() {
            return this.maxAge_;
        }

        @Override // io.bidmachine.protobuf.AdCachePlacementControlOrBuilder
        public int getMaxCacheSize() {
            return this.maxCacheSize_;
        }

        @Override // io.bidmachine.protobuf.AdCachePlacementControlOrBuilder
        public int getMaxRetainCount() {
            return this.maxRetainCount_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return InitProto.internal_static_bidmachine_protobuf_AdCachePlacementControl_fieldAccessorTable.ensureFieldAccessorsInitialized(AdCachePlacementControl.class, Builder.class);
        }

        public Builder setMaxAge(int i10) {
            this.maxAge_ = i10;
            onChanged();
            return this;
        }

        public Builder setMaxCacheSize(int i10) {
            this.maxCacheSize_ = i10;
            onChanged();
            return this;
        }

        public Builder setMaxRetainCount(int i10) {
            this.maxRetainCount_ = i10;
            onChanged();
            return this;
        }

        private Builder() {
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdCachePlacementControl build() {
            AdCachePlacementControl adCachePlacementControlBuildPartial = buildPartial();
            if (adCachePlacementControlBuildPartial.isInitialized()) {
                return adCachePlacementControlBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) adCachePlacementControlBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdCachePlacementControl buildPartial() {
            AdCachePlacementControl adCachePlacementControl = new AdCachePlacementControl(this);
            adCachePlacementControl.maxCacheSize_ = this.maxCacheSize_;
            adCachePlacementControl.maxRetainCount_ = this.maxRetainCount_;
            adCachePlacementControl.maxAge_ = this.maxAge_;
            onBuilt();
            return adCachePlacementControl;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public AdCachePlacementControl getDefaultInstanceForType() {
            return AdCachePlacementControl.getDefaultInstance();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.setField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
            return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            maybeForceBuilderInitialization();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            this.maxCacheSize_ = 0;
            this.maxRetainCount_ = 0;
            this.maxAge_ = 0;
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo208clone() {
            return (Builder) super.mo208clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof AdCachePlacementControl) {
                return mergeFrom((AdCachePlacementControl) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder mergeFrom(AdCachePlacementControl adCachePlacementControl) {
            if (adCachePlacementControl == AdCachePlacementControl.getDefaultInstance()) {
                return this;
            }
            if (adCachePlacementControl.getMaxCacheSize() != 0) {
                setMaxCacheSize(adCachePlacementControl.getMaxCacheSize());
            }
            if (adCachePlacementControl.getMaxRetainCount() != 0) {
                setMaxRetainCount(adCachePlacementControl.getMaxRetainCount());
            }
            if (adCachePlacementControl.getMaxAge() != 0) {
                setMaxAge(adCachePlacementControl.getMaxAge());
            }
            mergeUnknownFields(adCachePlacementControl.unknownFields);
            onChanged();
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            AdCachePlacementControl adCachePlacementControl = null;
            try {
                try {
                    AdCachePlacementControl adCachePlacementControl2 = (AdCachePlacementControl) AdCachePlacementControl.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (adCachePlacementControl2 != null) {
                        mergeFrom(adCachePlacementControl2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    AdCachePlacementControl adCachePlacementControl3 = (AdCachePlacementControl) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th2) {
                        th = th2;
                        adCachePlacementControl = adCachePlacementControl3;
                        if (adCachePlacementControl != null) {
                            mergeFrom(adCachePlacementControl);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (adCachePlacementControl != null) {
                    mergeFrom(adCachePlacementControl);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AdCachePlacementControl parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdCachePlacementControl) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AdCachePlacementControl parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdCachePlacementControl)) {
            return super.equals(obj);
        }
        AdCachePlacementControl adCachePlacementControl = (AdCachePlacementControl) obj;
        return getMaxCacheSize() == adCachePlacementControl.getMaxCacheSize() && getMaxRetainCount() == adCachePlacementControl.getMaxRetainCount() && getMaxAge() == adCachePlacementControl.getMaxAge() && this.unknownFields.equals(adCachePlacementControl.unknownFields);
    }

    public static AdCachePlacementControl getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return InitProto.internal_static_bidmachine_protobuf_AdCachePlacementControl_descriptor;
    }

    public static Builder newBuilder(AdCachePlacementControl adCachePlacementControl) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adCachePlacementControl);
    }

    public static AdCachePlacementControl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Parser<AdCachePlacementControl> parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.AdCachePlacementControlOrBuilder
    public int getMaxAge() {
        return this.maxAge_;
    }

    @Override // io.bidmachine.protobuf.AdCachePlacementControlOrBuilder
    public int getMaxCacheSize() {
        return this.maxCacheSize_;
    }

    @Override // io.bidmachine.protobuf.AdCachePlacementControlOrBuilder
    public int getMaxRetainCount() {
        return this.maxRetainCount_;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser<AdCachePlacementControl> getParserForType() {
        return PARSER;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.maxCacheSize_;
        int iComputeUInt32Size = i11 != 0 ? 0 + CodedOutputStream.computeUInt32Size(2, i11) : 0;
        int i12 = this.maxAge_;
        if (i12 != 0) {
            iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, i12);
        }
        int i13 = this.maxRetainCount_;
        if (i13 != 0) {
            iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, i13);
        }
        int serializedSize = iComputeUInt32Size + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 2) * 53) + getMaxCacheSize()) * 37) + 4) * 53) + getMaxRetainCount()) * 37) + 3) * 53) + getMaxAge()) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return InitProto.internal_static_bidmachine_protobuf_AdCachePlacementControl_fieldAccessorTable.ensureFieldAccessorsInitialized(AdCachePlacementControl.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        byte b10 = this.memoizedIsInitialized;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new AdCachePlacementControl();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i10 = this.maxCacheSize_;
        if (i10 != 0) {
            codedOutputStream.writeUInt32(2, i10);
        }
        int i11 = this.maxAge_;
        if (i11 != 0) {
            codedOutputStream.writeUInt32(3, i11);
        }
        int i12 = this.maxRetainCount_;
        if (i12 != 0) {
            codedOutputStream.writeUInt32(4, i12);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    private AdCachePlacementControl(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AdCachePlacementControl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdCachePlacementControl) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AdCachePlacementControl parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
    public AdCachePlacementControl getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static AdCachePlacementControl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private AdCachePlacementControl() {
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AdCachePlacementControl parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static AdCachePlacementControl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    private AdCachePlacementControl(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 16) {
                            this.maxCacheSize_ = codedInputStream.readUInt32();
                        } else if (tag == 24) {
                            this.maxAge_ = codedInputStream.readUInt32();
                        } else if (tag != 32) {
                            if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                            }
                        } else {
                            this.maxRetainCount_ = codedInputStream.readUInt32();
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static AdCachePlacementControl parseFrom(InputStream inputStream) throws IOException {
        return (AdCachePlacementControl) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static AdCachePlacementControl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdCachePlacementControl) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AdCachePlacementControl parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AdCachePlacementControl) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static AdCachePlacementControl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdCachePlacementControl) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
