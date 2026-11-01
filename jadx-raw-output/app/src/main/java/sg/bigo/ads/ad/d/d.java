package sg.bigo.ads.ad.d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f67660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f67661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f67662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f.a f67663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public n f67664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f67665f;

    public final void a() {
        n nVar = this.f67664e;
        if (nVar != null) {
            nVar.b();
            this.f67665f = false;
        }
    }

    public final void a(ViewGroup viewGroup, int i10, f.a aVar) {
        if (viewGroup == null) {
            return;
        }
        this.f67665f = false;
        this.f67663d = aVar;
        this.f67662c = (ViewGroup) viewGroup.findViewById(R.id.inter_popup_close_btn);
        this.f67660a = (TextView) viewGroup.findViewById(R.id.close_text);
        TextView textView = (TextView) viewGroup.findViewById(R.id.second_text);
        this.f67661b = textView;
        ViewGroup viewGroup2 = this.f67662c;
        if (viewGroup2 == null || this.f67660a == null || textView == null) {
            f.a aVar2 = this.f67663d;
            if (aVar2 != null) {
                aVar2.a();
                return;
            }
            return;
        }
        viewGroup2.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.ad.d.d.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.a aVar3 = d.this.f67663d;
                if (aVar3 != null) {
                    aVar3.a();
                }
            }
        });
        this.f67662c.setClickable(false);
        this.f67660a.setTextColor(1728053247);
        this.f67661b.setVisibility(0);
        n nVar = new n(((long) i10) * 1000) { // from class: sg.bigo.ads.ad.d.d.2
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                d dVar = d.this;
                dVar.f67665f = true;
                dVar.f67662c.setAlpha(1.0f);
                d.this.f67662c.setClickable(true);
                d.this.f67661b.setVisibility(8);
                d.this.f67660a.setTextColor(-1);
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
                d.this.f67661b.setText(q.a("%ds", Integer.valueOf(Math.round(j10 / 1000.0f))));
            }
        };
        this.f67664e = nVar;
        nVar.c();
    }
}
