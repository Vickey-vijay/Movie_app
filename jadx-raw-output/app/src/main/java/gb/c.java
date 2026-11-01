package gb;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.ui.mine.share.ExtensionShareActivity;
import com.safedk.android.utils.Logger;
import sa.o0;

/* JADX INFO: compiled from: ShowAdDownloadPop.java */
/* JADX INFO: loaded from: classes11.dex */
public class c extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f53306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f53307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f53308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f53309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f53310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f53311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f53312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f53313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AnimationDrawable f53314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f53315j;

    /* JADX INFO: compiled from: ShowAdDownloadPop.java */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ta.h f53316b;

        public a(ta.h hVar) {
            this.f53316b = hVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ta.h hVar = this.f53316b;
            if (hVar != null) {
                hVar.a();
            }
            c.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ShowAdDownloadPop.java */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f53318b;

        public b(Context context) {
            this.f53318b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c cVar = c.this;
            d dVar = cVar.f53315j;
            if (dVar != null) {
                dVar.a(true, cVar.f53310e, c.this.f53311f, this.f53318b);
            }
        }
    }

    /* JADX INFO: renamed from: gb.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ShowAdDownloadPop.java */
    public class ViewOnClickListenerC0476c implements View.OnClickListener {
        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            p10.startActivity(p11);
        }

        public ViewOnClickListenerC0476c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(c.this.f53313h, new Intent(c.this.f53313h, (Class<?>) ExtensionShareActivity.class));
        }
    }

    /* JADX INFO: compiled from: ShowAdDownloadPop.java */
    public interface d {
        void a(boolean z10, RelativeLayout relativeLayout, LinearLayout linearLayout, Context context);
    }

    public void d(d dVar) {
        this.f53315j = dVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public c(Context context, ta.h hVar) {
        super(context);
        this.f53313h = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_show_ad_download, (ViewGroup) null);
        this.f53306a = (ImageView) viewInflate.findViewById(R.id.iv_feedback_close);
        this.f53307b = (TextView) viewInflate.findViewById(R.id.tv_feedback_submit);
        this.f53308c = (TextView) viewInflate.findViewById(R.id.tv_extension_share);
        this.f53309d = (TextView) viewInflate.findViewById(R.id.tv_tips);
        this.f53310e = (RelativeLayout) viewInflate.findViewById(R.id.rl_show);
        this.f53311f = (LinearLayout) viewInflate.findViewById(R.id.ll_loading);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.loadingImageView);
        this.f53312g = imageView;
        this.f53314i = (AnimationDrawable) imageView.getBackground();
        this.f53309d.setText(context.getResources().getString(R.string.str_look_ad_tips2, o0.e() + ""));
        this.f53306a.setOnClickListener(new a(hVar));
        this.f53307b.setOnClickListener(new b(context));
        this.f53308c.setOnClickListener(new ViewOnClickListenerC0476c());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(false);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background1));
    }
}
