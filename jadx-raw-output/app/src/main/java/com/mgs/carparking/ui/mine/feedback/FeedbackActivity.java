package com.mgs.carparking.ui.mine.feedback;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Observer;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityFeedbackBinding;
import com.mgs.carparking.model.FEEDBACKVIEWMODEL;
import com.tbruyelle.rxpermissions2.RxPermissions;
import em.o;
import em.r;
import java.io.File;
import me.goldze.mvvmhabit.base.BaseApplication;
import oi.g;
import sa.i0;
import sa.s;
import x9.n;

/* JADX INFO: loaded from: classes4.dex */
public class FeedbackActivity extends BaseActivity<ActivityFeedbackBinding, FEEDBACKVIEWMODEL> implements i0.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public gb.a f42103j;

    public class a implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((FEEDBACKVIEWMODEL) FeedbackActivity.this.f39698d).f41192p.set(editable.toString().trim());
            ((FEEDBACKVIEWMODEL) FeedbackActivity.this.f39698d).f41191o.set(editable.toString().length() + "/200");
        }
    }

    public class b implements gb.a.d {
        public b() {
        }

        @Override // gb.a.d
        public void a(int i10) {
            FeedbackActivity.this.camera(i10);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ((ActivityFeedbackBinding) FeedbackActivity.this.f39697c).f39830h.scrollTo(0, 1000);
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_feedback;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // sa.i0.a
    public void onSoftKeyboardClosed() {
    }

    public final void z(int i10, int i11) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(n nVar) throws Exception {
        ((FEEDBACKVIEWMODEL) this.f39698d).f41193q.set(Boolean.valueOf(nVar.a()));
    }

    public void camera(final int i10) {
        k(new RxPermissions(this).request("android.permission.CAMERA").subscribe(new g() { // from class: ma.a
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f64309b.v(i10, (Boolean) obj);
            }
        }));
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public FEEDBACKVIEWMODEL initViewModel() {
        return new FEEDBACKVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    public final void u() {
        new Handler().postDelayed(new c(), 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(int i10, Boolean bool) throws Exception {
        if (bool.booleanValue()) {
            if (i10 == 2) {
                z(1, 101);
            } else if (i10 == 1) {
                z(2, 102);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(Void r10) {
        s.b().a(this);
        if (this.f42103j == null) {
            this.f42103j = new gb.a(this);
        }
        this.f42103j.showAtLocation(((ActivityFeedbackBinding) this.f39697c).f39825c, 80, 0, 0);
        this.f42103j.a(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(String str) {
        sa.a.a(this, str);
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        this.f42101h = getIntent().getStringExtra("content");
        int intExtra = getIntent().getIntExtra("flag", 0);
        this.f42102i = intExtra;
        if (intExtra == 1 && !o.b(this.f42101h)) {
            ((ActivityFeedbackBinding) this.f39697c).f39825c.setText(this.f42101h + "  " + r.a().getResources().getString(R.string.str_txt_feed_find_movie));
            V v10 = this.f39697c;
            ((ActivityFeedbackBinding) v10).f39825c.setSelection(((ActivityFeedbackBinding) v10).f39825c.length());
            ((FEEDBACKVIEWMODEL) this.f39698d).f41192p.set(this.f42101h + "  " + r.a().getResources().getString(R.string.str_txt_feed_find_movie));
        } else if (this.f42102i == 3) {
            ((ActivityFeedbackBinding) this.f39697c).f39825c.setHint(r.a().getResources().getString(R.string.str_account_input));
        } else if (!o.b(this.f42101h)) {
            ((ActivityFeedbackBinding) this.f39697c).f39825c.setText(this.f42101h + "  " + r.a().getResources().getString(R.string.str_txt_feed_play_movie));
            V v11 = this.f39697c;
            ((ActivityFeedbackBinding) v11).f39825c.setSelection(((ActivityFeedbackBinding) v11).f39825c.length());
            ((FEEDBACKVIEWMODEL) this.f39698d).f41192p.set(this.f42101h + "  " + r.a().getResources().getString(R.string.str_txt_feed_play_movie));
        }
        ((ActivityFeedbackBinding) this.f39697c).f39825c.requestFocus();
        new i0(((ActivityFeedbackBinding) this.f39697c).f39830h).a(this);
        ((FEEDBACKVIEWMODEL) this.f39698d).getType(this.f42102i);
        ((ActivityFeedbackBinding) this.f39697c).f39825c.addTextChangedListener(new a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        k(tl.a.a().e(n.class).subscribe(new g() { // from class: ma.b
            @Override // oi.g
            public final void accept(Object obj) throws Exception {
                this.f64311b.w((n) obj);
            }
        }));
        ((FEEDBACKVIEWMODEL) this.f39698d).f41194r.observe(this, new Observer() { // from class: ma.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f64312b.x((Void) obj);
            }
        });
        ((FEEDBACKVIEWMODEL) this.f39698d).f41197u.observe(this, new Observer() { // from class: ma.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f64313b.y((String) obj);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @RequiresApi(api = 26)
    public void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i11 != -1) {
            return;
        }
        if (i10 == 101 && intent != null) {
            String stringExtra = intent.getStringExtra("result");
            if (!o.b(stringExtra)) {
                File file = new File(stringExtra);
                ((ActivityFeedbackBinding) this.f39697c).f39827e.setImageURI(Uri.fromFile(file));
                ((FEEDBACKVIEWMODEL) this.f39698d).f41195s.set(Boolean.TRUE);
                ((FEEDBACKVIEWMODEL) this.f39698d).z(file);
                Log.v("wht获取返回的图片路径--1", stringExtra);
                return;
            }
            return;
        }
        if (i10 == 102 && intent != null) {
            for (String str : intent.getStringArrayListExtra("result")) {
                Log.v("wht获取返回的图片路径--2", str);
                if (!o.b(str)) {
                    File file2 = new File(str);
                    ((ActivityFeedbackBinding) this.f39697c).f39827e.setImageURI(Uri.fromFile(file2));
                    ((FEEDBACKVIEWMODEL) this.f39698d).f41195s.set(Boolean.TRUE);
                    ((FEEDBACKVIEWMODEL) this.f39698d).z(file2);
                }
            }
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        em.n.a(this);
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gb.a aVar = this.f42103j;
        if (aVar != null) {
            if (aVar.isShowing()) {
                this.f42103j.dismiss();
            }
            this.f42103j = null;
        }
    }

    @Override // sa.i0.a
    public void onSoftKeyboardOpened(int i10) {
        u();
    }
}
