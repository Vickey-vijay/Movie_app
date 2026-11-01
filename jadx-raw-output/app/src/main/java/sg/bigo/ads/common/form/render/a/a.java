package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import sg.bigo.ads.R;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public e.c f69564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Map<String, Object> f69565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f69566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f69567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f69568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f69569f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String[] f69570g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f69571h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f69572i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC0705a f69573j;

    /* JADX INFO: renamed from: sg.bigo.ads.common.form.render.a.a$a, reason: collision with other inner class name */
    public interface InterfaceC0705a {
        void a(String str, String str2);
    }

    public a(@NonNull e.c cVar, @Nullable Map<String, Object> map, @NonNull Context context, InterfaceC0705a interfaceC0705a) {
        this.f69571h = context;
        this.f69564a = cVar;
        this.f69565b = map;
        this.f69567d = cVar.f69314a;
        this.f69568e = cVar.f69317d;
        this.f69569f = cVar.f69315b;
        this.f69570g = cVar.f69316c;
        this.f69573j = interfaceC0705a;
    }

    public static void a(TextView textView, @Nullable String str) {
        if (TextUtils.isEmpty(str) || textView == null) {
            return;
        }
        textView.setText(str);
    }

    public void a(int i10) {
        int iA = sg.bigo.ads.common.form.render.a.a();
        int iB = sg.bigo.ads.common.form.render.a.b();
        boolean z10 = false;
        if (i10 != 2) {
            if (i10 == 3) {
                z10 = true;
                iA = -45718;
            }
            a(iA, iB, z10);
        }
        iA = -16736769;
        iB = iA;
        a(iA, iB, z10);
    }

    public final void a(int i10, int i11, boolean z10) {
        View view = this.f69572i;
        if (view == null) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.inter_form_edit_content);
        if (viewFindViewById != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(sg.bigo.ads.common.utils.e.a(this.f69571h, 1), i10);
            gradientDrawable.setCornerRadius(sg.bigo.ads.common.utils.e.a(this.f69571h, 8));
            viewFindViewById.setBackground(gradientDrawable);
        }
        TextView textView = (TextView) this.f69572i.findViewById(R.id.inter_form_edit_warning);
        if (textView != null) {
            textView.setText(sg.bigo.ads.common.form.a.a(this.f69571h, R.string.bigo_ad_form_warning));
            textView.setVisibility(z10 ? 0 : 8);
        }
        TextView textView2 = (TextView) this.f69572i.findViewById(R.id.inter_form_edit_title);
        if (textView2 != null) {
            textView2.setTextColor(i11);
        }
    }

    public final boolean a() {
        boolean zA = q.a((CharSequence) this.f69566c);
        if (this.f69564a.f69315b == 3) {
            zA = !q.g(this.f69566c);
        }
        a(zA ? 3 : 1);
        return zA;
    }

    public abstract View b();

    public final View c() {
        return this.f69572i;
    }
}
