package gb;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.fvvcl.flickverse.R;
import em.r;
import sa.o0;
import w9.y0;

/* JADX INFO: compiled from: VideoCommentPop.java */
/* JADX INFO: loaded from: classes8.dex */
public class i extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f53354a;

    /* JADX INFO: compiled from: VideoCommentPop.java */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f53355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y0 f53356c;

        public a(TextView textView, y0 y0Var) {
            this.f53355b = textView;
            this.f53356c = y0Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f53355b.getText().equals(r.a().getResources().getString(R.string.text_delete))) {
                b bVar = i.this.f53354a;
                if (bVar != null) {
                    bVar.a(this.f53356c, 1);
                    return;
                }
                return;
            }
            b bVar2 = i.this.f53354a;
            if (bVar2 != null) {
                bVar2.a(this.f53356c, 2);
            }
        }
    }

    /* JADX INFO: compiled from: VideoCommentPop.java */
    public interface b {
        void a(y0 y0Var, int i10);
    }

    public void a(b bVar) {
        this.f53354a = bVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight(view.getResources().getDisplayMetrics().heightPixels - rect.bottom);
        super.showAsDropDown(view);
    }

    public i(Context context, y0 y0Var) {
        super(context);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_comment, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_content);
        if (y0Var.f73859c.getUser_id() == o0.T()) {
            textView.setText(r.a().getResources().getString(R.string.text_delete));
        } else {
            textView.setText(r.a().getResources().getString(R.string.text_report));
        }
        textView.setOnClickListener(new a(textView, y0Var));
        setContentView(viewInflate);
        setWidth(-2);
        setHeight(-2);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.white));
    }
}
