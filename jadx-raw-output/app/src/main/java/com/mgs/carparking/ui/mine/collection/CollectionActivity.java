package com.mgs.carparking.ui.mine.collection;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.basecommon.ui.BarActivity;
import com.mgs.carparking.netbean.VideoCollectionBeanEntry;
import com.mgs.carparking.shorttk.ShortTkActivity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.safedk.android.utils.Logger;
import em.n;
import em.o;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CollectionActivity extends BarActivity implements la.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public la.a f42082j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CollectionListAdapter f42083k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public RecyclerView f42084l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f42085m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ConstraintLayout f42086n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f42087o;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CollectionActivity.this.f42082j != null) {
                CollectionActivity.this.f42082j.c();
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CollectionActivity.this.f42082j != null) {
                CollectionActivity.this.f42082j.delete();
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (CollectionActivity.this.f42082j != null) {
                CollectionActivity.this.f42082j.a();
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            CollectionActivity.this.finish();
        }
    }

    public static void safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(ComponentActivity p10, Intent p11, int p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;I)V");
        if (p11 == null) {
            return;
        }
        p10.startActivityForResult(p11, p12);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public void showToast(String str) {
    }

    @Override // la.b
    public void delete() {
        la.a aVar = this.f42082j;
        if (aVar != null) {
            aVar.a();
        }
        refresh(-1);
    }

    @Override // la.b
    public void refresh(int i10) {
        CollectionListAdapter collectionListAdapter = this.f42083k;
        if (collectionListAdapter != null) {
            if (i10 == -1) {
                collectionListAdapter.notifyDataSetChanged();
            } else {
                collectionListAdapter.notifyItemChanged(i10);
            }
        }
    }

    @Override // la.b
    public void setEdits(int i10) {
        this.f42086n.setVisibility(this.f42082j.b() ? 0 : 8);
        this.f42085m.setImageDrawable(ContextCompat.getDrawable(getApplication(), i10));
        refresh(-1);
    }

    @Override // la.b
    public void showData(List<VideoCollectionBeanEntry> list) {
        CollectionListAdapter collectionListAdapter = this.f42083k;
        if (collectionListAdapter != null) {
            collectionListAdapter.d(this.f42082j);
            this.f42083k.c(list);
            refresh(-1);
        }
    }

    public final void m() {
        this.f42087o = (TextView) findViewById(R.id.tv_add);
        this.f42086n = (ConstraintLayout) findViewById(R.id.cl_bottom);
        this.f42087o.setOnClickListener(new a());
        ((TextView) findViewById(R.id.tv_delete)).setOnClickListener(new b());
        ImageView imageView = (ImageView) findViewById(R.id.collectionRightImage);
        this.f42085m = imageView;
        imageView.setOnClickListener(new c());
        ((ImageView) findViewById(R.id.collectionLeftImage)).setOnClickListener(new d());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        this.f42084l = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        if (this.f42083k == null) {
            this.f42083k = new CollectionListAdapter();
        }
        this.f42084l.setItemAnimator(null);
        this.f42084l.setAdapter(this.f42083k);
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_collection, false);
        n.a(this);
        m();
        if (this.f42082j == null) {
            this.f42082j = new la.c(this);
        }
        this.f42082j.d();
    }

    @Override // la.b
    public void video(String str, int i10) {
        if (i10 == 34) {
            Intent intent = new Intent(this, (Class<?>) ShortTkActivity.class);
            intent.putExtra("netcineVarVideoId", str);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this, intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            return;
        }
        if (!o.c(str)) {
            Bundle bundle = new Bundle();
            bundle.putInt("id", Integer.parseInt(str));
            Intent intent2 = new Intent(this, (Class<?>) VideoPlayDetailActivity.class);
            intent2.putExtras(bundle);
            safedk_ComponentActivity_startActivityForResult_400537aeb948a6492f65a13e4d0b0824(this, intent2, 1);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
        }
    }

    @Override // la.b
    public void whole(String str) {
        if (!o.c(str)) {
            this.f42087o.setText(str);
        }
    }
}
