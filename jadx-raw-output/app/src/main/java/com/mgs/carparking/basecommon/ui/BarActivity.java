package com.mgs.carparking.basecommon.ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fvvcl.flickverse.R;
import com.google.android.material.appbar.AppBarLayout;
import com.mgs.carparking.basecommon.widget.VariedTextView;
import t9.f;

/* JADX INFO: loaded from: classes6.dex */
public class BarActivity extends BaseActivity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameLayout f39709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FrameLayout f39710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f39711g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39708d = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f39712h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f39713i = 0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((InputMethodManager) BarActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t9.c f39715b;

        public b(t9.c cVar) {
            this.f39715b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t9.c cVar = this.f39715b;
            if (cVar != null) {
                cVar.apply();
            } else {
                BarActivity.this.onBackPressed();
            }
        }
    }

    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t9.c f39717b;

        public c(t9.c cVar) {
            this.f39717b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t9.c cVar = this.f39717b;
            if (cVar != null) {
                cVar.apply();
            }
        }
    }

    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t9.c f39719b;

        public d(t9.c cVar) {
            this.f39719b = cVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t9.c cVar = this.f39719b;
            if (cVar != null) {
                cVar.apply();
            }
        }
    }

    public void setActionBarRight(t9.c cVar) {
        setActionBarRight(null, cVar);
    }

    public void setActionBarTitle(@Nullable String str) {
        setActionBarTitle(str, false, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i10) {
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.activity_base_layout, (ViewGroup) null, false);
        this.f39711g = viewInflate;
        super.setContentView(viewInflate);
        this.f39709e = (FrameLayout) findViewById(R.id.contentParent);
        setContentView(LayoutInflater.from(this).inflate(i10, (ViewGroup) this.f39709e, false));
    }

    public boolean isCreateActionBar() {
        return this.f39708d;
    }

    public void setActionBarBg(@ColorInt int i10) {
        if (!this.f39708d) {
            throw new NullPointerException("createActionBar false");
        }
        ((AppBarLayout) findViewById(R.id.rootActionBarView)).setBackgroundColor(i10);
    }

    public void setActionBarRight(@Nullable String str, t9.c cVar) {
        if (!this.f39708d) {
            throw new NullPointerException("createActionBar false");
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.flRightButton);
        TextView textView = (TextView) findViewById(R.id.rightText);
        textView.setVisibility(0);
        if (str != null) {
            textView.setText(str);
        }
        frameLayout.setOnClickListener(new c(cVar));
    }

    public void setActionBarTitle(boolean z10, t9.c cVar) {
        setActionBarTitle("", z10, cVar);
    }

    public void setActionLeftIcon(@DrawableRes int i10, t9.c cVar) {
        if (!this.f39708d) {
            throw new NullPointerException("createActionBar false");
        }
        ImageView imageView = (ImageView) findViewById(R.id.leftImage);
        ((VariedTextView) findViewById(R.id.leftButton)).setVisibility(8);
        imageView.setVisibility(0);
        imageView.setBackgroundResource(i10);
        imageView.setOnClickListener(new d(cVar));
    }

    public void setActionTitleColor(@ColorInt int i10) {
        if (!this.f39708d) {
            throw new NullPointerException("createActionBar false");
        }
        ((TextView) findViewById(R.id.title)).setTextColor(i10);
    }

    public void setCreateActionBar(boolean z10) {
        this.f39708d = z10;
    }

    public void setFitsSystemWindows(boolean z10) {
        View view = this.f39711g;
        if (view != null) {
            view.setFitsSystemWindows(z10);
        }
        this.f39712h = z10;
    }

    @NonNull
    public View getActionBarContentView(FrameLayout frameLayout) {
        return LayoutInflater.from(this).inflate(R.layout.action_bar_header, (ViewGroup) frameLayout, false);
    }

    @Override // com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        f.c(this);
    }

    @Override // com.mgs.carparking.basecommon.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public void setActionBarTitle(@Nullable String str, boolean z10, t9.c cVar) {
        if (!this.f39708d) {
            j9.a.a(BarActivity.class, "createActionBar false");
        }
        TextView textView = (TextView) findViewById(R.id.title);
        VariedTextView variedTextView = (VariedTextView) findViewById(R.id.leftButton);
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        variedTextView.setVisibility(z10 ? 0 : 8);
        if (z10) {
            variedTextView.setOnClickListener(new b(cVar));
        }
    }

    public void setContentView(int i10, boolean z10) {
        setCreateActionBar(z10);
        setContentView(i10);
    }

    public void setContentView(View view, boolean z10) {
        setCreateActionBar(z10);
        setContentView(view);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        if (this.f39709e == null) {
            super.setContentView(R.layout.activity_base_layout);
            this.f39711g = findViewById(R.id.rootView);
            this.f39709e = (FrameLayout) findViewById(R.id.contentParent);
        }
        this.f39711g.setFitsSystemWindows(this.f39712h);
        FrameLayout frameLayout = this.f39709e;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new a());
        }
        this.f39709e.addView(view);
        if (this.f39708d) {
            FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.barRootView);
            this.f39710f = frameLayout2;
            frameLayout2.setVisibility(0);
            View actionBarContentView = getActionBarContentView(this.f39710f);
            if (actionBarContentView != null) {
                this.f39710f.addView(actionBarContentView);
                return;
            }
            throw new NullPointerException("createActionBar cannot are return for null");
        }
    }
}
