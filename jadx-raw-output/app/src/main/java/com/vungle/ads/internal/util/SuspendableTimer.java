package com.vungle.ads.internal.util;

import android.os.CountDownTimer;
import androidx.annotation.VisibleForTesting;
import ck.i;
import ck.p;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: SuspendableTimer.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R(\u0010\u0018\u001a\u00020\f8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010\u000e\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010\u001f\u001a\u00020\u00028\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u001f\u0010 \u0012\u0004\b%\u0010\u001e\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010&\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b&\u0010'\u0012\u0004\b,\u0010\u001e\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\"R\u0014\u00100\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u001aR\u0014\u00102\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\"R\u001a\u00105\u001a\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b4\u0010\u001e\u001a\u0004\b3\u0010\"¨\u00068"}, d2 = {"Lcom/vungle/ads/internal/util/SuspendableTimer;", "", "", "duration", "Landroid/os/CountDownTimer;", "createCountdown", "Lmj/r;", "start", "reset", CampaignEx.JSON_NATIVE_VIDEO_PAUSE, CampaignEx.JSON_NATIVE_VIDEO_RESUME, "cancel", "", "durationSecs", "D", "", "repeats", "Z", "Lkotlin/Function0;", "onTick", "Lbk/a;", "onFinish", "isPaused", "isCanceled", "nextDurationSecs", "getNextDurationSecs$vungle_ads_release", "()D", "setNextDurationSecs$vungle_ads_release", "(D)V", "getNextDurationSecs$vungle_ads_release$annotations", "()V", "startTimeMillis", "J", "getStartTimeMillis$vungle_ads_release", "()J", "setStartTimeMillis$vungle_ads_release", "(J)V", "getStartTimeMillis$vungle_ads_release$annotations", "timer", "Landroid/os/CountDownTimer;", "getTimer$vungle_ads_release", "()Landroid/os/CountDownTimer;", "setTimer$vungle_ads_release", "(Landroid/os/CountDownTimer;)V", "getTimer$vungle_ads_release$annotations", "getDurationMillis", "durationMillis", "getElapsedSecs", "elapsedSecs", "getNextDurationMillis", "nextDurationMillis", "getElapsedMillis$vungle_ads_release", "getElapsedMillis$vungle_ads_release$annotations", "elapsedMillis", "<init>", "(DZLbk/a;Lbk/a;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class SuspendableTimer {
    private final double durationSecs;
    private boolean isCanceled;
    private boolean isPaused;
    private double nextDurationSecs;
    private final bk.a<r> onFinish;
    private final bk.a<r> onTick;
    private final boolean repeats;
    private long startTimeMillis;
    private CountDownTimer timer;

    public SuspendableTimer(double d10, boolean z10, bk.a<r> aVar, bk.a<r> aVar2) {
        p.j(aVar, "onTick");
        p.j(aVar2, "onFinish");
        this.durationSecs = d10;
        this.repeats = z10;
        this.onTick = aVar;
        this.onFinish = aVar2;
        this.nextDurationSecs = d10;
    }

    @VisibleForTesting
    public static /* synthetic */ void getElapsedMillis$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getNextDurationSecs$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getStartTimeMillis$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTimer$vungle_ads_release$annotations() {
    }

    public final void cancel() {
        this.isPaused = false;
        this.isCanceled = true;
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    private final CountDownTimer createCountdown(long duration) {
        return new CountDownTimer(duration, this) { // from class: com.vungle.ads.internal.util.SuspendableTimer.createCountdown.1
            public final /* synthetic */ SuspendableTimer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(duration, duration);
                this.this$0 = this;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                SuspendableTimer suspendableTimer = this.this$0;
                suspendableTimer.onFinish.invoke();
                if (!suspendableTimer.repeats || suspendableTimer.isCanceled) {
                    suspendableTimer.cancel();
                } else {
                    suspendableTimer.setNextDurationSecs$vungle_ads_release(suspendableTimer.durationSecs);
                    suspendableTimer.start();
                }
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
                this.this$0.onTick.invoke();
            }
        };
    }

    private final long getDurationMillis() {
        return (long) (this.durationSecs * ((double) 1000));
    }

    private final long getNextDurationMillis() {
        return (long) (this.nextDurationSecs * ((double) 1000));
    }

    public final long getElapsedMillis$vungle_ads_release() {
        long jCurrentTimeMillis;
        long nextDurationMillis;
        if (this.isPaused) {
            jCurrentTimeMillis = getDurationMillis();
            nextDurationMillis = getNextDurationMillis();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
            nextDurationMillis = this.startTimeMillis;
        }
        return jCurrentTimeMillis - nextDurationMillis;
    }

    /* JADX INFO: renamed from: getNextDurationSecs$vungle_ads_release, reason: from getter */
    public final double getNextDurationSecs() {
        return this.nextDurationSecs;
    }

    /* JADX INFO: renamed from: getStartTimeMillis$vungle_ads_release, reason: from getter */
    public final long getStartTimeMillis() {
        return this.startTimeMillis;
    }

    /* JADX INFO: renamed from: getTimer$vungle_ads_release, reason: from getter */
    public final CountDownTimer getTimer() {
        return this.timer;
    }

    public final void pause() {
        if (this.timer == null) {
            return;
        }
        this.nextDurationSecs -= getElapsedSecs();
        this.isPaused = true;
        CountDownTimer countDownTimer = this.timer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.timer = null;
    }

    public final void resume() {
        if (this.isPaused) {
            this.isPaused = false;
            start();
        }
    }

    public final void setNextDurationSecs$vungle_ads_release(double d10) {
        this.nextDurationSecs = d10;
    }

    public final void setStartTimeMillis$vungle_ads_release(long j10) {
        this.startTimeMillis = j10;
    }

    public final void setTimer$vungle_ads_release(CountDownTimer countDownTimer) {
        this.timer = countDownTimer;
    }

    private final double getElapsedSecs() {
        return getElapsedMillis$vungle_ads_release() / ((long) 1000);
    }

    public final void reset() {
        cancel();
        start();
    }

    public final void start() {
        this.startTimeMillis = System.currentTimeMillis();
        CountDownTimer countDownTimerCreateCountdown = createCountdown(getNextDurationMillis());
        this.timer = countDownTimerCreateCountdown;
        if (countDownTimerCreateCountdown != null) {
            countDownTimerCreateCountdown.start();
        }
    }

    public /* synthetic */ SuspendableTimer(double d10, boolean z10, bk.a aVar, bk.a aVar2, int i10, i iVar) {
        this(d10, z10, (i10 & 4) != 0 ? new bk.a<r>() { // from class: com.vungle.ads.internal.util.SuspendableTimer.1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }
        } : aVar, aVar2);
    }
}
