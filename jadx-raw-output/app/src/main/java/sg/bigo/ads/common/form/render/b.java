package sg.bigo.ads.common.form.render;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.n.d;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements sg.bigo.ads.common.form.b.a, c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Context f69589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final e f69590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sg.bigo.ads.common.form.render.a.c f69591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Button f69592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f69593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f69594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f69595g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final WeakReference<a> f69598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f69599k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f69597i = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean[] f69600l = new boolean[13];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f69596h = new Runnable() { // from class: sg.bigo.ads.common.form.render.b.1
        @Override // java.lang.Runnable
        public final void run() {
            b bVar = b.this;
            RelativeLayout relativeLayout = bVar.f69593e;
            if (relativeLayout == null || bVar.f69594f > 0) {
                d.a(bVar.f69596h);
                return;
            }
            if (!sg.bigo.ads.common.ab.a.a(relativeLayout, new Rect())) {
                d.a(2, b.this.f69596h, 500L);
                return;
            }
            d.a(b.this.f69596h);
            b.this.f69594f = System.currentTimeMillis();
            b bVar2 = b.this;
            bVar2.a(1, bVar2.f69595g, 0L);
        }
    };

    public interface a {
        void a();

        void a(String str);
    }

    public b(@NonNull Context context, @NonNull e eVar, @Nullable Map<String, Object> map, int i10, int i11, a aVar) {
        this.f69589a = context;
        this.f69590b = eVar;
        sg.bigo.ads.common.form.render.a.f69563a = eVar.d() == 1;
        this.f69591c = new sg.bigo.ads.common.form.render.a.c(eVar, map, context, this);
        this.f69598j = new WeakReference<>(aVar);
        this.f69595g = i10;
        this.f69599k = i11;
    }

    public static void a(TextView textView, @Nullable String str) {
        if (textView == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
    }

    private void d(String str) {
        if (this.f69598j.get() != null) {
            this.f69598j.get().a(str);
        }
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void a() {
        Button button = this.f69592d;
        if (button == null || this.f69597i) {
            return;
        }
        button.setEnabled(true);
        this.f69592d.setBackgroundResource(R.drawable.bigo_ad_btn_background);
        this.f69592d.setTextColor(-1);
        this.f69597i = true;
        a(2, this.f69595g, System.currentTimeMillis() - this.f69594f);
    }

    @Override // sg.bigo.ads.common.form.b.a
    public final void a(int i10) {
        int i11;
        if (i10 != 1) {
            i11 = i10 == 2 ? 8 : 7;
            sg.bigo.ads.common.form.a.b(this.f69599k);
        }
        a(i11, this.f69595g, System.currentTimeMillis() - this.f69594f);
        sg.bigo.ads.common.form.a.b(this.f69599k);
    }

    public final void a(int i10, int i11, long j10) {
        boolean[] zArr = this.f69600l;
        if (i10 >= zArr.length || zArr[i10]) {
            return;
        }
        sg.bigo.ads.core.d.b.a(i10, i11, j10);
        this.f69600l[i10] = true;
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void a(String str) {
        a(11, this.f69595g, System.currentTimeMillis() - this.f69594f);
        d(str);
    }

    @Override // sg.bigo.ads.common.form.b.a
    public final void a(Map<String, Object> map) {
        sg.bigo.ads.common.form.a.a(this.f69599k, map);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void b() {
        a(5, this.f69595g, System.currentTimeMillis() - this.f69594f);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void b(int i10) {
        if (this.f69598j.get() != null) {
            this.f69598j.get().a();
        }
        sg.bigo.ads.common.form.b.a().a(sg.bigo.ads.common.form.a.a(this.f69590b, this.f69591c.b(), this.f69591c.a()), this, i10);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void b(String str) {
        a(10, this.f69595g, System.currentTimeMillis() - this.f69594f);
        d(str);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void c() {
        a(6, this.f69595g, System.currentTimeMillis() - this.f69594f);
    }

    @Override // sg.bigo.ads.common.form.render.c.a
    public final void c(String str) {
        a(9, this.f69595g, System.currentTimeMillis() - this.f69594f);
        d(str);
    }
}
