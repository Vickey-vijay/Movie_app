package com.mgs.carparking.widgets.cardbanner.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;

/* JADX INFO: loaded from: classes10.dex */
public class CardView extends RecyclerView implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public eb.a f42363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f42364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b f42365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f42366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f42367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f42368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f42369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f42370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f42371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f42372m;

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (CardView.this.f42370k > 0) {
                CardView cardView = CardView.this;
                cardView.scrollToPosition(268435455 >> (2 % cardView.f42370k));
            }
        }
    }

    public interface b {
        void a(View view);
    }

    public interface c {
        void a(int i10);

        void b(int i10, int i11);

        void c(int i10, int i11, int i12, int i13);
    }

    public interface d {
        void a(View view);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f42362c = false;
        return super.onTouchEvent(motionEvent);
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42364e = true;
        this.f42369j = true;
        this.f42371l = new a();
        setOverScrollMode(2);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b bVar = this.f42365f;
        if (bVar != null) {
            bVar.a(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i10) {
        View view;
        if (i10 == 0) {
            View viewC = c();
            this.f42366g = viewC;
            if (viewC != null && this.f42365f != null) {
                viewC.setOnClickListener(this);
            }
            d dVar = this.f42372m;
            if (dVar != null && (view = this.f42366g) != null) {
                dVar.a(view);
            }
        }
        c cVar = this.f42367h;
        if (cVar != null) {
            cVar.a(i10);
        }
    }

    public void setDataCount(int i10) {
        this.f42370k = i10;
    }

    public void setNeedLoop(boolean z10) {
        this.f42364e = z10;
    }

    public void setOnCenterItemClickListener(b bVar) {
        this.f42365f = bVar;
    }

    public void setOnScrollListener(c cVar) {
        this.f42367h = cVar;
    }

    public void setOnScrollPosition(d dVar) {
        this.f42372m = dVar;
    }

    public void setViewMode(eb.a aVar) {
        this.f42363d = aVar;
    }

    public View b(int i10, int i11) {
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            int left = childAt.getLeft();
            int top2 = childAt.getTop();
            int width = childAt.getWidth() + left;
            int height = childAt.getHeight() + top2;
            if (i10 >= left && i10 <= width && i11 >= top2 && i11 <= height) {
                return childAt;
            }
        }
        return null;
    }

    public View c() {
        if (getLayoutManager().canScrollVertically()) {
            return b(0, getHeight() / 2);
        }
        if (getLayoutManager().canScrollHorizontally()) {
            return b(getWidth() / 2, 0);
        }
        return null;
    }

    public void d(View view) {
        int i10;
        float x10;
        int width;
        if (getLayoutManager() instanceof LinearLayoutManager) {
            if (getLayoutManager().canScrollVertically()) {
                x10 = view.getY() + (view.getHeight() * 0.5f);
                width = getHeight();
            } else {
                if (getLayoutManager().canScrollHorizontally()) {
                    x10 = view.getX() + (view.getWidth() * 0.5f);
                    width = getWidth();
                } else {
                    i10 = 0;
                }
                smoothScrollBy(i10, i10);
                return;
            }
            i10 = (int) (x10 - (width * 0.5f));
            smoothScrollBy(i10, i10);
            return;
        }
        throw new IllegalArgumentException("CircleRecyclerView just support T extend LinearLayoutManager!");
    }

    public int getCurrentItem() {
        this.f42366g = c();
        try {
            return ((Integer) c().getTag(R.id.key_item)).intValue();
        } catch (Exception e10) {
            Log.i("cardView", e10.toString());
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.f42369j) {
            if (this.f42364e) {
                if (!this.f42368i) {
                    this.f42368i = true;
                    this.f42371l.sendEmptyMessage(0);
                }
                View viewC = c();
                this.f42366g = viewC;
                if (viewC != null) {
                    d(viewC);
                }
            }
            View view = this.f42366g;
            if (view != null) {
                view.setOnClickListener(this);
            }
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (this.f42363d != null) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                if (childAt != this.f42366g && this.f42365f != null) {
                    childAt.setOnClickListener(null);
                }
                this.f42363d.a(childAt, this);
            }
        }
        c cVar = this.f42367h;
        if (cVar != null) {
            cVar.c(i10, i11, i12, i13);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i10, int i11) {
        super.onScrolled(i10, i11);
        c cVar = this.f42367h;
        if (cVar != null) {
            cVar.b(i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        this.f42361b = adapter.getItemCount();
        super.setAdapter(adapter);
        if (this.f42369j) {
            this.f42369j = false;
        } else {
            this.f42371l.sendEmptyMessage(0);
        }
    }
}
