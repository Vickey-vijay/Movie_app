package gb;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.widgets.cardbanner.view.RoundedImageView;
import em.o;
import em.r;

/* JADX INFO: compiled from: ShowOneVideoPop.java */
/* JADX INFO: loaded from: classes2.dex */
public class f extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f53335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f53336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f53337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecommandVideosEntity f53338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RoundedImageView f53339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f53340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f53341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f53342h;

    /* JADX INFO: compiled from: ShowOneVideoPop.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            sa.i.a();
            f.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ShowOneVideoPop.java */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f53344b;

        public b(RecommandVideosEntity recommandVideosEntity) {
            this.f53344b = recommandVideosEntity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c cVar = f.this.f53342h;
            if (cVar != null) {
                cVar.a(this.f53344b.getId());
            }
        }
    }

    /* JADX INFO: compiled from: ShowOneVideoPop.java */
    public interface c {
        void a(int i10);
    }

    public void a(c cVar) {
        this.f53342h = cVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public f(Context context, RecommandVideosEntity recommandVideosEntity) {
        super(context);
        this.f53337c = context;
        this.f53338d = recommandVideosEntity;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_show_once_video, (ViewGroup) null);
        this.f53335a = (ImageView) viewInflate.findViewById(R.id.iv_feedback_close);
        this.f53336b = (TextView) viewInflate.findViewById(R.id.tv_feedback_submit);
        this.f53339e = (RoundedImageView) viewInflate.findViewById(R.id.iv_image);
        this.f53340f = (TextView) viewInflate.findViewById(R.id.tv_name);
        this.f53341g = (TextView) viewInflate.findViewById(R.id.tv_actor);
        if (recommandVideosEntity != null && !o.b(recommandVideosEntity.getVod_pic()) && recommandVideosEntity.getVod_pic().startsWith("http")) {
            ib.d.c(context, recommandVideosEntity.getVod_pic(), R.drawable.ic_video_default, R.drawable.ic_video_default, this.f53339e, false);
        }
        if (!o.b(recommandVideosEntity.getVod_name())) {
            this.f53340f.setText(recommandVideosEntity.getVod_name());
        }
        if (o.b(recommandVideosEntity.getVod_actor())) {
            this.f53341g.setText(r.a().getResources().getString(R.string.text_actor) + "：" + r.a().getResources().getString(R.string.text_unknow));
        } else {
            this.f53341g.setText(r.a().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor());
        }
        this.f53335a.setOnClickListener(new a());
        this.f53336b.setOnClickListener(new b(recommandVideosEntity));
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(false);
        setFocusable(false);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background1));
    }
}
