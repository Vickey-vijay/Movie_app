package com.mgs.carparking.ui.mine;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.databinding.ActivityDownloadVideoBinding;
import com.mgs.carparking.db.VideoDownloadDao;
import com.mgs.carparking.model.DOWNLOADVIDEOVIEWMODEL;
import com.mgs.carparking.netbean.DownloadInfoEntry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import oi.g;
import okhttp3.Response;
import sa.g0;
import sa.k;
import sa.x;
import x9.j;
import x9.l;

/* JADX INFO: loaded from: classes9.dex */
public class DownloadVideoActivity extends BaseFragment<ActivityDownloadVideoBinding, DOWNLOADVIDEOVIEWMODEL> {
    private DownloadingAdapter adapter;
    private String json;
    private b resultTask;
    private List<DownloadInfoEntry> downloadInfos = new ArrayList();
    private g0 rxTimer = new g0();
    private Handler mHandler = new Handler();

    public class a implements x.b {
        public a() {
        }

        @Override // sa.x.b
        public void a(IOException iOException) {
            Log.i("wangyi", "get失败：" + iOException.toString());
        }

        @Override // sa.x.b
        public void b(Response response) {
            try {
                DownloadVideoActivity.this.json = response.body().string();
                Log.i("wangyi", "json：" + DownloadVideoActivity.this.json);
                if (DownloadVideoActivity.this.mHandler != null) {
                    DownloadVideoActivity.this.mHandler.removeCallbacks(DownloadVideoActivity.this.resultTask);
                    DownloadVideoActivity.this.mHandler.postDelayed(DownloadVideoActivity.this.resultTask, 500L);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class b implements Runnable {

        public class a extends x5.a<List<DownloadInfoEntry>> {
            public a() {
            }
        }

        /* JADX INFO: renamed from: com.mgs.carparking.ui.mine.DownloadVideoActivity$b$b, reason: collision with other inner class name */
        public class C0423b implements Comparator<DownloadInfoEntry> {
            public C0423b() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(DownloadInfoEntry downloadInfoEntry, DownloadInfoEntry downloadInfoEntry2) {
                return downloadInfoEntry2.getDownload_time().compareTo(downloadInfoEntry.getDownload_time());
            }
        }

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (k.d(DownloadVideoActivity.this.json, DownloadInfoEntry.class)) {
                DownloadVideoActivity downloadVideoActivity = DownloadVideoActivity.this;
                downloadVideoActivity.downloadInfos = (List) k.c(downloadVideoActivity.json, new a().getType());
                Collections.sort(DownloadVideoActivity.this.downloadInfos, new C0423b());
                ((DOWNLOADVIDEOVIEWMODEL) DownloadVideoActivity.this.viewModel).p(DownloadVideoActivity.this.downloadInfos, DownloadVideoActivity.this.adapter);
            }
        }
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.activity_download_video;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(l lVar) throws Exception {
        ((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f41124k = true;
        getDownloadInfo("http://127.0.0.1:" + AppApplication.port + "/control?msg=download_info");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(x9.k kVar) throws Exception {
        ((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f41121h = VideoDownloadDao.getInstance().queryHistory();
        tl.a.a().b(new j(((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f41121h));
    }

    public static DownloadVideoActivity newInstance(int i10) {
        DownloadVideoActivity downloadVideoActivity = new DownloadVideoActivity();
        Bundle bundle = new Bundle();
        bundle.putInt("resourceType", i10);
        downloadVideoActivity.setArguments(bundle);
        return downloadVideoActivity;
    }

    public void getDownloadInfo(String str) {
        Log.i("wangyi", "下载链接为：" + str);
        x.a(str, new a());
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public DOWNLOADVIDEOVIEWMODEL initViewModel() {
        return new DOWNLOADVIDEOVIEWMODEL(BaseApplication.getInstance(), i9.a.a(), this.rxTimer, this);
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        this.rxTimer.b();
        if (((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f41135v.size() > 0) {
            for (int i10 = 0; i10 < ((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f41135v.size(); i10++) {
                ((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f41135v.get(i10).f41465c.b();
                ((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f41135v.get(i10).f41466d.removeCallbacks(((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f41135v.get(i10).f41469g);
            }
        }
        super.onDestroy();
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.removeCallbacks(this.resultTask);
            this.mHandler = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(x9.x xVar) throws Exception {
        if (xVar.a() == 0) {
            if (((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f41135v.size() > 0 && xVar.b().get()) {
                ((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f41119f.set(true);
            } else {
                ((DOWNLOADVIDEOVIEWMODEL) this.viewModel).f41119f.set(false);
            }
        }
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();
        recycledViewPool.setMaxRecycledViews(0, 10);
        ((ActivityDownloadVideoBinding) this.binding).f39765b.setRecycledViewPool(recycledViewPool);
        ((ActivityDownloadVideoBinding) this.binding).f39765b.getItemAnimator().setChangeDuration(0L);
        ((SimpleItemAnimator) ((ActivityDownloadVideoBinding) this.binding).f39765b.getItemAnimator()).setSupportsChangeAnimations(false);
        DownloadingAdapter downloadingAdapter = new DownloadingAdapter();
        this.adapter = downloadingAdapter;
        ((ActivityDownloadVideoBinding) this.binding).f39765b.setAdapter(downloadingAdapter);
        this.resultTask = new b();
        if (AppApplication.port > 0) {
            getDownloadInfo("http://127.0.0.1:" + AppApplication.port + "/control?msg=download_info");
        }
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    @RequiresApi(api = 24)
    public void initViewObservable() {
        super.initViewObservable();
        addSubscribe(tl.a.a().d(l.class).subscribe(new g() { // from class: ka.e
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f62672b.lambda$initViewObservable$0((x9.l) obj);
            }
        }));
        addSubscribe(tl.a.a().d(x9.k.class).subscribe(new g() { // from class: ka.f
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f62674b.lambda$initViewObservable$1((x9.k) obj);
            }
        }));
        addSubscribe(tl.a.a().d(x9.x.class).subscribe(new g() { // from class: ka.g
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f62676b.lambda$initViewObservable$2((x9.x) obj);
            }
        }));
    }
}
