package com.mgs.carparking.util;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.fvvcl.flickverse.R;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ScrollTextView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f42223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f42224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f42225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f42226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Runnable f42231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<String> f42232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f42233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f42234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f42235n;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ScrollTextView scrollTextView = ScrollTextView.this;
            scrollTextView.f42226e = !scrollTextView.f42226e;
            if (ScrollTextView.this.f42233l == ScrollTextView.this.f42232k.size() - 1) {
                ScrollTextView.this.f42233l = 0;
            }
            if (ScrollTextView.this.f42226e) {
                TextView textView = ScrollTextView.this.f42223b;
                List list = ScrollTextView.this.f42232k;
                ScrollTextView scrollTextView2 = ScrollTextView.this;
                int i10 = scrollTextView2.f42233l;
                scrollTextView2.f42233l = i10 + 1;
                textView.setText((CharSequence) list.get(i10));
                ScrollTextView.this.f42224c.setText((CharSequence) ScrollTextView.this.f42232k.get(ScrollTextView.this.f42233l));
            } else {
                TextView textView2 = ScrollTextView.this.f42224c;
                List list2 = ScrollTextView.this.f42232k;
                ScrollTextView scrollTextView3 = ScrollTextView.this;
                int i11 = scrollTextView3.f42233l;
                scrollTextView3.f42233l = i11 + 1;
                textView2.setText((CharSequence) list2.get(i11));
                ScrollTextView.this.f42223b.setText((CharSequence) ScrollTextView.this.f42232k.get(ScrollTextView.this.f42233l));
            }
            ScrollTextView scrollTextView4 = ScrollTextView.this;
            scrollTextView4.f42227f = scrollTextView4.f42226e ? 0 : ScrollTextView.this.f42234m;
            ScrollTextView scrollTextView5 = ScrollTextView.this;
            scrollTextView5.f42228g = scrollTextView5.f42226e ? -ScrollTextView.this.f42234m : 0;
            ObjectAnimator.ofFloat(ScrollTextView.this.f42223b, "translationY", ScrollTextView.this.f42227f, ScrollTextView.this.f42228g).setDuration(300L).start();
            ScrollTextView scrollTextView6 = ScrollTextView.this;
            scrollTextView6.f42229h = scrollTextView6.f42226e ? ScrollTextView.this.f42234m : 0;
            ScrollTextView scrollTextView7 = ScrollTextView.this;
            scrollTextView7.f42230i = scrollTextView7.f42226e ? 0 : -ScrollTextView.this.f42234m;
            ObjectAnimator.ofFloat(ScrollTextView.this.f42224c, "translationY", ScrollTextView.this.f42229h, ScrollTextView.this.f42230i).setDuration(300L).start();
            ScrollTextView.this.f42225d.postDelayed(ScrollTextView.this.f42231j, 3000L);
        }
    }

    public ScrollTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollTextView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42226e = false;
        this.f42233l = 0;
        this.f42234m = 100;
        this.f42235n = false;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.widget_scroll_text_layout, this);
        this.f42223b = (TextView) viewInflate.findViewById(R.id.tv_banner1);
        this.f42224c = (TextView) viewInflate.findViewById(R.id.tv_banner2);
        this.f42225d = new Handler();
        this.f42231j = new a();
    }

    public List<String> getList() {
        return this.f42232k;
    }

    public void s() {
        this.f42223b.setText(this.f42232k.get(0));
        if (this.f42232k.size() <= 1) {
            this.f42235n = false;
        } else {
            if (this.f42235n) {
                return;
            }
            this.f42235n = true;
            this.f42225d.postDelayed(this.f42231j, 3000L);
        }
    }

    public void setList(List<String> list) {
        this.f42232k = list;
        if (list.size() > 1) {
            list.add(list.get(0));
        }
    }

    public void t() {
        this.f42225d.removeCallbacks(this.f42231j);
        this.f42235n = false;
    }
}
