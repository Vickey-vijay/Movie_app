package com.yandex.div.core;

import ck.i;
import com.yandex.div.core.DivRequestExecutor;
import com.yandex.div.core.dagger.ExternalOptional;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.HistogramConfiguration;
import com.yandex.div.histogram.HistogramRecordConfiguration;
import com.yandex.div.histogram.HistogramRecorder;
import com.yandex.div.storage.DivStorageComponent;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jj.a;

/* JADX INFO: compiled from: DivKitConfiguration.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivKitConfiguration {
    private final a<DivRequestExecutor> divRequestExecutor;
    private final a<DivStorageComponent> divStorageComponent;
    private final ExecutorService executorService;
    private final a<HistogramConfiguration> histogramConfiguration;
    private final a<ld.a> sendBeaconConfiguration;

    /* JADX INFO: compiled from: DivKitConfiguration.kt */
    public static final class Builder {
        private a<DivStorageComponent> divStorageComponent;
        private ExecutorService executorService;
        private a<ld.a> sendBeaconConfiguration;
        private a<HistogramConfiguration> histogramConfiguration = new a() { // from class: od.c
            @Override // jj.a
            public final Object get() {
                return HistogramConfiguration.DEFAULT;
            }
        };
        private a<DivRequestExecutor> divRequestExecutor = new a() { // from class: od.d
            @Override // jj.a
            public final Object get() {
                return DivRequestExecutor.STUB;
            }
        };

        public final DivKitConfiguration build() {
            a<ld.a> aVar = this.sendBeaconConfiguration;
            ExecutorService executorServiceNewSingleThreadExecutor = this.executorService;
            if (executorServiceNewSingleThreadExecutor == null) {
                executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            }
            return new DivKitConfiguration(aVar, executorServiceNewSingleThreadExecutor, this.histogramConfiguration, this.divStorageComponent, this.divRequestExecutor, null);
        }
    }

    private DivKitConfiguration(a<ld.a> aVar, ExecutorService executorService, a<HistogramConfiguration> aVar2, a<DivStorageComponent> aVar3, a<DivRequestExecutor> aVar4) {
        this.sendBeaconConfiguration = aVar;
        this.executorService = executorService;
        this.histogramConfiguration = aVar2;
        this.divStorageComponent = aVar3;
        this.divRequestExecutor = aVar4;
    }

    public /* synthetic */ DivKitConfiguration(a aVar, ExecutorService executorService, a aVar2, a aVar3, a aVar4, i iVar) {
        this(aVar, executorService, aVar2, aVar3, aVar4);
    }

    public final CpuUsageHistogramReporter cpuUsageHistogramReporter() {
        return this.histogramConfiguration.get().getCpuUsageHistogramReporter().get();
    }

    public final DivRequestExecutor divRequestExecutor() {
        return this.divRequestExecutor.get();
    }

    public final ExecutorService executorService() {
        return this.executorService;
    }

    public final ExternalOptional<DivStorageComponent> externalDivStorageComponent() {
        ExternalOptional.Companion companion = ExternalOptional.Companion;
        a<DivStorageComponent> aVar = this.divStorageComponent;
        return companion.ofNullable(aVar != null ? aVar.get() : null);
    }

    public final HistogramConfiguration histogramConfiguration() {
        return this.histogramConfiguration.get();
    }

    public final HistogramRecordConfiguration histogramRecordConfiguration() {
        return this.histogramConfiguration.get();
    }

    public final HistogramRecorder histogramRecorder() {
        return new HistogramRecorder(this.histogramConfiguration.get().getHistogramBridge().get());
    }

    public final ld.a sendBeaconConfiguration() {
        a<ld.a> aVar = this.sendBeaconConfiguration;
        if (aVar != null) {
            return aVar.get();
        }
        return null;
    }
}
