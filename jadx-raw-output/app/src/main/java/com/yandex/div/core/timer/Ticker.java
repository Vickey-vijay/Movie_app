package com.yandex.div.core.timer;

import android.os.SystemClock;
import bk.a;
import bk.l;
import ck.i;
import com.yandex.div.core.view2.errors.ErrorCollector;
import ik.k;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import kotlin.jvm.internal.Ref$LongRef;
import mj.g;
import mj.r;

/* JADX INFO: compiled from: Ticker.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Ticker {
    public static final Companion Companion = new Companion(null);
    private Long currentDuration;
    private Long currentInterval;
    private Long duration;
    private final ErrorCollector errorCollector;
    private Long interval;
    private final String name;
    private final l<Long, r> onEnd;
    private final l<Long, r> onInterrupt;
    private final l<Long, r> onStart;
    private final l<Long, r> onTick;
    private long workTimeFromPrevious;
    private State state = State.STOPPED;
    private long startedAt = -1;
    private long interruptedAt = -1;
    private final g timer$delegate = b.b(LazyThreadSafetyMode.NONE, new a<FixedRateScheduler>() { // from class: com.yandex.div.core.timer.Ticker$timer$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final FixedRateScheduler invoke() {
            return new FixedRateScheduler();
        }
    });

    /* JADX INFO: compiled from: Ticker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Ticker.kt */
    public enum State {
        STOPPED,
        WORKING,
        PAUSED
    }

    /* JADX INFO: compiled from: Ticker.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.STOPPED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.WORKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[State.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void runTickTimer(final long j10, final long j11) {
        long totalWorkTime = j11 - (getTotalWorkTime() % j11);
        final Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = (j10 / j11) - (getTotalWorkTime() / j11);
        final a<r> aVar = new a<r>() { // from class: com.yandex.div.core.timer.Ticker$runTickTimer$processTick$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (ref$LongRef.element > 0) {
                    this.onTick.invoke(Long.valueOf(j10));
                }
                this.onEnd.invoke(Long.valueOf(j10));
                this.cleanTicker();
                this.resetTickerState();
                this.state = Ticker.State.STOPPED;
            }
        };
        setupTimer(j11, totalWorkTime, new a<r>() { // from class: com.yandex.div.core.timer.Ticker.runTickTimer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                long totalWorkTime2 = j10 - this.getTotalWorkTime();
                this.coercedTick();
                ref$LongRef.element--;
                boolean z10 = false;
                if (1 <= totalWorkTime2 && totalWorkTime2 < j11) {
                    z10 = true;
                }
                if (!z10) {
                    if (totalWorkTime2 <= 0) {
                        aVar.invoke();
                    }
                } else {
                    this.cleanTicker();
                    Ticker ticker = this;
                    final a<r> aVar2 = aVar;
                    Ticker.setupTimer$default(ticker, totalWorkTime2, 0L, new a<r>() { // from class: com.yandex.div.core.timer.Ticker.runTickTimer.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // bk.a
                        public /* bridge */ /* synthetic */ r invoke() {
                            invoke2();
                            return r.f64562a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            aVar2.invoke();
                        }
                    }, 2, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void coercedTick() {
        Long l10 = this.duration;
        if (l10 != null) {
            this.onTick.invoke(Long.valueOf(k.h(getTotalWorkTime(), l10.longValue())));
        } else {
            this.onTick.invoke(Long.valueOf(getTotalWorkTime()));
        }
    }

    private final FixedRateScheduler getTimer() {
        return (FixedRateScheduler) this.timer$delegate.getValue();
    }

    private final long getWorkTime() {
        if (this.startedAt == -1) {
            return 0L;
        }
        return getCurrentTime() - this.startedAt;
    }

    private final void onError(String str) {
        ErrorCollector errorCollector = this.errorCollector;
        if (errorCollector != null) {
            errorCollector.logError(new IllegalArgumentException(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetTickerState() {
        this.startedAt = -1L;
        this.interruptedAt = -1L;
        this.workTimeFromPrevious = 0L;
    }

    private final void runTimer() {
        Long l10 = this.currentInterval;
        Long l11 = this.currentDuration;
        if (l10 != null && this.interruptedAt != -1 && getCurrentTime() - this.interruptedAt > l10.longValue()) {
            coercedTick();
        }
        if (l10 == null && l11 != null) {
            runCountDownTimer(l11.longValue());
            return;
        }
        if (l10 != null && l11 != null) {
            runTickTimer(l11.longValue(), l10.longValue());
        } else {
            if (l10 == null || l11 != null) {
                return;
            }
            runEndlessTimer(l10.longValue());
        }
    }

    public static /* synthetic */ void setupTimer$default(Ticker ticker, long j10, long j11, a aVar, int i10, Object obj) {
        ticker.setupTimer(j10, (i10 & 2) != 0 ? j10 : j11, aVar);
    }

    public final void cancel() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i10 == 2 || i10 == 3) {
            this.state = State.STOPPED;
            cleanTicker();
            this.onInterrupt.invoke(Long.valueOf(getTotalWorkTime()));
            resetTickerState();
        }
    }

    public final void pause() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i10 == 1) {
            onError("The timer '" + this.name + "' already stopped!");
            return;
        }
        if (i10 == 2) {
            this.state = State.PAUSED;
            this.onInterrupt.invoke(Long.valueOf(getTotalWorkTime()));
            saveState();
            this.startedAt = -1L;
            return;
        }
        if (i10 != 3) {
            return;
        }
        onError("The timer '" + this.name + "' already paused!");
    }

    public final void restoreState(boolean z10) {
        if (!z10) {
            this.interruptedAt = -1L;
        }
        runTimer();
    }

    public final void resume() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i10 == 1) {
            onError("The timer '" + this.name + "' is stopped!");
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.state = State.WORKING;
            restoreState(false);
            return;
        }
        onError("The timer '" + this.name + "' already working!");
    }

    public final void saveState() {
        if (this.startedAt != -1) {
            this.workTimeFromPrevious += getCurrentTime() - this.startedAt;
            this.interruptedAt = getCurrentTime();
            this.startedAt = -1L;
        }
        cleanTicker();
    }

    public final void start() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i10 == 1) {
            cleanTicker();
            this.currentDuration = this.duration;
            this.currentInterval = this.interval;
            this.state = State.WORKING;
            this.onStart.invoke(Long.valueOf(getTotalWorkTime()));
            runTimer();
            return;
        }
        if (i10 == 2) {
            onError("The timer '" + this.name + "' already working!");
            return;
        }
        if (i10 != 3) {
            return;
        }
        onError("The timer '" + this.name + "' paused!");
    }

    public final void stop() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()];
        if (i10 == 1) {
            onError("The timer '" + this.name + "' already stopped!");
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.state = State.STOPPED;
            this.onEnd.invoke(Long.valueOf(getTotalWorkTime()));
            cleanTicker();
            resetTickerState();
        }
    }

    public final void update(long j10, Long l10) {
        this.interval = l10;
        this.duration = j10 == 0 ? null : Long.valueOf(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Ticker(String str, l<? super Long, r> lVar, l<? super Long, r> lVar2, l<? super Long, r> lVar3, l<? super Long, r> lVar4, ErrorCollector errorCollector) {
        this.name = str;
        this.onInterrupt = lVar;
        this.onStart = lVar2;
        this.onEnd = lVar3;
        this.onTick = lVar4;
        this.errorCollector = errorCollector;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cleanTicker() {
        getTimer().cancel();
    }

    private final long getCurrentTime() {
        return SystemClock.elapsedRealtime();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getTotalWorkTime() {
        return getWorkTime() + this.workTimeFromPrevious;
    }

    private final void runCountDownTimer(final long j10) {
        long totalWorkTime = j10 - getTotalWorkTime();
        if (totalWorkTime >= 0) {
            setupTimer$default(this, totalWorkTime, 0L, new a<r>() { // from class: com.yandex.div.core.timer.Ticker.runCountDownTimer.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Ticker.this.cleanTicker();
                    Ticker.this.onEnd.invoke(Long.valueOf(j10));
                    Ticker.this.state = State.STOPPED;
                    Ticker.this.resetTickerState();
                }
            }, 2, null);
        } else {
            this.onEnd.invoke(Long.valueOf(j10));
            resetTickerState();
        }
    }

    private final void runEndlessTimer(long j10) {
        setupTimer(j10, j10 - (getTotalWorkTime() % j10), new a<r>() { // from class: com.yandex.div.core.timer.Ticker.runEndlessTimer.1
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Ticker.this.coercedTick();
            }
        });
    }

    private final void setupTimer(long j10, long j11, a<r> aVar) {
        this.startedAt = getCurrentTime();
        getTimer().scheduleAtFixedRate(j11, j10, aVar);
    }

    public final void reset() {
        cancel();
        start();
    }
}
