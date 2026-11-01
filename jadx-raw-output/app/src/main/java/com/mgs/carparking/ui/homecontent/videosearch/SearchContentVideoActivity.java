package com.mgs.carparking.ui.homecontent.videosearch;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.adapter.MyPagerListAdapter;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivitySearchVideoBinding;
import com.mgs.carparking.databinding.DialogSearchHistoryClearBinding;
import com.mgs.carparking.db.SearchHistoryDao;
import com.mgs.carparking.dbtable.SearchHistoryEntity;
import com.mgs.carparking.model.SEARCHCONTENTVIDEOVIEWMODEL;
import em.n;
import em.o;
import gb.h;
import ii.k;
import ii.p;
import ii.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import oi.q;
import sa.s;

/* JADX INFO: loaded from: classes4.dex */
public class SearchContentVideoActivity extends BaseActivity<ActivitySearchVideoBinding, SEARCHCONTENTVIDEOVIEWMODEL> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MyPagerListAdapter f41988h;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public LinearLayout.LayoutParams f41992l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public DialogSearchHistoryClearBinding f41993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Dialog f41994n;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<BaseFragment> f41989i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<String> f41990j = new ArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<SearchHistoryEntity> f41991k = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Handler f41995o = new Handler();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f41996p = "";

    public class a implements TextView.OnEditorActionListener {
        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            if (i10 != 3) {
                return false;
            }
            ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f39698d).D.b();
            return true;
        }

        public a() {
        }
    }

    public class b implements TextWatcher {
        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public b() {
        }
    }

    public class c implements r<String> {
        @Override // ii.r
        public void onComplete() {
        }

        @Override // ii.r
        public void onError(Throwable th2) {
        }

        @Override // ii.r
        public void onSubscribe(mi.b bVar) {
        }

        public c() {
        }

        @Override // ii.r
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(String str) {
            SearchContentVideoActivity.this.f41996p = str.trim();
            if (!((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f39698d).f41333o.get().equals(SearchContentVideoActivity.this.f41996p)) {
                ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f39698d).f41330l.set(false);
                ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f39698d).f41329k.set(true);
            }
            if (o.b(SearchContentVideoActivity.this.f41996p)) {
                ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f39698d).f41325g.set(SearchContentVideoActivity.this.getResources().getString(R.string.text_cannel));
                ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f39698d).f41331m.set(Boolean.FALSE);
                return;
            }
            if (((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f39698d).f41330l.get()) {
                ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f39698d).f41325g.set(SearchContentVideoActivity.this.getResources().getString(R.string.text_cannel));
            } else {
                ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f39698d).f41325g.set(SearchContentVideoActivity.this.getResources().getString(R.string.text_home_videosearch_search));
            }
            ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f39698d).f41331m.set(Boolean.TRUE);
            ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f39698d).F(SearchContentVideoActivity.this.f41996p);
        }
    }

    public class d implements oi.o<l7.c, p<String>> {
        public d() {
        }

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p<String> apply(l7.c cVar) throws Exception {
            String string = cVar.e().toString();
            t9.b.c(cVar.e().toString());
            return k.just(string);
        }
    }

    public class e implements q<l7.c> {
        public e() {
        }

        @Override // oi.q
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(l7.c cVar) throws Exception {
            cVar.e().toString();
            return true;
        }
    }

    public class f implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SearchHistoryEntity f42002b;

        public f(SearchHistoryEntity searchHistoryEntity) {
            this.f42002b = searchHistoryEntity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f39698d).f41326h.set(this.f42002b.getContent());
            ((SEARCHCONTENTVIDEOVIEWMODEL) SearchContentVideoActivity.this.f39698d).D.b();
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_search_video;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(String str) {
        SearchHistoryEntity searchHistoryEntity = new SearchHistoryEntity();
        searchHistoryEntity.setCreateTime(System.currentTimeMillis());
        searchHistoryEntity.setContent(str);
        addItemHistory(searchHistoryEntity, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(String str) {
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d).f41329k.set(false);
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d).f41330l.set(true);
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d).f41325g.set(em.r.a().getResources().getString(R.string.text_cannel));
        this.f41988h.a(((ActivitySearchVideoBinding) this.f39697c).f39932g);
        this.f41989i.clear();
        this.f41989i.add(HomeContentSearchListFragment.newInstance(0, str));
        this.f41989i.add(HomeContentSearchListFragment.newInstance(2, str));
        this.f41989i.add(HomeContentSearchListFragment.newInstance(1, str));
        this.f41988h.b(this.f41989i);
        ((ActivitySearchVideoBinding) this.f39697c).f39932g.setAdapter(this.f41988h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(Void r10) {
        s.c((EditText) ((ActivitySearchVideoBinding) this.f39697c).getRoot().findViewById(R.id.et_search));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Boolean bool) {
        if (bool == null || this.f41991k == null) {
            return;
        }
        toggleClearHistoryDialog(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N(Boolean bool) {
        if (((ActivitySearchVideoBinding) this.f39697c).f39928c != null) {
            ((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d).f41340v.set(Boolean.FALSE);
            ((ActivitySearchVideoBinding) this.f39697c).f39928c.removeAllViews();
            SearchHistoryDao.getInstance().clearHistory();
        }
        Dialog dialog = this.f41994n;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(Void r10) {
        Log.i("wangyi", "内容为：" + ((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d).f41326h.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(Void r10) {
        if (AppApplication.adInfoEntry.getAd_position_3() == null || AppApplication.adInfoEntry.getAd_position_3().size() <= 0) {
            return;
        }
        sa.b.i(this, ((ActivitySearchVideoBinding) this.f39697c).f39929d, AppApplication.adInfoEntry.getAd_position_3());
    }

    public void addHistory(List<SearchHistoryEntity> list) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        this.f41992l = layoutParams;
        layoutParams.setMargins(10, 10, 10, 10);
        V v10 = this.f39697c;
        if (((ActivitySearchVideoBinding) v10).f39928c != null) {
            ((ActivitySearchVideoBinding) v10).f39928c.removeAllViews();
        }
        if (list.size() > 0) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                addItemHistory(list.get(i10), false);
            }
        }
    }

    public void addItemHistory(SearchHistoryEntity searchHistoryEntity, boolean z10) {
        if (z10 && SearchHistoryDao.getInstance().insertHistory(searchHistoryEntity) == 0) {
            return;
        }
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d).f41340v.set(Boolean.TRUE);
        TextView textView = (TextView) LayoutInflater.from(this).inflate(R.layout.item_history_search, (ViewGroup) ((ActivitySearchVideoBinding) this.f39697c).f39928c, false).findViewById(R.id.tv_name);
        textView.setText(searchHistoryEntity.getContent());
        textView.setOnClickListener(new f(searchHistoryEntity));
        ((ActivitySearchVideoBinding) this.f39697c).f39928c.addView(textView, 0, this.f41992l);
        if (((ActivitySearchVideoBinding) this.f39697c).f39928c.getChildCount() == 11) {
            ((ActivitySearchVideoBinding) this.f39697c).f39928c.removeViewAt(10);
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public SEARCHCONTENTVIDEOVIEWMODEL initViewModel() {
        return new SEARCHCONTENTVIDEOVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    public void toggleClearHistoryDialog(boolean z10) {
        if (z10) {
            if (this.f41994n == null) {
                this.f41994n = h.a(this, this.f41993m.getRoot(), true);
            }
            this.f41994n.show();
        } else {
            Dialog dialog = this.f41994n;
            if (dialog != null) {
                dialog.dismiss();
            }
        }
    }

    public void ext(EditText editText) {
        l7.b.a(editText).debounce(500L, TimeUnit.MILLISECONDS).filter(new e()).flatMap(new d()).subscribe(new c());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        DialogSearchHistoryClearBinding dialogSearchHistoryClearBinding = (DialogSearchHistoryClearBinding) DataBindingUtil.inflate(LayoutInflater.from(em.r.a()), R.layout.dialog_search_history_clear, null, false);
        this.f41993m = dialogSearchHistoryClearBinding;
        dialogSearchHistoryClearBinding.a((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d);
        ArrayList<SearchHistoryEntity> arrayListQueryHistory = SearchHistoryDao.getInstance().queryHistory();
        this.f41991k = arrayListQueryHistory;
        if (arrayListQueryHistory.size() == 0) {
            ((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d).f41340v.set(Boolean.FALSE);
        }
        addHistory(this.f41991k);
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d).E();
        for (int i10 = 0; i10 < 5; i10++) {
            if (i10 == 0) {
                V v10 = this.f39697c;
                ((ActivitySearchVideoBinding) v10).f39931f.addTab(((ActivitySearchVideoBinding) v10).f39931f.newTab().setText(em.r.a().getResources().getString(R.string.text_video_type_all)));
                this.f41990j.add(em.r.a().getResources().getString(R.string.text_video_type_all));
            } else if (i10 == 1) {
                V v11 = this.f39697c;
                ((ActivitySearchVideoBinding) v11).f39931f.addTab(((ActivitySearchVideoBinding) v11).f39931f.newTab().setText(em.r.a().getResources().getString(R.string.text_tv)));
                this.f41990j.add(em.r.a().getResources().getString(R.string.text_tv));
            } else if (i10 == 2) {
                V v12 = this.f39697c;
                ((ActivitySearchVideoBinding) v12).f39931f.addTab(((ActivitySearchVideoBinding) v12).f39931f.newTab().setText(em.r.a().getResources().getString(R.string.text_movie)));
                this.f41990j.add(em.r.a().getResources().getString(R.string.text_movie));
            }
        }
        ((ActivitySearchVideoBinding) this.f39697c).f39931f.setTabMode(0);
        this.f41988h = new MyPagerListAdapter(getSupportFragmentManager());
        V v13 = this.f39697c;
        ((ActivitySearchVideoBinding) v13).f39931f.setupWithViewPager(((ActivitySearchVideoBinding) v13).f39932g);
        this.f41988h.b(this.f41989i);
        this.f41988h.c(this.f41990j);
        ((ActivitySearchVideoBinding) this.f39697c).f39932g.setAdapter(this.f41988h);
        s.b().d(((ActivitySearchVideoBinding) this.f39697c).f39927b);
        ((ActivitySearchVideoBinding) this.f39697c).f39927b.setOnEditorActionListener(new a());
        ext(((ActivitySearchVideoBinding) this.f39697c).f39927b);
        ((ActivitySearchVideoBinding) this.f39697c).f39927b.addTextChangedListener(new b());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d).f41335q.observe(this, new Observer() { // from class: ga.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53210b.J((String) obj);
            }
        });
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d).f41337s.observe(this, new Observer() { // from class: ga.k
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53211b.K((String) obj);
            }
        });
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d).f41336r.observe(this, new Observer() { // from class: ga.l
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53212b.L((Void) obj);
            }
        });
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d).f41338t.observe(this, new Observer() { // from class: ga.m
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53213b.M((Boolean) obj);
            }
        });
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d).f41339u.observe(this, new Observer() { // from class: ga.n
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53214b.N((Boolean) obj);
            }
        });
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d).f41334p.observe(this, new Observer() { // from class: ga.o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53215b.O((Void) obj);
            }
        });
        ((SEARCHCONTENTVIDEOVIEWMODEL) this.f39698d).f41341w.observe(this, new Observer() { // from class: ga.p
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f53216b.P((Void) obj);
            }
        });
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f41994n != null) {
            this.f41994n = null;
        }
        Handler handler = this.f41995o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f41995o = null;
        }
    }
}
