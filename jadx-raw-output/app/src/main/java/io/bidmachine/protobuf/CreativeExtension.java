package io.bidmachine.protobuf;

import com.explorestack.protobuf.AbstractMessage;
import com.explorestack.protobuf.AbstractMessageLite;
import com.explorestack.protobuf.AbstractParser;
import com.explorestack.protobuf.ByteString;
import com.explorestack.protobuf.CodedInputStream;
import com.explorestack.protobuf.CodedOutputStream;
import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.ExtensionRegistryLite;
import com.explorestack.protobuf.GeneratedMessageV3;
import com.explorestack.protobuf.Internal;
import com.explorestack.protobuf.InvalidProtocolBufferException;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class CreativeExtension extends GeneratedMessageV3 implements CreativeExtensionOrBuilder {
    public static final int ASSET_FIELD_NUMBER = 1;
    public static final int FEATURES_FIELD_NUMBER = 2;
    public static final int POSTBANNERS_FIELD_NUMBER = 3;
    private static final long serialVersionUID = 0;
    private AssetAppearance asset_;
    private List<Feature> features_;
    private byte memoizedIsInitialized;
    private List<Postbanner> postbanners_;
    private static final CreativeExtension DEFAULT_INSTANCE = new CreativeExtension();
    private static final Parser<CreativeExtension> PARSER = new AbstractParser<CreativeExtension>() { // from class: io.bidmachine.protobuf.CreativeExtension.1
        @Override // com.explorestack.protobuf.Parser
        public CreativeExtension parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new CreativeExtension(codedInputStream, extensionRegistryLite);
        }
    };

    public static final class AssetAppearance extends GeneratedMessageV3 implements AssetAppearanceOrBuilder {
        public static final int AUTOROTATE_FIELD_NUMBER = 5;
        public static final int BACKGROUND_COLOR_FIELD_NUMBER = 12;
        public static final int CLOSABLE_VIEW_FIELD_NUMBER = 7;
        public static final int CLOSE_TIME_FIELD_NUMBER = 1;
        public static final int COUNTDOWN_FIELD_NUMBER = 6;
        public static final int CTA_FIELD_NUMBER = 9;
        public static final int DURATION_FIELD_NUMBER = 2;
        public static final int IGNORES_SAFE_AREA_LAYOUT_GUIDE_FIELD_NUMBER = 3;
        public static final int MUTE_ASSET_FIELD_NUMBER = 10;
        public static final int PROGRESS_FIELD_NUMBER = 8;
        public static final int USE_CUSTOM_CLOSE_FIELD_NUMBER = 4;
        public static final int VIDEO_ASSET_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private boolean autorotate_;
        private volatile Object backgroundColor_;
        private AssetModel closableView_;
        private float closeTime_;
        private AssetModel countdown_;
        private AssetModel cta_;
        private int duration_;
        private boolean ignoresSafeAreaLayoutGuide_;
        private byte memoizedIsInitialized;
        private AssetModel muteAsset_;
        private AssetModel progress_;
        private boolean useCustomClose_;
        private AssetModel videoAsset_;
        private static final AssetAppearance DEFAULT_INSTANCE = new AssetAppearance();
        private static final Parser<AssetAppearance> PARSER = new AbstractParser<AssetAppearance>() { // from class: io.bidmachine.protobuf.CreativeExtension.AssetAppearance.1
            @Override // com.explorestack.protobuf.Parser
            public AssetAppearance parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AssetAppearance(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AssetAppearanceOrBuilder {
            private boolean autorotate_;
            private Object backgroundColor_;
            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> closableViewBuilder_;
            private AssetModel closableView_;
            private float closeTime_;
            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> countdownBuilder_;
            private AssetModel countdown_;
            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> ctaBuilder_;
            private AssetModel cta_;
            private int duration_;
            private boolean ignoresSafeAreaLayoutGuide_;
            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> muteAssetBuilder_;
            private AssetModel muteAsset_;
            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> progressBuilder_;
            private AssetModel progress_;
            private boolean useCustomClose_;
            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> videoAssetBuilder_;
            private AssetModel videoAsset_;

            public Builder clearAutorotate() {
                this.autorotate_ = false;
                onChanged();
                return this;
            }

            public Builder clearCloseTime() {
                this.closeTime_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearDuration() {
                this.duration_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIgnoresSafeAreaLayoutGuide() {
                this.ignoresSafeAreaLayoutGuide_ = false;
                onChanged();
                return this;
            }

            public Builder clearUseCustomClose() {
                this.useCustomClose_ = false;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setClosableView(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.closableViewBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetModel.getClass();
                    this.closableView_ = assetModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(assetModel);
                }
                return this;
            }

            public Builder setCountdown(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetModel.getClass();
                    this.countdown_ = assetModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(assetModel);
                }
                return this;
            }

            public Builder setCta(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.ctaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetModel.getClass();
                    this.cta_ = assetModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(assetModel);
                }
                return this;
            }

            public Builder setMuteAsset(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.muteAssetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetModel.getClass();
                    this.muteAsset_ = assetModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(assetModel);
                }
                return this;
            }

            public Builder setProgress(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetModel.getClass();
                    this.progress_ = assetModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(assetModel);
                }
                return this;
            }

            public Builder setVideoAsset(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.videoAssetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetModel.getClass();
                    this.videoAsset_ = assetModel;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(assetModel);
                }
                return this;
            }

            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> getClosableViewFieldBuilder() {
                if (this.closableViewBuilder_ == null) {
                    this.closableViewBuilder_ = new SingleFieldBuilderV3<>(getClosableView(), getParentForChildren(), isClean());
                    this.closableView_ = null;
                }
                return this.closableViewBuilder_;
            }

            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> getCountdownFieldBuilder() {
                if (this.countdownBuilder_ == null) {
                    this.countdownBuilder_ = new SingleFieldBuilderV3<>(getCountdown(), getParentForChildren(), isClean());
                    this.countdown_ = null;
                }
                return this.countdownBuilder_;
            }

            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> getCtaFieldBuilder() {
                if (this.ctaBuilder_ == null) {
                    this.ctaBuilder_ = new SingleFieldBuilderV3<>(getCta(), getParentForChildren(), isClean());
                    this.cta_ = null;
                }
                return this.ctaBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetAppearance_descriptor;
            }

            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> getMuteAssetFieldBuilder() {
                if (this.muteAssetBuilder_ == null) {
                    this.muteAssetBuilder_ = new SingleFieldBuilderV3<>(getMuteAsset(), getParentForChildren(), isClean());
                    this.muteAsset_ = null;
                }
                return this.muteAssetBuilder_;
            }

            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> getProgressFieldBuilder() {
                if (this.progressBuilder_ == null) {
                    this.progressBuilder_ = new SingleFieldBuilderV3<>(getProgress(), getParentForChildren(), isClean());
                    this.progress_ = null;
                }
                return this.progressBuilder_;
            }

            private SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> getVideoAssetFieldBuilder() {
                if (this.videoAssetBuilder_ == null) {
                    this.videoAssetBuilder_ = new SingleFieldBuilderV3<>(getVideoAsset(), getParentForChildren(), isClean());
                    this.videoAsset_ = null;
                }
                return this.videoAssetBuilder_;
            }

            public Builder clearClosableView() {
                if (this.closableViewBuilder_ == null) {
                    this.closableView_ = null;
                    onChanged();
                } else {
                    this.closableView_ = null;
                    this.closableViewBuilder_ = null;
                }
                return this;
            }

            public Builder clearCountdown() {
                if (this.countdownBuilder_ == null) {
                    this.countdown_ = null;
                    onChanged();
                } else {
                    this.countdown_ = null;
                    this.countdownBuilder_ = null;
                }
                return this;
            }

            public Builder clearCta() {
                if (this.ctaBuilder_ == null) {
                    this.cta_ = null;
                    onChanged();
                } else {
                    this.cta_ = null;
                    this.ctaBuilder_ = null;
                }
                return this;
            }

            public Builder clearMuteAsset() {
                if (this.muteAssetBuilder_ == null) {
                    this.muteAsset_ = null;
                    onChanged();
                } else {
                    this.muteAsset_ = null;
                    this.muteAssetBuilder_ = null;
                }
                return this;
            }

            public Builder clearProgress() {
                if (this.progressBuilder_ == null) {
                    this.progress_ = null;
                    onChanged();
                } else {
                    this.progress_ = null;
                    this.progressBuilder_ = null;
                }
                return this;
            }

            public Builder clearVideoAsset() {
                if (this.videoAssetBuilder_ == null) {
                    this.videoAsset_ = null;
                    onChanged();
                } else {
                    this.videoAsset_ = null;
                    this.videoAssetBuilder_ = null;
                }
                return this;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean getAutorotate() {
                return this.autorotate_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public String getBackgroundColor() {
                Object obj = this.backgroundColor_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.backgroundColor_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public ByteString getBackgroundColorBytes() {
                Object obj = this.backgroundColor_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.backgroundColor_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getClosableView() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.closableViewBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssetModel) singleFieldBuilderV3.getMessage();
                }
                AssetModel assetModel = this.closableView_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getClosableViewOrBuilder() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.closableViewBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssetModelOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssetModel assetModel = this.closableView_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public float getCloseTime() {
                return this.closeTime_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getCountdown() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssetModel) singleFieldBuilderV3.getMessage();
                }
                AssetModel assetModel = this.countdown_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getCountdownOrBuilder() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssetModelOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssetModel assetModel = this.countdown_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getCta() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.ctaBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssetModel) singleFieldBuilderV3.getMessage();
                }
                AssetModel assetModel = this.cta_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getCtaOrBuilder() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.ctaBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssetModelOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssetModel assetModel = this.cta_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetAppearance_descriptor;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public int getDuration() {
                return this.duration_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean getIgnoresSafeAreaLayoutGuide() {
                return this.ignoresSafeAreaLayoutGuide_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getMuteAsset() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.muteAssetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssetModel) singleFieldBuilderV3.getMessage();
                }
                AssetModel assetModel = this.muteAsset_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getMuteAssetOrBuilder() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.muteAssetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssetModelOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssetModel assetModel = this.muteAsset_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getProgress() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssetModel) singleFieldBuilderV3.getMessage();
                }
                AssetModel assetModel = this.progress_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getProgressOrBuilder() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssetModelOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssetModel assetModel = this.progress_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean getUseCustomClose() {
                return this.useCustomClose_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModel getVideoAsset() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.videoAssetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssetModel) singleFieldBuilderV3.getMessage();
                }
                AssetModel assetModel = this.videoAsset_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public AssetModelOrBuilder getVideoAssetOrBuilder() {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.videoAssetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssetModelOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssetModel assetModel = this.videoAsset_;
                return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasClosableView() {
                return (this.closableViewBuilder_ == null && this.closableView_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasCountdown() {
                return (this.countdownBuilder_ == null && this.countdown_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasCta() {
                return (this.ctaBuilder_ == null && this.cta_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasMuteAsset() {
                return (this.muteAssetBuilder_ == null && this.muteAsset_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasProgress() {
                return (this.progressBuilder_ == null && this.progress_ == null) ? false : true;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
            public boolean hasVideoAsset() {
                return (this.videoAssetBuilder_ == null && this.videoAsset_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetAppearance_fieldAccessorTable.ensureFieldAccessorsInitialized(AssetAppearance.class, Builder.class);
            }

            public Builder mergeClosableView(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.closableViewBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel2 = this.closableView_;
                    if (assetModel2 != null) {
                        this.closableView_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                    } else {
                        this.closableView_ = assetModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(assetModel);
                }
                return this;
            }

            public Builder mergeCountdown(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel2 = this.countdown_;
                    if (assetModel2 != null) {
                        this.countdown_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                    } else {
                        this.countdown_ = assetModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(assetModel);
                }
                return this;
            }

            public Builder mergeCta(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.ctaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel2 = this.cta_;
                    if (assetModel2 != null) {
                        this.cta_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                    } else {
                        this.cta_ = assetModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(assetModel);
                }
                return this;
            }

            public Builder mergeMuteAsset(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.muteAssetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel2 = this.muteAsset_;
                    if (assetModel2 != null) {
                        this.muteAsset_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                    } else {
                        this.muteAsset_ = assetModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(assetModel);
                }
                return this;
            }

            public Builder mergeProgress(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel2 = this.progress_;
                    if (assetModel2 != null) {
                        this.progress_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                    } else {
                        this.progress_ = assetModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(assetModel);
                }
                return this;
            }

            public Builder mergeVideoAsset(AssetModel assetModel) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.videoAssetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetModel assetModel2 = this.videoAsset_;
                    if (assetModel2 != null) {
                        this.videoAsset_ = AssetModel.newBuilder(assetModel2).mergeFrom(assetModel).buildPartial();
                    } else {
                        this.videoAsset_ = assetModel;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(assetModel);
                }
                return this;
            }

            public Builder setAutorotate(boolean z10) {
                this.autorotate_ = z10;
                onChanged();
                return this;
            }

            public Builder setCloseTime(float f10) {
                this.closeTime_ = f10;
                onChanged();
                return this;
            }

            public Builder setDuration(int i10) {
                this.duration_ = i10;
                onChanged();
                return this;
            }

            public Builder setIgnoresSafeAreaLayoutGuide(boolean z10) {
                this.ignoresSafeAreaLayoutGuide_ = z10;
                onChanged();
                return this;
            }

            public Builder setUseCustomClose(boolean z10) {
                this.useCustomClose_ = z10;
                onChanged();
                return this;
            }

            private Builder() {
                this.backgroundColor_ = "";
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
            public AssetAppearance build() {
                AssetAppearance assetAppearanceBuildPartial = buildPartial();
                if (assetAppearanceBuildPartial.isInitialized()) {
                    return assetAppearanceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) assetAppearanceBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AssetAppearance buildPartial() {
                AssetAppearance assetAppearance = new AssetAppearance(this);
                assetAppearance.closeTime_ = this.closeTime_;
                assetAppearance.duration_ = this.duration_;
                assetAppearance.ignoresSafeAreaLayoutGuide_ = this.ignoresSafeAreaLayoutGuide_;
                assetAppearance.useCustomClose_ = this.useCustomClose_;
                assetAppearance.autorotate_ = this.autorotate_;
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetAppearance.countdown_ = this.countdown_;
                } else {
                    assetAppearance.countdown_ = (AssetModel) singleFieldBuilderV3.build();
                }
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV4 = this.closableViewBuilder_;
                if (singleFieldBuilderV4 == null) {
                    assetAppearance.closableView_ = this.closableView_;
                } else {
                    assetAppearance.closableView_ = (AssetModel) singleFieldBuilderV4.build();
                }
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV5 = this.progressBuilder_;
                if (singleFieldBuilderV5 == null) {
                    assetAppearance.progress_ = this.progress_;
                } else {
                    assetAppearance.progress_ = (AssetModel) singleFieldBuilderV5.build();
                }
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV6 = this.ctaBuilder_;
                if (singleFieldBuilderV6 == null) {
                    assetAppearance.cta_ = this.cta_;
                } else {
                    assetAppearance.cta_ = (AssetModel) singleFieldBuilderV6.build();
                }
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV7 = this.muteAssetBuilder_;
                if (singleFieldBuilderV7 == null) {
                    assetAppearance.muteAsset_ = this.muteAsset_;
                } else {
                    assetAppearance.muteAsset_ = (AssetModel) singleFieldBuilderV7.build();
                }
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV8 = this.videoAssetBuilder_;
                if (singleFieldBuilderV8 == null) {
                    assetAppearance.videoAsset_ = this.videoAsset_;
                } else {
                    assetAppearance.videoAsset_ = (AssetModel) singleFieldBuilderV8.build();
                }
                assetAppearance.backgroundColor_ = this.backgroundColor_;
                onBuilt();
                return assetAppearance;
            }

            public Builder clearBackgroundColor() {
                this.backgroundColor_ = AssetAppearance.getDefaultInstance().getBackgroundColor();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public AssetModel.Builder getClosableViewBuilder() {
                onChanged();
                return (AssetModel.Builder) getClosableViewFieldBuilder().getBuilder();
            }

            public AssetModel.Builder getCountdownBuilder() {
                onChanged();
                return (AssetModel.Builder) getCountdownFieldBuilder().getBuilder();
            }

            public AssetModel.Builder getCtaBuilder() {
                onChanged();
                return (AssetModel.Builder) getCtaFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public AssetAppearance getDefaultInstanceForType() {
                return AssetAppearance.getDefaultInstance();
            }

            public AssetModel.Builder getMuteAssetBuilder() {
                onChanged();
                return (AssetModel.Builder) getMuteAssetFieldBuilder().getBuilder();
            }

            public AssetModel.Builder getProgressBuilder() {
                onChanged();
                return (AssetModel.Builder) getProgressFieldBuilder().getBuilder();
            }

            public AssetModel.Builder getVideoAssetBuilder() {
                onChanged();
                return (AssetModel.Builder) getVideoAssetFieldBuilder().getBuilder();
            }

            public Builder setBackgroundColor(String str) {
                str.getClass();
                this.backgroundColor_ = str;
                onChanged();
                return this;
            }

            public Builder setBackgroundColorBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.backgroundColor_ = byteString;
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
                this.closeTime_ = 0.0f;
                this.duration_ = 0;
                this.ignoresSafeAreaLayoutGuide_ = false;
                this.useCustomClose_ = false;
                this.autorotate_ = false;
                if (this.countdownBuilder_ == null) {
                    this.countdown_ = null;
                } else {
                    this.countdown_ = null;
                    this.countdownBuilder_ = null;
                }
                if (this.closableViewBuilder_ == null) {
                    this.closableView_ = null;
                } else {
                    this.closableView_ = null;
                    this.closableViewBuilder_ = null;
                }
                if (this.progressBuilder_ == null) {
                    this.progress_ = null;
                } else {
                    this.progress_ = null;
                    this.progressBuilder_ = null;
                }
                if (this.ctaBuilder_ == null) {
                    this.cta_ = null;
                } else {
                    this.cta_ = null;
                    this.ctaBuilder_ = null;
                }
                if (this.muteAssetBuilder_ == null) {
                    this.muteAsset_ = null;
                } else {
                    this.muteAsset_ = null;
                    this.muteAssetBuilder_ = null;
                }
                if (this.videoAssetBuilder_ == null) {
                    this.videoAsset_ = null;
                } else {
                    this.videoAsset_ = null;
                    this.videoAssetBuilder_ = null;
                }
                this.backgroundColor_ = "";
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.backgroundColor_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setClosableView(AssetModel.Builder builder) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.closableViewBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.closableView_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setCountdown(AssetModel.Builder builder) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.countdown_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setCta(AssetModel.Builder builder) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.ctaBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.cta_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setMuteAsset(AssetModel.Builder builder) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.muteAssetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.muteAsset_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setProgress(AssetModel.Builder builder) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.progress_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            public Builder setVideoAsset(AssetModel.Builder builder) {
                SingleFieldBuilderV3<AssetModel, AssetModel.Builder, AssetModelOrBuilder> singleFieldBuilderV3 = this.videoAssetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.videoAsset_ = builder.build();
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
                if (message instanceof AssetAppearance) {
                    return mergeFrom((AssetAppearance) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AssetAppearance assetAppearance) {
                if (assetAppearance == AssetAppearance.getDefaultInstance()) {
                    return this;
                }
                if (assetAppearance.getCloseTime() != 0.0f) {
                    setCloseTime(assetAppearance.getCloseTime());
                }
                if (assetAppearance.getDuration() != 0) {
                    setDuration(assetAppearance.getDuration());
                }
                if (assetAppearance.getIgnoresSafeAreaLayoutGuide()) {
                    setIgnoresSafeAreaLayoutGuide(assetAppearance.getIgnoresSafeAreaLayoutGuide());
                }
                if (assetAppearance.getUseCustomClose()) {
                    setUseCustomClose(assetAppearance.getUseCustomClose());
                }
                if (assetAppearance.getAutorotate()) {
                    setAutorotate(assetAppearance.getAutorotate());
                }
                if (assetAppearance.hasCountdown()) {
                    mergeCountdown(assetAppearance.getCountdown());
                }
                if (assetAppearance.hasClosableView()) {
                    mergeClosableView(assetAppearance.getClosableView());
                }
                if (assetAppearance.hasProgress()) {
                    mergeProgress(assetAppearance.getProgress());
                }
                if (assetAppearance.hasCta()) {
                    mergeCta(assetAppearance.getCta());
                }
                if (assetAppearance.hasMuteAsset()) {
                    mergeMuteAsset(assetAppearance.getMuteAsset());
                }
                if (assetAppearance.hasVideoAsset()) {
                    mergeVideoAsset(assetAppearance.getVideoAsset());
                }
                if (!assetAppearance.getBackgroundColor().isEmpty()) {
                    this.backgroundColor_ = assetAppearance.backgroundColor_;
                    onChanged();
                }
                mergeUnknownFields(assetAppearance.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                AssetAppearance assetAppearance = null;
                try {
                    try {
                        AssetAppearance assetAppearance2 = (AssetAppearance) AssetAppearance.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (assetAppearance2 != null) {
                            mergeFrom(assetAppearance2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        AssetAppearance assetAppearance3 = (AssetAppearance) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            assetAppearance = assetAppearance3;
                            if (assetAppearance != null) {
                                mergeFrom(assetAppearance);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (assetAppearance != null) {
                        mergeFrom(assetAppearance);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AssetAppearance parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetAppearance) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AssetAppearance parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AssetAppearance)) {
                return super.equals(obj);
            }
            AssetAppearance assetAppearance = (AssetAppearance) obj;
            if (Float.floatToIntBits(getCloseTime()) != Float.floatToIntBits(assetAppearance.getCloseTime()) || getDuration() != assetAppearance.getDuration() || getIgnoresSafeAreaLayoutGuide() != assetAppearance.getIgnoresSafeAreaLayoutGuide() || getUseCustomClose() != assetAppearance.getUseCustomClose() || getAutorotate() != assetAppearance.getAutorotate() || hasCountdown() != assetAppearance.hasCountdown()) {
                return false;
            }
            if ((hasCountdown() && !getCountdown().equals(assetAppearance.getCountdown())) || hasClosableView() != assetAppearance.hasClosableView()) {
                return false;
            }
            if ((hasClosableView() && !getClosableView().equals(assetAppearance.getClosableView())) || hasProgress() != assetAppearance.hasProgress()) {
                return false;
            }
            if ((hasProgress() && !getProgress().equals(assetAppearance.getProgress())) || hasCta() != assetAppearance.hasCta()) {
                return false;
            }
            if ((hasCta() && !getCta().equals(assetAppearance.getCta())) || hasMuteAsset() != assetAppearance.hasMuteAsset()) {
                return false;
            }
            if ((!hasMuteAsset() || getMuteAsset().equals(assetAppearance.getMuteAsset())) && hasVideoAsset() == assetAppearance.hasVideoAsset()) {
                return (!hasVideoAsset() || getVideoAsset().equals(assetAppearance.getVideoAsset())) && getBackgroundColor().equals(assetAppearance.getBackgroundColor()) && this.unknownFields.equals(assetAppearance.unknownFields);
            }
            return false;
        }

        public static AssetAppearance getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetAppearance_descriptor;
        }

        public static Builder newBuilder(AssetAppearance assetAppearance) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(assetAppearance);
        }

        public static AssetAppearance parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<AssetAppearance> parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean getAutorotate() {
            return this.autorotate_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public String getBackgroundColor() {
            Object obj = this.backgroundColor_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.backgroundColor_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public ByteString getBackgroundColorBytes() {
            Object obj = this.backgroundColor_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.backgroundColor_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getClosableView() {
            AssetModel assetModel = this.closableView_;
            return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public float getCloseTime() {
            return this.closeTime_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getCountdown() {
            AssetModel assetModel = this.countdown_;
            return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getCta() {
            AssetModel assetModel = this.cta_;
            return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public int getDuration() {
            return this.duration_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean getIgnoresSafeAreaLayoutGuide() {
            return this.ignoresSafeAreaLayoutGuide_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getMuteAsset() {
            AssetModel assetModel = this.muteAsset_;
            return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<AssetAppearance> getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getProgress() {
            AssetModel assetModel = this.progress_;
            return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            float f10 = this.closeTime_;
            int iComputeFloatSize = f10 != 0.0f ? 0 + CodedOutputStream.computeFloatSize(1, f10) : 0;
            int i11 = this.duration_;
            if (i11 != 0) {
                iComputeFloatSize += CodedOutputStream.computeUInt32Size(2, i11);
            }
            boolean z10 = this.ignoresSafeAreaLayoutGuide_;
            if (z10) {
                iComputeFloatSize += CodedOutputStream.computeBoolSize(3, z10);
            }
            boolean z11 = this.useCustomClose_;
            if (z11) {
                iComputeFloatSize += CodedOutputStream.computeBoolSize(4, z11);
            }
            boolean z12 = this.autorotate_;
            if (z12) {
                iComputeFloatSize += CodedOutputStream.computeBoolSize(5, z12);
            }
            if (this.countdown_ != null) {
                iComputeFloatSize += CodedOutputStream.computeMessageSize(6, getCountdown());
            }
            if (this.closableView_ != null) {
                iComputeFloatSize += CodedOutputStream.computeMessageSize(7, getClosableView());
            }
            if (this.progress_ != null) {
                iComputeFloatSize += CodedOutputStream.computeMessageSize(8, getProgress());
            }
            if (this.cta_ != null) {
                iComputeFloatSize += CodedOutputStream.computeMessageSize(9, getCta());
            }
            if (this.muteAsset_ != null) {
                iComputeFloatSize += CodedOutputStream.computeMessageSize(10, getMuteAsset());
            }
            if (this.videoAsset_ != null) {
                iComputeFloatSize += CodedOutputStream.computeMessageSize(11, getVideoAsset());
            }
            if (!getBackgroundColorBytes().isEmpty()) {
                iComputeFloatSize += GeneratedMessageV3.computeStringSize(12, this.backgroundColor_);
            }
            int serializedSize = iComputeFloatSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean getUseCustomClose() {
            return this.useCustomClose_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModel getVideoAsset() {
            AssetModel assetModel = this.videoAsset_;
            return assetModel == null ? AssetModel.getDefaultInstance() : assetModel;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasClosableView() {
            return this.closableView_ != null;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasCountdown() {
            return this.countdown_ != null;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasCta() {
            return this.cta_ != null;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasMuteAsset() {
            return this.muteAsset_ != null;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasProgress() {
            return this.progress_ != null;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public boolean hasVideoAsset() {
            return this.videoAsset_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Float.floatToIntBits(getCloseTime())) * 37) + 2) * 53) + getDuration()) * 37) + 3) * 53) + Internal.hashBoolean(getIgnoresSafeAreaLayoutGuide())) * 37) + 4) * 53) + Internal.hashBoolean(getUseCustomClose())) * 37) + 5) * 53) + Internal.hashBoolean(getAutorotate());
            if (hasCountdown()) {
                iHashCode = (((iHashCode * 37) + 6) * 53) + getCountdown().hashCode();
            }
            if (hasClosableView()) {
                iHashCode = (((iHashCode * 37) + 7) * 53) + getClosableView().hashCode();
            }
            if (hasProgress()) {
                iHashCode = (((iHashCode * 37) + 8) * 53) + getProgress().hashCode();
            }
            if (hasCta()) {
                iHashCode = (((iHashCode * 37) + 9) * 53) + getCta().hashCode();
            }
            if (hasMuteAsset()) {
                iHashCode = (((iHashCode * 37) + 10) * 53) + getMuteAsset().hashCode();
            }
            if (hasVideoAsset()) {
                iHashCode = (((iHashCode * 37) + 11) * 53) + getVideoAsset().hashCode();
            }
            int iHashCode2 = (((((iHashCode * 37) + 12) * 53) + getBackgroundColor().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetAppearance_fieldAccessorTable.ensureFieldAccessorsInitialized(AssetAppearance.class, Builder.class);
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
            return new AssetAppearance();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            float f10 = this.closeTime_;
            if (f10 != 0.0f) {
                codedOutputStream.writeFloat(1, f10);
            }
            int i10 = this.duration_;
            if (i10 != 0) {
                codedOutputStream.writeUInt32(2, i10);
            }
            boolean z10 = this.ignoresSafeAreaLayoutGuide_;
            if (z10) {
                codedOutputStream.writeBool(3, z10);
            }
            boolean z11 = this.useCustomClose_;
            if (z11) {
                codedOutputStream.writeBool(4, z11);
            }
            boolean z12 = this.autorotate_;
            if (z12) {
                codedOutputStream.writeBool(5, z12);
            }
            if (this.countdown_ != null) {
                codedOutputStream.writeMessage(6, getCountdown());
            }
            if (this.closableView_ != null) {
                codedOutputStream.writeMessage(7, getClosableView());
            }
            if (this.progress_ != null) {
                codedOutputStream.writeMessage(8, getProgress());
            }
            if (this.cta_ != null) {
                codedOutputStream.writeMessage(9, getCta());
            }
            if (this.muteAsset_ != null) {
                codedOutputStream.writeMessage(10, getMuteAsset());
            }
            if (this.videoAsset_ != null) {
                codedOutputStream.writeMessage(11, getVideoAsset());
            }
            if (!getBackgroundColorBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 12, this.backgroundColor_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private AssetAppearance(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AssetAppearance parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetAppearance) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AssetAppearance parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getClosableViewOrBuilder() {
            return getClosableView();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getCountdownOrBuilder() {
            return getCountdown();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getCtaOrBuilder() {
            return getCta();
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public AssetAppearance getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getMuteAssetOrBuilder() {
            return getMuteAsset();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getProgressOrBuilder() {
            return getProgress();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetAppearanceOrBuilder
        public AssetModelOrBuilder getVideoAssetOrBuilder() {
            return getVideoAsset();
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static AssetAppearance parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AssetAppearance() {
            this.memoizedIsInitialized = (byte) -1;
            this.backgroundColor_ = "";
        }

        public static AssetAppearance parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AssetAppearance parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AssetAppearance parseFrom(InputStream inputStream) throws IOException {
            return (AssetAppearance) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private AssetAppearance(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            AssetModel.Builder builder;
            this();
            extensionRegistryLite.getClass();
            UnknownFieldSet.Builder builderNewBuilder = UnknownFieldSet.newBuilder();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            switch (tag) {
                                case 0:
                                    break;
                                case 13:
                                    this.closeTime_ = codedInputStream.readFloat();
                                    continue;
                                case 16:
                                    this.duration_ = codedInputStream.readUInt32();
                                    continue;
                                case 24:
                                    this.ignoresSafeAreaLayoutGuide_ = codedInputStream.readBool();
                                    continue;
                                case 32:
                                    this.useCustomClose_ = codedInputStream.readBool();
                                    continue;
                                case 40:
                                    this.autorotate_ = codedInputStream.readBool();
                                    continue;
                                case 50:
                                    AssetModel assetModel = this.countdown_;
                                    builder = assetModel != null ? assetModel.toBuilder() : null;
                                    AssetModel assetModel2 = (AssetModel) codedInputStream.readMessage(AssetModel.parser(), extensionRegistryLite);
                                    this.countdown_ = assetModel2;
                                    if (builder != null) {
                                        builder.mergeFrom(assetModel2);
                                        this.countdown_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 58:
                                    AssetModel assetModel3 = this.closableView_;
                                    builder = assetModel3 != null ? assetModel3.toBuilder() : null;
                                    AssetModel assetModel4 = (AssetModel) codedInputStream.readMessage(AssetModel.parser(), extensionRegistryLite);
                                    this.closableView_ = assetModel4;
                                    if (builder != null) {
                                        builder.mergeFrom(assetModel4);
                                        this.closableView_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 66:
                                    AssetModel assetModel5 = this.progress_;
                                    builder = assetModel5 != null ? assetModel5.toBuilder() : null;
                                    AssetModel assetModel6 = (AssetModel) codedInputStream.readMessage(AssetModel.parser(), extensionRegistryLite);
                                    this.progress_ = assetModel6;
                                    if (builder != null) {
                                        builder.mergeFrom(assetModel6);
                                        this.progress_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 74:
                                    AssetModel assetModel7 = this.cta_;
                                    builder = assetModel7 != null ? assetModel7.toBuilder() : null;
                                    AssetModel assetModel8 = (AssetModel) codedInputStream.readMessage(AssetModel.parser(), extensionRegistryLite);
                                    this.cta_ = assetModel8;
                                    if (builder != null) {
                                        builder.mergeFrom(assetModel8);
                                        this.cta_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 82:
                                    AssetModel assetModel9 = this.muteAsset_;
                                    builder = assetModel9 != null ? assetModel9.toBuilder() : null;
                                    AssetModel assetModel10 = (AssetModel) codedInputStream.readMessage(AssetModel.parser(), extensionRegistryLite);
                                    this.muteAsset_ = assetModel10;
                                    if (builder != null) {
                                        builder.mergeFrom(assetModel10);
                                        this.muteAsset_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 90:
                                    AssetModel assetModel11 = this.videoAsset_;
                                    builder = assetModel11 != null ? assetModel11.toBuilder() : null;
                                    AssetModel assetModel12 = (AssetModel) codedInputStream.readMessage(AssetModel.parser(), extensionRegistryLite);
                                    this.videoAsset_ = assetModel12;
                                    if (builder != null) {
                                        builder.mergeFrom(assetModel12);
                                        this.videoAsset_ = builder.buildPartial();
                                    } else {
                                        continue;
                                    }
                                    break;
                                case 98:
                                    this.backgroundColor_ = codedInputStream.readStringRequireUtf8();
                                    continue;
                                default:
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
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

        public static AssetAppearance parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetAppearance) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AssetAppearance parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AssetAppearance) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AssetAppearance parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetAppearance) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AssetAppearanceOrBuilder extends MessageOrBuilder {
        boolean getAutorotate();

        String getBackgroundColor();

        ByteString getBackgroundColorBytes();

        AssetModel getClosableView();

        AssetModelOrBuilder getClosableViewOrBuilder();

        float getCloseTime();

        AssetModel getCountdown();

        AssetModelOrBuilder getCountdownOrBuilder();

        AssetModel getCta();

        AssetModelOrBuilder getCtaOrBuilder();

        int getDuration();

        boolean getIgnoresSafeAreaLayoutGuide();

        AssetModel getMuteAsset();

        AssetModelOrBuilder getMuteAssetOrBuilder();

        AssetModel getProgress();

        AssetModelOrBuilder getProgressOrBuilder();

        boolean getUseCustomClose();

        AssetModel getVideoAsset();

        AssetModelOrBuilder getVideoAssetOrBuilder();

        boolean hasClosableView();

        boolean hasCountdown();

        boolean hasCta();

        boolean hasMuteAsset();

        boolean hasProgress();

        boolean hasVideoAsset();
    }

    public static final class AssetModel extends GeneratedMessageV3 implements AssetModelOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 1;
        public static final int FILL_FIELD_NUMBER = 2;
        public static final int FONT_STYLE_FIELD_NUMBER = 3;
        public static final int HEIGHT_FIELD_NUMBER = 4;
        public static final int HIDEAFTER_FIELD_NUMBER = 5;
        public static final int MARGIN_FIELD_NUMBER = 6;
        public static final int OPACITY_FIELD_NUMBER = 7;
        public static final int OUTLINED_FIELD_NUMBER = 8;
        public static final int PADDING_FIELD_NUMBER = 9;
        public static final int SHADOW_FIELD_NUMBER = 10;
        public static final int STROKE_FIELD_NUMBER = 11;
        public static final int STROKE_WIDTH_FIELD_NUMBER = 18;
        public static final int STYLE_FIELD_NUMBER = 13;
        public static final int VISIBLE_FIELD_NUMBER = 14;
        public static final int WIDTH_FIELD_NUMBER = 15;
        public static final int X_FIELD_NUMBER = 16;
        public static final int Y_FIELD_NUMBER = 17;
        private static final long serialVersionUID = 0;
        private volatile Object content_;
        private volatile Object fill_;
        private int fontStyle_;
        private int height_;
        private int hideafter_;
        private float margin_;
        private byte memoizedIsInitialized;
        private float opacity_;
        private boolean outlined_;
        private float padding_;
        private volatile Object shadow_;
        private float strokeWidth_;
        private volatile Object stroke_;
        private volatile Object style_;
        private boolean visible_;
        private int width_;
        private volatile Object x_;
        private volatile Object y_;
        private static final AssetModel DEFAULT_INSTANCE = new AssetModel();
        private static final Parser<AssetModel> PARSER = new AbstractParser<AssetModel>() { // from class: io.bidmachine.protobuf.CreativeExtension.AssetModel.1
            @Override // com.explorestack.protobuf.Parser
            public AssetModel parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new AssetModel(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AssetModelOrBuilder {
            private Object content_;
            private Object fill_;
            private int fontStyle_;
            private int height_;
            private int hideafter_;
            private float margin_;
            private float opacity_;
            private boolean outlined_;
            private float padding_;
            private Object shadow_;
            private float strokeWidth_;
            private Object stroke_;
            private Object style_;
            private boolean visible_;
            private int width_;
            private Object x_;
            private Object y_;

            public Builder clearFontStyle() {
                this.fontStyle_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHeight() {
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHideafter() {
                this.hideafter_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMargin() {
                this.margin_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearOpacity() {
                this.opacity_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearOutlined() {
                this.outlined_ = false;
                onChanged();
                return this;
            }

            public Builder clearPadding() {
                this.padding_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearStrokeWidth() {
                this.strokeWidth_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearVisible() {
                this.visible_ = false;
                onChanged();
                return this;
            }

            public Builder clearWidth() {
                this.width_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetModel_descriptor;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.content_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetModel_descriptor;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getFill() {
                Object obj = this.fill_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fill_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getFillBytes() {
                Object obj = this.fill_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fill_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public int getFontStyle() {
                return this.fontStyle_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public int getHideafter() {
                return this.hideafter_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public float getMargin() {
                return this.margin_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public float getOpacity() {
                return this.opacity_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public boolean getOutlined() {
                return this.outlined_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public float getPadding() {
                return this.padding_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getShadow() {
                Object obj = this.shadow_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.shadow_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getShadowBytes() {
                Object obj = this.shadow_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.shadow_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getStroke() {
                Object obj = this.stroke_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.stroke_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getStrokeBytes() {
                Object obj = this.stroke_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.stroke_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public float getStrokeWidth() {
                return this.strokeWidth_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getStyle() {
                Object obj = this.style_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.style_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getStyleBytes() {
                Object obj = this.style_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.style_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public boolean getVisible() {
                return this.visible_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getX() {
                Object obj = this.x_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.x_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getXBytes() {
                Object obj = this.x_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.x_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public String getY() {
                Object obj = this.y_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.y_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
            public ByteString getYBytes() {
                Object obj = this.y_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.y_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetModel_fieldAccessorTable.ensureFieldAccessorsInitialized(AssetModel.class, Builder.class);
            }

            public Builder setFontStyle(int i10) {
                this.fontStyle_ = i10;
                onChanged();
                return this;
            }

            public Builder setHeight(int i10) {
                this.height_ = i10;
                onChanged();
                return this;
            }

            public Builder setHideafter(int i10) {
                this.hideafter_ = i10;
                onChanged();
                return this;
            }

            public Builder setMargin(float f10) {
                this.margin_ = f10;
                onChanged();
                return this;
            }

            public Builder setOpacity(float f10) {
                this.opacity_ = f10;
                onChanged();
                return this;
            }

            public Builder setOutlined(boolean z10) {
                this.outlined_ = z10;
                onChanged();
                return this;
            }

            public Builder setPadding(float f10) {
                this.padding_ = f10;
                onChanged();
                return this;
            }

            public Builder setStrokeWidth(float f10) {
                this.strokeWidth_ = f10;
                onChanged();
                return this;
            }

            public Builder setVisible(boolean z10) {
                this.visible_ = z10;
                onChanged();
                return this;
            }

            public Builder setWidth(int i10) {
                this.width_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                this.content_ = "";
                this.fill_ = "";
                this.shadow_ = "";
                this.stroke_ = "";
                this.style_ = "";
                this.x_ = "";
                this.y_ = "";
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
            public AssetModel build() {
                AssetModel assetModelBuildPartial = buildPartial();
                if (assetModelBuildPartial.isInitialized()) {
                    return assetModelBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) assetModelBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public AssetModel buildPartial() {
                AssetModel assetModel = new AssetModel(this);
                assetModel.content_ = this.content_;
                assetModel.fill_ = this.fill_;
                assetModel.fontStyle_ = this.fontStyle_;
                assetModel.height_ = this.height_;
                assetModel.hideafter_ = this.hideafter_;
                assetModel.margin_ = this.margin_;
                assetModel.opacity_ = this.opacity_;
                assetModel.outlined_ = this.outlined_;
                assetModel.padding_ = this.padding_;
                assetModel.shadow_ = this.shadow_;
                assetModel.stroke_ = this.stroke_;
                assetModel.strokeWidth_ = this.strokeWidth_;
                assetModel.style_ = this.style_;
                assetModel.visible_ = this.visible_;
                assetModel.width_ = this.width_;
                assetModel.x_ = this.x_;
                assetModel.y_ = this.y_;
                onBuilt();
                return assetModel;
            }

            public Builder clearContent() {
                this.content_ = AssetModel.getDefaultInstance().getContent();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFill() {
                this.fill_ = AssetModel.getDefaultInstance().getFill();
                onChanged();
                return this;
            }

            public Builder clearShadow() {
                this.shadow_ = AssetModel.getDefaultInstance().getShadow();
                onChanged();
                return this;
            }

            public Builder clearStroke() {
                this.stroke_ = AssetModel.getDefaultInstance().getStroke();
                onChanged();
                return this;
            }

            public Builder clearStyle() {
                this.style_ = AssetModel.getDefaultInstance().getStyle();
                onChanged();
                return this;
            }

            public Builder clearX() {
                this.x_ = AssetModel.getDefaultInstance().getX();
                onChanged();
                return this;
            }

            public Builder clearY() {
                this.y_ = AssetModel.getDefaultInstance().getY();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public AssetModel getDefaultInstanceForType() {
                return AssetModel.getDefaultInstance();
            }

            public Builder setContent(String str) {
                str.getClass();
                this.content_ = str;
                onChanged();
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.content_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFill(String str) {
                str.getClass();
                this.fill_ = str;
                onChanged();
                return this;
            }

            public Builder setFillBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.fill_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public Builder setShadow(String str) {
                str.getClass();
                this.shadow_ = str;
                onChanged();
                return this;
            }

            public Builder setShadowBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.shadow_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStroke(String str) {
                str.getClass();
                this.stroke_ = str;
                onChanged();
                return this;
            }

            public Builder setStrokeBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.stroke_ = byteString;
                onChanged();
                return this;
            }

            public Builder setStyle(String str) {
                str.getClass();
                this.style_ = str;
                onChanged();
                return this;
            }

            public Builder setStyleBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.style_ = byteString;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setX(String str) {
                str.getClass();
                this.x_ = str;
                onChanged();
                return this;
            }

            public Builder setXBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.x_ = byteString;
                onChanged();
                return this;
            }

            public Builder setY(String str) {
                str.getClass();
                this.y_ = str;
                onChanged();
                return this;
            }

            public Builder setYBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.y_ = byteString;
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
                this.content_ = "";
                this.fill_ = "";
                this.fontStyle_ = 0;
                this.height_ = 0;
                this.hideafter_ = 0;
                this.margin_ = 0.0f;
                this.opacity_ = 0.0f;
                this.outlined_ = false;
                this.padding_ = 0.0f;
                this.shadow_ = "";
                this.stroke_ = "";
                this.strokeWidth_ = 0.0f;
                this.style_ = "";
                this.visible_ = false;
                this.width_ = 0;
                this.x_ = "";
                this.y_ = "";
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo208clone() {
                return (Builder) super.mo208clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AssetModel) {
                    return mergeFrom((AssetModel) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AssetModel assetModel) {
                if (assetModel == AssetModel.getDefaultInstance()) {
                    return this;
                }
                if (!assetModel.getContent().isEmpty()) {
                    this.content_ = assetModel.content_;
                    onChanged();
                }
                if (!assetModel.getFill().isEmpty()) {
                    this.fill_ = assetModel.fill_;
                    onChanged();
                }
                if (assetModel.getFontStyle() != 0) {
                    setFontStyle(assetModel.getFontStyle());
                }
                if (assetModel.getHeight() != 0) {
                    setHeight(assetModel.getHeight());
                }
                if (assetModel.getHideafter() != 0) {
                    setHideafter(assetModel.getHideafter());
                }
                if (assetModel.getMargin() != 0.0f) {
                    setMargin(assetModel.getMargin());
                }
                if (assetModel.getOpacity() != 0.0f) {
                    setOpacity(assetModel.getOpacity());
                }
                if (assetModel.getOutlined()) {
                    setOutlined(assetModel.getOutlined());
                }
                if (assetModel.getPadding() != 0.0f) {
                    setPadding(assetModel.getPadding());
                }
                if (!assetModel.getShadow().isEmpty()) {
                    this.shadow_ = assetModel.shadow_;
                    onChanged();
                }
                if (!assetModel.getStroke().isEmpty()) {
                    this.stroke_ = assetModel.stroke_;
                    onChanged();
                }
                if (assetModel.getStrokeWidth() != 0.0f) {
                    setStrokeWidth(assetModel.getStrokeWidth());
                }
                if (!assetModel.getStyle().isEmpty()) {
                    this.style_ = assetModel.style_;
                    onChanged();
                }
                if (assetModel.getVisible()) {
                    setVisible(assetModel.getVisible());
                }
                if (assetModel.getWidth() != 0) {
                    setWidth(assetModel.getWidth());
                }
                if (!assetModel.getX().isEmpty()) {
                    this.x_ = assetModel.x_;
                    onChanged();
                }
                if (!assetModel.getY().isEmpty()) {
                    this.y_ = assetModel.y_;
                    onChanged();
                }
                mergeUnknownFields(assetModel.unknownFields);
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.content_ = "";
                this.fill_ = "";
                this.shadow_ = "";
                this.stroke_ = "";
                this.style_ = "";
                this.x_ = "";
                this.y_ = "";
                maybeForceBuilderInitialization();
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                AssetModel assetModel = null;
                try {
                    try {
                        AssetModel assetModel2 = (AssetModel) AssetModel.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (assetModel2 != null) {
                            mergeFrom(assetModel2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        AssetModel assetModel3 = (AssetModel) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            assetModel = assetModel3;
                            if (assetModel != null) {
                                mergeFrom(assetModel);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (assetModel != null) {
                        mergeFrom(assetModel);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AssetModel parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AssetModel) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AssetModel parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AssetModel)) {
                return super.equals(obj);
            }
            AssetModel assetModel = (AssetModel) obj;
            return getContent().equals(assetModel.getContent()) && getFill().equals(assetModel.getFill()) && getFontStyle() == assetModel.getFontStyle() && getHeight() == assetModel.getHeight() && getHideafter() == assetModel.getHideafter() && Float.floatToIntBits(getMargin()) == Float.floatToIntBits(assetModel.getMargin()) && Float.floatToIntBits(getOpacity()) == Float.floatToIntBits(assetModel.getOpacity()) && getOutlined() == assetModel.getOutlined() && Float.floatToIntBits(getPadding()) == Float.floatToIntBits(assetModel.getPadding()) && getShadow().equals(assetModel.getShadow()) && getStroke().equals(assetModel.getStroke()) && Float.floatToIntBits(getStrokeWidth()) == Float.floatToIntBits(assetModel.getStrokeWidth()) && getStyle().equals(assetModel.getStyle()) && getVisible() == assetModel.getVisible() && getWidth() == assetModel.getWidth() && getX().equals(assetModel.getX()) && getY().equals(assetModel.getY()) && this.unknownFields.equals(assetModel.unknownFields);
        }

        public static AssetModel getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetModel_descriptor;
        }

        public static Builder newBuilder(AssetModel assetModel) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(assetModel);
        }

        public static AssetModel parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<AssetModel> parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getContent() {
            Object obj = this.content_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.content_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.content_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getFill() {
            Object obj = this.fill_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fill_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getFillBytes() {
            Object obj = this.fill_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fill_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public int getFontStyle() {
            return this.fontStyle_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public int getHideafter() {
            return this.hideafter_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public float getMargin() {
            return this.margin_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public float getOpacity() {
            return this.opacity_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public boolean getOutlined() {
            return this.outlined_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public float getPadding() {
            return this.padding_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<AssetModel> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = getContentBytes().isEmpty() ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.content_);
            if (!getFillBytes().isEmpty()) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.fill_);
            }
            int i11 = this.fontStyle_;
            if (i11 != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(3, i11);
            }
            int i12 = this.height_;
            if (i12 != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(4, i12);
            }
            int i13 = this.hideafter_;
            if (i13 != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(5, i13);
            }
            float f10 = this.margin_;
            if (f10 != 0.0f) {
                iComputeStringSize += CodedOutputStream.computeFloatSize(6, f10);
            }
            float f11 = this.opacity_;
            if (f11 != 0.0f) {
                iComputeStringSize += CodedOutputStream.computeFloatSize(7, f11);
            }
            boolean z10 = this.outlined_;
            if (z10) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(8, z10);
            }
            float f12 = this.padding_;
            if (f12 != 0.0f) {
                iComputeStringSize += CodedOutputStream.computeFloatSize(9, f12);
            }
            if (!getShadowBytes().isEmpty()) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(10, this.shadow_);
            }
            if (!getStrokeBytes().isEmpty()) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(11, this.stroke_);
            }
            if (!getStyleBytes().isEmpty()) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(13, this.style_);
            }
            boolean z11 = this.visible_;
            if (z11) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(14, z11);
            }
            int i14 = this.width_;
            if (i14 != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(15, i14);
            }
            if (!getXBytes().isEmpty()) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(16, this.x_);
            }
            if (!getYBytes().isEmpty()) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(17, this.y_);
            }
            float f13 = this.strokeWidth_;
            if (f13 != 0.0f) {
                iComputeStringSize += CodedOutputStream.computeFloatSize(18, f13);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getShadow() {
            Object obj = this.shadow_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.shadow_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getShadowBytes() {
            Object obj = this.shadow_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.shadow_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getStroke() {
            Object obj = this.stroke_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.stroke_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getStrokeBytes() {
            Object obj = this.stroke_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.stroke_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public float getStrokeWidth() {
            return this.strokeWidth_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getStyle() {
            Object obj = this.style_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.style_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getStyleBytes() {
            Object obj = this.style_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.style_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public boolean getVisible() {
            return this.visible_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getX() {
            Object obj = this.x_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.x_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getXBytes() {
            Object obj = this.x_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.x_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public String getY() {
            Object obj = this.y_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.y_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.AssetModelOrBuilder
        public ByteString getYBytes() {
            Object obj = this.y_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.y_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContent().hashCode()) * 37) + 2) * 53) + getFill().hashCode()) * 37) + 3) * 53) + getFontStyle()) * 37) + 4) * 53) + getHeight()) * 37) + 5) * 53) + getHideafter()) * 37) + 6) * 53) + Float.floatToIntBits(getMargin())) * 37) + 7) * 53) + Float.floatToIntBits(getOpacity())) * 37) + 8) * 53) + Internal.hashBoolean(getOutlined())) * 37) + 9) * 53) + Float.floatToIntBits(getPadding())) * 37) + 10) * 53) + getShadow().hashCode()) * 37) + 11) * 53) + getStroke().hashCode()) * 37) + 18) * 53) + Float.floatToIntBits(getStrokeWidth())) * 37) + 13) * 53) + getStyle().hashCode()) * 37) + 14) * 53) + Internal.hashBoolean(getVisible())) * 37) + 15) * 53) + getWidth()) * 37) + 16) * 53) + getX().hashCode()) * 37) + 17) * 53) + getY().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_AssetModel_fieldAccessorTable.ensureFieldAccessorsInitialized(AssetModel.class, Builder.class);
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
            return new AssetModel();
        }

        private AssetModel(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AssetModel parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetModel) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AssetModel parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public AssetModel getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getContentBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.content_);
            }
            if (!getFillBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.fill_);
            }
            int i10 = this.fontStyle_;
            if (i10 != 0) {
                codedOutputStream.writeUInt32(3, i10);
            }
            int i11 = this.height_;
            if (i11 != 0) {
                codedOutputStream.writeUInt32(4, i11);
            }
            int i12 = this.hideafter_;
            if (i12 != 0) {
                codedOutputStream.writeUInt32(5, i12);
            }
            float f10 = this.margin_;
            if (f10 != 0.0f) {
                codedOutputStream.writeFloat(6, f10);
            }
            float f11 = this.opacity_;
            if (f11 != 0.0f) {
                codedOutputStream.writeFloat(7, f11);
            }
            boolean z10 = this.outlined_;
            if (z10) {
                codedOutputStream.writeBool(8, z10);
            }
            float f12 = this.padding_;
            if (f12 != 0.0f) {
                codedOutputStream.writeFloat(9, f12);
            }
            if (!getShadowBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.shadow_);
            }
            if (!getStrokeBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.stroke_);
            }
            if (!getStyleBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 13, this.style_);
            }
            boolean z11 = this.visible_;
            if (z11) {
                codedOutputStream.writeBool(14, z11);
            }
            int i13 = this.width_;
            if (i13 != 0) {
                codedOutputStream.writeUInt32(15, i13);
            }
            if (!getXBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 16, this.x_);
            }
            if (!getYBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 17, this.y_);
            }
            float f13 = this.strokeWidth_;
            if (f13 != 0.0f) {
                codedOutputStream.writeFloat(18, f13);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static AssetModel parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private AssetModel() {
            this.memoizedIsInitialized = (byte) -1;
            this.content_ = "";
            this.fill_ = "";
            this.shadow_ = "";
            this.stroke_ = "";
            this.style_ = "";
            this.x_ = "";
            this.y_ = "";
        }

        public static AssetModel parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static AssetModel parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AssetModel parseFrom(InputStream inputStream) throws IOException {
            return (AssetModel) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AssetModel parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetModel) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AssetModel parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AssetModel) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AssetModel parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AssetModel) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private AssetModel(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            case 10:
                                this.content_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 18:
                                this.fill_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 24:
                                this.fontStyle_ = codedInputStream.readUInt32();
                                continue;
                            case 32:
                                this.height_ = codedInputStream.readUInt32();
                                continue;
                            case 40:
                                this.hideafter_ = codedInputStream.readUInt32();
                                continue;
                            case 53:
                                this.margin_ = codedInputStream.readFloat();
                                continue;
                            case 61:
                                this.opacity_ = codedInputStream.readFloat();
                                continue;
                            case 64:
                                this.outlined_ = codedInputStream.readBool();
                                continue;
                            case 77:
                                this.padding_ = codedInputStream.readFloat();
                                continue;
                            case 82:
                                this.shadow_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 90:
                                this.stroke_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 106:
                                this.style_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 112:
                                this.visible_ = codedInputStream.readBool();
                                continue;
                            case 120:
                                this.width_ = codedInputStream.readUInt32();
                                continue;
                            case 130:
                                this.x_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 138:
                                this.y_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 149:
                                this.strokeWidth_ = codedInputStream.readFloat();
                                continue;
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
    }

    public interface AssetModelOrBuilder extends MessageOrBuilder {
        String getContent();

        ByteString getContentBytes();

        String getFill();

        ByteString getFillBytes();

        int getFontStyle();

        int getHeight();

        int getHideafter();

        float getMargin();

        float getOpacity();

        boolean getOutlined();

        float getPadding();

        String getShadow();

        ByteString getShadowBytes();

        String getStroke();

        ByteString getStrokeBytes();

        float getStrokeWidth();

        String getStyle();

        ByteString getStyleBytes();

        boolean getVisible();

        int getWidth();

        String getX();

        ByteString getXBytes();

        String getY();

        ByteString getYBytes();
    }

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CreativeExtensionOrBuilder {
        private SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> assetBuilder_;
        private AssetAppearance asset_;
        private int bitField0_;
        private RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> featuresBuilder_;
        private List<Feature> features_;
        private RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> postbannersBuilder_;
        private List<Postbanner> postbanners_;

        public Builder addFeatures(Feature feature) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                feature.getClass();
                ensureFeaturesIsMutable();
                this.features_.add(feature);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(feature);
            }
            return this;
        }

        public Feature.Builder addFeaturesBuilder() {
            return (Feature.Builder) getFeaturesFieldBuilder().addBuilder(Feature.getDefaultInstance());
        }

        public Builder addPostbanners(Postbanner postbanner) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                postbanner.getClass();
                ensurePostbannersIsMutable();
                this.postbanners_.add(postbanner);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(postbanner);
            }
            return this;
        }

        public Postbanner.Builder addPostbannersBuilder() {
            return (Postbanner.Builder) getPostbannersFieldBuilder().addBuilder(Postbanner.getDefaultInstance());
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setAsset(AssetAppearance assetAppearance) {
            SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
            if (singleFieldBuilderV3 == null) {
                assetAppearance.getClass();
                this.asset_ = assetAppearance;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(assetAppearance);
            }
            return this;
        }

        public Builder setFeatures(int i10, Feature feature) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                feature.getClass();
                ensureFeaturesIsMutable();
                this.features_.set(i10, feature);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i10, feature);
            }
            return this;
        }

        public Builder setPostbanners(int i10, Postbanner postbanner) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                postbanner.getClass();
                ensurePostbannersIsMutable();
                this.postbanners_.set(i10, postbanner);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i10, postbanner);
            }
            return this;
        }

        private void ensureFeaturesIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.features_ = new ArrayList(this.features_);
                this.bitField0_ |= 1;
            }
        }

        private void ensurePostbannersIsMutable() {
            if ((this.bitField0_ & 2) == 0) {
                this.postbanners_ = new ArrayList(this.postbanners_);
                this.bitField0_ |= 2;
            }
        }

        private SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> getAssetFieldBuilder() {
            if (this.assetBuilder_ == null) {
                this.assetBuilder_ = new SingleFieldBuilderV3<>(getAsset(), getParentForChildren(), isClean());
                this.asset_ = null;
            }
            return this.assetBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_descriptor;
        }

        private RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> getFeaturesFieldBuilder() {
            if (this.featuresBuilder_ == null) {
                this.featuresBuilder_ = new RepeatedFieldBuilderV3<>(this.features_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.features_ = null;
            }
            return this.featuresBuilder_;
        }

        private RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> getPostbannersFieldBuilder() {
            if (this.postbannersBuilder_ == null) {
                this.postbannersBuilder_ = new RepeatedFieldBuilderV3<>(this.postbanners_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                this.postbanners_ = null;
            }
            return this.postbannersBuilder_;
        }

        public Builder addAllFeatures(Iterable<? extends Feature> iterable) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureFeaturesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.features_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder addAllPostbanners(Iterable<? extends Postbanner> iterable) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePostbannersIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.postbanners_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearAsset() {
            if (this.assetBuilder_ == null) {
                this.asset_ = null;
                onChanged();
            } else {
                this.asset_ = null;
                this.assetBuilder_ = null;
            }
            return this;
        }

        public Builder clearFeatures() {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.features_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder clearPostbanners() {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.postbanners_ = Collections.emptyList();
                this.bitField0_ &= -3;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public AssetAppearance getAsset() {
            SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (AssetAppearance) singleFieldBuilderV3.getMessage();
            }
            AssetAppearance assetAppearance = this.asset_;
            return assetAppearance == null ? AssetAppearance.getDefaultInstance() : assetAppearance;
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public AssetAppearanceOrBuilder getAssetOrBuilder() {
            SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (AssetAppearanceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            AssetAppearance assetAppearance = this.asset_;
            return assetAppearance == null ? AssetAppearance.getDefaultInstance() : assetAppearance;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_descriptor;
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public Feature getFeatures(int i10) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            return repeatedFieldBuilderV3 == null ? this.features_.get(i10) : (Feature) repeatedFieldBuilderV3.getMessage(i10);
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public int getFeaturesCount() {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            return repeatedFieldBuilderV3 == null ? this.features_.size() : repeatedFieldBuilderV3.getCount();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public List<Feature> getFeaturesList() {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.features_) : repeatedFieldBuilderV3.getMessageList();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public FeatureOrBuilder getFeaturesOrBuilder(int i10) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            return repeatedFieldBuilderV3 == null ? this.features_.get(i10) : (FeatureOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public List<? extends FeatureOrBuilder> getFeaturesOrBuilderList() {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.features_);
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public Postbanner getPostbanners(int i10) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            return repeatedFieldBuilderV3 == null ? this.postbanners_.get(i10) : (Postbanner) repeatedFieldBuilderV3.getMessage(i10);
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public int getPostbannersCount() {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            return repeatedFieldBuilderV3 == null ? this.postbanners_.size() : repeatedFieldBuilderV3.getCount();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public List<Postbanner> getPostbannersList() {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.postbanners_) : repeatedFieldBuilderV3.getMessageList();
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public PostbannerOrBuilder getPostbannersOrBuilder(int i10) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            return repeatedFieldBuilderV3 == null ? this.postbanners_.get(i10) : (PostbannerOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public List<? extends PostbannerOrBuilder> getPostbannersOrBuilderList() {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.postbanners_);
        }

        @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
        public boolean hasAsset() {
            return (this.assetBuilder_ == null && this.asset_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(CreativeExtension.class, Builder.class);
        }

        public Builder mergeAsset(AssetAppearance assetAppearance) {
            SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
            if (singleFieldBuilderV3 == null) {
                AssetAppearance assetAppearance2 = this.asset_;
                if (assetAppearance2 != null) {
                    this.asset_ = AssetAppearance.newBuilder(assetAppearance2).mergeFrom(assetAppearance).buildPartial();
                } else {
                    this.asset_ = assetAppearance;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(assetAppearance);
            }
            return this;
        }

        public Builder removeFeatures(int i10) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureFeaturesIsMutable();
                this.features_.remove(i10);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i10);
            }
            return this;
        }

        public Builder removePostbanners(int i10) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePostbannersIsMutable();
                this.postbanners_.remove(i10);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i10);
            }
            return this;
        }

        private Builder() {
            this.features_ = Collections.emptyList();
            this.postbanners_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getFeaturesFieldBuilder();
                getPostbannersFieldBuilder();
            }
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public CreativeExtension build() {
            CreativeExtension creativeExtensionBuildPartial = buildPartial();
            if (creativeExtensionBuildPartial.isInitialized()) {
                return creativeExtensionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) creativeExtensionBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public CreativeExtension buildPartial() {
            CreativeExtension creativeExtension = new CreativeExtension(this);
            SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
            if (singleFieldBuilderV3 == null) {
                creativeExtension.asset_ = this.asset_;
            } else {
                creativeExtension.asset_ = (AssetAppearance) singleFieldBuilderV3.build();
            }
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                creativeExtension.features_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.features_ = Collections.unmodifiableList(this.features_);
                    this.bitField0_ &= -2;
                }
                creativeExtension.features_ = this.features_;
            }
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV4 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV4 != null) {
                creativeExtension.postbanners_ = repeatedFieldBuilderV4.build();
            } else {
                if ((this.bitField0_ & 2) != 0) {
                    this.postbanners_ = Collections.unmodifiableList(this.postbanners_);
                    this.bitField0_ &= -3;
                }
                creativeExtension.postbanners_ = this.postbanners_;
            }
            onBuilt();
            return creativeExtension;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public AssetAppearance.Builder getAssetBuilder() {
            onChanged();
            return (AssetAppearance.Builder) getAssetFieldBuilder().getBuilder();
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public CreativeExtension getDefaultInstanceForType() {
            return CreativeExtension.getDefaultInstance();
        }

        public Feature.Builder getFeaturesBuilder(int i10) {
            return (Feature.Builder) getFeaturesFieldBuilder().getBuilder(i10);
        }

        public List<Feature.Builder> getFeaturesBuilderList() {
            return getFeaturesFieldBuilder().getBuilderList();
        }

        public Postbanner.Builder getPostbannersBuilder(int i10) {
            return (Postbanner.Builder) getPostbannersFieldBuilder().getBuilder(i10);
        }

        public List<Postbanner.Builder> getPostbannersBuilderList() {
            return getPostbannersFieldBuilder().getBuilderList();
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

        public Feature.Builder addFeaturesBuilder(int i10) {
            return (Feature.Builder) getFeaturesFieldBuilder().addBuilder(i10, Feature.getDefaultInstance());
        }

        public Postbanner.Builder addPostbannersBuilder(int i10) {
            return (Postbanner.Builder) getPostbannersFieldBuilder().addBuilder(i10, Postbanner.getDefaultInstance());
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
            if (this.assetBuilder_ == null) {
                this.asset_ = null;
            } else {
                this.asset_ = null;
                this.assetBuilder_ = null;
            }
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.features_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV4 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV4 == null) {
                this.postbanners_ = Collections.emptyList();
                this.bitField0_ &= -3;
            } else {
                repeatedFieldBuilderV4.clear();
            }
            return this;
        }

        public Builder setAsset(AssetAppearance.Builder builder) {
            SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.asset_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.features_ = Collections.emptyList();
            this.postbanners_ = Collections.emptyList();
            maybeForceBuilderInitialization();
        }

        public Builder addFeatures(int i10, Feature feature) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                feature.getClass();
                ensureFeaturesIsMutable();
                this.features_.add(i10, feature);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i10, feature);
            }
            return this;
        }

        public Builder addPostbanners(int i10, Postbanner postbanner) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                postbanner.getClass();
                ensurePostbannersIsMutable();
                this.postbanners_.add(i10, postbanner);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i10, postbanner);
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
            if (message instanceof CreativeExtension) {
                return mergeFrom((CreativeExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setFeatures(int i10, Feature.Builder builder) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureFeaturesIsMutable();
                this.features_.set(i10, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i10, builder.build());
            }
            return this;
        }

        public Builder setPostbanners(int i10, Postbanner.Builder builder) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePostbannersIsMutable();
                this.postbanners_.set(i10, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i10, builder.build());
            }
            return this;
        }

        public Builder mergeFrom(CreativeExtension creativeExtension) {
            if (creativeExtension == CreativeExtension.getDefaultInstance()) {
                return this;
            }
            if (creativeExtension.hasAsset()) {
                mergeAsset(creativeExtension.getAsset());
            }
            if (this.featuresBuilder_ == null) {
                if (!creativeExtension.features_.isEmpty()) {
                    if (this.features_.isEmpty()) {
                        this.features_ = creativeExtension.features_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureFeaturesIsMutable();
                        this.features_.addAll(creativeExtension.features_);
                    }
                    onChanged();
                }
            } else if (!creativeExtension.features_.isEmpty()) {
                if (!this.featuresBuilder_.isEmpty()) {
                    this.featuresBuilder_.addAllMessages(creativeExtension.features_);
                } else {
                    this.featuresBuilder_.dispose();
                    this.featuresBuilder_ = null;
                    this.features_ = creativeExtension.features_;
                    this.bitField0_ &= -2;
                    this.featuresBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getFeaturesFieldBuilder() : null;
                }
            }
            if (this.postbannersBuilder_ == null) {
                if (!creativeExtension.postbanners_.isEmpty()) {
                    if (this.postbanners_.isEmpty()) {
                        this.postbanners_ = creativeExtension.postbanners_;
                        this.bitField0_ &= -3;
                    } else {
                        ensurePostbannersIsMutable();
                        this.postbanners_.addAll(creativeExtension.postbanners_);
                    }
                    onChanged();
                }
            } else if (!creativeExtension.postbanners_.isEmpty()) {
                if (!this.postbannersBuilder_.isEmpty()) {
                    this.postbannersBuilder_.addAllMessages(creativeExtension.postbanners_);
                } else {
                    this.postbannersBuilder_.dispose();
                    this.postbannersBuilder_ = null;
                    this.postbanners_ = creativeExtension.postbanners_;
                    this.bitField0_ &= -3;
                    this.postbannersBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getPostbannersFieldBuilder() : null;
                }
            }
            mergeUnknownFields(creativeExtension.unknownFields);
            onChanged();
            return this;
        }

        public Builder addFeatures(Feature.Builder builder) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureFeaturesIsMutable();
                this.features_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addPostbanners(Postbanner.Builder builder) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePostbannersIsMutable();
                this.postbanners_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addFeatures(int i10, Feature.Builder builder) {
            RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureFeaturesIsMutable();
                this.features_.add(i10, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i10, builder.build());
            }
            return this;
        }

        public Builder addPostbanners(int i10, Postbanner.Builder builder) {
            RepeatedFieldBuilderV3<Postbanner, Postbanner.Builder, PostbannerOrBuilder> repeatedFieldBuilderV3 = this.postbannersBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensurePostbannersIsMutable();
                this.postbanners_.add(i10, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i10, builder.build());
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            CreativeExtension creativeExtension = null;
            try {
                try {
                    CreativeExtension creativeExtension2 = (CreativeExtension) CreativeExtension.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (creativeExtension2 != null) {
                        mergeFrom(creativeExtension2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    CreativeExtension creativeExtension3 = (CreativeExtension) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th2) {
                        th = th2;
                        creativeExtension = creativeExtension3;
                        if (creativeExtension != null) {
                            mergeFrom(creativeExtension);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (creativeExtension != null) {
                    mergeFrom(creativeExtension);
                }
                throw th;
            }
        }
    }

    public static final class Feature extends GeneratedMessageV3 implements FeatureOrBuilder {
        public static final int NAME_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private volatile Object value_;
        private static final Feature DEFAULT_INSTANCE = new Feature();
        private static final Parser<Feature> PARSER = new AbstractParser<Feature>() { // from class: io.bidmachine.protobuf.CreativeExtension.Feature.1
            @Override // com.explorestack.protobuf.Parser
            public Feature parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Feature(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FeatureOrBuilder {
            private Object name_;
            private Object value_;

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Feature_descriptor;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Feature_descriptor;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.name_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.value_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Feature_fieldAccessorTable.ensureFieldAccessorsInitialized(Feature.class, Builder.class);
            }

            private Builder() {
                this.name_ = "";
                this.value_ = "";
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
            public Feature build() {
                Feature featureBuildPartial = buildPartial();
                if (featureBuildPartial.isInitialized()) {
                    return featureBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) featureBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Feature buildPartial() {
                Feature feature = new Feature(this);
                feature.name_ = this.name_;
                feature.value_ = this.value_;
                onBuilt();
                return feature;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearName() {
                this.name_ = Feature.getDefaultInstance().getName();
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.value_ = Feature.getDefaultInstance().getValue();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Feature getDefaultInstanceForType() {
                return Feature.getDefaultInstance();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString;
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

            public Builder setValue(String str) {
                str.getClass();
                this.value_ = str;
                onChanged();
                return this;
            }

            public Builder setValueBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.value_ = byteString;
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
                this.name_ = "";
                this.value_ = "";
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                this.value_ = "";
                maybeForceBuilderInitialization();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo208clone() {
                return (Builder) super.mo208clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Feature) {
                    return mergeFrom((Feature) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Feature feature) {
                if (feature == Feature.getDefaultInstance()) {
                    return this;
                }
                if (!feature.getName().isEmpty()) {
                    this.name_ = feature.name_;
                    onChanged();
                }
                if (!feature.getValue().isEmpty()) {
                    this.value_ = feature.value_;
                    onChanged();
                }
                mergeUnknownFields(feature.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Feature feature = null;
                try {
                    try {
                        Feature feature2 = (Feature) Feature.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (feature2 != null) {
                            mergeFrom(feature2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Feature feature3 = (Feature) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            feature = feature3;
                            if (feature != null) {
                                mergeFrom(feature);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (feature != null) {
                        mergeFrom(feature);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Feature parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Feature) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Feature parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Feature)) {
                return super.equals(obj);
            }
            Feature feature = (Feature) obj;
            return getName().equals(feature.getName()) && getValue().equals(feature.getValue()) && this.unknownFields.equals(feature.unknownFields);
        }

        public static Feature getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Feature_descriptor;
        }

        public static Builder newBuilder(Feature feature) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(feature);
        }

        public static Feature parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<Feature> parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.name_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<Feature> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = getNameBytes().isEmpty() ? 0 : 0 + GeneratedMessageV3.computeStringSize(1, this.name_);
            if (!getValueBytes().isEmpty()) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.value_);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
        public String getValue() {
            Object obj = this.value_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.value_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.FeatureOrBuilder
        public ByteString getValueBytes() {
            Object obj = this.value_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.value_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getValue().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Feature_fieldAccessorTable.ensureFieldAccessorsInitialized(Feature.class, Builder.class);
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
            return new Feature();
        }

        private Feature(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Feature parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Feature) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Feature parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Feature getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (!getNameBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
            }
            if (!getValueBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.value_);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static Feature parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Feature() {
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            this.value_ = "";
        }

        public static Feature parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Feature parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Feature parseFrom(InputStream inputStream) throws IOException {
            return (Feature) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private Feature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                    this.name_ = codedInputStream.readStringRequireUtf8();
                                } else if (tag != 18) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.value_ = codedInputStream.readStringRequireUtf8();
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

        public static Feature parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Feature) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Feature parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Feature) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Feature parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Feature) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface FeatureOrBuilder extends MessageOrBuilder {
        String getName();

        ByteString getNameBytes();

        String getValue();

        ByteString getValueBytes();
    }

    public static final class Postbanner extends GeneratedMessageV3 implements PostbannerOrBuilder {
        public static final int ASSET_FIELD_NUMBER = 3;
        public static final int FEATURES_FIELD_NUMBER = 4;
        public static final int SEQUENCE_FIELD_NUMBER = 2;
        public static final int TPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private AssetAppearance asset_;
        private List<Feature> features_;
        private byte memoizedIsInitialized;
        private int sequence_;
        private int tpe_;
        private static final Postbanner DEFAULT_INSTANCE = new Postbanner();
        private static final Parser<Postbanner> PARSER = new AbstractParser<Postbanner>() { // from class: io.bidmachine.protobuf.CreativeExtension.Postbanner.1
            @Override // com.explorestack.protobuf.Parser
            public Postbanner parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Postbanner(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PostbannerOrBuilder {
            private SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> assetBuilder_;
            private AssetAppearance asset_;
            private int bitField0_;
            private RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> featuresBuilder_;
            private List<Feature> features_;
            private int sequence_;
            private int tpe_;

            public Builder addFeatures(Feature feature) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    feature.getClass();
                    ensureFeaturesIsMutable();
                    this.features_.add(feature);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(feature);
                }
                return this;
            }

            public Feature.Builder addFeaturesBuilder() {
                return (Feature.Builder) getFeaturesFieldBuilder().addBuilder(Feature.getDefaultInstance());
            }

            public Builder clearSequence() {
                this.sequence_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTpe() {
                this.tpe_ = 0;
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAsset(AssetAppearance assetAppearance) {
                SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    assetAppearance.getClass();
                    this.asset_ = assetAppearance;
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(assetAppearance);
                }
                return this;
            }

            public Builder setFeatures(int i10, Feature feature) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    feature.getClass();
                    ensureFeaturesIsMutable();
                    this.features_.set(i10, feature);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i10, feature);
                }
                return this;
            }

            private void ensureFeaturesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.features_ = new ArrayList(this.features_);
                    this.bitField0_ |= 1;
                }
            }

            private SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> getAssetFieldBuilder() {
                if (this.assetBuilder_ == null) {
                    this.assetBuilder_ = new SingleFieldBuilderV3<>(getAsset(), getParentForChildren(), isClean());
                    this.asset_ = null;
                }
                return this.assetBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Postbanner_descriptor;
            }

            private RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> getFeaturesFieldBuilder() {
                if (this.featuresBuilder_ == null) {
                    this.featuresBuilder_ = new RepeatedFieldBuilderV3<>(this.features_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.features_ = null;
                }
                return this.featuresBuilder_;
            }

            public Builder addAllFeatures(Iterable<? extends Feature> iterable) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFeaturesIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.features_);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                }
                return this;
            }

            public Builder clearAsset() {
                if (this.assetBuilder_ == null) {
                    this.asset_ = null;
                    onChanged();
                } else {
                    this.asset_ = null;
                    this.assetBuilder_ = null;
                }
                return this;
            }

            public Builder clearFeatures() {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.features_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public AssetAppearance getAsset() {
                SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssetAppearance) singleFieldBuilderV3.getMessage();
                }
                AssetAppearance assetAppearance = this.asset_;
                return assetAppearance == null ? AssetAppearance.getDefaultInstance() : assetAppearance;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public AssetAppearanceOrBuilder getAssetOrBuilder() {
                SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AssetAppearanceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AssetAppearance assetAppearance = this.asset_;
                return assetAppearance == null ? AssetAppearance.getDefaultInstance() : assetAppearance;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Postbanner_descriptor;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public Feature getFeatures(int i10) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                return repeatedFieldBuilderV3 == null ? this.features_.get(i10) : (Feature) repeatedFieldBuilderV3.getMessage(i10);
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public int getFeaturesCount() {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                return repeatedFieldBuilderV3 == null ? this.features_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public List<Feature> getFeaturesList() {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.features_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public FeatureOrBuilder getFeaturesOrBuilder(int i10) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                return repeatedFieldBuilderV3 == null ? this.features_.get(i10) : (FeatureOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public List<? extends FeatureOrBuilder> getFeaturesOrBuilderList() {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.features_);
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public int getSequence() {
                return this.sequence_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public PostbannerType getTpe() {
                PostbannerType postbannerTypeValueOf = PostbannerType.valueOf(this.tpe_);
                return postbannerTypeValueOf == null ? PostbannerType.UNRECOGNIZED : postbannerTypeValueOf;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public int getTpeValue() {
                return this.tpe_;
            }

            @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
            public boolean hasAsset() {
                return (this.assetBuilder_ == null && this.asset_ == null) ? false : true;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Postbanner_fieldAccessorTable.ensureFieldAccessorsInitialized(Postbanner.class, Builder.class);
            }

            public Builder mergeAsset(AssetAppearance assetAppearance) {
                SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    AssetAppearance assetAppearance2 = this.asset_;
                    if (assetAppearance2 != null) {
                        this.asset_ = AssetAppearance.newBuilder(assetAppearance2).mergeFrom(assetAppearance).buildPartial();
                    } else {
                        this.asset_ = assetAppearance;
                    }
                    onChanged();
                } else {
                    singleFieldBuilderV3.mergeFrom(assetAppearance);
                }
                return this;
            }

            public Builder removeFeatures(int i10) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFeaturesIsMutable();
                    this.features_.remove(i10);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.remove(i10);
                }
                return this;
            }

            public Builder setSequence(int i10) {
                this.sequence_ = i10;
                onChanged();
                return this;
            }

            public Builder setTpeValue(int i10) {
                this.tpe_ = i10;
                onChanged();
                return this;
            }

            private Builder() {
                this.tpe_ = 0;
                this.features_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getFeaturesFieldBuilder();
                }
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Postbanner build() {
                Postbanner postbannerBuildPartial = buildPartial();
                if (postbannerBuildPartial.isInitialized()) {
                    return postbannerBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) postbannerBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Postbanner buildPartial() {
                Postbanner postbanner = new Postbanner(this);
                postbanner.tpe_ = this.tpe_;
                postbanner.sequence_ = this.sequence_;
                SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    postbanner.asset_ = this.asset_;
                } else {
                    postbanner.asset_ = (AssetAppearance) singleFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    postbanner.features_ = repeatedFieldBuilderV3.build();
                } else {
                    if ((this.bitField0_ & 1) != 0) {
                        this.features_ = Collections.unmodifiableList(this.features_);
                        this.bitField0_ &= -2;
                    }
                    postbanner.features_ = this.features_;
                }
                onBuilt();
                return postbanner;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public AssetAppearance.Builder getAssetBuilder() {
                onChanged();
                return (AssetAppearance.Builder) getAssetFieldBuilder().getBuilder();
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public Postbanner getDefaultInstanceForType() {
                return Postbanner.getDefaultInstance();
            }

            public Feature.Builder getFeaturesBuilder(int i10) {
                return (Feature.Builder) getFeaturesFieldBuilder().getBuilder(i10);
            }

            public List<Feature.Builder> getFeaturesBuilderList() {
                return getFeaturesFieldBuilder().getBuilderList();
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            public Builder setTpe(PostbannerType postbannerType) {
                postbannerType.getClass();
                this.tpe_ = postbannerType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Feature.Builder addFeaturesBuilder(int i10) {
                return (Feature.Builder) getFeaturesFieldBuilder().addBuilder(i10, Feature.getDefaultInstance());
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
                this.tpe_ = 0;
                this.sequence_ = 0;
                if (this.assetBuilder_ == null) {
                    this.asset_ = null;
                } else {
                    this.asset_ = null;
                    this.assetBuilder_ = null;
                }
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.features_ = Collections.emptyList();
                    this.bitField0_ &= -2;
                } else {
                    repeatedFieldBuilderV3.clear();
                }
                return this;
            }

            public Builder setAsset(AssetAppearance.Builder builder) {
                SingleFieldBuilderV3<AssetAppearance, AssetAppearance.Builder, AssetAppearanceOrBuilder> singleFieldBuilderV3 = this.assetBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.asset_ = builder.build();
                    onChanged();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.tpe_ = 0;
                this.features_ = Collections.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder addFeatures(int i10, Feature feature) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    feature.getClass();
                    ensureFeaturesIsMutable();
                    this.features_.add(i10, feature);
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i10, feature);
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
                if (message instanceof Postbanner) {
                    return mergeFrom((Postbanner) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder setFeatures(int i10, Feature.Builder builder) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFeaturesIsMutable();
                    this.features_.set(i10, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.setMessage(i10, builder.build());
                }
                return this;
            }

            public Builder mergeFrom(Postbanner postbanner) {
                if (postbanner == Postbanner.getDefaultInstance()) {
                    return this;
                }
                if (postbanner.tpe_ != 0) {
                    setTpeValue(postbanner.getTpeValue());
                }
                if (postbanner.getSequence() != 0) {
                    setSequence(postbanner.getSequence());
                }
                if (postbanner.hasAsset()) {
                    mergeAsset(postbanner.getAsset());
                }
                if (this.featuresBuilder_ == null) {
                    if (!postbanner.features_.isEmpty()) {
                        if (this.features_.isEmpty()) {
                            this.features_ = postbanner.features_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureFeaturesIsMutable();
                            this.features_.addAll(postbanner.features_);
                        }
                        onChanged();
                    }
                } else if (!postbanner.features_.isEmpty()) {
                    if (!this.featuresBuilder_.isEmpty()) {
                        this.featuresBuilder_.addAllMessages(postbanner.features_);
                    } else {
                        this.featuresBuilder_.dispose();
                        this.featuresBuilder_ = null;
                        this.features_ = postbanner.features_;
                        this.bitField0_ &= -2;
                        this.featuresBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getFeaturesFieldBuilder() : null;
                    }
                }
                mergeUnknownFields(postbanner.unknownFields);
                onChanged();
                return this;
            }

            public Builder addFeatures(Feature.Builder builder) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFeaturesIsMutable();
                    this.features_.add(builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                }
                return this;
            }

            public Builder addFeatures(int i10, Feature.Builder builder) {
                RepeatedFieldBuilderV3<Feature, Feature.Builder, FeatureOrBuilder> repeatedFieldBuilderV3 = this.featuresBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFeaturesIsMutable();
                    this.features_.add(i10, builder.build());
                    onChanged();
                } else {
                    repeatedFieldBuilderV3.addMessage(i10, builder.build());
                }
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                Postbanner postbanner = null;
                try {
                    try {
                        Postbanner postbanner2 = (Postbanner) Postbanner.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (postbanner2 != null) {
                            mergeFrom(postbanner2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        Postbanner postbanner3 = (Postbanner) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            postbanner = postbanner3;
                            if (postbanner != null) {
                                mergeFrom(postbanner);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (postbanner != null) {
                        mergeFrom(postbanner);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Postbanner parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Postbanner) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Postbanner parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Postbanner)) {
                return super.equals(obj);
            }
            Postbanner postbanner = (Postbanner) obj;
            if (this.tpe_ == postbanner.tpe_ && getSequence() == postbanner.getSequence() && hasAsset() == postbanner.hasAsset()) {
                return (!hasAsset() || getAsset().equals(postbanner.getAsset())) && getFeaturesList().equals(postbanner.getFeaturesList()) && this.unknownFields.equals(postbanner.unknownFields);
            }
            return false;
        }

        public static Postbanner getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Postbanner_descriptor;
        }

        public static Builder newBuilder(Postbanner postbanner) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(postbanner);
        }

        public static Postbanner parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<Postbanner> parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public AssetAppearance getAsset() {
            AssetAppearance assetAppearance = this.asset_;
            return assetAppearance == null ? AssetAppearance.getDefaultInstance() : assetAppearance;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public Feature getFeatures(int i10) {
            return this.features_.get(i10);
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public int getFeaturesCount() {
            return this.features_.size();
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public List<Feature> getFeaturesList() {
            return this.features_;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public FeatureOrBuilder getFeaturesOrBuilder(int i10) {
            return this.features_.get(i10);
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public List<? extends FeatureOrBuilder> getFeaturesOrBuilderList() {
            return this.features_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<Postbanner> getParserForType() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public int getSequence() {
            return this.sequence_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeEnumSize = this.tpe_ != PostbannerType.DISABLED.getNumber() ? CodedOutputStream.computeEnumSize(1, this.tpe_) + 0 : 0;
            int i11 = this.sequence_;
            if (i11 != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, i11);
            }
            if (this.asset_ != null) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getAsset());
            }
            for (int i12 = 0; i12 < this.features_.size(); i12++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(4, this.features_.get(i12));
            }
            int serializedSize = iComputeEnumSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public PostbannerType getTpe() {
            PostbannerType postbannerTypeValueOf = PostbannerType.valueOf(this.tpe_);
            return postbannerTypeValueOf == null ? PostbannerType.UNRECOGNIZED : postbannerTypeValueOf;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public int getTpeValue() {
            return this.tpe_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public boolean hasAsset() {
            return this.asset_ != null;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.tpe_) * 37) + 2) * 53) + getSequence();
            if (hasAsset()) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getAsset().hashCode();
            }
            if (getFeaturesCount() > 0) {
                iHashCode = (((iHashCode * 37) + 4) * 53) + getFeaturesList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_Postbanner_fieldAccessorTable.ensureFieldAccessorsInitialized(Postbanner.class, Builder.class);
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
            return new Postbanner();
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            if (this.tpe_ != PostbannerType.DISABLED.getNumber()) {
                codedOutputStream.writeEnum(1, this.tpe_);
            }
            int i10 = this.sequence_;
            if (i10 != 0) {
                codedOutputStream.writeUInt32(2, i10);
            }
            if (this.asset_ != null) {
                codedOutputStream.writeMessage(3, getAsset());
            }
            for (int i11 = 0; i11 < this.features_.size(); i11++) {
                codedOutputStream.writeMessage(4, this.features_.get(i11));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        private Postbanner(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Postbanner parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Postbanner) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Postbanner parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // io.bidmachine.protobuf.CreativeExtension.PostbannerOrBuilder
        public AssetAppearanceOrBuilder getAssetOrBuilder() {
            return getAsset();
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public Postbanner getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static Postbanner parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private Postbanner() {
            this.memoizedIsInitialized = (byte) -1;
            this.tpe_ = 0;
            this.features_ = Collections.emptyList();
        }

        public static Postbanner parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static Postbanner parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Postbanner parseFrom(InputStream inputStream) throws IOException {
            return (Postbanner) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private Postbanner(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                this.tpe_ = codedInputStream.readEnum();
                            } else if (tag == 16) {
                                this.sequence_ = codedInputStream.readUInt32();
                            } else if (tag == 26) {
                                AssetAppearance assetAppearance = this.asset_;
                                AssetAppearance.Builder builder = assetAppearance != null ? assetAppearance.toBuilder() : null;
                                AssetAppearance assetAppearance2 = (AssetAppearance) codedInputStream.readMessage(AssetAppearance.parser(), extensionRegistryLite);
                                this.asset_ = assetAppearance2;
                                if (builder != null) {
                                    builder.mergeFrom(assetAppearance2);
                                    this.asset_ = builder.buildPartial();
                                }
                            } else if (tag != 34) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if (!(z11 & true)) {
                                    this.features_ = new ArrayList();
                                    z11 |= true;
                                }
                                this.features_.add((Feature) codedInputStream.readMessage(Feature.parser(), extensionRegistryLite));
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
                        this.features_ = Collections.unmodifiableList(this.features_);
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11 & true) {
                this.features_ = Collections.unmodifiableList(this.features_);
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static Postbanner parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Postbanner) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Postbanner parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Postbanner) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Postbanner parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Postbanner) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface PostbannerOrBuilder extends MessageOrBuilder {
        AssetAppearance getAsset();

        AssetAppearanceOrBuilder getAssetOrBuilder();

        Feature getFeatures(int i10);

        int getFeaturesCount();

        List<Feature> getFeaturesList();

        FeatureOrBuilder getFeaturesOrBuilder(int i10);

        List<? extends FeatureOrBuilder> getFeaturesOrBuilderList();

        int getSequence();

        PostbannerType getTpe();

        int getTpeValue();

        boolean hasAsset();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static CreativeExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (CreativeExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static CreativeExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreativeExtension)) {
            return super.equals(obj);
        }
        CreativeExtension creativeExtension = (CreativeExtension) obj;
        if (hasAsset() != creativeExtension.hasAsset()) {
            return false;
        }
        return (!hasAsset() || getAsset().equals(creativeExtension.getAsset())) && getFeaturesList().equals(creativeExtension.getFeaturesList()) && getPostbannersList().equals(creativeExtension.getPostbannersList()) && this.unknownFields.equals(creativeExtension.unknownFields);
    }

    public static CreativeExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_descriptor;
    }

    public static Builder newBuilder(CreativeExtension creativeExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(creativeExtension);
    }

    public static CreativeExtension parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Parser<CreativeExtension> parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public AssetAppearance getAsset() {
        AssetAppearance assetAppearance = this.asset_;
        return assetAppearance == null ? AssetAppearance.getDefaultInstance() : assetAppearance;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public Feature getFeatures(int i10) {
        return this.features_.get(i10);
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public int getFeaturesCount() {
        return this.features_.size();
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public List<Feature> getFeaturesList() {
        return this.features_;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public FeatureOrBuilder getFeaturesOrBuilder(int i10) {
        return this.features_.get(i10);
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public List<? extends FeatureOrBuilder> getFeaturesOrBuilderList() {
        return this.features_;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser<CreativeExtension> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public Postbanner getPostbanners(int i10) {
        return this.postbanners_.get(i10);
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public int getPostbannersCount() {
        return this.postbanners_.size();
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public List<Postbanner> getPostbannersList() {
        return this.postbanners_;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public PostbannerOrBuilder getPostbannersOrBuilder(int i10) {
        return this.postbanners_.get(i10);
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public List<? extends PostbannerOrBuilder> getPostbannersOrBuilderList() {
        return this.postbanners_;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        int iComputeMessageSize = this.asset_ != null ? CodedOutputStream.computeMessageSize(1, getAsset()) + 0 : 0;
        for (int i11 = 0; i11 < this.features_.size(); i11++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.features_.get(i11));
        }
        for (int i12 = 0; i12 < this.postbanners_.size(); i12++) {
            iComputeMessageSize += CodedOutputStream.computeMessageSize(3, this.postbanners_.get(i12));
        }
        int serializedSize = iComputeMessageSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public boolean hasAsset() {
        return this.asset_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = 779 + getDescriptor().hashCode();
        if (hasAsset()) {
            iHashCode = (((iHashCode * 37) + 1) * 53) + getAsset().hashCode();
        }
        if (getFeaturesCount() > 0) {
            iHashCode = (((iHashCode * 37) + 2) * 53) + getFeaturesList().hashCode();
        }
        if (getPostbannersCount() > 0) {
            iHashCode = (((iHashCode * 37) + 3) * 53) + getPostbannersList().hashCode();
        }
        int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_CreativeExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(CreativeExtension.class, Builder.class);
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
        return new CreativeExtension();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.asset_ != null) {
            codedOutputStream.writeMessage(1, getAsset());
        }
        for (int i10 = 0; i10 < this.features_.size(); i10++) {
            codedOutputStream.writeMessage(2, this.features_.get(i10));
        }
        for (int i11 = 0; i11 < this.postbanners_.size(); i11++) {
            codedOutputStream.writeMessage(3, this.postbanners_.get(i11));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    private CreativeExtension(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static CreativeExtension parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreativeExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // io.bidmachine.protobuf.CreativeExtensionOrBuilder
    public AssetAppearanceOrBuilder getAssetOrBuilder() {
        return getAsset();
    }

    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
    public CreativeExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static CreativeExtension parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private CreativeExtension() {
        this.memoizedIsInitialized = (byte) -1;
        this.features_ = Collections.emptyList();
        this.postbanners_ = Collections.emptyList();
    }

    public static CreativeExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static CreativeExtension parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static CreativeExtension parseFrom(InputStream inputStream) throws IOException {
        return (CreativeExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    private CreativeExtension(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                AssetAppearance assetAppearance = this.asset_;
                                AssetAppearance.Builder builder = assetAppearance != null ? assetAppearance.toBuilder() : null;
                                AssetAppearance assetAppearance2 = (AssetAppearance) codedInputStream.readMessage(AssetAppearance.parser(), extensionRegistryLite);
                                this.asset_ = assetAppearance2;
                                if (builder != null) {
                                    builder.mergeFrom(assetAppearance2);
                                    this.asset_ = builder.buildPartial();
                                }
                            } else if (tag == 18) {
                                if ((i10 & 1) == 0) {
                                    this.features_ = new ArrayList();
                                    i10 |= 1;
                                }
                                this.features_.add((Feature) codedInputStream.readMessage(Feature.parser(), extensionRegistryLite));
                            } else if (tag != 26) {
                                if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                }
                            } else {
                                if ((i10 & 2) == 0) {
                                    this.postbanners_ = new ArrayList();
                                    i10 |= 2;
                                }
                                this.postbanners_.add((Postbanner) codedInputStream.readMessage(Postbanner.parser(), extensionRegistryLite));
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
                    this.features_ = Collections.unmodifiableList(this.features_);
                }
                if ((i10 & 2) != 0) {
                    this.postbanners_ = Collections.unmodifiableList(this.postbanners_);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((i10 & 1) != 0) {
            this.features_ = Collections.unmodifiableList(this.features_);
        }
        if ((i10 & 2) != 0) {
            this.postbanners_ = Collections.unmodifiableList(this.postbanners_);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static CreativeExtension parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static CreativeExtension parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (CreativeExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static CreativeExtension parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (CreativeExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
