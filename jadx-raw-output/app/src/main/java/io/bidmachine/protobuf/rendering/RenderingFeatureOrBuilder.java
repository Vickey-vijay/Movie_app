package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.MessageOrBuilder;

/* JADX INFO: loaded from: classes2.dex */
public interface RenderingFeatureOrBuilder extends MessageOrBuilder {
    RenderingFeature.BrokenCreativeDetector getBrokenCreativeDetector();

    RenderingFeature.BrokenCreativeDetectorOrBuilder getBrokenCreativeDetectorOrBuilder();

    RenderingFeature.FeatureCase getFeatureCase();

    boolean hasBrokenCreativeDetector();
}
