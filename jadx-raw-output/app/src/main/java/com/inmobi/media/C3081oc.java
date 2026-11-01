package com.inmobi.media;

import android.view.MotionEvent;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.oc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3081oc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC2785ci f24981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f24983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f24984d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f24985e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f24986f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f24989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public JSONArray f24990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MotionEvent f24991k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f24992l;

    public C3081oc(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "mListener");
        this.f24981a = gestureDetectorOnGestureListenerC2785ci;
        this.f24982b = C3081oc.class.getSimpleName();
        this.f24992l = Integer.MAX_VALUE;
        this.f24987g = -1;
        this.f24988h = -1;
    }

    public final void a(MotionEvent motionEvent) {
        float y10;
        float x10;
        float f10;
        ck.p.j(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            ck.p.i(this.f24982b, "TAG");
            motionEvent.toString();
            this.f24987g = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f24990j = new JSONArray();
            JSONArray jSONArray = new JSONArray((Collection) nj.s.n(Integer.valueOf(F3.c(motionEvent.getX())), Integer.valueOf(F3.c(motionEvent.getY()))));
            JSONArray jSONArray2 = this.f24990j;
            if (jSONArray2 != null) {
                jSONArray2.put(jSONArray);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            ck.p.i(this.f24982b, "TAG");
            motionEvent.toString();
            this.f24987g = -1;
            JSONArray jSONArray3 = this.f24990j;
            if (jSONArray3 == null || jSONArray3.length() <= 5) {
                return;
            }
            this.f24981a.a(this);
            this.f24990j = new JSONArray();
            return;
        }
        float y11 = 0.0f;
        if (actionMasked == 2) {
            JSONArray jSONArray4 = this.f24990j;
            int i10 = this.f24987g;
            if (i10 == -1 || this.f24988h == -1) {
                if (i10 == -1 || jSONArray4 == null || jSONArray4.length() <= 0 || jSONArray4.length() >= 50) {
                    return;
                }
                try {
                    int iC = F3.c(motionEvent.getX());
                    int iC2 = F3.c(motionEvent.getY());
                    JSONArray jSONArray5 = jSONArray4.getJSONArray(jSONArray4.length() - 1);
                    JSONArray jSONArray6 = new JSONArray((Collection) nj.s.n(Integer.valueOf(iC), Integer.valueOf(iC2)));
                    float f11 = jSONArray5.getInt(0) - jSONArray6.getInt(0);
                    float f12 = jSONArray5.getInt(1) - jSONArray6.getInt(1);
                    if (((int) Math.sqrt((f12 * f12) + (f11 * f11))) > 100) {
                        jSONArray4.put(jSONArray6);
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            int iFindPointerIndex = motionEvent.findPointerIndex(i10);
            int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f24988h);
            if (iFindPointerIndex >= 0) {
                x10 = motionEvent.getX(iFindPointerIndex);
                y10 = motionEvent.getY(iFindPointerIndex);
            } else {
                mj.g gVar = P9.f23321a;
                P9.a(new L2(new IllegalArgumentException("Index for mPtrID1=" + this.f24987g + " is " + iFindPointerIndex + " | Pointer count=" + motionEvent.getPointerCount())));
                y10 = 0.0f;
                x10 = 0.0f;
            }
            if (iFindPointerIndex2 >= 0) {
                float x11 = motionEvent.getX(iFindPointerIndex2);
                y11 = motionEvent.getY(iFindPointerIndex2);
                f10 = x11;
            } else {
                mj.g gVar2 = P9.f23321a;
                P9.a(new L2(new IllegalArgumentException("Index for mPtrID1=" + this.f24988h + " is " + iFindPointerIndex2 + " | Pointer count=" + motionEvent.getPointerCount())));
                f10 = 0.0f;
            }
            float degrees = ((float) Math.toDegrees(((float) Math.atan2(this.f24984d - this.f24986f, this.f24983c - this.f24985e)) - ((float) Math.atan2(y11 - y10, f10 - x10)))) % 360;
            if (degrees < -180.0f) {
                degrees += 360.0f;
            }
            if (degrees > 180.0f) {
                degrees -= 360.0f;
            }
            this.f24989i = Math.abs(degrees);
            return;
        }
        if (actionMasked == 3) {
            ck.p.i(this.f24982b, "TAG");
            motionEvent.toString();
            this.f24987g = -1;
            this.f24988h = -1;
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            ck.p.i(this.f24982b, "TAG");
            motionEvent.toString();
            this.f24988h = -1;
            if (this.f24989i > 30.0f) {
                MotionEvent motionEvent2 = this.f24991k;
                if (motionEvent2 != null) {
                    this.f24981a.b(this, motionEvent2, motionEvent);
                }
                this.f24989i = 0.0f;
            }
            float x12 = motionEvent.getX() - motionEvent.getX(1);
            float y12 = motionEvent.getY() - motionEvent.getY(1);
            if (Math.abs(((int) Math.sqrt((y12 * y12) + (x12 * x12))) - this.f24992l) > 500) {
                MotionEvent motionEvent3 = this.f24991k;
                if (motionEvent3 != null) {
                    this.f24981a.a(this, motionEvent3, motionEvent);
                }
                this.f24992l = Integer.MAX_VALUE;
                return;
            }
            return;
        }
        ck.p.i(this.f24982b, "TAG");
        motionEvent.toString();
        this.f24988h = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.f24991k = MotionEvent.obtain(motionEvent);
        int iFindPointerIndex3 = motionEvent.findPointerIndex(this.f24987g);
        int iFindPointerIndex4 = motionEvent.findPointerIndex(this.f24988h);
        if (iFindPointerIndex3 >= 0) {
            this.f24985e = motionEvent.getX(iFindPointerIndex3);
            this.f24986f = motionEvent.getY(iFindPointerIndex3);
        } else {
            mj.g gVar3 = P9.f23321a;
            P9.a(new L2(new IllegalArgumentException("Index for mPtrID1=" + this.f24987g + " is " + iFindPointerIndex3 + " | Pointer count=" + motionEvent.getPointerCount())));
        }
        if (iFindPointerIndex4 >= 0) {
            this.f24983c = motionEvent.getX(iFindPointerIndex4);
            this.f24984d = motionEvent.getY(iFindPointerIndex4);
        } else {
            mj.g gVar4 = P9.f23321a;
            P9.a(new L2(new IllegalArgumentException("Index for mPtrID2=" + this.f24988h + " is " + iFindPointerIndex4 + " | Pointer count=" + motionEvent.getPointerCount())));
        }
        float f13 = this.f24985e - this.f24983c;
        float f14 = this.f24986f - this.f24984d;
        this.f24992l = (int) Math.sqrt((f14 * f14) + (f13 * f13));
    }
}
