package gb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import em.o;
import em.r;

/* JADX INFO: compiled from: VideoDetailPop.java */
/* JADX INFO: loaded from: classes2.dex */
public class j extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f53358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f53359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f53360c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f53361d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f53362e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f53363f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f53364g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Activity f53365h;

    /* JADX INFO: compiled from: VideoDetailPop.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.dismiss();
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + sa.e.n(this.f53364g));
        super.showAsDropDown(view);
    }

    public j(Activity activity, Context context, RecommandVideosEntity recommandVideosEntity) {
        super(context);
        this.f53364g = context;
        this.f53365h = activity;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail, (ViewGroup) null);
        this.f53358a = (TextView) viewInflate.findViewById(R.id.tv_name);
        this.f53359b = (TextView) viewInflate.findViewById(R.id.tv_director);
        this.f53360c = (TextView) viewInflate.findViewById(R.id.tv_actor);
        this.f53361d = (TextView) viewInflate.findViewById(R.id.tv_time);
        this.f53362e = (TextView) viewInflate.findViewById(R.id.tv_content);
        this.f53363f = (TextView) viewInflate.findViewById(R.id.tv_intros);
        if (recommandVideosEntity != null && !o.b(recommandVideosEntity.getVod_name())) {
            this.f53358a.setText(recommandVideosEntity.getVod_name());
            if (!o.b(recommandVideosEntity.getVod_director())) {
                this.f53359b.setText(r.a().getResources().getString(R.string.text_director) + "：" + recommandVideosEntity.getVod_director());
            } else {
                this.f53359b.setText(r.a().getResources().getString(R.string.text_director) + "：" + r.a().getResources().getString(R.string.text_unknow));
            }
            if (!o.b(recommandVideosEntity.getVod_actor())) {
                this.f53360c.setText(r.a().getResources().getString(R.string.text_actor) + "：" + recommandVideosEntity.getVod_actor());
            } else {
                this.f53360c.setText(r.a().getResources().getString(R.string.text_actor) + "：" + r.a().getResources().getString(R.string.text_unknow));
            }
            if (!o.b(recommandVideosEntity.getVod_year())) {
                this.f53361d.setText(r.a().getResources().getString(R.string.text_year) + "：" + recommandVideosEntity.getVod_year());
            } else {
                this.f53361d.setText(r.a().getResources().getString(R.string.text_year) + "：" + r.a().getResources().getString(R.string.text_unknow));
            }
            if (!o.b(recommandVideosEntity.getVod_blurb())) {
                this.f53362e.setText(recommandVideosEntity.getVod_blurb());
                this.f53363f.setVisibility(0);
            } else {
                this.f53362e.setText(recommandVideosEntity.getVod_blurb());
                this.f53363f.setVisibility(8);
            }
        }
        viewInflate.findViewById(R.id.rl_top).setOnClickListener(new a());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setAnimationStyle(R.style.pop_shop_anim);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background));
    }
}
