package com.luck.picture.lib.animators;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import x7.a;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseAnimationAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RecyclerView.Adapter<RecyclerView.ViewHolder> f32136i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f32137j = 250;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Interpolator f32138k = new LinearInterpolator();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f32139l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f32140m = true;

    public abstract Animator[] c(View view);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f32136i.getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i10) {
        return this.f32136i.getItemId(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return this.f32136i.getItemViewType(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        this.f32136i.onBindViewHolder(viewHolder, i10);
        int adapterPosition = viewHolder.getAdapterPosition();
        if (this.f32140m && adapterPosition <= this.f32139l) {
            a.a(viewHolder.itemView);
            return;
        }
        for (Animator animator : c(viewHolder.itemView)) {
            animator.setDuration(this.f32137j).start();
            animator.setInterpolator(this.f32138k);
        }
        this.f32139l = adapterPosition;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        return this.f32136i.onCreateViewHolder(viewGroup, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        this.f32136i.onViewRecycled(viewHolder);
        super.onViewRecycled(viewHolder);
    }

    public BaseAnimationAdapter(RecyclerView.Adapter<RecyclerView.ViewHolder> adapter) {
        this.f32136i = adapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f32136i.onAttachedToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f32136i.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        this.f32136i.onViewAttachedToWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        this.f32136i.onViewDetachedFromWindow(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void registerAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.registerAdapterDataObserver(adapterDataObserver);
        this.f32136i.registerAdapterDataObserver(adapterDataObserver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void unregisterAdapterDataObserver(RecyclerView.AdapterDataObserver adapterDataObserver) {
        super.unregisterAdapterDataObserver(adapterDataObserver);
        this.f32136i.unregisterAdapterDataObserver(adapterDataObserver);
    }
}
