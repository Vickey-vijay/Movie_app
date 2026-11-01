package yads;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R$layout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class gs0 extends ListAdapter {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashMap f77916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ds0 f77917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f77918g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x007c  */
    public final void a(yt0 yt0Var, int i10) {
        qs0 qs0Var;
        Object next;
        String str;
        ut0 ut0Var = (ut0) getCurrentList().get(i10);
        if ((yt0Var instanceof jt0) && (ut0Var instanceof ns0)) {
            jt0 jt0Var = (jt0) yt0Var;
            ns0 ns0Var = (ns0) ut0Var;
            ps0 ps0Var = jt0Var.f79171b;
            Context context = jt0Var.f79170a.getContext();
            v9 v9Var = ns0Var.f80742b;
            v22 v22Var = ns0Var.f80741a;
            List list = ns0Var.f80743c;
            hs0 hs0Var = ps0Var.f81566d;
            ViewGroup viewGroup = ps0Var.f81563a;
            z00 z00Var = ps0Var.f81564b;
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = ps0Var.f81568f;
            lh3 lh3Var = ps0Var.f81565c;
            rs0 rs0Var = hs0Var.f78344a;
            rs0Var.f82421c.getClass();
            if (oi0.a(context)) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        str = ((hi2) next).f78248a.f77807a;
                        fg0[] fg0VarArr = fg0.f77387b;
                    }
                } while (!ck.p.e(str, "ad"));
                hi2 hi2Var = (hi2) next;
                if (hi2Var != null) {
                    qs0Var = new qs0(hi2Var, rs0Var.f82419a, rs0Var.f82420b, new qh0(), new ve1());
                } else {
                    qs0Var = null;
                }
            } else {
                qs0Var = null;
            }
            cn cnVar = new cn(new bn(context, viewGroup, nj.s.o(qs0Var != null ? qs0Var.a(context, v9Var, v22Var, z00Var, lh3Var) : null), onPreDrawListener));
            ps0Var.f81567e = cnVar;
            cnVar.a(null, new os0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        if (this.f77918g) {
            return;
        }
        this.f77918g = true;
        new Object() { // from class: cp.g2
        };
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(yt0 yt0Var, int i10) {
        this.f77916e.put(yt0Var, Integer.valueOf(i10));
        a(yt0Var, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public yt0 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        if (i10 != 0) {
            return new rt0(LayoutInflater.from(context).inflate(R$layout.monetization_ads_feed_progressbar, viewGroup, false));
        }
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.monetization_ads_feed_item, viewGroup, false);
        ck.p.h(viewInflate, "null cannot be cast to non-null type android.view.ViewGroup");
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(yt0 yt0Var) {
        super.onViewAttachedToWindow(yt0Var);
        yt0Var.getBindingAdapterPosition();
        if (yt0Var instanceof jt0) {
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(yt0 yt0Var) {
        super.onViewDetachedFromWindow(yt0Var);
        View view = yt0Var.itemView;
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(yt0 yt0Var) {
        super.onViewRecycled(yt0Var);
        this.f77916e.remove(yt0Var);
        cn cnVar = null;
        jt0 jt0Var = yt0Var instanceof jt0 ? (jt0) yt0Var : null;
        if (jt0Var != null) {
            cn cnVar2 = jt0Var.f79171b.f81567e;
            if (cnVar2 == null) {
                ck.p.B("contentController");
            } else {
                cnVar = cnVar2;
            }
            an anVar = cnVar.f76326a.f75907e;
            lm2 lm2Var = anVar.f75570c;
            jk.k kVar = an.f75567d[0];
            ViewGroup viewGroup = (ViewGroup) lm2Var.f79854a.get();
            if (viewGroup != null) {
                nk3.a(viewGroup);
            }
            zf0 zf0Var = anVar.f75569b;
            if (zf0Var != null) {
                zf0Var.c();
            }
        }
    }

    public static final void access$unbindHolder(gs0 gs0Var, yt0 yt0Var) {
        jt0 jt0Var;
        gs0Var.getClass();
        cn cnVar = null;
        if (yt0Var instanceof jt0) {
            jt0Var = (jt0) yt0Var;
        } else {
            jt0Var = null;
        }
        if (jt0Var != null) {
            cn cnVar2 = jt0Var.f79171b.f81567e;
            if (cnVar2 == null) {
                ck.p.B("contentController");
            } else {
                cnVar = cnVar2;
            }
            an anVar = cnVar.f76326a.f75907e;
            lm2 lm2Var = anVar.f75570c;
            jk.k kVar = an.f75567d[0];
            ViewGroup viewGroup = (ViewGroup) lm2Var.f79854a.get();
            if (viewGroup != null) {
                nk3.a(viewGroup);
            }
            zf0 zf0Var = anVar.f75569b;
            if (zf0Var != null) {
                zf0Var.c();
            }
        }
    }

    public static final void access$unregisterTrackers(gs0 gs0Var) {
        gs0Var.getClass();
        throw null;
    }

    @Override // androidx.recyclerview.widget.ListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return getCurrentList().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i10) {
        return ck.p.e(getCurrentList().get(i10), tt0.f83168a) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        ds0 ds0Var = this.f77917f;
        if (ds0Var == null) {
            ds0Var = new ds0(this);
        }
        this.f77917f = ds0Var;
        recyclerView.removeOnAttachStateChangeListener(ds0Var);
        recyclerView.addOnAttachStateChangeListener(ds0Var);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        ds0 ds0Var = this.f77917f;
        if (ds0Var != null) {
            recyclerView.removeOnAttachStateChangeListener(ds0Var);
        }
        throw null;
    }
}
