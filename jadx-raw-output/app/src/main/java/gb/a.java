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

/* JADX INFO: compiled from: EditMinePop.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinearLayout f53283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f53284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f53285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f53286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f53287e;

    /* JADX INFO: renamed from: gb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: EditMinePop.java */
    public class ViewOnClickListenerC0474a implements View.OnClickListener {
        public ViewOnClickListenerC0474a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.dismiss();
            d dVar = a.this.f53287e;
            if (dVar != null) {
                dVar.a(1);
            }
        }
    }

    /* JADX INFO: compiled from: EditMinePop.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.dismiss();
            d dVar = a.this.f53287e;
            if (dVar != null) {
                dVar.a(2);
            }
        }
    }

    /* JADX INFO: compiled from: EditMinePop.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: EditMinePop.java */
    public interface d {
        void a(int i10);
    }

    public void a(d dVar) {
        this.f53287e = dVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public a(Context context) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_edit_mine, (ViewGroup) null);
        this.f53283a = (LinearLayout) viewInflate.findViewById(R.id.ll_top);
        this.f53284b = (TextView) viewInflate.findViewById(R.id.tv_photo);
        this.f53285c = (TextView) viewInflate.findViewById(R.id.tv_camera);
        this.f53286d = (TextView) viewInflate.findViewById(R.id.tv_cancel);
        this.f53284b.setOnClickListener(new ViewOnClickListenerC0474a());
        this.f53285c.setOnClickListener(new b());
        this.f53283a.setOnClickListener(new c());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background2));
    }
}
