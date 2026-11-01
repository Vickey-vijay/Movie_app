package com.mgs.carparking.ui.homecontent.more;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cc.f;
import com.bumptech.glide.Glide;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.basecommon.ui.BarActivity;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.safedk.android.utils.Logger;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import ec.e;
import ec.g;
import em.n;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class VideoMoreListActivity extends BarActivity implements da.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public da.c f41841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public VideoMoreListAdapter f41842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public SmartRefreshLayout f41843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f41844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f41845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public RelativeLayout f41846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f41847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f41848q;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            VideoMoreListActivity.this.finish();
        }
    }

    public class b implements g {
        public b() {
        }

        @Override // ec.g
        public void d(@NonNull f fVar) {
            VideoMoreListActivity.this.f41841j.g(true, VideoMoreListActivity.this.f41848q);
        }
    }

    public class c implements e {
        public c() {
        }

        @Override // ec.e
        public void a(@NonNull f fVar) {
            VideoMoreListActivity.this.f41841j.g(false, VideoMoreListActivity.this.f41848q);
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public final void n() {
    }

    @Override // da.b
    public void isLoading(boolean z10) {
        this.f41843l.s();
        this.f41843l.n();
        this.f41846o.setVisibility(z10 ? 0 : 8);
    }

    public void loadEmpty(boolean z10) {
        this.f41844m.setVisibility(z10 ? 0 : 8);
    }

    @Override // da.b
    public void loadNoNet(boolean z10) {
        this.f41845n.setVisibility(z10 ? 0 : 8);
    }

    public final void o() {
        this.f41843l.H(true);
        ClassicsHeader classicsHeader = new ClassicsHeader(this);
        this.f41843l.I(true);
        classicsHeader.u(12.0f);
        new ClassicsFooter(this).u(12.0f);
        this.f41843l.L(new b());
        this.f41843l.K(new c());
    }

    @Override // da.b
    public void onClick(RecommandVideosEntity recommandVideosEntity) {
        if (recommandVideosEntity != null) {
            Intent intent = new Intent(this, (Class<?>) VideoPlayDetailActivity.class);
            Bundle bundle = new Bundle();
            bundle.putInt("id", recommandVideosEntity.getId());
            intent.putExtras(bundle);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
        }
    }

    @Override // da.b
    public void resetNoMoreData() {
        this.f41843l.s();
        this.f41843l.n();
        this.f41843l.F();
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_video_more_list, false);
        n.a(this);
        this.f41841j = new da.c(this);
        p();
        this.f41841j.g(true, this.f41848q);
        n();
    }

    public final void p() {
        ((LinearLayout) findViewById(R.id.layout_actionbar_back)).setOnClickListener(new a());
        this.f41843l = (SmartRefreshLayout) findViewById(R.id.refresh_layout);
        this.f41844m = (TextView) findViewById(R.id.tv_loadEmpty);
        this.f41845n = (RelativeLayout) findViewById(R.id.rl_loadNoNet);
        this.f41846o = (RelativeLayout) findViewById(R.id.rl_isLoading);
        o();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        if (this.f41842k == null) {
            VideoMoreListAdapter videoMoreListAdapter = new VideoMoreListAdapter();
            this.f41842k = videoMoreListAdapter;
            videoMoreListAdapter.d(this.f41841j);
        }
        recyclerView.setAdapter(this.f41842k);
        this.f41847p = getIntent().getStringExtra("videoTitle");
        this.f41848q = getIntent().getIntExtra("videoModuleId", 0);
        ((TextView) findViewById(R.id.tv_actionbar_title_middle)).setText(this.f41847p);
        Glide.with((FragmentActivity) this).load(Integer.valueOf(R.drawable.ic_is_loading)).into((ImageView) findViewById(R.id.img_loading));
    }

    @Override // da.b
    public void showData(List<RecommandVideosEntity> list) {
        loadEmpty(t9.e.a(list));
        VideoMoreListAdapter videoMoreListAdapter = this.f41842k;
        if (videoMoreListAdapter != null) {
            videoMoreListAdapter.d(this.f41841j);
            this.f41842k.c(list);
            this.f41842k.notifyDataSetChanged();
        }
    }
}
