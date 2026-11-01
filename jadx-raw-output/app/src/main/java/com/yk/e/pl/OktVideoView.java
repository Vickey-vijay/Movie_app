package com.yk.e.pl;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import xyz.doikki.videoplayer.player.VideoView;

/* JADX INFO: loaded from: classes2.dex */
public class OktVideoView extends VideoView {
    public OktVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OktVideoView(@NonNull Context context) {
        super(context);
    }

    public void play4PreLoad() {
        P p10 = this.mMediaPlayer;
        if (p10 != 0) {
            p10.start();
        }
    }
}
