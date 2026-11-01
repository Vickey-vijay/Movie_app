package hb;

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
import ta.h;

/* JADX INFO: compiled from: ShowAdClingPop.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f53820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f53821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f53822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f53823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RelativeLayout f53824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f53825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f53826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Context f53827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AnimationDrawable f53828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d f53829j;

    /* JADX INFO: renamed from: hb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ShowAdClingPop.java */
    public class ViewOnClickListenerC0481a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f53830b;

        public ViewOnClickListenerC0481a(h hVar) {
            this.f53830b = hVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h hVar = this.f53830b;
            if (hVar != null) {
                hVar.a();
            }
            a.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ShowAdClingPop.java */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f53832b;

        public b(Context context) {
            this.f53832b = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar = a.this;
            d dVar = aVar.f53829j;
            if (dVar != null) {
                dVar.a(true, aVar.f53824e, a.this.f53825f, this.f53832b);
            }
        }
    }

    /* JADX INFO: compiled from: ShowAdClingPop.java */
    public class c implements View.OnClickListener {
        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            p10.startActivity(p11);
        }

        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(a.this.f53827h, new Intent(a.this.f53827h, (Class<?>) ExtensionShareActivity.class));
        }
    }

    /* JADX INFO: compiled from: ShowAdClingPop.java */
    public interface d {
        void a(boolean z10, RelativeLayout relativeLayout, LinearLayout linearLayout, Context context);
    }

    public void d(d dVar) {
        this.f53829j = dVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public a(Context context, h hVar) {
        super(context);
        this.f53827h = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_show_ad_cling, (ViewGroup) null);
        this.f53820a = (ImageView) viewInflate.findViewById(R.id.iv_feedback_close);
        this.f53821b = (TextView) viewInflate.findViewById(R.id.tv_feedback_submit);
        this.f53822c = (TextView) viewInflate.findViewById(R.id.tv_extension_share);
        this.f53823d = (TextView) viewInflate.findViewById(R.id.tv_tips);
        this.f53824e = (RelativeLayout) viewInflate.findViewById(R.id.rl_show);
        this.f53825f = (LinearLayout) viewInflate.findViewById(R.id.ll_loading);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.loadingImageView);
        this.f53826g = imageView;
        this.f53828i = (AnimationDrawable) imageView.getBackground();
        this.f53823d.setText(context.getResources().getString(R.string.str_cling_ad));
        this.f53820a.setOnClickListener(new ViewOnClickListenerC0481a(hVar));
        this.f53821b.setOnClickListener(new b(context));
        this.f53822c.setOnClickListener(new c());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(false);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background1));
    }
}
