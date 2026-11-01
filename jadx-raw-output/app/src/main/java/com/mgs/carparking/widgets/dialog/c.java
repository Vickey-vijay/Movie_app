package com.mgs.carparking.widgets.dialog;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fvvcl.flickverse.R;
import com.ironsource.Z7;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.netbean.VodFeedbackEntry;
import em.o;
import em.p;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sa.o0;

/* JADX INFO: compiled from: VideoDetailLandFeedbackPop.java */
/* JADX INFO: loaded from: classes8.dex */
public class c extends PopupWindow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EditText f42604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f42605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f42606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f42607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FeedbackTagAdapter f42608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List<VodFeedbackEntry> f42609f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f42610g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f42611h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f42612i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public RecommandVideosEntity f42613j;

    /* JADX INFO: compiled from: VideoDetailLandFeedbackPop.java */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailLandFeedbackPop.java */
    public class b implements FeedbackTagAdapter.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f42615a;

        public b(Context context) {
            this.f42615a = context;
        }

        @Override // com.mgs.carparking.widgets.dialog.FeedbackTagAdapter.c
        public void a(int i10) {
            c.this.f42608e.g(c.this.f42609f, i10);
            c.this.f42605b.setTextColor(this.f42615a.getResources().getColor(R.color.white));
            c.this.f42605b.setBackground(this.f42615a.getResources().getDrawable(R.drawable.bg_video_detail_land_feedback_submit_selector));
        }
    }

    /* JADX INFO: renamed from: com.mgs.carparking.widgets.dialog.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VideoDetailLandFeedbackPop.java */
    public class ViewOnClickListenerC0428c implements View.OnClickListener {
        public ViewOnClickListenerC0428c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (c.this.f42609f.size() > 0) {
                for (VodFeedbackEntry vodFeedbackEntry : c.this.f42609f) {
                    if (vodFeedbackEntry.isCheck()) {
                        c.this.f42610g = vodFeedbackEntry.getTitle();
                    }
                }
            }
            if (o.b(c.this.f42610g)) {
                p.b("请选择标签");
                return;
            }
            c cVar = c.this;
            cVar.f42611h = cVar.f42604a.getText().toString().trim();
            if (c.this.f42612i != null) {
                c.this.f42612i.a(c.this.f42610g, c.this.f42611h);
            }
        }
    }

    /* JADX INFO: compiled from: VideoDetailLandFeedbackPop.java */
    public interface d {
        void a(String str, String str2);
    }

    public void j(d dVar) {
        this.f42612i = dVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public c(Context context, RecommandVideosEntity recommandVideosEntity, String str) {
        super(context);
        this.f42609f = new ArrayList();
        this.f42610g = "";
        this.f42611h = "";
        this.f42613j = recommandVideosEntity;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_land_feedback, (ViewGroup) null);
        this.f42604a = (EditText) viewInflate.findViewById(R.id.et_input);
        this.f42605b = (TextView) viewInflate.findViewById(R.id.tv_feedback_submit);
        this.f42606c = (TextView) viewInflate.findViewById(R.id.tv_title);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.rv_list);
        this.f42607d = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(context, 3));
        this.f42606c.setOnClickListener(new a());
        if (!o.b(o0.Y())) {
            for (String str2 : Arrays.asList(o0.Y().split(StringUtils.COMMA))) {
                VodFeedbackEntry vodFeedbackEntry = new VodFeedbackEntry();
                vodFeedbackEntry.setTitle(str2);
                this.f42609f.add(vodFeedbackEntry);
            }
        }
        if (recommandVideosEntity != null) {
            if (recommandVideosEntity.getType_pid() == 1) {
                this.f42604a.setText(recommandVideosEntity.getVod_name() + Z7.f27998r);
            } else {
                this.f42604a.setText(recommandVideosEntity.getVod_name() + Z7.f27998r + str + Z7.f27998r);
            }
            EditText editText = this.f42604a;
            editText.setSelection(editText.length());
        }
        FeedbackTagAdapter feedbackTagAdapter = new FeedbackTagAdapter(context, this.f42609f);
        this.f42608e = feedbackTagAdapter;
        this.f42607d.setAdapter(feedbackTagAdapter);
        this.f42608e.f(new b(context));
        this.f42605b.setOnClickListener(new ViewOnClickListenerC0428c());
        setContentView(viewInflate);
        setWidth(-1);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(true);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.translucent));
        getContentView().setSystemUiVisibility(5894);
        viewInflate.measure(0, 0);
        setSoftInputMode(3);
        update();
    }
}
