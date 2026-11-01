package com.green.hand.library;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class EmojiGridAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List<Integer> f20897i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f20898j;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f20899b;

        public a(int i10) {
            this.f20899b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (EmojiGridAdapter.this.f20898j != null) {
                EmojiGridAdapter.this.f20898j.a(this.f20899b);
            }
        }
    }

    public interface b {
        void a(int i10);
    }

    public class c extends RecyclerView.ViewHolder {
        public c(ImageView imageView) {
            super(imageView);
        }
    }

    public void d(b bVar) {
        this.f20898j = bVar;
    }

    public void e(List<Integer> list) {
        this.f20897i.clear();
        this.f20897i.addAll(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f20897i.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i10) {
        ImageView imageView = (ImageView) viewHolder.itemView;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, y6.b.a(23.0f));
        layoutParams.topMargin = y6.b.a(10.0f);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(this.f20897i.get(i10).intValue());
        imageView.setOnClickListener(new a(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i10) {
        return new c(new ImageView(viewGroup.getContext()));
    }
}
