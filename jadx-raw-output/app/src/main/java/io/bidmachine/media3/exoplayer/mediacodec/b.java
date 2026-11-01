package io.bidmachine.media3.exoplayer.mediacodec;

import android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.Util;
import java.util.List;

/* JADX INFO: compiled from: MediaCodecPerformancePointCoverageProvider.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {
    public static final int COVERAGE_RESULT_NO = 1;
    public static final int COVERAGE_RESULT_NO_PERFORMANCE_POINTS_UNSUPPORTED = 0;
    public static final int COVERAGE_RESULT_YES = 2;
    private static Boolean shouldIgnorePerformancePoints;

    /* JADX INFO: compiled from: MediaCodecPerformancePointCoverageProvider.java */
    @RequiresApi(29)
    public static final class a {
        private a() {
        }

        private static int evaluatePerformancePointCoverage(List<MediaCodecInfo$VideoCapabilities$PerformancePoint> list, MediaCodecInfo$VideoCapabilities$PerformancePoint mediaCodecInfo$VideoCapabilities$PerformancePoint) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                if (list.get(i10).covers(mediaCodecInfo$VideoCapabilities$PerformancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean shouldIgnorePerformancePoints() {
            List supportedPerformancePoints;
            if (Util.SDK_INT >= 35) {
                return false;
            }
            try {
                Format formatBuild = new Format.Builder().setSampleMimeType("video/avc").build();
                if (formatBuild.sampleMimeType != null) {
                    List<MediaCodecInfo> decoderInfosSoftMatch = MediaCodecUtil.getDecoderInfosSoftMatch(MediaCodecSelector.DEFAULT, formatBuild, false, false);
                    for (int i10 = 0; i10 < decoderInfosSoftMatch.size(); i10++) {
                        if (decoderInfosSoftMatch.get(i10).capabilities != null && decoderInfosSoftMatch.get(i10).capabilities.getVideoCapabilities() != null && (supportedPerformancePoints = decoderInfosSoftMatch.get(i10).capabilities.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            return evaluatePerformancePointCoverage(supportedPerformancePoints, new MediaCodecInfo$VideoCapabilities$PerformancePoint(1280, 720, 60)) == 1;
                        }
                    }
                }
            } catch (MediaCodecUtil.DecoderQueryException unused) {
            }
            return true;
        }

        @DoNotInline
        public static int areResolutionAndFrameRateCovered(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
            List supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            int iEvaluatePerformancePointCoverage = evaluatePerformancePointCoverage(supportedPerformancePoints, new MediaCodecInfo$VideoCapabilities$PerformancePoint(i10, i11, (int) d10));
            if (iEvaluatePerformancePointCoverage == 1 && b.shouldIgnorePerformancePoints == null) {
                Boolean unused = b.shouldIgnorePerformancePoints = Boolean.valueOf(shouldIgnorePerformancePoints());
                if (b.shouldIgnorePerformancePoints.booleanValue()) {
                    return 0;
                }
            }
            return iEvaluatePerformancePointCoverage;
        }
    }

    private b() {
    }

    public static int areResolutionAndFrameRateCovered(android.media.MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (Util.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = shouldIgnorePerformancePoints;
        if (bool == null || !bool.booleanValue()) {
            return a.areResolutionAndFrameRateCovered(videoCapabilities, i10, i11, d10);
        }
        return 0;
    }
}
