package io.bidmachine.protobuf.analytics;

import com.explorestack.protobuf.MessageOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface SDKAnalyticPayloadOrBuilder extends MessageOrBuilder {
    SDKAnalyticPayload.Metric getMetrics(int i10);

    int getMetricsCount();

    List<SDKAnalyticPayload.Metric> getMetricsList();

    SDKAnalyticPayload.MetricOrBuilder getMetricsOrBuilder(int i10);

    List<? extends SDKAnalyticPayload.MetricOrBuilder> getMetricsOrBuilderList();
}
