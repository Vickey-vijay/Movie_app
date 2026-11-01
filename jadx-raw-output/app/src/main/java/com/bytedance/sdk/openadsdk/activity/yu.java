package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.reward.ouw.cf;
import com.bytedance.sdk.openadsdk.component.reward.ouw.ko;
import com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2;
import com.bytedance.sdk.openadsdk.core.cf.ra.yu;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.ex;
import com.bytedance.sdk.openadsdk.core.model.ksc;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.core.model.tc;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.qbp;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.core.zin;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class yu extends com.bytedance.sdk.openadsdk.activity.lh implements Handler.Callback {
    private final TopLayoutDislike2 bly;
    private int bs;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private boolean f12148cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final FrameLayout f12149cf;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private long f12150cj;
    private boolean ex;
    private ex.ouw ey;
    private int fak;
    private boolean fqk;
    private com.bytedance.sdk.openadsdk.activity.vt.fkw fvf;
    private FrameLayout hun;
    private int jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final HashSet<String> f12151jg;
    private int jqy;
    private JSONObject jvy;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    private boolean f12152kn;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final boolean f12153ko;
    private boolean ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final RecyclerView f12154le;
    private JSONObject lso;
    private View mt;
    private final AtomicBoolean mwh;
    private boolean myk;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private boolean f12155od;
    private boolean osn;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private pno f12156pd;
    private final LinearLayoutManager pno;
    private long pv;
    private final boolean qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final ouw f12157ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final boolean f12158rn;
    private int rrs;
    private final boolean ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private int f12159tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private final ArrayList<Message> f12160th;
    private final Handler tlj;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    private JSONObject f12161ub;
    private boolean ucs;
    private com.bytedance.sdk.openadsdk.activity.fkw uoy;
    private int uq;
    private boolean ux;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private Message f12162vh;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private final PAGLogoView f12163vm;
    private int vpp;
    private boolean wp;
    private boolean xdk;
    private boolean yhj;
    private le yib;
    private final HashSet<Integer> zih;
    private boolean zin;
    private long zvq;

    public static abstract class le implements Runnable {
        public long fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public long f12169le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final long f12170lh;
        private final Handler ouw = new Handler(Looper.getMainLooper());
        public long yu;

        public abstract void ouw();

        public final void fkw() {
            this.ouw.postDelayed(this, this.f12170lh);
            this.yu = SystemClock.elapsedRealtime();
        }

        public final void lh() {
            long j10 = this.f12170lh - this.fkw;
            if (j10 < 0) {
                return;
            }
            this.ouw.removeCallbacks(this);
            this.ouw.postDelayed(this, j10);
            this.yu = SystemClock.elapsedRealtime();
        }

        public final void vt() {
            this.ouw.removeCallbacks(this);
            if (this.f12169le > this.yu) {
                return;
            }
            this.fkw += SystemClock.elapsedRealtime() - this.yu;
            this.f12169le = SystemClock.elapsedRealtime();
        }

        public final void yu() {
            this.ouw.removeCallbacks(this);
        }

        public le(long j10) {
            this.f12170lh = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            ouw();
        }
    }

    public static class lh extends fkw {
        private final TextView ouw;

        @Override // com.bytedance.sdk.openadsdk.activity.yu.fkw
        public final void ouw(yu yuVar, C0105yu c0105yu, int i10) {
            this.ouw.setText(c0105yu.f12173lh);
        }

        public lh(@NonNull View view) {
            super(view);
            com.bytedance.sdk.openadsdk.core.le.pno pnoVar = new com.bytedance.sdk.openadsdk.core.le.pno(view.getContext());
            this.ouw = pnoVar;
            pnoVar.setTextColor(Color.parseColor("#99FFFFFF"));
            pnoVar.setTextSize(14.0f);
            pnoVar.setGravity(17);
            pnoVar.setPadding(0, 24, 0, 24);
            ((FrameLayout) view).addView(pnoVar, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    public static class ouw extends RecyclerView.Adapter<fkw> {
        private boolean fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final ArrayList<C0105yu> f12171lh = new ArrayList<>();
        public final ArrayList<pno> ouw = new ArrayList<>();
        public boolean vt;
        private final yu yu;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
            if (i10 == -1) {
                com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(viewGroup.getContext());
                lhVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                return new lh(lhVar);
            }
            com.bytedance.sdk.openadsdk.component.reward.view.vt vtVar = new com.bytedance.sdk.openadsdk.component.reward.view.vt(viewGroup.getContext(), this.yu.f12158rn, this.yu.f12153ko, osn.ouw(viewGroup.getContext(), 10.0f));
            vtVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return new vt(this, vtVar);
        }

        public final int ouw() {
            int itemCount = getItemCount();
            return this.fkw ? itemCount - 1 : itemCount;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            if (this.vt) {
                return Integer.MAX_VALUE;
            }
            return this.f12171lh.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i10) {
            C0105yu c0105yu = this.f12171lh.get(i10 % this.f12171lh.size());
            if (c0105yu.ouw != 0) {
                return -1;
            }
            pd pdVar = c0105yu.vt.lht;
            if (pdVar == null) {
                return 1;
            }
            return (pdVar.ouw + pdVar.vt).hashCode();
        }

        public final List<vpp> lh() {
            ArrayList arrayList = new ArrayList();
            for (C0105yu c0105yu : this.f12171lh) {
                if (c0105yu.ouw == 0) {
                    arrayList.add(c0105yu.vt);
                }
            }
            return arrayList;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i10) {
            fkw fkwVar = (fkw) viewHolder;
            if (i10 >= this.f12171lh.size()) {
                i10 %= this.f12171lh.size();
            }
            fkwVar.ouw(this.yu, this.f12171lh.get(i10), i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
            super.onViewAttachedToWindow((fkw) viewHolder);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final /* synthetic */ void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
            com.bytedance.sdk.openadsdk.activity.ouw ouwVar;
            ko koVar;
            com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh lhVar;
            fkw fkwVar = (fkw) viewHolder;
            super.onViewDetachedFromWindow(fkwVar);
            if (!(fkwVar instanceof vt) || (ouwVar = ((vt) fkwVar).vt) == null || (lhVar = (koVar = ouwVar.ksc().ex).f12357ra) == null || lhVar.zin() == null) {
                return;
            }
            koVar.ouw = koVar.f12357ra.rn();
            koVar.tlj();
            koVar.le();
            koVar.bly = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final /* synthetic */ void onViewRecycled(@NonNull RecyclerView.ViewHolder viewHolder) {
            fkw fkwVar = (fkw) viewHolder;
            super.onViewRecycled(fkwVar);
            if (fkwVar instanceof vt) {
                vt vtVar = (vt) fkwVar;
                com.bytedance.sdk.openadsdk.activity.ouw ouwVar = vtVar.vt;
                boolean z10 = false;
                if (!this.yu.qbp) {
                    ouw(vtVar, false);
                    return;
                }
                if (ouwVar != null && ouwVar.fak()) {
                    z10 = true;
                }
                if (ouwVar != null) {
                    ouw(vtVar, z10);
                }
            }
        }

        public final int vt() {
            return this.fkw ? this.f12171lh.size() - 1 : this.f12171lh.size();
        }

        public ouw(yu yuVar, List<vpp> list) {
            this.yu = yuVar;
            for (int i10 = 0; i10 < list.size(); i10++) {
                vpp vppVar = list.get(i10);
                if (vppVar != null) {
                    vppVar.f12873rn = yuVar.fkw;
                }
                this.f12171lh.add(new C0105yu(vppVar));
            }
        }

        public final void ouw(String str) {
            int size = this.f12171lh.size();
            C0105yu c0105yu = size > 0 ? this.f12171lh.get(size - 1) : null;
            boolean z10 = !TextUtils.isEmpty(str);
            if (c0105yu == null || c0105yu.ouw != 1) {
                if (z10) {
                    this.f12171lh.add(new C0105yu(str));
                    notifyItemInserted(size);
                    this.fkw = true;
                    return;
                }
                return;
            }
            if (z10) {
                c0105yu.f12173lh = str;
                notifyItemChanged(size - 1);
            } else {
                this.f12171lh.remove(c0105yu);
                notifyItemRemoved(size - 1);
                this.fkw = false;
            }
        }

        public final void ouw(List<vpp> list) {
            yu yuVar;
            int size = this.f12171lh.size();
            if (this.fkw) {
                size--;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                vpp vppVar = list.get(i10);
                if (vppVar != null && (yuVar = this.yu) != null) {
                    vppVar.f12873rn = yuVar.fkw;
                }
                this.f12171lh.add(size + i10, new C0105yu(vppVar));
                vppVar.lvd();
            }
            notifyItemRangeInserted(size, list.size());
        }

        public final void ouw(int i10, int i11) {
            if (this.vt) {
                return;
            }
            this.vt = true;
            if (i10 < 0) {
                i10 = 0;
            }
            int size = this.f12171lh.size();
            notifyItemRangeInserted(size, (Integer.MAX_VALUE - i11) - (size - i10));
            notifyItemRangeInserted(0, i11 - i10);
        }

        public final void ouw(vt vtVar, boolean z10) {
            if (vtVar.vt == null) {
                return;
            }
            this.ouw.remove(vtVar.vt);
            com.bytedance.sdk.openadsdk.activity.ouw ouwVar = vtVar.vt;
            if (ouwVar != null) {
                ouwVar.yu(z10);
                vtVar.vt.qbp();
                if (!z10) {
                    vtVar.vt = null;
                }
                com.bytedance.sdk.openadsdk.component.reward.view.vt vtVar2 = vtVar.ouw;
                com.bytedance.sdk.openadsdk.core.le.lh lhVar = vtVar2.ouw;
                if (lhVar != null) {
                    lhVar.removeAllViews();
                } else {
                    vtVar2.removeAllViews();
                }
            }
        }
    }

    public static class vt extends fkw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final ouw f12172lh;
        public final com.bytedance.sdk.openadsdk.component.reward.view.vt ouw;
        public com.bytedance.sdk.openadsdk.activity.ouw vt;

        /* JADX WARN: Code duplicated, block: B:18:0x003f  */
        @Override // com.bytedance.sdk.openadsdk.activity.yu.fkw
        public final void ouw(yu yuVar, C0105yu c0105yu, int i10) {
            boolean z10;
            pd pdVar;
            int bindingAdapterPosition = getBindingAdapterPosition();
            Activity activity = yuVar.ouw;
            if (com.bytedance.sdk.component.utils.vt.ouw(activity)) {
                return;
            }
            vpp vppVar = c0105yu.vt;
            com.bytedance.sdk.openadsdk.activity.ouw ouwVar = this.vt;
            if (ouwVar != null) {
                if (!ouwVar.fak() || (pdVar = ouwVar.f12108le.lht) == null) {
                    z10 = false;
                } else {
                    pd pdVar2 = vppVar.lht;
                    if (TextUtils.equals(pdVar.ouw, pdVar2.ouw) && TextUtils.equals(pdVar.vt, pdVar2.vt) && ouwVar.uoy()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    this.vt.ouw(vppVar, bindingAdapterPosition, i10);
                } else {
                    this.f12172lh.ouw(this, false);
                }
            }
            com.bytedance.sdk.openadsdk.activity.vt vtVar = yuVar.yu;
            if (this.vt == null) {
                this.vt = vppVar.ey() ? new ra(vtVar, vppVar, bindingAdapterPosition, i10, false) : new com.bytedance.sdk.openadsdk.activity.le(vtVar, vppVar, bindingAdapterPosition, i10, false);
            }
            com.bytedance.sdk.openadsdk.activity.vt.fkw fkwVar = new com.bytedance.sdk.openadsdk.activity.vt.fkw(1, null);
            fkwVar.yu = yuVar.f12148cd;
            this.vt.vt(activity, fkwVar);
            this.f12172lh.ouw.add(this.vt);
            com.bytedance.sdk.openadsdk.component.reward.view.bly blyVarOuw = this.vt.ouw();
            if (blyVarOuw == null) {
                return;
            }
            ViewParent parent = blyVarOuw.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(blyVarOuw);
            }
            if (!yuVar.f12153ko) {
                float fCoz = vppVar.coz();
                if (fCoz > 0.0f) {
                    this.ouw.setWidthAndHeightRatio(fCoz);
                } else {
                    this.ouw.setWidthOrHeightInParentRatio(0.8f);
                }
            }
            com.bytedance.sdk.openadsdk.component.reward.view.vt vtVar2 = this.ouw;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            com.bytedance.sdk.openadsdk.core.le.lh lhVar = vtVar2.ouw;
            if (lhVar != null) {
                lhVar.addView(blyVarOuw, layoutParams);
            } else {
                vtVar2.addView(blyVarOuw, layoutParams);
            }
            this.ouw.setScene(this.vt);
        }

        public vt(ouw ouwVar, @NonNull View view) {
            super(view);
            this.f12172lh = ouwVar;
            this.ouw = (com.bytedance.sdk.openadsdk.component.reward.view.vt) view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.sdk.openadsdk.activity.lh
    /* JADX INFO: renamed from: jqy, reason: merged with bridge method [inline-methods] */
    public com.bytedance.sdk.openadsdk.activity.ouw mwh() {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.f12154le.findViewHolderForAdapterPosition(this.uq + 1);
        if (!(viewHolderFindViewHolderForAdapterPosition instanceof vt)) {
            return null;
        }
        com.bytedance.sdk.openadsdk.activity.ouw ouwVar = ((vt) viewHolderFindViewHolderForAdapterPosition).vt;
        if (ouwVar instanceof com.bytedance.sdk.openadsdk.activity.ouw) {
            return ouwVar;
        }
        return null;
    }

    public static /* synthetic */ int qbp(yu yuVar) {
        yuVar.rrs = -1;
        return -1;
    }

    public static /* synthetic */ boolean tc(yu yuVar) {
        yuVar.xdk = true;
        return true;
    }

    public static /* synthetic */ boolean vm(yu yuVar) {
        yuVar.osn = false;
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zin() {
        if (this.mwh.compareAndSet(false, true)) {
            AdSlot adSlot = this.vt.yiz;
            ksc kscVar = new ksc();
            kscVar.f12775le = true;
            vpp vppVar = this.vt;
            if (vppVar.f12886xn != null || vppVar.lht != null) {
                kscVar.bly = 2;
            }
            kscVar.f12777ra = this.jvy;
            this.f12157ra.ouw(com.bytedance.sdk.component.utils.vpp.ouw(this.ouw, "tt_loading_more"));
            if (com.bytedance.sdk.openadsdk.utils.vt.ouw()) {
                zih.lh().ouw(adSlot, kscVar, this.vt.lna, (qbp) new zin() { // from class: com.bytedance.sdk.openadsdk.activity.yu.18
                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                    public final void ouw(int i10, String str) {
                        yu.zin(yu.this);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.zin, com.bytedance.sdk.openadsdk.core.vpp.ouw
                    public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                        yu.ouw(yu.this, ouwVar, lhVar);
                    }
                });
            } else {
                zih.lh().ouw(adSlot, kscVar, this.vt.lna, new com.bytedance.sdk.openadsdk.core.vpp.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.yu.19
                    @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                    public final void ouw(int i10, String str) {
                        yu.zin(yu.this);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.vpp.ouw
                    public final void ouw(com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
                        yu.ouw(yu.this, ouwVar, lhVar);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final com.bytedance.sdk.openadsdk.component.reward.top.lh ryl() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void th() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vm() {
    }

    public static abstract class fkw extends RecyclerView.ViewHolder {
        public abstract void ouw(yu yuVar, C0105yu c0105yu, int i10);

        public fkw(@NonNull View view) {
            super(view);
        }
    }

    public yu(final Activity activity, final vpp vppVar, final com.bytedance.sdk.openadsdk.activity.vt vtVar) {
        ex exVar;
        ex exVar2;
        super(activity, vppVar, vtVar);
        this.tlj = new Handler(Looper.getMainLooper(), this);
        this.mwh = new AtomicBoolean(false);
        this.f12151jg = new HashSet<>();
        this.zih = new HashSet<>();
        this.f12160th = new ArrayList<>();
        this.vpp = 5;
        this.jqy = 3;
        this.uq = -1;
        this.fvf = new com.bytedance.sdk.openadsdk.activity.vt.fkw(1, null);
        boolean z10 = vppVar.fvf == 44;
        this.f12153ko = z10;
        boolean zEy = vppVar.ey();
        this.ryl = zEy;
        this.f12158rn = cf.ouw(activity, vppVar) == 1;
        com.bytedance.sdk.openadsdk.core.le.lh lhVar = new com.bytedance.sdk.openadsdk.core.le.lh(activity) { // from class: com.bytedance.sdk.openadsdk.activity.yu.1
            @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/yu$1;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
                DetectTouchUtils.viewOnTouch(g.f44975u, this, motionEvent);
                return safedk_yu$1_dispatchTouchEvent_7896937c5fd7de9f8f774cd16b422c80(motionEvent);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
            public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                if (1 == 0) {
                    setMeasuredDimension(0, 0);
                } else {
                    super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                }
            }

            public boolean safedk_yu$1_dispatchTouchEvent_7896937c5fd7de9f8f774cd16b422c80(MotionEvent p10) {
                yu.this.lso = null;
                return super.dispatchTouchEvent(p10);
            }
        };
        this.f12149cf = lhVar;
        if (Build.VERSION.SDK_INT >= 35) {
            lhVar.setFitsSystemWindows(true);
        }
        activity.setContentView(lhVar);
        this.fkw = String.valueOf(activity.hashCode());
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar = vppVar.f12885vm;
        if (ouwVar != null && (exVar2 = ouwVar.f12793le) != null) {
            this.osn = exVar2.ouw == 1;
            this.ey = exVar2.bly;
            int iMax = Math.max(0, exVar2.f12747le);
            this.bs = iMax;
            this.fak = iMax;
            this.f12155od = exVar2.f12748lh == 1;
            this.ksc = exVar2.yu == 1;
            int i10 = exVar2.f12749ra;
            this.f12159tc = i10;
            this.jvy = exVar2.f12744cf;
            this.ex = exVar2.fkw == 1;
            this.zin = exVar2.f12745jg == 1;
            this.fqk = i10 > 0;
            this.vpp = exVar2.ryl;
            this.jqy = exVar2.mwh;
            this.lso = exVar2.ouw();
            pd pdVar = exVar2.f12746ko;
            this.f12161ub = pdVar != null ? pdVar.fkw : null;
            if (!this.ksc) {
                this.osn = false;
            }
        }
        if (zEy) {
            int i11 = vppVar.myk;
            if (i11 < 0) {
                zih.yu();
                i11 = com.bytedance.sdk.openadsdk.core.settings.cf.qbp(String.valueOf(vppVar.fqk())).f13074le;
            }
            this.jae = (int) ((1.0f - (Math.max(0, Math.min(100, i11)) / 100.0f)) * this.bs);
        }
        RecyclerView recyclerView = new RecyclerView(activity);
        this.f12154le = recyclerView;
        ex.ouw ouwVar2 = this.ey;
        if (ouwVar2 != null) {
            int i12 = ouwVar2.ouw;
            int i13 = ouwVar2.vt;
            if (i12 > 0 || i13 > 0) {
                recyclerView.setPadding(osn.ouw(activity, i12), 0, osn.ouw(activity, i13), 0);
            }
            ex.ouw ouwVar3 = this.ey;
            int i14 = ouwVar3.f12753lh;
            int i15 = ouwVar3.yu;
            int i16 = ouwVar3.fkw;
            if (i14 > 0 || i16 > 0 || i15 > 0) {
                final int iOuw = osn.ouw(activity, i14);
                final int iOuw2 = osn.ouw(activity, i15);
                final int iOuw3 = osn.ouw(activity, i16);
                recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.bytedance.sdk.openadsdk.activity.yu.12
                    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                    public final void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView2, @NonNull RecyclerView.State state) {
                        int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                        int itemCount = recyclerView2.getAdapter().getItemCount();
                        if (childAdapterPosition == 0) {
                            rect.top = iOuw;
                        } else {
                            rect.top = iOuw3 / 2;
                        }
                        if (childAdapterPosition == itemCount - 1) {
                            rect.bottom = iOuw2;
                        } else {
                            rect.bottom = iOuw3 / 2;
                        }
                    }
                });
            }
        }
        lhVar.addView(recyclerView, new FrameLayout.LayoutParams(-1, -1));
        TopLayoutDislike2 topLayoutDislike2 = new TopLayoutDislike2(activity);
        this.bly = topLayoutDislike2;
        lhVar.addView(topLayoutDislike2, new FrameLayout.LayoutParams(-1, -2));
        topLayoutDislike2.load(vppVar);
        topLayoutDislike2.setShowDislike(true);
        topLayoutDislike2.setShowSound(true);
        zih.yu();
        boolean zRyl = com.bytedance.sdk.openadsdk.core.settings.cf.ryl(String.valueOf(vppVar.fqk()));
        this.f12148cd = zRyl;
        topLayoutDislike2.setSoundMute(zRyl);
        topLayoutDislike2.setListener(new com.bytedance.sdk.openadsdk.component.reward.top.vt() { // from class: com.bytedance.sdk.openadsdk.activity.yu.13
            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw() {
                com.bytedance.sdk.openadsdk.core.ryl.yu yuVar;
                vpp vppVar2 = vppVar;
                com.bytedance.sdk.openadsdk.yu.lh.ouw("skip", vppVar2, vppVar2.vt(), (Map<String, Object>) null);
                com.bytedance.sdk.openadsdk.core.model.yu yuVarSd = vppVar.sd();
                if (yuVarSd != null && (yuVar = yuVarSd.ouw) != null) {
                    yuVar.fkw(0L);
                    yuVar.yu(0L);
                }
                yu.ouw(yu.this);
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void yu() {
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void lh() {
                vtVar.vt();
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void vt() {
                if (yu.this.f12156pd != null) {
                    yu.this.f12156pd.f_();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.top.vt
            public final void ouw(String str) {
                if (yu.this.f12156pd != null) {
                    yu.this.f12156pd.ouw(str);
                    yu yuVar = yu.this;
                    yuVar.f12148cd = !yuVar.f12148cd;
                }
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(activity) { // from class: com.bytedance.sdk.openadsdk.activity.yu.14
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
                super.calculateExtraLayoutSpace(state, iArr);
                int height = yu.this.f12154le.getHeight() * 1;
                iArr[0] = height;
                iArr[1] = height;
            }
        };
        this.pno = linearLayoutManager;
        recyclerView.setLayoutManager(linearLayoutManager);
        ouw ouwVar4 = new ouw(this, vppVar.f12885vm.yu);
        this.f12157ra = ouwVar4;
        recyclerView.setAdapter(ouwVar4);
        if (!this.fqk && !this.ex) {
            ouwVar4.ouw(com.bytedance.sdk.component.utils.vpp.ouw(activity, "tt_list_end_tip"));
        }
        if (z10) {
            new PagerSnapHelper().attachToRecyclerView(recyclerView);
        } else if (this.ksc) {
            new com.bytedance.sdk.openadsdk.component.reward.view.ouw().attachToRecyclerView(recyclerView);
        }
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.bytedance.sdk.openadsdk.activity.yu.15
            private int fkw;

            /* JADX INFO: renamed from: lh, reason: collision with root package name */
            private final Rect f12166lh = new Rect();
            private int yu = -1;

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrollStateChanged(@NonNull RecyclerView recyclerView2, int i17) {
                boolean z11;
                super.onScrollStateChanged(recyclerView2, i17);
                if (com.bytedance.sdk.component.utils.vt.ouw(activity)) {
                    return;
                }
                int iFindFirstCompletelyVisibleItemPosition = yu.this.pno.findFirstCompletelyVisibleItemPosition();
                yu.this.pno.findFirstVisibleItemPosition();
                int iFindLastVisibleItemPosition = yu.this.pno.findLastVisibleItemPosition();
                if (iFindFirstCompletelyVisibleItemPosition < 0) {
                    return;
                }
                if (i17 == 0 && iFindFirstCompletelyVisibleItemPosition != yu.this.uq) {
                    boolean z12 = true;
                    if (iFindFirstCompletelyVisibleItemPosition == yu.this.rrs) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    yu yuVar = yu.this;
                    if (!yuVar.osn || !z11) {
                        z12 = false;
                    }
                    yu.ouw(yuVar, iFindFirstCompletelyVisibleItemPosition, z12);
                    if (yu.this.osn && !z11 && yu.this.f12155od) {
                        yu.vm(yu.this);
                    }
                    if (yu.this.yib != null) {
                        yu.this.yib.yu();
                        yu.this.yib = null;
                    }
                }
                if (i17 == 0) {
                    yu.qbp(yu.this);
                }
                if (yu.this.fqk && yu.this.f12159tc > 0 && iFindLastVisibleItemPosition >= yu.this.f12157ra.ouw() - yu.this.f12159tc) {
                    yu.this.zin();
                }
            }

            /* JADX WARN: Code duplicated, block: B:25:0x0078  */
            /* JADX WARN: Code duplicated, block: B:27:0x0086  */
            /* JADX WARN: Code duplicated, block: B:29:0x008e  */
            /* JADX WARN: Code duplicated, block: B:32:0x0099  */
            /* JADX WARN: Code duplicated, block: B:66:0x009b A[SYNTHETIC] */
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(@NonNull RecyclerView recyclerView2, int i17, int i18) {
                int iVt;
                View viewFindViewByPosition;
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
                vt vtVar2;
                super.onScrolled(recyclerView2, i17, i18);
                if (i18 != 0 && !com.bytedance.sdk.component.utils.vt.ouw(activity)) {
                    if (yu.this.zin && (iVt = yu.this.f12157ra.vt()) != 0) {
                        int iFindFirstVisibleItemPosition = yu.this.pno.findFirstVisibleItemPosition();
                        int iFindLastVisibleItemPosition = yu.this.pno.findLastVisibleItemPosition();
                        if (iFindLastVisibleItemPosition % iVt > this.yu) {
                            for (int i19 = iFindFirstVisibleItemPosition; i19 <= iFindLastVisibleItemPosition; i19++) {
                                int i20 = i19 % iVt;
                                if (i20 > this.yu) {
                                    if ((i19 == iFindFirstVisibleItemPosition || i19 == iFindLastVisibleItemPosition) && (viewFindViewByPosition = yu.this.pno.findViewByPosition(i19)) != null) {
                                        this.f12166lh.setEmpty();
                                        viewFindViewByPosition.getGlobalVisibleRect(this.f12166lh);
                                        int height = viewFindViewByPosition.getHeight();
                                        if (height > 0 && (this.f12166lh.height() * 1.0f) / height >= 0.5f) {
                                            viewHolderFindViewHolderForAdapterPosition = yu.this.f12154le.findViewHolderForAdapterPosition(i19);
                                            if (viewHolderFindViewHolderForAdapterPosition instanceof vt) {
                                                vtVar2 = (vt) viewHolderFindViewHolderForAdapterPosition;
                                                if (vtVar2.vt != null) {
                                                    vtVar2.vt.od();
                                                }
                                            }
                                            if (i20 > this.yu) {
                                                this.yu = i20;
                                            }
                                        }
                                    } else {
                                        viewHolderFindViewHolderForAdapterPosition = yu.this.f12154le.findViewHolderForAdapterPosition(i19);
                                        if (viewHolderFindViewHolderForAdapterPosition instanceof vt) {
                                            vtVar2 = (vt) viewHolderFindViewHolderForAdapterPosition;
                                            if (vtVar2.vt != null) {
                                                vtVar2.vt.od();
                                            }
                                        }
                                        if (i20 > this.yu) {
                                            this.yu = i20;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int iFindLastVisibleItemPosition2 = yu.this.pno.findLastVisibleItemPosition();
                    if (i18 > 0 && yu.this.fqk && yu.this.f12159tc > 0 && iFindLastVisibleItemPosition2 >= yu.this.f12157ra.ouw() - yu.this.f12159tc) {
                        yu.this.zin();
                    }
                    if (this.fkw != iFindLastVisibleItemPosition2) {
                        this.fkw = iFindLastVisibleItemPosition2;
                        if (!yu.this.zih.isEmpty() && yu.this.zih.contains(Integer.valueOf(iFindLastVisibleItemPosition2))) {
                            yu.this.zih.remove(Integer.valueOf(iFindLastVisibleItemPosition2));
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(iFindLastVisibleItemPosition2);
                            if (viewHolderFindViewHolderForAdapterPosition2 instanceof vt) {
                                vt vtVar3 = (vt) viewHolderFindViewHolderForAdapterPosition2;
                                vtVar3.vt.f12111th = true;
                                vtVar3.vt.uq();
                                return;
                            }
                            return;
                        }
                        if (yu.this.f12152kn) {
                            yu.mwh(yu.this);
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition3 = recyclerView2.findViewHolderForAdapterPosition(iFindLastVisibleItemPosition2);
                            if (viewHolderFindViewHolderForAdapterPosition3 instanceof vt) {
                                vt vtVar4 = (vt) viewHolderFindViewHolderForAdapterPosition3;
                                if (vtVar4.vt instanceof com.bytedance.sdk.openadsdk.activity.ouw) {
                                    vtVar4.vt.f12111th = true;
                                    vtVar4.vt.cd();
                                }
                            }
                        }
                    }
                }
            }
        });
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar5 = this.vt.f12885vm;
        if (ouwVar5 != null && (exVar = ouwVar5.f12793le) != null && !TextUtils.isEmpty(exVar.pno)) {
            this.uoy = new com.bytedance.sdk.openadsdk.activity.fkw(this.yu, this.vt, -1, 1, false, false, true);
        }
        final int iQbp = qbp();
        recyclerView.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.yu.16
            @Override // java.lang.Runnable
            public final void run() {
                if (com.bytedance.sdk.component.utils.vt.ouw(activity)) {
                    return;
                }
                yu.ouw(yu.this, iQbp, true);
            }
        });
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(activity, vppVar);
        this.f12163vm = pAGLogoViewCreatePAGLogoViewByMaterial;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        layoutParams.leftMargin = osn.ouw(activity, 16.0f);
        lhVar.addView(pAGLogoViewCreatePAGLogoViewByMaterial, layoutParams);
        pAGLogoViewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.yu.17
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/yu$17;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_yu$17_onClick_52c5fcda56366de7334a02556f50e34f(view);
            }

            public void safedk_yu$17_onClick_52c5fcda56366de7334a02556f50e34f(View p10) {
                Context context = p10.getContext();
                vpp vppVar2 = vppVar;
                TTWebsiteActivity.ouw(context, vppVar2, vppVar2.vt());
            }
        });
        this.qbp = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("draw_feed_item_reuse", 0) == 1;
    }

    private void ex() {
        pno pnoVar;
        if (!this.ryl || this.yu.f12126rn || (pnoVar = this.f12156pd) == null) {
            return;
        }
        pnoVar.ub();
    }

    private void ksc() {
        if (this.myk) {
            this.zvq = System.currentTimeMillis();
        }
        this.tlj.removeMessages(1);
        le leVar = this.yib;
        if (leVar != null) {
            leVar.vt();
        }
    }

    public static /* synthetic */ boolean mwh(yu yuVar) {
        yuVar.f12152kn = false;
        return false;
    }

    private int qbp() {
        if (!this.ex || this.f12157ra.vt || this.mwh.get() || this.fqk) {
            return 0;
        }
        int iVt = vt(this.uq, this.f12157ra.vt());
        this.f12157ra.ouw(this.uq, iVt);
        if (this.uq < 0) {
            this.f12154le.scrollToPosition(iVt);
        } else {
            this.uq = iVt;
        }
        return iVt;
    }

    private void tc() {
        if (this.zvq != 0) {
            pno pnoVar = this.f12156pd;
            if (pnoVar != null && od.vt(pnoVar.f12108le)) {
                int iCurrentTimeMillis = this.bs - ((int) ((System.currentTimeMillis() - this.zvq) / 1000));
                this.bs = iCurrentTimeMillis;
                if (iCurrentTimeMillis < 0) {
                    this.bs = 0;
                }
            }
            this.zvq = 0L;
        }
        if (this.bs >= 0) {
            this.tlj.removeMessages(1);
            this.tlj.sendEmptyMessage(1);
        }
        le leVar = this.yib;
        if (leVar != null) {
            leVar.lh();
        }
    }

    private void vpp() {
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.yu.5
            @Override // java.lang.Runnable
            public final void run() {
                if (com.bytedance.sdk.component.utils.vt.ouw(yu.this.ouw)) {
                    return;
                }
                yu.this.mwh.set(false);
                if (!yu.this.ex) {
                    yu.this.f12157ra.ouw(com.bytedance.sdk.component.utils.vpp.ouw(zih.ouw(), "tt_list_end_tip"));
                } else {
                    yu.this.f12157ra.ouw("");
                    yu.jqy(yu.this);
                }
            }
        });
    }

    private static int vt(int i10, int i11) {
        if (i10 < 0) {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 + 1073741823;
            if (i13 % i11 == i10) {
                return i13;
            }
            int i14 = 1073741823 - i12;
            if (i14 % i11 == i10) {
                return i14;
            }
        }
        return 1073741823;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final pno cf() {
        return this.f12156pd;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final boolean fkw() {
        return this.f12148cd;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(@NonNull Message message) {
        FrameLayout frameLayout;
        if (this.ucs) {
            this.f12160th.add(this.tlj.obtainMessage(message.what, message.arg1, message.arg2, message.obj));
            return false;
        }
        int i10 = message.what;
        if (i10 == 1) {
            int i11 = this.bs;
            if (i11 > 0) {
                if (i11 <= this.jae) {
                    ex();
                }
                int i12 = this.fak;
                int i13 = (int) ((((double) (i12 - this.bs)) * 100.0d) / ((double) i12));
                TopLayoutDislike2 topLayoutDislike2 = this.bly;
                StringBuilder sb2 = new StringBuilder();
                int i14 = this.bs;
                this.bs = i14 - 1;
                sb2.append(i14);
                sb2.append("s");
                topLayoutDislike2.setCountDownFor1InN(sb2.toString(), i13);
                if (this.bs >= 0) {
                    this.tlj.removeMessages(message.what);
                    this.tlj.sendEmptyMessageDelayed(message.what, 1000L);
                }
            } else {
                ex();
                if (yu()) {
                    this.bly.showSkipButton();
                } else {
                    this.bly.showCloseButton();
                }
            }
        } else if (i10 != 3) {
            if (i10 == 4 && (frameLayout = this.hun) != null) {
                ViewParent parent = frameLayout.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.hun);
                }
                this.hun = null;
                pno pnoVar = this.f12156pd;
                if (pnoVar instanceof com.bytedance.sdk.openadsdk.activity.ouw) {
                    ((com.bytedance.sdk.openadsdk.activity.ouw) pnoVar).fvf();
                }
                tc();
                Message message2 = this.f12162vh;
                if (message2 != null) {
                    handleMessage(message2);
                    this.f12162vh = null;
                }
            }
        } else if (this.hun == null && this.lso != null && !this.xdk) {
            this.ux = true;
            this.hun = new com.bytedance.sdk.openadsdk.core.le.lh(this.ouw) { // from class: com.bytedance.sdk.openadsdk.activity.yu.10
                @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.view.ViewGroup, android.view.View
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/yu$10;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
                    DetectTouchUtils.viewOnTouch(g.f44975u, this, motionEvent);
                    return safedk_yu$10_dispatchTouchEvent_5ef6b90c1d006dd0964849f0aac664e3(motionEvent);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.bytedance.sdk.openadsdk.core.le.lh, android.widget.FrameLayout, android.view.View
                public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
                    if (1 == 0) {
                        setMeasuredDimension(0, 0);
                    } else {
                        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
                    }
                }

                public boolean safedk_yu$10_dispatchTouchEvent_5ef6b90c1d006dd0964849f0aac664e3(MotionEvent p10) {
                    yu.this.tlj.removeMessages(4);
                    yu.this.tlj.sendEmptyMessage(4);
                    return super.dispatchTouchEvent(p10);
                }
            };
            View view = this.mt;
            if (view != null && view.getParent() == null) {
                this.hun.addView(this.mt, new FrameLayout.LayoutParams(-1, -1));
            }
            this.f12149cf.addView(this.hun, new FrameLayout.LayoutParams(-1, -1));
            this.tlj.sendEmptyMessageDelayed(4, ((long) this.jqy) * 1000);
            pno pnoVar2 = this.f12156pd;
            if (pnoVar2 instanceof com.bytedance.sdk.openadsdk.activity.ouw) {
                ((com.bytedance.sdk.openadsdk.activity.ouw) pnoVar2).pd();
            }
            ksc();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final List<vpp> ko() {
        return this.f12157ra.lh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void lh() {
        super.lh();
        this.ucs = true;
        pno pnoVar = this.f12156pd;
        if (pnoVar != null) {
            pnoVar.jg();
        }
        ksc();
        this.yhj = this.yib != null;
        this.tlj.removeMessages(3);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final int pno() {
        return this.bs;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void rn() {
        if (this.wp) {
            return;
        }
        this.wp = true;
        final long jElapsedRealtime = SystemClock.elapsedRealtime() - this.pv;
        long jCurrentTimeMillis = System.currentTimeMillis();
        vpp vppVar = this.vt;
        com.bytedance.sdk.openadsdk.yu.lh.ouw(jCurrentTimeMillis, vppVar, vppVar.vt(), "first_ad_loaded", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.yu.11
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", jElapsedRealtime);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final int tlj() {
        return this.f12151jg.size();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final boolean yu() {
        return this.uoy != null;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void zih() {
        super.zih();
        this.myk = true;
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.activity.yu$yu, reason: collision with other inner class name */
    public static class C0105yu {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public String f12173lh;
        public int ouw = 0;
        public vpp vt;

        public C0105yu(vpp vppVar) {
            this.vt = vppVar;
        }

        public C0105yu(String str) {
            this.f12173lh = str;
        }
    }

    private void vt(pno pnoVar) {
        for (pno pnoVar2 : this.f12157ra.ouw) {
            if (pnoVar2 != pnoVar) {
                pnoVar2.ouw(this.f12156pd, pnoVar, this.fvf);
            }
        }
        com.bytedance.sdk.openadsdk.activity.fkw fkwVar = this.uoy;
        if (fkwVar != null && fkwVar != pnoVar) {
            fkwVar.ouw(this.f12156pd, pnoVar, this.fvf);
        }
        pno pnoVar3 = this.f12156pd;
        this.f12156pd = pnoVar;
        if (pnoVar3 != null) {
            pnoVar3.ryl = false;
            pnoVar3.jg();
            pnoVar3.yu();
        }
        pnoVar.ryl = true;
        pnoVar.vt(this.ouw, new com.bytedance.sdk.openadsdk.activity.vt.fkw(1, null));
        com.bytedance.sdk.openadsdk.component.reward.view.bly blyVarOuw = pnoVar.ouw();
        if (blyVarOuw.getVisibility() != 0) {
            blyVarOuw.setVisibility(0);
        }
        if (blyVarOuw.getParent() == null) {
            this.f12149cf.addView(blyVarOuw, new FrameLayout.LayoutParams(-1, -1));
        }
        this.yu.lh(pnoVar);
        if (pnoVar.g_() != this.f12148cd) {
            pnoVar.ouw("card_sync");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(Bundle bundle) {
        super.ouw(bundle);
        if (this.lso != null) {
            com.bytedance.sdk.openadsdk.core.cf.bly.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.cf.bly.ouw(this.ouw);
            JSONObject jSONObject = this.lso;
            JSONObject jSONObjectVt = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.vt();
            JSONObject jSONObject2 = this.f12161ub;
            com.bytedance.sdk.openadsdk.core.cf.ra.yu yuVar = new com.bytedance.sdk.openadsdk.core.cf.ra.yu() { // from class: com.bytedance.sdk.openadsdk.activity.yu.9
                @Override // com.bytedance.sdk.openadsdk.core.cf.ra.yu
                public final void ouw(int i10, String str) {
                    yu.tc(yu.this);
                }

                @Override // com.bytedance.sdk.openadsdk.core.cf.ra.yu
                public final void ouw(com.bytedance.adsdk.ugeno.vt.lh<View> lhVar) {
                    View view = lhVar.fkw;
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                    yu.this.mt = view;
                    if (yu.this.hun != null) {
                        yu.this.hun.addView(view, new FrameLayout.LayoutParams(-1, -1));
                    }
                }
            };
            if (Looper.myLooper() == Looper.getMainLooper()) {
                ouwVar.ouw(jSONObject, jSONObjectVt, jSONObject2, yuVar);
            } else {
                bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.cf.bly.ouw.1

                    /* JADX INFO: renamed from: lh */
                    public final /* synthetic */ JSONObject f12597lh;
                    public final /* synthetic */ JSONObject ouw;
                    public final /* synthetic */ JSONObject vt;
                    public final /* synthetic */ yu yu;

                    public AnonymousClass1() {
                        jSONObject = jSONObject;
                        jSONObject = jSONObjectVt;
                        jSONObject = jSONObject2;
                        yuVar = yuVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ouw.this.ouw(jSONObject, jSONObject, jSONObject, yuVar);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void jqy(yu yuVar) {
        if (yuVar.fqk) {
            return;
        }
        if (yuVar.ex) {
            yuVar.qbp();
        } else {
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.yu.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.bytedance.sdk.component.utils.vt.ouw(yu.this.ouw)) {
                        return;
                    }
                    yu.this.f12157ra.ouw(com.bytedance.sdk.component.utils.vpp.ouw(zih.ouw(), "tt_list_end_tip"));
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(final pno pnoVar, pno pnoVar2, com.bytedance.sdk.openadsdk.activity.vt.fkw fkwVar) {
        long j10;
        if (pnoVar != this.f12156pd) {
            return;
        }
        if (pnoVar.jae() || od.vt(pnoVar.f12108le)) {
            j10 = 500;
        } else {
            tc tcVar = pnoVar.f12108le.ccd;
            j10 = tcVar != null ? ((long) tcVar.ouw) * 1000 : 0L;
        }
        le leVar = this.yib;
        if (leVar != null) {
            leVar.yu();
        }
        le leVar2 = new le(Math.max(500L, j10)) { // from class: com.bytedance.sdk.openadsdk.activity.yu.7
            @Override // com.bytedance.sdk.openadsdk.activity.yu.le
            public final void ouw() {
                if (com.bytedance.sdk.component.utils.vt.ouw(yu.this.ouw)) {
                    return;
                }
                yu.ouw(yu.this, pnoVar);
            }
        };
        this.yib = leVar2;
        leVar2.fkw();
    }

    public static /* synthetic */ void zin(yu yuVar) {
        yuVar.fqk = false;
        yuVar.vpp();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(boolean z10) {
        super.ouw(z10);
        pno pnoVar = this.f12156pd;
        if (pnoVar != null) {
            pnoVar.vt(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final boolean ouw(pno pnoVar, int i10) {
        com.bytedance.sdk.openadsdk.activity.fkw fkwVar = this.uoy;
        return fkwVar != null && fkwVar == pnoVar;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vt(Activity activity) {
        super.vt(activity);
        osn.ouw(activity);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(View view) {
        super.ouw(view);
        if (view.getParent() != null) {
            return;
        }
        view.setVisibility(4);
        this.f12149cf.addView(view, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vt() {
        super.vt();
        this.ucs = false;
        this.myk = false;
        pno pnoVar = this.f12156pd;
        if (pnoVar != null && !this.yhj) {
            pnoVar.lh();
        }
        if (this.pv == 0) {
            this.pv = SystemClock.elapsedRealtime();
        }
        tc();
        if (!this.ux && this.lso != null) {
            this.tlj.removeMessages(3);
            this.tlj.sendEmptyMessageDelayed(3, ((long) this.vpp) * 1000);
        }
        Iterator<Message> it = this.f12160th.iterator();
        while (it.hasNext()) {
            handleMessage(it.next());
        }
        this.f12160th.clear();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(Activity activity) {
        super.ouw(activity);
        pno pnoVar = this.f12156pd;
        if (pnoVar != null) {
            pnoVar.vt(activity);
        }
        com.bytedance.sdk.openadsdk.activity.fkw fkwVar = this.uoy;
        if (fkwVar != null) {
            fkwVar.qbp();
        }
        Iterator<pno> it = this.f12157ra.ouw.iterator();
        while (it.hasNext()) {
            it.next().qbp();
        }
        this.tlj.removeCallbacksAndMessages(null);
        le leVar = this.yib;
        if (leVar != null) {
            leVar.yu();
            this.yib = null;
        }
        pno pnoVar2 = this.f12156pd;
        if (pnoVar2 == null || pnoVar2.jqy() || this.vt.f12887zn) {
            return;
        }
        jg.vt().post(new com.bytedance.sdk.openadsdk.activity.vt.lh(this.vt));
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void vt(pno pnoVar, int i10) {
        pno pnoVar2 = this.f12156pd;
        if (pnoVar != pnoVar2) {
            return;
        }
        if (i10 == 2) {
            ksc();
            return;
        }
        boolean z10 = false;
        if (i10 != 1) {
            if (i10 == 3 || i10 == 4) {
                try {
                    pnoVar2.ksc().ex.zih();
                    return;
                } catch (Throwable th2) {
                    com.bytedance.sdk.component.utils.qbp.yu("CardsLayoutManager", th2);
                    return;
                }
            }
            return;
        }
        FrameLayout frameLayout = this.hun;
        if (frameLayout != null && frameLayout.getParent() != null) {
            z10 = true;
        }
        if (z10) {
            pno pnoVar3 = this.f12156pd;
            if (pnoVar3 instanceof com.bytedance.sdk.openadsdk.activity.ouw) {
                ((com.bytedance.sdk.openadsdk.activity.ouw) pnoVar3).pd();
                return;
            }
            return;
        }
        tc();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.lh
    public final void ouw(Map<String, Object> map, pno pnoVar) {
        Object jSONObject = map.get("pag_json_data");
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (jSONObject instanceof JSONObject) {
            try {
                com.bytedance.sdk.openadsdk.component.reward.view.bly blyVarOuw = pnoVar.ouw();
                ((JSONObject) jSONObject).put("width", blyVarOuw.getWidth());
                ((JSONObject) jSONObject).put("height", blyVarOuw.getHeight());
                int i10 = pnoVar.tlj;
                int i11 = 1;
                ((JSONObject) jSONObject).put("click_feed_top", i10 == this.pno.findFirstVisibleItemPosition() ? 1 : 0);
                JSONObject jSONObject2 = (JSONObject) jSONObject;
                if (i10 != this.f12157ra.vt()) {
                    i11 = 0;
                }
                jSONObject2.put("click_on_final", i11);
                ((JSONObject) jSONObject).put("click_countdown_remaining", this.bs);
                ((JSONObject) jSONObject).put("click_user_remaining", i10 == this.uq ? (SystemClock.elapsedRealtime() - this.f12150cj) / 1000 : 0L);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void ouw(yu yuVar) {
        com.bytedance.sdk.openadsdk.activity.fkw fkwVar = yuVar.uoy;
        if (fkwVar != null && fkwVar.od()) {
            yuVar.vt(yuVar.uoy);
            yuVar.f12149cf.removeView(yuVar.f12154le);
            yuVar.bly.setVisibility(8);
            yuVar.f12163vm.setVisibility(8);
            return;
        }
        yuVar.yu.vt();
    }

    public static /* synthetic */ void ouw(yu yuVar, int i10, boolean z10) {
        int i11;
        String str;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = yuVar.f12154le.findViewHolderForAdapterPosition(i10);
        if (viewHolderFindViewHolderForAdapterPosition == null || !(viewHolderFindViewHolderForAdapterPosition instanceof vt) || (i11 = yuVar.uq) == i10) {
            return;
        }
        if (i11 >= 0 && i10 >= 0 && i11 != i10) {
            if (z10) {
                str = "auto_down";
            } else {
                str = i10 > i11 ? "down" : "up";
            }
            final String str2 = str;
            final long jElapsedRealtime = (SystemClock.elapsedRealtime() - yuVar.f12150cj) / 1000;
            List<vpp> listLh = yuVar.f12157ra.lh();
            final int size = i11 % listLh.size();
            final int size2 = i10 % listLh.size();
            vpp vppVar = listLh.get(size);
            com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), vppVar, vppVar.vt(), "slide", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.yu.6
                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject ouw() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(TypedValues.TransitionType.S_FROM, size + 1);
                        jSONObject.put(TypedValues.TransitionType.S_TO, size2 + 1);
                        jSONObject.put("direction", str2);
                        jSONObject.put("click_user_remaining", jElapsedRealtime);
                        return jSONObject;
                    } catch (Exception unused) {
                        return null;
                    }
                }
            });
        }
        yuVar.uq = i10;
        yuVar.f12150cj = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.activity.ouw ouwVar = ((vt) viewHolderFindViewHolderForAdapterPosition).vt;
        if (ouwVar != null) {
            yuVar.vt(ouwVar);
            yuVar.f12151jg.add(ouwVar.f12108le.tlj());
            if (yuVar.fqk && yuVar.f12159tc > 0 && yuVar.uq >= yuVar.f12157ra.ouw() - yuVar.f12159tc) {
                yuVar.zin();
            }
            com.bytedance.sdk.openadsdk.activity.ouw ouwVarMwh = yuVar.mwh();
            if (ouwVarMwh != null) {
                if (!yuVar.f12153ko && yuVar.pno.findLastVisibleItemPosition() >= yuVar.uq + 1) {
                    ouwVarMwh.f12111th = true;
                }
                yuVar.zih.add(Integer.valueOf(yuVar.uq + 1));
                ouwVarMwh.cd();
                yuVar.f12152kn = false;
                return;
            }
            yuVar.f12152kn = true;
        }
    }

    public static /* synthetic */ void ouw(yu yuVar, final com.bytedance.sdk.openadsdk.core.model.ouw ouwVar, com.bytedance.sdk.openadsdk.core.model.lh lhVar) {
        yuVar.fqk = false;
        List<vpp> list = ouwVar.yu;
        if (list != null && !list.isEmpty()) {
            ex exVar = ouwVar.f12793le;
            if (exVar != null) {
                yuVar.jvy = exVar.f12744cf;
                yuVar.fqk = exVar.tlj;
            }
            if (!yuVar.f12153ko) {
                for (vpp vppVar : ouwVar.yu) {
                    if (vppVar.f12874sd != null && vpp.fkw(vppVar)) {
                        com.bytedance.sdk.openadsdk.core.mwh.ouw.vt vtVarOuw = vpp.ouw(CacheDirFactory.getICacheDir(vppVar.f12875sm).ouw(), vppVar);
                        vtVarOuw.ouw("material_meta", vppVar);
                        vtVarOuw.ouw("ad_slot", vppVar.yiz);
                        com.bytedance.sdk.openadsdk.core.mwh.fkw.ouw.ouw(vtVarOuw, new com.bykv.vk.openvk.ouw.ouw.ouw.fkw.vt() { // from class: com.bytedance.sdk.openadsdk.activity.yu.3
                            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2, int i10) {
                            }

                            @Override // com.bykv.vk.openvk.ouw.ouw.ouw.fkw.ouw.InterfaceC0059ouw
                            public final void ouw(com.bykv.vk.openvk.ouw.ouw.ouw.lh.lh lhVar2, int i10, String str) {
                            }
                        });
                    }
                }
            }
            bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.yu.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.bytedance.sdk.component.utils.vt.ouw(yu.this.ouw)) {
                        return;
                    }
                    yu.this.mwh.set(false);
                    yu.this.f12157ra.ouw("");
                    yu.this.f12157ra.ouw(ouwVar.yu);
                    yu.jqy(yu.this);
                }
            });
            return;
        }
        lhVar.vt = -3;
        lhVar.f12783ra = 1;
        com.bytedance.sdk.openadsdk.core.model.lh.ouw(lhVar);
        yuVar.vpp();
    }

    public static /* synthetic */ void ouw(yu yuVar, pno pnoVar) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        pno pnoVar2 = yuVar.f12156pd;
        if (pnoVar == pnoVar2) {
            if (yuVar.osn) {
                if (yuVar.uq < yuVar.f12157ra.ouw() - 1) {
                    int i10 = yuVar.uq + 1;
                    yuVar.rrs = i10;
                    if (yuVar.f12153ko) {
                        yuVar.f12154le.smoothScrollToPosition(i10);
                    } else {
                        int iFindFirstVisibleItemPosition = yuVar.pno.findFirstVisibleItemPosition();
                        int iFindLastVisibleItemPosition = yuVar.pno.findLastVisibleItemPosition();
                        if (i10 < iFindFirstVisibleItemPosition) {
                            yuVar.f12154le.smoothScrollToPosition(i10);
                        } else if (i10 <= iFindLastVisibleItemPosition) {
                            int i11 = i10 - iFindFirstVisibleItemPosition;
                            int childCount = yuVar.f12154le.getChildCount();
                            if (i11 > 0 && i11 < childCount && (viewHolderFindViewHolderForAdapterPosition = yuVar.f12154le.findViewHolderForAdapterPosition(i10 - 1)) != null) {
                                yuVar.f12154le.smoothScrollBy(0, viewHolderFindViewHolderForAdapterPosition.itemView.getBottom());
                            }
                        } else {
                            yuVar.f12154le.smoothScrollToPosition(yuVar.rrs);
                        }
                    }
                } else {
                    yuVar.rrs = 0;
                    yuVar.f12154le.scrollToPosition(0);
                    yuVar.f12154le.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.yu.8
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (com.bytedance.sdk.component.utils.vt.ouw(yu.this.ouw)) {
                                return;
                            }
                            yu yuVar2 = yu.this;
                            yu.ouw(yuVar2, yuVar2.rrs, true);
                        }
                    });
                }
            } else if (yuVar.yhj) {
                pnoVar2.lh();
            } else {
                pnoVar2.rrs();
            }
            yuVar.yib = null;
            yuVar.yhj = false;
        }
    }
}
