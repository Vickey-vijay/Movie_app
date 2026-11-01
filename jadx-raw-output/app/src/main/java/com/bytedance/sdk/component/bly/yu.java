package com.bytedance.sdk.component.bly;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.qbp;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class yu extends lh {
    private float bly;
    private final Context fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final le f11657le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final int f11658lh;
    public String ouw;
    private long pno = -1;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private View.OnTouchListener f11659ra;
    private float tlj;
    private final View.OnTouchListener vt;
    private final long yu;

    private void ouw(int i10, float f10, float f11) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i10);
            jSONObject2.put("click_x", f10);
            jSONObject2.put("click_y", f11);
            jSONObject.put("lp_click_type", this.f11658lh);
            jSONObject.put("lp_click_interval", this.yu);
        } catch (Throwable th2) {
            qbp.ouw("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th2);
        }
        if (com.bytedance.sdk.component.bly.ouw.ouw.ouw().ouw != null) {
            com.bytedance.sdk.component.bly.ouw.vt vtVar = com.bytedance.sdk.component.bly.ouw.ouw.ouw().ouw;
            le leVar = this.f11657le;
            vtVar.ouw(leVar != null ? leVar.getMaterialMeta() : null, this.ouw, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    public yu(Context context, View.OnTouchListener onTouchListener, int i10, long j10, le leVar) {
        this.fkw = context;
        this.vt = onTouchListener;
        this.f11658lh = i10;
        this.yu = j10;
        this.f11657le = leVar;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        int action = motionEvent.getAction();
        ko.vt("LpClickIntervalTouchListener", "action: ", Integer.valueOf(action), ", x: ", Float.valueOf(motionEvent.getX()), ",y: ", Float.valueOf(motionEvent.getY()));
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action != 0) {
            if (action == 1 && ouw(x10, y10, this.bly, this.tlj, this.fkw)) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = this.pno;
                if (j10 != -1) {
                    int i10 = this.f11658lh;
                    if (i10 == 1) {
                        if (jElapsedRealtime - j10 <= this.yu) {
                            z10 = true;
                        } else {
                            this.pno = jElapsedRealtime;
                            z10 = false;
                        }
                    } else if (i10 == 2) {
                        if (jElapsedRealtime - j10 <= this.yu) {
                            this.pno = jElapsedRealtime;
                            z10 = true;
                        }
                        this.pno = jElapsedRealtime;
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                } else {
                    this.pno = jElapsedRealtime;
                    z10 = false;
                }
                if (z10) {
                    motionEvent.setAction(3);
                    ouw(1, x10, y10);
                } else {
                    ouw(0, x10, y10);
                }
            }
        } else {
            this.bly = x10;
            this.tlj = y10;
        }
        View.OnTouchListener onTouchListener = this.vt;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = this.f11659ra;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(view, motionEvent);
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.bly.lh
    public final void ouw(View.OnTouchListener onTouchListener) {
        this.f11659ra = onTouchListener;
    }
}
