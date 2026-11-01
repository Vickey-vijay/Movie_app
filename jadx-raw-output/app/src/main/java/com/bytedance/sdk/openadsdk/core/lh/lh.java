package com.bytedance.sdk.openadsdk.core.lh;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.zih;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lh implements View.OnClickListener, View.OnTouchListener {
    private static long fkw = 0;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static float f12711lh = 0.0f;
    private static float ouw = 0.0f;
    public static int uoy = 8;
    private static float vt;
    private static float yu;
    public View ey;
    public float ksc = -1.0f;
    public float jae = -1.0f;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public float f12714od = -1.0f;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public float f12712cd = -1.0f;
    public long uq = -1;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public long f12715pd = -1;
    public int fvf = -1;
    public int bs = -1024;
    public int fak = -1;
    public boolean osn = true;
    public SparseArray<ouw> rrs = new SparseArray<>();

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f12713le = 0;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f12716ra = 0;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/lh/lh;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(g.f44975u, view);
        safedk_lh_onClick_5e8bb9c3f6c0daebb5c8c9ce81d78777(view);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/lh/lh;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        CreativeInfoManager.onViewTouched(g.f44975u, view, motionEvent);
        return safedk_lh_onTouch_142e4d5725857f1365965fa6d064820e(view, motionEvent);
    }

    public abstract void ouw(View view, float f10, float f11, float f12, float f13, SparseArray<ouw> sparseArray, boolean z10);

    public static class ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public double f12717lh;
        public int ouw;
        public double vt;
        public long yu;

        public ouw(int i10, double d10, double d11, long j10) {
            this.ouw = i10;
            this.vt = d10;
            this.f12717lh = d11;
            this.yu = j10;
        }
    }

    private boolean ouw(View view, Point point) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i14 = 0; i14 < viewGroup.getChildCount(); i14++) {
                View childAt = viewGroup.getChildAt(i14);
                if (vt.vt(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i10 = point.x) >= (i11 = iArr[0]) && i10 <= i11 + childAt.getWidth() && (i12 = point.y) >= (i13 = iArr[1]) && i12 <= i13 + childAt.getHeight();
                }
                if (ouw(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean yu() {
        return this.osn;
    }

    static {
        if (zih.ouw() != null) {
            uoy = zih.vt();
        }
        ouw = 0.0f;
        vt = 0.0f;
        f12711lh = 0.0f;
        yu = 0.0f;
        fkw = 0L;
    }

    public void safedk_lh_onClick_5e8bb9c3f6c0daebb5c8c9ce81d78777(View p10) {
        if (!com.bytedance.sdk.openadsdk.core.settings.ra.ouw()) {
            return;
        }
        ouw(p10, this.ksc, this.jae, this.f12714od, this.f12712cd, this.rrs, this.osn);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0073  */
    public boolean safedk_lh_onTouch_142e4d5725857f1365965fa6d064820e(View p10, MotionEvent p11) {
        int i10;
        this.bs = p11.getDeviceId();
        this.fvf = p11.getToolType(0);
        this.fak = p11.getSource();
        int actionMasked = p11.getActionMasked();
        int i11 = 3;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    i11 = actionMasked != 3 ? -1 : 4;
                } else {
                    f12711lh += Math.abs(p11.getX() - ouw);
                    yu += Math.abs(p11.getY() - vt);
                    ouw = p11.getX();
                    vt = p11.getY();
                    if (System.currentTimeMillis() - fkw > 200) {
                        float f10 = f12711lh;
                        int i12 = uoy;
                        if (f10 > i12 || yu > i12) {
                            i11 = 1;
                        } else {
                            i11 = 2;
                        }
                    } else {
                        i11 = 2;
                    }
                    this.f12714od = p11.getRawX();
                    this.f12712cd = p11.getRawY();
                    if (Math.abs(this.f12714od - this.f12713le) >= uoy || Math.abs(this.f12712cd - this.f12716ra) >= uoy) {
                        this.osn = false;
                    }
                }
            } else {
                this.f12714od = p11.getRawX();
                this.f12712cd = p11.getRawY();
                this.f12715pd = System.currentTimeMillis();
                if (Math.abs(this.f12714od - this.f12713le) >= uoy || Math.abs(this.f12712cd - this.f12716ra) >= uoy) {
                    this.osn = false;
                }
                Point point = new Point((int) this.f12714od, (int) this.f12712cd);
                if (p10 != null && !vt.vt(p10) && ouw((View) p10.getParent(), point)) {
                    return true;
                }
            }
            i10 = i11;
        } else {
            this.f12713le = (int) p11.getRawX();
            this.f12716ra = (int) p11.getRawY();
            this.ksc = p11.getRawX();
            this.jae = p11.getRawY();
            this.uq = System.currentTimeMillis();
            this.fvf = p11.getToolType(0);
            this.bs = p11.getDeviceId();
            this.fak = p11.getSource();
            fkw = System.currentTimeMillis();
            this.osn = true;
            this.ey = p10;
            com.bytedance.sdk.openadsdk.core.tlj.lh.ouw(p11);
            i10 = 0;
        }
        this.rrs.put(p11.getActionMasked(), new ouw(i10, p11.getSize(), p11.getPressure(), System.currentTimeMillis()));
        return false;
    }
}
