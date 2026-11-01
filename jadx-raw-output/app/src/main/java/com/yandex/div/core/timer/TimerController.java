package com.yandex.div.core.timer;

import bk.l;
import ck.i;
import ck.p;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivTimer;
import java.util.List;
import mj.r;

/* JADX INFO: compiled from: TimerController.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class TimerController {
    public static final Companion Companion = new Companion(null);
    private Div2View div2View;
    private final DivActionBinder divActionBinder;
    private final DivTimer divTimer;
    private final List<DivAction> endActions;
    private final ErrorCollector errorCollector;
    private final ExpressionResolver expressionResolver;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f45806id;
    private boolean savedForBackground;
    private final List<DivAction> tickActions;
    private final Ticker ticker;
    private final String valueVariable;

    /* JADX INFO: compiled from: TimerController.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public final void reset() {
        this.div2View = null;
        this.ticker.saveState();
        this.savedForBackground = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimer() {
        Ticker ticker = this.ticker;
        long jLongValue = this.divTimer.f49817a.evaluate(this.expressionResolver).longValue();
        Expression<Long> expression = this.divTimer.f49821e;
        ticker.update(jLongValue, expression != null ? expression.evaluate(this.expressionResolver) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTimerVariable(long j10) {
        Div2View div2View;
        String str = this.valueVariable;
        if (str == null || (div2View = this.div2View) == null) {
            return;
        }
        div2View.setVariable(str, String.valueOf(j10));
    }

    public final DivTimer getDivTimer() {
        return this.divTimer;
    }

    public final boolean isAttachedToView(Div2View div2View) {
        return p.e(div2View, this.div2View);
    }

    public final void onAttach(Div2View div2View) {
        this.div2View = div2View;
        if (this.savedForBackground) {
            this.ticker.restoreState(true);
            this.savedForBackground = false;
        }
    }

    public final void onDetach(Div2View div2View) {
        if (p.e(div2View, this.div2View)) {
            reset();
        }
    }

    public TimerController(DivTimer divTimer, DivActionBinder divActionBinder, ErrorCollector errorCollector, ExpressionResolver expressionResolver) {
        this.divTimer = divTimer;
        this.divActionBinder = divActionBinder;
        this.errorCollector = errorCollector;
        this.expressionResolver = expressionResolver;
        String str = divTimer.f49819c;
        this.f45806id = str;
        this.valueVariable = divTimer.f49822f;
        this.endActions = divTimer.f49818b;
        this.tickActions = divTimer.f49820d;
        this.ticker = new Ticker(str, new TimerController$ticker$1(this), new TimerController$ticker$2(this), new TimerController$ticker$3(this), new TimerController$ticker$4(this), errorCollector);
        divTimer.f49817a.observeAndGet(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.timer.TimerController.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Long l10) {
                invoke(l10.longValue());
                return r.f64562a;
            }

            public final void invoke(long j10) {
                TimerController.this.updateTimer();
            }
        });
        Expression<Long> expression = divTimer.f49821e;
        if (expression != null) {
            expression.observeAndGet(expressionResolver, new l<Long, r>() { // from class: com.yandex.div.core.timer.TimerController.2
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(Long l10) {
                    invoke(l10.longValue());
                    return r.f64562a;
                }

                public final void invoke(long j10) {
                    TimerController.this.updateTimer();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEnd(long j10) {
        updateTimerVariable(j10);
        Div2View div2View = this.div2View;
        if (div2View != null) {
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, div2View, div2View.getExpressionResolver(), this.endActions, "timer", null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTick(long j10) {
        updateTimerVariable(j10);
        Div2View div2View = this.div2View;
        if (div2View != null) {
            DivActionBinder.handleActions$div_release$default(this.divActionBinder, div2View, div2View.getExpressionResolver(), this.tickActions, "timer", null, 16, null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void applyCommand(String str) {
        switch (str.hashCode()) {
            case -1367724422:
                if (str.equals("cancel")) {
                    this.ticker.cancel();
                    return;
                }
                break;
            case -934426579:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                    this.ticker.resume();
                    return;
                }
                break;
            case 3540994:
                if (str.equals("stop")) {
                    this.ticker.stop();
                    return;
                }
                break;
            case 106440182:
                if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                    this.ticker.pause();
                    return;
                }
                break;
            case 108404047:
                if (str.equals("reset")) {
                    this.ticker.reset();
                    return;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    this.ticker.start();
                    return;
                }
                break;
        }
        this.errorCollector.logError(new IllegalArgumentException(str + " is unsupported timer command!"));
    }
}
