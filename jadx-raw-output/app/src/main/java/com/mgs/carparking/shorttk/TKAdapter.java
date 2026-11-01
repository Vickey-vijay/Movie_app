package com.mgs.carparking.shorttk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.db.VideoCollectionDao;
import com.mgs.carparking.netbean.TKBean;
import com.safedk.android.utils.Logger;
import com.yk.e.pl.PreloadManager;
import g5.m;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class TKAdapter extends PagerAdapter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<TKBean> f41604c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i f41606e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<View> f41603b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f41605d = null;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TKAdapter.this.f41606e.e();
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TKBean f41608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j f41609c;

        public b(TKBean tKBean, j jVar) {
            this.f41608b = tKBean;
            this.f41609c = jVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f41608b.getNetCineVarIsLike()) {
                this.f41609c.f41629h.setImageResource(R.drawable.ic_collection_un);
                m.c("xxxxaxxxxxxxxx", "---------- falseaaaaaaaaaaaaaaaaaaaaaaaa");
            } else {
                m.c("xxxxaxxxxxxxxx", "---------- trueaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                this.f41609c.f41629h.setImageResource(R.drawable.ic_collection);
            }
            i iVar = TKAdapter.this.f41606e;
            TKBean tKBean = this.f41608b;
            iVar.f(tKBean, tKBean.getNetCineVarIsLike());
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TKBean f41611b;

        public c(TKBean tKBean) {
            this.f41611b = tKBean;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TKAdapter.this.f41606e.b(this.f41611b);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = TKAdapter.this.f41606e;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TKBean f41614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f41615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f41616d;

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            p10.startActivity(p11);
        }

        public e(TKBean tKBean, Context context, int i10) {
            this.f41614b = tKBean;
            this.f41615c = context;
            this.f41616d = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!this.f41614b.getNetCineVarIsShow()) {
                Intent intent = new Intent(this.f41615c, (Class<?>) ShortTkActivity.class);
                intent.putExtra("netcineVarVideoBean", this.f41614b);
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f41615c, intent);
            } else {
                i iVar = TKAdapter.this.f41606e;
                if (iVar != null) {
                    iVar.d(this.f41616d);
                }
            }
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f41618b;

        public f(int i10) {
            this.f41618b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = TKAdapter.this.f41606e;
            if (iVar != null) {
                iVar.d(this.f41618b);
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = TKAdapter.this.f41606e;
            if (iVar != null) {
                iVar.c();
            }
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = TKAdapter.this.f41606e;
            if (iVar != null) {
                iVar.a();
            }
        }
    }

    public interface i {
        void a();

        void b(TKBean tKBean);

        void c();

        void d(int i10);

        void e();

        void f(TKBean tKBean, boolean z10);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(@NonNull Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view == obj;
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f41622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ExpandableTextView f41623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f41624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextView f41625d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ImageView f41626e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ImageView f41627f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ImageView f41628g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public ImageView f41629h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ImageView f41630i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public TKView f41631j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public FrameLayout f41632k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public ConstraintLayout f41633l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public TextView f41634m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public TextView f41635n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public LinearLayout f41636o;

        public j(View view) {
            TKView tKView = (TKView) view.findViewById(R.id.tiktok_View);
            this.f41631j = tKView;
            this.f41626e = (ImageView) tKView.findViewById(R.id.iv_thumb);
            this.f41629h = (ImageView) this.f41631j.findViewById(R.id.iv_collection);
            this.f41636o = (LinearLayout) this.f41631j.findViewById(R.id.mivX);
            this.f41633l = (ConstraintLayout) this.f41631j.findViewById(R.id.clView);
            this.f41634m = (TextView) this.f41631j.findViewById(R.id.tv_title);
            this.f41624c = (TextView) this.f41631j.findViewById(R.id.bt_skip);
            this.f41625d = (TextView) this.f41631j.findViewById(R.id.tv_vod_name);
            this.f41632k = (FrameLayout) view.findViewById(R.id.container);
            this.f41623b = (ExpandableTextView) view.findViewById(R.id.tv_vod_des);
            this.f41628g = (ImageView) view.findViewById(R.id.iv_x);
            this.f41627f = (ImageView) view.findViewById(R.id.iv_speed);
            this.f41635n = (TextView) view.findViewById(R.id.tv_speed);
            this.f41630i = (ImageView) view.findViewById(R.id.iv_Share);
            view.setTag(this);
        }
    }

    public void a(i iVar) {
        this.f41606e = iVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(@NonNull ViewGroup viewGroup, int i10, @NonNull Object obj) {
        View view = (View) obj;
        viewGroup.removeView(view);
        TKBean tKBean = this.f41604c.get(i10);
        PreloadManager.getInstance(viewGroup.getContext()).removePreloadTask(tKBean.getVod_url((i10 + 1) + ".mp4"));
        this.f41603b.add(view);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        List<TKBean> list = this.f41604c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public TKAdapter(List<TKBean> list) {
        this.f41604c = list;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    @NonNull
    @SuppressLint({"SetTextI18n"})
    public Object instantiateItem(@NonNull ViewGroup viewGroup, int i10) {
        View viewInflate;
        j jVar;
        Context context = viewGroup.getContext();
        if (this.f41603b.size() > 0) {
            viewInflate = this.f41603b.get(0);
            this.f41603b.remove(0);
        } else {
            viewInflate = null;
        }
        if (viewInflate == null) {
            viewInflate = LayoutInflater.from(context).inflate(R.layout.item_tik_tok, viewGroup, false);
            jVar = new j(viewInflate);
        } else {
            jVar = (j) viewInflate.getTag();
        }
        TKBean tKBean = this.f41604c.get(i10);
        PreloadManager preloadManager = PreloadManager.getInstance(context);
        StringBuilder sb2 = new StringBuilder();
        int i11 = i10 + 1;
        sb2.append(i11);
        sb2.append(".mp4");
        preloadManager.addPreloadTask(tKBean.getVod_url(sb2.toString()), i10, null);
        ib.d.d(context, tKBean.getNetCineVarListVod_pic(), jVar.f41626e, false);
        jVar.f41625d.setText(tKBean.netCineVarListVod_name);
        jVar.f41634m.setText("Episode " + i11);
        jVar.f41623b.setContent("Episode " + i11 + " | " + tKBean.getNetCineVarListVod_blurb());
        jVar.f41624c.setText("Watch the full series · " + tKBean.getNetCineVarListVod_serial() + " episodes");
        if (!VideoCollectionDao.getInstance().isExist(tKBean.getNetCineVarListVod_id())) {
            jVar.f41629h.setImageResource(R.drawable.ic_collection_un);
            tKBean.setNetCineVarIsLike(false);
            m.c("xxxxaxxxxxxxxx", "---------- false");
        } else {
            jVar.f41629h.setImageResource(R.drawable.ic_collection);
            tKBean.setNetCineVarIsLike(true);
            m.c("xxxxaxxxxxxxxx", "---------- true");
        }
        if (!tKBean.getNetCineVarIsShow()) {
            jVar.f41633l.setVisibility(8);
            jVar.f41636o.setVisibility(8);
        } else {
            jVar.f41633l.setVisibility(0);
            jVar.f41636o.setVisibility(0);
        }
        jVar.f41633l.setOnClickListener(new a());
        jVar.f41629h.setOnClickListener(new b(tKBean, jVar));
        jVar.f41625d.setOnClickListener(new c(tKBean));
        jVar.f41635n.setOnClickListener(new d());
        jVar.f41624c.setOnClickListener(new e(tKBean, context, i10));
        jVar.f41628g.setOnClickListener(new f(i10));
        jVar.f41627f.setOnClickListener(new g());
        jVar.f41630i.setOnClickListener(new h());
        jVar.f41622a = i10;
        viewGroup.addView(viewInflate);
        return viewInflate;
    }
}
