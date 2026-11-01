package com.bytedance.sdk.openadsdk.core.ryl;

import android.view.View;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.media.InteractionType;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.adsession.media.PlayerState;
import com.iab.omid.library.bytedance2.adsession.media.Position;
import com.iab.omid.library.bytedance2.adsession.media.VastProperties;

/* JADX INFO: loaded from: classes11.dex */
public final class bly extends ra {

    @NonNull
    private final MediaEvents fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private boolean f12991le;

    @Override // com.bytedance.sdk.openadsdk.core.ryl.ra
    public final void ouw(boolean z10, float f10) {
        if (z10) {
            this.yu = VastProperties.createVastPropertiesForSkippableMedia(f10, true, Position.STANDALONE);
        } else {
            this.yu = VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE);
        }
        ouw(2);
    }

    public bly(@NonNull AdSession adSession, @NonNull AdEvents adEvents, @NonNull View view, @NonNull MediaEvents mediaEvents) {
        super(adSession, adEvents, view);
        this.fkw = mediaEvents;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ryl.ra
    public final void vt(int i10) {
        float f10;
        if (!ouw()) {
        }
        switch (i10) {
            case 0:
                this.fkw.pause();
                break;
            case 1:
                this.fkw.resume();
                break;
            case 2:
            case 14:
                this.fkw.skipped();
                break;
            case 4:
                this.fkw.bufferStart();
                break;
            case 5:
                this.fkw.bufferFinish();
                break;
            case 6:
                this.fkw.firstQuartile();
                break;
            case 7:
                this.fkw.midpoint();
                break;
            case 8:
                this.fkw.thirdQuartile();
                break;
            case 9:
                this.fkw.complete();
                break;
            case 10:
                this.fkw.playerStateChange(PlayerState.FULLSCREEN);
                break;
            case 11:
                this.fkw.playerStateChange(PlayerState.NORMAL);
                break;
            case 12:
                MediaEvents mediaEvents = this.fkw;
                if (this.f12991le) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                mediaEvents.volumeChange(f10);
                break;
            case 13:
                this.fkw.adUserInteraction(InteractionType.CLICK);
                break;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ryl.ra
    public final void ouw(float f10, boolean z10) {
        if (ouw()) {
            this.fkw.start(f10, z10 ? 0.0f : 1.0f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ryl.ra
    public final void ouw(boolean z10) {
        this.f12991le = z10;
        vt(12);
    }
}
