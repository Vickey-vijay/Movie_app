package io.bidmachine.protobuf.sessionmetrics;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistry;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.MapEntry;
import com.explorestack.protobuf.MapField;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.ProtocolMessageEnum;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class SessionDepth {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n'bidmachine/protobuf/session_depth.proto\u0012\u000esessionmetrics\"Õ\u0002\n\tUserState\u0012 \n\u0018last_processed_timestamp\u0018\u0001 \u0001(\u0003\u0012?\n\u000bimpressions\u0018\u0002 \u0003(\u000b2*.sessionmetrics.UserState.ImpressionsEntry\u0012>\n\u000bad_requests\u0018\u0003 \u0003(\u000b2).sessionmetrics.UserState.AdRequestsEntry\u001aV\n\u0010ImpressionsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u00121\n\u0005value\u0018\u0002 \u0001(\u000b2\".sessionmetrics.AdDomainTimestamps:\u00028\u0001\u001aM\n\u000fAdRequestsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\u0005\u0012)\n\u0005value\u0018\u0002 \u0001(\u000b2\u001a.sessionmetrics.Timestamps:\u00028\u0001\"ÿ\u0003\n\u000bUserSession\u0012\u0015\n\rlast_activity\u0018\u0001 \u0001(\u0003\u0012E\n\u0012metrics_by_ad_type\u0018\u0003 \u0003(\u000b2).sessionmetrics.UserSession.AdTypeMetrics\u0012\u0015\n\rsession_start\u0018\u0004 \u0001(\u0003\u001a@\n\u0004Ecpm\u0012\u0014\n\ffirst_prices\u0018\u0001 \u0003(\u0001\u0012\u0013\n\u000blast_prices\u0018\u0002 \u0003(\u0001\u0012\r\n\u0005count\u0018\u0003 \u0001(\u0005\u001a¸\u0002\n\rAdTypeMetrics\u0012'\n\u0007ad_type\u0018\u0001 \u0001(\u000e2\u0016.sessionmetrics.AdType\u0012\u0013\n\u000bimpressions\u0018\u0002 \u0001(\u0005\u0012\u0013\n\u000bad_requests\u0018\u0003 \u0001(\u0005\u0012\f\n\u0004bids\u0018\u0004 \u0001(\u0005\u0012\f\n\u0004wins\u0018\u0005 \u0001(\u0005\u0012\u000e\n\u0006losses\u0018\u0006 \u0001(\u0005\u0012\r\n\u0005lurls\u0018\u0007 \u0001(\u0005\u0012\r\n\u0005nurls\u0018\b \u0001(\u0005\u0012\u001c\n\u0014cumulative_bid_price\u0018\t \u0001(\u0002\u0012\u001d\n\u0015cumulative_lurl_price\u0018\n \u0001(\u0002\u0012\u001d\n\u0015cumulative_nurl_price\u0018\u000b \u0001(\u0002\u0012.\n\u0004ecpm\u0018\f \u0001(\u000b2 .sessionmetrics.UserSession.Ecpm\"\u009f\u0001\n\nTimestamps\u0012\u0016\n\u000elast_timestamp\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006deltas\u0018\u0002 \u0003(\r\u00129\n\u000bday_buckets\u0018\u0003 \u0003(\u000b2$.sessionmetrics.Timestamps.DayBucket\u001a.\n\tDayBucket\u0012\u0012\n\nstart_time\u0018\u0001 \u0001(\u0003\u0012\r\n\u0005count\u0018\u0002 \u0001(\u0005\"©\u0001\n\u0012AdDomainTimestamps\u0012E\n\nad_domains\u0018\u0001 \u0003(\u000b21.sessionmetrics.AdDomainTimestamps.AdDomainsEntry\u001aL\n\u000eAdDomainsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012)\n\u0005value\u0018\u0002 \u0001(\u000b2\u001a.sessionmetrics.Timestamps:\u00028\u0001\"B\n\rWindowMetrics\u0012\u000f\n\u0007last_1h\u0018\u0001 \u0001(\u0005\u0012\u000f\n\u0007last_1d\u0018\u0002 \u0001(\u0005\u0012\u000f\n\u0007last_7d\u0018\u0003 \u0001(\u0005\"Ö\u0001\n\u0011ImpressionMetrics\u0012'\n\u0007ad_type\u0018\u0001 \u0001(\u000e2\u0016.sessionmetrics.AdType\u0012@\n\u0007domains\u0018\u0002 \u0003(\u000b2/.sessionmetrics.ImpressionMetrics.DomainMetrics\u001aV\n\rDomainMetrics\u0012\u000e\n\u0006domain\u0018\u0001 \u0001(\t\u00125\n\u000ewindow_metrics\u0018\u0002 \u0001(\u000b2\u001d.sessionmetrics.WindowMetrics\"r\n\u0010AdRequestMetrics\u0012'\n\u0007ad_type\u0018\u0001 \u0001(\u000e2\u0016.sessionmetrics.AdType\u00125\n\u000ewindow_metrics\u0018\u0002 \u0001(\u000b2\u001d.sessionmetrics.WindowMetrics\"µ\u0001\n\u000eSessionMetrics\u00126\n\u000bimpressions\u0018\u0001 \u0003(\u000b2!.sessionmetrics.ImpressionMetrics\u00125\n\u000bad_requests\u0018\u0002 \u0003(\u000b2 .sessionmetrics.AdRequestMetrics\u00124\n\u000fcurrent_session\u0018\u0003 \u0001(\u000b2\u001b.sessionmetrics.UserSession\"1\n\u000bUserIdQuery\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\t\u0012\u0011\n\ttimestamp\u0018\u0002 \u0001(\u0003\"X\n\tAdRequest\u0012\u000f\n\u0007user_id\u0018\u0001 \u0001(\t\u0012'\n\u0007ad_type\u0018\u0002 \u0001(\u000e2\u0016.sessionmetrics.AdType\u0012\u0011\n\ttimestamp\u0018\u0003 \u0001(\u0003*A\n\u0006AdType\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0010\n\fINTERSTITIAL\u0010\u0001\u0012\f\n\bREWARDED\u0010\u0002\u0012\n\n\u0006BANNER\u0010\u00032²\u0001\n\u000eSessionService\u0012P\n\u0011GetSessionMetrics\u0012\u001b.sessionmetrics.UserIdQuery\u001a\u001e.sessionmetrics.SessionMetrics\u0012N\n\u0011RegisterAdRequest\u0012\u0019.sessionmetrics.AdRequest\u001a\u001e.sessionmetrics.SessionMetricsB'\n%io.bidmachine.protobuf.sessionmetricsb\u0006proto3"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_sessionmetrics_AdDomainTimestamps_AdDomainsEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_AdDomainTimestamps_AdDomainsEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_AdDomainTimestamps_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_AdDomainTimestamps_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_AdRequestMetrics_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_AdRequestMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_AdRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_AdRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_ImpressionMetrics_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_ImpressionMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_SessionMetrics_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_SessionMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_Timestamps_DayBucket_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_Timestamps_DayBucket_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_Timestamps_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_Timestamps_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserIdQuery_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_UserIdQuery_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserSession_AdTypeMetrics_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_UserSession_AdTypeMetrics_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserSession_Ecpm_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_UserSession_Ecpm_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserSession_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_UserSession_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserState_AdRequestsEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_UserState_AdRequestsEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserState_ImpressionsEntry_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_UserState_ImpressionsEntry_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_UserState_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_UserState_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_sessionmetrics_WindowMetrics_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_sessionmetrics_WindowMetrics_fieldAccessorTable;

    public static final class AdDomainTimestamps extends GeneratedMessageV3 implements AdDomainTimestampsOrBuilder {
        public static final int AD_DOMAINS_FIELD_NUMBER = 1;
        private static final AdDomainTimestamps DEFAULT_INSTANCE = new AdDomainTimestamps();
        private static final Parser<AdDomainTimestamps> PARSER = new AbstractParser<AdDomainTimestamps>() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdDomainTimestamps.1
            @Override // com.explorestack.protobuf.Parser
            public AdDomainTimestamps parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AdDomainTimestamps(codedInputStream, extensionRegistryLite);
            }
        };
        private static final long serialVersionUID = 0;
        private MapField<String, Timestamps> adDomains_;
        private byte memoizedIsInitialized;

        public static final class AdDomainsDefaultEntryHolder {
            public static final MapEntry<String, Timestamps> defaultEntry = MapEntry.newDefaultInstance(SessionDepth.internal_static_sessionmetrics_AdDomainTimestamps_AdDomainsEntry_descriptor, WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, Timestamps.getDefaultInstance());

            private AdDomainsDefaultEntryHolder() {
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdDomainTimestampsOrBuilder {
            private MapField<String, Timestamps> adDomains_;
            private int bitField0_;

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public MapField internalGetMapField(int i10) {
                if (i10 == 1) {
                    return internalGetAdDomains();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public MapField internalGetMutableMapField(int i10) {
                if (i10 == 1) {
                    return internalGetMutableAdDomains();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private MapField<String, Timestamps> internalGetAdDomains() {
                MapField<String, Timestamps> mapField = this.adDomains_;
                return mapField == null ? MapField.emptyMapField(AdDomainsDefaultEntryHolder.defaultEntry) : mapField;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionDepth.internal_static_sessionmetrics_AdDomainTimestamps_descriptor;
            }

            private MapField<String, Timestamps> internalGetMutableAdDomains() {
                onChanged();
                if (this.adDomains_ == null) {
                    this.adDomains_ = MapField.newMapField(AdDomainsDefaultEntryHolder.defaultEntry);
                }
                if (!this.adDomains_.isMutable()) {
                    this.adDomains_ = this.adDomains_.copy();
                }
                return this.adDomains_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdDomainTimestamps build() {
                AdDomainTimestamps adDomainTimestampsBuildPartial = buildPartial();
                if (adDomainTimestampsBuildPartial.isInitialized()) {
                    return adDomainTimestampsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) adDomainTimestampsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdDomainTimestamps buildPartial() {
                AdDomainTimestamps adDomainTimestamps = new AdDomainTimestamps(this);
                adDomainTimestamps.adDomains_ = internalGetAdDomains();
                adDomainTimestamps.adDomains_.makeImmutable();
                onBuilt();
                return adDomainTimestamps;
            }

            public Builder clearAdDomains() {
                internalGetMutableAdDomains().getMutableMap().clear();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdDomainTimestampsOrBuilder
            public boolean containsAdDomains(String str) {
                str.getClass();
                return internalGetAdDomains().getMap().containsKey(str);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdDomainTimestampsOrBuilder
            @Deprecated
            public Map<String, Timestamps> getAdDomains() {
                return getAdDomainsMap();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdDomainTimestampsOrBuilder
            public int getAdDomainsCount() {
                return internalGetAdDomains().getMap().size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdDomainTimestampsOrBuilder
            public Map<String, Timestamps> getAdDomainsMap() {
                return internalGetAdDomains().getMap();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdDomainTimestampsOrBuilder
            public Timestamps getAdDomainsOrDefault(String str, Timestamps timestamps) {
                str.getClass();
                Map<String, Timestamps> map = internalGetAdDomains().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                return timestamps;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdDomainTimestampsOrBuilder
            public Timestamps getAdDomainsOrThrow(String str) {
                str.getClass();
                Map<String, Timestamps> map = internalGetAdDomains().getMap();
                if (map.containsKey(str)) {
                    return map.get(str);
                }
                throw new IllegalArgumentException();
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public AdDomainTimestamps getDefaultInstanceForType() {
                return AdDomainTimestamps.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionDepth.internal_static_sessionmetrics_AdDomainTimestamps_descriptor;
            }

            @Deprecated
            public Map<String, Timestamps> getMutableAdDomains() {
                return internalGetMutableAdDomains().getMutableMap();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SessionDepth.internal_static_sessionmetrics_AdDomainTimestamps_fieldAccessorTable.ensureFieldAccessorsInitialized(AdDomainTimestamps.class, Builder.class);
            }

            public Builder putAdDomains(String str, Timestamps timestamps) {
                str.getClass();
                timestamps.getClass();
                internalGetMutableAdDomains().getMutableMap().put(str, timestamps);
                return this;
            }

            public Builder putAllAdDomains(Map<String, Timestamps> map) {
                internalGetMutableAdDomains().getMutableMap().putAll(map);
                return this;
            }

            public Builder removeAdDomains(String str) {
                str.getClass();
                internalGetMutableAdDomains().getMutableMap().remove(str);
                return this;
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
                internalGetMutableAdDomains().clear();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo208clone() {
                return (Builder) super.mo208clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AdDomainTimestamps) {
                    return mergeFrom((AdDomainTimestamps) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AdDomainTimestamps adDomainTimestamps) {
                if (adDomainTimestamps == AdDomainTimestamps.getDefaultInstance()) {
                    return this;
                }
                internalGetMutableAdDomains().mergeFrom(adDomainTimestamps.internalGetAdDomains());
                mergeUnknownFields(adDomainTimestamps.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                AdDomainTimestamps adDomainTimestamps = null;
                try {
                    try {
                        AdDomainTimestamps adDomainTimestamps2 = (AdDomainTimestamps) AdDomainTimestamps.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (adDomainTimestamps2 != null) {
                            mergeFrom(adDomainTimestamps2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        AdDomainTimestamps adDomainTimestamps3 = (AdDomainTimestamps) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            adDomainTimestamps = adDomainTimestamps3;
                            if (adDomainTimestamps != null) {
                                mergeFrom(adDomainTimestamps);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (adDomainTimestamps != null) {
                        mergeFrom(adDomainTimestamps);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AdDomainTimestamps parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdDomainTimestamps) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdDomainTimestamps parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdDomainTimestamps)) {
                return super.equals(obj);
            }
            AdDomainTimestamps adDomainTimestamps = (AdDomainTimestamps) obj;
            return internalGetAdDomains().equals(adDomainTimestamps.internalGetAdDomains()) && this.unknownFields.equals(adDomainTimestamps.unknownFields);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public MapField internalGetMapField(int i10) {
            if (i10 == 1) {
                return internalGetAdDomains();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        public static AdDomainTimestamps getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MapField<String, Timestamps> internalGetAdDomains() {
            MapField<String, Timestamps> mapField = this.adDomains_;
            return mapField == null ? MapField.emptyMapField(AdDomainsDefaultEntryHolder.defaultEntry) : mapField;
        }

        public static Builder newBuilder(AdDomainTimestamps adDomainTimestamps) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adDomainTimestamps);
        }

        public static AdDomainTimestamps parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<AdDomainTimestamps> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<AdDomainTimestamps> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (Map.Entry<String, Timestamps> entry : internalGetAdDomains().getMap().entrySet()) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, AdDomainsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
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
            int iHashCode = 779 + getDescriptor().hashCode();
            if (!internalGetAdDomains().getMap().isEmpty()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + internalGetAdDomains().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
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
            return new AdDomainTimestamps();
        }

        private AdDomainTimestamps(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionDepth.internal_static_sessionmetrics_AdDomainTimestamps_descriptor;
        }

        public static AdDomainTimestamps parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdDomainTimestamps) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AdDomainTimestamps parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdDomainTimestampsOrBuilder
        public boolean containsAdDomains(String str) {
            str.getClass();
            return internalGetAdDomains().getMap().containsKey(str);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdDomainTimestampsOrBuilder
        @Deprecated
        public Map<String, Timestamps> getAdDomains() {
            return getAdDomainsMap();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdDomainTimestampsOrBuilder
        public int getAdDomainsCount() {
            return internalGetAdDomains().getMap().size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdDomainTimestampsOrBuilder
        public Map<String, Timestamps> getAdDomainsMap() {
            return internalGetAdDomains().getMap();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdDomainTimestampsOrBuilder
        public Timestamps getAdDomainsOrDefault(String str, Timestamps timestamps) {
            str.getClass();
            Map<String, Timestamps> map = internalGetAdDomains().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return timestamps;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdDomainTimestampsOrBuilder
        public Timestamps getAdDomainsOrThrow(String str) {
            str.getClass();
            Map<String, Timestamps> map = internalGetAdDomains().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public AdDomainTimestamps getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SessionDepth.internal_static_sessionmetrics_AdDomainTimestamps_fieldAccessorTable.ensureFieldAccessorsInitialized(AdDomainTimestamps.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetAdDomains(), AdDomainsDefaultEntryHolder.defaultEntry, 1);
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static AdDomainTimestamps parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AdDomainTimestamps() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AdDomainTimestamps parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AdDomainTimestamps parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private AdDomainTimestamps(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z11 & true)) {
                                    this.adDomains_ = MapField.newMapField(AdDomainsDefaultEntryHolder.defaultEntry);
                                    z11 |= true;
                                }
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(AdDomainsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                this.adDomains_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
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

        public static AdDomainTimestamps parseFrom(InputStream inputStream) throws IOException {
            return (AdDomainTimestamps) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AdDomainTimestamps parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdDomainTimestamps) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AdDomainTimestamps parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdDomainTimestamps) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AdDomainTimestamps parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdDomainTimestamps) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AdDomainTimestampsOrBuilder extends MessageOrBuilder {
        boolean containsAdDomains(String str);

        @Deprecated
        Map<String, Timestamps> getAdDomains();

        int getAdDomainsCount();

        Map<String, Timestamps> getAdDomainsMap();

        Timestamps getAdDomainsOrDefault(String str, Timestamps timestamps);

        Timestamps getAdDomainsOrThrow(String str);
    }

    public static final class AdRequest extends GeneratedMessageV3 implements AdRequestOrBuilder {
        public static final int AD_TYPE_FIELD_NUMBER = 2;
        private static final AdRequest DEFAULT_INSTANCE = new AdRequest();
        private static final Parser<AdRequest> PARSER = new AbstractParser<AdRequest>() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequest.1
            @Override // com.explorestack.protobuf.Parser
            public AdRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AdRequest(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int TIMESTAMP_FIELD_NUMBER = 3;
        public static final int USER_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int adType_;
        private byte memoizedIsInitialized;
        private long timestamp_;
        private volatile Object userId_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdRequestOrBuilder {
            private int adType_;
            private long timestamp_;
            private Object userId_;

            public Builder clearAdType() {
                this.adType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder clearTimestamp() {
                this.timestamp_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestOrBuilder
            public AdType getAdType() {
                AdType adTypeValueOf = AdType.valueOf(this.adType_);
                return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestOrBuilder
            public int getAdTypeValue() {
                return this.adType_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestOrBuilder
            public long getTimestamp() {
                return this.timestamp_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestOrBuilder
            public String getUserId() {
                Object obj = this.userId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.userId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestOrBuilder
            public ByteString getUserIdBytes() {
                Object obj = this.userId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public Builder setAdTypeValue(int i10) {
                this.adType_ = i10;
                onChanged();
                return this;
            }

            public Builder setTimestamp(long j10) {
                this.timestamp_ = j10;
                onChanged();
                return this;
            }

            private Builder() {
                this.userId_ = "";
                this.adType_ = 0;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionDepth.internal_static_sessionmetrics_AdRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdRequest build() {
                AdRequest adRequestBuildPartial = buildPartial();
                if (adRequestBuildPartial.isInitialized()) {
                    return adRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) adRequestBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdRequest buildPartial() {
                AdRequest adRequest = new AdRequest(this);
                adRequest.userId_ = this.userId_;
                adRequest.adType_ = this.adType_;
                adRequest.timestamp_ = this.timestamp_;
                onBuilt();
                return adRequest;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearUserId() {
                this.userId_ = AdRequest.getDefaultInstance().getUserId();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public AdRequest getDefaultInstanceForType() {
                return AdRequest.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionDepth.internal_static_sessionmetrics_AdRequest_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SessionDepth.internal_static_sessionmetrics_AdRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AdRequest.class, Builder.class);
            }

            public Builder setAdType(AdType adType) {
                adType.getClass();
                this.adType_ = adType.getNumber();
                onChanged();
                return this;
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

            public Builder setUserId(String str) {
                str.getClass();
                this.userId_ = str;
                onChanged();
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.userId_ = byteString;
                onChanged();
                return this;
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
                this.userId_ = "";
                this.adType_ = 0;
                this.timestamp_ = 0L;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.userId_ = "";
                this.adType_ = 0;
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo208clone() {
                return (Builder) super.mo208clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AdRequest) {
                    return mergeFrom((AdRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AdRequest adRequest) {
                if (adRequest == AdRequest.getDefaultInstance()) {
                    return this;
                }
                if (!adRequest.getUserId().isEmpty()) {
                    this.userId_ = adRequest.userId_;
                    onChanged();
                }
                if (adRequest.adType_ != 0) {
                    setAdTypeValue(adRequest.getAdTypeValue());
                }
                if (adRequest.getTimestamp() != 0) {
                    setTimestamp(adRequest.getTimestamp());
                }
                mergeUnknownFields(adRequest.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                AdRequest adRequest = null;
                try {
                    try {
                        AdRequest adRequest2 = (AdRequest) AdRequest.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (adRequest2 != null) {
                            mergeFrom(adRequest2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        AdRequest adRequest3 = (AdRequest) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            adRequest = adRequest3;
                            if (adRequest != null) {
                                mergeFrom(adRequest);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (adRequest != null) {
                        mergeFrom(adRequest);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AdRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdRequest)) {
                return super.equals(obj);
            }
            AdRequest adRequest = (AdRequest) obj;
            return getUserId().equals(adRequest.getUserId()) && this.adType_ == adRequest.adType_ && getTimestamp() == adRequest.getTimestamp() && this.unknownFields.equals(adRequest.unknownFields);
        }

        public static AdRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(AdRequest adRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adRequest);
        }

        public static AdRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<AdRequest> parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestOrBuilder
        public AdType getAdType() {
            AdType adTypeValueOf = AdType.valueOf(this.adType_);
            return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestOrBuilder
        public int getAdTypeValue() {
            return this.adType_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<AdRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = getUserIdBytes().isEmpty() ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.userId_);
            if (this.adType_ != AdType.UNKNOWN.getNumber()) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.adType_);
            }
            long j10 = this.timestamp_;
            if (j10 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(3, j10);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestOrBuilder
        public String getUserId() {
            Object obj = this.userId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.userId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestOrBuilder
        public ByteString getUserIdBytes() {
            Object obj = this.userId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUserId().hashCode()) * 37) + 2) * 53) + this.adType_) * 37) + 3) * 53) + Internal.hashLong(getTimestamp())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
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
            return new AdRequest();
        }

        private AdRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionDepth.internal_static_sessionmetrics_AdRequest_descriptor;
        }

        public static AdRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AdRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public AdRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SessionDepth.internal_static_sessionmetrics_AdRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AdRequest.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getUserIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.userId_);
            }
            if (this.adType_ != AdType.UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(2, this.adType_);
            }
            long j10 = this.timestamp_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(3, j10);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static AdRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AdRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.userId_ = "";
            this.adType_ = 0;
        }

        public static AdRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AdRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AdRequest parseFrom(InputStream inputStream) throws IOException {
            return (AdRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private AdRequest(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                this.userId_ = codedInputStream.readStringRequireUtf8();
                            } else if (tag == 16) {
                                this.adType_ = codedInputStream.readEnum();
                            } else if (tag != 24) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.timestamp_ = codedInputStream.readInt64();
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

        public static AdRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AdRequest parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AdRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AdRequestMetrics extends GeneratedMessageV3 implements AdRequestMetricsOrBuilder {
        public static final int AD_TYPE_FIELD_NUMBER = 1;
        private static final AdRequestMetrics DEFAULT_INSTANCE = new AdRequestMetrics();
        private static final Parser<AdRequestMetrics> PARSER = new AbstractParser<AdRequestMetrics>() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestMetrics.1
            @Override // com.explorestack.protobuf.Parser
            public AdRequestMetrics parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AdRequestMetrics(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int WINDOW_METRICS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int adType_;
        private byte memoizedIsInitialized;
        private WindowMetrics windowMetrics_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdRequestMetricsOrBuilder {
            private int adType_;
            private SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> windowMetricsBuilder_;
            private WindowMetrics windowMetrics_;

            public Builder clearAdType() {
                this.adType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setWindowMetrics(WindowMetrics windowMetrics) {
                SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> singleFieldBuilderV3 = this.windowMetricsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    windowMetrics.getClass();
                    this.windowMetrics_ = windowMetrics;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(windowMetrics);
                }
                return this;
            }

            private SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> getWindowMetricsFieldBuilder() {
                if (this.windowMetricsBuilder_ == null) {
                    this.windowMetricsBuilder_ = new SingleFieldBuilderV3<>(getWindowMetrics(), getParentForChildren(), isClean());
                    this.windowMetrics_ = null;
                }
                return this.windowMetricsBuilder_;
            }

            public Builder clearWindowMetrics() {
                if (this.windowMetricsBuilder_ == null) {
                    this.windowMetrics_ = null;
                    onChanged();
                } else {
                    this.windowMetrics_ = null;
                    this.windowMetricsBuilder_ = null;
                }
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestMetricsOrBuilder
            public AdType getAdType() {
                AdType adTypeValueOf = AdType.valueOf(this.adType_);
                return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestMetricsOrBuilder
            public int getAdTypeValue() {
                return this.adType_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestMetricsOrBuilder
            public WindowMetrics getWindowMetrics() {
                SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> singleFieldBuilderV3 = this.windowMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WindowMetrics) singleFieldBuilderV3.getMessage();
                }
                WindowMetrics windowMetrics = this.windowMetrics_;
                return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestMetricsOrBuilder
            public WindowMetricsOrBuilder getWindowMetricsOrBuilder() {
                SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> singleFieldBuilderV3 = this.windowMetricsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WindowMetricsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WindowMetrics windowMetrics = this.windowMetrics_;
                return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestMetricsOrBuilder
            public boolean hasWindowMetrics() {
                return (this.windowMetricsBuilder_ == null && this.windowMetrics_ == null) ? false : true;
            }

            public Builder mergeWindowMetrics(WindowMetrics windowMetrics) {
                SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> singleFieldBuilderV3 = this.windowMetricsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    WindowMetrics windowMetrics2 = this.windowMetrics_;
                    if (windowMetrics2 != null) {
                        this.windowMetrics_ = WindowMetrics.newBuilder(windowMetrics2).mergeFrom(windowMetrics).buildPartial();
                    } else {
                        this.windowMetrics_ = windowMetrics;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(windowMetrics);
                }
                return this;
            }

            public Builder setAdTypeValue(int i10) {
                this.adType_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                this.adType_ = 0;
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionDepth.internal_static_sessionmetrics_AdRequestMetrics_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdRequestMetrics build() {
                AdRequestMetrics adRequestMetricsBuildPartial = buildPartial();
                if (adRequestMetricsBuildPartial.isInitialized()) {
                    return adRequestMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) adRequestMetricsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AdRequestMetrics buildPartial() {
                AdRequestMetrics adRequestMetrics = new AdRequestMetrics(this);
                adRequestMetrics.adType_ = this.adType_;
                SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> singleFieldBuilderV3 = this.windowMetricsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    adRequestMetrics.windowMetrics_ = this.windowMetrics_;
                } else {
                    adRequestMetrics.windowMetrics_ = (WindowMetrics) singleFieldBuilderV3.build();
                }
                onBuilt();
                return adRequestMetrics;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public AdRequestMetrics getDefaultInstanceForType() {
                return AdRequestMetrics.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionDepth.internal_static_sessionmetrics_AdRequestMetrics_descriptor;
            }

            public WindowMetrics.Builder getWindowMetricsBuilder() {
                onChanged();
                return (WindowMetrics.Builder) getWindowMetricsFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SessionDepth.internal_static_sessionmetrics_AdRequestMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(AdRequestMetrics.class, Builder.class);
            }

            public Builder setAdType(AdType adType) {
                adType.getClass();
                this.adType_ = adType.getNumber();
                onChanged();
                return this;
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

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.adType_ = 0;
                if (this.windowMetricsBuilder_ == null) {
                    this.windowMetrics_ = null;
                } else {
                    this.windowMetrics_ = null;
                    this.windowMetricsBuilder_ = null;
                }
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.adType_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setWindowMetrics(WindowMetrics.Builder builder) {
                SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> singleFieldBuilderV3 = this.windowMetricsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.windowMetrics_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
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
                if (message instanceof AdRequestMetrics) {
                    return mergeFrom((AdRequestMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AdRequestMetrics adRequestMetrics) {
                if (adRequestMetrics == AdRequestMetrics.getDefaultInstance()) {
                    return this;
                }
                if (adRequestMetrics.adType_ != 0) {
                    setAdTypeValue(adRequestMetrics.getAdTypeValue());
                }
                if (adRequestMetrics.hasWindowMetrics()) {
                    mergeWindowMetrics(adRequestMetrics.getWindowMetrics());
                }
                mergeUnknownFields(adRequestMetrics.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                AdRequestMetrics adRequestMetrics = null;
                try {
                    try {
                        AdRequestMetrics adRequestMetrics2 = (AdRequestMetrics) AdRequestMetrics.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (adRequestMetrics2 != null) {
                            mergeFrom(adRequestMetrics2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        AdRequestMetrics adRequestMetrics3 = (AdRequestMetrics) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            adRequestMetrics = adRequestMetrics3;
                            if (adRequestMetrics != null) {
                                mergeFrom(adRequestMetrics);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (adRequestMetrics != null) {
                        mergeFrom(adRequestMetrics);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AdRequestMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AdRequestMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdRequestMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdRequestMetrics)) {
                return super.equals(obj);
            }
            AdRequestMetrics adRequestMetrics = (AdRequestMetrics) obj;
            if (this.adType_ == adRequestMetrics.adType_ && hasWindowMetrics() == adRequestMetrics.hasWindowMetrics()) {
                return (!hasWindowMetrics() || getWindowMetrics().equals(adRequestMetrics.getWindowMetrics())) && this.unknownFields.equals(adRequestMetrics.unknownFields);
            }
            return false;
        }

        public static AdRequestMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(AdRequestMetrics adRequestMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adRequestMetrics);
        }

        public static AdRequestMetrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<AdRequestMetrics> parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestMetricsOrBuilder
        public AdType getAdType() {
            AdType adTypeValueOf = AdType.valueOf(this.adType_);
            return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestMetricsOrBuilder
        public int getAdTypeValue() {
            return this.adType_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<AdRequestMetrics> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeEnumSize = this.adType_ != AdType.UNKNOWN.getNumber() ? 0 + CodedOutputStream.computeEnumSize(1, this.adType_) : 0;
            if (this.windowMetrics_ != null) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getWindowMetrics());
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestMetricsOrBuilder
        public WindowMetrics getWindowMetrics() {
            WindowMetrics windowMetrics = this.windowMetrics_;
            return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestMetricsOrBuilder
        public boolean hasWindowMetrics() {
            return this.windowMetrics_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.adType_;
            if (hasWindowMetrics()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getWindowMetrics().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
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
            return new AdRequestMetrics();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.adType_ != AdType.UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.adType_);
            }
            if (this.windowMetrics_ != null) {
                codedOutputStream.writeMessage(2, getWindowMetrics());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AdRequestMetrics(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionDepth.internal_static_sessionmetrics_AdRequestMetrics_descriptor;
        }

        public static AdRequestMetrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdRequestMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AdRequestMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public AdRequestMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdRequestMetricsOrBuilder
        public WindowMetricsOrBuilder getWindowMetricsOrBuilder() {
            return getWindowMetrics();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SessionDepth.internal_static_sessionmetrics_AdRequestMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(AdRequestMetrics.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AdRequestMetrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AdRequestMetrics() {
            this.memoizedIsInitialized = (byte) -1;
            this.adType_ = 0;
        }

        public static AdRequestMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AdRequestMetrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AdRequestMetrics parseFrom(InputStream inputStream) throws IOException {
            return (AdRequestMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private AdRequestMetrics(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.adType_ = codedInputStream.readEnum();
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                WindowMetrics windowMetrics = this.windowMetrics_;
                                WindowMetrics.Builder builder = windowMetrics != null ? windowMetrics.toBuilder() : null;
                                WindowMetrics windowMetrics2 = (WindowMetrics) codedInputStream.readMessage(WindowMetrics.parser(), extensionRegistryLite);
                                this.windowMetrics_ = windowMetrics2;
                                if (builder != null) {
                                    builder.mergeFrom(windowMetrics2);
                                    this.windowMetrics_ = builder.buildPartial();
                                }
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

        public static AdRequestMetrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdRequestMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AdRequestMetrics parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AdRequestMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AdRequestMetrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AdRequestMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AdRequestMetricsOrBuilder extends MessageOrBuilder {
        AdType getAdType();

        int getAdTypeValue();

        WindowMetrics getWindowMetrics();

        WindowMetricsOrBuilder getWindowMetricsOrBuilder();

        boolean hasWindowMetrics();
    }

    public interface AdRequestOrBuilder extends MessageOrBuilder {
        AdType getAdType();

        int getAdTypeValue();

        long getTimestamp();

        String getUserId();

        ByteString getUserIdBytes();
    }

    public enum AdType implements ProtocolMessageEnum {
        UNKNOWN(0),
        INTERSTITIAL(1),
        REWARDED(2),
        BANNER(3),
        UNRECOGNIZED(-1);

        public static final int BANNER_VALUE = 3;
        public static final int INTERSTITIAL_VALUE = 1;
        public static final int REWARDED_VALUE = 2;
        public static final int UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<AdType> internalValueMap = new Internal.EnumLiteMap<AdType>() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionDepth.AdType.1
            @Override // com.explorestack.protobuf.Internal.EnumLiteMap
            public AdType findValueByNumber(int i10) {
                return AdType.forNumber(i10);
            }
        };
        private static final AdType[] VALUES = values();

        public static AdType forNumber(int i10) {
            if (i10 == 0) {
                return UNKNOWN;
            }
            if (i10 == 1) {
                return INTERSTITIAL;
            }
            if (i10 == 2) {
                return REWARDED;
            }
            if (i10 != 3) {
                return null;
            }
            return BANNER;
        }

        public static Internal.EnumLiteMap<AdType> internalGetValueMap() {
            return internalValueMap;
        }

        @Deprecated
        public static AdType valueOf(int i10) {
            return forNumber(i10);
        }

        @Override // com.explorestack.protobuf.ProtocolMessageEnum, com.explorestack.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Override // com.explorestack.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumValueDescriptor getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return getDescriptor().getValues().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        AdType(int i10) {
            this.value = i10;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return SessionDepth.getDescriptor().getEnumTypes().get(0);
        }

        public static AdType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
            if (enumValueDescriptor.getType() == getDescriptor()) {
                if (enumValueDescriptor.getIndex() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[enumValueDescriptor.getIndex()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }

        @Override // com.explorestack.protobuf.ProtocolMessageEnum
        public final Descriptors.EnumDescriptor getDescriptorForType() {
            return getDescriptor();
        }
    }

    public static final class ImpressionMetrics extends GeneratedMessageV3 implements ImpressionMetricsOrBuilder {
        public static final int AD_TYPE_FIELD_NUMBER = 1;
        public static final int DOMAINS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int adType_;
        private List<DomainMetrics> domains_;
        private byte memoizedIsInitialized;
        private static final ImpressionMetrics DEFAULT_INSTANCE = new ImpressionMetrics();
        private static final Parser<ImpressionMetrics> PARSER = new AbstractParser<ImpressionMetrics>() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetrics.1
            @Override // com.explorestack.protobuf.Parser
            public ImpressionMetrics parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ImpressionMetrics(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ImpressionMetricsOrBuilder {
            private int adType_;
            private int bitField0_;
            private RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> domainsBuilder_;
            private List<DomainMetrics> domains_;

            public Builder addDomains(DomainMetrics domainMetrics) {
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    domainMetrics.getClass();
                    ensureDomainsIsMutable();
                    this.domains_.add(domainMetrics);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(domainMetrics);
                }
                return this;
            }

            public DomainMetrics.Builder addDomainsBuilder() {
                return (DomainMetrics.Builder) getDomainsFieldBuilder().addBuilder(DomainMetrics.getDefaultInstance());
            }

            public Builder clearAdType() {
                this.adType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDomains(int i10, DomainMetrics domainMetrics) {
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    domainMetrics.getClass();
                    ensureDomainsIsMutable();
                    this.domains_.set(i10, domainMetrics);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i10, domainMetrics);
                }
                return this;
            }

            private void ensureDomainsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.domains_ = new ArrayList(this.domains_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> getDomainsFieldBuilder() {
                if (this.domainsBuilder_ == null) {
                    this.domainsBuilder_ = new RepeatedFieldBuilderV3<>(this.domains_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.domains_ = null;
                }
                return this.domainsBuilder_;
            }

            public Builder addAllDomains(Iterable<? extends DomainMetrics> iterable) {
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDomainsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.domains_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearDomains() {
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.domains_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetricsOrBuilder
            public AdType getAdType() {
                AdType adTypeValueOf = AdType.valueOf(this.adType_);
                return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetricsOrBuilder
            public int getAdTypeValue() {
                return this.adType_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetricsOrBuilder
            public DomainMetrics getDomains(int i10) {
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.domains_.get(i10) : (DomainMetrics) repeatedFieldBuilderV3.getMessage(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetricsOrBuilder
            public int getDomainsCount() {
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.domains_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetricsOrBuilder
            public List<DomainMetrics> getDomainsList() {
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.domains_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetricsOrBuilder
            public DomainMetricsOrBuilder getDomainsOrBuilder(int i10) {
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.domains_.get(i10) : (DomainMetricsOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetricsOrBuilder
            public List<? extends DomainMetricsOrBuilder> getDomainsOrBuilderList() {
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.domains_);
            }

            public Builder removeDomains(int i10) {
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDomainsIsMutable();
                    this.domains_.remove(i10);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i10);
                }
                return this;
            }

            public Builder setAdTypeValue(int i10) {
                this.adType_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                this.adType_ = 0;
                this.domains_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionDepth.internal_static_sessionmetrics_ImpressionMetrics_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDomainsFieldBuilder();
                }
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ImpressionMetrics build() {
                ImpressionMetrics impressionMetricsBuildPartial = buildPartial();
                if (impressionMetricsBuildPartial.isInitialized()) {
                    return impressionMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) impressionMetricsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ImpressionMetrics buildPartial() {
                ImpressionMetrics impressionMetrics = new ImpressionMetrics(this);
                impressionMetrics.adType_ = this.adType_;
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    impressionMetrics.domains_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.domains_ = Collections.unmodifiableList(this.domains_);
                        this.bitField0_ &= -2;
                    }
                    impressionMetrics.domains_ = this.domains_;
                }
                onBuilt();
                return impressionMetrics;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public ImpressionMetrics getDefaultInstanceForType() {
                return ImpressionMetrics.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionDepth.internal_static_sessionmetrics_ImpressionMetrics_descriptor;
            }

            public DomainMetrics.Builder getDomainsBuilder(int i10) {
                return (DomainMetrics.Builder) getDomainsFieldBuilder().getBuilder(i10);
            }

            public List<DomainMetrics.Builder> getDomainsBuilderList() {
                return getDomainsFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SessionDepth.internal_static_sessionmetrics_ImpressionMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(ImpressionMetrics.class, Builder.class);
            }

            public Builder setAdType(AdType adType) {
                adType.getClass();
                this.adType_ = adType.getNumber();
                onChanged();
                return this;
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

            public DomainMetrics.Builder addDomainsBuilder(int i10) {
                return (DomainMetrics.Builder) getDomainsFieldBuilder().addBuilder(i10, DomainMetrics.getDefaultInstance());
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
                this.adType_ = 0;
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.domains_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.adType_ = 0;
                this.domains_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addDomains(int i10, DomainMetrics domainMetrics) {
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    domainMetrics.getClass();
                    ensureDomainsIsMutable();
                    this.domains_.add(i10, domainMetrics);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i10, domainMetrics);
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
                if (message instanceof ImpressionMetrics) {
                    return mergeFrom((ImpressionMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDomains(int i10, DomainMetrics.Builder builder) {
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDomainsIsMutable();
                    this.domains_.set(i10, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i10, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(ImpressionMetrics impressionMetrics) {
                if (impressionMetrics == ImpressionMetrics.getDefaultInstance()) {
                    return this;
                }
                if (impressionMetrics.adType_ != 0) {
                    setAdTypeValue(impressionMetrics.getAdTypeValue());
                }
                if (this.domainsBuilder_ == null) {
                    if (!impressionMetrics.domains_.isEmpty()) {
                        if (this.domains_.isEmpty()) {
                            this.domains_ = impressionMetrics.domains_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDomainsIsMutable();
                            this.domains_.addAll(impressionMetrics.domains_);
                        }
                        onChanged();
                    }
                } else if (!impressionMetrics.domains_.isEmpty()) {
                    if (!this.domainsBuilder_.isEmpty()) {
                        this.domainsBuilder_.addAllMessages(impressionMetrics.domains_);
                    } else {
                        this.domainsBuilder_.dispose();
                        this.domainsBuilder_ = null;
                        this.domains_ = impressionMetrics.domains_;
                        this.bitField0_ &= -2;
                        this.domainsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getDomainsFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(impressionMetrics.unknownFields);
                onChanged();
                return this;
            }

            public Builder addDomains(DomainMetrics.Builder builder) {
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDomainsIsMutable();
                    this.domains_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addDomains(int i10, DomainMetrics.Builder builder) {
                RepeatedFieldBuilderV3<DomainMetrics, DomainMetrics.Builder, DomainMetricsOrBuilder> repeatedFieldBuilderV3 = this.domainsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDomainsIsMutable();
                    this.domains_.add(i10, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i10, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                ImpressionMetrics impressionMetrics = null;
                try {
                    try {
                        ImpressionMetrics impressionMetrics2 = (ImpressionMetrics) ImpressionMetrics.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (impressionMetrics2 != null) {
                            mergeFrom(impressionMetrics2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        ImpressionMetrics impressionMetrics3 = (ImpressionMetrics) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            impressionMetrics = impressionMetrics3;
                            if (impressionMetrics != null) {
                                mergeFrom(impressionMetrics);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (impressionMetrics != null) {
                        mergeFrom(impressionMetrics);
                    }
                    throw th;
                }
            }
        }

        public static final class DomainMetrics extends GeneratedMessageV3 implements DomainMetricsOrBuilder {
            public static final int DOMAIN_FIELD_NUMBER = 1;
            public static final int WINDOW_METRICS_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private volatile Object domain_;
            private byte memoizedIsInitialized;
            private WindowMetrics windowMetrics_;
            private static final DomainMetrics DEFAULT_INSTANCE = new DomainMetrics();
            private static final Parser<DomainMetrics> PARSER = new AbstractParser<DomainMetrics>() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetrics.DomainMetrics.1
                @Override // com.explorestack.protobuf.Parser
                public DomainMetrics parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new DomainMetrics(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DomainMetricsOrBuilder {
                private Object domain_;
                private SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> windowMetricsBuilder_;
                private WindowMetrics windowMetrics_;

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setWindowMetrics(WindowMetrics windowMetrics) {
                    SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> singleFieldBuilderV3 = this.windowMetricsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        windowMetrics.getClass();
                        this.windowMetrics_ = windowMetrics;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(windowMetrics);
                    }
                    return this;
                }

                private SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> getWindowMetricsFieldBuilder() {
                    if (this.windowMetricsBuilder_ == null) {
                        this.windowMetricsBuilder_ = new SingleFieldBuilderV3<>(getWindowMetrics(), getParentForChildren(), isClean());
                        this.windowMetrics_ = null;
                    }
                    return this.windowMetricsBuilder_;
                }

                public Builder clearWindowMetrics() {
                    if (this.windowMetricsBuilder_ == null) {
                        this.windowMetrics_ = null;
                        onChanged();
                    } else {
                        this.windowMetrics_ = null;
                        this.windowMetricsBuilder_ = null;
                    }
                    return this;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetrics.DomainMetricsOrBuilder
                public String getDomain() {
                    Object obj = this.domain_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.domain_ = stringUtf8;
                    return stringUtf8;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetrics.DomainMetricsOrBuilder
                public ByteString getDomainBytes() {
                    Object obj = this.domain_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.domain_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetrics.DomainMetricsOrBuilder
                public WindowMetrics getWindowMetrics() {
                    SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> singleFieldBuilderV3 = this.windowMetricsBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (WindowMetrics) singleFieldBuilderV3.getMessage();
                    }
                    WindowMetrics windowMetrics = this.windowMetrics_;
                    return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetrics.DomainMetricsOrBuilder
                public WindowMetricsOrBuilder getWindowMetricsOrBuilder() {
                    SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> singleFieldBuilderV3 = this.windowMetricsBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (WindowMetricsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    WindowMetrics windowMetrics = this.windowMetrics_;
                    return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetrics.DomainMetricsOrBuilder
                public boolean hasWindowMetrics() {
                    return (this.windowMetricsBuilder_ == null && this.windowMetrics_ == null) ? false : true;
                }

                public Builder mergeWindowMetrics(WindowMetrics windowMetrics) {
                    SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> singleFieldBuilderV3 = this.windowMetricsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        WindowMetrics windowMetrics2 = this.windowMetrics_;
                        if (windowMetrics2 != null) {
                            this.windowMetrics_ = WindowMetrics.newBuilder(windowMetrics2).mergeFrom(windowMetrics).buildPartial();
                        } else {
                            this.windowMetrics_ = windowMetrics;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(windowMetrics);
                    }
                    return this;
                }

                private Builder() {
                    this.domain_ = "";
                    maybeForceBuilderInitialization();
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SessionDepth.internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DomainMetrics build() {
                    DomainMetrics domainMetricsBuildPartial = buildPartial();
                    if (domainMetricsBuildPartial.isInitialized()) {
                        return domainMetricsBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) domainMetricsBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DomainMetrics buildPartial() {
                    DomainMetrics domainMetrics = new DomainMetrics(this);
                    domainMetrics.domain_ = this.domain_;
                    SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> singleFieldBuilderV3 = this.windowMetricsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        domainMetrics.windowMetrics_ = this.windowMetrics_;
                    } else {
                        domainMetrics.windowMetrics_ = (WindowMetrics) singleFieldBuilderV3.build();
                    }
                    onBuilt();
                    return domainMetrics;
                }

                public Builder clearDomain() {
                    this.domain_ = DomainMetrics.getDefaultInstance().getDomain();
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public DomainMetrics getDefaultInstanceForType() {
                    return DomainMetrics.getDefaultInstance();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SessionDepth.internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_descriptor;
                }

                public WindowMetrics.Builder getWindowMetricsBuilder() {
                    onChanged();
                    return (WindowMetrics.Builder) getWindowMetricsFieldBuilder().getBuilder();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SessionDepth.internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(DomainMetrics.class, Builder.class);
                }

                public Builder setDomain(String str) {
                    str.getClass();
                    this.domain_ = str;
                    onChanged();
                    return this;
                }

                public Builder setDomainBytes(ByteString byteString) {
                    byteString.getClass();
                    AbstractMessageLite.checkByteStringIsUtf8(byteString);
                    this.domain_ = byteString;
                    onChanged();
                    return this;
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

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.domain_ = "";
                    if (this.windowMetricsBuilder_ == null) {
                        this.windowMetrics_ = null;
                    } else {
                        this.windowMetrics_ = null;
                        this.windowMetricsBuilder_ = null;
                    }
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.domain_ = "";
                    maybeForceBuilderInitialization();
                }

                public Builder setWindowMetrics(WindowMetrics.Builder builder) {
                    SingleFieldBuilderV3<WindowMetrics, WindowMetrics.Builder, WindowMetricsOrBuilder> singleFieldBuilderV3 = this.windowMetricsBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.windowMetrics_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
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
                    if (message instanceof DomainMetrics) {
                        return mergeFrom((DomainMetrics) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(DomainMetrics domainMetrics) {
                    if (domainMetrics == DomainMetrics.getDefaultInstance()) {
                        return this;
                    }
                    if (!domainMetrics.getDomain().isEmpty()) {
                        this.domain_ = domainMetrics.domain_;
                        onChanged();
                    }
                    if (domainMetrics.hasWindowMetrics()) {
                        mergeWindowMetrics(domainMetrics.getWindowMetrics());
                    }
                    mergeUnknownFields(domainMetrics.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    DomainMetrics domainMetrics = null;
                    try {
                        try {
                            DomainMetrics domainMetrics2 = (DomainMetrics) DomainMetrics.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (domainMetrics2 != null) {
                                mergeFrom(domainMetrics2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            DomainMetrics domainMetrics3 = (DomainMetrics) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th2) {
                                th = th2;
                                domainMetrics = domainMetrics3;
                                if (domainMetrics != null) {
                                    mergeFrom(domainMetrics);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (domainMetrics != null) {
                            mergeFrom(domainMetrics);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static DomainMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (DomainMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static DomainMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DomainMetrics)) {
                    return super.equals(obj);
                }
                DomainMetrics domainMetrics = (DomainMetrics) obj;
                if (getDomain().equals(domainMetrics.getDomain()) && hasWindowMetrics() == domainMetrics.hasWindowMetrics()) {
                    return (!hasWindowMetrics() || getWindowMetrics().equals(domainMetrics.getWindowMetrics())) && this.unknownFields.equals(domainMetrics.unknownFields);
                }
                return false;
            }

            public static DomainMetrics getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder(DomainMetrics domainMetrics) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(domainMetrics);
            }

            public static DomainMetrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Parser<DomainMetrics> parser() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetrics.DomainMetricsOrBuilder
            public String getDomain() {
                Object obj = this.domain_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.domain_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetrics.DomainMetricsOrBuilder
            public ByteString getDomainBytes() {
                Object obj = this.domain_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.domain_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Parser<DomainMetrics> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = getDomainBytes().isEmpty() ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.domain_);
                if (this.windowMetrics_ != null) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(2, getWindowMetrics());
                }
                int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetrics.DomainMetricsOrBuilder
            public WindowMetrics getWindowMetrics() {
                WindowMetrics windowMetrics = this.windowMetrics_;
                return windowMetrics == null ? WindowMetrics.getDefaultInstance() : windowMetrics;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetrics.DomainMetricsOrBuilder
            public boolean hasWindowMetrics() {
                return this.windowMetrics_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getDomain().hashCode();
                if (hasWindowMetrics()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getWindowMetrics().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
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
                return new DomainMetrics();
            }

            private DomainMetrics(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionDepth.internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_descriptor;
            }

            public static DomainMetrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (DomainMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static DomainMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public DomainMetrics getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetrics.DomainMetricsOrBuilder
            public WindowMetricsOrBuilder getWindowMetricsOrBuilder() {
                return getWindowMetrics();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SessionDepth.internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(DomainMetrics.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (!getDomainBytes().isEmpty()) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.domain_);
                }
                if (this.windowMetrics_ != null) {
                    codedOutputStream.writeMessage(2, getWindowMetrics());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static DomainMetrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private DomainMetrics() {
                this.memoizedIsInitialized = (byte) -1;
                this.domain_ = "";
            }

            public static DomainMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static DomainMetrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static DomainMetrics parseFrom(InputStream inputStream) throws IOException {
                return (DomainMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            private DomainMetrics(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.domain_ = codedInputStream.readStringRequireUtf8();
                                } else if (tag != 18) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    WindowMetrics windowMetrics = this.windowMetrics_;
                                    WindowMetrics.Builder builder = windowMetrics != null ? windowMetrics.toBuilder() : null;
                                    WindowMetrics windowMetrics2 = (WindowMetrics) codedInputStream.readMessage(WindowMetrics.parser(), extensionRegistryLite);
                                    this.windowMetrics_ = windowMetrics2;
                                    if (builder != null) {
                                        builder.mergeFrom(windowMetrics2);
                                        this.windowMetrics_ = builder.buildPartial();
                                    }
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

            public static DomainMetrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (DomainMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static DomainMetrics parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (DomainMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static DomainMetrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (DomainMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface DomainMetricsOrBuilder extends MessageOrBuilder {
            String getDomain();

            ByteString getDomainBytes();

            WindowMetrics getWindowMetrics();

            WindowMetricsOrBuilder getWindowMetricsOrBuilder();

            boolean hasWindowMetrics();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ImpressionMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ImpressionMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ImpressionMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ImpressionMetrics)) {
                return super.equals(obj);
            }
            ImpressionMetrics impressionMetrics = (ImpressionMetrics) obj;
            return this.adType_ == impressionMetrics.adType_ && getDomainsList().equals(impressionMetrics.getDomainsList()) && this.unknownFields.equals(impressionMetrics.unknownFields);
        }

        public static ImpressionMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(ImpressionMetrics impressionMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(impressionMetrics);
        }

        public static ImpressionMetrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<ImpressionMetrics> parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetricsOrBuilder
        public AdType getAdType() {
            AdType adTypeValueOf = AdType.valueOf(this.adType_);
            return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetricsOrBuilder
        public int getAdTypeValue() {
            return this.adType_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetricsOrBuilder
        public DomainMetrics getDomains(int i10) {
            return this.domains_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetricsOrBuilder
        public int getDomainsCount() {
            return this.domains_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetricsOrBuilder
        public List<DomainMetrics> getDomainsList() {
            return this.domains_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetricsOrBuilder
        public DomainMetricsOrBuilder getDomainsOrBuilder(int i10) {
            return this.domains_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.ImpressionMetricsOrBuilder
        public List<? extends DomainMetricsOrBuilder> getDomainsOrBuilderList() {
            return this.domains_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<ImpressionMetrics> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeEnumSize = this.adType_ != AdType.UNKNOWN.getNumber() ? CodedOutputStream.computeEnumSize(1, this.adType_) + 0 : 0;
            for (int i11 = 0; i11 < this.domains_.size(); i11++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.domains_.get(i11));
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
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
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.adType_;
            if (getDomainsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getDomainsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
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
            return new ImpressionMetrics();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.adType_ != AdType.UNKNOWN.getNumber()) {
                codedOutputStream.writeEnum(1, this.adType_);
            }
            for (int i10 = 0; i10 < this.domains_.size(); i10++) {
                codedOutputStream.writeMessage(2, this.domains_.get(i10));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private ImpressionMetrics(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionDepth.internal_static_sessionmetrics_ImpressionMetrics_descriptor;
        }

        public static ImpressionMetrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImpressionMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ImpressionMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public ImpressionMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SessionDepth.internal_static_sessionmetrics_ImpressionMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(ImpressionMetrics.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static ImpressionMetrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ImpressionMetrics() {
            this.memoizedIsInitialized = (byte) -1;
            this.adType_ = 0;
            this.domains_ = Collections.emptyList();
        }

        public static ImpressionMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ImpressionMetrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ImpressionMetrics parseFrom(InputStream inputStream) throws IOException {
            return (ImpressionMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private ImpressionMetrics(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.adType_ = codedInputStream.readEnum();
                            } else if (tag != 18) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z11 & true)) {
                                    this.domains_ = new ArrayList();
                                    z11 |= true;
                                }
                                this.domains_.add((DomainMetrics) codedInputStream.readMessage(DomainMetrics.parser(), extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if (z11 & true) {
                        this.domains_ = Collections.unmodifiableList(this.domains_);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11 & true) {
                this.domains_ = Collections.unmodifiableList(this.domains_);
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static ImpressionMetrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImpressionMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ImpressionMetrics parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ImpressionMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ImpressionMetrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ImpressionMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ImpressionMetricsOrBuilder extends MessageOrBuilder {
        AdType getAdType();

        int getAdTypeValue();

        ImpressionMetrics.DomainMetrics getDomains(int i10);

        int getDomainsCount();

        List<ImpressionMetrics.DomainMetrics> getDomainsList();

        ImpressionMetrics.DomainMetricsOrBuilder getDomainsOrBuilder(int i10);

        List<? extends ImpressionMetrics.DomainMetricsOrBuilder> getDomainsOrBuilderList();
    }

    public static final class SessionMetrics extends GeneratedMessageV3 implements SessionMetricsOrBuilder {
        public static final int AD_REQUESTS_FIELD_NUMBER = 2;
        public static final int CURRENT_SESSION_FIELD_NUMBER = 3;
        public static final int IMPRESSIONS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<AdRequestMetrics> adRequests_;
        private UserSession currentSession_;
        private List<ImpressionMetrics> impressions_;
        private byte memoizedIsInitialized;
        private static final SessionMetrics DEFAULT_INSTANCE = new SessionMetrics();
        private static final Parser<SessionMetrics> PARSER = new AbstractParser<SessionMetrics>() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetrics.1
            @Override // com.explorestack.protobuf.Parser
            public SessionMetrics parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new SessionMetrics(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SessionMetricsOrBuilder {
            private RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> adRequestsBuilder_;
            private List<AdRequestMetrics> adRequests_;
            private int bitField0_;
            private SingleFieldBuilderV3<UserSession, UserSession.Builder, UserSessionOrBuilder> currentSessionBuilder_;
            private UserSession currentSession_;
            private RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> impressionsBuilder_;
            private List<ImpressionMetrics> impressions_;

            public Builder addAdRequests(AdRequestMetrics adRequestMetrics) {
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV3 = this.adRequestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    adRequestMetrics.getClass();
                    ensureAdRequestsIsMutable();
                    this.adRequests_.add(adRequestMetrics);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(adRequestMetrics);
                }
                return this;
            }

            public AdRequestMetrics.Builder addAdRequestsBuilder() {
                return (AdRequestMetrics.Builder) getAdRequestsFieldBuilder().addBuilder(AdRequestMetrics.getDefaultInstance());
            }

            public Builder addImpressions(ImpressionMetrics impressionMetrics) {
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    impressionMetrics.getClass();
                    ensureImpressionsIsMutable();
                    this.impressions_.add(impressionMetrics);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(impressionMetrics);
                }
                return this;
            }

            public ImpressionMetrics.Builder addImpressionsBuilder() {
                return (ImpressionMetrics.Builder) getImpressionsFieldBuilder().addBuilder(ImpressionMetrics.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAdRequests(int i10, AdRequestMetrics adRequestMetrics) {
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV3 = this.adRequestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    adRequestMetrics.getClass();
                    ensureAdRequestsIsMutable();
                    this.adRequests_.set(i10, adRequestMetrics);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i10, adRequestMetrics);
                }
                return this;
            }

            public Builder setCurrentSession(UserSession userSession) {
                SingleFieldBuilderV3<UserSession, UserSession.Builder, UserSessionOrBuilder> singleFieldBuilderV3 = this.currentSessionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    userSession.getClass();
                    this.currentSession_ = userSession;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(userSession);
                }
                return this;
            }

            public Builder setImpressions(int i10, ImpressionMetrics impressionMetrics) {
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    impressionMetrics.getClass();
                    ensureImpressionsIsMutable();
                    this.impressions_.set(i10, impressionMetrics);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i10, impressionMetrics);
                }
                return this;
            }

            private void ensureAdRequestsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.adRequests_ = new ArrayList(this.adRequests_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureImpressionsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.impressions_ = new ArrayList(this.impressions_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> getAdRequestsFieldBuilder() {
                if (this.adRequestsBuilder_ == null) {
                    this.adRequestsBuilder_ = new RepeatedFieldBuilderV3<>(this.adRequests_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.adRequests_ = null;
                }
                return this.adRequestsBuilder_;
            }

            private SingleFieldBuilderV3<UserSession, UserSession.Builder, UserSessionOrBuilder> getCurrentSessionFieldBuilder() {
                if (this.currentSessionBuilder_ == null) {
                    this.currentSessionBuilder_ = new SingleFieldBuilderV3<>(getCurrentSession(), getParentForChildren(), isClean());
                    this.currentSession_ = null;
                }
                return this.currentSessionBuilder_;
            }

            private RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> getImpressionsFieldBuilder() {
                if (this.impressionsBuilder_ == null) {
                    this.impressionsBuilder_ = new RepeatedFieldBuilderV3<>(this.impressions_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.impressions_ = null;
                }
                return this.impressionsBuilder_;
            }

            public Builder addAllAdRequests(Iterable<? extends AdRequestMetrics> iterable) {
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV3 = this.adRequestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAdRequestsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.adRequests_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder addAllImpressions(Iterable<? extends ImpressionMetrics> iterable) {
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureImpressionsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.impressions_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearAdRequests() {
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV3 = this.adRequestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.adRequests_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder clearCurrentSession() {
                if (this.currentSessionBuilder_ == null) {
                    this.currentSession_ = null;
                    onChanged();
                } else {
                    this.currentSession_ = null;
                    this.currentSessionBuilder_ = null;
                }
                return this;
            }

            public Builder clearImpressions() {
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.impressions_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
            public AdRequestMetrics getAdRequests(int i10) {
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV3 = this.adRequestsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.adRequests_.get(i10) : (AdRequestMetrics) repeatedFieldBuilderV3.getMessage(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
            public int getAdRequestsCount() {
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV3 = this.adRequestsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.adRequests_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
            public List<AdRequestMetrics> getAdRequestsList() {
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV3 = this.adRequestsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.adRequests_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
            public AdRequestMetricsOrBuilder getAdRequestsOrBuilder(int i10) {
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV3 = this.adRequestsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.adRequests_.get(i10) : (AdRequestMetricsOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
            public List<? extends AdRequestMetricsOrBuilder> getAdRequestsOrBuilderList() {
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV3 = this.adRequestsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.adRequests_);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
            public UserSession getCurrentSession() {
                SingleFieldBuilderV3<UserSession, UserSession.Builder, UserSessionOrBuilder> singleFieldBuilderV3 = this.currentSessionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UserSession) singleFieldBuilderV3.getMessage();
                }
                UserSession userSession = this.currentSession_;
                return userSession == null ? UserSession.getDefaultInstance() : userSession;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
            public UserSessionOrBuilder getCurrentSessionOrBuilder() {
                SingleFieldBuilderV3<UserSession, UserSession.Builder, UserSessionOrBuilder> singleFieldBuilderV3 = this.currentSessionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UserSessionOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UserSession userSession = this.currentSession_;
                return userSession == null ? UserSession.getDefaultInstance() : userSession;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
            public ImpressionMetrics getImpressions(int i10) {
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.impressions_.get(i10) : (ImpressionMetrics) repeatedFieldBuilderV3.getMessage(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
            public int getImpressionsCount() {
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.impressions_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
            public List<ImpressionMetrics> getImpressionsList() {
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.impressions_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
            public ImpressionMetricsOrBuilder getImpressionsOrBuilder(int i10) {
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.impressions_.get(i10) : (ImpressionMetricsOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
            public List<? extends ImpressionMetricsOrBuilder> getImpressionsOrBuilderList() {
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.impressions_);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
            public boolean hasCurrentSession() {
                return (this.currentSessionBuilder_ == null && this.currentSession_ == null) ? false : true;
            }

            public Builder mergeCurrentSession(UserSession userSession) {
                SingleFieldBuilderV3<UserSession, UserSession.Builder, UserSessionOrBuilder> singleFieldBuilderV3 = this.currentSessionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    UserSession userSession2 = this.currentSession_;
                    if (userSession2 != null) {
                        this.currentSession_ = UserSession.newBuilder(userSession2).mergeFrom(userSession).buildPartial();
                    } else {
                        this.currentSession_ = userSession;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(userSession);
                }
                return this;
            }

            public Builder removeAdRequests(int i10) {
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV3 = this.adRequestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAdRequestsIsMutable();
                    this.adRequests_.remove(i10);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i10);
                }
                return this;
            }

            public Builder removeImpressions(int i10) {
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureImpressionsIsMutable();
                    this.impressions_.remove(i10);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i10);
                }
                return this;
            }

            private Builder() {
                this.impressions_ = Collections.emptyList();
                this.adRequests_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionDepth.internal_static_sessionmetrics_SessionMetrics_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getImpressionsFieldBuilder();
                    getAdRequestsFieldBuilder();
                }
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public SessionMetrics build() {
                SessionMetrics sessionMetricsBuildPartial = buildPartial();
                if (sessionMetricsBuildPartial.isInitialized()) {
                    return sessionMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionMetricsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public SessionMetrics buildPartial() {
                SessionMetrics sessionMetrics = new SessionMetrics(this);
                int i10 = this.bitField0_;
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((i10 & 1) != 0) {
                        this.impressions_ = Collections.unmodifiableList(this.impressions_);
                        this.bitField0_ &= -2;
                    }
                    sessionMetrics.impressions_ = this.impressions_;
                } else {
                    sessionMetrics.impressions_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV4 = this.adRequestsBuilder_;
                if (repeatedFieldBuilderV4 != null) {
                    sessionMetrics.adRequests_ = repeatedFieldBuilderV4.build();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.adRequests_ = Collections.unmodifiableList(this.adRequests_);
                        this.bitField0_ &= -3;
                    }
                    sessionMetrics.adRequests_ = this.adRequests_;
                }
                SingleFieldBuilderV3<UserSession, UserSession.Builder, UserSessionOrBuilder> singleFieldBuilderV3 = this.currentSessionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sessionMetrics.currentSession_ = this.currentSession_;
                } else {
                    sessionMetrics.currentSession_ = (UserSession) singleFieldBuilderV3.build();
                }
                onBuilt();
                return sessionMetrics;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public AdRequestMetrics.Builder getAdRequestsBuilder(int i10) {
                return (AdRequestMetrics.Builder) getAdRequestsFieldBuilder().getBuilder(i10);
            }

            public List<AdRequestMetrics.Builder> getAdRequestsBuilderList() {
                return getAdRequestsFieldBuilder().getBuilderList();
            }

            public UserSession.Builder getCurrentSessionBuilder() {
                onChanged();
                return (UserSession.Builder) getCurrentSessionFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public SessionMetrics getDefaultInstanceForType() {
                return SessionMetrics.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionDepth.internal_static_sessionmetrics_SessionMetrics_descriptor;
            }

            public ImpressionMetrics.Builder getImpressionsBuilder(int i10) {
                return (ImpressionMetrics.Builder) getImpressionsFieldBuilder().getBuilder(i10);
            }

            public List<ImpressionMetrics.Builder> getImpressionsBuilderList() {
                return getImpressionsFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SessionDepth.internal_static_sessionmetrics_SessionMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionMetrics.class, Builder.class);
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

            public AdRequestMetrics.Builder addAdRequestsBuilder(int i10) {
                return (AdRequestMetrics.Builder) getAdRequestsFieldBuilder().addBuilder(i10, AdRequestMetrics.getDefaultInstance());
            }

            public ImpressionMetrics.Builder addImpressionsBuilder(int i10) {
                return (ImpressionMetrics.Builder) getImpressionsFieldBuilder().addBuilder(i10, ImpressionMetrics.getDefaultInstance());
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
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.impressions_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV4 = this.adRequestsBuilder_;
                if (repeatedFieldBuilderV4 == null) {
                    this.adRequests_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    repeatedFieldBuilderV4.clear();
                }
                if (this.currentSessionBuilder_ == null) {
                    this.currentSession_ = null;
                } else {
                    this.currentSession_ = null;
                    this.currentSessionBuilder_ = null;
                }
                return this;
            }

            public Builder setCurrentSession(UserSession.Builder builder) {
                SingleFieldBuilderV3<UserSession, UserSession.Builder, UserSessionOrBuilder> singleFieldBuilderV3 = this.currentSessionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.currentSession_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.impressions_ = Collections.emptyList();
                this.adRequests_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addAdRequests(int i10, AdRequestMetrics adRequestMetrics) {
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV3 = this.adRequestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    adRequestMetrics.getClass();
                    ensureAdRequestsIsMutable();
                    this.adRequests_.add(i10, adRequestMetrics);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i10, adRequestMetrics);
                }
                return this;
            }

            public Builder addImpressions(int i10, ImpressionMetrics impressionMetrics) {
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    impressionMetrics.getClass();
                    ensureImpressionsIsMutable();
                    this.impressions_.add(i10, impressionMetrics);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i10, impressionMetrics);
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
                if (message instanceof SessionMetrics) {
                    return mergeFrom((SessionMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setAdRequests(int i10, AdRequestMetrics.Builder builder) {
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV3 = this.adRequestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAdRequestsIsMutable();
                    this.adRequests_.set(i10, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i10, builder.build());
                }
                return this;
            }

            public Builder setImpressions(int i10, ImpressionMetrics.Builder builder) {
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureImpressionsIsMutable();
                    this.impressions_.set(i10, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i10, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(SessionMetrics sessionMetrics) {
                if (sessionMetrics == SessionMetrics.getDefaultInstance()) {
                    return this;
                }
                if (this.impressionsBuilder_ == null) {
                    if (!sessionMetrics.impressions_.isEmpty()) {
                        if (this.impressions_.isEmpty()) {
                            this.impressions_ = sessionMetrics.impressions_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureImpressionsIsMutable();
                            this.impressions_.addAll(sessionMetrics.impressions_);
                        }
                        onChanged();
                    }
                } else if (!sessionMetrics.impressions_.isEmpty()) {
                    if (!this.impressionsBuilder_.isEmpty()) {
                        this.impressionsBuilder_.addAllMessages(sessionMetrics.impressions_);
                    } else {
                        this.impressionsBuilder_.dispose();
                        this.impressionsBuilder_ = null;
                        this.impressions_ = sessionMetrics.impressions_;
                        this.bitField0_ &= -2;
                        this.impressionsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getImpressionsFieldBuilder() : null;
                    }
                }
                if (this.adRequestsBuilder_ == null) {
                    if (!sessionMetrics.adRequests_.isEmpty()) {
                        if (this.adRequests_.isEmpty()) {
                            this.adRequests_ = sessionMetrics.adRequests_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureAdRequestsIsMutable();
                            this.adRequests_.addAll(sessionMetrics.adRequests_);
                        }
                        onChanged();
                    }
                } else if (!sessionMetrics.adRequests_.isEmpty()) {
                    if (!this.adRequestsBuilder_.isEmpty()) {
                        this.adRequestsBuilder_.addAllMessages(sessionMetrics.adRequests_);
                    } else {
                        this.adRequestsBuilder_.dispose();
                        this.adRequestsBuilder_ = null;
                        this.adRequests_ = sessionMetrics.adRequests_;
                        this.bitField0_ &= -3;
                        this.adRequestsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getAdRequestsFieldBuilder() : null;
                    }
                }
                if (sessionMetrics.hasCurrentSession()) {
                    mergeCurrentSession(sessionMetrics.getCurrentSession());
                }
                mergeUnknownFields(sessionMetrics.unknownFields);
                onChanged();
                return this;
            }

            public Builder addAdRequests(AdRequestMetrics.Builder builder) {
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV3 = this.adRequestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAdRequestsIsMutable();
                    this.adRequests_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addImpressions(ImpressionMetrics.Builder builder) {
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureImpressionsIsMutable();
                    this.impressions_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addAdRequests(int i10, AdRequestMetrics.Builder builder) {
                RepeatedFieldBuilderV3<AdRequestMetrics, AdRequestMetrics.Builder, AdRequestMetricsOrBuilder> repeatedFieldBuilderV3 = this.adRequestsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAdRequestsIsMutable();
                    this.adRequests_.add(i10, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i10, builder.build());
                }
                return this;
            }

            public Builder addImpressions(int i10, ImpressionMetrics.Builder builder) {
                RepeatedFieldBuilderV3<ImpressionMetrics, ImpressionMetrics.Builder, ImpressionMetricsOrBuilder> repeatedFieldBuilderV3 = this.impressionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureImpressionsIsMutable();
                    this.impressions_.add(i10, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i10, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                SessionMetrics sessionMetrics = null;
                try {
                    try {
                        SessionMetrics sessionMetrics2 = (SessionMetrics) SessionMetrics.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (sessionMetrics2 != null) {
                            mergeFrom(sessionMetrics2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        SessionMetrics sessionMetrics3 = (SessionMetrics) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            sessionMetrics = sessionMetrics3;
                            if (sessionMetrics != null) {
                                mergeFrom(sessionMetrics);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (sessionMetrics != null) {
                        mergeFrom(sessionMetrics);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SessionMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SessionMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SessionMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SessionMetrics)) {
                return super.equals(obj);
            }
            SessionMetrics sessionMetrics = (SessionMetrics) obj;
            if (getImpressionsList().equals(sessionMetrics.getImpressionsList()) && getAdRequestsList().equals(sessionMetrics.getAdRequestsList()) && hasCurrentSession() == sessionMetrics.hasCurrentSession()) {
                return (!hasCurrentSession() || getCurrentSession().equals(sessionMetrics.getCurrentSession())) && this.unknownFields.equals(sessionMetrics.unknownFields);
            }
            return false;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i10 = 0; i10 < this.impressions_.size(); i10++) {
                codedOutputStream.writeMessage(1, this.impressions_.get(i10));
            }
            for (int i11 = 0; i11 < this.adRequests_.size(); i11++) {
                codedOutputStream.writeMessage(2, this.adRequests_.get(i11));
            }
            if (this.currentSession_ != null) {
                codedOutputStream.writeMessage(3, getCurrentSession());
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static SessionMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(SessionMetrics sessionMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionMetrics);
        }

        public static SessionMetrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<SessionMetrics> parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
        public AdRequestMetrics getAdRequests(int i10) {
            return this.adRequests_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
        public int getAdRequestsCount() {
            return this.adRequests_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
        public List<AdRequestMetrics> getAdRequestsList() {
            return this.adRequests_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
        public AdRequestMetricsOrBuilder getAdRequestsOrBuilder(int i10) {
            return this.adRequests_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
        public List<? extends AdRequestMetricsOrBuilder> getAdRequestsOrBuilderList() {
            return this.adRequests_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
        public UserSession getCurrentSession() {
            UserSession userSession = this.currentSession_;
            return userSession == null ? UserSession.getDefaultInstance() : userSession;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
        public ImpressionMetrics getImpressions(int i10) {
            return this.impressions_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
        public int getImpressionsCount() {
            return this.impressions_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
        public List<ImpressionMetrics> getImpressionsList() {
            return this.impressions_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
        public ImpressionMetricsOrBuilder getImpressionsOrBuilder(int i10) {
            return this.impressions_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
        public List<? extends ImpressionMetricsOrBuilder> getImpressionsOrBuilderList() {
            return this.impressions_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<SessionMetrics> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.impressions_.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.impressions_.get(i11));
            }
            for (int i12 = 0; i12 < this.adRequests_.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.adRequests_.get(i12));
            }
            if (this.currentSession_ != null) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getCurrentSession());
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
        public boolean hasCurrentSession() {
            return this.currentSession_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getImpressionsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getImpressionsList().hashCode();
            }
            if (getAdRequestsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getAdRequestsList().hashCode();
            }
            if (hasCurrentSession()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getCurrentSession().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
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
            return new SessionMetrics();
        }

        private SessionMetrics(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionDepth.internal_static_sessionmetrics_SessionMetrics_descriptor;
        }

        public static SessionMetrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.SessionMetricsOrBuilder
        public UserSessionOrBuilder getCurrentSessionOrBuilder() {
            return getCurrentSession();
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public SessionMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SessionDepth.internal_static_sessionmetrics_SessionMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionMetrics.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SessionMetrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SessionMetrics() {
            this.memoizedIsInitialized = (byte) -1;
            this.impressions_ = Collections.emptyList();
            this.adRequests_ = Collections.emptyList();
        }

        public static SessionMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static SessionMetrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SessionMetrics parseFrom(InputStream inputStream) throws IOException {
            return (SessionMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private SessionMetrics(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                        this.impressions_ = new ArrayList();
                                        i10 |= 1;
                                    }
                                    this.impressions_.add((ImpressionMetrics) codedInputStream.readMessage(ImpressionMetrics.parser(), extensionRegistryLite));
                                } else if (tag == 18) {
                                    if ((i10 & 2) == 0) {
                                        this.adRequests_ = new ArrayList();
                                        i10 |= 2;
                                    }
                                    this.adRequests_.add((AdRequestMetrics) codedInputStream.readMessage(AdRequestMetrics.parser(), extensionRegistryLite));
                                } else if (tag != 26) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    UserSession userSession = this.currentSession_;
                                    UserSession.Builder builder = userSession != null ? userSession.toBuilder() : null;
                                    UserSession userSession2 = (UserSession) codedInputStream.readMessage(UserSession.parser(), extensionRegistryLite);
                                    this.currentSession_ = userSession2;
                                    if (builder != null) {
                                        builder.mergeFrom(userSession2);
                                        this.currentSession_ = builder.buildPartial();
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
                        this.impressions_ = Collections.unmodifiableList(this.impressions_);
                    }
                    if ((i10 & 2) != 0) {
                        this.adRequests_ = Collections.unmodifiableList(this.adRequests_);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 1) != 0) {
                this.impressions_ = Collections.unmodifiableList(this.impressions_);
            }
            if ((i10 & 2) != 0) {
                this.adRequests_ = Collections.unmodifiableList(this.adRequests_);
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static SessionMetrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionMetrics parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SessionMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SessionMetrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SessionMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SessionMetricsOrBuilder extends MessageOrBuilder {
        AdRequestMetrics getAdRequests(int i10);

        int getAdRequestsCount();

        List<AdRequestMetrics> getAdRequestsList();

        AdRequestMetricsOrBuilder getAdRequestsOrBuilder(int i10);

        List<? extends AdRequestMetricsOrBuilder> getAdRequestsOrBuilderList();

        UserSession getCurrentSession();

        UserSessionOrBuilder getCurrentSessionOrBuilder();

        ImpressionMetrics getImpressions(int i10);

        int getImpressionsCount();

        List<ImpressionMetrics> getImpressionsList();

        ImpressionMetricsOrBuilder getImpressionsOrBuilder(int i10);

        List<? extends ImpressionMetricsOrBuilder> getImpressionsOrBuilderList();

        boolean hasCurrentSession();
    }

    public static final class Timestamps extends GeneratedMessageV3 implements TimestampsOrBuilder {
        public static final int DAY_BUCKETS_FIELD_NUMBER = 3;
        public static final int DELTAS_FIELD_NUMBER = 2;
        public static final int LAST_TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<DayBucket> dayBuckets_;
        private int deltasMemoizedSerializedSize;
        private Internal.IntList deltas_;
        private long lastTimestamp_;
        private byte memoizedIsInitialized;
        private static final Timestamps DEFAULT_INSTANCE = new Timestamps();
        private static final Parser<Timestamps> PARSER = new AbstractParser<Timestamps>() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionDepth.Timestamps.1
            @Override // com.explorestack.protobuf.Parser
            public Timestamps parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Timestamps(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TimestampsOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> dayBucketsBuilder_;
            private List<DayBucket> dayBuckets_;
            private Internal.IntList deltas_;
            private long lastTimestamp_;

            public Builder addDayBuckets(DayBucket dayBucket) {
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    dayBucket.getClass();
                    ensureDayBucketsIsMutable();
                    this.dayBuckets_.add(dayBucket);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(dayBucket);
                }
                return this;
            }

            public DayBucket.Builder addDayBucketsBuilder() {
                return (DayBucket.Builder) getDayBucketsFieldBuilder().addBuilder(DayBucket.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDayBuckets(int i10, DayBucket dayBucket) {
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    dayBucket.getClass();
                    ensureDayBucketsIsMutable();
                    this.dayBuckets_.set(i10, dayBucket);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i10, dayBucket);
                }
                return this;
            }

            private void ensureDayBucketsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.dayBuckets_ = new ArrayList(this.dayBuckets_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureDeltasIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.deltas_ = GeneratedMessageV3.mutableCopy(this.deltas_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> getDayBucketsFieldBuilder() {
                if (this.dayBucketsBuilder_ == null) {
                    this.dayBucketsBuilder_ = new RepeatedFieldBuilderV3<>(this.dayBuckets_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.dayBuckets_ = null;
                }
                return this.dayBucketsBuilder_;
            }

            public Builder addAllDayBuckets(Iterable<? extends DayBucket> iterable) {
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDayBucketsIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.dayBuckets_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearDayBuckets() {
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.dayBuckets_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder clearLastTimestamp() {
                this.lastTimestamp_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
            public DayBucket getDayBuckets(int i10) {
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.dayBuckets_.get(i10) : (DayBucket) repeatedFieldBuilderV3.getMessage(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
            public int getDayBucketsCount() {
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.dayBuckets_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
            public List<DayBucket> getDayBucketsList() {
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.dayBuckets_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
            public DayBucketOrBuilder getDayBucketsOrBuilder(int i10) {
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.dayBuckets_.get(i10) : (DayBucketOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
            public List<? extends DayBucketOrBuilder> getDayBucketsOrBuilderList() {
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.dayBuckets_);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
            public int getDeltas(int i10) {
                return this.deltas_.getInt(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
            public int getDeltasCount() {
                return this.deltas_.size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
            public List<Integer> getDeltasList() {
                return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.deltas_) : this.deltas_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
            public long getLastTimestamp() {
                return this.lastTimestamp_;
            }

            public Builder removeDayBuckets(int i10) {
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDayBucketsIsMutable();
                    this.dayBuckets_.remove(i10);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i10);
                }
                return this;
            }

            public Builder setLastTimestamp(long j10) {
                this.lastTimestamp_ = j10;
                onChanged();
                return this;
            }

            private Builder() {
                this.deltas_ = GeneratedMessageV3.emptyIntList();
                this.dayBuckets_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionDepth.internal_static_sessionmetrics_Timestamps_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDayBucketsFieldBuilder();
                }
            }

            public Builder addAllDeltas(Iterable<? extends Integer> iterable) {
                ensureDeltasIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.deltas_);
                onChanged();
                return this;
            }

            public Builder addDeltas(int i10) {
                ensureDeltasIsMutable();
                this.deltas_.addInt(i10);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Timestamps build() {
                Timestamps timestampsBuildPartial = buildPartial();
                if (timestampsBuildPartial.isInitialized()) {
                    return timestampsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) timestampsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Timestamps buildPartial() {
                Timestamps timestamps = new Timestamps(this);
                timestamps.lastTimestamp_ = this.lastTimestamp_;
                if ((this.bitField0_ & 1) != 0) {
                    this.deltas_.makeImmutable();
                    this.bitField0_ &= -2;
                }
                timestamps.deltas_ = this.deltas_;
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    timestamps.dayBuckets_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 2) != 0) {
                        this.dayBuckets_ = Collections.unmodifiableList(this.dayBuckets_);
                        this.bitField0_ &= -3;
                    }
                    timestamps.dayBuckets_ = this.dayBuckets_;
                }
                onBuilt();
                return timestamps;
            }

            public Builder clearDeltas() {
                this.deltas_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public DayBucket.Builder getDayBucketsBuilder(int i10) {
                return (DayBucket.Builder) getDayBucketsFieldBuilder().getBuilder(i10);
            }

            public List<DayBucket.Builder> getDayBucketsBuilderList() {
                return getDayBucketsFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Timestamps getDefaultInstanceForType() {
                return Timestamps.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionDepth.internal_static_sessionmetrics_Timestamps_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SessionDepth.internal_static_sessionmetrics_Timestamps_fieldAccessorTable.ensureFieldAccessorsInitialized(Timestamps.class, Builder.class);
            }

            public Builder setDeltas(int i10, int i11) {
                ensureDeltasIsMutable();
                this.deltas_.setInt(i10, i11);
                onChanged();
                return this;
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

            public DayBucket.Builder addDayBucketsBuilder(int i10) {
                return (DayBucket.Builder) getDayBucketsFieldBuilder().addBuilder(i10, DayBucket.getDefaultInstance());
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
                this.lastTimestamp_ = 0L;
                this.deltas_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= -2;
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.dayBuckets_ = Collections.emptyList();
                    this.bitField0_ &= -3;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.deltas_ = GeneratedMessageV3.emptyIntList();
                this.dayBuckets_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addDayBuckets(int i10, DayBucket dayBucket) {
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    dayBucket.getClass();
                    ensureDayBucketsIsMutable();
                    this.dayBuckets_.add(i10, dayBucket);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i10, dayBucket);
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
                if (message instanceof Timestamps) {
                    return mergeFrom((Timestamps) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setDayBuckets(int i10, DayBucket.Builder builder) {
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDayBucketsIsMutable();
                    this.dayBuckets_.set(i10, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i10, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(Timestamps timestamps) {
                if (timestamps == Timestamps.getDefaultInstance()) {
                    return this;
                }
                if (timestamps.getLastTimestamp() != 0) {
                    setLastTimestamp(timestamps.getLastTimestamp());
                }
                if (!timestamps.deltas_.isEmpty()) {
                    if (this.deltas_.isEmpty()) {
                        this.deltas_ = timestamps.deltas_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureDeltasIsMutable();
                        this.deltas_.addAll(timestamps.deltas_);
                    }
                    onChanged();
                }
                if (this.dayBucketsBuilder_ == null) {
                    if (!timestamps.dayBuckets_.isEmpty()) {
                        if (this.dayBuckets_.isEmpty()) {
                            this.dayBuckets_ = timestamps.dayBuckets_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureDayBucketsIsMutable();
                            this.dayBuckets_.addAll(timestamps.dayBuckets_);
                        }
                        onChanged();
                    }
                } else if (!timestamps.dayBuckets_.isEmpty()) {
                    if (!this.dayBucketsBuilder_.isEmpty()) {
                        this.dayBucketsBuilder_.addAllMessages(timestamps.dayBuckets_);
                    } else {
                        this.dayBucketsBuilder_.dispose();
                        this.dayBucketsBuilder_ = null;
                        this.dayBuckets_ = timestamps.dayBuckets_;
                        this.bitField0_ &= -3;
                        this.dayBucketsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getDayBucketsFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(timestamps.unknownFields);
                onChanged();
                return this;
            }

            public Builder addDayBuckets(DayBucket.Builder builder) {
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDayBucketsIsMutable();
                    this.dayBuckets_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addDayBuckets(int i10, DayBucket.Builder builder) {
                RepeatedFieldBuilderV3<DayBucket, DayBucket.Builder, DayBucketOrBuilder> repeatedFieldBuilderV3 = this.dayBucketsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDayBucketsIsMutable();
                    this.dayBuckets_.add(i10, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i10, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Timestamps timestamps = null;
                try {
                    try {
                        Timestamps timestamps2 = (Timestamps) Timestamps.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (timestamps2 != null) {
                            mergeFrom(timestamps2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Timestamps timestamps3 = (Timestamps) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            timestamps = timestamps3;
                            if (timestamps != null) {
                                mergeFrom(timestamps);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (timestamps != null) {
                        mergeFrom(timestamps);
                    }
                    throw th;
                }
            }
        }

        public static final class DayBucket extends GeneratedMessageV3 implements DayBucketOrBuilder {
            public static final int COUNT_FIELD_NUMBER = 2;
            private static final DayBucket DEFAULT_INSTANCE = new DayBucket();
            private static final Parser<DayBucket> PARSER = new AbstractParser<DayBucket>() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionDepth.Timestamps.DayBucket.1
                @Override // com.explorestack.protobuf.Parser
                public DayBucket parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new DayBucket(codedInputStream, extensionRegistryLite);
                }
            };
            public static final int START_TIME_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int count_;
            private byte memoizedIsInitialized;
            private long startTime_;

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DayBucketOrBuilder {
                private int count_;
                private long startTime_;

                public Builder clearCount() {
                    this.count_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder clearStartTime() {
                    this.startTime_ = 0L;
                    onChanged();
                    return this;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.Timestamps.DayBucketOrBuilder
                public int getCount() {
                    return this.count_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.Timestamps.DayBucketOrBuilder
                public long getStartTime() {
                    return this.startTime_;
                }

                public Builder setCount(int i10) {
                    this.count_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setStartTime(long j10) {
                    this.startTime_ = j10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SessionDepth.internal_static_sessionmetrics_Timestamps_DayBucket_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DayBucket build() {
                    DayBucket dayBucketBuildPartial = buildPartial();
                    if (dayBucketBuildPartial.isInitialized()) {
                        return dayBucketBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) dayBucketBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public DayBucket buildPartial() {
                    DayBucket dayBucket = new DayBucket(this);
                    dayBucket.startTime_ = this.startTime_;
                    dayBucket.count_ = this.count_;
                    onBuilt();
                    return dayBucket;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public DayBucket getDefaultInstanceForType() {
                    return DayBucket.getDefaultInstance();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SessionDepth.internal_static_sessionmetrics_Timestamps_DayBucket_descriptor;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SessionDepth.internal_static_sessionmetrics_Timestamps_DayBucket_fieldAccessorTable.ensureFieldAccessorsInitialized(DayBucket.class, Builder.class);
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
                    this.startTime_ = 0L;
                    this.count_ = 0;
                    return this;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo208clone() {
                    return (Builder) super.mo208clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof DayBucket) {
                        return mergeFrom((DayBucket) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(DayBucket dayBucket) {
                    if (dayBucket == DayBucket.getDefaultInstance()) {
                        return this;
                    }
                    if (dayBucket.getStartTime() != 0) {
                        setStartTime(dayBucket.getStartTime());
                    }
                    if (dayBucket.getCount() != 0) {
                        setCount(dayBucket.getCount());
                    }
                    mergeUnknownFields(dayBucket.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    DayBucket dayBucket = null;
                    try {
                        try {
                            DayBucket dayBucket2 = (DayBucket) DayBucket.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (dayBucket2 != null) {
                                mergeFrom(dayBucket2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            DayBucket dayBucket3 = (DayBucket) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th2) {
                                th = th2;
                                dayBucket = dayBucket3;
                                if (dayBucket != null) {
                                    mergeFrom(dayBucket);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (dayBucket != null) {
                            mergeFrom(dayBucket);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static DayBucket parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (DayBucket) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static DayBucket parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DayBucket)) {
                    return super.equals(obj);
                }
                DayBucket dayBucket = (DayBucket) obj;
                return getStartTime() == dayBucket.getStartTime() && getCount() == dayBucket.getCount() && this.unknownFields.equals(dayBucket.unknownFields);
            }

            public static DayBucket getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder(DayBucket dayBucket) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(dayBucket);
            }

            public static DayBucket parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Parser<DayBucket> parser() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.Timestamps.DayBucketOrBuilder
            public int getCount() {
                return this.count_;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Parser<DayBucket> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                long j10 = this.startTime_;
                int iComputeInt64Size = j10 != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j10) : 0;
                int i11 = this.count_;
                if (i11 != 0) {
                    iComputeInt64Size += CodedOutputStream.computeInt32Size(2, i11);
                }
                int serializedSize = iComputeInt64Size + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.Timestamps.DayBucketOrBuilder
            public long getStartTime() {
                return this.startTime_;
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
                int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getStartTime())) * 37) + 2) * 53) + getCount()) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
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
                return new DayBucket();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                long j10 = this.startTime_;
                if (j10 != 0) {
                    codedOutputStream.writeInt64(1, j10);
                }
                int i10 = this.count_;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(2, i10);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            private DayBucket(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionDepth.internal_static_sessionmetrics_Timestamps_DayBucket_descriptor;
            }

            public static DayBucket parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (DayBucket) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static DayBucket parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public DayBucket getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SessionDepth.internal_static_sessionmetrics_Timestamps_DayBucket_fieldAccessorTable.ensureFieldAccessorsInitialized(DayBucket.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static DayBucket parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private DayBucket() {
                this.memoizedIsInitialized = (byte) -1;
            }

            public static DayBucket parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static DayBucket parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            private DayBucket(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.startTime_ = codedInputStream.readInt64();
                                    } else if (tag != 16) {
                                        if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        this.count_ = codedInputStream.readInt32();
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
                        this.unknownFields = builderNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static DayBucket parseFrom(InputStream inputStream) throws IOException {
                return (DayBucket) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static DayBucket parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (DayBucket) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static DayBucket parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (DayBucket) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static DayBucket parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (DayBucket) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface DayBucketOrBuilder extends MessageOrBuilder {
            int getCount();

            long getStartTime();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Timestamps) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Timestamps)) {
                return super.equals(obj);
            }
            Timestamps timestamps = (Timestamps) obj;
            return getLastTimestamp() == timestamps.getLastTimestamp() && getDeltasList().equals(timestamps.getDeltasList()) && getDayBucketsList().equals(timestamps.getDayBucketsList()) && this.unknownFields.equals(timestamps.unknownFields);
        }

        public static Timestamps getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(Timestamps timestamps) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(timestamps);
        }

        public static Timestamps parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<Timestamps> parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
        public DayBucket getDayBuckets(int i10) {
            return this.dayBuckets_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
        public int getDayBucketsCount() {
            return this.dayBuckets_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
        public List<DayBucket> getDayBucketsList() {
            return this.dayBuckets_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
        public DayBucketOrBuilder getDayBucketsOrBuilder(int i10) {
            return this.dayBuckets_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
        public List<? extends DayBucketOrBuilder> getDayBucketsOrBuilderList() {
            return this.dayBuckets_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
        public int getDeltas(int i10) {
            return this.deltas_.getInt(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
        public int getDeltasCount() {
            return this.deltas_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
        public List<Integer> getDeltasList() {
            return this.deltas_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.TimestampsOrBuilder
        public long getLastTimestamp() {
            return this.lastTimestamp_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<Timestamps> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.lastTimestamp_;
            int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(1, j10) + 0 : 0;
            int iComputeUInt32SizeNoTag = 0;
            for (int i11 = 0; i11 < this.deltas_.size(); i11++) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(this.deltas_.getInt(i11));
            }
            int iComputeMessageSize = iComputeInt64Size + iComputeUInt32SizeNoTag;
            if (!getDeltasList().isEmpty()) {
                iComputeMessageSize = iComputeMessageSize + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeUInt32SizeNoTag);
            }
            this.deltasMemoizedSerializedSize = iComputeUInt32SizeNoTag;
            for (int i12 = 0; i12 < this.dayBuckets_.size(); i12++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.dayBuckets_.get(i12));
            }
            int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
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
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getLastTimestamp());
            if (getDeltasCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getDeltasList().hashCode();
            }
            if (getDayBucketsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getDayBucketsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
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
            return new Timestamps();
        }

        private Timestamps(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.deltasMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionDepth.internal_static_sessionmetrics_Timestamps_descriptor;
        }

        public static Timestamps parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Timestamps) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Timestamps parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Timestamps getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SessionDepth.internal_static_sessionmetrics_Timestamps_fieldAccessorTable.ensureFieldAccessorsInitialized(Timestamps.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            long j10 = this.lastTimestamp_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(1, j10);
            }
            if (getDeltasList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(18);
                codedOutputStream.writeUInt32NoTag(this.deltasMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.deltas_.size(); i10++) {
                codedOutputStream.writeUInt32NoTag(this.deltas_.getInt(i10));
            }
            for (int i11 = 0; i11 < this.dayBuckets_.size(); i11++) {
                codedOutputStream.writeMessage(3, this.dayBuckets_.get(i11));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static Timestamps parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Timestamps parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private Timestamps() {
            this.deltasMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.deltas_ = GeneratedMessageV3.emptyIntList();
            this.dayBuckets_ = Collections.emptyList();
        }

        public static Timestamps parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Timestamps parseFrom(InputStream inputStream) throws IOException {
            return (Timestamps) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Timestamps parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Timestamps) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private Timestamps(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.lastTimestamp_ = codedInputStream.readInt64();
                            } else if (tag == 16) {
                                if ((i10 & 1) == 0) {
                                    this.deltas_ = GeneratedMessageV3.newIntList();
                                    i10 |= 1;
                                }
                                this.deltas_.addInt(codedInputStream.readUInt32());
                            } else if (tag == 18) {
                                int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                if ((i10 & 1) == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                                    this.deltas_ = GeneratedMessageV3.newIntList();
                                    i10 |= 1;
                                }
                                while (codedInputStream.getBytesUntilLimit() > 0) {
                                    this.deltas_.addInt(codedInputStream.readUInt32());
                                }
                                codedInputStream.popLimit(iPushLimit);
                            } else if (tag != 26) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((i10 & 2) == 0) {
                                    this.dayBuckets_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.dayBuckets_.add((DayBucket) codedInputStream.readMessage(DayBucket.parser(), extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 1) != 0) {
                        this.deltas_.makeImmutable();
                    }
                    if ((i10 & 2) != 0) {
                        this.dayBuckets_ = Collections.unmodifiableList(this.dayBuckets_);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if ((i10 & 1) != 0) {
                this.deltas_.makeImmutable();
            }
            if ((i10 & 2) != 0) {
                this.dayBuckets_ = Collections.unmodifiableList(this.dayBuckets_);
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Timestamps parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Timestamps) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Timestamps parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Timestamps) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface TimestampsOrBuilder extends MessageOrBuilder {
        Timestamps.DayBucket getDayBuckets(int i10);

        int getDayBucketsCount();

        List<Timestamps.DayBucket> getDayBucketsList();

        Timestamps.DayBucketOrBuilder getDayBucketsOrBuilder(int i10);

        List<? extends Timestamps.DayBucketOrBuilder> getDayBucketsOrBuilderList();

        int getDeltas(int i10);

        int getDeltasCount();

        List<Integer> getDeltasList();

        long getLastTimestamp();
    }

    public static final class UserIdQuery extends GeneratedMessageV3 implements UserIdQueryOrBuilder {
        private static final UserIdQuery DEFAULT_INSTANCE = new UserIdQuery();
        private static final Parser<UserIdQuery> PARSER = new AbstractParser<UserIdQuery>() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserIdQuery.1
            @Override // com.explorestack.protobuf.Parser
            public UserIdQuery parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new UserIdQuery(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        public static final int USER_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long timestamp_;
        private volatile Object userId_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UserIdQueryOrBuilder {
            private long timestamp_;
            private Object userId_;

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder clearTimestamp() {
                this.timestamp_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserIdQueryOrBuilder
            public long getTimestamp() {
                return this.timestamp_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserIdQueryOrBuilder
            public String getUserId() {
                Object obj = this.userId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.userId_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserIdQueryOrBuilder
            public ByteString getUserIdBytes() {
                Object obj = this.userId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.userId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            public Builder setTimestamp(long j10) {
                this.timestamp_ = j10;
                onChanged();
                return this;
            }

            private Builder() {
                this.userId_ = "";
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionDepth.internal_static_sessionmetrics_UserIdQuery_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserIdQuery build() {
                UserIdQuery userIdQueryBuildPartial = buildPartial();
                if (userIdQueryBuildPartial.isInitialized()) {
                    return userIdQueryBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userIdQueryBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserIdQuery buildPartial() {
                UserIdQuery userIdQuery = new UserIdQuery(this);
                userIdQuery.userId_ = this.userId_;
                userIdQuery.timestamp_ = this.timestamp_;
                onBuilt();
                return userIdQuery;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearUserId() {
                this.userId_ = UserIdQuery.getDefaultInstance().getUserId();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public UserIdQuery getDefaultInstanceForType() {
                return UserIdQuery.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionDepth.internal_static_sessionmetrics_UserIdQuery_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SessionDepth.internal_static_sessionmetrics_UserIdQuery_fieldAccessorTable.ensureFieldAccessorsInitialized(UserIdQuery.class, Builder.class);
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

            public Builder setUserId(String str) {
                str.getClass();
                this.userId_ = str;
                onChanged();
                return this;
            }

            public Builder setUserIdBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.userId_ = byteString;
                onChanged();
                return this;
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
                this.userId_ = "";
                this.timestamp_ = 0L;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.userId_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo208clone() {
                return (Builder) super.mo208clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UserIdQuery) {
                    return mergeFrom((UserIdQuery) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UserIdQuery userIdQuery) {
                if (userIdQuery == UserIdQuery.getDefaultInstance()) {
                    return this;
                }
                if (!userIdQuery.getUserId().isEmpty()) {
                    this.userId_ = userIdQuery.userId_;
                    onChanged();
                }
                if (userIdQuery.getTimestamp() != 0) {
                    setTimestamp(userIdQuery.getTimestamp());
                }
                mergeUnknownFields(userIdQuery.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                UserIdQuery userIdQuery = null;
                try {
                    try {
                        UserIdQuery userIdQuery2 = (UserIdQuery) UserIdQuery.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (userIdQuery2 != null) {
                            mergeFrom(userIdQuery2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        UserIdQuery userIdQuery3 = (UserIdQuery) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            userIdQuery = userIdQuery3;
                            if (userIdQuery != null) {
                                mergeFrom(userIdQuery);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (userIdQuery != null) {
                        mergeFrom(userIdQuery);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserIdQuery parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserIdQuery) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserIdQuery parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserIdQuery)) {
                return super.equals(obj);
            }
            UserIdQuery userIdQuery = (UserIdQuery) obj;
            return getUserId().equals(userIdQuery.getUserId()) && getTimestamp() == userIdQuery.getTimestamp() && this.unknownFields.equals(userIdQuery.unknownFields);
        }

        public static UserIdQuery getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(UserIdQuery userIdQuery) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userIdQuery);
        }

        public static UserIdQuery parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<UserIdQuery> parser() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<UserIdQuery> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = getUserIdBytes().isEmpty() ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.userId_);
            long j10 = this.timestamp_;
            if (j10 != 0) {
                iComputeStringSize += CodedOutputStream.computeInt64Size(2, j10);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserIdQueryOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserIdQueryOrBuilder
        public String getUserId() {
            Object obj = this.userId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.userId_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserIdQueryOrBuilder
        public ByteString getUserIdBytes() {
            Object obj = this.userId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.userId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUserId().hashCode()) * 37) + 2) * 53) + Internal.hashLong(getTimestamp())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
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
            return new UserIdQuery();
        }

        private UserIdQuery(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionDepth.internal_static_sessionmetrics_UserIdQuery_descriptor;
        }

        public static UserIdQuery parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UserIdQuery) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserIdQuery parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public UserIdQuery getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SessionDepth.internal_static_sessionmetrics_UserIdQuery_fieldAccessorTable.ensureFieldAccessorsInitialized(UserIdQuery.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getUserIdBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.userId_);
            }
            long j10 = this.timestamp_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(2, j10);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static UserIdQuery parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private UserIdQuery() {
            this.memoizedIsInitialized = (byte) -1;
            this.userId_ = "";
        }

        public static UserIdQuery parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static UserIdQuery parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserIdQuery parseFrom(InputStream inputStream) throws IOException {
            return (UserIdQuery) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private UserIdQuery(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.userId_ = codedInputStream.readStringRequireUtf8();
                                } else if (tag != 16) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.timestamp_ = codedInputStream.readInt64();
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
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static UserIdQuery parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UserIdQuery) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserIdQuery parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UserIdQuery) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UserIdQuery parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UserIdQuery) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface UserIdQueryOrBuilder extends MessageOrBuilder {
        long getTimestamp();

        String getUserId();

        ByteString getUserIdBytes();
    }

    public static final class UserSession extends GeneratedMessageV3 implements UserSessionOrBuilder {
        public static final int LAST_ACTIVITY_FIELD_NUMBER = 1;
        public static final int METRICS_BY_AD_TYPE_FIELD_NUMBER = 3;
        public static final int SESSION_START_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private long lastActivity_;
        private byte memoizedIsInitialized;
        private List<AdTypeMetrics> metricsByAdType_;
        private long sessionStart_;
        private static final UserSession DEFAULT_INSTANCE = new UserSession();
        private static final Parser<UserSession> PARSER = new AbstractParser<UserSession>() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.1
            @Override // com.explorestack.protobuf.Parser
            public UserSession parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new UserSession(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class AdTypeMetrics extends GeneratedMessageV3 implements AdTypeMetricsOrBuilder {
            public static final int AD_REQUESTS_FIELD_NUMBER = 3;
            public static final int AD_TYPE_FIELD_NUMBER = 1;
            public static final int BIDS_FIELD_NUMBER = 4;
            public static final int CUMULATIVE_BID_PRICE_FIELD_NUMBER = 9;
            public static final int CUMULATIVE_LURL_PRICE_FIELD_NUMBER = 10;
            public static final int CUMULATIVE_NURL_PRICE_FIELD_NUMBER = 11;
            public static final int ECPM_FIELD_NUMBER = 12;
            public static final int IMPRESSIONS_FIELD_NUMBER = 2;
            public static final int LOSSES_FIELD_NUMBER = 6;
            public static final int LURLS_FIELD_NUMBER = 7;
            public static final int NURLS_FIELD_NUMBER = 8;
            public static final int WINS_FIELD_NUMBER = 5;
            private static final long serialVersionUID = 0;
            private int adRequests_;
            private int adType_;
            private int bids_;
            private float cumulativeBidPrice_;
            private float cumulativeLurlPrice_;
            private float cumulativeNurlPrice_;
            private Ecpm ecpm_;
            private int impressions_;
            private int losses_;
            private int lurls_;
            private byte memoizedIsInitialized;
            private int nurls_;
            private int wins_;
            private static final AdTypeMetrics DEFAULT_INSTANCE = new AdTypeMetrics();
            private static final Parser<AdTypeMetrics> PARSER = new AbstractParser<AdTypeMetrics>() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetrics.1
                @Override // com.explorestack.protobuf.Parser
                public AdTypeMetrics parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new AdTypeMetrics(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdTypeMetricsOrBuilder {
                private int adRequests_;
                private int adType_;
                private int bids_;
                private float cumulativeBidPrice_;
                private float cumulativeLurlPrice_;
                private float cumulativeNurlPrice_;
                private SingleFieldBuilderV3<Ecpm, Ecpm.Builder, EcpmOrBuilder> ecpmBuilder_;
                private Ecpm ecpm_;
                private int impressions_;
                private int losses_;
                private int lurls_;
                private int nurls_;
                private int wins_;

                public Builder clearAdRequests() {
                    this.adRequests_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearAdType() {
                    this.adType_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearBids() {
                    this.bids_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearCumulativeBidPrice() {
                    this.cumulativeBidPrice_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearCumulativeLurlPrice() {
                    this.cumulativeLurlPrice_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearCumulativeNurlPrice() {
                    this.cumulativeNurlPrice_ = 0.0f;
                    onChanged();
                    return this;
                }

                public Builder clearImpressions() {
                    this.impressions_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLosses() {
                    this.losses_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLurls() {
                    this.lurls_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearNurls() {
                    this.nurls_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWins() {
                    this.wins_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setEcpm(Ecpm ecpm) {
                    SingleFieldBuilderV3<Ecpm, Ecpm.Builder, EcpmOrBuilder> singleFieldBuilderV3 = this.ecpmBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        ecpm.getClass();
                        this.ecpm_ = ecpm;
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(ecpm);
                    }
                    return this;
                }

                private SingleFieldBuilderV3<Ecpm, Ecpm.Builder, EcpmOrBuilder> getEcpmFieldBuilder() {
                    if (this.ecpmBuilder_ == null) {
                        this.ecpmBuilder_ = new SingleFieldBuilderV3<>(getEcpm(), getParentForChildren(), isClean());
                        this.ecpm_ = null;
                    }
                    return this.ecpmBuilder_;
                }

                public Builder clearEcpm() {
                    if (this.ecpmBuilder_ == null) {
                        this.ecpm_ = null;
                        onChanged();
                    } else {
                        this.ecpm_ = null;
                        this.ecpmBuilder_ = null;
                    }
                    return this;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
                public int getAdRequests() {
                    return this.adRequests_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
                public AdType getAdType() {
                    AdType adTypeValueOf = AdType.valueOf(this.adType_);
                    return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
                public int getAdTypeValue() {
                    return this.adType_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
                public int getBids() {
                    return this.bids_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
                public float getCumulativeBidPrice() {
                    return this.cumulativeBidPrice_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
                public float getCumulativeLurlPrice() {
                    return this.cumulativeLurlPrice_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
                public float getCumulativeNurlPrice() {
                    return this.cumulativeNurlPrice_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
                public Ecpm getEcpm() {
                    SingleFieldBuilderV3<Ecpm, Ecpm.Builder, EcpmOrBuilder> singleFieldBuilderV3 = this.ecpmBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (Ecpm) singleFieldBuilderV3.getMessage();
                    }
                    Ecpm ecpm = this.ecpm_;
                    return ecpm == null ? Ecpm.getDefaultInstance() : ecpm;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
                public EcpmOrBuilder getEcpmOrBuilder() {
                    SingleFieldBuilderV3<Ecpm, Ecpm.Builder, EcpmOrBuilder> singleFieldBuilderV3 = this.ecpmBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (EcpmOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    Ecpm ecpm = this.ecpm_;
                    return ecpm == null ? Ecpm.getDefaultInstance() : ecpm;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
                public int getImpressions() {
                    return this.impressions_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
                public int getLosses() {
                    return this.losses_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
                public int getLurls() {
                    return this.lurls_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
                public int getNurls() {
                    return this.nurls_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
                public int getWins() {
                    return this.wins_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
                public boolean hasEcpm() {
                    return (this.ecpmBuilder_ == null && this.ecpm_ == null) ? false : true;
                }

                public Builder mergeEcpm(Ecpm ecpm) {
                    SingleFieldBuilderV3<Ecpm, Ecpm.Builder, EcpmOrBuilder> singleFieldBuilderV3 = this.ecpmBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        Ecpm ecpm2 = this.ecpm_;
                        if (ecpm2 != null) {
                            this.ecpm_ = Ecpm.newBuilder(ecpm2).mergeFrom(ecpm).buildPartial();
                        } else {
                            this.ecpm_ = ecpm;
                        }
                        onChanged();
                    } else {
                        singleFieldBuilderV3.mergeFrom(ecpm);
                    }
                    return this;
                }

                public Builder setAdRequests(int i10) {
                    this.adRequests_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setAdTypeValue(int i10) {
                    this.adType_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setBids(int i10) {
                    this.bids_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setCumulativeBidPrice(float f10) {
                    this.cumulativeBidPrice_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setCumulativeLurlPrice(float f10) {
                    this.cumulativeLurlPrice_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setCumulativeNurlPrice(float f10) {
                    this.cumulativeNurlPrice_ = f10;
                    onChanged();
                    return this;
                }

                public Builder setImpressions(int i10) {
                    this.impressions_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setLosses(int i10) {
                    this.losses_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setLurls(int i10) {
                    this.lurls_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setNurls(int i10) {
                    this.nurls_ = i10;
                    onChanged();
                    return this;
                }

                public Builder setWins(int i10) {
                    this.wins_ = i10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.adType_ = 0;
                    maybeForceBuilderInitialization();
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SessionDepth.internal_static_sessionmetrics_UserSession_AdTypeMetrics_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdTypeMetrics build() {
                    AdTypeMetrics adTypeMetricsBuildPartial = buildPartial();
                    if (adTypeMetricsBuildPartial.isInitialized()) {
                        return adTypeMetricsBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) adTypeMetricsBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public AdTypeMetrics buildPartial() {
                    AdTypeMetrics adTypeMetrics = new AdTypeMetrics(this);
                    adTypeMetrics.adType_ = this.adType_;
                    adTypeMetrics.impressions_ = this.impressions_;
                    adTypeMetrics.adRequests_ = this.adRequests_;
                    adTypeMetrics.bids_ = this.bids_;
                    adTypeMetrics.wins_ = this.wins_;
                    adTypeMetrics.losses_ = this.losses_;
                    adTypeMetrics.lurls_ = this.lurls_;
                    adTypeMetrics.nurls_ = this.nurls_;
                    adTypeMetrics.cumulativeBidPrice_ = this.cumulativeBidPrice_;
                    adTypeMetrics.cumulativeLurlPrice_ = this.cumulativeLurlPrice_;
                    adTypeMetrics.cumulativeNurlPrice_ = this.cumulativeNurlPrice_;
                    SingleFieldBuilderV3<Ecpm, Ecpm.Builder, EcpmOrBuilder> singleFieldBuilderV3 = this.ecpmBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        adTypeMetrics.ecpm_ = this.ecpm_;
                    } else {
                        adTypeMetrics.ecpm_ = (Ecpm) singleFieldBuilderV3.build();
                    }
                    onBuilt();
                    return adTypeMetrics;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public AdTypeMetrics getDefaultInstanceForType() {
                    return AdTypeMetrics.getDefaultInstance();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SessionDepth.internal_static_sessionmetrics_UserSession_AdTypeMetrics_descriptor;
                }

                public Ecpm.Builder getEcpmBuilder() {
                    onChanged();
                    return (Ecpm.Builder) getEcpmFieldBuilder().getBuilder();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SessionDepth.internal_static_sessionmetrics_UserSession_AdTypeMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(AdTypeMetrics.class, Builder.class);
                }

                public Builder setAdType(AdType adType) {
                    adType.getClass();
                    this.adType_ = adType.getNumber();
                    onChanged();
                    return this;
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

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.adType_ = 0;
                    this.impressions_ = 0;
                    this.adRequests_ = 0;
                    this.bids_ = 0;
                    this.wins_ = 0;
                    this.losses_ = 0;
                    this.lurls_ = 0;
                    this.nurls_ = 0;
                    this.cumulativeBidPrice_ = 0.0f;
                    this.cumulativeLurlPrice_ = 0.0f;
                    this.cumulativeNurlPrice_ = 0.0f;
                    if (this.ecpmBuilder_ == null) {
                        this.ecpm_ = null;
                    } else {
                        this.ecpm_ = null;
                        this.ecpmBuilder_ = null;
                    }
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.adType_ = 0;
                    maybeForceBuilderInitialization();
                }

                public Builder setEcpm(Ecpm.Builder builder) {
                    SingleFieldBuilderV3<Ecpm, Ecpm.Builder, EcpmOrBuilder> singleFieldBuilderV3 = this.ecpmBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.ecpm_ = builder.build();
                        onChanged();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
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
                    if (message instanceof AdTypeMetrics) {
                        return mergeFrom((AdTypeMetrics) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(AdTypeMetrics adTypeMetrics) {
                    if (adTypeMetrics == AdTypeMetrics.getDefaultInstance()) {
                        return this;
                    }
                    if (adTypeMetrics.adType_ != 0) {
                        setAdTypeValue(adTypeMetrics.getAdTypeValue());
                    }
                    if (adTypeMetrics.getImpressions() != 0) {
                        setImpressions(adTypeMetrics.getImpressions());
                    }
                    if (adTypeMetrics.getAdRequests() != 0) {
                        setAdRequests(adTypeMetrics.getAdRequests());
                    }
                    if (adTypeMetrics.getBids() != 0) {
                        setBids(adTypeMetrics.getBids());
                    }
                    if (adTypeMetrics.getWins() != 0) {
                        setWins(adTypeMetrics.getWins());
                    }
                    if (adTypeMetrics.getLosses() != 0) {
                        setLosses(adTypeMetrics.getLosses());
                    }
                    if (adTypeMetrics.getLurls() != 0) {
                        setLurls(adTypeMetrics.getLurls());
                    }
                    if (adTypeMetrics.getNurls() != 0) {
                        setNurls(adTypeMetrics.getNurls());
                    }
                    if (adTypeMetrics.getCumulativeBidPrice() != 0.0f) {
                        setCumulativeBidPrice(adTypeMetrics.getCumulativeBidPrice());
                    }
                    if (adTypeMetrics.getCumulativeLurlPrice() != 0.0f) {
                        setCumulativeLurlPrice(adTypeMetrics.getCumulativeLurlPrice());
                    }
                    if (adTypeMetrics.getCumulativeNurlPrice() != 0.0f) {
                        setCumulativeNurlPrice(adTypeMetrics.getCumulativeNurlPrice());
                    }
                    if (adTypeMetrics.hasEcpm()) {
                        mergeEcpm(adTypeMetrics.getEcpm());
                    }
                    mergeUnknownFields(adTypeMetrics.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    AdTypeMetrics adTypeMetrics = null;
                    try {
                        try {
                            AdTypeMetrics adTypeMetrics2 = (AdTypeMetrics) AdTypeMetrics.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (adTypeMetrics2 != null) {
                                mergeFrom(adTypeMetrics2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            AdTypeMetrics adTypeMetrics3 = (AdTypeMetrics) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th2) {
                                th = th2;
                                adTypeMetrics = adTypeMetrics3;
                                if (adTypeMetrics != null) {
                                    mergeFrom(adTypeMetrics);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (adTypeMetrics != null) {
                            mergeFrom(adTypeMetrics);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static AdTypeMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (AdTypeMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static AdTypeMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof AdTypeMetrics)) {
                    return super.equals(obj);
                }
                AdTypeMetrics adTypeMetrics = (AdTypeMetrics) obj;
                if (this.adType_ == adTypeMetrics.adType_ && getImpressions() == adTypeMetrics.getImpressions() && getAdRequests() == adTypeMetrics.getAdRequests() && getBids() == adTypeMetrics.getBids() && getWins() == adTypeMetrics.getWins() && getLosses() == adTypeMetrics.getLosses() && getLurls() == adTypeMetrics.getLurls() && getNurls() == adTypeMetrics.getNurls() && Float.floatToIntBits(getCumulativeBidPrice()) == Float.floatToIntBits(adTypeMetrics.getCumulativeBidPrice()) && Float.floatToIntBits(getCumulativeLurlPrice()) == Float.floatToIntBits(adTypeMetrics.getCumulativeLurlPrice()) && Float.floatToIntBits(getCumulativeNurlPrice()) == Float.floatToIntBits(adTypeMetrics.getCumulativeNurlPrice()) && hasEcpm() == adTypeMetrics.hasEcpm()) {
                    return (!hasEcpm() || getEcpm().equals(adTypeMetrics.getEcpm())) && this.unknownFields.equals(adTypeMetrics.unknownFields);
                }
                return false;
            }

            public static AdTypeMetrics getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder(AdTypeMetrics adTypeMetrics) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(adTypeMetrics);
            }

            public static AdTypeMetrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Parser<AdTypeMetrics> parser() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
            public int getAdRequests() {
                return this.adRequests_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
            public AdType getAdType() {
                AdType adTypeValueOf = AdType.valueOf(this.adType_);
                return adTypeValueOf == null ? AdType.UNRECOGNIZED : adTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
            public int getAdTypeValue() {
                return this.adType_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
            public int getBids() {
                return this.bids_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
            public float getCumulativeBidPrice() {
                return this.cumulativeBidPrice_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
            public float getCumulativeLurlPrice() {
                return this.cumulativeLurlPrice_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
            public float getCumulativeNurlPrice() {
                return this.cumulativeNurlPrice_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
            public Ecpm getEcpm() {
                Ecpm ecpm = this.ecpm_;
                return ecpm == null ? Ecpm.getDefaultInstance() : ecpm;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
            public int getImpressions() {
                return this.impressions_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
            public int getLosses() {
                return this.losses_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
            public int getLurls() {
                return this.lurls_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
            public int getNurls() {
                return this.nurls_;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Parser<AdTypeMetrics> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeEnumSize = this.adType_ != AdType.UNKNOWN.getNumber() ? 0 + CodedOutputStream.computeEnumSize(1, this.adType_) : 0;
                int i11 = this.impressions_;
                if (i11 != 0) {
                    iComputeEnumSize += CodedOutputStream.computeInt32Size(2, i11);
                }
                int i12 = this.adRequests_;
                if (i12 != 0) {
                    iComputeEnumSize += CodedOutputStream.computeInt32Size(3, i12);
                }
                int i13 = this.bids_;
                if (i13 != 0) {
                    iComputeEnumSize += CodedOutputStream.computeInt32Size(4, i13);
                }
                int i14 = this.wins_;
                if (i14 != 0) {
                    iComputeEnumSize += CodedOutputStream.computeInt32Size(5, i14);
                }
                int i15 = this.losses_;
                if (i15 != 0) {
                    iComputeEnumSize += CodedOutputStream.computeInt32Size(6, i15);
                }
                int i16 = this.lurls_;
                if (i16 != 0) {
                    iComputeEnumSize += CodedOutputStream.computeInt32Size(7, i16);
                }
                int i17 = this.nurls_;
                if (i17 != 0) {
                    iComputeEnumSize += CodedOutputStream.computeInt32Size(8, i17);
                }
                float f10 = this.cumulativeBidPrice_;
                if (f10 != 0.0f) {
                    iComputeEnumSize += CodedOutputStream.computeFloatSize(9, f10);
                }
                float f11 = this.cumulativeLurlPrice_;
                if (f11 != 0.0f) {
                    iComputeEnumSize += CodedOutputStream.computeFloatSize(10, f11);
                }
                float f12 = this.cumulativeNurlPrice_;
                if (f12 != 0.0f) {
                    iComputeEnumSize += CodedOutputStream.computeFloatSize(11, f12);
                }
                if (this.ecpm_ != null) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(12, getEcpm());
                }
                int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
            public final UnknownFieldSet getUnknownFields() {
                return this.unknownFields;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
            public int getWins() {
                return this.wins_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
            public boolean hasEcpm() {
                return this.ecpm_ != null;
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.adType_) * 37) + 2) * 53) + getImpressions()) * 37) + 3) * 53) + getAdRequests()) * 37) + 4) * 53) + getBids()) * 37) + 5) * 53) + getWins()) * 37) + 6) * 53) + getLosses()) * 37) + 7) * 53) + getLurls()) * 37) + 8) * 53) + getNurls()) * 37) + 9) * 53) + Float.floatToIntBits(getCumulativeBidPrice())) * 37) + 10) * 53) + Float.floatToIntBits(getCumulativeLurlPrice())) * 37) + 11) * 53) + Float.floatToIntBits(getCumulativeNurlPrice());
                if (hasEcpm()) {
                    iHashCode = (((iHashCode * 37) + 12) * 53) + getEcpm().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
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
                return new AdTypeMetrics();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                if (this.adType_ != AdType.UNKNOWN.getNumber()) {
                    codedOutputStream.writeEnum(1, this.adType_);
                }
                int i10 = this.impressions_;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(2, i10);
                }
                int i11 = this.adRequests_;
                if (i11 != 0) {
                    codedOutputStream.writeInt32(3, i11);
                }
                int i12 = this.bids_;
                if (i12 != 0) {
                    codedOutputStream.writeInt32(4, i12);
                }
                int i13 = this.wins_;
                if (i13 != 0) {
                    codedOutputStream.writeInt32(5, i13);
                }
                int i14 = this.losses_;
                if (i14 != 0) {
                    codedOutputStream.writeInt32(6, i14);
                }
                int i15 = this.lurls_;
                if (i15 != 0) {
                    codedOutputStream.writeInt32(7, i15);
                }
                int i16 = this.nurls_;
                if (i16 != 0) {
                    codedOutputStream.writeInt32(8, i16);
                }
                float f10 = this.cumulativeBidPrice_;
                if (f10 != 0.0f) {
                    codedOutputStream.writeFloat(9, f10);
                }
                float f11 = this.cumulativeLurlPrice_;
                if (f11 != 0.0f) {
                    codedOutputStream.writeFloat(10, f11);
                }
                float f12 = this.cumulativeNurlPrice_;
                if (f12 != 0.0f) {
                    codedOutputStream.writeFloat(11, f12);
                }
                if (this.ecpm_ != null) {
                    codedOutputStream.writeMessage(12, getEcpm());
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            private AdTypeMetrics(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.memoizedIsInitialized = (byte) -1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionDepth.internal_static_sessionmetrics_UserSession_AdTypeMetrics_descriptor;
            }

            public static AdTypeMetrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (AdTypeMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static AdTypeMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public AdTypeMetrics getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.AdTypeMetricsOrBuilder
            public EcpmOrBuilder getEcpmOrBuilder() {
                return getEcpm();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SessionDepth.internal_static_sessionmetrics_UserSession_AdTypeMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(AdTypeMetrics.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static AdTypeMetrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            private AdTypeMetrics() {
                this.memoizedIsInitialized = (byte) -1;
                this.adType_ = 0;
            }

            public static AdTypeMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static AdTypeMetrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static AdTypeMetrics parseFrom(InputStream inputStream) throws IOException {
                return (AdTypeMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            private AdTypeMetrics(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 8:
                                    this.adType_ = codedInputStream.readEnum();
                                    continue;
                                case 16:
                                    this.impressions_ = codedInputStream.readInt32();
                                    continue;
                                case 24:
                                    this.adRequests_ = codedInputStream.readInt32();
                                    continue;
                                case 32:
                                    this.bids_ = codedInputStream.readInt32();
                                    continue;
                                case 40:
                                    this.wins_ = codedInputStream.readInt32();
                                    continue;
                                case 48:
                                    this.losses_ = codedInputStream.readInt32();
                                    continue;
                                case 56:
                                    this.lurls_ = codedInputStream.readInt32();
                                    continue;
                                case 64:
                                    this.nurls_ = codedInputStream.readInt32();
                                    continue;
                                case 77:
                                    this.cumulativeBidPrice_ = codedInputStream.readFloat();
                                    continue;
                                case 85:
                                    this.cumulativeLurlPrice_ = codedInputStream.readFloat();
                                    continue;
                                case 93:
                                    this.cumulativeNurlPrice_ = codedInputStream.readFloat();
                                    continue;
                                case 98:
                                    Ecpm ecpm = this.ecpm_;
                                    Ecpm.Builder builder = ecpm != null ? ecpm.toBuilder() : null;
                                    Ecpm ecpm2 = (Ecpm) codedInputStream.readMessage(Ecpm.parser(), extensionRegistryLite);
                                    this.ecpm_ = ecpm2;
                                    if (builder != null) {
                                        builder.mergeFrom(ecpm2);
                                        this.ecpm_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                default:
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
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

            public static AdTypeMetrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (AdTypeMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static AdTypeMetrics parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (AdTypeMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static AdTypeMetrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (AdTypeMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface AdTypeMetricsOrBuilder extends MessageOrBuilder {
            int getAdRequests();

            AdType getAdType();

            int getAdTypeValue();

            int getBids();

            float getCumulativeBidPrice();

            float getCumulativeLurlPrice();

            float getCumulativeNurlPrice();

            Ecpm getEcpm();

            EcpmOrBuilder getEcpmOrBuilder();

            int getImpressions();

            int getLosses();

            int getLurls();

            int getNurls();

            int getWins();

            boolean hasEcpm();
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UserSessionOrBuilder {
            private int bitField0_;
            private long lastActivity_;
            private RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> metricsByAdTypeBuilder_;
            private List<AdTypeMetrics> metricsByAdType_;
            private long sessionStart_;

            public Builder addMetricsByAdType(AdTypeMetrics adTypeMetrics) {
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    adTypeMetrics.getClass();
                    ensureMetricsByAdTypeIsMutable();
                    this.metricsByAdType_.add(adTypeMetrics);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(adTypeMetrics);
                }
                return this;
            }

            public AdTypeMetrics.Builder addMetricsByAdTypeBuilder() {
                return (AdTypeMetrics.Builder) getMetricsByAdTypeFieldBuilder().addBuilder(AdTypeMetrics.getDefaultInstance());
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setMetricsByAdType(int i10, AdTypeMetrics adTypeMetrics) {
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    adTypeMetrics.getClass();
                    ensureMetricsByAdTypeIsMutable();
                    this.metricsByAdType_.set(i10, adTypeMetrics);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i10, adTypeMetrics);
                }
                return this;
            }

            private void ensureMetricsByAdTypeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.metricsByAdType_ = new ArrayList(this.metricsByAdType_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> getMetricsByAdTypeFieldBuilder() {
                if (this.metricsByAdTypeBuilder_ == null) {
                    this.metricsByAdTypeBuilder_ = new RepeatedFieldBuilderV3<>(this.metricsByAdType_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.metricsByAdType_ = null;
                }
                return this.metricsByAdTypeBuilder_;
            }

            public Builder addAllMetricsByAdType(Iterable<? extends AdTypeMetrics> iterable) {
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMetricsByAdTypeIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.metricsByAdType_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearLastActivity() {
                this.lastActivity_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearMetricsByAdType() {
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.metricsByAdType_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder clearSessionStart() {
                this.sessionStart_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSessionOrBuilder
            public long getLastActivity() {
                return this.lastActivity_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSessionOrBuilder
            public AdTypeMetrics getMetricsByAdType(int i10) {
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                return repeatedFieldBuilderV3 == null ? this.metricsByAdType_.get(i10) : (AdTypeMetrics) repeatedFieldBuilderV3.getMessage(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSessionOrBuilder
            public int getMetricsByAdTypeCount() {
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                return repeatedFieldBuilderV3 == null ? this.metricsByAdType_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSessionOrBuilder
            public List<AdTypeMetrics> getMetricsByAdTypeList() {
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.metricsByAdType_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSessionOrBuilder
            public AdTypeMetricsOrBuilder getMetricsByAdTypeOrBuilder(int i10) {
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                return repeatedFieldBuilderV3 == null ? this.metricsByAdType_.get(i10) : (AdTypeMetricsOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSessionOrBuilder
            public List<? extends AdTypeMetricsOrBuilder> getMetricsByAdTypeOrBuilderList() {
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.metricsByAdType_);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSessionOrBuilder
            public long getSessionStart() {
                return this.sessionStart_;
            }

            public Builder removeMetricsByAdType(int i10) {
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMetricsByAdTypeIsMutable();
                    this.metricsByAdType_.remove(i10);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i10);
                }
                return this;
            }

            public Builder setLastActivity(long j10) {
                this.lastActivity_ = j10;
                onChanged();
                return this;
            }

            public Builder setSessionStart(long j10) {
                this.sessionStart_ = j10;
                onChanged();
                return this;
            }

            private Builder() {
                this.metricsByAdType_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionDepth.internal_static_sessionmetrics_UserSession_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getMetricsByAdTypeFieldBuilder();
                }
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserSession build() {
                UserSession userSessionBuildPartial = buildPartial();
                if (userSessionBuildPartial.isInitialized()) {
                    return userSessionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userSessionBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserSession buildPartial() {
                UserSession userSession = new UserSession(this);
                userSession.lastActivity_ = this.lastActivity_;
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    userSession.metricsByAdType_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.metricsByAdType_ = Collections.unmodifiableList(this.metricsByAdType_);
                        this.bitField0_ &= -2;
                    }
                    userSession.metricsByAdType_ = this.metricsByAdType_;
                }
                userSession.sessionStart_ = this.sessionStart_;
                onBuilt();
                return userSession;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public UserSession getDefaultInstanceForType() {
                return UserSession.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionDepth.internal_static_sessionmetrics_UserSession_descriptor;
            }

            public AdTypeMetrics.Builder getMetricsByAdTypeBuilder(int i10) {
                return (AdTypeMetrics.Builder) getMetricsByAdTypeFieldBuilder().getBuilder(i10);
            }

            public List<AdTypeMetrics.Builder> getMetricsByAdTypeBuilderList() {
                return getMetricsByAdTypeFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SessionDepth.internal_static_sessionmetrics_UserSession_fieldAccessorTable.ensureFieldAccessorsInitialized(UserSession.class, Builder.class);
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

            public AdTypeMetrics.Builder addMetricsByAdTypeBuilder(int i10) {
                return (AdTypeMetrics.Builder) getMetricsByAdTypeFieldBuilder().addBuilder(i10, AdTypeMetrics.getDefaultInstance());
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
                this.lastActivity_ = 0L;
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.metricsByAdType_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                this.sessionStart_ = 0L;
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.metricsByAdType_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addMetricsByAdType(int i10, AdTypeMetrics adTypeMetrics) {
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    adTypeMetrics.getClass();
                    ensureMetricsByAdTypeIsMutable();
                    this.metricsByAdType_.add(i10, adTypeMetrics);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i10, adTypeMetrics);
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
                if (message instanceof UserSession) {
                    return mergeFrom((UserSession) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setMetricsByAdType(int i10, AdTypeMetrics.Builder builder) {
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMetricsByAdTypeIsMutable();
                    this.metricsByAdType_.set(i10, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i10, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(UserSession userSession) {
                if (userSession == UserSession.getDefaultInstance()) {
                    return this;
                }
                if (userSession.getLastActivity() != 0) {
                    setLastActivity(userSession.getLastActivity());
                }
                if (this.metricsByAdTypeBuilder_ == null) {
                    if (!userSession.metricsByAdType_.isEmpty()) {
                        if (this.metricsByAdType_.isEmpty()) {
                            this.metricsByAdType_ = userSession.metricsByAdType_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureMetricsByAdTypeIsMutable();
                            this.metricsByAdType_.addAll(userSession.metricsByAdType_);
                        }
                        onChanged();
                    }
                } else if (!userSession.metricsByAdType_.isEmpty()) {
                    if (!this.metricsByAdTypeBuilder_.isEmpty()) {
                        this.metricsByAdTypeBuilder_.addAllMessages(userSession.metricsByAdType_);
                    } else {
                        this.metricsByAdTypeBuilder_.dispose();
                        this.metricsByAdTypeBuilder_ = null;
                        this.metricsByAdType_ = userSession.metricsByAdType_;
                        this.bitField0_ &= -2;
                        this.metricsByAdTypeBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getMetricsByAdTypeFieldBuilder() : null;
                    }
                }
                if (userSession.getSessionStart() != 0) {
                    setSessionStart(userSession.getSessionStart());
                }
                mergeUnknownFields(userSession.unknownFields);
                onChanged();
                return this;
            }

            public Builder addMetricsByAdType(AdTypeMetrics.Builder builder) {
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMetricsByAdTypeIsMutable();
                    this.metricsByAdType_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addMetricsByAdType(int i10, AdTypeMetrics.Builder builder) {
                RepeatedFieldBuilderV3<AdTypeMetrics, AdTypeMetrics.Builder, AdTypeMetricsOrBuilder> repeatedFieldBuilderV3 = this.metricsByAdTypeBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureMetricsByAdTypeIsMutable();
                    this.metricsByAdType_.add(i10, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i10, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                UserSession userSession = null;
                try {
                    try {
                        UserSession userSession2 = (UserSession) UserSession.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (userSession2 != null) {
                            mergeFrom(userSession2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        UserSession userSession3 = (UserSession) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            userSession = userSession3;
                            if (userSession != null) {
                                mergeFrom(userSession);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (userSession != null) {
                        mergeFrom(userSession);
                    }
                    throw th;
                }
            }
        }

        public static final class Ecpm extends GeneratedMessageV3 implements EcpmOrBuilder {
            public static final int COUNT_FIELD_NUMBER = 3;
            public static final int FIRST_PRICES_FIELD_NUMBER = 1;
            public static final int LAST_PRICES_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int count_;
            private int firstPricesMemoizedSerializedSize;
            private Internal.DoubleList firstPrices_;
            private int lastPricesMemoizedSerializedSize;
            private Internal.DoubleList lastPrices_;
            private byte memoizedIsInitialized;
            private static final Ecpm DEFAULT_INSTANCE = new Ecpm();
            private static final Parser<Ecpm> PARSER = new AbstractParser<Ecpm>() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.Ecpm.1
                @Override // com.explorestack.protobuf.Parser
                public Ecpm parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Ecpm(codedInputStream, extensionRegistryLite);
                }
            };

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EcpmOrBuilder {
                private int bitField0_;
                private int count_;
                private Internal.DoubleList firstPrices_;
                private Internal.DoubleList lastPrices_;

                public Builder clearCount() {
                    this.count_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                private void ensureFirstPricesIsMutable() {
                    if ((this.bitField0_ & 1) == 0) {
                        this.firstPrices_ = GeneratedMessageV3.mutableCopy(this.firstPrices_);
                        this.bitField0_ |= 1;
                    }
                }

                private void ensureLastPricesIsMutable() {
                    if ((this.bitField0_ & 2) == 0) {
                        this.lastPrices_ = GeneratedMessageV3.mutableCopy(this.lastPrices_);
                        this.bitField0_ |= 2;
                    }
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.EcpmOrBuilder
                public int getCount() {
                    return this.count_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.EcpmOrBuilder
                public double getFirstPrices(int i10) {
                    return this.firstPrices_.getDouble(i10);
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.EcpmOrBuilder
                public int getFirstPricesCount() {
                    return this.firstPrices_.size();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.EcpmOrBuilder
                public List<Double> getFirstPricesList() {
                    return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.firstPrices_) : this.firstPrices_;
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.EcpmOrBuilder
                public double getLastPrices(int i10) {
                    return this.lastPrices_.getDouble(i10);
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.EcpmOrBuilder
                public int getLastPricesCount() {
                    return this.lastPrices_.size();
                }

                @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.EcpmOrBuilder
                public List<Double> getLastPricesList() {
                    return (this.bitField0_ & 2) != 0 ? Collections.unmodifiableList(this.lastPrices_) : this.lastPrices_;
                }

                public Builder setCount(int i10) {
                    this.count_ = i10;
                    onChanged();
                    return this;
                }

                private Builder() {
                    this.firstPrices_ = GeneratedMessageV3.emptyDoubleList();
                    this.lastPrices_ = GeneratedMessageV3.emptyDoubleList();
                    maybeForceBuilderInitialization();
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return SessionDepth.internal_static_sessionmetrics_UserSession_Ecpm_descriptor;
                }

                private void maybeForceBuilderInitialization() {
                    boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
                }

                public Builder addAllFirstPrices(Iterable<? extends Double> iterable) {
                    ensureFirstPricesIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.firstPrices_);
                    onChanged();
                    return this;
                }

                public Builder addAllLastPrices(Iterable<? extends Double> iterable) {
                    ensureLastPricesIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.lastPrices_);
                    onChanged();
                    return this;
                }

                public Builder addFirstPrices(double d10) {
                    ensureFirstPricesIsMutable();
                    this.firstPrices_.addDouble(d10);
                    onChanged();
                    return this;
                }

                public Builder addLastPrices(double d10) {
                    ensureLastPricesIsMutable();
                    this.lastPrices_.addDouble(d10);
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Ecpm build() {
                    Ecpm ecpmBuildPartial = buildPartial();
                    if (ecpmBuildPartial.isInitialized()) {
                        return ecpmBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) ecpmBuildPartial);
                }

                @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Ecpm buildPartial() {
                    Ecpm ecpm = new Ecpm(this);
                    if ((this.bitField0_ & 1) != 0) {
                        this.firstPrices_.makeImmutable();
                        this.bitField0_ &= -2;
                    }
                    ecpm.firstPrices_ = this.firstPrices_;
                    if ((this.bitField0_ & 2) != 0) {
                        this.lastPrices_.makeImmutable();
                        this.bitField0_ &= -3;
                    }
                    ecpm.lastPrices_ = this.lastPrices_;
                    ecpm.count_ = this.count_;
                    onBuilt();
                    return ecpm;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public Builder clearFirstPrices() {
                    this.firstPrices_ = GeneratedMessageV3.emptyDoubleList();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearLastPrices() {
                    this.lastPrices_ = GeneratedMessageV3.emptyDoubleList();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
                public Ecpm getDefaultInstanceForType() {
                    return Ecpm.getDefaultInstance();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return SessionDepth.internal_static_sessionmetrics_UserSession_Ecpm_descriptor;
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return SessionDepth.internal_static_sessionmetrics_UserSession_Ecpm_fieldAccessorTable.ensureFieldAccessorsInitialized(Ecpm.class, Builder.class);
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                public Builder setFirstPrices(int i10, double d10) {
                    ensureFirstPricesIsMutable();
                    this.firstPrices_.setDouble(i10, d10);
                    onChanged();
                    return this;
                }

                public Builder setLastPrices(int i10, double d10) {
                    ensureLastPricesIsMutable();
                    this.lastPrices_.setDouble(i10, d10);
                    onChanged();
                    return this;
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

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.firstPrices_ = GeneratedMessageV3.emptyDoubleList();
                    this.bitField0_ &= -2;
                    this.lastPrices_ = GeneratedMessageV3.emptyDoubleList();
                    this.bitField0_ &= -3;
                    this.count_ = 0;
                    return this;
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.firstPrices_ = GeneratedMessageV3.emptyDoubleList();
                    this.lastPrices_ = GeneratedMessageV3.emptyDoubleList();
                    maybeForceBuilderInitialization();
                }

                @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo208clone() {
                    return (Builder) super.mo208clone();
                }

                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Ecpm) {
                        return mergeFrom((Ecpm) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(Ecpm ecpm) {
                    if (ecpm == Ecpm.getDefaultInstance()) {
                        return this;
                    }
                    if (!ecpm.firstPrices_.isEmpty()) {
                        if (this.firstPrices_.isEmpty()) {
                            this.firstPrices_ = ecpm.firstPrices_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureFirstPricesIsMutable();
                            this.firstPrices_.addAll(ecpm.firstPrices_);
                        }
                        onChanged();
                    }
                    if (!ecpm.lastPrices_.isEmpty()) {
                        if (this.lastPrices_.isEmpty()) {
                            this.lastPrices_ = ecpm.lastPrices_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureLastPricesIsMutable();
                            this.lastPrices_.addAll(ecpm.lastPrices_);
                        }
                        onChanged();
                    }
                    if (ecpm.getCount() != 0) {
                        setCount(ecpm.getCount());
                    }
                    mergeUnknownFields(ecpm.unknownFields);
                    onChanged();
                    return this;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0023  */
                @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
                public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                    Ecpm ecpm = null;
                    try {
                        try {
                            Ecpm ecpm2 = (Ecpm) Ecpm.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                            if (ecpm2 != null) {
                                mergeFrom(ecpm2);
                            }
                            return this;
                        } catch (InvalidProtocolBufferException e10) {
                            Ecpm ecpm3 = (Ecpm) e10.getUnfinishedMessage();
                            try {
                                throw e10.unwrapIOException();
                            } catch (Throwable th2) {
                                th = th2;
                                ecpm = ecpm3;
                                if (ecpm != null) {
                                    mergeFrom(ecpm);
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (ecpm != null) {
                            mergeFrom(ecpm);
                        }
                        throw th;
                    }
                }
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Ecpm parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Ecpm) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Ecpm parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer);
            }

            @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Ecpm)) {
                    return super.equals(obj);
                }
                Ecpm ecpm = (Ecpm) obj;
                return getFirstPricesList().equals(ecpm.getFirstPricesList()) && getLastPricesList().equals(ecpm.getLastPricesList()) && getCount() == ecpm.getCount() && this.unknownFields.equals(ecpm.unknownFields);
            }

            public static Ecpm getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Builder newBuilder(Ecpm ecpm) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(ecpm);
            }

            public static Ecpm parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            public static Parser<Ecpm> parser() {
                return PARSER;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.EcpmOrBuilder
            public int getCount() {
                return this.count_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.EcpmOrBuilder
            public double getFirstPrices(int i10) {
                return this.firstPrices_.getDouble(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.EcpmOrBuilder
            public int getFirstPricesCount() {
                return this.firstPrices_.size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.EcpmOrBuilder
            public List<Double> getFirstPricesList() {
                return this.firstPrices_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.EcpmOrBuilder
            public double getLastPrices(int i10) {
                return this.lastPrices_.getDouble(i10);
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.EcpmOrBuilder
            public int getLastPricesCount() {
                return this.lastPrices_.size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSession.EcpmOrBuilder
            public List<Double> getLastPricesList() {
                return this.lastPrices_;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Parser<Ecpm> getParserForType() {
                return PARSER;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int size = getFirstPricesList().size() * 8;
                int iComputeInt32SizeNoTag = size + 0;
                if (!getFirstPricesList().isEmpty()) {
                    iComputeInt32SizeNoTag = iComputeInt32SizeNoTag + 1 + CodedOutputStream.computeInt32SizeNoTag(size);
                }
                this.firstPricesMemoizedSerializedSize = size;
                int size2 = getLastPricesList().size() * 8;
                int iComputeInt32Size = iComputeInt32SizeNoTag + size2;
                if (!getLastPricesList().isEmpty()) {
                    iComputeInt32Size = iComputeInt32Size + 1 + CodedOutputStream.computeInt32SizeNoTag(size2);
                }
                this.lastPricesMemoizedSerializedSize = size2;
                int i11 = this.count_;
                if (i11 != 0) {
                    iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i11);
                }
                int serializedSize = iComputeInt32Size + this.unknownFields.getSerializedSize();
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
                int iHashCode = 779 + getDescriptor().hashCode();
                if (getFirstPricesCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getFirstPricesList().hashCode();
                }
                if (getLastPricesCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getLastPricesList().hashCode();
                }
                int count = (((((iHashCode * 37) + 3) * 53) + getCount()) * 29) + this.unknownFields.hashCode();
                this.memoizedHashCode = count;
                return count;
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
                return new Ecpm();
            }

            private Ecpm(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.firstPricesMemoizedSerializedSize = -1;
                this.lastPricesMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionDepth.internal_static_sessionmetrics_UserSession_Ecpm_descriptor;
            }

            public static Ecpm parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ecpm) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Ecpm parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Ecpm getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SessionDepth.internal_static_sessionmetrics_UserSession_Ecpm_fieldAccessorTable.ensureFieldAccessorsInitialized(Ecpm.class, Builder.class);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if (getFirstPricesList().size() > 0) {
                    codedOutputStream.writeUInt32NoTag(10);
                    codedOutputStream.writeUInt32NoTag(this.firstPricesMemoizedSerializedSize);
                }
                for (int i10 = 0; i10 < this.firstPrices_.size(); i10++) {
                    codedOutputStream.writeDoubleNoTag(this.firstPrices_.getDouble(i10));
                }
                if (getLastPricesList().size() > 0) {
                    codedOutputStream.writeUInt32NoTag(18);
                    codedOutputStream.writeUInt32NoTag(this.lastPricesMemoizedSerializedSize);
                }
                for (int i11 = 0; i11 < this.lastPrices_.size(); i11++) {
                    codedOutputStream.writeDoubleNoTag(this.lastPrices_.getDouble(i11));
                }
                int i12 = this.count_;
                if (i12 != 0) {
                    codedOutputStream.writeInt32(3, i12);
                }
                this.unknownFields.writeTo(codedOutputStream);
            }

            public static Ecpm parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Ecpm parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3
            public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new Builder(builderParent);
            }

            public static Ecpm parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            private Ecpm() {
                this.firstPricesMemoizedSerializedSize = -1;
                this.lastPricesMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = (byte) -1;
                this.firstPrices_ = GeneratedMessageV3.emptyDoubleList();
                this.lastPrices_ = GeneratedMessageV3.emptyDoubleList();
            }

            public static Ecpm parseFrom(InputStream inputStream) throws IOException {
                return (Ecpm) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Ecpm parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ecpm) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Ecpm parseFrom(CodedInputStream codedInputStream) throws IOException {
                return (Ecpm) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            private Ecpm(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this();
                extensionRegistryLite.getClass();
                UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
                boolean z10 = false;
                int i10 = 0;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 24) {
                                    this.count_ = codedInputStream.readInt32();
                                } else if (tag == 9) {
                                    if ((i10 & 1) == 0) {
                                        this.firstPrices_ = GeneratedMessageV3.newDoubleList();
                                        i10 |= 1;
                                    }
                                    this.firstPrices_.addDouble(codedInputStream.readDouble());
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i10 & 1) == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.firstPrices_ = GeneratedMessageV3.newDoubleList();
                                        i10 |= 1;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.firstPrices_.addDouble(codedInputStream.readDouble());
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 17) {
                                    if ((i10 & 2) == 0) {
                                        this.lastPrices_ = GeneratedMessageV3.newDoubleList();
                                        i10 |= 2;
                                    }
                                    this.lastPrices_.addDouble(codedInputStream.readDouble());
                                } else if (tag != 18) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if ((i10 & 2) == 0 && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.lastPrices_ = GeneratedMessageV3.newDoubleList();
                                        i10 |= 2;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.lastPrices_.addDouble(codedInputStream.readDouble());
                                    }
                                    codedInputStream.popLimit(iPushLimit2);
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                        }
                    } catch (Throwable th2) {
                        if ((i10 & 1) != 0) {
                            this.firstPrices_.makeImmutable();
                        }
                        if ((i10 & 2) != 0) {
                            this.lastPrices_.makeImmutable();
                        }
                        this.unknownFields = builderNewBuilder.build();
                        makeExtensionsImmutable();
                        throw th2;
                    }
                }
                if ((i10 & 1) != 0) {
                    this.firstPrices_.makeImmutable();
                }
                if ((i10 & 2) != 0) {
                    this.lastPrices_.makeImmutable();
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
            }

            public static Ecpm parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
                return (Ecpm) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public interface EcpmOrBuilder extends MessageOrBuilder {
            int getCount();

            double getFirstPrices(int i10);

            int getFirstPricesCount();

            List<Double> getFirstPricesList();

            double getLastPrices(int i10);

            int getLastPricesCount();

            List<Double> getLastPricesList();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserSession parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserSession) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserSession parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserSession)) {
                return super.equals(obj);
            }
            UserSession userSession = (UserSession) obj;
            return getLastActivity() == userSession.getLastActivity() && getMetricsByAdTypeList().equals(userSession.getMetricsByAdTypeList()) && getSessionStart() == userSession.getSessionStart() && this.unknownFields.equals(userSession.unknownFields);
        }

        public static UserSession getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(UserSession userSession) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userSession);
        }

        public static UserSession parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<UserSession> parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSessionOrBuilder
        public long getLastActivity() {
            return this.lastActivity_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSessionOrBuilder
        public AdTypeMetrics getMetricsByAdType(int i10) {
            return this.metricsByAdType_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSessionOrBuilder
        public int getMetricsByAdTypeCount() {
            return this.metricsByAdType_.size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSessionOrBuilder
        public List<AdTypeMetrics> getMetricsByAdTypeList() {
            return this.metricsByAdType_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSessionOrBuilder
        public AdTypeMetricsOrBuilder getMetricsByAdTypeOrBuilder(int i10) {
            return this.metricsByAdType_.get(i10);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSessionOrBuilder
        public List<? extends AdTypeMetricsOrBuilder> getMetricsByAdTypeOrBuilderList() {
            return this.metricsByAdType_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<UserSession> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.lastActivity_;
            int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(1, j10) + 0 : 0;
            for (int i11 = 0; i11 < this.metricsByAdType_.size(); i11++) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(3, this.metricsByAdType_.get(i11));
            }
            long j11 = this.sessionStart_;
            if (j11 != 0) {
                iComputeInt64Size += CodedOutputStream.computeInt64Size(4, j11);
            }
            int serializedSize = iComputeInt64Size + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserSessionOrBuilder
        public long getSessionStart() {
            return this.sessionStart_;
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
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getLastActivity());
            if (getMetricsByAdTypeCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getMetricsByAdTypeList().hashCode();
            }
            int iHashLong = (((((iHashCode * 37) + 4) * 53) + Internal.hashLong(getSessionStart())) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashLong;
            return iHashLong;
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
            return new UserSession();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j10 = this.lastActivity_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(1, j10);
            }
            for (int i10 = 0; i10 < this.metricsByAdType_.size(); i10++) {
                codedOutputStream.writeMessage(3, this.metricsByAdType_.get(i10));
            }
            long j11 = this.sessionStart_;
            if (j11 != 0) {
                codedOutputStream.writeInt64(4, j11);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private UserSession(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionDepth.internal_static_sessionmetrics_UserSession_descriptor;
        }

        public static UserSession parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UserSession) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserSession parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public UserSession getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SessionDepth.internal_static_sessionmetrics_UserSession_fieldAccessorTable.ensureFieldAccessorsInitialized(UserSession.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static UserSession parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private UserSession() {
            this.memoizedIsInitialized = (byte) -1;
            this.metricsByAdType_ = Collections.emptyList();
        }

        public static UserSession parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static UserSession parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserSession parseFrom(InputStream inputStream) throws IOException {
            return (UserSession) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private UserSession(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.lastActivity_ = codedInputStream.readInt64();
                                } else if (tag == 26) {
                                    if (!(z11 & true)) {
                                        this.metricsByAdType_ = new ArrayList();
                                        z11 |= true;
                                    }
                                    this.metricsByAdType_.add((AdTypeMetrics) codedInputStream.readMessage(AdTypeMetrics.parser(), extensionRegistryLite));
                                } else if (tag != 32) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.sessionStart_ = codedInputStream.readInt64();
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
                    if (z11 & true) {
                        this.metricsByAdType_ = Collections.unmodifiableList(this.metricsByAdType_);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11 & true) {
                this.metricsByAdType_ = Collections.unmodifiableList(this.metricsByAdType_);
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static UserSession parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UserSession) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserSession parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UserSession) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UserSession parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UserSession) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface UserSessionOrBuilder extends MessageOrBuilder {
        long getLastActivity();

        UserSession.AdTypeMetrics getMetricsByAdType(int i10);

        int getMetricsByAdTypeCount();

        List<UserSession.AdTypeMetrics> getMetricsByAdTypeList();

        UserSession.AdTypeMetricsOrBuilder getMetricsByAdTypeOrBuilder(int i10);

        List<? extends UserSession.AdTypeMetricsOrBuilder> getMetricsByAdTypeOrBuilderList();

        long getSessionStart();
    }

    public static final class UserState extends GeneratedMessageV3 implements UserStateOrBuilder {
        public static final int AD_REQUESTS_FIELD_NUMBER = 3;
        public static final int IMPRESSIONS_FIELD_NUMBER = 2;
        public static final int LAST_PROCESSED_TIMESTAMP_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private MapField<Integer, Timestamps> adRequests_;
        private MapField<Integer, AdDomainTimestamps> impressions_;
        private long lastProcessedTimestamp_;
        private byte memoizedIsInitialized;
        private static final UserState DEFAULT_INSTANCE = new UserState();
        private static final Parser<UserState> PARSER = new AbstractParser<UserState>() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserState.1
            @Override // com.explorestack.protobuf.Parser
            public UserState parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new UserState(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class AdRequestsDefaultEntryHolder {
            public static final MapEntry<Integer, Timestamps> defaultEntry = MapEntry.newDefaultInstance(SessionDepth.internal_static_sessionmetrics_UserState_AdRequestsEntry_descriptor, WireFormat.FieldType.INT32, 0, WireFormat.FieldType.MESSAGE, Timestamps.getDefaultInstance());

            private AdRequestsDefaultEntryHolder() {
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UserStateOrBuilder {
            private MapField<Integer, Timestamps> adRequests_;
            private int bitField0_;
            private MapField<Integer, AdDomainTimestamps> impressions_;
            private long lastProcessedTimestamp_;

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public MapField internalGetMapField(int i10) {
                if (i10 == 2) {
                    return internalGetImpressions();
                }
                if (i10 == 3) {
                    return internalGetAdRequests();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public MapField internalGetMutableMapField(int i10) {
                if (i10 == 2) {
                    return internalGetMutableImpressions();
                }
                if (i10 == 3) {
                    return internalGetMutableAdRequests();
                }
                throw new RuntimeException("Invalid map field number: " + i10);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private MapField<Integer, Timestamps> internalGetAdRequests() {
                MapField<Integer, Timestamps> mapField = this.adRequests_;
                return mapField == null ? MapField.emptyMapField(AdRequestsDefaultEntryHolder.defaultEntry) : mapField;
            }

            private MapField<Integer, AdDomainTimestamps> internalGetImpressions() {
                MapField<Integer, AdDomainTimestamps> mapField = this.impressions_;
                return mapField == null ? MapField.emptyMapField(ImpressionsDefaultEntryHolder.defaultEntry) : mapField;
            }

            public Builder clearLastProcessedTimestamp() {
                this.lastProcessedTimestamp_ = 0L;
                onChanged();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
            public long getLastProcessedTimestamp() {
                return this.lastProcessedTimestamp_;
            }

            public Builder setLastProcessedTimestamp(long j10) {
                this.lastProcessedTimestamp_ = j10;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionDepth.internal_static_sessionmetrics_UserState_descriptor;
            }

            private MapField<Integer, Timestamps> internalGetMutableAdRequests() {
                onChanged();
                if (this.adRequests_ == null) {
                    this.adRequests_ = MapField.newMapField(AdRequestsDefaultEntryHolder.defaultEntry);
                }
                if (!this.adRequests_.isMutable()) {
                    this.adRequests_ = this.adRequests_.copy();
                }
                return this.adRequests_;
            }

            private MapField<Integer, AdDomainTimestamps> internalGetMutableImpressions() {
                onChanged();
                if (this.impressions_ == null) {
                    this.impressions_ = MapField.newMapField(ImpressionsDefaultEntryHolder.defaultEntry);
                }
                if (!this.impressions_.isMutable()) {
                    this.impressions_ = this.impressions_.copy();
                }
                return this.impressions_;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserState build() {
                UserState userStateBuildPartial = buildPartial();
                if (userStateBuildPartial.isInitialized()) {
                    return userStateBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userStateBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public UserState buildPartial() {
                UserState userState = new UserState(this);
                userState.lastProcessedTimestamp_ = this.lastProcessedTimestamp_;
                userState.impressions_ = internalGetImpressions();
                userState.impressions_.makeImmutable();
                userState.adRequests_ = internalGetAdRequests();
                userState.adRequests_.makeImmutable();
                onBuilt();
                return userState;
            }

            public Builder clearAdRequests() {
                internalGetMutableAdRequests().getMutableMap().clear();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearImpressions() {
                internalGetMutableImpressions().getMutableMap().clear();
                return this;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
            public boolean containsAdRequests(int i10) {
                return internalGetAdRequests().getMap().containsKey(Integer.valueOf(i10));
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
            public boolean containsImpressions(int i10) {
                return internalGetImpressions().getMap().containsKey(Integer.valueOf(i10));
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
            @Deprecated
            public Map<Integer, Timestamps> getAdRequests() {
                return getAdRequestsMap();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
            public int getAdRequestsCount() {
                return internalGetAdRequests().getMap().size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
            public Map<Integer, Timestamps> getAdRequestsMap() {
                return internalGetAdRequests().getMap();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
            public Timestamps getAdRequestsOrDefault(int i10, Timestamps timestamps) {
                Map<Integer, Timestamps> map = internalGetAdRequests().getMap();
                if (map.containsKey(Integer.valueOf(i10))) {
                    return map.get(Integer.valueOf(i10));
                }
                return timestamps;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
            public Timestamps getAdRequestsOrThrow(int i10) {
                Map<Integer, Timestamps> map = internalGetAdRequests().getMap();
                if (map.containsKey(Integer.valueOf(i10))) {
                    return map.get(Integer.valueOf(i10));
                }
                throw new IllegalArgumentException();
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public UserState getDefaultInstanceForType() {
                return UserState.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionDepth.internal_static_sessionmetrics_UserState_descriptor;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
            @Deprecated
            public Map<Integer, AdDomainTimestamps> getImpressions() {
                return getImpressionsMap();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
            public int getImpressionsCount() {
                return internalGetImpressions().getMap().size();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
            public Map<Integer, AdDomainTimestamps> getImpressionsMap() {
                return internalGetImpressions().getMap();
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
            public AdDomainTimestamps getImpressionsOrDefault(int i10, AdDomainTimestamps adDomainTimestamps) {
                Map<Integer, AdDomainTimestamps> map = internalGetImpressions().getMap();
                if (map.containsKey(Integer.valueOf(i10))) {
                    return map.get(Integer.valueOf(i10));
                }
                return adDomainTimestamps;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
            public AdDomainTimestamps getImpressionsOrThrow(int i10) {
                Map<Integer, AdDomainTimestamps> map = internalGetImpressions().getMap();
                if (map.containsKey(Integer.valueOf(i10))) {
                    return map.get(Integer.valueOf(i10));
                }
                throw new IllegalArgumentException();
            }

            @Deprecated
            public Map<Integer, Timestamps> getMutableAdRequests() {
                return internalGetMutableAdRequests().getMutableMap();
            }

            @Deprecated
            public Map<Integer, AdDomainTimestamps> getMutableImpressions() {
                return internalGetMutableImpressions().getMutableMap();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SessionDepth.internal_static_sessionmetrics_UserState_fieldAccessorTable.ensureFieldAccessorsInitialized(UserState.class, Builder.class);
            }

            public Builder putAdRequests(int i10, Timestamps timestamps) {
                timestamps.getClass();
                internalGetMutableAdRequests().getMutableMap().put(Integer.valueOf(i10), timestamps);
                return this;
            }

            public Builder putAllAdRequests(Map<Integer, Timestamps> map) {
                internalGetMutableAdRequests().getMutableMap().putAll(map);
                return this;
            }

            public Builder putAllImpressions(Map<Integer, AdDomainTimestamps> map) {
                internalGetMutableImpressions().getMutableMap().putAll(map);
                return this;
            }

            public Builder putImpressions(int i10, AdDomainTimestamps adDomainTimestamps) {
                adDomainTimestamps.getClass();
                internalGetMutableImpressions().getMutableMap().put(Integer.valueOf(i10), adDomainTimestamps);
                return this;
            }

            public Builder removeAdRequests(int i10) {
                internalGetMutableAdRequests().getMutableMap().remove(Integer.valueOf(i10));
                return this;
            }

            public Builder removeImpressions(int i10) {
                internalGetMutableImpressions().getMutableMap().remove(Integer.valueOf(i10));
                return this;
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
                this.lastProcessedTimestamp_ = 0L;
                internalGetMutableImpressions().clear();
                internalGetMutableAdRequests().clear();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo208clone() {
                return (Builder) super.mo208clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UserState) {
                    return mergeFrom((UserState) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UserState userState) {
                if (userState == UserState.getDefaultInstance()) {
                    return this;
                }
                if (userState.getLastProcessedTimestamp() != 0) {
                    setLastProcessedTimestamp(userState.getLastProcessedTimestamp());
                }
                internalGetMutableImpressions().mergeFrom(userState.internalGetImpressions());
                internalGetMutableAdRequests().mergeFrom(userState.internalGetAdRequests());
                mergeUnknownFields(userState.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                UserState userState = null;
                try {
                    try {
                        UserState userState2 = (UserState) UserState.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (userState2 != null) {
                            mergeFrom(userState2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        UserState userState3 = (UserState) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            userState = userState3;
                            if (userState != null) {
                                mergeFrom(userState);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (userState != null) {
                        mergeFrom(userState);
                    }
                    throw th;
                }
            }
        }

        public static final class ImpressionsDefaultEntryHolder {
            public static final MapEntry<Integer, AdDomainTimestamps> defaultEntry = MapEntry.newDefaultInstance(SessionDepth.internal_static_sessionmetrics_UserState_ImpressionsEntry_descriptor, WireFormat.FieldType.INT32, 0, WireFormat.FieldType.MESSAGE, AdDomainTimestamps.getDefaultInstance());

            private ImpressionsDefaultEntryHolder() {
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserState parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserState) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserState parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserState)) {
                return super.equals(obj);
            }
            UserState userState = (UserState) obj;
            return getLastProcessedTimestamp() == userState.getLastProcessedTimestamp() && internalGetImpressions().equals(userState.internalGetImpressions()) && internalGetAdRequests().equals(userState.internalGetAdRequests()) && this.unknownFields.equals(userState.unknownFields);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public MapField internalGetMapField(int i10) {
            if (i10 == 2) {
                return internalGetImpressions();
            }
            if (i10 == 3) {
                return internalGetAdRequests();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        public static UserState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MapField<Integer, Timestamps> internalGetAdRequests() {
            MapField<Integer, Timestamps> mapField = this.adRequests_;
            return mapField == null ? MapField.emptyMapField(AdRequestsDefaultEntryHolder.defaultEntry) : mapField;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public MapField<Integer, AdDomainTimestamps> internalGetImpressions() {
            MapField<Integer, AdDomainTimestamps> mapField = this.impressions_;
            return mapField == null ? MapField.emptyMapField(ImpressionsDefaultEntryHolder.defaultEntry) : mapField;
        }

        public static Builder newBuilder(UserState userState) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userState);
        }

        public static UserState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<UserState> parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
        public long getLastProcessedTimestamp() {
            return this.lastProcessedTimestamp_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<UserState> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.lastProcessedTimestamp_;
            int iComputeInt64Size = j10 != 0 ? 0 + CodedOutputStream.computeInt64Size(1, j10) : 0;
            for (Map.Entry<Integer, AdDomainTimestamps> entry : internalGetImpressions().getMap().entrySet()) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(2, ImpressionsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
            }
            for (Map.Entry<Integer, Timestamps> entry2 : internalGetAdRequests().getMap().entrySet()) {
                iComputeInt64Size += CodedOutputStream.computeMessageSize(3, AdRequestsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry2.getKey()).setValue(entry2.getValue()).build());
            }
            int serializedSize = iComputeInt64Size + this.unknownFields.getSerializedSize();
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
            int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(getLastProcessedTimestamp());
            if (!internalGetImpressions().getMap().isEmpty()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + internalGetImpressions().hashCode();
            }
            if (!internalGetAdRequests().getMap().isEmpty()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + internalGetAdRequests().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
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
            return new UserState();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            long j10 = this.lastProcessedTimestamp_;
            if (j10 != 0) {
                codedOutputStream.writeInt64(1, j10);
            }
            GeneratedMessageV3.serializeIntegerMapTo(codedOutputStream, internalGetImpressions(), ImpressionsDefaultEntryHolder.defaultEntry, 2);
            GeneratedMessageV3.serializeIntegerMapTo(codedOutputStream, internalGetAdRequests(), AdRequestsDefaultEntryHolder.defaultEntry, 3);
            this.unknownFields.writeTo(codedOutputStream);
        }

        private UserState(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionDepth.internal_static_sessionmetrics_UserState_descriptor;
        }

        public static UserState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UserState) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserState parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
        public boolean containsAdRequests(int i10) {
            return internalGetAdRequests().getMap().containsKey(Integer.valueOf(i10));
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
        public boolean containsImpressions(int i10) {
            return internalGetImpressions().getMap().containsKey(Integer.valueOf(i10));
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
        @Deprecated
        public Map<Integer, Timestamps> getAdRequests() {
            return getAdRequestsMap();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
        public int getAdRequestsCount() {
            return internalGetAdRequests().getMap().size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
        public Map<Integer, Timestamps> getAdRequestsMap() {
            return internalGetAdRequests().getMap();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
        public Timestamps getAdRequestsOrDefault(int i10, Timestamps timestamps) {
            Map<Integer, Timestamps> map = internalGetAdRequests().getMap();
            if (map.containsKey(Integer.valueOf(i10))) {
                return map.get(Integer.valueOf(i10));
            }
            return timestamps;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
        public Timestamps getAdRequestsOrThrow(int i10) {
            Map<Integer, Timestamps> map = internalGetAdRequests().getMap();
            if (map.containsKey(Integer.valueOf(i10))) {
                return map.get(Integer.valueOf(i10));
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public UserState getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
        @Deprecated
        public Map<Integer, AdDomainTimestamps> getImpressions() {
            return getImpressionsMap();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
        public int getImpressionsCount() {
            return internalGetImpressions().getMap().size();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
        public Map<Integer, AdDomainTimestamps> getImpressionsMap() {
            return internalGetImpressions().getMap();
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
        public AdDomainTimestamps getImpressionsOrDefault(int i10, AdDomainTimestamps adDomainTimestamps) {
            Map<Integer, AdDomainTimestamps> map = internalGetImpressions().getMap();
            if (map.containsKey(Integer.valueOf(i10))) {
                return map.get(Integer.valueOf(i10));
            }
            return adDomainTimestamps;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.UserStateOrBuilder
        public AdDomainTimestamps getImpressionsOrThrow(int i10) {
            Map<Integer, AdDomainTimestamps> map = internalGetImpressions().getMap();
            if (map.containsKey(Integer.valueOf(i10))) {
                return map.get(Integer.valueOf(i10));
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SessionDepth.internal_static_sessionmetrics_UserState_fieldAccessorTable.ensureFieldAccessorsInitialized(UserState.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static UserState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private UserState() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserState parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static UserState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private UserState(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.lastProcessedTimestamp_ = codedInputStream.readInt64();
                            } else if (tag == 18) {
                                if ((i10 & 1) == 0) {
                                    this.impressions_ = MapField.newMapField(ImpressionsDefaultEntryHolder.defaultEntry);
                                    i10 |= 1;
                                }
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(ImpressionsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                this.impressions_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                            } else if (tag != 26) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((i10 & 2) == 0) {
                                    this.adRequests_ = MapField.newMapField(AdRequestsDefaultEntryHolder.defaultEntry);
                                    i10 |= 2;
                                }
                                MapEntry mapEntry2 = (MapEntry) codedInputStream.readMessage(AdRequestsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                this.adRequests_.getMutableMap().put(mapEntry2.getKey(), mapEntry2.getValue());
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

        public static UserState parseFrom(InputStream inputStream) throws IOException {
            return (UserState) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UserState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UserState) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserState parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (UserState) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UserState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (UserState) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface UserStateOrBuilder extends MessageOrBuilder {
        boolean containsAdRequests(int i10);

        boolean containsImpressions(int i10);

        @Deprecated
        Map<Integer, Timestamps> getAdRequests();

        int getAdRequestsCount();

        Map<Integer, Timestamps> getAdRequestsMap();

        Timestamps getAdRequestsOrDefault(int i10, Timestamps timestamps);

        Timestamps getAdRequestsOrThrow(int i10);

        @Deprecated
        Map<Integer, AdDomainTimestamps> getImpressions();

        int getImpressionsCount();

        Map<Integer, AdDomainTimestamps> getImpressionsMap();

        AdDomainTimestamps getImpressionsOrDefault(int i10, AdDomainTimestamps adDomainTimestamps);

        AdDomainTimestamps getImpressionsOrThrow(int i10);

        long getLastProcessedTimestamp();
    }

    public static final class WindowMetrics extends GeneratedMessageV3 implements WindowMetricsOrBuilder {
        public static final int LAST_1D_FIELD_NUMBER = 2;
        public static final int LAST_1H_FIELD_NUMBER = 1;
        public static final int LAST_7D_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int last1D_;
        private int last1H_;
        private int last7D_;
        private byte memoizedIsInitialized;
        private static final WindowMetrics DEFAULT_INSTANCE = new WindowMetrics();
        private static final Parser<WindowMetrics> PARSER = new AbstractParser<WindowMetrics>() { // from class: io.bidmachine.protobuf.sessionmetrics.SessionDepth.WindowMetrics.1
            @Override // com.explorestack.protobuf.Parser
            public WindowMetrics parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new WindowMetrics(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WindowMetricsOrBuilder {
            private int last1D_;
            private int last1H_;
            private int last7D_;

            public Builder clearLast1D() {
                this.last1D_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLast1H() {
                this.last1H_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLast7D() {
                this.last7D_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.WindowMetricsOrBuilder
            public int getLast1D() {
                return this.last1D_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.WindowMetricsOrBuilder
            public int getLast1H() {
                return this.last1H_;
            }

            @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.WindowMetricsOrBuilder
            public int getLast7D() {
                return this.last7D_;
            }

            public Builder setLast1D(int i10) {
                this.last1D_ = i10;
                onChanged();
                return this;
            }

            public Builder setLast1H(int i10) {
                this.last1H_ = i10;
                onChanged();
                return this;
            }

            public Builder setLast7D(int i10) {
                this.last7D_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                maybeForceBuilderInitialization();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return SessionDepth.internal_static_sessionmetrics_WindowMetrics_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public WindowMetrics build() {
                WindowMetrics windowMetricsBuildPartial = buildPartial();
                if (windowMetricsBuildPartial.isInitialized()) {
                    return windowMetricsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) windowMetricsBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public WindowMetrics buildPartial() {
                WindowMetrics windowMetrics = new WindowMetrics(this);
                windowMetrics.last1H_ = this.last1H_;
                windowMetrics.last1D_ = this.last1D_;
                windowMetrics.last7D_ = this.last7D_;
                onBuilt();
                return windowMetrics;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public WindowMetrics getDefaultInstanceForType() {
                return WindowMetrics.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return SessionDepth.internal_static_sessionmetrics_WindowMetrics_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return SessionDepth.internal_static_sessionmetrics_WindowMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(WindowMetrics.class, Builder.class);
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
                this.last1H_ = 0;
                this.last1D_ = 0;
                this.last7D_ = 0;
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo208clone() {
                return (Builder) super.mo208clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WindowMetrics) {
                    return mergeFrom((WindowMetrics) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WindowMetrics windowMetrics) {
                if (windowMetrics == WindowMetrics.getDefaultInstance()) {
                    return this;
                }
                if (windowMetrics.getLast1H() != 0) {
                    setLast1H(windowMetrics.getLast1H());
                }
                if (windowMetrics.getLast1D() != 0) {
                    setLast1D(windowMetrics.getLast1D());
                }
                if (windowMetrics.getLast7D() != 0) {
                    setLast7D(windowMetrics.getLast7D());
                }
                mergeUnknownFields(windowMetrics.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                WindowMetrics windowMetrics = null;
                try {
                    try {
                        WindowMetrics windowMetrics2 = (WindowMetrics) WindowMetrics.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (windowMetrics2 != null) {
                            mergeFrom(windowMetrics2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        WindowMetrics windowMetrics3 = (WindowMetrics) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            windowMetrics = windowMetrics3;
                            if (windowMetrics != null) {
                                mergeFrom(windowMetrics);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (windowMetrics != null) {
                        mergeFrom(windowMetrics);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WindowMetrics parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (WindowMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WindowMetrics parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WindowMetrics)) {
                return super.equals(obj);
            }
            WindowMetrics windowMetrics = (WindowMetrics) obj;
            return getLast1H() == windowMetrics.getLast1H() && getLast1D() == windowMetrics.getLast1D() && getLast7D() == windowMetrics.getLast7D() && this.unknownFields.equals(windowMetrics.unknownFields);
        }

        public static WindowMetrics getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder(WindowMetrics windowMetrics) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(windowMetrics);
        }

        public static WindowMetrics parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<WindowMetrics> parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.WindowMetricsOrBuilder
        public int getLast1D() {
            return this.last1D_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.WindowMetricsOrBuilder
        public int getLast1H() {
            return this.last1H_;
        }

        @Override // io.bidmachine.protobuf.sessionmetrics.SessionDepth.WindowMetricsOrBuilder
        public int getLast7D() {
            return this.last7D_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<WindowMetrics> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.last1H_;
            int iComputeInt32Size = i11 != 0 ? 0 + CodedOutputStream.computeInt32Size(1, i11) : 0;
            int i12 = this.last1D_;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
            }
            int i13 = this.last7D_;
            if (i13 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i13);
            }
            int serializedSize = iComputeInt32Size + this.unknownFields.getSerializedSize();
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
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getLast1H()) * 37) + 2) * 53) + getLast1D()) * 37) + 3) * 53) + getLast7D()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
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
            return new WindowMetrics();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            int i10 = this.last1H_;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            int i11 = this.last1D_;
            if (i11 != 0) {
                codedOutputStream.writeInt32(2, i11);
            }
            int i12 = this.last7D_;
            if (i12 != 0) {
                codedOutputStream.writeInt32(3, i12);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private WindowMetrics(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return SessionDepth.internal_static_sessionmetrics_WindowMetrics_descriptor;
        }

        public static WindowMetrics parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WindowMetrics) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WindowMetrics parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public WindowMetrics getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return SessionDepth.internal_static_sessionmetrics_WindowMetrics_fieldAccessorTable.ensureFieldAccessorsInitialized(WindowMetrics.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static WindowMetrics parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private WindowMetrics() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WindowMetrics parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static WindowMetrics parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private WindowMetrics(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.last1H_ = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.last1D_ = codedInputStream.readInt32();
                            } else if (tag != 24) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                this.last7D_ = codedInputStream.readInt32();
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

        public static WindowMetrics parseFrom(InputStream inputStream) throws IOException {
            return (WindowMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WindowMetrics parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WindowMetrics) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WindowMetrics parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (WindowMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WindowMetrics parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (WindowMetrics) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface WindowMetricsOrBuilder extends MessageOrBuilder {
        int getLast1D();

        int getLast1H();

        int getLast7D();
    }

    private SessionDepth() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_sessionmetrics_UserState_descriptor = descriptor2;
        internal_static_sessionmetrics_UserState_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"LastProcessedTimestamp", "Impressions", "AdRequests"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_sessionmetrics_UserState_ImpressionsEntry_descriptor = descriptor3;
        internal_static_sessionmetrics_UserState_ImpressionsEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor4 = descriptor2.getNestedTypes().get(1);
        internal_static_sessionmetrics_UserState_AdRequestsEntry_descriptor = descriptor4;
        internal_static_sessionmetrics_UserState_AdRequestsEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(1);
        internal_static_sessionmetrics_UserSession_descriptor = descriptor5;
        internal_static_sessionmetrics_UserSession_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"LastActivity", "MetricsByAdType", "SessionStart"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        internal_static_sessionmetrics_UserSession_Ecpm_descriptor = descriptor6;
        internal_static_sessionmetrics_UserSession_Ecpm_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"FirstPrices", "LastPrices", "Count"});
        Descriptors.Descriptor descriptor7 = descriptor5.getNestedTypes().get(1);
        internal_static_sessionmetrics_UserSession_AdTypeMetrics_descriptor = descriptor7;
        internal_static_sessionmetrics_UserSession_AdTypeMetrics_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"AdType", "Impressions", "AdRequests", "Bids", "Wins", "Losses", "Lurls", "Nurls", "CumulativeBidPrice", "CumulativeLurlPrice", "CumulativeNurlPrice", "Ecpm"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(2);
        internal_static_sessionmetrics_Timestamps_descriptor = descriptor8;
        internal_static_sessionmetrics_Timestamps_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"LastTimestamp", "Deltas", "DayBuckets"});
        Descriptors.Descriptor descriptor9 = descriptor8.getNestedTypes().get(0);
        internal_static_sessionmetrics_Timestamps_DayBucket_descriptor = descriptor9;
        internal_static_sessionmetrics_Timestamps_DayBucket_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"StartTime", "Count"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(3);
        internal_static_sessionmetrics_AdDomainTimestamps_descriptor = descriptor10;
        internal_static_sessionmetrics_AdDomainTimestamps_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"AdDomains"});
        Descriptors.Descriptor descriptor11 = descriptor10.getNestedTypes().get(0);
        internal_static_sessionmetrics_AdDomainTimestamps_AdDomainsEntry_descriptor = descriptor11;
        internal_static_sessionmetrics_AdDomainTimestamps_AdDomainsEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(4);
        internal_static_sessionmetrics_WindowMetrics_descriptor = descriptor12;
        internal_static_sessionmetrics_WindowMetrics_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Last1H", "Last1D", "Last7D"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(5);
        internal_static_sessionmetrics_ImpressionMetrics_descriptor = descriptor13;
        internal_static_sessionmetrics_ImpressionMetrics_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"AdType", "Domains"});
        Descriptors.Descriptor descriptor14 = descriptor13.getNestedTypes().get(0);
        internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_descriptor = descriptor14;
        internal_static_sessionmetrics_ImpressionMetrics_DomainMetrics_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Domain", "WindowMetrics"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(6);
        internal_static_sessionmetrics_AdRequestMetrics_descriptor = descriptor15;
        internal_static_sessionmetrics_AdRequestMetrics_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"AdType", "WindowMetrics"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(7);
        internal_static_sessionmetrics_SessionMetrics_descriptor = descriptor16;
        internal_static_sessionmetrics_SessionMetrics_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Impressions", "AdRequests", "CurrentSession"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(8);
        internal_static_sessionmetrics_UserIdQuery_descriptor = descriptor17;
        internal_static_sessionmetrics_UserIdQuery_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"UserId", "Timestamp"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(9);
        internal_static_sessionmetrics_AdRequest_descriptor = descriptor18;
        internal_static_sessionmetrics_AdRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"UserId", "AdType", "Timestamp"});
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
