package com.mgs.carparking.widgets.tab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fvvcl.flickverse.R;
import java.util.ArrayList;
import sa.e;
import x9.s;

/* JADX INFO: loaded from: classes7.dex */
public class TabLayout extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<b> f42885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f42886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f42887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42888e;

    public interface a {
        void onTabClick(b bVar);
    }

    public class c extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImageView f42895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f42896c;

        public c(Context context) {
            super(context);
            a();
        }

        public void setUpData(b bVar) {
            this.f42895b.setBackgroundResource(bVar.f42889a);
            this.f42896c.setText(bVar.f42890b);
        }

        public final void a() {
            LayoutInflater.from(getContext()).inflate(R.layout.widget_tab_view, (ViewGroup) this, true);
            setOrientation(1);
            setGravity(81);
            this.f42895b = (ImageView) findViewById(R.id.mTabImg);
            this.f42896c = (TextView) findViewById(R.id.mTabLabel);
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public final void c() {
        setOrientation(0);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f42889a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f42890b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f42891c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f42892d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f42893e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Class<? extends jb.a> f42894f;

        public b(int i10, String str, int i11, int i12, Class<? extends jb.a> cls, int i13) {
            this.f42889a = i10;
            this.f42890b = str;
            this.f42893e = i11;
            this.f42891c = i12;
            this.f42894f = cls;
            this.f42892d = i13;
        }
    }

    public c a(int i10) {
        if (i10 >= this.f42888e || i10 < 0) {
            return null;
        }
        return (c) getChildAt(i10);
    }

    public void b(ArrayList<b> arrayList, a aVar) {
        this.f42885b = arrayList;
        this.f42886c = aVar;
        if (arrayList == null || arrayList.size() <= 0) {
            throw new IllegalArgumentException("tabs can't be empty");
        }
        this.f42888e = arrayList.size();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.gravity = 81;
        layoutParams.weight = 1.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            c cVar = new c(getContext());
            cVar.setTag(arrayList.get(i10));
            cVar.setUpData(arrayList.get(i10));
            cVar.setOnClickListener(this);
            addView(cVar, layoutParams);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view != null) {
            if (this.f42887d == view) {
                if (e.q() && ((b) view.getTag()).f42892d == 0) {
                    tl.a.a().b(new s());
                    return;
                }
                return;
            }
            this.f42886c.onTabClick((b) view.getTag());
            view.setSelected(true);
            View view2 = this.f42887d;
            if (view2 != null) {
                view2.setSelected(false);
            }
            this.f42887d = view;
        }
    }

    public void setCurrentTab(int i10) {
        if (i10 >= this.f42888e || i10 < 0) {
            return;
        }
        onClick(getChildAt(i10));
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        c();
    }
}
