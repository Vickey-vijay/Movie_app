package com.bytedance.adsdk.ugeno.yu.yu;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes8.dex */
public final class fkw extends lh {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private float f11063cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int f11064jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private int f11065ko;
    private int mwh;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private AtomicBoolean f11066rn;
    private float ryl;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private String f11067vm;
    private int zih;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.yu.yu.lh
    public final boolean ouw(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        Map<String, String> map = this.fkw;
        if (map != null) {
            this.f11067vm = TextUtils.isEmpty(map.get("direction")) ? "all" : this.fkw.get("direction");
            this.mwh = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("distance"), 0);
            if (this.f11064jg == Integer.MAX_VALUE) {
                this.f11064jg = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("frequency"), Integer.MAX_VALUE);
            }
            if (this.f11065ko == Integer.MAX_VALUE) {
                this.f11065ko = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("effectiveDuration"), Integer.MAX_VALUE);
            }
            this.zih = com.bytedance.adsdk.ugeno.ra.lh.ouw(this.fkw.get("inView"), 0);
            Log.d("GesThrough_UGSlideEvent", "mFrequency: " + this.f11064jg + ", mEffectiveDuration: " + this.f11065ko + ", inEffectiveDuation: " + this.f11066rn.get());
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        if (this.f11065ko != Integer.MAX_VALUE && this.vt != null && System.currentTimeMillis() - this.vt.wbf >= this.f11065ko) {
            this.f11066rn.set(false);
            Log.d("GesThrough_UGSlideEvent", "inEffectiveDuation -> false");
        }
        com.bytedance.adsdk.ugeno.vt.lh lhVar = this.vt;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11063cf = motionEvent.getX();
            this.ryl = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            if (this.mwh == 0 && this.ouw != null) {
                Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
                return ouw(lhVar, x10, y10);
            }
            int iVt = com.bytedance.adsdk.ugeno.ra.ra.vt(this.tlj, x10 - this.f11063cf);
            int iVt2 = com.bytedance.adsdk.ugeno.ra.ra.vt(this.tlj, y10 - this.ryl);
            String str = this.f11067vm;
            byte b10 = -1;
            switch (str.hashCode()) {
                case 3739:
                    if (str.equals("up")) {
                        b10 = 0;
                    }
                    break;
                case 96673:
                    if (str.equals("all")) {
                        b10 = 4;
                    }
                    break;
                case 3089570:
                    if (str.equals("down")) {
                        b10 = 1;
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        b10 = 2;
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        b10 = 3;
                    }
                    break;
            }
            if (b10 == 0) {
                iVt = -iVt2;
            } else if (b10 == 1) {
                iVt = iVt2;
            } else if (b10 == 2) {
                iVt = -iVt;
            } else if (b10 != 3) {
                iVt = (int) Math.abs(Math.sqrt(Math.pow(iVt, 2.0d) + Math.pow(iVt2, 2.0d)));
            }
            if (iVt < this.mwh) {
                Log.d("GesThrough_UGSlideEvent", "Non-slide event");
                return false;
            }
            Log.d("GesThrough_UGSlideEvent", "Slide event, check limit");
            if (this.ouw != null) {
                this.f11063cf = 0.0f;
                this.ryl = 0.0f;
                return ouw(lhVar, x10, y10);
            }
        }
        return true;
    }

    public fkw(Context context) {
        super(context);
        this.mwh = 0;
        this.f11064jg = Integer.MAX_VALUE;
        this.f11065ko = Integer.MAX_VALUE;
        this.f11066rn = new AtomicBoolean(true);
        this.zih = 0;
        this.f11067vm = "up";
    }

    private boolean ouw(com.bytedance.adsdk.ugeno.vt.lh lhVar, float f10, float f11) {
        if (this.f11064jg <= 0) {
            Log.d("GesThrough_UGSlideEvent", "frequency <= 0, no trigger slide");
            return false;
        }
        if (!this.f11066rn.get()) {
            Log.d("GesThrough_UGSlideEvent", "not in effective duration, no trigger slide");
            return false;
        }
        if (this.zih == 1 && !ouw(lhVar.fkw, f10, f11)) {
            Log.d("GesThrough_UGSlideEvent", "not in view, no trigger slide");
            return false;
        }
        Log.d("GesThrough_UGSlideEvent", "Slide event, direct handling");
        this.ouw.ouw(this.f11068le, this.f11069lh.vt);
        int i10 = this.f11064jg;
        if (i10 != Integer.MAX_VALUE) {
            this.f11064jg = i10 - 1;
        }
        return true;
    }

    private static boolean ouw(View view, float f10, float f11) {
        return f10 >= 0.0f && f10 < ((float) view.getWidth()) && f11 >= 0.0f && f11 < ((float) view.getHeight());
    }
}
