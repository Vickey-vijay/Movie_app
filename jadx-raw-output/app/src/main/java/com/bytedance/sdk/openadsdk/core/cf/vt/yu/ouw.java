package com.bytedance.sdk.openadsdk.core.cf.vt.yu;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.adsdk.ugeno.vt.lh;
import com.bytedance.adsdk.ugeno.yu;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class ouw extends FrameLayout {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private final List<lh> f12670lh;
    public final RecyclerView ouw;
    public yu vt;
    private final C0121ouw yu;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.cf.vt.yu.ouw$ouw, reason: collision with other inner class name */
    public class C0121ouw extends RecyclerView.Adapter<vt> {
        private C0121ouw() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i10) {
            return i10;
        }

        public /* synthetic */ C0121ouw(ouw ouwVar, byte b10) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ouw.this.f12670lh.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i10) {
            vt vtVar = (vt) viewHolder;
            lh lhVar = (lh) ouw.this.f12670lh.get(i10);
            View view = lhVar.fkw;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            vtVar.ouw.removeAllViews();
            vtVar.ouw.addView(view, new com.bytedance.adsdk.ugeno.yoga.vt.lh.ouw(lhVar.od(), lhVar.cd()));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @NonNull
        public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
            com.bytedance.adsdk.ugeno.yoga.vt.lh lhVar = new com.bytedance.adsdk.ugeno.yoga.vt.lh(viewGroup.getContext());
            lh lhVar2 = (lh) ouw.this.f12670lh.get(i10);
            lhVar.setLayoutParams(new ViewGroup.LayoutParams(lhVar2.od(), lhVar2.cd()));
            return new vt(lhVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44975u, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final void setOrientation(int i10) {
        if (i10 == 1) {
            this.ouw.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        } else {
            this.ouw.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
    }

    public static class vt extends RecyclerView.ViewHolder {
        public final ViewGroup ouw;

        public vt(@NonNull View view) {
            super(view);
            this.ouw = (ViewGroup) view;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.yu();
        }
        super.onLayout(z10, i10, i11, i12, i13);
        yu yuVar2 = this.vt;
        if (yuVar2 != null) {
            yuVar2.fkw();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        yu yuVar = this.vt;
        if (yuVar != null) {
            int[] iArrOuw = yuVar.ouw(i10, i11);
            super.onMeasure(iArrOuw[0], iArrOuw[1]);
        } else {
            super.onMeasure(i10, i11);
        }
        yu yuVar2 = this.vt;
        if (yuVar2 != null) {
            yuVar2.lh();
        }
    }

    public final void ouw(lh<View> lhVar) {
        if (lhVar == null) {
            return;
        }
        this.f12670lh.add(lhVar);
        C0121ouw c0121ouw = this.yu;
        if (c0121ouw != null) {
            c0121ouw.notifyDataSetChanged();
        }
    }

    public ouw(@NonNull Context context) {
        super(context);
        this.f12670lh = new CopyOnWriteArrayList();
        C0121ouw c0121ouw = new C0121ouw(this, (byte) 0);
        this.yu = c0121ouw;
        RecyclerView recyclerView = new RecyclerView(context);
        this.ouw = recyclerView;
        addView(recyclerView);
        recyclerView.setAdapter(c0121ouw);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        yu yuVar = this.vt;
        if (yuVar != null) {
            yuVar.vt(i10, i11);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }
}
