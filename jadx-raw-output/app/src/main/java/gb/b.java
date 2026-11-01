package gb;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.fvvcl.flickverse.R;
import em.r;

/* JADX INFO: compiled from: EditMineSexPop.java */
/* JADX INFO: loaded from: classes11.dex */
public class b extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f53291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f53292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f53293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f53294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f53295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f53296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f53297g;

    /* JADX INFO: compiled from: EditMineSexPop.java */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f53298b;

        public a(Context context) {
            this.f53298b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.f53292b.setTextColor(this.f53298b.getResources().getColor(R.color.color_commen));
            b.this.f53293c.setTextColor(this.f53298b.getResources().getColor(R.color.color_text_commen1));
            b.this.f53295e.setTextColor(this.f53298b.getResources().getColor(R.color.color_text_commen1));
            b.this.dismiss();
            f fVar = b.this.f53297g;
            if (fVar != null) {
                fVar.a(1);
            }
        }
    }

    /* JADX INFO: renamed from: gb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EditMineSexPop.java */
    public class ViewOnClickListenerC0475b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f53300b;

        public ViewOnClickListenerC0475b(Context context) {
            this.f53300b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.f53292b.setTextColor(this.f53300b.getResources().getColor(R.color.color_text_commen1));
            b.this.f53293c.setTextColor(this.f53300b.getResources().getColor(R.color.color_commen));
            b.this.f53295e.setTextColor(this.f53300b.getResources().getColor(R.color.color_text_commen1));
            b.this.dismiss();
            f fVar = b.this.f53297g;
            if (fVar != null) {
                fVar.a(2);
            }
        }
    }

    /* JADX INFO: compiled from: EditMineSexPop.java */
    public class c implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f53302b;

        public c(Context context) {
            this.f53302b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.f53292b.setTextColor(this.f53302b.getResources().getColor(R.color.color_text_commen1));
            b.this.f53293c.setTextColor(this.f53302b.getResources().getColor(R.color.color_text_commen1));
            b.this.f53295e.setTextColor(this.f53302b.getResources().getColor(R.color.color_commen));
            b.this.dismiss();
            f fVar = b.this.f53297g;
            if (fVar != null) {
                fVar.a(3);
            }
        }
    }

    /* JADX INFO: compiled from: EditMineSexPop.java */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: EditMineSexPop.java */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            b.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: EditMineSexPop.java */
    public interface f {
        void a(int i10);
    }

    public void d(f fVar) {
        this.f53297g = fVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public b(Context context, String str) {
        super(context);
        this.f53296f = str;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_edit_mine_sex, (ViewGroup) null);
        this.f53291a = (LinearLayout) viewInflate.findViewById(R.id.ll_top);
        this.f53292b = (TextView) viewInflate.findViewById(R.id.tv_boy);
        this.f53293c = (TextView) viewInflate.findViewById(R.id.tv_girl);
        this.f53295e = (TextView) viewInflate.findViewById(R.id.tv_secret);
        this.f53294d = (TextView) viewInflate.findViewById(R.id.tv_cancel);
        if (str.equals(r.a().getResources().getString(R.string.str_man))) {
            this.f53292b.setTextColor(context.getResources().getColor(R.color.color_commen));
            this.f53293c.setTextColor(context.getResources().getColor(R.color.color_text_commen1));
            this.f53295e.setTextColor(context.getResources().getColor(R.color.color_text_commen1));
        } else if (str.equals(r.a().getResources().getString(R.string.str_women))) {
            this.f53292b.setTextColor(context.getResources().getColor(R.color.color_text_commen1));
            this.f53293c.setTextColor(context.getResources().getColor(R.color.color_commen));
            this.f53295e.setTextColor(context.getResources().getColor(R.color.color_text_commen1));
        } else if (str.equals(r.a().getResources().getString(R.string.str_secrecy))) {
            this.f53292b.setTextColor(context.getResources().getColor(R.color.color_text_commen1));
            this.f53293c.setTextColor(context.getResources().getColor(R.color.color_text_commen1));
            this.f53295e.setTextColor(context.getResources().getColor(R.color.color_commen));
        }
        this.f53292b.setOnClickListener(new a(context));
        this.f53293c.setOnClickListener(new ViewOnClickListenerC0475b(context));
        this.f53295e.setOnClickListener(new c(context));
        this.f53294d.setOnClickListener(new d());
        this.f53291a.setOnClickListener(new e());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background2));
    }
}
