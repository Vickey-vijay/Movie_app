package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class O1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f23263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Yb f23264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23265e;

    public O1(VideoExperience videoExperience, AdConfig.VideoPlayerAudioConfig videoPlayerAudioConfig) {
        Yb yb2;
        Yb yb3;
        ck.p.j(videoExperience, "videoExperience");
        ck.p.j(videoPlayerAudioConfig, "audioConfig");
        Boolean startMuted = videoExperience.getAudio().getStartMuted();
        this.f23261a = startMuted != null ? startMuted.booleanValue() : videoPlayerAudioConfig.getStartMuted();
        Integer muteIconWidth = videoExperience.getAudio().getMuteIconWidth();
        this.f23262b = muteIconWidth != null ? muteIconWidth.intValue() : videoPlayerAudioConfig.getMuteIconWidth();
        Integer muteIconHeight = videoExperience.getAudio().getMuteIconHeight();
        this.f23263c = muteIconHeight != null ? muteIconHeight.intValue() : videoPlayerAudioConfig.getMuteIconHeight();
        int[] muteIconMargin = videoExperience.getAudio().getMuteIconMargin();
        if (muteIconMargin != null) {
            ck.p.j(muteIconMargin, "<this>");
            if (muteIconMargin.length != 4) {
                yb3 = new Yb(0, 0, 0, 0);
            } else {
                yb2 = new Yb(muteIconMargin[0], muteIconMargin[1], muteIconMargin[2], muteIconMargin[3]);
                yb3 = yb2;
            }
        } else {
            List<Integer> muteIconMargin2 = videoPlayerAudioConfig.getMuteIconMargin();
            ck.p.j(muteIconMargin2, "<this>");
            if (muteIconMargin2.size() != 4) {
                yb3 = new Yb(0, 0, 0, 0);
            } else {
                yb2 = new Yb(muteIconMargin2.get(0).intValue(), muteIconMargin2.get(1).intValue(), muteIconMargin2.get(2).intValue(), muteIconMargin2.get(3).intValue());
                yb3 = yb2;
            }
        }
        this.f23264d = yb3;
        Integer muteIconPosition = videoExperience.getAudio().getMuteIconPosition();
        this.f23265e = muteIconPosition != null ? muteIconPosition.intValue() : videoPlayerAudioConfig.getMuteIconPosition();
    }
}
