package gb;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.ui.channelcontent.SpecialDetailNewActivity;
import com.mgs.carparking.ui.homecontent.more.VideoMoreListActivity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import com.safedk.android.utils.Logger;
import em.o;
import x9.b0;

/* JADX INFO: compiled from: ShowAppNoticePop.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f53325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f53326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f53327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f53328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AdInfoDetailEntry f53329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f53330f;

    /* JADX INFO: compiled from: ShowAppNoticePop.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: ShowAppNoticePop.java */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AdInfoDetailEntry f53332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f53333c;

        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            p10.startActivity(p11);
        }

        public b(AdInfoDetailEntry adInfoDetailEntry, Context context) {
            this.f53332b = adInfoDetailEntry;
            this.f53333c = context;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f53332b.getJump_type() == 3 && !o.b(this.f53332b.getJump_url())) {
                sa.a.a(e.this.f53327c, this.f53332b.getJump_url());
            } else if (this.f53332b.getJump_type() == 1) {
                Intent intent = new Intent(this.f53333c, (Class<?>) VideoPlayDetailActivity.class);
                intent.putExtra("id", Integer.parseInt(this.f53332b.getJump_url()));
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f53333c, intent);
            } else if (this.f53332b.getJump_type() == 4) {
                Intent intent2 = new Intent(this.f53333c, (Class<?>) VideoMoreListActivity.class);
                intent2.putExtra("videoTitle", this.f53332b.getTitle());
                intent2.putExtra("videoModuleId", Integer.parseInt(this.f53332b.getJump_url()));
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f53333c, intent2);
            } else if (this.f53332b.getJump_type() == 7) {
                Intent intent3 = new Intent(this.f53333c, (Class<?>) SpecialDetailNewActivity.class);
                intent3.putExtra("id", Integer.parseInt(this.f53332b.getJump_url()));
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.f53333c, intent3);
            } else if (this.f53332b.getJump_type() > 100 && this.f53332b.getJump_type() < 106) {
                tl.a.a().b(new b0(this.f53332b.getJump_type()));
                e.this.dismiss();
            }
            if (this.f53332b.is_allow_close() == 1) {
                e.this.dismiss();
            }
            c cVar = e.this.f53330f;
            if (cVar != null) {
                cVar.a(true);
            }
        }
    }

    /* JADX INFO: compiled from: ShowAppNoticePop.java */
    public interface c {
        void a(boolean z10);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public e(Context context, AdInfoDetailEntry adInfoDetailEntry) {
        super(context);
        this.f53327c = context;
        this.f53329e = adInfoDetailEntry;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_show_app_notice, (ViewGroup) null);
        this.f53325a = (ImageView) viewInflate.findViewById(R.id.iv_feedback_close);
        this.f53326b = (TextView) viewInflate.findViewById(R.id.tv_submit);
        this.f53328d = (TextView) viewInflate.findViewById(R.id.tv_content);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        if (!o.b(adInfoDetailEntry.getTitle())) {
            textView.setText(adInfoDetailEntry.getTitle());
        }
        if (!o.b(adInfoDetailEntry.getContent())) {
            this.f53328d.setText(adInfoDetailEntry.getContent());
        }
        this.f53326b.setText(adInfoDetailEntry.getBtn_content());
        if (adInfoDetailEntry.is_allow_close() == 1) {
            this.f53325a.setVisibility(0);
        } else {
            this.f53325a.setVisibility(8);
        }
        this.f53325a.setOnClickListener(new a());
        this.f53326b.setOnClickListener(new b(adInfoDetailEntry, context));
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(false);
        setFocusable(false);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background1));
    }
}
