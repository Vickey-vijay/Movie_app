package com.mgs.carparking.ui.homecontent.videodetail;

import android.content.Context;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import em.j;
import em.r;
import gb.i;
import java.util.List;
import me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter;
import w9.y0;
import x9.v;

/* JADX INFO: loaded from: classes9.dex */
public class CommentListAdapter extends BindingRecyclerViewAdapter {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f41901r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f41902s;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y0 f41903b;

        /* JADX INFO: renamed from: com.mgs.carparking.ui.homecontent.videodetail.CommentListAdapter$a$a, reason: collision with other inner class name */
        public class C0422a implements i.b {
            public C0422a() {
            }

            @Override // gb.i.b
            public void a(y0 y0Var, int i10) {
                CommentListAdapter.this.f41902s.dismiss();
                tl.a.a().b(new v(y0Var, i10));
            }
        }

        public a(y0 y0Var) {
            this.f41903b = y0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CommentListAdapter.this.f41902s = new i(CommentListAdapter.this.f41901r, this.f41903b);
            CommentListAdapter.this.f41902s.showAsDropDown(view, j.a(-35.0f, r.a()), 0);
            CommentListAdapter.this.f41902s.a(new C0422a());
        }
    }

    public CommentListAdapter(Context context) {
        this.f41901r = context;
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter
    public void f(ViewDataBinding viewDataBinding, int i10, int i11, int i12, Object obj) {
        super.f(viewDataBinding, i10, i11, i12, obj);
        viewDataBinding.getRoot().findViewById(R.id.rl_filter).setOnClickListener(new a((y0) obj));
    }

    @Override // me.tatarka.bindingcollectionadapter2.BindingRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i10, List list) {
        super.onBindViewHolder(viewHolder, i10, list);
    }
}
