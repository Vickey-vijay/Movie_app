package com.mgs.carparking.shorttk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.databinding.FragmentTKBinding;
import com.mgs.carparking.db.VideoCollectionDao;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.netbean.TKBean;
import com.mgs.carparking.ui.mine.share.ExtensionShareActivity;
import com.safedk.android.utils.Logger;
import com.yk.e.pl.PreloadManager;
import em.k;
import em.p;
import java.util.ArrayList;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import sa.o0;
import y9.j;

/* JADX INFO: loaded from: classes9.dex */
public class TKFragment extends BaseFragment<FragmentTKBinding, TKFragmentViewModel> implements jb.a {
    private TKBean bean;
    private CommentDialog dialog;
    private TKController mController;
    private int mCurPos;
    private PreloadManager mPreloadManager;
    private TKAdapter mTiktok2Adapter;
    private VideoViewAPlay mVideoView;
    private long webBasic;
    private List<TKBean> mVideoList = new ArrayList();
    private boolean isDetail = false;
    private int pos = -1;
    private boolean isPlay = false;
    private boolean isCollection = false;

    public class a extends ViewPager.SimpleOnPageChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f41637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f41638c;

        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
            super.onPageScrollStateChanged(i10);
            if (i10 == 1) {
                this.f41637b = ((FragmentTKBinding) TKFragment.this.binding).f40302b.getCurrentItem();
            }
            if (i10 == 0) {
                TKFragment.this.mPreloadManager.resumePreload(TKFragment.this.mCurPos, this.f41638c);
            } else {
                TKFragment.this.mPreloadManager.pausePreload(TKFragment.this.mCurPos, this.f41638c);
            }
            if (i10 == 0) {
                TKFragment.this.mPreloadManager.resumePreload(TKFragment.this.mCurPos, this.f41638c);
                if (TKFragment.this.mVideoList.size() - 2 == TKFragment.this.mCurPos) {
                    ((TKFragmentViewModel) TKFragment.this.viewModel).o(false);
                    return;
                }
                return;
            }
            TKFragment.this.mPreloadManager.pausePreload(TKFragment.this.mCurPos, this.f41638c);
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
            boolean z10;
            super.onPageScrolled(i10, f10, i11);
            int i12 = this.f41637b;
            if (i10 == i12) {
                return;
            }
            if (i10 < i12) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f41638c = z10;
        }

        @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            super.onPageSelected(i10);
            if (i10 == TKFragment.this.mCurPos) {
                return;
            }
            TKFragment.this.startPlay(i10);
            if (i10 % o0.i() == 0 && !o0.z() && AppApplication.adInfoEntry.getAd_position_9() != null && AppApplication.adInfoEntry.getAd_position_9().size() > 0) {
                sa.b.b(TKFragment.this.getActivity(), AppApplication.adInfoEntry.getAd_position_9());
            }
        }
    }

    public class b implements TKAdapter.i {

        public class a implements ShortVideoSpeedDialog.a {
            public a() {
            }

            @Override // com.mgs.carparking.shorttk.ShortVideoSpeedDialog.a
            public void a(float f10) {
                o0.R0(f10);
                p.b("success");
                TKFragment.this.mVideoView.setSpeed(f10);
            }
        }

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            p10.startActivity(p11);
        }

        @Override // com.mgs.carparking.shorttk.TKAdapter.i
        public void b(TKBean tKBean) {
        }

        @Override // com.mgs.carparking.shorttk.TKAdapter.i
        public void e() {
        }

        public b() {
        }

        @Override // com.mgs.carparking.shorttk.TKAdapter.i
        public void a() {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(TKFragment.this.getActivity(), new Intent(TKFragment.this.getActivity(), (Class<?>) ExtensionShareActivity.class));
        }

        @Override // com.mgs.carparking.shorttk.TKAdapter.i
        public void c() {
            ShortVideoSpeedDialog shortVideoSpeedDialog = new ShortVideoSpeedDialog(TKFragment.this.getContext());
            shortVideoSpeedDialog.c(new a());
            shortVideoSpeedDialog.show();
        }

        @Override // com.mgs.carparking.shorttk.TKAdapter.i
        public void d(int i10) {
            TKFragment.this.showRecyclerViewDialog(i10);
        }

        @Override // com.mgs.carparking.shorttk.TKAdapter.i
        public void f(TKBean tKBean, boolean z10) {
            VideoCollectionEntry videoCollectionEntry = new VideoCollectionEntry();
            videoCollectionEntry.setId(TKFragment.this.bean.getNetCineVarListVod_id());
            videoCollectionEntry.setType_pid(TKFragment.this.bean.getNetCineVarListType_pid());
            videoCollectionEntry.setVod_pic(TKFragment.this.bean.getNetCineVarListVod_pic());
            videoCollectionEntry.setVod_name(TKFragment.this.bean.netCineVarListVod_name);
            if (z10) {
                ((TKFragmentViewModel) TKFragment.this.viewModel).p(videoCollectionEntry, TKFragment.this.bean.getNetCineVarListType_id());
            } else {
                ((TKFragmentViewModel) TKFragment.this.viewModel).q(videoCollectionEntry, TKFragment.this.bean.getNetCineVarListType_id());
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f41642b;

        public c(int i10) {
            this.f41642b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            int childCount = ((FragmentTKBinding) TKFragment.this.binding).f40302b.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                TKAdapter.j jVar = (TKAdapter.j) ((FragmentTKBinding) TKFragment.this.binding).f40302b.getChildAt(i10).getTag();
                if (jVar.f41622a == this.f41642b) {
                    TKFragment.this.mVideoView.release();
                    if (TKFragment.this.mVideoView == null) {
                        return;
                    }
                    ViewParent parent = TKFragment.this.mVideoView.getParent();
                    if (parent instanceof FrameLayout) {
                        ((FrameLayout) parent).removeView(TKFragment.this.mVideoView);
                    }
                    TKBean tKBean = (TKBean) TKFragment.this.mVideoList.get(this.f41642b);
                    TKFragment.this.mVideoView.setUrl(TKFragment.this.isDetail ? TKFragment.this.mPreloadManager.getPlayUrl(tKBean.getVod_url((this.f41642b + 1) + ".mp4")) : TKFragment.this.mPreloadManager.getPlayUrl(tKBean.getVod_url("1.mp4")));
                    TKFragment.this.mController.addControlComponent(jVar.f41631j, true);
                    jVar.f41632k.addView(TKFragment.this.mVideoView, 0);
                    TKFragment.this.mVideoView.start();
                    TKFragment.this.mVideoView.setSpeed(o0.I());
                    TKFragment.this.mCurPos = this.f41642b;
                    return;
                }
            }
        }
    }

    public class d implements CommentDialog.b {
        public d() {
        }

        @Override // com.mgs.carparking.shorttk.CommentDialog.b
        public void a(int i10) {
            ((FragmentTKBinding) TKFragment.this.binding).f40302b.setCurrentItem(i10);
            TKFragment.this.dialog.dismiss();
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TKFragment tKFragment = TKFragment.this;
            tKFragment.startPlay(tKFragment.mCurPos);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$1(Boolean bool) {
        startPlay(0);
    }

    @Override // jb.a
    public BaseFragment getFragment() {
        return this;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initContentView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return R.layout.fragment_t_k;
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public int initVariableId() {
        return 7;
    }

    public void onMenuItemClick() {
    }

    private void initVideoView() {
        VideoViewAPlay videoViewAPlay = new VideoViewAPlay(getActivity());
        this.mVideoView = videoViewAPlay;
        videoViewAPlay.setLooping(true);
        this.mVideoView.setPlayerFactory(y9.b.a());
        this.mVideoView.setRenderViewFactory(j.b());
        this.mController = new TKController(getActivity());
        this.mController.addControlComponent(new TKView(getActivity()));
        this.mVideoView.setVideoController(this.mController);
    }

    private void initViewPager() {
        ((FragmentTKBinding) this.binding).f40302b.setOffscreenPageLimit(4);
        TKAdapter tKAdapter = new TKAdapter(this.mVideoList);
        this.mTiktok2Adapter = tKAdapter;
        ((FragmentTKBinding) this.binding).f40302b.setAdapter(tKAdapter);
        ((FragmentTKBinding) this.binding).f40302b.setOverScrollMode(2);
        ((FragmentTKBinding) this.binding).f40302b.setOnPageChangeListener(new a());
        this.mTiktok2Adapter.a(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$0(List list) {
        this.mVideoList.addAll(list);
        this.mTiktok2Adapter.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViewObservable$2(Boolean bool) {
        this.mTiktok2Adapter.notifyDataSetChanged();
    }

    public static TKFragment newInstance(boolean z10, TKBean tKBean, int i10) {
        TKFragment tKFragment = new TKFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("VideoBean", tKBean);
        bundle.putInt("VideoPos", i10);
        bundle.putBoolean("isDetail", z10);
        tKFragment.setArguments(bundle);
        return tKFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRecyclerViewDialog(int i10) {
        CommentDialog commentDialog = this.dialog;
        if (commentDialog == null) {
            this.dialog = new CommentDialog(this.mVideoList, this.bean, i10);
        } else {
            commentDialog.h(i10);
        }
        this.dialog.g(new d());
        this.dialog.show(getChildFragmentManager(), "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPlay(int i10) {
        ((FragmentTKBinding) this.binding).f40302b.post(new c(i10));
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public TKFragmentViewModel initViewModel() {
        return new TKFragmentViewModel(BaseApplication.getInstance(), i9.a.a());
    }

    private void videoStayTime() {
        if (System.currentTimeMillis() - this.webBasic >= 10000) {
            o0.i1((System.currentTimeMillis() - this.webBasic) + o0.X());
            VideoViewAPlay videoViewAPlay = this.mVideoView;
            if (videoViewAPlay != null && videoViewAPlay.getDuration() > 0) {
                ((TKFragmentViewModel) this.viewModel).r(this.mVideoList.get(this.mCurPos).getNetCineVarListVod_id(), this.mCurPos + 1, (int) (this.mVideoView.getCurrentPosition() / 1000), (int) ((System.currentTimeMillis() - this.webBasic) / 1000), (int) (this.mVideoView.getDuration() / 1000));
            }
        }
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initData() {
        super.initData();
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            this.isDetail = arguments.getBoolean("isDetail");
            this.bean = (TKBean) arguments.getSerializable("VideoBean");
            this.pos = arguments.getInt("VideoPos");
        }
        initViewPager();
        initVideoView();
        this.mPreloadManager = PreloadManager.getInstance(getActivity());
        if (!this.isDetail) {
            if (k.i(getActivity()).b("_CACHE_VIDEO_LIST", TKBean.class).size() > 0) {
                this.mVideoList.addAll(k.i(getActivity()).b("_CACHE_VIDEO_LIST", TKBean.class));
                this.mTiktok2Adapter.notifyDataSetChanged();
            } else {
                ((TKFragmentViewModel) this.viewModel).o(true);
            }
        } else {
            if (VideoCollectionDao.getInstance().isExist(this.bean.getNetCineVarListVod_id())) {
                this.isCollection = true;
            } else {
                this.isCollection = false;
            }
            for (int i10 = 0; i10 < Integer.parseInt(this.bean.getNetCineVarListVod_serial()); i10++) {
                TKBean tKBean = new TKBean();
                TKBean tKBean2 = this.bean;
                tKBean.netCineVarListVod_name = tKBean2.netCineVarListVod_name;
                tKBean.setNetCineVarListVod_id(tKBean2.getNetCineVarListVod_id());
                tKBean.setNetCineVarListVod_actor(this.bean.getNetCineVarListVod_actor());
                tKBean.setNetCineVarListVod_blurb(this.bean.getNetCineVarListVod_blurb());
                tKBean.setNetCineVarListVod_pic(this.bean.getNetCineVarListVod_pic());
                tKBean.setNetCineVarListVod_url(this.bean.getNetCineVarListVod_url());
                tKBean.setNetCineVarListVod_tag(this.bean.getNetCineVarListVod_tag());
                tKBean.setNetCineVarListVod_serial(this.bean.getNetCineVarListVod_serial());
                tKBean.setNetCineVarIsLike(this.isCollection);
                tKBean.setAd_freq(this.bean.getAd_freq());
                tKBean.setAd_collection(this.bean.getAd_collection());
                tKBean.setNetCineVarIsShow(true);
                this.mVideoList.add(tKBean);
            }
            this.mTiktok2Adapter.notifyDataSetChanged();
        }
        int iMax = Math.max(this.pos, 0);
        this.mCurPos = iMax;
        ((FragmentTKBinding) this.binding).f40302b.setCurrentItem(iMax);
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment
    public void initViewObservable() {
        super.initViewObservable();
        ((TKFragmentViewModel) this.viewModel).f41646f.observe(this, new Observer() { // from class: y9.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f75328b.lambda$initViewObservable$0((List) obj);
            }
        });
        ((TKFragmentViewModel) this.viewModel).f41647g.observe(this, new Observer() { // from class: y9.g
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f75329b.lambda$initViewObservable$1((Boolean) obj);
            }
        });
        ((TKFragmentViewModel) this.viewModel).f41651k.observe(this, new Observer() { // from class: y9.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f75330b.lambda$initViewObservable$2((Boolean) obj);
            }
        });
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mPreloadManager.removeAllPreloadTask();
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mVideoView.release();
        CommentDialog commentDialog = this.dialog;
        if (commentDialog != null) {
            commentDialog.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z10) {
        super.onHiddenChanged(z10);
        this.isPlay = z10;
        if (z10) {
            VideoViewAPlay videoViewAPlay = this.mVideoView;
            if (videoViewAPlay != null) {
                videoViewAPlay.release();
            }
            videoStayTime();
            return;
        }
        startPlay(this.mCurPos);
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        videoStayTime();
        this.mVideoView.release();
    }

    @Override // me.goldze.mvvmhabit.base.BaseFragment, com.trello.rxlifecycle2.components.support.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.mVideoView != null && !this.isPlay) {
            this.webBasic = System.currentTimeMillis();
            ((FragmentTKBinding) this.binding).f40302b.post(new e());
        }
    }
}
