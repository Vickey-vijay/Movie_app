package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.ironsource.Z7;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VodFeedbackEntry;
import em.o;
import em.p;
import em.r;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sa.o0;
import sa.s;

/* JADX INFO: compiled from: VideoFeedbackPop.java */
/* JADX INFO: loaded from: classes8.dex */
public class m extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ImageView f42861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f42862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EditText f42863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f42864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RecyclerView f42865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<VodFeedbackEntry> f42866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FeedbackTagVertalAdapter f42867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f42869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e f42870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RecommandVideosEntity f42871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f42872l;

    /* JADX INFO: compiled from: VideoFeedbackPop.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s.c(m.this.f42863c);
        }
    }

    /* JADX INFO: compiled from: VideoFeedbackPop.java */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoFeedbackPop.java */
    public class c implements FeedbackTagVertalAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f42875a;

        public c(Context context) {
            this.f42875a = context;
        }

        @Override // com.mgs.carparking.widgets.dialog.FeedbackTagVertalAdapter.c
        public void a(int i10) {
            m.this.f42867g.g(m.this.f42866f, i10);
            m.this.f42862b.setTextColor(this.f42875a.getResources().getColor(R.color.white));
            m.this.f42862b.setBackground(this.f42875a.getResources().getDrawable(R.drawable.bg_video_detail_land_feedback_submit_selector));
        }
    }

    /* JADX INFO: compiled from: VideoFeedbackPop.java */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ RecommandVideosEntity f42877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f42878c;

        public d(RecommandVideosEntity recommandVideosEntity, String str) {
            this.f42877b = recommandVideosEntity;
            this.f42878c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m.this.f42866f.size() > 0) {
                for (VodFeedbackEntry vodFeedbackEntry : m.this.f42866f) {
                    if (vodFeedbackEntry.isCheck()) {
                        m.this.f42868h = vodFeedbackEntry.getTitle();
                    }
                }
            }
            if (o.b(m.this.f42868h)) {
                p.b(m.this.f42864d.getResources().getString(R.string.str_tip_not_label));
                return;
            }
            m mVar = m.this;
            mVar.f42869i = mVar.f42863c.getText().toString().trim();
            if (o.b(m.this.f42869i)) {
                p.b(r.a().getResources().getString(R.string.str_write_content));
                return;
            }
            RecommandVideosEntity recommandVideosEntity = this.f42877b;
            if (recommandVideosEntity != null) {
                if (recommandVideosEntity.getType_pid() == 1) {
                    if (m.this.f42870j != null) {
                        m.this.f42870j.a(m.this.f42868h, this.f42877b.getVod_name() + Z7.f27998r + m.this.f42869i);
                        return;
                    }
                    return;
                }
                if (m.this.f42870j != null) {
                    m.this.f42870j.a(m.this.f42868h, this.f42877b.getVod_name() + Z7.f27998r + this.f42878c + Z7.f27998r + m.this.f42869i);
                }
            }
        }
    }

    /* JADX INFO: compiled from: VideoFeedbackPop.java */
    public interface e {
        void a(String str, String str2);
    }

    public void k(e eVar) {
        this.f42870j = eVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public m(Context context, RecommandVideosEntity recommandVideosEntity, String str) {
        super(context);
        this.f42866f = new ArrayList();
        this.f42868h = "";
        this.f42869i = "";
        this.f42864d = context;
        this.f42871k = recommandVideosEntity;
        this.f42872l = str;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_feedback_video, (ViewGroup) null);
        this.f42861a = (ImageView) viewInflate.findViewById(R.id.iv_feedback_close);
        this.f42862b = (TextView) viewInflate.findViewById(R.id.tv_feedback_submit);
        this.f42863c = (EditText) viewInflate.findViewById(R.id.et_input);
        this.f42865e = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.rl_top);
        this.f42865e.setLayoutManager(new GridLayoutManager(context, 1));
        relativeLayout.setOnClickListener(new a());
        this.f42861a.setOnClickListener(new b());
        if (!o.b(o0.Y())) {
            for (String str2 : Arrays.asList(o0.Y().split(StringUtils.COMMA))) {
                VodFeedbackEntry vodFeedbackEntry = new VodFeedbackEntry();
                vodFeedbackEntry.setTitle(str2);
                this.f42866f.add(vodFeedbackEntry);
            }
        }
        FeedbackTagVertalAdapter feedbackTagVertalAdapter = new FeedbackTagVertalAdapter(context, this.f42866f);
        this.f42867g = feedbackTagVertalAdapter;
        this.f42865e.setAdapter(feedbackTagVertalAdapter);
        this.f42867g.f(new c(context));
        this.f42862b.setOnClickListener(new d(recommandVideosEntity, str));
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.popupwindow_background1));
    }
}
