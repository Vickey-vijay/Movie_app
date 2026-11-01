package com.luck.picture.lib.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f8.x;
import f8.y;
import f8.z;

/* JADX INFO: loaded from: classes5.dex */
public class RecyclerPreloadView extends RecyclerView {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f32450j = RecyclerPreloadView.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f32451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f32453d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32454e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32455f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public x f32456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z f32457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public y f32458i;

    public RecyclerPreloadView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32451b = false;
        this.f32452c = false;
        this.f32455f = 1;
    }

    public void setReachBottomRow(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.f32455f = i10;
    }

    private void setLayoutManagerPosition(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            this.f32453d = gridLayoutManager.findFirstVisibleItemPosition();
            this.f32454e = gridLayoutManager.findLastVisibleItemPosition();
        } else if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            this.f32453d = linearLayoutManager.findFirstVisibleItemPosition();
            this.f32454e = linearLayoutManager.findLastVisibleItemPosition();
        }
    }

    public boolean a() {
        return this.f32452c;
    }

    public int getFirstVisiblePosition() {
        return this.f32453d;
    }

    public int getLastVisiblePosition() {
        return this.f32454e;
    }

    public void setEnabledLoadMore(boolean z10) {
        this.f32452c = z10;
    }

    public void setLastVisiblePosition(int i10) {
        this.f32454e = i10;
    }

    public void setOnRecyclerViewPreloadListener(x xVar) {
        this.f32456g = xVar;
    }

    public void setOnRecyclerViewScrollListener(y yVar) {
        this.f32458i = yVar;
    }

    public void setOnRecyclerViewScrollStateListener(z zVar) {
        this.f32457h = zVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i10) {
        z zVar;
        super.onScrollStateChanged(i10);
        if (i10 == 0 || i10 == 1) {
            setLayoutManagerPosition(getLayoutManager());
        }
        y yVar = this.f32458i;
        if (yVar != null) {
            yVar.a(i10);
        }
        if (i10 == 0 && (zVar = this.f32457h) != null) {
            zVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i10, int i11) {
        boolean z10;
        super.onScrolled(i10, i11);
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager != null) {
            setLayoutManagerPosition(layoutManager);
            if (this.f32456g != null && this.f32452c) {
                RecyclerView.Adapter adapter = getAdapter();
                if (adapter != null) {
                    if (layoutManager instanceof GridLayoutManager) {
                        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                        if (gridLayoutManager.findLastVisibleItemPosition() / gridLayoutManager.getSpanCount() >= (adapter.getItemCount() / gridLayoutManager.getSpanCount()) - this.f32455f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        this.f32451b = false;
                    } else if (!this.f32451b) {
                        this.f32456g.a();
                        if (i11 > 0) {
                            this.f32451b = true;
                        }
                    } else if (i11 == 0) {
                        this.f32451b = false;
                    }
                } else {
                    throw new RuntimeException("Adapter is null,Please check it!");
                }
            }
            y yVar = this.f32458i;
            if (yVar != null) {
                yVar.b(i10, i11);
            }
            if (this.f32457h != null) {
                if (Math.abs(i11) < 150) {
                    this.f32457h.a();
                    return;
                } else {
                    this.f32457h.b();
                    return;
                }
            }
            return;
        }
        throw new RuntimeException("LayoutManager is null,Please check it!");
    }

    public RecyclerPreloadView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32451b = false;
        this.f32452c = false;
        this.f32455f = 1;
    }
}
