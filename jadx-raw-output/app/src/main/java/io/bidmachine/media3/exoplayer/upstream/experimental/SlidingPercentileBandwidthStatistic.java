package io.bidmachine.media3.exoplayer.upstream.experimental;

import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.util.ArrayDeque;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public class SlidingPercentileBandwidthStatistic implements BandwidthStatistic {
    public static final int DEFAULT_MAX_SAMPLES_COUNT = 10;
    public static final double DEFAULT_PERCENTILE = 0.5d;
    private long bitrateEstimate;
    private final int maxSampleCount;
    private final double percentile;
    private final ArrayDeque<a> samples;
    private final TreeSet<a> sortedSamples;
    private double weightSum;

    public static class a implements Comparable<a> {
        private final long bitrate;
        private final double weight;

        @Override // java.lang.Comparable
        public int compareTo(a aVar) {
            return Util.compareLong(this.bitrate, aVar.bitrate);
        }

        public a(long j10, double d10) {
            this.bitrate = j10;
            this.weight = d10;
        }
    }

    public SlidingPercentileBandwidthStatistic() {
        this(10, 0.5d);
    }

    public SlidingPercentileBandwidthStatistic(int i10, double d10) {
        Assertions.checkArgument(d10 >= 0.0d && d10 <= 1.0d);
        this.maxSampleCount = i10;
        this.percentile = d10;
        this.samples = new ArrayDeque<>();
        this.sortedSamples = new TreeSet<>();
        this.bitrateEstimate = Long.MIN_VALUE;
    }

    private long calculateBitrateEstimate() {
        if (this.samples.isEmpty()) {
            return Long.MIN_VALUE;
        }
        double d10 = this.weightSum * this.percentile;
        double d11 = 0.0d;
        long j10 = 0;
        double d12 = 0.0d;
        for (a aVar : this.sortedSamples) {
            double d13 = d11 + (aVar.weight / 2.0d);
            if (d13 >= d10) {
                return j10 == 0 ? aVar.bitrate : j10 + ((long) (((aVar.bitrate - j10) * (d10 - d12)) / (d13 - d12)));
            }
            j10 = aVar.bitrate;
            d11 = (aVar.weight / 2.0d) + d13;
            d12 = d13;
        }
        return j10;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void addSample(long j10, long j11) {
        while (this.samples.size() >= this.maxSampleCount) {
            a aVarRemove = this.samples.remove();
            this.sortedSamples.remove(aVarRemove);
            this.weightSum -= aVarRemove.weight;
        }
        double dSqrt = Math.sqrt(j10);
        a aVar = new a((j10 * 8000000) / j11, dSqrt);
        this.samples.add(aVar);
        this.sortedSamples.add(aVar);
        this.weightSum += dSqrt;
        this.bitrateEstimate = calculateBitrateEstimate();
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public long getBandwidthEstimate() {
        return this.bitrateEstimate;
    }

    @Override // io.bidmachine.media3.exoplayer.upstream.experimental.BandwidthStatistic
    public void reset() {
        this.samples.clear();
        this.sortedSamples.clear();
        this.weightSum = 0.0d;
        this.bitrateEstimate = Long.MIN_VALUE;
    }
}
