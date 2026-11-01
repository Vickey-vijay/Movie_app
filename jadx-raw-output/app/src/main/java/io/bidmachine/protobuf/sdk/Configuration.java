package io.bidmachine.protobuf.sdk;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessageLite;
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
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.StringValue;
import com.explorestack.protobuf.StringValueOrBuilder;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class Configuration extends GeneratedMessageV3 implements ConfigurationOrBuilder {
    public static final int BPK_FIELD_NUMBER = 3;
    public static final int MONITORS_FIELD_NUMBER = 1;
    public static final int READERS_FIELD_NUMBER = 2;
    private static final long serialVersionUID = 0;
    private StringValue bpk_;
    private byte memoizedIsInitialized;
    private List<Monitor.Configuration> monitors_;
    private List<Reader.Configuration> readers_;
    private static final Configuration DEFAULT_INSTANCE = new Configuration();
    private static final Parser<Configuration> PARSER = new AbstractParser<Configuration>() { // from class: io.bidmachine.protobuf.sdk.Configuration.1
        @Override // com.explorestack.protobuf.Parser
        public Configuration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new Configuration(codedInputStream, extensionRegistryLite);
        }
    };

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationOrBuilder {
        private int bitField0_;
        private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> bpkBuilder_;
        private StringValue bpk_;
        private RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> monitorsBuilder_;
        private List<Monitor.Configuration> monitors_;
        private RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> readersBuilder_;
        private List<Reader.Configuration> readers_;

        public Builder addMonitors(Monitor.Configuration configuration) {
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                configuration.getClass();
                ensureMonitorsIsMutable();
                this.monitors_.add(configuration);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(configuration);
            }
            return this;
        }

        public Monitor.Configuration.Builder addMonitorsBuilder() {
            return (Monitor.Configuration.Builder) getMonitorsFieldBuilder().addBuilder(Monitor.Configuration.getDefaultInstance());
        }

        public Builder addReaders(Reader.Configuration configuration) {
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.readersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                configuration.getClass();
                ensureReadersIsMutable();
                this.readers_.add(configuration);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(configuration);
            }
            return this;
        }

        public Reader.Configuration.Builder addReadersBuilder() {
            return (Reader.Configuration.Builder) getReadersFieldBuilder().addBuilder(Reader.Configuration.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setBpk(StringValue stringValue) {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.bpkBuilder_;
            if (singleFieldBuilderV3 == null) {
                stringValue.getClass();
                this.bpk_ = stringValue;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(stringValue);
            }
            return this;
        }

        public Builder setMonitors(int i10, Monitor.Configuration configuration) {
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                configuration.getClass();
                ensureMonitorsIsMutable();
                this.monitors_.set(i10, configuration);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i10, configuration);
            }
            return this;
        }

        public Builder setReaders(int i10, Reader.Configuration configuration) {
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.readersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                configuration.getClass();
                ensureReadersIsMutable();
                this.readers_.set(i10, configuration);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i10, configuration);
            }
            return this;
        }

        private void ensureMonitorsIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.monitors_ = new ArrayList(this.monitors_);
                this.bitField0_ |= 1;
            }
        }

        private void ensureReadersIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.readers_ = new ArrayList(this.readers_);
                this.bitField0_ |= 2;
            }
        }

        private SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> getBpkFieldBuilder() {
            if (this.bpkBuilder_ == null) {
                this.bpkBuilder_ = new SingleFieldBuilderV3<>(getBpk(), getParentForChildren(), isClean());
                this.bpk_ = null;
            }
            return this.bpkBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor;
        }

        private RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> getMonitorsFieldBuilder() {
            if (this.monitorsBuilder_ == null) {
                this.monitorsBuilder_ = new RepeatedFieldBuilderV3<>(this.monitors_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.monitors_ = null;
            }
            return this.monitorsBuilder_;
        }

        private RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> getReadersFieldBuilder() {
            if (this.readersBuilder_ == null) {
                this.readersBuilder_ = new RepeatedFieldBuilderV3<>(this.readers_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.readers_ = null;
            }
            return this.readersBuilder_;
        }

        public Builder addAllMonitors(Iterable<? extends Monitor.Configuration> iterable) {
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMonitorsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.monitors_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder addAllReaders(Iterable<? extends Reader.Configuration> iterable) {
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.readersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureReadersIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.readers_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearBpk() {
            if (this.bpkBuilder_ == null) {
                this.bpk_ = null;
                onChanged();
            } else {
                this.bpk_ = null;
                this.bpkBuilder_ = null;
            }
            return this;
        }

        public Builder clearMonitors() {
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.monitors_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder clearReaders() {
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.readersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.readers_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public StringValue getBpk() {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.bpkBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValue) singleFieldBuilderV3.getMessage();
            }
            StringValue stringValue = this.bpk_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public StringValueOrBuilder getBpkOrBuilder() {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.bpkBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (StringValueOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            StringValue stringValue = this.bpk_;
            return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor;
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Monitor.Configuration getMonitors(int i10) {
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            return repeatedFieldBuilderV3 == null ? this.monitors_.get(i10) : (Monitor.Configuration) repeatedFieldBuilderV3.getMessage(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public int getMonitorsCount() {
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            return repeatedFieldBuilderV3 == null ? this.monitors_.size() : repeatedFieldBuilderV3.getCount();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<Monitor.Configuration> getMonitorsList() {
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.monitors_) : repeatedFieldBuilderV3.getMessageList();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Monitor.ConfigurationOrBuilder getMonitorsOrBuilder(int i10) {
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            return repeatedFieldBuilderV3 == null ? this.monitors_.get(i10) : (Monitor.ConfigurationOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<? extends Monitor.ConfigurationOrBuilder> getMonitorsOrBuilderList() {
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.monitors_);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Reader.Configuration getReaders(int i10) {
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.readersBuilder_;
            return repeatedFieldBuilderV3 == null ? this.readers_.get(i10) : (Reader.Configuration) repeatedFieldBuilderV3.getMessage(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public int getReadersCount() {
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.readersBuilder_;
            return repeatedFieldBuilderV3 == null ? this.readers_.size() : repeatedFieldBuilderV3.getCount();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<Reader.Configuration> getReadersList() {
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.readersBuilder_;
            return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.readers_) : repeatedFieldBuilderV3.getMessageList();
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public Reader.ConfigurationOrBuilder getReadersOrBuilder(int i10) {
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.readersBuilder_;
            return repeatedFieldBuilderV3 == null ? this.readers_.get(i10) : (Reader.ConfigurationOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public List<? extends Reader.ConfigurationOrBuilder> getReadersOrBuilderList() {
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.readersBuilder_;
            return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.readers_);
        }

        @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
        public boolean hasBpk() {
            return (this.bpkBuilder_ == null && this.bpk_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
        }

        public Builder mergeBpk(StringValue stringValue) {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.bpkBuilder_;
            if (singleFieldBuilderV3 == null) {
                StringValue stringValue2 = this.bpk_;
                if (stringValue2 != null) {
                    this.bpk_ = StringValue.newBuilder(stringValue2).mergeFrom(stringValue).buildPartial();
                } else {
                    this.bpk_ = stringValue;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(stringValue);
            }
            return this;
        }

        public Builder removeMonitors(int i10) {
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMonitorsIsMutable();
                this.monitors_.remove(i10);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i10);
            }
            return this;
        }

        public Builder removeReaders(int i10) {
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.readersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureReadersIsMutable();
                this.readers_.remove(i10);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i10);
            }
            return this;
        }

        private Builder() {
            this.monitors_ = Collections.emptyList();
            this.readers_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getMonitorsFieldBuilder();
                getReadersFieldBuilder();
            }
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Configuration build() {
            Configuration configurationBuildPartial = buildPartial();
            if (configurationBuildPartial.isInitialized()) {
                return configurationBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Configuration buildPartial() {
            Configuration configuration = new Configuration(this);
            int i10 = this.bitField0_;
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                if ((i10 & 1) != 0) {
                    this.monitors_ = Collections.unmodifiableList(this.monitors_);
                    this.bitField0_ &= -2;
                }
                configuration.monitors_ = this.monitors_;
            } else {
                configuration.monitors_ = repeatedFieldBuilderV3.build();
            }
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV4 = this.readersBuilder_;
            if (repeatedFieldBuilderV4 != null) {
                configuration.readers_ = repeatedFieldBuilderV4.build();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.readers_ = Collections.unmodifiableList(this.readers_);
                    this.bitField0_ &= -3;
                }
                configuration.readers_ = this.readers_;
            }
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.bpkBuilder_;
            if (singleFieldBuilderV3 == null) {
                configuration.bpk_ = this.bpk_;
            } else {
                configuration.bpk_ = (StringValue) singleFieldBuilderV3.build();
            }
            onBuilt();
            return configuration;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public StringValue.Builder getBpkBuilder() {
            onChanged();
            return (StringValue.Builder) getBpkFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Configuration getDefaultInstanceForType() {
            return Configuration.getDefaultInstance();
        }

        public Monitor.Configuration.Builder getMonitorsBuilder(int i10) {
            return (Monitor.Configuration.Builder) getMonitorsFieldBuilder().getBuilder(i10);
        }

        public List<Monitor.Configuration.Builder> getMonitorsBuilderList() {
            return getMonitorsFieldBuilder().getBuilderList();
        }

        public Reader.Configuration.Builder getReadersBuilder(int i10) {
            return (Reader.Configuration.Builder) getReadersFieldBuilder().getBuilder(i10);
        }

        public List<Reader.Configuration.Builder> getReadersBuilderList() {
            return getReadersFieldBuilder().getBuilderList();
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

        public Monitor.Configuration.Builder addMonitorsBuilder(int i10) {
            return (Monitor.Configuration.Builder) getMonitorsFieldBuilder().addBuilder(i10, Monitor.Configuration.getDefaultInstance());
        }

        public Reader.Configuration.Builder addReadersBuilder(int i10) {
            return (Reader.Configuration.Builder) getReadersFieldBuilder().addBuilder(i10, Reader.Configuration.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
            return (Builder) super.clearOneof(oneofDescriptor);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.mergeUnknownFields(unknownFieldSet);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clear() {
            super.clear();
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.monitors_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV4 = this.readersBuilder_;
            if (repeatedFieldBuilderV4 == null) {
                this.readers_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                repeatedFieldBuilderV4.clear();
            }
            if (this.bpkBuilder_ == null) {
                this.bpk_ = null;
            } else {
                this.bpk_ = null;
                this.bpkBuilder_ = null;
            }
            return this;
        }

        public Builder setBpk(StringValue.Builder builder) {
            SingleFieldBuilderV3<StringValue, StringValue.Builder, StringValueOrBuilder> singleFieldBuilderV3 = this.bpkBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.bpk_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.monitors_ = Collections.emptyList();
            this.readers_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder addMonitors(int i10, Monitor.Configuration configuration) {
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                configuration.getClass();
                ensureMonitorsIsMutable();
                this.monitors_.add(i10, configuration);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i10, configuration);
            }
            return this;
        }

        public Builder addReaders(int i10, Reader.Configuration configuration) {
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.readersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                configuration.getClass();
                ensureReadersIsMutable();
                this.readers_.add(i10, configuration);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i10, configuration);
            }
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
        /* JADX INFO: renamed from: clone */
        public Builder mo208clone() {
            return (Builder) super.mo208clone();
        }

        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(Message message) {
            if (message instanceof Configuration) {
                return mergeFrom((Configuration) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setMonitors(int i10, Monitor.Configuration.Builder builder) {
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMonitorsIsMutable();
                this.monitors_.set(i10, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i10, builder.build());
            }
            return this;
        }

        public Builder setReaders(int i10, Reader.Configuration.Builder builder) {
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.readersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureReadersIsMutable();
                this.readers_.set(i10, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i10, builder.build());
            }
            return this;
        }

        public Builder mergeFrom(Configuration configuration) {
            if (configuration == Configuration.getDefaultInstance()) {
                return this;
            }
            if (this.monitorsBuilder_ == null) {
                if (!configuration.monitors_.isEmpty()) {
                    if (this.monitors_.isEmpty()) {
                        this.monitors_ = configuration.monitors_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureMonitorsIsMutable();
                        this.monitors_.addAll(configuration.monitors_);
                    }
                    onChanged();
                }
            } else if (!configuration.monitors_.isEmpty()) {
                if (!this.monitorsBuilder_.isEmpty()) {
                    this.monitorsBuilder_.addAllMessages(configuration.monitors_);
                } else {
                    this.monitorsBuilder_.dispose();
                    this.monitorsBuilder_ = null;
                    this.monitors_ = configuration.monitors_;
                    this.bitField0_ &= -2;
                    this.monitorsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getMonitorsFieldBuilder() : null;
                }
            }
            if (this.readersBuilder_ == null) {
                if (!configuration.readers_.isEmpty()) {
                    if (this.readers_.isEmpty()) {
                        this.readers_ = configuration.readers_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureReadersIsMutable();
                        this.readers_.addAll(configuration.readers_);
                    }
                    onChanged();
                }
            } else if (!configuration.readers_.isEmpty()) {
                if (!this.readersBuilder_.isEmpty()) {
                    this.readersBuilder_.addAllMessages(configuration.readers_);
                } else {
                    this.readersBuilder_.dispose();
                    this.readersBuilder_ = null;
                    this.readers_ = configuration.readers_;
                    this.bitField0_ &= -3;
                    this.readersBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getReadersFieldBuilder() : null;
                }
            }
            if (configuration.hasBpk()) {
                mergeBpk(configuration.getBpk());
            }
            mergeUnknownFields(configuration.unknownFields);
            onChanged();
            return this;
        }

        public Builder addMonitors(Monitor.Configuration.Builder builder) {
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMonitorsIsMutable();
                this.monitors_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addReaders(Reader.Configuration.Builder builder) {
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.readersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureReadersIsMutable();
                this.readers_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addMonitors(int i10, Monitor.Configuration.Builder builder) {
            RepeatedFieldBuilderV3<Monitor.Configuration, Monitor.Configuration.Builder, Monitor.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.monitorsBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureMonitorsIsMutable();
                this.monitors_.add(i10, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i10, builder.build());
            }
            return this;
        }

        public Builder addReaders(int i10, Reader.Configuration.Builder builder) {
            RepeatedFieldBuilderV3<Reader.Configuration, Reader.Configuration.Builder, Reader.ConfigurationOrBuilder> repeatedFieldBuilderV3 = this.readersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureReadersIsMutable();
                this.readers_.add(i10, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i10, builder.build());
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            Configuration configuration = null;
            try {
                try {
                    Configuration configuration2 = (Configuration) Configuration.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (configuration2 != null) {
                        mergeFrom(configuration2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    Configuration configuration3 = (Configuration) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th2) {
                        th = th2;
                        configuration = configuration3;
                        if (configuration != null) {
                            mergeFrom(configuration);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (configuration != null) {
                    mergeFrom(configuration);
                }
                throw th;
            }
        }
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Configuration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Configuration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static Configuration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Configuration)) {
            return super.equals(obj);
        }
        Configuration configuration = (Configuration) obj;
        if (getMonitorsList().equals(configuration.getMonitorsList()) && getReadersList().equals(configuration.getReadersList()) && hasBpk() == configuration.hasBpk()) {
            return (!hasBpk() || getBpk().equals(configuration.getBpk())) && this.unknownFields.equals(configuration.unknownFields);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i10 = 0; i10 < this.monitors_.size(); i10++) {
            codedOutputStream.writeMessage(1, this.monitors_.get(i10));
        }
        for (int i11 = 0; i11 < this.readers_.size(); i11++) {
            codedOutputStream.writeMessage(2, this.readers_.get(i11));
        }
        if (this.bpk_ != null) {
            codedOutputStream.writeMessage(3, getBpk());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public static Configuration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_descriptor;
    }

    public static Builder newBuilder(Configuration configuration) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(configuration);
    }

    public static Configuration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Parser<Configuration> parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public StringValue getBpk() {
        StringValue stringValue = this.bpk_;
        return stringValue == null ? StringValue.getDefaultInstance() : stringValue;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Monitor.Configuration getMonitors(int i10) {
        return this.monitors_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public int getMonitorsCount() {
        return this.monitors_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<Monitor.Configuration> getMonitorsList() {
        return this.monitors_;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Monitor.ConfigurationOrBuilder getMonitorsOrBuilder(int i10) {
        return this.monitors_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<? extends Monitor.ConfigurationOrBuilder> getMonitorsOrBuilderList() {
        return this.monitors_;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser<Configuration> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Reader.Configuration getReaders(int i10) {
        return this.readers_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public int getReadersCount() {
        return this.readers_.size();
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<Reader.Configuration> getReadersList() {
        return this.readers_;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public Reader.ConfigurationOrBuilder getReadersOrBuilder(int i10) {
        return this.readers_.get(i10);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public List<? extends Reader.ConfigurationOrBuilder> getReadersOrBuilderList() {
        return this.readers_;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeMessageSize = 0;
        for (int i11 = 0; i11 < this.monitors_.size(); i11++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.monitors_.get(i11));
        }
        for (int i12 = 0; i12 < this.readers_.size(); i12++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.readers_.get(i12));
        }
        if (this.bpk_ != null) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getBpk());
        }
        int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public boolean hasBpk() {
        return this.bpk_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (getMonitorsCount() > 0) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getMonitorsList().hashCode();
        }
        if (getReadersCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getReadersList().hashCode();
        }
        if (hasBpk()) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getBpk().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return SDKAnalyticV2Proto.internal_static_bidmachine_protobuf_sdk_analytics_v2_Configuration_fieldAccessorTable.ensureFieldAccessorsInitialized(Configuration.class, Builder.class);
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
        return new Configuration();
    }

    private Configuration(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static Configuration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Configuration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Configuration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // io.bidmachine.protobuf.sdk.ConfigurationOrBuilder
    public StringValueOrBuilder getBpkOrBuilder() {
        return getBpk();
    }

    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
    public Configuration getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static Configuration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private Configuration() {
        this.memoizedIsInitialized = (byte) -1;
        this.monitors_ = Collections.emptyList();
        this.readers_ = Collections.emptyList();
    }

    public static Configuration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static Configuration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static Configuration parseFrom(InputStream inputStream) throws IOException {
        return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private Configuration(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        this();
        extensionRegistryLite.getClass();
        UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                if ((i10 & 1) == 0) {
                                    this.monitors_ = new ArrayList();
                                    i10 |= 1;
                                }
                                this.monitors_.add((Monitor.Configuration) codedInputStream.readMessage(Monitor.Configuration.parser(), extensionRegistryLite));
                            } else if (tag == 18) {
                                if ((i10 & 2) == 0) {
                                    this.readers_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.readers_.add((Reader.Configuration) codedInputStream.readMessage(Reader.Configuration.parser(), extensionRegistryLite));
                            } else if (tag != 26) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                StringValue stringValue = this.bpk_;
                                StringValue.Builder builder = stringValue != null ? stringValue.toBuilder() : null;
                                StringValue stringValue2 = (StringValue) codedInputStream.readMessage(StringValue.parser(), extensionRegistryLite);
                                this.bpk_ = stringValue2;
                                if (builder != null) {
                                    builder.mergeFrom(stringValue2);
                                    this.bpk_ = builder.buildPartial();
                                }
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(this);
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(this);
                }
            } catch (Throwable th2) {
                if ((i10 & 1) != 0) {
                    this.monitors_ = Collections.unmodifiableList(this.monitors_);
                }
                if ((i10 & 2) != 0) {
                    this.readers_ = Collections.unmodifiableList(this.readers_);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((i10 & 1) != 0) {
            this.monitors_ = Collections.unmodifiableList(this.monitors_);
        }
        if ((i10 & 2) != 0) {
            this.readers_ = Collections.unmodifiableList(this.readers_);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static Configuration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static Configuration parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static Configuration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Configuration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
