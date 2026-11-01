package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: loaded from: classes8.dex */
public final class rb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mx0 f82165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f82166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f82167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f82168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f82169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f82170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f82171g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f82172h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final bl[] f82173i;

    public final AudioTrack a(boolean z10, pk pkVar, int i10) throws fl {
        try {
            AudioTrack audioTrackB = b(z10, pkVar, i10);
            int state = audioTrackB.getState();
            if (state == 1) {
                return audioTrackB;
            }
            try {
                audioTrackB.release();
            } catch (Exception unused) {
            }
            throw new fl(state, this.f82169e, this.f82170f, this.f82172h, this.f82165a, this.f82167c == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new fl(0, this.f82169e, this.f82170f, this.f82172h, this.f82165a, this.f82167c == 1, e10);
        }
    }

    public final AudioTrack b(boolean z10, pk pkVar, int i10) {
        AudioAttributes audioAttributesBuild;
        AudioAttributes audioAttributesBuild2;
        int i11 = ib3.f78556a;
        if (i11 >= 29) {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(this.f82169e).setChannelMask(this.f82170f).setEncoding(this.f82171g).build();
            if (z10) {
                audioAttributesBuild2 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                if (pkVar.f81437g == null) {
                    pkVar.f81437g = new ok(pkVar);
                }
                audioAttributesBuild2 = pkVar.f81437g.f81061a;
            }
            return new AudioTrack.Builder().setAudioAttributes(audioAttributesBuild2).setAudioFormat(audioFormatBuild).setTransferMode(1).setBufferSizeInBytes(this.f82172h).setSessionId(i10).setOffloadedPlayback(this.f82167c == 1).build();
        }
        if (i11 < 21) {
            int iC = ib3.c(pkVar.f81434d);
            return i10 == 0 ? new AudioTrack(iC, this.f82169e, this.f82170f, this.f82171g, this.f82172h, 1) : new AudioTrack(iC, this.f82169e, this.f82170f, this.f82171g, this.f82172h, 1, i10);
        }
        if (z10) {
            audioAttributesBuild = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            if (pkVar.f81437g == null) {
                pkVar.f81437g = new ok(pkVar);
            }
            audioAttributesBuild = pkVar.f81437g.f81061a;
        }
        return new AudioTrack(audioAttributesBuild, new AudioFormat.Builder().setSampleRate(this.f82169e).setChannelMask(this.f82170f).setEncoding(this.f82171g).build(), this.f82172h, 1, i10);
    }

    public rb0(mx0 mx0Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, bl[] blVarArr) {
        this.f82165a = mx0Var;
        this.f82166b = i10;
        this.f82167c = i11;
        this.f82168d = i12;
        this.f82169e = i13;
        this.f82170f = i14;
        this.f82171g = i15;
        this.f82172h = i16;
        this.f82173i = blVarArr;
    }
}
