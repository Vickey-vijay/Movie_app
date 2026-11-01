package com.mgs.carparking.ui.channelcontent;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import cc.f;
import com.bumptech.glide.Glide;
import com.fvvcl.flickverse.R;
import com.google.android.material.appbar.AppBarLayout;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.FragmentChannelBinding;
import com.mgs.carparking.model.CHANNELVIEWMODEL;
import com.mgs.carparking.widgets.AppBarStateChangeListener;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import ec.e;
import ec.g;
import em.m;
import em.o;
import em.r;
import me.goldze.mvvmhabit.base.BaseApplication;

/* JADX INFO: loaded from: classes7.dex */
public class ChannelFragment extends BaseActivity<FragmentChannelBinding, CHANNELVIEWMODEL> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f41756h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f41757i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TypeChannelAdapter f41758j;

    public class a extends AppBarStateChangeListener {
        public a() {
        }

        @Override // com.mgs.carparking.widgets.AppBarStateChangeListener
        public void a(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
            if (state == AppBarStateChangeListener.State.EXPANDED) {
                ((FragmentChannelBinding) ChannelFragment.this.f39697c).f40105n.setText("");
                ((FragmentChannelBinding) ChannelFragment.this.f39697c).f40102k.setVisibility(8);
                ((FragmentChannelBinding) ChannelFragment.this.f39697c).f40100i.setVisibility(0);
            } else if (state == AppBarStateChangeListener.State.COLLAPSED) {
                ((FragmentChannelBinding) ChannelFragment.this.f39697c).f40105n.setText(((CHANNELVIEWMODEL) ChannelFragment.this.f39698d).F());
                ((FragmentChannelBinding) ChannelFragment.this.f39697c).f40102k.setVisibility(0);
                ((FragmentChannelBinding) ChannelFragment.this.f39697c).f40100i.setVisibility(8);
            } else {
                ((FragmentChannelBinding) ChannelFragment.this.f39697c).f40105n.setText("");
                ((FragmentChannelBinding) ChannelFragment.this.f39697c).f40102k.setVisibility(8);
                ((FragmentChannelBinding) ChannelFragment.this.f39697c).f40100i.setVisibility(0);
            }
        }
    }

    public class b implements g {
        public b() {
        }

        @Override // ec.g
        public void d(@NonNull f fVar) {
            ((CHANNELVIEWMODEL) ChannelFragment.this.f39698d).S(true);
        }
    }

    public class c implements e {
        public c() {
        }

        @Override // ec.e
        public void a(@NonNull f fVar) {
            ((CHANNELVIEWMODEL) ChannelFragment.this.f39698d).S(false);
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.fragment_channel;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(Void r10) {
        ((FragmentChannelBinding) this.f39697c).f40101j.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(Void r10) {
        ((FragmentChannelBinding) this.f39697c).f40101j.s();
        ((CHANNELVIEWMODEL) this.f39698d).f41080m.set(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(Void r10) {
        ((FragmentChannelBinding) this.f39697c).f40101j.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(Void r10) {
        ((FragmentChannelBinding) this.f39697c).f40101j.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(Void r10) {
        ((FragmentChannelBinding) this.f39697c).f40101j.J(false);
    }

    public final void F() {
        ((FragmentChannelBinding) this.f39697c).f40101j.H(true);
        ClassicsHeader classicsHeader = new ClassicsHeader(this);
        ((FragmentChannelBinding) this.f39697c).f40101j.I(true);
        classicsHeader.u(12.0f);
        new ClassicsFooter(this).u(12.0f);
        ((FragmentChannelBinding) this.f39697c).f40101j.L(new b());
        ((FragmentChannelBinding) this.f39697c).f40101j.K(new c());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public CHANNELVIEWMODEL initViewModel() {
        return new CHANNELVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(Integer num) {
        if (num.intValue() - 3 >= 0) {
            ((FragmentChannelBinding) this.f39697c).f40103l.scrollToPosition(num.intValue() - 3);
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        this.f41756h = getIntent().getStringExtra("name");
        int intExtra = getIntent().getIntExtra("video_type", 0);
        this.f41757i = intExtra;
        if (intExtra > 0) {
            VM vm2 = this.f39698d;
            ((CHANNELVIEWMODEL) vm2).f41074g = intExtra;
            if (intExtra == 1) {
                ((CHANNELVIEWMODEL) vm2).f41075h.set(r.a().getResources().getString(R.string.text_movie));
            } else if (intExtra == 2) {
                ((CHANNELVIEWMODEL) vm2).f41075h.set(r.a().getResources().getString(R.string.text_tv));
            } else if (intExtra == 4) {
                ((CHANNELVIEWMODEL) vm2).f41075h.set(r.a().getResources().getString(R.string.text_dongman));
            } else if (intExtra == 3) {
                ((CHANNELVIEWMODEL) vm2).f41075h.set(r.a().getResources().getString(R.string.text_zongyi));
            }
        }
        if (!o.b(this.f41756h)) {
            ((CHANNELVIEWMODEL) this.f39698d).f41077j = this.f41756h;
        }
        ((FragmentChannelBinding) this.f39697c).f40093b.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) new a());
        F();
        Glide.with((FragmentActivity) this).load(Integer.valueOf(R.drawable.ic_is_loading)).into(((FragmentChannelBinding) this.f39697c).f40098g);
        Glide.with((FragmentActivity) this).load(Integer.valueOf(R.drawable.ic_is_loading)).into(((FragmentChannelBinding) this.f39697c).f40099h);
        TypeChannelAdapter typeChannelAdapter = new TypeChannelAdapter();
        this.f41758j = typeChannelAdapter;
        ((FragmentChannelBinding) this.f39697c).f40103l.setAdapter(typeChannelAdapter);
        ((CHANNELVIEWMODEL) this.f39698d).R();
        ((CHANNELVIEWMODEL) this.f39698d).S(true);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((CHANNELVIEWMODEL) this.f39698d).f41089v.observe(this, new Observer() { // from class: aa.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3507b.G((Void) obj);
            }
        });
        ((CHANNELVIEWMODEL) this.f39698d).f41086s.observe(this, new Observer() { // from class: aa.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3508b.H((Void) obj);
            }
        });
        ((CHANNELVIEWMODEL) this.f39698d).f41088u.observe(this, new Observer() { // from class: aa.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3509b.I((Void) obj);
            }
        });
        ((CHANNELVIEWMODEL) this.f39698d).f41087t.observe(this, new Observer() { // from class: aa.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3510b.J((Void) obj);
            }
        });
        ((CHANNELVIEWMODEL) this.f39698d).f41090w.observe(this, new Observer() { // from class: aa.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3511b.K((Void) obj);
            }
        });
        ((CHANNELVIEWMODEL) this.f39698d).f41091x.observe(this, new Observer() { // from class: aa.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f3512b.L((Integer) obj);
            }
        });
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m.d(this);
        m.c(this);
    }
}
