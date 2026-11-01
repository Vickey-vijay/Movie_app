package com.mgs.carparking.shorttk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.TKBean;
import com.mgs.carparking.widgets.FlowLayout2;
import com.mgs.carparking.widgets.rv.HorizontalItemFourDecoration;
import com.ruffian.library.widget.RImageView;
import com.ruffian.library.widget.RTextView;
import ib.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class CommentDialog extends BaseBottomSheetDialog {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<TKBean> f41525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TKBean f41526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RecyclerView f41528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f41529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ExpandableTextView f41530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RImageView f41531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f41532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f41533l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public FlowLayout2 f41534m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout.LayoutParams f41535n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f41536o;

    public class a implements c.InterfaceC0420c {
        public a() {
        }

        @Override // com.mgs.carparking.shorttk.CommentDialog.c.InterfaceC0420c
        public void a(int i10, TKBean tKBean) {
            b bVar = CommentDialog.this.f41536o;
            if (bVar != null) {
                bVar.a(i10);
            }
        }
    }

    public interface b {
        void a(int i10);
    }

    public static class c extends RecyclerView.Adapter<b> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public LayoutInflater f41538i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Context f41539j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<TKBean> f41540k = new ArrayList();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public InterfaceC0420c f41541l;

        public class a implements View.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f41542b;

            public a(int i10) {
                this.f41542b = i10;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (c.this.f41541l != null) {
                    c.this.f41541l.a(this.f41542b, (TKBean) c.this.f41540k.get(this.f41542b));
                }
            }
        }

        public class b extends RecyclerView.ViewHolder {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public RTextView f41544l;

            public b(View view) {
                super(view);
                this.f41544l = (RTextView) view.findViewById(R.id.text1);
            }
        }

        /* JADX INFO: renamed from: com.mgs.carparking.shorttk.CommentDialog$c$c, reason: collision with other inner class name */
        public interface InterfaceC0420c {
            void a(int i10, TKBean tKBean);
        }

        public void e(List<TKBean> list) {
            this.f41540k = list;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new b(this.f41538i.inflate(R.layout.eps_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f41540k.size();
        }

        public void h(InterfaceC0420c interfaceC0420c) {
            this.f41541l = interfaceC0420c;
        }

        public c(Context context) {
            this.f41539j = context;
            this.f41538i = LayoutInflater.from(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        @SuppressLint({"SetTextI18n"})
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(b bVar, int i10) {
            wb.c helper = bVar.f41544l.getHelper();
            if (this.f41540k.get(i10).getNetCineVarIsTrue()) {
                helper.n(bVar.itemView.getContext().getResources().getColor(R.color.color_272b30)).q(bVar.itemView.getContext().getResources().getColor(R.color.color_commen)).r(2).t(5.0f);
                bVar.f41544l.setTextColor(bVar.itemView.getContext().getResources().getColor(R.color.color_commen));
            } else {
                helper.n(bVar.itemView.getContext().getResources().getColor(R.color.color_343940)).t(5.0f);
                bVar.f41544l.setTextColor(bVar.itemView.getContext().getResources().getColor(R.color.white));
            }
            bVar.f41544l.setText((i10 + 1) + "");
            bVar.f41544l.setTextColor(this.f41539j.getResources().getColor(R.color.color_text_commen1));
            bVar.f41544l.setGravity(17);
            bVar.f41544l.setOnClickListener(new a(i10));
        }
    }

    @Override // com.mgs.carparking.shorttk.BaseBottomSheetDialog
    public int c() {
        return -2;
    }

    public void d(List<String> list) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.f41535n = layoutParams;
        layoutParams.setMargins(10, 10, 10, 10);
        FlowLayout2 flowLayout2 = this.f41534m;
        if (flowLayout2 != null) {
            flowLayout2.removeAllViews();
        }
        if (list.size() > 0) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                e(list.get(i10));
            }
        }
    }

    public void g(b bVar) {
        this.f41536o = bVar;
    }

    public void h(int i10) {
        this.f41527f = i10;
    }

    public CommentDialog(List<TKBean> list, TKBean tKBean, int i10) {
        this.f41525d = list;
        this.f41526e = tKBean;
        this.f41527f = i10;
    }

    public void e(String str) {
        TextView textView = (TextView) LayoutInflater.from(getActivity()).inflate(R.layout.item_short_tag, (ViewGroup) this.f41534m, false).findViewById(R.id.tv_name);
        textView.setText(str);
        this.f41534m.addView(textView, 0, this.f41535n);
        if (this.f41534m.getChildCount() == 6) {
            this.f41534m.removeViewAt(5);
        }
    }

    public final void f(View view) {
        this.f41528g = (RecyclerView) view.findViewById(R.id.recyclerView);
        this.f41534m = (FlowLayout2) view.findViewById(R.id.fl_search_history);
        this.f41531j = (RImageView) view.findViewById(R.id.mCover);
        this.f41532k = (TextView) view.findViewById(R.id.mTitle);
        this.f41533l = (TextView) view.findViewById(R.id.mCount);
        this.f41530i = (ExpandableTextView) view.findViewById(R.id.tv_vod_des);
        d.d(getActivity(), this.f41526e.getNetCineVarListVod_pic(), this.f41531j, false);
        this.f41532k.setText(this.f41526e.netCineVarListVod_name);
        this.f41530i.setContent(this.f41526e.getNetCineVarListVod_blurb());
        this.f41533l.setText("1-" + this.f41525d.size());
        d(Arrays.asList(this.f41526e.getNetCineVarListVod_tag().split("/")));
        for (int i10 = 0; i10 < this.f41525d.size(); i10++) {
            this.f41525d.get(i10).setNetCineVarIsTrue(false);
        }
        this.f41525d.get(this.f41527f).setNetCineVarIsTrue(true);
        this.f41528g.setLayoutManager(new GridLayoutManager(getActivity(), 4));
        this.f41528g.addItemDecoration(new HorizontalItemFourDecoration((int) getActivity().getResources().getDimension(R.dimen.dp_4), getActivity()));
        c cVar = new c(getActivity());
        this.f41528g.setAdapter(cVar);
        cVar.e(this.f41525d);
        cVar.h(new a());
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_recyclerview, viewGroup);
        this.f41529h = viewInflate;
        f(viewInflate);
        return this.f41529h;
    }
}
