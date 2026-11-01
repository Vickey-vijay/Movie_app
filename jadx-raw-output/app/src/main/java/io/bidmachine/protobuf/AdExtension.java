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
import com.explorestack.protobuf.MapEntry;
import com.explorestack.protobuf.MapField;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.MessageOrBuilder;
import com.explorestack.protobuf.Parser;
import com.explorestack.protobuf.RepeatedFieldBuilderV3;
import com.explorestack.protobuf.SingleFieldBuilderV3;
import com.explorestack.protobuf.UnknownFieldSet;
import com.explorestack.protobuf.WireFormat;
import com.explorestack.protobuf.adcom.Ad;
import io.bidmachine.protobuf.rendering.Rendering;
import io.bidmachine.protobuf.rendering.RenderingOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AdExtension extends GeneratedMessageV3 implements AdExtensionOrBuilder {
    public static final int AD_CACHE_CONTROL_FIELD_NUMBER = 21;
    public static final int AD_CACHE_MAX_AGE_FIELD_NUMBER = 22;
    public static final int AD_FLEXIBLE_SIZE_FIELD_NUMBER = 32;
    public static final int AD_MARKUP_LOADING_TIMEOUT_FIELD_NUMBER = 24;
    public static final int CLOSE_BUTTON_FIELD_NUMBER = 15;
    public static final int COMPANION_SKIPOFFSET_FIELD_NUMBER = 10;
    public static final int COUNTDOWN_FIELD_NUMBER = 14;
    public static final int CREATIVE_EXTENSION_FIELD_NUMBER = 31;
    public static final int CREATIVE_LOADING_METHOD_FIELD_NUMBER = 27;
    public static final int CREATIVE_LOADING_TIMEOUT_FIELD_NUMBER = 35;
    public static final int CRID_MONITORING_ENABLED_FIELD_NUMBER = 36;
    public static final int CUSTOM_PARAMS_FIELD_NUMBER = 8;
    public static final int EVENT_CONFIGURATION_FIELD_NUMBER = 29;
    public static final int EVENT_FIELD_NUMBER = 7;
    public static final int IGNORES_SAFE_AREA_LAYOUT_GUIDE_FIELD_NUMBER = 16;
    public static final int LOAD_SKIPOFFSET_FIELD_NUMBER = 3;
    public static final int MRAID_CREATIVE_VALIDATION_REQUIRED_FIELD_NUMBER = 34;
    public static final int PLACEHOLDER_TIMEOUT_FIELD_NUMBER = 28;
    public static final int PRELOAD_AD_FIELD_NUMBER = 26;
    public static final int PRELOAD_FIELD_NUMBER = 2;
    public static final int PROGRESS_DURATION_FIELD_NUMBER = 19;
    public static final int PROGRESS_FIELD_NUMBER = 18;
    public static final int R1_DELAY_FIELD_NUMBER = 23;
    public static final int R1_FIELD_NUMBER = 12;
    public static final int R2_FIELD_NUMBER = 13;
    public static final int RENDERING_CONFIGURATION_FIELD_NUMBER = 33;
    public static final int SKIPOFFSET_FIELD_NUMBER = 9;
    public static final int STORE_URL_FIELD_NUMBER = 17;
    public static final int USE_EMBEDDED_BROWSER_FIELD_NUMBER = 25;
    public static final int USE_NATIVE_CLOSE_FIELD_NUMBER = 11;
    public static final int VIEWABILITY_DURATION_THRESHOLD_FIELD_NUMBER = 6;
    public static final int VIEWABILITY_IGNORE_OVERLAP_FIELD_NUMBER = 30;
    public static final int VIEWABILITY_IGNORE_WINDOW_FOCUS_FIELD_NUMBER = 20;
    public static final int VIEWABILITY_PIXEL_THRESHOLD_FIELD_NUMBER = 5;
    public static final int VIEWABILITY_TIME_THRESHOLD_FIELD_NUMBER = 4;
    private static final long serialVersionUID = 0;
    private int adCacheControl_;
    private int adCacheMaxAge_;
    private boolean adFlexibleSize_;
    private int adMarkupLoadingTimeout_;
    private ControlAsset closeButton_;
    private int companionSkipoffset_;
    private ControlAsset countdown_;
    private CreativeExtension creativeExtension_;
    private int creativeLoadingMethod_;
    private int creativeLoadingTimeout_;
    private boolean cridMonitoringEnabled_;
    private MapField<String, String> customParams_;
    private EventConfiguration eventConfiguration_;
    private List<Ad.Event> event_;
    private boolean ignoresSafeAreaLayoutGuide_;
    private int loadSkipoffset_;
    private byte memoizedIsInitialized;
    private boolean mraidCreativeValidationRequired_;
    private float placeholderTimeout_;
    private boolean preloadAd_;
    private boolean preload_;
    private int progressDuration_;
    private ControlAsset progress_;
    private int r1Delay_;
    private boolean r1_;
    private boolean r2_;
    private Rendering renderingConfiguration_;
    private int skipoffset_;
    private volatile Object storeUrl_;
    private boolean useEmbeddedBrowser_;
    private boolean useNativeClose_;
    private float viewabilityDurationThreshold_;
    private boolean viewabilityIgnoreOverlap_;
    private boolean viewabilityIgnoreWindowFocus_;
    private float viewabilityPixelThreshold_;
    private int viewabilityTimeThreshold_;
    private static final AdExtension DEFAULT_INSTANCE = new AdExtension();
    private static final Parser<AdExtension> PARSER = new AbstractParser<AdExtension>() { // from class: io.bidmachine.protobuf.AdExtension.1
        @Override // com.explorestack.protobuf.Parser
        public AdExtension parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return new AdExtension(codedInputStream, extensionRegistryLite);
        }
    };

    public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdExtensionOrBuilder {
        private int adCacheControl_;
        private int adCacheMaxAge_;
        private boolean adFlexibleSize_;
        private int adMarkupLoadingTimeout_;
        private int bitField0_;
        private SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> closeButtonBuilder_;
        private ControlAsset closeButton_;
        private int companionSkipoffset_;
        private SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> countdownBuilder_;
        private ControlAsset countdown_;
        private SingleFieldBuilderV3<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> creativeExtensionBuilder_;
        private CreativeExtension creativeExtension_;
        private int creativeLoadingMethod_;
        private int creativeLoadingTimeout_;
        private boolean cridMonitoringEnabled_;
        private MapField<String, String> customParams_;
        private RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> eventBuilder_;
        private SingleFieldBuilderV3<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> eventConfigurationBuilder_;
        private EventConfiguration eventConfiguration_;
        private List<Ad.Event> event_;
        private boolean ignoresSafeAreaLayoutGuide_;
        private int loadSkipoffset_;
        private boolean mraidCreativeValidationRequired_;
        private float placeholderTimeout_;
        private boolean preloadAd_;
        private boolean preload_;
        private SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> progressBuilder_;
        private int progressDuration_;
        private ControlAsset progress_;
        private int r1Delay_;
        private boolean r1_;
        private boolean r2_;
        private SingleFieldBuilderV3<Rendering, Rendering.Builder, RenderingOrBuilder> renderingConfigurationBuilder_;
        private Rendering renderingConfiguration_;
        private int skipoffset_;
        private Object storeUrl_;
        private boolean useEmbeddedBrowser_;
        private boolean useNativeClose_;
        private float viewabilityDurationThreshold_;
        private boolean viewabilityIgnoreOverlap_;
        private boolean viewabilityIgnoreWindowFocus_;
        private float viewabilityPixelThreshold_;
        private int viewabilityTimeThreshold_;

        public Builder addEvent(Ad.Event event) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                event.getClass();
                ensureEventIsMutable();
                this.event_.add(event);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(event);
            }
            return this;
        }

        public Ad.Event.Builder addEventBuilder() {
            return (Ad.Event.Builder) getEventFieldBuilder().addBuilder(Ad.Event.getDefaultInstance());
        }

        public Builder clearAdCacheControl() {
            this.adCacheControl_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdCacheMaxAge() {
            this.adCacheMaxAge_ = 0;
            onChanged();
            return this;
        }

        public Builder clearAdFlexibleSize() {
            this.adFlexibleSize_ = false;
            onChanged();
            return this;
        }

        public Builder clearAdMarkupLoadingTimeout() {
            this.adMarkupLoadingTimeout_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCompanionSkipoffset() {
            this.companionSkipoffset_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCreativeLoadingMethod() {
            this.creativeLoadingMethod_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCreativeLoadingTimeout() {
            this.creativeLoadingTimeout_ = 0;
            onChanged();
            return this;
        }

        public Builder clearCridMonitoringEnabled() {
            this.cridMonitoringEnabled_ = false;
            onChanged();
            return this;
        }

        public Builder clearIgnoresSafeAreaLayoutGuide() {
            this.ignoresSafeAreaLayoutGuide_ = false;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder clearLoadSkipoffset() {
            this.loadSkipoffset_ = 0;
            onChanged();
            return this;
        }

        public Builder clearMraidCreativeValidationRequired() {
            this.mraidCreativeValidationRequired_ = false;
            onChanged();
            return this;
        }

        public Builder clearPlaceholderTimeout() {
            this.placeholderTimeout_ = 0.0f;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder clearPreload() {
            this.preload_ = false;
            onChanged();
            return this;
        }

        public Builder clearPreloadAd() {
            this.preloadAd_ = false;
            onChanged();
            return this;
        }

        public Builder clearProgressDuration() {
            this.progressDuration_ = 0;
            onChanged();
            return this;
        }

        public Builder clearR1() {
            this.r1_ = false;
            onChanged();
            return this;
        }

        public Builder clearR1Delay() {
            this.r1Delay_ = 0;
            onChanged();
            return this;
        }

        public Builder clearR2() {
            this.r2_ = false;
            onChanged();
            return this;
        }

        public Builder clearSkipoffset() {
            this.skipoffset_ = 0;
            onChanged();
            return this;
        }

        public Builder clearUseEmbeddedBrowser() {
            this.useEmbeddedBrowser_ = false;
            onChanged();
            return this;
        }

        public Builder clearUseNativeClose() {
            this.useNativeClose_ = false;
            onChanged();
            return this;
        }

        public Builder clearViewabilityDurationThreshold() {
            this.viewabilityDurationThreshold_ = 0.0f;
            onChanged();
            return this;
        }

        public Builder clearViewabilityIgnoreOverlap() {
            this.viewabilityIgnoreOverlap_ = false;
            onChanged();
            return this;
        }

        public Builder clearViewabilityIgnoreWindowFocus() {
            this.viewabilityIgnoreWindowFocus_ = false;
            onChanged();
            return this;
        }

        public Builder clearViewabilityPixelThreshold() {
            this.viewabilityPixelThreshold_ = 0.0f;
            onChanged();
            return this;
        }

        public Builder clearViewabilityTimeThreshold() {
            this.viewabilityTimeThreshold_ = 0;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return true;
        }

        public Builder setCloseButton(ControlAsset controlAsset) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.closeButtonBuilder_;
            if (singleFieldBuilderV3 == null) {
                controlAsset.getClass();
                this.closeButton_ = controlAsset;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(controlAsset);
            }
            return this;
        }

        public Builder setCountdown(ControlAsset controlAsset) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
            if (singleFieldBuilderV3 == null) {
                controlAsset.getClass();
                this.countdown_ = controlAsset;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(controlAsset);
            }
            return this;
        }

        @Deprecated
        public Builder setCreativeExtension(CreativeExtension creativeExtension) {
            SingleFieldBuilderV3<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> singleFieldBuilderV3 = this.creativeExtensionBuilder_;
            if (singleFieldBuilderV3 == null) {
                creativeExtension.getClass();
                this.creativeExtension_ = creativeExtension;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(creativeExtension);
            }
            return this;
        }

        public Builder setEvent(int i10, Ad.Event event) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                event.getClass();
                ensureEventIsMutable();
                this.event_.set(i10, event);
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i10, event);
            }
            return this;
        }

        public Builder setEventConfiguration(EventConfiguration eventConfiguration) {
            SingleFieldBuilderV3<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> singleFieldBuilderV3 = this.eventConfigurationBuilder_;
            if (singleFieldBuilderV3 == null) {
                eventConfiguration.getClass();
                this.eventConfiguration_ = eventConfiguration;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(eventConfiguration);
            }
            return this;
        }

        public Builder setProgress(ControlAsset controlAsset) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
            if (singleFieldBuilderV3 == null) {
                controlAsset.getClass();
                this.progress_ = controlAsset;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(controlAsset);
            }
            return this;
        }

        public Builder setRenderingConfiguration(Rendering rendering) {
            SingleFieldBuilderV3<Rendering, Rendering.Builder, RenderingOrBuilder> singleFieldBuilderV3 = this.renderingConfigurationBuilder_;
            if (singleFieldBuilderV3 == null) {
                rendering.getClass();
                this.renderingConfiguration_ = rendering;
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(rendering);
            }
            return this;
        }

        private void ensureEventIsMutable() {
            if ((this.bitField0_ & 1) == 0) {
                this.event_ = new ArrayList(this.event_);
                this.bitField0_ |= 1;
            }
        }

        private SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> getCloseButtonFieldBuilder() {
            if (this.closeButtonBuilder_ == null) {
                this.closeButtonBuilder_ = new SingleFieldBuilderV3<>(getCloseButton(), getParentForChildren(), isClean());
                this.closeButton_ = null;
            }
            return this.closeButtonBuilder_;
        }

        private SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> getCountdownFieldBuilder() {
            if (this.countdownBuilder_ == null) {
                this.countdownBuilder_ = new SingleFieldBuilderV3<>(getCountdown(), getParentForChildren(), isClean());
                this.countdown_ = null;
            }
            return this.countdownBuilder_;
        }

        private SingleFieldBuilderV3<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> getCreativeExtensionFieldBuilder() {
            if (this.creativeExtensionBuilder_ == null) {
                this.creativeExtensionBuilder_ = new SingleFieldBuilderV3<>(getCreativeExtension(), getParentForChildren(), isClean());
                this.creativeExtension_ = null;
            }
            return this.creativeExtensionBuilder_;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_descriptor;
        }

        private SingleFieldBuilderV3<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> getEventConfigurationFieldBuilder() {
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfigurationBuilder_ = new SingleFieldBuilderV3<>(getEventConfiguration(), getParentForChildren(), isClean());
                this.eventConfiguration_ = null;
            }
            return this.eventConfigurationBuilder_;
        }

        private RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> getEventFieldBuilder() {
            if (this.eventBuilder_ == null) {
                this.eventBuilder_ = new RepeatedFieldBuilderV3<>(this.event_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                this.event_ = null;
            }
            return this.eventBuilder_;
        }

        private SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> getProgressFieldBuilder() {
            if (this.progressBuilder_ == null) {
                this.progressBuilder_ = new SingleFieldBuilderV3<>(getProgress(), getParentForChildren(), isClean());
                this.progress_ = null;
            }
            return this.progressBuilder_;
        }

        private SingleFieldBuilderV3<Rendering, Rendering.Builder, RenderingOrBuilder> getRenderingConfigurationFieldBuilder() {
            if (this.renderingConfigurationBuilder_ == null) {
                this.renderingConfigurationBuilder_ = new SingleFieldBuilderV3<>(getRenderingConfiguration(), getParentForChildren(), isClean());
                this.renderingConfiguration_ = null;
            }
            return this.renderingConfigurationBuilder_;
        }

        private MapField<String, String> internalGetCustomParams() {
            MapField<String, String> mapField = this.customParams_;
            return mapField == null ? MapField.emptyMapField(CustomParamsDefaultEntryHolder.defaultEntry) : mapField;
        }

        public Builder addAllEvent(Iterable<? extends Ad.Event> iterable) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEventIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.event_);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addAllMessages(iterable);
            }
            return this;
        }

        public Builder clearCloseButton() {
            if (this.closeButtonBuilder_ == null) {
                this.closeButton_ = null;
                onChanged();
            } else {
                this.closeButton_ = null;
                this.closeButtonBuilder_ = null;
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

        @Deprecated
        public Builder clearCreativeExtension() {
            if (this.creativeExtensionBuilder_ == null) {
                this.creativeExtension_ = null;
                onChanged();
            } else {
                this.creativeExtension_ = null;
                this.creativeExtensionBuilder_ = null;
            }
            return this;
        }

        public Builder clearEvent() {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.event_ = Collections.emptyList();
                this.bitField0_ &= -2;
                onChanged();
            } else {
                repeatedFieldBuilderV3.clear();
            }
            return this;
        }

        public Builder clearEventConfiguration() {
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfiguration_ = null;
                onChanged();
            } else {
                this.eventConfiguration_ = null;
                this.eventConfigurationBuilder_ = null;
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

        public Builder clearRenderingConfiguration() {
            if (this.renderingConfigurationBuilder_ == null) {
                this.renderingConfiguration_ = null;
                onChanged();
            } else {
                this.renderingConfiguration_ = null;
                this.renderingConfigurationBuilder_ = null;
            }
            return this;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public AdCacheControl getAdCacheControl() {
            AdCacheControl adCacheControlValueOf = AdCacheControl.valueOf(this.adCacheControl_);
            return adCacheControlValueOf == null ? AdCacheControl.UNRECOGNIZED : adCacheControlValueOf;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getAdCacheControlValue() {
            return this.adCacheControl_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getAdCacheMaxAge() {
            return this.adCacheMaxAge_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getAdFlexibleSize() {
            return this.adFlexibleSize_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getAdMarkupLoadingTimeout() {
            return this.adMarkupLoadingTimeout_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAsset getCloseButton() {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.closeButtonBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ControlAsset) singleFieldBuilderV3.getMessage();
            }
            ControlAsset controlAsset = this.closeButton_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAssetOrBuilder getCloseButtonOrBuilder() {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.closeButtonBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ControlAssetOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            ControlAsset controlAsset = this.closeButton_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getCompanionSkipoffset() {
            return this.companionSkipoffset_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAsset getCountdown() {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ControlAsset) singleFieldBuilderV3.getMessage();
            }
            ControlAsset controlAsset = this.countdown_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAssetOrBuilder getCountdownOrBuilder() {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ControlAssetOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            ControlAsset controlAsset = this.countdown_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public CreativeExtension getCreativeExtension() {
            SingleFieldBuilderV3<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> singleFieldBuilderV3 = this.creativeExtensionBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (CreativeExtension) singleFieldBuilderV3.getMessage();
            }
            CreativeExtension creativeExtension = this.creativeExtension_;
            return creativeExtension == null ? CreativeExtension.getDefaultInstance() : creativeExtension;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public CreativeExtensionOrBuilder getCreativeExtensionOrBuilder() {
            SingleFieldBuilderV3<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> singleFieldBuilderV3 = this.creativeExtensionBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (CreativeExtensionOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            CreativeExtension creativeExtension = this.creativeExtension_;
            return creativeExtension == null ? CreativeExtension.getDefaultInstance() : creativeExtension;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public CreativeLoadingMethod getCreativeLoadingMethod() {
            CreativeLoadingMethod creativeLoadingMethodValueOf = CreativeLoadingMethod.valueOf(this.creativeLoadingMethod_);
            return creativeLoadingMethodValueOf == null ? CreativeLoadingMethod.UNRECOGNIZED : creativeLoadingMethodValueOf;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getCreativeLoadingMethodValue() {
            return this.creativeLoadingMethod_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getCreativeLoadingTimeout() {
            return this.creativeLoadingTimeout_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getCridMonitoringEnabled() {
            return this.cridMonitoringEnabled_;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
        public Descriptors.Descriptor getDescriptorForType() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_descriptor;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public Ad.Event getEvent(int i10) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            return repeatedFieldBuilderV3 == null ? this.event_.get(i10) : (Ad.Event) repeatedFieldBuilderV3.getMessage(i10);
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public EventConfiguration getEventConfiguration() {
            SingleFieldBuilderV3<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> singleFieldBuilderV3 = this.eventConfigurationBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (EventConfiguration) singleFieldBuilderV3.getMessage();
            }
            EventConfiguration eventConfiguration = this.eventConfiguration_;
            return eventConfiguration == null ? EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public EventConfigurationOrBuilder getEventConfigurationOrBuilder() {
            SingleFieldBuilderV3<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> singleFieldBuilderV3 = this.eventConfigurationBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (EventConfigurationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            EventConfiguration eventConfiguration = this.eventConfiguration_;
            return eventConfiguration == null ? EventConfiguration.getDefaultInstance() : eventConfiguration;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getEventCount() {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            return repeatedFieldBuilderV3 == null ? this.event_.size() : repeatedFieldBuilderV3.getCount();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public List<Ad.Event> getEventList() {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.event_) : repeatedFieldBuilderV3.getMessageList();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public Ad.EventOrBuilder getEventOrBuilder(int i10) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            return repeatedFieldBuilderV3 == null ? this.event_.get(i10) : (Ad.EventOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i10);
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.event_);
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getIgnoresSafeAreaLayoutGuide() {
            return this.ignoresSafeAreaLayoutGuide_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public int getLoadSkipoffset() {
            return this.loadSkipoffset_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getMraidCreativeValidationRequired() {
            return this.mraidCreativeValidationRequired_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public float getPlaceholderTimeout() {
            return this.placeholderTimeout_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public boolean getPreload() {
            return this.preload_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getPreloadAd() {
            return this.preloadAd_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAsset getProgress() {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ControlAsset) singleFieldBuilderV3.getMessage();
            }
            ControlAsset controlAsset = this.progress_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getProgressDuration() {
            return this.progressDuration_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ControlAssetOrBuilder getProgressOrBuilder() {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (ControlAssetOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            ControlAsset controlAsset = this.progress_;
            return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getR1() {
            return this.r1_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getR1Delay() {
            return this.r1Delay_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getR2() {
            return this.r2_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public Rendering getRenderingConfiguration() {
            SingleFieldBuilderV3<Rendering, Rendering.Builder, RenderingOrBuilder> singleFieldBuilderV3 = this.renderingConfigurationBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (Rendering) singleFieldBuilderV3.getMessage();
            }
            Rendering rendering = this.renderingConfiguration_;
            return rendering == null ? Rendering.getDefaultInstance() : rendering;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public RenderingOrBuilder getRenderingConfigurationOrBuilder() {
            SingleFieldBuilderV3<Rendering, Rendering.Builder, RenderingOrBuilder> singleFieldBuilderV3 = this.renderingConfigurationBuilder_;
            if (singleFieldBuilderV3 != null) {
                return (RenderingOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
            }
            Rendering rendering = this.renderingConfiguration_;
            return rendering == null ? Rendering.getDefaultInstance() : rendering;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getSkipoffset() {
            return this.skipoffset_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public String getStoreUrl() {
            Object obj = this.storeUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.storeUrl_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public ByteString getStoreUrlBytes() {
            Object obj = this.storeUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.storeUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getUseEmbeddedBrowser() {
            return this.useEmbeddedBrowser_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getUseNativeClose() {
            return this.useNativeClose_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public float getViewabilityDurationThreshold() {
            return this.viewabilityDurationThreshold_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getViewabilityIgnoreOverlap() {
            return this.viewabilityIgnoreOverlap_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean getViewabilityIgnoreWindowFocus() {
            return this.viewabilityIgnoreWindowFocus_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public float getViewabilityPixelThreshold() {
            return this.viewabilityPixelThreshold_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getViewabilityTimeThreshold() {
            return this.viewabilityTimeThreshold_;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasCloseButton() {
            return (this.closeButtonBuilder_ == null && this.closeButton_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasCountdown() {
            return (this.countdownBuilder_ == null && this.countdown_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public boolean hasCreativeExtension() {
            return (this.creativeExtensionBuilder_ == null && this.creativeExtension_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasEventConfiguration() {
            return (this.eventConfigurationBuilder_ == null && this.eventConfiguration_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasProgress() {
            return (this.progressBuilder_ == null && this.progress_ == null) ? false : true;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean hasRenderingConfiguration() {
            return (this.renderingConfigurationBuilder_ == null && this.renderingConfiguration_ == null) ? false : true;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(AdExtension.class, Builder.class);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        public MapField internalGetMapField(int i10) {
            if (i10 == 8) {
                return internalGetCustomParams();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
        public MapField internalGetMutableMapField(int i10) {
            if (i10 == 8) {
                return internalGetMutableCustomParams();
            }
            throw new RuntimeException("Invalid map field number: " + i10);
        }

        public Builder mergeCloseButton(ControlAsset controlAsset) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.closeButtonBuilder_;
            if (singleFieldBuilderV3 == null) {
                ControlAsset controlAsset2 = this.closeButton_;
                if (controlAsset2 != null) {
                    this.closeButton_ = ControlAsset.newBuilder(controlAsset2).mergeFrom(controlAsset).buildPartial();
                } else {
                    this.closeButton_ = controlAsset;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(controlAsset);
            }
            return this;
        }

        public Builder mergeCountdown(ControlAsset controlAsset) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
            if (singleFieldBuilderV3 == null) {
                ControlAsset controlAsset2 = this.countdown_;
                if (controlAsset2 != null) {
                    this.countdown_ = ControlAsset.newBuilder(controlAsset2).mergeFrom(controlAsset).buildPartial();
                } else {
                    this.countdown_ = controlAsset;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(controlAsset);
            }
            return this;
        }

        @Deprecated
        public Builder mergeCreativeExtension(CreativeExtension creativeExtension) {
            SingleFieldBuilderV3<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> singleFieldBuilderV3 = this.creativeExtensionBuilder_;
            if (singleFieldBuilderV3 == null) {
                CreativeExtension creativeExtension2 = this.creativeExtension_;
                if (creativeExtension2 != null) {
                    this.creativeExtension_ = CreativeExtension.newBuilder(creativeExtension2).mergeFrom(creativeExtension).buildPartial();
                } else {
                    this.creativeExtension_ = creativeExtension;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(creativeExtension);
            }
            return this;
        }

        public Builder mergeEventConfiguration(EventConfiguration eventConfiguration) {
            SingleFieldBuilderV3<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> singleFieldBuilderV3 = this.eventConfigurationBuilder_;
            if (singleFieldBuilderV3 == null) {
                EventConfiguration eventConfiguration2 = this.eventConfiguration_;
                if (eventConfiguration2 != null) {
                    this.eventConfiguration_ = EventConfiguration.newBuilder(eventConfiguration2).mergeFrom(eventConfiguration).buildPartial();
                } else {
                    this.eventConfiguration_ = eventConfiguration;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(eventConfiguration);
            }
            return this;
        }

        public Builder mergeProgress(ControlAsset controlAsset) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
            if (singleFieldBuilderV3 == null) {
                ControlAsset controlAsset2 = this.progress_;
                if (controlAsset2 != null) {
                    this.progress_ = ControlAsset.newBuilder(controlAsset2).mergeFrom(controlAsset).buildPartial();
                } else {
                    this.progress_ = controlAsset;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(controlAsset);
            }
            return this;
        }

        public Builder mergeRenderingConfiguration(Rendering rendering) {
            SingleFieldBuilderV3<Rendering, Rendering.Builder, RenderingOrBuilder> singleFieldBuilderV3 = this.renderingConfigurationBuilder_;
            if (singleFieldBuilderV3 == null) {
                Rendering rendering2 = this.renderingConfiguration_;
                if (rendering2 != null) {
                    this.renderingConfiguration_ = Rendering.newBuilder(rendering2).mergeFrom(rendering).buildPartial();
                } else {
                    this.renderingConfiguration_ = rendering;
                }
                onChanged();
            } else {
                singleFieldBuilderV3.mergeFrom(rendering);
            }
            return this;
        }

        public Builder removeEvent(int i10) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEventIsMutable();
                this.event_.remove(i10);
                onChanged();
            } else {
                repeatedFieldBuilderV3.remove(i10);
            }
            return this;
        }

        public Builder setAdCacheControlValue(int i10) {
            this.adCacheControl_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdCacheMaxAge(int i10) {
            this.adCacheMaxAge_ = i10;
            onChanged();
            return this;
        }

        public Builder setAdFlexibleSize(boolean z10) {
            this.adFlexibleSize_ = z10;
            onChanged();
            return this;
        }

        public Builder setAdMarkupLoadingTimeout(int i10) {
            this.adMarkupLoadingTimeout_ = i10;
            onChanged();
            return this;
        }

        public Builder setCompanionSkipoffset(int i10) {
            this.companionSkipoffset_ = i10;
            onChanged();
            return this;
        }

        public Builder setCreativeLoadingMethodValue(int i10) {
            this.creativeLoadingMethod_ = i10;
            onChanged();
            return this;
        }

        public Builder setCreativeLoadingTimeout(int i10) {
            this.creativeLoadingTimeout_ = i10;
            onChanged();
            return this;
        }

        public Builder setCridMonitoringEnabled(boolean z10) {
            this.cridMonitoringEnabled_ = z10;
            onChanged();
            return this;
        }

        public Builder setIgnoresSafeAreaLayoutGuide(boolean z10) {
            this.ignoresSafeAreaLayoutGuide_ = z10;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setLoadSkipoffset(int i10) {
            this.loadSkipoffset_ = i10;
            onChanged();
            return this;
        }

        public Builder setMraidCreativeValidationRequired(boolean z10) {
            this.mraidCreativeValidationRequired_ = z10;
            onChanged();
            return this;
        }

        public Builder setPlaceholderTimeout(float f10) {
            this.placeholderTimeout_ = f10;
            onChanged();
            return this;
        }

        @Deprecated
        public Builder setPreload(boolean z10) {
            this.preload_ = z10;
            onChanged();
            return this;
        }

        public Builder setPreloadAd(boolean z10) {
            this.preloadAd_ = z10;
            onChanged();
            return this;
        }

        public Builder setProgressDuration(int i10) {
            this.progressDuration_ = i10;
            onChanged();
            return this;
        }

        public Builder setR1(boolean z10) {
            this.r1_ = z10;
            onChanged();
            return this;
        }

        public Builder setR1Delay(int i10) {
            this.r1Delay_ = i10;
            onChanged();
            return this;
        }

        public Builder setR2(boolean z10) {
            this.r2_ = z10;
            onChanged();
            return this;
        }

        public Builder setSkipoffset(int i10) {
            this.skipoffset_ = i10;
            onChanged();
            return this;
        }

        public Builder setUseEmbeddedBrowser(boolean z10) {
            this.useEmbeddedBrowser_ = z10;
            onChanged();
            return this;
        }

        public Builder setUseNativeClose(boolean z10) {
            this.useNativeClose_ = z10;
            onChanged();
            return this;
        }

        public Builder setViewabilityDurationThreshold(float f10) {
            this.viewabilityDurationThreshold_ = f10;
            onChanged();
            return this;
        }

        public Builder setViewabilityIgnoreOverlap(boolean z10) {
            this.viewabilityIgnoreOverlap_ = z10;
            onChanged();
            return this;
        }

        public Builder setViewabilityIgnoreWindowFocus(boolean z10) {
            this.viewabilityIgnoreWindowFocus_ = z10;
            onChanged();
            return this;
        }

        public Builder setViewabilityPixelThreshold(float f10) {
            this.viewabilityPixelThreshold_ = f10;
            onChanged();
            return this;
        }

        public Builder setViewabilityTimeThreshold(int i10) {
            this.viewabilityTimeThreshold_ = i10;
            onChanged();
            return this;
        }

        private Builder() {
            this.event_ = Collections.emptyList();
            this.storeUrl_ = "";
            this.adCacheControl_ = 0;
            this.creativeLoadingMethod_ = 0;
            maybeForceBuilderInitialization();
        }

        private MapField<String, String> internalGetMutableCustomParams() {
            onChanged();
            if (this.customParams_ == null) {
                this.customParams_ = MapField.newMapField(CustomParamsDefaultEntryHolder.defaultEntry);
            }
            if (!this.customParams_.isMutable()) {
                this.customParams_ = this.customParams_.copy();
            }
            return this.customParams_;
        }

        private void maybeForceBuilderInitialization() {
            if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                getEventFieldBuilder();
            }
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
            return (Builder) super.addRepeatedField(fieldDescriptor, obj);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdExtension build() {
            AdExtension adExtensionBuildPartial = buildPartial();
            if (adExtensionBuildPartial.isInitialized()) {
                return adExtensionBuildPartial;
            }
            throw AbstractMessage.Builder.newUninitializedMessageException((Message) adExtensionBuildPartial);
        }

        @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public AdExtension buildPartial() {
            AdExtension adExtension = new AdExtension(this);
            adExtension.preload_ = this.preload_;
            adExtension.loadSkipoffset_ = this.loadSkipoffset_;
            adExtension.viewabilityTimeThreshold_ = this.viewabilityTimeThreshold_;
            adExtension.viewabilityPixelThreshold_ = this.viewabilityPixelThreshold_;
            adExtension.viewabilityDurationThreshold_ = this.viewabilityDurationThreshold_;
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 != null) {
                adExtension.event_ = repeatedFieldBuilderV3.build();
            } else {
                if ((this.bitField0_ & 1) != 0) {
                    this.event_ = Collections.unmodifiableList(this.event_);
                    this.bitField0_ &= -2;
                }
                adExtension.event_ = this.event_;
            }
            adExtension.customParams_ = internalGetCustomParams();
            adExtension.customParams_.makeImmutable();
            adExtension.skipoffset_ = this.skipoffset_;
            adExtension.companionSkipoffset_ = this.companionSkipoffset_;
            adExtension.useNativeClose_ = this.useNativeClose_;
            adExtension.r1_ = this.r1_;
            adExtension.r2_ = this.r2_;
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
            if (singleFieldBuilderV3 == null) {
                adExtension.countdown_ = this.countdown_;
            } else {
                adExtension.countdown_ = (ControlAsset) singleFieldBuilderV3.build();
            }
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV4 = this.closeButtonBuilder_;
            if (singleFieldBuilderV4 == null) {
                adExtension.closeButton_ = this.closeButton_;
            } else {
                adExtension.closeButton_ = (ControlAsset) singleFieldBuilderV4.build();
            }
            adExtension.ignoresSafeAreaLayoutGuide_ = this.ignoresSafeAreaLayoutGuide_;
            adExtension.storeUrl_ = this.storeUrl_;
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV5 = this.progressBuilder_;
            if (singleFieldBuilderV5 == null) {
                adExtension.progress_ = this.progress_;
            } else {
                adExtension.progress_ = (ControlAsset) singleFieldBuilderV5.build();
            }
            adExtension.progressDuration_ = this.progressDuration_;
            adExtension.viewabilityIgnoreWindowFocus_ = this.viewabilityIgnoreWindowFocus_;
            adExtension.adCacheControl_ = this.adCacheControl_;
            adExtension.adCacheMaxAge_ = this.adCacheMaxAge_;
            adExtension.r1Delay_ = this.r1Delay_;
            adExtension.adMarkupLoadingTimeout_ = this.adMarkupLoadingTimeout_;
            adExtension.useEmbeddedBrowser_ = this.useEmbeddedBrowser_;
            adExtension.preloadAd_ = this.preloadAd_;
            adExtension.creativeLoadingMethod_ = this.creativeLoadingMethod_;
            adExtension.placeholderTimeout_ = this.placeholderTimeout_;
            SingleFieldBuilderV3<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> singleFieldBuilderV6 = this.eventConfigurationBuilder_;
            if (singleFieldBuilderV6 == null) {
                adExtension.eventConfiguration_ = this.eventConfiguration_;
            } else {
                adExtension.eventConfiguration_ = (EventConfiguration) singleFieldBuilderV6.build();
            }
            adExtension.viewabilityIgnoreOverlap_ = this.viewabilityIgnoreOverlap_;
            SingleFieldBuilderV3<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> singleFieldBuilderV7 = this.creativeExtensionBuilder_;
            if (singleFieldBuilderV7 == null) {
                adExtension.creativeExtension_ = this.creativeExtension_;
            } else {
                adExtension.creativeExtension_ = (CreativeExtension) singleFieldBuilderV7.build();
            }
            adExtension.adFlexibleSize_ = this.adFlexibleSize_;
            SingleFieldBuilderV3<Rendering, Rendering.Builder, RenderingOrBuilder> singleFieldBuilderV8 = this.renderingConfigurationBuilder_;
            if (singleFieldBuilderV8 == null) {
                adExtension.renderingConfiguration_ = this.renderingConfiguration_;
            } else {
                adExtension.renderingConfiguration_ = (Rendering) singleFieldBuilderV8.build();
            }
            adExtension.mraidCreativeValidationRequired_ = this.mraidCreativeValidationRequired_;
            adExtension.creativeLoadingTimeout_ = this.creativeLoadingTimeout_;
            adExtension.cridMonitoringEnabled_ = this.cridMonitoringEnabled_;
            onBuilt();
            return adExtension;
        }

        public Builder clearCustomParams() {
            internalGetMutableCustomParams().getMutableMap().clear();
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
            return (Builder) super.clearField(fieldDescriptor);
        }

        public Builder clearStoreUrl() {
            this.storeUrl_ = AdExtension.getDefaultInstance().getStoreUrl();
            onChanged();
            return this;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public boolean containsCustomParams(String str) {
            str.getClass();
            return internalGetCustomParams().getMap().containsKey(str);
        }

        public ControlAsset.Builder getCloseButtonBuilder() {
            onChanged();
            return (ControlAsset.Builder) getCloseButtonFieldBuilder().getBuilder();
        }

        public ControlAsset.Builder getCountdownBuilder() {
            onChanged();
            return (ControlAsset.Builder) getCountdownFieldBuilder().getBuilder();
        }

        @Deprecated
        public CreativeExtension.Builder getCreativeExtensionBuilder() {
            onChanged();
            return (CreativeExtension.Builder) getCreativeExtensionFieldBuilder().getBuilder();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        @Deprecated
        public Map<String, String> getCustomParams() {
            return getCustomParamsMap();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public int getCustomParamsCount() {
            return internalGetCustomParams().getMap().size();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public Map<String, String> getCustomParamsMap() {
            return internalGetCustomParams().getMap();
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public String getCustomParamsOrDefault(String str, String str2) {
            str.getClass();
            Map<String, String> map = internalGetCustomParams().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            return str2;
        }

        @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
        public String getCustomParamsOrThrow(String str) {
            str.getClass();
            Map<String, String> map = internalGetCustomParams().getMap();
            if (map.containsKey(str)) {
                return map.get(str);
            }
            throw new IllegalArgumentException();
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public AdExtension getDefaultInstanceForType() {
            return AdExtension.getDefaultInstance();
        }

        public Ad.Event.Builder getEventBuilder(int i10) {
            return (Ad.Event.Builder) getEventFieldBuilder().getBuilder(i10);
        }

        public List<Ad.Event.Builder> getEventBuilderList() {
            return getEventFieldBuilder().getBuilderList();
        }

        public EventConfiguration.Builder getEventConfigurationBuilder() {
            onChanged();
            return (EventConfiguration.Builder) getEventConfigurationFieldBuilder().getBuilder();
        }

        @Deprecated
        public Map<String, String> getMutableCustomParams() {
            return internalGetMutableCustomParams().getMutableMap();
        }

        public ControlAsset.Builder getProgressBuilder() {
            onChanged();
            return (ControlAsset.Builder) getProgressFieldBuilder().getBuilder();
        }

        public Rendering.Builder getRenderingConfigurationBuilder() {
            onChanged();
            return (Rendering.Builder) getRenderingConfigurationFieldBuilder().getBuilder();
        }

        public Builder putAllCustomParams(Map<String, String> map) {
            internalGetMutableCustomParams().getMutableMap().putAll(map);
            return this;
        }

        public Builder putCustomParams(String str, String str2) {
            str.getClass();
            str2.getClass();
            internalGetMutableCustomParams().getMutableMap().put(str, str2);
            return this;
        }

        public Builder removeCustomParams(String str) {
            str.getClass();
            internalGetMutableCustomParams().getMutableMap().remove(str);
            return this;
        }

        public Builder setAdCacheControl(AdCacheControl adCacheControl) {
            adCacheControl.getClass();
            this.adCacheControl_ = adCacheControl.getNumber();
            onChanged();
            return this;
        }

        public Builder setCreativeLoadingMethod(CreativeLoadingMethod creativeLoadingMethod) {
            creativeLoadingMethod.getClass();
            this.creativeLoadingMethod_ = creativeLoadingMethod.getNumber();
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

        public Builder setStoreUrl(String str) {
            str.getClass();
            this.storeUrl_ = str;
            onChanged();
            return this;
        }

        public Builder setStoreUrlBytes(ByteString byteString) {
            byteString.getClass();
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.storeUrl_ = byteString;
            onChanged();
            return this;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
        public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
            return (Builder) super.setUnknownFields(unknownFieldSet);
        }

        public Ad.Event.Builder addEventBuilder(int i10) {
            return (Ad.Event.Builder) getEventFieldBuilder().addBuilder(i10, Ad.Event.getDefaultInstance());
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
            this.preload_ = false;
            this.loadSkipoffset_ = 0;
            this.viewabilityTimeThreshold_ = 0;
            this.viewabilityPixelThreshold_ = 0.0f;
            this.viewabilityDurationThreshold_ = 0.0f;
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                this.event_ = Collections.emptyList();
                this.bitField0_ &= -2;
            } else {
                repeatedFieldBuilderV3.clear();
            }
            internalGetMutableCustomParams().clear();
            this.skipoffset_ = 0;
            this.companionSkipoffset_ = 0;
            this.useNativeClose_ = false;
            this.r1_ = false;
            this.r2_ = false;
            if (this.countdownBuilder_ == null) {
                this.countdown_ = null;
            } else {
                this.countdown_ = null;
                this.countdownBuilder_ = null;
            }
            if (this.closeButtonBuilder_ == null) {
                this.closeButton_ = null;
            } else {
                this.closeButton_ = null;
                this.closeButtonBuilder_ = null;
            }
            this.ignoresSafeAreaLayoutGuide_ = false;
            this.storeUrl_ = "";
            if (this.progressBuilder_ == null) {
                this.progress_ = null;
            } else {
                this.progress_ = null;
                this.progressBuilder_ = null;
            }
            this.progressDuration_ = 0;
            this.viewabilityIgnoreWindowFocus_ = false;
            this.adCacheControl_ = 0;
            this.adCacheMaxAge_ = 0;
            this.r1Delay_ = 0;
            this.adMarkupLoadingTimeout_ = 0;
            this.useEmbeddedBrowser_ = false;
            this.preloadAd_ = false;
            this.creativeLoadingMethod_ = 0;
            this.placeholderTimeout_ = 0.0f;
            if (this.eventConfigurationBuilder_ == null) {
                this.eventConfiguration_ = null;
            } else {
                this.eventConfiguration_ = null;
                this.eventConfigurationBuilder_ = null;
            }
            this.viewabilityIgnoreOverlap_ = false;
            if (this.creativeExtensionBuilder_ == null) {
                this.creativeExtension_ = null;
            } else {
                this.creativeExtension_ = null;
                this.creativeExtensionBuilder_ = null;
            }
            this.adFlexibleSize_ = false;
            if (this.renderingConfigurationBuilder_ == null) {
                this.renderingConfiguration_ = null;
            } else {
                this.renderingConfiguration_ = null;
                this.renderingConfigurationBuilder_ = null;
            }
            this.mraidCreativeValidationRequired_ = false;
            this.creativeLoadingTimeout_ = 0;
            this.cridMonitoringEnabled_ = false;
            return this;
        }

        public Builder setCloseButton(ControlAsset.Builder builder) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.closeButtonBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.closeButton_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder setCountdown(ControlAsset.Builder builder) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.countdownBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.countdown_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        @Deprecated
        public Builder setCreativeExtension(CreativeExtension.Builder builder) {
            SingleFieldBuilderV3<CreativeExtension, CreativeExtension.Builder, CreativeExtensionOrBuilder> singleFieldBuilderV3 = this.creativeExtensionBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.creativeExtension_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder setEventConfiguration(EventConfiguration.Builder builder) {
            SingleFieldBuilderV3<EventConfiguration, EventConfiguration.Builder, EventConfigurationOrBuilder> singleFieldBuilderV3 = this.eventConfigurationBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.eventConfiguration_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder setProgress(ControlAsset.Builder builder) {
            SingleFieldBuilderV3<ControlAsset, ControlAsset.Builder, ControlAssetOrBuilder> singleFieldBuilderV3 = this.progressBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.progress_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder setRenderingConfiguration(Rendering.Builder builder) {
            SingleFieldBuilderV3<Rendering, Rendering.Builder, RenderingOrBuilder> singleFieldBuilderV3 = this.renderingConfigurationBuilder_;
            if (singleFieldBuilderV3 == null) {
                this.renderingConfiguration_ = builder.build();
                onChanged();
            } else {
                singleFieldBuilderV3.setMessage(builder.build());
            }
            return this;
        }

        public Builder addEvent(int i10, Ad.Event event) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                event.getClass();
                ensureEventIsMutable();
                this.event_.add(i10, event);
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i10, event);
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
            if (message instanceof AdExtension) {
                return mergeFrom((AdExtension) message);
            }
            super.mergeFrom(message);
            return this;
        }

        public Builder setEvent(int i10, Ad.Event.Builder builder) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEventIsMutable();
                this.event_.set(i10, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.setMessage(i10, builder.build());
            }
            return this;
        }

        private Builder(GeneratedMessageV3.BuilderParent builderParent) {
            super(builderParent);
            this.event_ = Collections.emptyList();
            this.storeUrl_ = "";
            this.adCacheControl_ = 0;
            this.creativeLoadingMethod_ = 0;
            maybeForceBuilderInitialization();
        }

        public Builder mergeFrom(AdExtension adExtension) {
            if (adExtension == AdExtension.getDefaultInstance()) {
                return this;
            }
            if (adExtension.getPreload()) {
                setPreload(adExtension.getPreload());
            }
            if (adExtension.getLoadSkipoffset() != 0) {
                setLoadSkipoffset(adExtension.getLoadSkipoffset());
            }
            if (adExtension.getViewabilityTimeThreshold() != 0) {
                setViewabilityTimeThreshold(adExtension.getViewabilityTimeThreshold());
            }
            if (adExtension.getViewabilityPixelThreshold() != 0.0f) {
                setViewabilityPixelThreshold(adExtension.getViewabilityPixelThreshold());
            }
            if (adExtension.getViewabilityDurationThreshold() != 0.0f) {
                setViewabilityDurationThreshold(adExtension.getViewabilityDurationThreshold());
            }
            if (this.eventBuilder_ == null) {
                if (!adExtension.event_.isEmpty()) {
                    if (this.event_.isEmpty()) {
                        this.event_ = adExtension.event_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureEventIsMutable();
                        this.event_.addAll(adExtension.event_);
                    }
                    onChanged();
                }
            } else if (!adExtension.event_.isEmpty()) {
                if (!this.eventBuilder_.isEmpty()) {
                    this.eventBuilder_.addAllMessages(adExtension.event_);
                } else {
                    this.eventBuilder_.dispose();
                    this.eventBuilder_ = null;
                    this.event_ = adExtension.event_;
                    this.bitField0_ &= -2;
                    this.eventBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getEventFieldBuilder() : null;
                }
            }
            internalGetMutableCustomParams().mergeFrom(adExtension.internalGetCustomParams());
            if (adExtension.getSkipoffset() != 0) {
                setSkipoffset(adExtension.getSkipoffset());
            }
            if (adExtension.getCompanionSkipoffset() != 0) {
                setCompanionSkipoffset(adExtension.getCompanionSkipoffset());
            }
            if (adExtension.getUseNativeClose()) {
                setUseNativeClose(adExtension.getUseNativeClose());
            }
            if (adExtension.getR1()) {
                setR1(adExtension.getR1());
            }
            if (adExtension.getR2()) {
                setR2(adExtension.getR2());
            }
            if (adExtension.hasCountdown()) {
                mergeCountdown(adExtension.getCountdown());
            }
            if (adExtension.hasCloseButton()) {
                mergeCloseButton(adExtension.getCloseButton());
            }
            if (adExtension.getIgnoresSafeAreaLayoutGuide()) {
                setIgnoresSafeAreaLayoutGuide(adExtension.getIgnoresSafeAreaLayoutGuide());
            }
            if (!adExtension.getStoreUrl().isEmpty()) {
                this.storeUrl_ = adExtension.storeUrl_;
                onChanged();
            }
            if (adExtension.hasProgress()) {
                mergeProgress(adExtension.getProgress());
            }
            if (adExtension.getProgressDuration() != 0) {
                setProgressDuration(adExtension.getProgressDuration());
            }
            if (adExtension.getViewabilityIgnoreWindowFocus()) {
                setViewabilityIgnoreWindowFocus(adExtension.getViewabilityIgnoreWindowFocus());
            }
            if (adExtension.adCacheControl_ != 0) {
                setAdCacheControlValue(adExtension.getAdCacheControlValue());
            }
            if (adExtension.getAdCacheMaxAge() != 0) {
                setAdCacheMaxAge(adExtension.getAdCacheMaxAge());
            }
            if (adExtension.getR1Delay() != 0) {
                setR1Delay(adExtension.getR1Delay());
            }
            if (adExtension.getAdMarkupLoadingTimeout() != 0) {
                setAdMarkupLoadingTimeout(adExtension.getAdMarkupLoadingTimeout());
            }
            if (adExtension.getUseEmbeddedBrowser()) {
                setUseEmbeddedBrowser(adExtension.getUseEmbeddedBrowser());
            }
            if (adExtension.getPreloadAd()) {
                setPreloadAd(adExtension.getPreloadAd());
            }
            if (adExtension.creativeLoadingMethod_ != 0) {
                setCreativeLoadingMethodValue(adExtension.getCreativeLoadingMethodValue());
            }
            if (adExtension.getPlaceholderTimeout() != 0.0f) {
                setPlaceholderTimeout(adExtension.getPlaceholderTimeout());
            }
            if (adExtension.hasEventConfiguration()) {
                mergeEventConfiguration(adExtension.getEventConfiguration());
            }
            if (adExtension.getViewabilityIgnoreOverlap()) {
                setViewabilityIgnoreOverlap(adExtension.getViewabilityIgnoreOverlap());
            }
            if (adExtension.hasCreativeExtension()) {
                mergeCreativeExtension(adExtension.getCreativeExtension());
            }
            if (adExtension.getAdFlexibleSize()) {
                setAdFlexibleSize(adExtension.getAdFlexibleSize());
            }
            if (adExtension.hasRenderingConfiguration()) {
                mergeRenderingConfiguration(adExtension.getRenderingConfiguration());
            }
            if (adExtension.getMraidCreativeValidationRequired()) {
                setMraidCreativeValidationRequired(adExtension.getMraidCreativeValidationRequired());
            }
            if (adExtension.getCreativeLoadingTimeout() != 0) {
                setCreativeLoadingTimeout(adExtension.getCreativeLoadingTimeout());
            }
            if (adExtension.getCridMonitoringEnabled()) {
                setCridMonitoringEnabled(adExtension.getCridMonitoringEnabled());
            }
            mergeUnknownFields(adExtension.unknownFields);
            onChanged();
            return this;
        }

        public Builder addEvent(Ad.Event.Builder builder) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEventIsMutable();
                this.event_.add(builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(builder.build());
            }
            return this;
        }

        public Builder addEvent(int i10, Ad.Event.Builder builder) {
            RepeatedFieldBuilderV3<Ad.Event, Ad.Event.Builder, Ad.EventOrBuilder> repeatedFieldBuilderV3 = this.eventBuilder_;
            if (repeatedFieldBuilderV3 == null) {
                ensureEventIsMutable();
                this.event_.add(i10, builder.build());
                onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(i10, builder.build());
            }
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0023  */
        @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
        public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
            AdExtension adExtension = null;
            try {
                try {
                    AdExtension adExtension2 = (AdExtension) AdExtension.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                    if (adExtension2 != null) {
                        mergeFrom(adExtension2);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e10) {
                    AdExtension adExtension3 = (AdExtension) e10.getUnfinishedMessage();
                    try {
                        throw e10.unwrapIOException();
                    } catch (Throwable th2) {
                        th = th2;
                        adExtension = adExtension3;
                        if (adExtension != null) {
                            mergeFrom(adExtension);
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                if (adExtension != null) {
                    mergeFrom(adExtension);
                }
                throw th;
            }
        }
    }

    public static final class ControlAsset extends GeneratedMessageV3 implements ControlAssetOrBuilder {
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
        private volatile Object margin_;
        private byte memoizedIsInitialized;
        private float opacity_;
        private boolean outlined_;
        private volatile Object padding_;
        private volatile Object shadow_;
        private float strokeWidth_;
        private volatile Object stroke_;
        private volatile Object style_;
        private boolean visible_;
        private int width_;
        private volatile Object x_;
        private volatile Object y_;
        private static final ControlAsset DEFAULT_INSTANCE = new ControlAsset();
        private static final Parser<ControlAsset> PARSER = new AbstractParser<ControlAsset>() { // from class: io.bidmachine.protobuf.AdExtension.ControlAsset.1
            @Override // com.explorestack.protobuf.Parser
            public ControlAsset parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ControlAsset(codedInputStream, extensionRegistryLite);
            }
        };

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ControlAssetOrBuilder {
            private Object content_;
            private Object fill_;
            private int fontStyle_;
            private int height_;
            private int hideafter_;
            private Object margin_;
            private float opacity_;
            private boolean outlined_;
            private Object padding_;
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
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_descriptor;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.content_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
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
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_descriptor;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getFill() {
                Object obj = this.fill_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.fill_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getFillBytes() {
                Object obj = this.fill_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fill_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public int getFontStyle() {
                return this.fontStyle_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public int getHideafter() {
                return this.hideafter_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getMargin() {
                Object obj = this.margin_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.margin_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getMarginBytes() {
                Object obj = this.margin_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.margin_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public float getOpacity() {
                return this.opacity_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public boolean getOutlined() {
                return this.outlined_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getPadding() {
                Object obj = this.padding_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.padding_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getPaddingBytes() {
                Object obj = this.padding_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.padding_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getShadow() {
                Object obj = this.shadow_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.shadow_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getShadowBytes() {
                Object obj = this.shadow_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.shadow_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getStroke() {
                Object obj = this.stroke_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.stroke_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getStrokeBytes() {
                Object obj = this.stroke_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.stroke_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public float getStrokeWidth() {
                return this.strokeWidth_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getStyle() {
                Object obj = this.style_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.style_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getStyleBytes() {
                Object obj = this.style_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.style_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public boolean getVisible() {
                return this.visible_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getX() {
                Object obj = this.x_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.x_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public ByteString getXBytes() {
                Object obj = this.x_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.x_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
            public String getY() {
                Object obj = this.y_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.y_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
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
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_fieldAccessorTable.ensureFieldAccessorsInitialized(ControlAsset.class, Builder.class);
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
                this.margin_ = "";
                this.padding_ = "";
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
            public ControlAsset build() {
                ControlAsset controlAssetBuildPartial = buildPartial();
                if (controlAssetBuildPartial.isInitialized()) {
                    return controlAssetBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) controlAssetBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public ControlAsset buildPartial() {
                ControlAsset controlAsset = new ControlAsset(this);
                controlAsset.content_ = this.content_;
                controlAsset.fill_ = this.fill_;
                controlAsset.fontStyle_ = this.fontStyle_;
                controlAsset.height_ = this.height_;
                controlAsset.hideafter_ = this.hideafter_;
                controlAsset.margin_ = this.margin_;
                controlAsset.opacity_ = this.opacity_;
                controlAsset.outlined_ = this.outlined_;
                controlAsset.padding_ = this.padding_;
                controlAsset.shadow_ = this.shadow_;
                controlAsset.stroke_ = this.stroke_;
                controlAsset.strokeWidth_ = this.strokeWidth_;
                controlAsset.style_ = this.style_;
                controlAsset.visible_ = this.visible_;
                controlAsset.width_ = this.width_;
                controlAsset.x_ = this.x_;
                controlAsset.y_ = this.y_;
                onBuilt();
                return controlAsset;
            }

            public Builder clearContent() {
                this.content_ = ControlAsset.getDefaultInstance().getContent();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFill() {
                this.fill_ = ControlAsset.getDefaultInstance().getFill();
                onChanged();
                return this;
            }

            public Builder clearMargin() {
                this.margin_ = ControlAsset.getDefaultInstance().getMargin();
                onChanged();
                return this;
            }

            public Builder clearPadding() {
                this.padding_ = ControlAsset.getDefaultInstance().getPadding();
                onChanged();
                return this;
            }

            public Builder clearShadow() {
                this.shadow_ = ControlAsset.getDefaultInstance().getShadow();
                onChanged();
                return this;
            }

            public Builder clearStroke() {
                this.stroke_ = ControlAsset.getDefaultInstance().getStroke();
                onChanged();
                return this;
            }

            public Builder clearStyle() {
                this.style_ = ControlAsset.getDefaultInstance().getStyle();
                onChanged();
                return this;
            }

            public Builder clearX() {
                this.x_ = ControlAsset.getDefaultInstance().getX();
                onChanged();
                return this;
            }

            public Builder clearY() {
                this.y_ = ControlAsset.getDefaultInstance().getY();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public ControlAsset getDefaultInstanceForType() {
                return ControlAsset.getDefaultInstance();
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

            public Builder setMargin(String str) {
                str.getClass();
                this.margin_ = str;
                onChanged();
                return this;
            }

            public Builder setMarginBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.margin_ = byteString;
                onChanged();
                return this;
            }

            public Builder setPadding(String str) {
                str.getClass();
                this.padding_ = str;
                onChanged();
                return this;
            }

            public Builder setPaddingBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.padding_ = byteString;
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
                this.margin_ = "";
                this.opacity_ = 0.0f;
                this.outlined_ = false;
                this.padding_ = "";
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
                if (message instanceof ControlAsset) {
                    return mergeFrom((ControlAsset) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ControlAsset controlAsset) {
                if (controlAsset == ControlAsset.getDefaultInstance()) {
                    return this;
                }
                if (!controlAsset.getContent().isEmpty()) {
                    this.content_ = controlAsset.content_;
                    onChanged();
                }
                if (!controlAsset.getFill().isEmpty()) {
                    this.fill_ = controlAsset.fill_;
                    onChanged();
                }
                if (controlAsset.getFontStyle() != 0) {
                    setFontStyle(controlAsset.getFontStyle());
                }
                if (controlAsset.getHeight() != 0) {
                    setHeight(controlAsset.getHeight());
                }
                if (controlAsset.getHideafter() != 0) {
                    setHideafter(controlAsset.getHideafter());
                }
                if (!controlAsset.getMargin().isEmpty()) {
                    this.margin_ = controlAsset.margin_;
                    onChanged();
                }
                if (controlAsset.getOpacity() != 0.0f) {
                    setOpacity(controlAsset.getOpacity());
                }
                if (controlAsset.getOutlined()) {
                    setOutlined(controlAsset.getOutlined());
                }
                if (!controlAsset.getPadding().isEmpty()) {
                    this.padding_ = controlAsset.padding_;
                    onChanged();
                }
                if (!controlAsset.getShadow().isEmpty()) {
                    this.shadow_ = controlAsset.shadow_;
                    onChanged();
                }
                if (!controlAsset.getStroke().isEmpty()) {
                    this.stroke_ = controlAsset.stroke_;
                    onChanged();
                }
                if (controlAsset.getStrokeWidth() != 0.0f) {
                    setStrokeWidth(controlAsset.getStrokeWidth());
                }
                if (!controlAsset.getStyle().isEmpty()) {
                    this.style_ = controlAsset.style_;
                    onChanged();
                }
                if (controlAsset.getVisible()) {
                    setVisible(controlAsset.getVisible());
                }
                if (controlAsset.getWidth() != 0) {
                    setWidth(controlAsset.getWidth());
                }
                if (!controlAsset.getX().isEmpty()) {
                    this.x_ = controlAsset.x_;
                    onChanged();
                }
                if (!controlAsset.getY().isEmpty()) {
                    this.y_ = controlAsset.y_;
                    onChanged();
                }
                mergeUnknownFields(controlAsset.unknownFields);
                onChanged();
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.content_ = "";
                this.fill_ = "";
                this.margin_ = "";
                this.padding_ = "";
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
                ControlAsset controlAsset = null;
                try {
                    try {
                        ControlAsset controlAsset2 = (ControlAsset) ControlAsset.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (controlAsset2 != null) {
                            mergeFrom(controlAsset2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        ControlAsset controlAsset3 = (ControlAsset) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            controlAsset = controlAsset3;
                            if (controlAsset != null) {
                                mergeFrom(controlAsset);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (controlAsset != null) {
                        mergeFrom(controlAsset);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ControlAsset parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ControlAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ControlAsset parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ControlAsset)) {
                return super.equals(obj);
            }
            ControlAsset controlAsset = (ControlAsset) obj;
            return getContent().equals(controlAsset.getContent()) && getFill().equals(controlAsset.getFill()) && getFontStyle() == controlAsset.getFontStyle() && getHeight() == controlAsset.getHeight() && getHideafter() == controlAsset.getHideafter() && getMargin().equals(controlAsset.getMargin()) && Float.floatToIntBits(getOpacity()) == Float.floatToIntBits(controlAsset.getOpacity()) && getOutlined() == controlAsset.getOutlined() && getPadding().equals(controlAsset.getPadding()) && getShadow().equals(controlAsset.getShadow()) && getStroke().equals(controlAsset.getStroke()) && Float.floatToIntBits(getStrokeWidth()) == Float.floatToIntBits(controlAsset.getStrokeWidth()) && getStyle().equals(controlAsset.getStyle()) && getVisible() == controlAsset.getVisible() && getWidth() == controlAsset.getWidth() && getX().equals(controlAsset.getX()) && getY().equals(controlAsset.getY()) && this.unknownFields.equals(controlAsset.unknownFields);
        }

        public static ControlAsset getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_descriptor;
        }

        public static Builder newBuilder(ControlAsset controlAsset) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(controlAsset);
        }

        public static ControlAsset parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<ControlAsset> parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getContent() {
            Object obj = this.content_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.content_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.content_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getFill() {
            Object obj = this.fill_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.fill_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getFillBytes() {
            Object obj = this.fill_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fill_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public int getFontStyle() {
            return this.fontStyle_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public int getHideafter() {
            return this.hideafter_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getMargin() {
            Object obj = this.margin_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.margin_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getMarginBytes() {
            Object obj = this.margin_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.margin_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public float getOpacity() {
            return this.opacity_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public boolean getOutlined() {
            return this.outlined_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getPadding() {
            Object obj = this.padding_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.padding_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getPaddingBytes() {
            Object obj = this.padding_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.padding_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<ControlAsset> getParserForType() {
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
            if (!getMarginBytes().isEmpty()) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.margin_);
            }
            float f10 = this.opacity_;
            if (f10 != 0.0f) {
                iComputeStringSize += CodedOutputStream.computeFloatSize(7, f10);
            }
            boolean z10 = this.outlined_;
            if (z10) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(8, z10);
            }
            if (!getPaddingBytes().isEmpty()) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(9, this.padding_);
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
            float f11 = this.strokeWidth_;
            if (f11 != 0.0f) {
                iComputeStringSize += CodedOutputStream.computeFloatSize(18, f11);
            }
            int serializedSize = iComputeStringSize + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getShadow() {
            Object obj = this.shadow_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.shadow_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getShadowBytes() {
            Object obj = this.shadow_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.shadow_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getStroke() {
            Object obj = this.stroke_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.stroke_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getStrokeBytes() {
            Object obj = this.stroke_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.stroke_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public float getStrokeWidth() {
            return this.strokeWidth_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getStyle() {
            Object obj = this.style_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.style_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
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

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public boolean getVisible() {
            return this.visible_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getX() {
            Object obj = this.x_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.x_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public ByteString getXBytes() {
            Object obj = this.x_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.x_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
        public String getY() {
            Object obj = this.y_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.y_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.ControlAssetOrBuilder
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
            int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContent().hashCode()) * 37) + 2) * 53) + getFill().hashCode()) * 37) + 3) * 53) + getFontStyle()) * 37) + 4) * 53) + getHeight()) * 37) + 5) * 53) + getHideafter()) * 37) + 6) * 53) + getMargin().hashCode()) * 37) + 7) * 53) + Float.floatToIntBits(getOpacity())) * 37) + 8) * 53) + Internal.hashBoolean(getOutlined())) * 37) + 9) * 53) + getPadding().hashCode()) * 37) + 10) * 53) + getShadow().hashCode()) * 37) + 11) * 53) + getStroke().hashCode()) * 37) + 18) * 53) + Float.floatToIntBits(getStrokeWidth())) * 37) + 13) * 53) + getStyle().hashCode()) * 37) + 14) * 53) + Internal.hashBoolean(getVisible())) * 37) + 15) * 53) + getWidth()) * 37) + 16) * 53) + getX().hashCode()) * 37) + 17) * 53) + getY().hashCode()) * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_ControlAsset_fieldAccessorTable.ensureFieldAccessorsInitialized(ControlAsset.class, Builder.class);
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
            return new ControlAsset();
        }

        private ControlAsset(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ControlAsset parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ControlAsset) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ControlAsset parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public ControlAsset getDefaultInstanceForType() {
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
            if (!getMarginBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.margin_);
            }
            float f10 = this.opacity_;
            if (f10 != 0.0f) {
                codedOutputStream.writeFloat(7, f10);
            }
            boolean z10 = this.outlined_;
            if (z10) {
                codedOutputStream.writeBool(8, z10);
            }
            if (!getPaddingBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.padding_);
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
            float f11 = this.strokeWidth_;
            if (f11 != 0.0f) {
                codedOutputStream.writeFloat(18, f11);
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static ControlAsset parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private ControlAsset() {
            this.memoizedIsInitialized = (byte) -1;
            this.content_ = "";
            this.fill_ = "";
            this.margin_ = "";
            this.padding_ = "";
            this.shadow_ = "";
            this.stroke_ = "";
            this.style_ = "";
            this.x_ = "";
            this.y_ = "";
        }

        public static ControlAsset parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        public static ControlAsset parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ControlAsset parseFrom(InputStream inputStream) throws IOException {
            return (ControlAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ControlAsset parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ControlAsset) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ControlAsset parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ControlAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ControlAsset parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ControlAsset) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ControlAsset(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                            case 50:
                                this.margin_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 61:
                                this.opacity_ = codedInputStream.readFloat();
                                continue;
                            case 64:
                                this.outlined_ = codedInputStream.readBool();
                                continue;
                            case 74:
                                this.padding_ = codedInputStream.readStringRequireUtf8();
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

    public interface ControlAssetOrBuilder extends MessageOrBuilder {
        String getContent();

        ByteString getContentBytes();

        String getFill();

        ByteString getFillBytes();

        int getFontStyle();

        int getHeight();

        int getHideafter();

        String getMargin();

        ByteString getMarginBytes();

        float getOpacity();

        boolean getOutlined();

        String getPadding();

        ByteString getPaddingBytes();

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

    public static final class CustomParamsDefaultEntryHolder {
        public static final MapEntry<String, String> defaultEntry;

        private CustomParamsDefaultEntryHolder() {
        }

        static {
            Descriptors.Descriptor descriptor = ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_CustomParamsEntry_descriptor;
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            defaultEntry = MapEntry.newDefaultInstance(descriptor, fieldType, "", fieldType, "");
        }
    }

    public static final class EventConfiguration extends GeneratedMessageV3 implements EventConfigurationOrBuilder {
        public static final int ACTIONS_FIELD_NUMBER = 3;
        public static final int CONTEXT_FIELD_NUMBER = 2;
        private static final EventConfiguration DEFAULT_INSTANCE = new EventConfiguration();
        private static final Parser<EventConfiguration> PARSER = new AbstractParser<EventConfiguration>() { // from class: io.bidmachine.protobuf.AdExtension.EventConfiguration.1
            @Override // com.explorestack.protobuf.Parser
            public EventConfiguration parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new EventConfiguration(codedInputStream, extensionRegistryLite);
            }
        };
        public static final int URL_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int actionsMemoizedSerializedSize;
        private Internal.IntList actions_;
        private volatile Object context_;
        private byte memoizedIsInitialized;
        private volatile Object url_;

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EventConfigurationOrBuilder {
            private Internal.IntList actions_;
            private int bitField0_;
            private Object context_;
            private Object url_;

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private void ensureActionsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.actions_ = GeneratedMessageV3.mutableCopy(this.actions_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_descriptor;
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public int getActions(int i10) {
                return this.actions_.getInt(i10);
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public int getActionsCount() {
                return this.actions_.size();
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public List<Integer> getActionsList() {
                return (this.bitField0_ & 1) != 0 ? Collections.unmodifiableList(this.actions_) : this.actions_;
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public String getContext() {
                Object obj = this.context_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.context_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public ByteString getContextBytes() {
                Object obj = this.context_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.context_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder, com.explorestack.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_descriptor;
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.url_ = stringUtf8;
                return stringUtf8;
            }

            @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(EventConfiguration.class, Builder.class);
            }

            private Builder() {
                this.url_ = "";
                this.context_ = "";
                this.actions_ = GeneratedMessageV3.emptyIntList();
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            public Builder addActions(int i10) {
                ensureActionsIsMutable();
                this.actions_.addInt(i10);
                onChanged();
                return this;
            }

            public Builder addAllActions(Iterable<? extends Integer> iterable) {
                ensureActionsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.actions_);
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public EventConfiguration build() {
                EventConfiguration eventConfigurationBuildPartial = buildPartial();
                if (eventConfigurationBuildPartial.isInitialized()) {
                    return eventConfigurationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventConfigurationBuildPartial);
            }

            @Override // com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public EventConfiguration buildPartial() {
                EventConfiguration eventConfiguration = new EventConfiguration(this);
                eventConfiguration.url_ = this.url_;
                eventConfiguration.context_ = this.context_;
                if ((this.bitField0_ & 1) != 0) {
                    this.actions_.makeImmutable();
                    this.bitField0_ &= -2;
                }
                eventConfiguration.actions_ = this.actions_;
                onBuilt();
                return eventConfiguration;
            }

            public Builder clearActions() {
                this.actions_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearContext() {
                this.context_ = EventConfiguration.getDefaultInstance().getContext();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearUrl() {
                this.url_ = EventConfiguration.getDefaultInstance().getUrl();
                onChanged();
                return this;
            }

            @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
            public EventConfiguration getDefaultInstanceForType() {
                return EventConfiguration.getDefaultInstance();
            }

            public Builder setActions(int i10, int i11) {
                ensureActionsIsMutable();
                this.actions_.setInt(i10, i11);
                onChanged();
                return this;
            }

            public Builder setContext(String str) {
                str.getClass();
                this.context_ = str;
                onChanged();
                return this;
            }

            public Builder setContextBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.context_ = byteString;
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

            public Builder setUrl(String str) {
                str.getClass();
                this.url_ = str;
                onChanged();
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                byteString.getClass();
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.url_ = byteString;
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
                this.url_ = "";
                this.context_ = "";
                this.actions_ = GeneratedMessageV3.emptyIntList();
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.explorestack.protobuf.GeneratedMessageV3.Builder, com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo208clone() {
                return (Builder) super.mo208clone();
            }

            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EventConfiguration) {
                    return mergeFrom((EventConfiguration) message);
                }
                super.mergeFrom(message);
                return this;
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.url_ = "";
                this.context_ = "";
                this.actions_ = GeneratedMessageV3.emptyIntList();
                maybeForceBuilderInitialization();
            }

            public Builder mergeFrom(EventConfiguration eventConfiguration) {
                if (eventConfiguration == EventConfiguration.getDefaultInstance()) {
                    return this;
                }
                if (!eventConfiguration.getUrl().isEmpty()) {
                    this.url_ = eventConfiguration.url_;
                    onChanged();
                }
                if (!eventConfiguration.getContext().isEmpty()) {
                    this.context_ = eventConfiguration.context_;
                    onChanged();
                }
                if (!eventConfiguration.actions_.isEmpty()) {
                    if (this.actions_.isEmpty()) {
                        this.actions_ = eventConfiguration.actions_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureActionsIsMutable();
                        this.actions_.addAll(eventConfiguration.actions_);
                    }
                    onChanged();
                }
                mergeUnknownFields(eventConfiguration.unknownFields);
                onChanged();
                return this;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x0023  */
            @Override // com.explorestack.protobuf.AbstractMessage.Builder, com.explorestack.protobuf.AbstractMessageLite.Builder, com.explorestack.protobuf.MessageLite.Builder, com.explorestack.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws Throwable {
                EventConfiguration eventConfiguration = null;
                try {
                    try {
                        EventConfiguration eventConfiguration2 = (EventConfiguration) EventConfiguration.PARSER.parsePartialFrom(codedInputStream, extensionRegistryLite);
                        if (eventConfiguration2 != null) {
                            mergeFrom(eventConfiguration2);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        EventConfiguration eventConfiguration3 = (EventConfiguration) e10.getUnfinishedMessage();
                        try {
                            throw e10.unwrapIOException();
                        } catch (Throwable th2) {
                            th = th2;
                            eventConfiguration = eventConfiguration3;
                            if (eventConfiguration != null) {
                                mergeFrom(eventConfiguration);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    if (eventConfiguration != null) {
                        mergeFrom(eventConfiguration);
                    }
                    throw th;
                }
            }
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EventConfiguration parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (EventConfiguration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EventConfiguration parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer);
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EventConfiguration)) {
                return super.equals(obj);
            }
            EventConfiguration eventConfiguration = (EventConfiguration) obj;
            return getUrl().equals(eventConfiguration.getUrl()) && getContext().equals(eventConfiguration.getContext()) && getActionsList().equals(eventConfiguration.getActionsList()) && this.unknownFields.equals(eventConfiguration.unknownFields);
        }

        public static EventConfiguration getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_descriptor;
        }

        public static Builder newBuilder(EventConfiguration eventConfiguration) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventConfiguration);
        }

        public static EventConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        public static Parser<EventConfiguration> parser() {
            return PARSER;
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public int getActions(int i10) {
            return this.actions_.getInt(i10);
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public int getActionsCount() {
            return this.actions_.size();
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public List<Integer> getActionsList() {
            return this.actions_;
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public String getContext() {
            Object obj = this.context_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.context_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public ByteString getContextBytes() {
            Object obj = this.context_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.context_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Parser<EventConfiguration> getParserForType() {
            return PARSER;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !getUrlBytes().isEmpty() ? GeneratedMessageV3.computeStringSize(1, this.url_) + 0 : 0;
            if (!getContextBytes().isEmpty()) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.context_);
            }
            int iComputeUInt32SizeNoTag = 0;
            for (int i11 = 0; i11 < this.actions_.size(); i11++) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(this.actions_.getInt(i11));
            }
            int iComputeInt32SizeNoTag = iComputeStringSize + iComputeUInt32SizeNoTag;
            if (!getActionsList().isEmpty()) {
                iComputeInt32SizeNoTag = iComputeInt32SizeNoTag + 1 + CodedOutputStream.computeInt32SizeNoTag(iComputeUInt32SizeNoTag);
            }
            this.actionsMemoizedSerializedSize = iComputeUInt32SizeNoTag;
            int serializedSize = iComputeInt32SizeNoTag + this.unknownFields.getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String stringUtf8 = ((ByteString) obj).toStringUtf8();
            this.url_ = stringUtf8;
            return stringUtf8;
        }

        @Override // io.bidmachine.protobuf.AdExtension.EventConfigurationOrBuilder
        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.url_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUrl().hashCode()) * 37) + 2) * 53) + getContext().hashCode();
            if (getActionsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 3) * 53) + getActionsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_EventConfiguration_fieldAccessorTable.ensureFieldAccessorsInitialized(EventConfiguration.class, Builder.class);
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
            return new EventConfiguration();
        }

        private EventConfiguration(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.actionsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EventConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EventConfiguration) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EventConfiguration parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString);
        }

        @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
        public EventConfiguration getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if (!getUrlBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.url_);
            }
            if (!getContextBytes().isEmpty()) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.context_);
            }
            if (getActionsList().size() > 0) {
                codedOutputStream.writeUInt32NoTag(26);
                codedOutputStream.writeUInt32NoTag(this.actionsMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.actions_.size(); i10++) {
                codedOutputStream.writeUInt32NoTag(this.actions_.getInt(i10));
            }
            this.unknownFields.writeTo(codedOutputStream);
        }

        public static EventConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EventConfiguration parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr);
        }

        @Override // com.explorestack.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent);
        }

        private EventConfiguration() {
            this.actionsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.url_ = "";
            this.context_ = "";
            this.actions_ = GeneratedMessageV3.emptyIntList();
        }

        public static EventConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EventConfiguration parseFrom(InputStream inputStream) throws IOException {
            return (EventConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EventConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EventConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EventConfiguration parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (EventConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private EventConfiguration(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                                if (tag == 10) {
                                    this.url_ = codedInputStream.readStringRequireUtf8();
                                } else if (tag == 18) {
                                    this.context_ = codedInputStream.readStringRequireUtf8();
                                } else if (tag == 24) {
                                    if (!(z11 & true)) {
                                        this.actions_ = GeneratedMessageV3.newIntList();
                                        z11 |= true;
                                    }
                                    this.actions_.addInt(codedInputStream.readUInt32());
                                } else if (tag != 26) {
                                    if (!parseUnknownField(codedInputStream, builderNewBuilder, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    if (!(z11 & true) && codedInputStream.getBytesUntilLimit() > 0) {
                                        this.actions_ = GeneratedMessageV3.newIntList();
                                        z11 |= true;
                                    }
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.actions_.addInt(codedInputStream.readUInt32());
                                    }
                                    codedInputStream.popLimit(iPushLimit);
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
                        this.actions_.makeImmutable();
                    }
                    this.unknownFields = builderNewBuilder.build();
                    makeExtensionsImmutable();
                    throw th2;
                }
            }
            if (z11 & true) {
                this.actions_.makeImmutable();
            }
            this.unknownFields = builderNewBuilder.build();
            makeExtensionsImmutable();
        }

        public static EventConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (EventConfiguration) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public interface EventConfigurationOrBuilder extends MessageOrBuilder {
        int getActions(int i10);

        int getActionsCount();

        List<Integer> getActionsList();

        String getContext();

        ByteString getContextBytes();

        String getUrl();

        ByteString getUrlBytes();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static AdExtension parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AdExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
    }

    public static AdExtension parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer);
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AdExtension)) {
            return super.equals(obj);
        }
        AdExtension adExtension = (AdExtension) obj;
        if (getPreload() != adExtension.getPreload() || getLoadSkipoffset() != adExtension.getLoadSkipoffset() || getViewabilityTimeThreshold() != adExtension.getViewabilityTimeThreshold() || Float.floatToIntBits(getViewabilityPixelThreshold()) != Float.floatToIntBits(adExtension.getViewabilityPixelThreshold()) || Float.floatToIntBits(getViewabilityDurationThreshold()) != Float.floatToIntBits(adExtension.getViewabilityDurationThreshold()) || !getEventList().equals(adExtension.getEventList()) || !internalGetCustomParams().equals(adExtension.internalGetCustomParams()) || getSkipoffset() != adExtension.getSkipoffset() || getCompanionSkipoffset() != adExtension.getCompanionSkipoffset() || getUseNativeClose() != adExtension.getUseNativeClose() || getR1() != adExtension.getR1() || getR2() != adExtension.getR2() || hasCountdown() != adExtension.hasCountdown()) {
            return false;
        }
        if ((hasCountdown() && !getCountdown().equals(adExtension.getCountdown())) || hasCloseButton() != adExtension.hasCloseButton()) {
            return false;
        }
        if ((hasCloseButton() && !getCloseButton().equals(adExtension.getCloseButton())) || getIgnoresSafeAreaLayoutGuide() != adExtension.getIgnoresSafeAreaLayoutGuide() || !getStoreUrl().equals(adExtension.getStoreUrl()) || hasProgress() != adExtension.hasProgress()) {
            return false;
        }
        if ((hasProgress() && !getProgress().equals(adExtension.getProgress())) || getProgressDuration() != adExtension.getProgressDuration() || getViewabilityIgnoreWindowFocus() != adExtension.getViewabilityIgnoreWindowFocus() || this.adCacheControl_ != adExtension.adCacheControl_ || getAdCacheMaxAge() != adExtension.getAdCacheMaxAge() || getR1Delay() != adExtension.getR1Delay() || getAdMarkupLoadingTimeout() != adExtension.getAdMarkupLoadingTimeout() || getUseEmbeddedBrowser() != adExtension.getUseEmbeddedBrowser() || getPreloadAd() != adExtension.getPreloadAd() || this.creativeLoadingMethod_ != adExtension.creativeLoadingMethod_ || Float.floatToIntBits(getPlaceholderTimeout()) != Float.floatToIntBits(adExtension.getPlaceholderTimeout()) || hasEventConfiguration() != adExtension.hasEventConfiguration()) {
            return false;
        }
        if ((hasEventConfiguration() && !getEventConfiguration().equals(adExtension.getEventConfiguration())) || getViewabilityIgnoreOverlap() != adExtension.getViewabilityIgnoreOverlap() || hasCreativeExtension() != adExtension.hasCreativeExtension()) {
            return false;
        }
        if ((!hasCreativeExtension() || getCreativeExtension().equals(adExtension.getCreativeExtension())) && getAdFlexibleSize() == adExtension.getAdFlexibleSize() && hasRenderingConfiguration() == adExtension.hasRenderingConfiguration()) {
            return (!hasRenderingConfiguration() || getRenderingConfiguration().equals(adExtension.getRenderingConfiguration())) && getMraidCreativeValidationRequired() == adExtension.getMraidCreativeValidationRequired() && getCreativeLoadingTimeout() == adExtension.getCreativeLoadingTimeout() && getCridMonitoringEnabled() == adExtension.getCridMonitoringEnabled() && this.unknownFields.equals(adExtension.unknownFields);
        }
        return false;
    }

    public static AdExtension getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static final Descriptors.Descriptor getDescriptor() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_descriptor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MapField<String, String> internalGetCustomParams() {
        MapField<String, String> mapField = this.customParams_;
        return mapField == null ? MapField.emptyMapField(CustomParamsDefaultEntryHolder.defaultEntry) : mapField;
    }

    public static Builder newBuilder(AdExtension adExtension) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(adExtension);
    }

    public static AdExtension parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Parser<AdExtension> parser() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public AdCacheControl getAdCacheControl() {
        AdCacheControl adCacheControlValueOf = AdCacheControl.valueOf(this.adCacheControl_);
        return adCacheControlValueOf == null ? AdCacheControl.UNRECOGNIZED : adCacheControlValueOf;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getAdCacheControlValue() {
        return this.adCacheControl_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getAdCacheMaxAge() {
        return this.adCacheMaxAge_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getAdFlexibleSize() {
        return this.adFlexibleSize_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getAdMarkupLoadingTimeout() {
        return this.adMarkupLoadingTimeout_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAsset getCloseButton() {
        ControlAsset controlAsset = this.closeButton_;
        return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getCompanionSkipoffset() {
        return this.companionSkipoffset_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAsset getCountdown() {
        ControlAsset controlAsset = this.countdown_;
        return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public CreativeExtension getCreativeExtension() {
        CreativeExtension creativeExtension = this.creativeExtension_;
        return creativeExtension == null ? CreativeExtension.getDefaultInstance() : creativeExtension;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public CreativeLoadingMethod getCreativeLoadingMethod() {
        CreativeLoadingMethod creativeLoadingMethodValueOf = CreativeLoadingMethod.valueOf(this.creativeLoadingMethod_);
        return creativeLoadingMethodValueOf == null ? CreativeLoadingMethod.UNRECOGNIZED : creativeLoadingMethodValueOf;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getCreativeLoadingMethodValue() {
        return this.creativeLoadingMethod_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getCreativeLoadingTimeout() {
        return this.creativeLoadingTimeout_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getCridMonitoringEnabled() {
        return this.cridMonitoringEnabled_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public Ad.Event getEvent(int i10) {
        return this.event_.get(i10);
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public EventConfiguration getEventConfiguration() {
        EventConfiguration eventConfiguration = this.eventConfiguration_;
        return eventConfiguration == null ? EventConfiguration.getDefaultInstance() : eventConfiguration;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getEventCount() {
        return this.event_.size();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public List<Ad.Event> getEventList() {
        return this.event_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public Ad.EventOrBuilder getEventOrBuilder(int i10) {
        return this.event_.get(i10);
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public List<? extends Ad.EventOrBuilder> getEventOrBuilderList() {
        return this.event_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getIgnoresSafeAreaLayoutGuide() {
        return this.ignoresSafeAreaLayoutGuide_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public int getLoadSkipoffset() {
        return this.loadSkipoffset_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getMraidCreativeValidationRequired() {
        return this.mraidCreativeValidationRequired_;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Parser<AdExtension> getParserForType() {
        return PARSER;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public float getPlaceholderTimeout() {
        return this.placeholderTimeout_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public boolean getPreload() {
        return this.preload_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getPreloadAd() {
        return this.preloadAd_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAsset getProgress() {
        ControlAsset controlAsset = this.progress_;
        return controlAsset == null ? ControlAsset.getDefaultInstance() : controlAsset;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getProgressDuration() {
        return this.progressDuration_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getR1() {
        return this.r1_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getR1Delay() {
        return this.r1Delay_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getR2() {
        return this.r2_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public Rendering getRenderingConfiguration() {
        Rendering rendering = this.renderingConfiguration_;
        return rendering == null ? Rendering.getDefaultInstance() : rendering;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        int i10 = this.memoizedSize;
        if (i10 != -1) {
            return i10;
        }
        boolean z10 = this.preload_;
        int iComputeBoolSize = z10 ? CodedOutputStream.computeBoolSize(2, z10) + 0 : 0;
        int i11 = this.loadSkipoffset_;
        if (i11 != 0) {
            iComputeBoolSize += CodedOutputStream.computeUInt32Size(3, i11);
        }
        int i12 = this.viewabilityTimeThreshold_;
        if (i12 != 0) {
            iComputeBoolSize += CodedOutputStream.computeUInt32Size(4, i12);
        }
        float f10 = this.viewabilityPixelThreshold_;
        if (f10 != 0.0f) {
            iComputeBoolSize += CodedOutputStream.computeFloatSize(5, f10);
        }
        float f11 = this.viewabilityDurationThreshold_;
        if (f11 != 0.0f) {
            iComputeBoolSize += CodedOutputStream.computeFloatSize(6, f11);
        }
        for (int i13 = 0; i13 < this.event_.size(); i13++) {
            iComputeBoolSize += CodedOutputStream.computeMessageSize(7, this.event_.get(i13));
        }
        for (Map.Entry<String, String> entry : internalGetCustomParams().getMap().entrySet()) {
            iComputeBoolSize += CodedOutputStream.computeMessageSize(8, CustomParamsDefaultEntryHolder.defaultEntry.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).build());
        }
        int i14 = this.skipoffset_;
        if (i14 != 0) {
            iComputeBoolSize += CodedOutputStream.computeUInt32Size(9, i14);
        }
        int i15 = this.companionSkipoffset_;
        if (i15 != 0) {
            iComputeBoolSize += CodedOutputStream.computeUInt32Size(10, i15);
        }
        boolean z11 = this.useNativeClose_;
        if (z11) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(11, z11);
        }
        boolean z12 = this.r1_;
        if (z12) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(12, z12);
        }
        boolean z13 = this.r2_;
        if (z13) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(13, z13);
        }
        if (this.countdown_ != null) {
            iComputeBoolSize += CodedOutputStream.computeMessageSize(14, getCountdown());
        }
        if (this.closeButton_ != null) {
            iComputeBoolSize += CodedOutputStream.computeMessageSize(15, getCloseButton());
        }
        boolean z14 = this.ignoresSafeAreaLayoutGuide_;
        if (z14) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(16, z14);
        }
        if (!getStoreUrlBytes().isEmpty()) {
            iComputeBoolSize += GeneratedMessageV3.computeStringSize(17, this.storeUrl_);
        }
        if (this.progress_ != null) {
            iComputeBoolSize += CodedOutputStream.computeMessageSize(18, getProgress());
        }
        int i16 = this.progressDuration_;
        if (i16 != 0) {
            iComputeBoolSize += CodedOutputStream.computeUInt32Size(19, i16);
        }
        boolean z15 = this.viewabilityIgnoreWindowFocus_;
        if (z15) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(20, z15);
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            iComputeBoolSize += CodedOutputStream.computeEnumSize(21, this.adCacheControl_);
        }
        int i17 = this.adCacheMaxAge_;
        if (i17 != 0) {
            iComputeBoolSize += CodedOutputStream.computeUInt32Size(22, i17);
        }
        int i18 = this.r1Delay_;
        if (i18 != 0) {
            iComputeBoolSize += CodedOutputStream.computeUInt32Size(23, i18);
        }
        int i19 = this.adMarkupLoadingTimeout_;
        if (i19 != 0) {
            iComputeBoolSize += CodedOutputStream.computeUInt32Size(24, i19);
        }
        boolean z16 = this.useEmbeddedBrowser_;
        if (z16) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(25, z16);
        }
        boolean z17 = this.preloadAd_;
        if (z17) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(26, z17);
        }
        if (this.creativeLoadingMethod_ != CreativeLoadingMethod.FullLoad.getNumber()) {
            iComputeBoolSize += CodedOutputStream.computeEnumSize(27, this.creativeLoadingMethod_);
        }
        float f12 = this.placeholderTimeout_;
        if (f12 != 0.0f) {
            iComputeBoolSize += CodedOutputStream.computeFloatSize(28, f12);
        }
        if (this.eventConfiguration_ != null) {
            iComputeBoolSize += CodedOutputStream.computeMessageSize(29, getEventConfiguration());
        }
        boolean z18 = this.viewabilityIgnoreOverlap_;
        if (z18) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(30, z18);
        }
        if (this.creativeExtension_ != null) {
            iComputeBoolSize += CodedOutputStream.computeMessageSize(31, getCreativeExtension());
        }
        boolean z19 = this.adFlexibleSize_;
        if (z19) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(32, z19);
        }
        if (this.renderingConfiguration_ != null) {
            iComputeBoolSize += CodedOutputStream.computeMessageSize(33, getRenderingConfiguration());
        }
        boolean z20 = this.mraidCreativeValidationRequired_;
        if (z20) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(34, z20);
        }
        int i20 = this.creativeLoadingTimeout_;
        if (i20 != 0) {
            iComputeBoolSize += CodedOutputStream.computeInt32Size(35, i20);
        }
        boolean z21 = this.cridMonitoringEnabled_;
        if (z21) {
            iComputeBoolSize += CodedOutputStream.computeBoolSize(36, z21);
        }
        int serializedSize = iComputeBoolSize + this.unknownFields.getSerializedSize();
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getSkipoffset() {
        return this.skipoffset_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public String getStoreUrl() {
        Object obj = this.storeUrl_;
        if (obj instanceof String) {
            return (String) obj;
        }
        String stringUtf8 = ((ByteString) obj).toStringUtf8();
        this.storeUrl_ = stringUtf8;
        return stringUtf8;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ByteString getStoreUrlBytes() {
        Object obj = this.storeUrl_;
        if (!(obj instanceof String)) {
            return (ByteString) obj;
        }
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
        this.storeUrl_ = byteStringCopyFromUtf8;
        return byteStringCopyFromUtf8;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.MessageOrBuilder
    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getUseEmbeddedBrowser() {
        return this.useEmbeddedBrowser_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getUseNativeClose() {
        return this.useNativeClose_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public float getViewabilityDurationThreshold() {
        return this.viewabilityDurationThreshold_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getViewabilityIgnoreOverlap() {
        return this.viewabilityIgnoreOverlap_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean getViewabilityIgnoreWindowFocus() {
        return this.viewabilityIgnoreWindowFocus_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public float getViewabilityPixelThreshold() {
        return this.viewabilityPixelThreshold_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getViewabilityTimeThreshold() {
        return this.viewabilityTimeThreshold_;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasCloseButton() {
        return this.closeButton_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasCountdown() {
        return this.countdown_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public boolean hasCreativeExtension() {
        return this.creativeExtension_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasEventConfiguration() {
        return this.eventConfiguration_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasProgress() {
        return this.progress_ != null;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean hasRenderingConfiguration() {
        return this.renderingConfiguration_ != null;
    }

    @Override // com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.Message
    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 2) * 53) + Internal.hashBoolean(getPreload())) * 37) + 3) * 53) + getLoadSkipoffset()) * 37) + 4) * 53) + getViewabilityTimeThreshold()) * 37) + 5) * 53) + Float.floatToIntBits(getViewabilityPixelThreshold())) * 37) + 6) * 53) + Float.floatToIntBits(getViewabilityDurationThreshold());
        if (getEventCount() > 0) {
            iHashCode = (((iHashCode * 37) + 7) * 53) + getEventList().hashCode();
        }
        if (!internalGetCustomParams().getMap().isEmpty()) {
            iHashCode = (((iHashCode * 37) + 8) * 53) + internalGetCustomParams().hashCode();
        }
        int skipoffset = (((((((((((((((((((iHashCode * 37) + 9) * 53) + getSkipoffset()) * 37) + 10) * 53) + getCompanionSkipoffset()) * 37) + 11) * 53) + Internal.hashBoolean(getUseNativeClose())) * 37) + 12) * 53) + Internal.hashBoolean(getR1())) * 37) + 13) * 53) + Internal.hashBoolean(getR2());
        if (hasCountdown()) {
            skipoffset = (((skipoffset * 37) + 14) * 53) + getCountdown().hashCode();
        }
        if (hasCloseButton()) {
            skipoffset = (((skipoffset * 37) + 15) * 53) + getCloseButton().hashCode();
        }
        int iHashBoolean = (((((((skipoffset * 37) + 16) * 53) + Internal.hashBoolean(getIgnoresSafeAreaLayoutGuide())) * 37) + 17) * 53) + getStoreUrl().hashCode();
        if (hasProgress()) {
            iHashBoolean = (((iHashBoolean * 37) + 18) * 53) + getProgress().hashCode();
        }
        int progressDuration = (((((((((((((((((((((((((((((((((((((((iHashBoolean * 37) + 19) * 53) + getProgressDuration()) * 37) + 20) * 53) + Internal.hashBoolean(getViewabilityIgnoreWindowFocus())) * 37) + 21) * 53) + this.adCacheControl_) * 37) + 22) * 53) + getAdCacheMaxAge()) * 37) + 23) * 53) + getR1Delay()) * 37) + 24) * 53) + getAdMarkupLoadingTimeout()) * 37) + 25) * 53) + Internal.hashBoolean(getUseEmbeddedBrowser())) * 37) + 26) * 53) + Internal.hashBoolean(getPreloadAd())) * 37) + 27) * 53) + this.creativeLoadingMethod_) * 37) + 28) * 53) + Float.floatToIntBits(getPlaceholderTimeout());
        if (hasEventConfiguration()) {
            progressDuration = (((progressDuration * 37) + 29) * 53) + getEventConfiguration().hashCode();
        }
        int iHashBoolean2 = (((progressDuration * 37) + 30) * 53) + Internal.hashBoolean(getViewabilityIgnoreOverlap());
        if (hasCreativeExtension()) {
            iHashBoolean2 = (((iHashBoolean2 * 37) + 31) * 53) + getCreativeExtension().hashCode();
        }
        int iHashBoolean3 = (((iHashBoolean2 * 37) + 32) * 53) + Internal.hashBoolean(getAdFlexibleSize());
        if (hasRenderingConfiguration()) {
            iHashBoolean3 = (((iHashBoolean3 * 37) + 33) * 53) + getRenderingConfiguration().hashCode();
        }
        int iHashBoolean4 = (((((((((((((iHashBoolean3 * 37) + 34) * 53) + Internal.hashBoolean(getMraidCreativeValidationRequired())) * 37) + 35) * 53) + getCreativeLoadingTimeout()) * 37) + 36) * 53) + Internal.hashBoolean(getCridMonitoringEnabled())) * 29) + this.unknownFields.hashCode();
        this.memoizedHashCode = iHashBoolean4;
        return iHashBoolean4;
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ExtensionsProto.internal_static_bidmachine_protobuf_AdExtension_fieldAccessorTable.ensureFieldAccessorsInitialized(AdExtension.class, Builder.class);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public MapField internalGetMapField(int i10) {
        if (i10 == 8) {
            return internalGetCustomParams();
        }
        throw new RuntimeException("Invalid map field number: " + i10);
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
        return new AdExtension();
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3, com.explorestack.protobuf.AbstractMessage, com.explorestack.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z10 = this.preload_;
        if (z10) {
            codedOutputStream.writeBool(2, z10);
        }
        int i10 = this.loadSkipoffset_;
        if (i10 != 0) {
            codedOutputStream.writeUInt32(3, i10);
        }
        int i11 = this.viewabilityTimeThreshold_;
        if (i11 != 0) {
            codedOutputStream.writeUInt32(4, i11);
        }
        float f10 = this.viewabilityPixelThreshold_;
        if (f10 != 0.0f) {
            codedOutputStream.writeFloat(5, f10);
        }
        float f11 = this.viewabilityDurationThreshold_;
        if (f11 != 0.0f) {
            codedOutputStream.writeFloat(6, f11);
        }
        for (int i12 = 0; i12 < this.event_.size(); i12++) {
            codedOutputStream.writeMessage(7, this.event_.get(i12));
        }
        GeneratedMessageV3.serializeStringMapTo(codedOutputStream, internalGetCustomParams(), CustomParamsDefaultEntryHolder.defaultEntry, 8);
        int i13 = this.skipoffset_;
        if (i13 != 0) {
            codedOutputStream.writeUInt32(9, i13);
        }
        int i14 = this.companionSkipoffset_;
        if (i14 != 0) {
            codedOutputStream.writeUInt32(10, i14);
        }
        boolean z11 = this.useNativeClose_;
        if (z11) {
            codedOutputStream.writeBool(11, z11);
        }
        boolean z12 = this.r1_;
        if (z12) {
            codedOutputStream.writeBool(12, z12);
        }
        boolean z13 = this.r2_;
        if (z13) {
            codedOutputStream.writeBool(13, z13);
        }
        if (this.countdown_ != null) {
            codedOutputStream.writeMessage(14, getCountdown());
        }
        if (this.closeButton_ != null) {
            codedOutputStream.writeMessage(15, getCloseButton());
        }
        boolean z14 = this.ignoresSafeAreaLayoutGuide_;
        if (z14) {
            codedOutputStream.writeBool(16, z14);
        }
        if (!getStoreUrlBytes().isEmpty()) {
            GeneratedMessageV3.writeString(codedOutputStream, 17, this.storeUrl_);
        }
        if (this.progress_ != null) {
            codedOutputStream.writeMessage(18, getProgress());
        }
        int i15 = this.progressDuration_;
        if (i15 != 0) {
            codedOutputStream.writeUInt32(19, i15);
        }
        boolean z15 = this.viewabilityIgnoreWindowFocus_;
        if (z15) {
            codedOutputStream.writeBool(20, z15);
        }
        if (this.adCacheControl_ != AdCacheControl.AD_CACHE_CONTROL_DISABLED.getNumber()) {
            codedOutputStream.writeEnum(21, this.adCacheControl_);
        }
        int i16 = this.adCacheMaxAge_;
        if (i16 != 0) {
            codedOutputStream.writeUInt32(22, i16);
        }
        int i17 = this.r1Delay_;
        if (i17 != 0) {
            codedOutputStream.writeUInt32(23, i17);
        }
        int i18 = this.adMarkupLoadingTimeout_;
        if (i18 != 0) {
            codedOutputStream.writeUInt32(24, i18);
        }
        boolean z16 = this.useEmbeddedBrowser_;
        if (z16) {
            codedOutputStream.writeBool(25, z16);
        }
        boolean z17 = this.preloadAd_;
        if (z17) {
            codedOutputStream.writeBool(26, z17);
        }
        if (this.creativeLoadingMethod_ != CreativeLoadingMethod.FullLoad.getNumber()) {
            codedOutputStream.writeEnum(27, this.creativeLoadingMethod_);
        }
        float f12 = this.placeholderTimeout_;
        if (f12 != 0.0f) {
            codedOutputStream.writeFloat(28, f12);
        }
        if (this.eventConfiguration_ != null) {
            codedOutputStream.writeMessage(29, getEventConfiguration());
        }
        boolean z18 = this.viewabilityIgnoreOverlap_;
        if (z18) {
            codedOutputStream.writeBool(30, z18);
        }
        if (this.creativeExtension_ != null) {
            codedOutputStream.writeMessage(31, getCreativeExtension());
        }
        boolean z19 = this.adFlexibleSize_;
        if (z19) {
            codedOutputStream.writeBool(32, z19);
        }
        if (this.renderingConfiguration_ != null) {
            codedOutputStream.writeMessage(33, getRenderingConfiguration());
        }
        boolean z20 = this.mraidCreativeValidationRequired_;
        if (z20) {
            codedOutputStream.writeBool(34, z20);
        }
        int i19 = this.creativeLoadingTimeout_;
        if (i19 != 0) {
            codedOutputStream.writeInt32(35, i19);
        }
        boolean z21 = this.cridMonitoringEnabled_;
        if (z21) {
            codedOutputStream.writeBool(36, z21);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    private AdExtension(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
        this.memoizedIsInitialized = (byte) -1;
    }

    public static AdExtension parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdExtension) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    public static AdExtension parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString);
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public boolean containsCustomParams(String str) {
        str.getClass();
        return internalGetCustomParams().getMap().containsKey(str);
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAssetOrBuilder getCloseButtonOrBuilder() {
        return getCloseButton();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAssetOrBuilder getCountdownOrBuilder() {
        return getCountdown();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public CreativeExtensionOrBuilder getCreativeExtensionOrBuilder() {
        return getCreativeExtension();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    @Deprecated
    public Map<String, String> getCustomParams() {
        return getCustomParamsMap();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public int getCustomParamsCount() {
        return internalGetCustomParams().getMap().size();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public Map<String, String> getCustomParamsMap() {
        return internalGetCustomParams().getMap();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public String getCustomParamsOrDefault(String str, String str2) {
        str.getClass();
        Map<String, String> map = internalGetCustomParams().getMap();
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return str2;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public String getCustomParamsOrThrow(String str) {
        str.getClass();
        Map<String, String> map = internalGetCustomParams().getMap();
        if (map.containsKey(str)) {
            return map.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.explorestack.protobuf.MessageLiteOrBuilder, com.explorestack.protobuf.MessageOrBuilder
    public AdExtension getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public EventConfigurationOrBuilder getEventConfigurationOrBuilder() {
        return getEventConfiguration();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public ControlAssetOrBuilder getProgressOrBuilder() {
        return getProgress();
    }

    @Override // io.bidmachine.protobuf.AdExtensionOrBuilder
    public RenderingOrBuilder getRenderingConfigurationOrBuilder() {
        return getRenderingConfiguration();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
    }

    public static AdExtension parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(byteString, extensionRegistryLite);
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public Builder newBuilderForType() {
        return newBuilder();
    }

    private AdExtension() {
        this.memoizedIsInitialized = (byte) -1;
        this.event_ = Collections.emptyList();
        this.storeUrl_ = "";
        this.adCacheControl_ = 0;
        this.creativeLoadingMethod_ = 0;
    }

    public static AdExtension parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr);
    }

    @Override // com.explorestack.protobuf.GeneratedMessageV3
    public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return new Builder(builderParent);
    }

    public static AdExtension parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return PARSER.parseFrom(bArr, extensionRegistryLite);
    }

    public static AdExtension parseFrom(InputStream inputStream) throws IOException {
        return (AdExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
    }

    public static AdExtension parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdExtension) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private AdExtension(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
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
                        switch (tag) {
                            case 0:
                                break;
                            case 16:
                                this.preload_ = codedInputStream.readBool();
                                continue;
                            case 24:
                                this.loadSkipoffset_ = codedInputStream.readUInt32();
                                continue;
                            case 32:
                                this.viewabilityTimeThreshold_ = codedInputStream.readUInt32();
                                continue;
                            case 45:
                                this.viewabilityPixelThreshold_ = codedInputStream.readFloat();
                                continue;
                            case 53:
                                this.viewabilityDurationThreshold_ = codedInputStream.readFloat();
                                continue;
                            case 58:
                                int i11 = (i10 == true ? 1 : 0) & 1;
                                i10 = i10;
                                if (i11 == 0) {
                                    this.event_ = new ArrayList();
                                    i10 = (i10 == true ? 1 : 0) | 1;
                                }
                                this.event_.add((Ad.Event) codedInputStream.readMessage(Ad.Event.parser(), extensionRegistryLite));
                                continue;
                            case 66:
                                int i12 = (i10 == true ? 1 : 0) & 2;
                                i10 = i10;
                                if (i12 == 0) {
                                    this.customParams_ = MapField.newMapField(CustomParamsDefaultEntryHolder.defaultEntry);
                                    i10 = (i10 == true ? 1 : 0) | 2;
                                }
                                MapEntry mapEntry = (MapEntry) codedInputStream.readMessage(CustomParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistryLite);
                                this.customParams_.getMutableMap().put(mapEntry.getKey(), mapEntry.getValue());
                                continue;
                            case 72:
                                this.skipoffset_ = codedInputStream.readUInt32();
                                continue;
                            case 80:
                                this.companionSkipoffset_ = codedInputStream.readUInt32();
                                continue;
                            case 88:
                                this.useNativeClose_ = codedInputStream.readBool();
                                continue;
                            case 96:
                                this.r1_ = codedInputStream.readBool();
                                continue;
                            case 104:
                                this.r2_ = codedInputStream.readBool();
                                continue;
                            case 114:
                                ControlAsset controlAsset = this.countdown_;
                                ControlAsset.Builder builder = controlAsset != null ? controlAsset.toBuilder() : null;
                                ControlAsset controlAsset2 = (ControlAsset) codedInputStream.readMessage(ControlAsset.parser(), extensionRegistryLite);
                                this.countdown_ = controlAsset2;
                                if (builder != null) {
                                    builder.mergeFrom(controlAsset2);
                                    this.countdown_ = builder.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 122:
                                ControlAsset controlAsset3 = this.closeButton_;
                                ControlAsset.Builder builder2 = controlAsset3 != null ? controlAsset3.toBuilder() : null;
                                ControlAsset controlAsset4 = (ControlAsset) codedInputStream.readMessage(ControlAsset.parser(), extensionRegistryLite);
                                this.closeButton_ = controlAsset4;
                                if (builder2 != null) {
                                    builder2.mergeFrom(controlAsset4);
                                    this.closeButton_ = builder2.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 128:
                                this.ignoresSafeAreaLayoutGuide_ = codedInputStream.readBool();
                                continue;
                            case 138:
                                this.storeUrl_ = codedInputStream.readStringRequireUtf8();
                                continue;
                            case 146:
                                ControlAsset controlAsset5 = this.progress_;
                                ControlAsset.Builder builder3 = controlAsset5 != null ? controlAsset5.toBuilder() : null;
                                ControlAsset controlAsset6 = (ControlAsset) codedInputStream.readMessage(ControlAsset.parser(), extensionRegistryLite);
                                this.progress_ = controlAsset6;
                                if (builder3 != null) {
                                    builder3.mergeFrom(controlAsset6);
                                    this.progress_ = builder3.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 152:
                                this.progressDuration_ = codedInputStream.readUInt32();
                                continue;
                            case 160:
                                this.viewabilityIgnoreWindowFocus_ = codedInputStream.readBool();
                                continue;
                            case 168:
                                this.adCacheControl_ = codedInputStream.readEnum();
                                continue;
                            case 176:
                                this.adCacheMaxAge_ = codedInputStream.readUInt32();
                                continue;
                            case 184:
                                this.r1Delay_ = codedInputStream.readUInt32();
                                continue;
                            case 192:
                                this.adMarkupLoadingTimeout_ = codedInputStream.readUInt32();
                                continue;
                            case 200:
                                this.useEmbeddedBrowser_ = codedInputStream.readBool();
                                continue;
                            case 208:
                                this.preloadAd_ = codedInputStream.readBool();
                                continue;
                            case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                                this.creativeLoadingMethod_ = codedInputStream.readEnum();
                                continue;
                            case 229:
                                this.placeholderTimeout_ = codedInputStream.readFloat();
                                continue;
                            case 234:
                                EventConfiguration eventConfiguration = this.eventConfiguration_;
                                EventConfiguration.Builder builder4 = eventConfiguration != null ? eventConfiguration.toBuilder() : null;
                                EventConfiguration eventConfiguration2 = (EventConfiguration) codedInputStream.readMessage(EventConfiguration.parser(), extensionRegistryLite);
                                this.eventConfiguration_ = eventConfiguration2;
                                if (builder4 != null) {
                                    builder4.mergeFrom(eventConfiguration2);
                                    this.eventConfiguration_ = builder4.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 240:
                                this.viewabilityIgnoreOverlap_ = codedInputStream.readBool();
                                continue;
                            case 250:
                                CreativeExtension creativeExtension = this.creativeExtension_;
                                CreativeExtension.Builder builder5 = creativeExtension != null ? creativeExtension.toBuilder() : null;
                                CreativeExtension creativeExtension2 = (CreativeExtension) codedInputStream.readMessage(CreativeExtension.parser(), extensionRegistryLite);
                                this.creativeExtension_ = creativeExtension2;
                                if (builder5 != null) {
                                    builder5.mergeFrom(creativeExtension2);
                                    this.creativeExtension_ = builder5.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 256:
                                this.adFlexibleSize_ = codedInputStream.readBool();
                                continue;
                            case 266:
                                Rendering rendering = this.renderingConfiguration_;
                                Rendering.Builder builder6 = rendering != null ? rendering.toBuilder() : null;
                                Rendering rendering2 = (Rendering) codedInputStream.readMessage(Rendering.parser(), extensionRegistryLite);
                                this.renderingConfiguration_ = rendering2;
                                if (builder6 != null) {
                                    builder6.mergeFrom(rendering2);
                                    this.renderingConfiguration_ = builder6.buildPartial();
                                } else {
                                    continue;
                                }
                                break;
                            case 272:
                                this.mraidCreativeValidationRequired_ = codedInputStream.readBool();
                                continue;
                            case 280:
                                this.creativeLoadingTimeout_ = codedInputStream.readInt32();
                                continue;
                            case 288:
                                this.cridMonitoringEnabled_ = codedInputStream.readBool();
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
                if (((i10 == true ? 1 : 0) & 1) != 0) {
                    this.event_ = Collections.unmodifiableList(this.event_);
                }
                this.unknownFields = builderNewBuilder.build();
                makeExtensionsImmutable();
                throw th2;
            }
        }
        if (((i10 == true ? 1 : 0) & 1) != 0) {
            this.event_ = Collections.unmodifiableList(this.event_);
        }
        this.unknownFields = builderNewBuilder.build();
        makeExtensionsImmutable();
    }

    public static AdExtension parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (AdExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
    }

    public static AdExtension parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (AdExtension) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
    }
}
