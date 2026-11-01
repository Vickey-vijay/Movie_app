package com.yandex.div.histogram;

import jj.a;

/* JADX INFO: compiled from: HistogramRecordConfiguration.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface HistogramRecordConfiguration {
    a<RenderConfiguration> getRenderConfiguration();

    boolean isColdRecordingEnabled();

    boolean isCoolRecordingEnabled();

    boolean isSizeRecordingEnabled();

    boolean isWarmRecordingEnabled();
}
