package io.bidmachine.rendering.measurer;

import android.view.View;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class CompositeVideoMeasurer extends BaseCompositeMeasurer<VideoMeasurer, View> implements VideoMeasurer {
    public CompositeVideoMeasurer(@NonNull List<VideoMeasurer> list) {
        super(list);
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaCompleted() {
        Iterator it = this.measurerList.iterator();
        while (it.hasNext()) {
            ((VideoMeasurer) it.next()).onMediaCompleted();
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaFirstQuartile() {
        Iterator it = this.measurerList.iterator();
        while (it.hasNext()) {
            ((VideoMeasurer) it.next()).onMediaFirstQuartile();
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaMidpoint() {
        Iterator it = this.measurerList.iterator();
        while (it.hasNext()) {
            ((VideoMeasurer) it.next()).onMediaMidpoint();
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaPaused() {
        Iterator it = this.measurerList.iterator();
        while (it.hasNext()) {
            ((VideoMeasurer) it.next()).onMediaPaused();
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaResumed() {
        Iterator it = this.measurerList.iterator();
        while (it.hasNext()) {
            ((VideoMeasurer) it.next()).onMediaResumed();
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaSkipped() {
        Iterator it = this.measurerList.iterator();
        while (it.hasNext()) {
            ((VideoMeasurer) it.next()).onMediaSkipped();
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaStarted(float f10, float f11) {
        Iterator it = this.measurerList.iterator();
        while (it.hasNext()) {
            ((VideoMeasurer) it.next()).onMediaStarted(f10, f11);
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaThirdQuartile() {
        Iterator it = this.measurerList.iterator();
        while (it.hasNext()) {
            ((VideoMeasurer) it.next()).onMediaThirdQuartile();
        }
    }

    @Override // io.bidmachine.rendering.measurer.VideoMeasurer
    public void onMediaVolumeChanged(float f10) {
        Iterator it = this.measurerList.iterator();
        while (it.hasNext()) {
            ((VideoMeasurer) it.next()).onMediaVolumeChanged(f10);
        }
    }
}
