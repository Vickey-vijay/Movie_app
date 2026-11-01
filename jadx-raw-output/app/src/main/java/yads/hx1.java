package yads;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class hx1 extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f78405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ex1 f78406b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f78405a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10) {
        ((cx1) viewHolder).f76455a.b((u41) this.f78405a.get(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
        ex1 ex1Var = this.f78406b;
        ex1Var.getClass();
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setOnClickListener(new dx1());
        return new cx1(imageView, new c51(imageView, ex1Var.f77217a, ex1Var.f77218b));
    }

    public hx1(mi2 mi2Var, List list, v9 v9Var) {
        this.f78405a = list;
        this.f78406b = new ex1(mi2Var, v9Var);
    }
}
