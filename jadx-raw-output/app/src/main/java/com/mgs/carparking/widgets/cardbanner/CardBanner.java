package com.mgs.carparking.widgets.cardbanner;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.R$styleable;
import com.mgs.carparking.widgets.cardbanner.adapter.CardAdapter;
import com.mgs.carparking.widgets.cardbanner.view.CardView;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class CardBanner extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bb.c f42320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f42321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f42322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f42328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayoutManager f42329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PagerSnapHelper f42330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CardView f42331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List<bb.b> f42332n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public db.a f42333o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public eb.a f42334p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f42335q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d f42336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public cb.a f42337s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f42338t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f42339u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f42340v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f42341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CardAdapter f42342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Runnable f42343y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e f42344z;

    public class a implements CardView.b {
        public a() {
        }

        @Override // com.mgs.carparking.widgets.cardbanner.view.CardView.b
        public void a(View view) {
            if (CardBanner.this.f42336r != null) {
                CardBanner.this.f42336r.a(((Integer) view.getTag(R.id.key_position)).intValue());
            }
        }
    }

    public class b implements CardView.d {
        public b() {
        }

        @Override // com.mgs.carparking.widgets.cardbanner.view.CardView.d
        public void a(View view) {
            if (view == null || CardBanner.this.f42344z == null || view.getTag(R.id.key_position) == null) {
                return;
            }
            CardBanner.this.f42344z.a(((Integer) view.getTag(R.id.key_position)).intValue());
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CardBanner.this.f42339u <= 1 || !CardBanner.this.f42338t) {
                return;
            }
            CardBanner cardBanner = CardBanner.this;
            cardBanner.f42341w = cardBanner.f42331m.getCurrentItem() + 1;
            if (CardBanner.this.f42344z != null) {
                CardBanner.this.f42344z.a(CardBanner.this.f42341w);
            }
            CardBanner.this.f42331m.smoothScrollToPosition(CardBanner.this.f42341w);
            CardBanner.this.f42320b.a(CardBanner.this.f42343y, CardBanner.this.f42340v);
        }
    }

    public interface d {
        void a(int i10);
    }

    public interface e {
        void a(int i10);
    }

    public CardBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardBanner m(cb.a aVar) {
        this.f42332n = null;
        this.f42339u = aVar.getCount();
        this.f42337s = aVar;
        return this;
    }

    public CardBanner(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f42320b = new bb.c();
        this.f42322d = -1;
        this.f42323e = -1;
        this.f42324f = 15;
        this.f42325g = 12;
        this.f42326h = 0;
        this.f42327i = 0;
        this.f42328j = 0;
        this.f42330l = new PagerSnapHelper();
        this.f42338t = true;
        this.f42339u = 0;
        this.f42340v = 4000;
        this.f42341w = 0;
        this.f42343y = new c();
        this.f42321c = context;
        l(attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f42338t) {
            int action = motionEvent.getAction();
            if (action == 1 || action == 3 || action == 4) {
                k();
            } else if (action == 0) {
                q();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void k() {
        if (this.f42338t) {
            this.f42320b.b(this.f42343y);
            this.f42320b.a(this.f42343y, this.f42340v);
        }
    }

    public final void l(AttributeSet attributeSet) {
        r(this.f42321c, attributeSet);
        View viewInflate = LayoutInflater.from(this.f42321c).inflate(R.layout.layout_card_banner, (ViewGroup) this, true);
        this.f42335q = this.f42321c.getResources().getDisplayMetrics().widthPixels;
        this.f42331m = (CardView) viewInflate.findViewById(R.id.card_view);
        this.f42334p = new eb.b();
        this.f42329k = new LinearLayoutManager(this.f42321c, 0, false);
    }

    public final void n() {
        this.f42331m.setLayoutManager(this.f42329k);
        this.f42331m.setViewMode(this.f42334p);
        this.f42330l.attachToRecyclerView(this.f42331m);
        this.f42331m.setOnCenterItemClickListener(new a());
        this.f42331m.setOnScrollPosition(new b());
        CardAdapter cardAdapter = new CardAdapter(this.f42321c, this.f42335q, this.f42326h, this.f42328j);
        this.f42342x = cardAdapter;
        if (this.f42332n != null) {
            db.a aVar = this.f42333o;
            if (aVar == null) {
                throw new RuntimeException("[CardBanner] --> please set CardImageLoader");
            }
            cardAdapter.f(aVar);
            this.f42331m.setDataCount(this.f42332n.size());
            this.f42342x.h(this.f42332n);
        } else {
            if (this.f42337s == null) {
                throw new RuntimeException("[CardBanner] --> please set BannerAdapter");
            }
            this.f42331m.setDataCount(this.f42339u);
            this.f42342x.g(this.f42339u);
            this.f42342x.e(this.f42337s);
        }
        this.f42342x.i(this.f42324f, this.f42325g);
        this.f42331m.setAdapter(this.f42342x);
    }

    public void p() {
        this.f42320b.b(this.f42343y);
    }

    public final void q() {
        if (this.f42338t) {
            this.f42320b.b(this.f42343y);
        }
    }

    public final void r(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.card_banner);
        fb.a aVar = fb.a.f52935a;
        this.f42326h = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, aVar.a(context, this.f42326h));
        this.f42327i = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, aVar.a(context, this.f42327i));
        this.f42322d = typedArrayObtainStyledAttributes.getColor(2, this.f42322d);
        this.f42323e = typedArrayObtainStyledAttributes.getColor(5, this.f42323e);
        this.f42328j = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, aVar.a(context, this.f42328j)) / 2;
        this.f42324f = aVar.b(context, typedArrayObtainStyledAttributes.getDimensionPixelSize(3, aVar.c(context, this.f42324f)));
        this.f42325g = aVar.b(context, typedArrayObtainStyledAttributes.getDimensionPixelSize(6, aVar.c(context, this.f42325g)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public void setOnItemClickListener(d dVar) {
        this.f42336r = dVar;
    }

    public void setScrollToPosition(e eVar) {
        this.f42344z = eVar;
    }

    public void o() {
        n();
        if (this.f42338t) {
            k();
        }
    }
}
