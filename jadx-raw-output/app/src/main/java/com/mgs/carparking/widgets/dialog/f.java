package com.mgs.carparking.widgets.dialog;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.dbtable.VideoCollectionEntry;
import com.mgs.carparking.model.VIDEOPLAYDETAILVIEWMODEL;
import com.mgs.carparking.netbean.RecommandVideosEntity;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import em.p;
import em.r;
import me.goldze.mvvmhabit.base.BaseApplication;

/* JADX INFO: compiled from: VideoDetailSetMorePop.java */
/* JADX INFO: loaded from: classes7.dex */
public class f extends PopupWindow implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f42668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public VideoPlayDetailActivity f42669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecommandVideosEntity f42670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f42671e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LinearLayout f42672f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LinearLayout f42673g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f42674h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f42675i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public TextView f42676j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f42677k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f42678l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f42679m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public VIDEOPLAYDETAILVIEWMODEL f42680n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public VideoPlayerView f42681o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SeekBar f42682p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public SeekBar f42683q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public AudioManager f42684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f42685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f42686t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f42687u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.mgs.carparking.widgets.dialog.c f42688v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public gb.k f42689w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f42690x;

    /* JADX INFO: compiled from: VideoDetailSetMorePop.java */
    public class a implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }

        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            f.this.f42684r.setStreamVolume(3, (i10 * f.this.f42685s) / 100, 4);
        }
    }

    /* JADX INFO: compiled from: VideoDetailSetMorePop.java */
    public class b implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f42692b;

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }

        public b(Context context) {
            this.f42692b = context;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            f.this.g(this.f42692b, i10);
        }
    }

    /* JADX INFO: compiled from: VideoDetailSetMorePop.java */
    public class c implements com.mgs.carparking.widgets.dialog.c.d {
        public c() {
        }

        @Override // com.mgs.carparking.widgets.dialog.c.d
        public void a(String str, String str2) {
            f.this.f42688v.dismiss();
            f.this.f42680n.U(1, str, str2, f.this.f42670d.getId(), f.this.f42671e, "");
        }
    }

    public void g(Context context, int i10) {
        Window window = ((Activity) context).getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (i10 == -1) {
            attributes.screenBrightness = -1.0f;
        } else {
            if (i10 <= 0) {
                i10 = 1;
            }
            attributes.screenBrightness = i10 / 255.0f;
        }
        window.setAttributes(attributes);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public f(VideoPlayDetailActivity videoPlayDetailActivity, Context context, RecommandVideosEntity recommandVideosEntity, VIDEOPLAYDETAILVIEWMODEL videoplaydetailviewmodel, VideoPlayerView videoPlayerView, com.mgs.carparking.widgets.dialog.c cVar, int i10, String str) {
        super(context);
        this.f42686t = -1;
        this.f42687u = -1.0f;
        this.f42669c = videoPlayDetailActivity;
        this.f42668b = context;
        this.f42670d = recommandVideosEntity;
        this.f42680n = videoplaydetailviewmodel;
        this.f42681o = videoPlayerView;
        this.f42688v = cVar;
        this.f42671e = i10;
        this.f42690x = str;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.f42684r = audioManager;
        this.f42685s = audioManager.getStreamMaxVolume(3);
        this.f42686t = this.f42684r.getStreamVolume(3);
        float f10 = videoPlayDetailActivity.getWindow().getAttributes().screenBrightness;
        this.f42687u = f10;
        if (f10 <= 0.0f) {
            this.f42687u = 0.5f;
        } else if (f10 < 0.01f) {
            this.f42687u = 0.01f;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_set_more, (ViewGroup) null);
        this.f42672f = (LinearLayout) viewInflate.findViewById(R.id.ll_collection);
        this.f42673g = (LinearLayout) viewInflate.findViewById(R.id.ll_feedback);
        this.f42674h = (LinearLayout) viewInflate.findViewById(R.id.ll_skip);
        this.f42675i = (ImageView) viewInflate.findViewById(R.id.iv_collection);
        this.f42676j = (TextView) viewInflate.findViewById(R.id.tv_normal);
        this.f42677k = (TextView) viewInflate.findViewById(R.id.tv_fill);
        this.f42678l = (TextView) viewInflate.findViewById(R.id.tv_size_16);
        this.f42679m = (TextView) viewInflate.findViewById(R.id.tv_size_4);
        this.f42682p = (SeekBar) viewInflate.findViewById(R.id.seekBarVolume);
        this.f42683q = (SeekBar) viewInflate.findViewById(R.id.seekBarBright);
        this.f42672f.setOnClickListener(this);
        this.f42673g.setOnClickListener(this);
        this.f42674h.setOnClickListener(this);
        this.f42676j.setOnClickListener(this);
        this.f42677k.setOnClickListener(this);
        this.f42678l.setOnClickListener(this);
        this.f42679m.setOnClickListener(this);
        if (videoplaydetailviewmodel.C.get().booleanValue()) {
            this.f42675i.setImageResource(R.drawable.ic_video_land_collection_select);
        } else {
            this.f42675i.setImageResource(R.drawable.ic_video_land_collection);
        }
        if (videoPlayerView.getResizeMode() == 4) {
            this.f42676j.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        } else if (videoPlayerView.getResizeMode() == 3) {
            this.f42677k.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        } else if (videoPlayerView.getResizeMode() == 0) {
            this.f42678l.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        } else if (videoPlayerView.getResizeMode() == 1) {
            this.f42679m.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        }
        this.f42682p.setProgress((this.f42686t * 100) / this.f42685s);
        this.f42683q.setProgress((int) (this.f42687u * 255.0f));
        this.f42682p.setOnSeekBarChangeListener(new a());
        this.f42683q.setOnSeekBarChangeListener(new b(context));
        setContentView(viewInflate);
        setWidth(-2);
        setHeight(-1);
        setTouchable(true);
        setOutsideTouchable(true);
        setFocusable(false);
        setBackgroundDrawable(context.getResources().getDrawable(R.color.translucent));
        getContentView().setSystemUiVisibility(5894);
        viewInflate.measure(0, 0);
        setSoftInputMode(3);
        update();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_collection /* 2131362824 */:
                if (!this.f42680n.C.get().booleanValue()) {
                    this.f42680n.C.set(Boolean.TRUE);
                    this.f42680n.B.set(ContextCompat.getDrawable(BaseApplication.getInstance(), R.drawable.ic_video_land_collection_select));
                    this.f42675i.setImageResource(R.drawable.ic_video_land_collection_select);
                    VideoCollectionEntry videoCollectionEntry = new VideoCollectionEntry();
                    videoCollectionEntry.setId(this.f42670d.getId());
                    videoCollectionEntry.setType_pid(this.f42670d.getType_pid());
                    videoCollectionEntry.setVod_pic(this.f42670d.getVod_pic());
                    this.f42680n.b1(videoCollectionEntry, this.f42670d.getType_id());
                } else {
                    p.b(r.a().getResources().getString(R.string.str_collection_can_cancel));
                }
                break;
            case R.id.ll_feedback /* 2131362827 */:
                dismiss();
                com.mgs.carparking.widgets.dialog.c cVar = new com.mgs.carparking.widgets.dialog.c(this.f42669c, this.f42670d, this.f42690x);
                this.f42688v = cVar;
                cVar.showAtLocation(this.f42677k, 0, 0, 0);
                this.f42688v.j(new c());
                break;
            case R.id.ll_skip /* 2131362840 */:
                dismiss();
                gb.k kVar = new gb.k(this.f42669c, this.f42668b, this.f42670d.getId());
                this.f42689w = kVar;
                kVar.showAtLocation(this.f42677k, 5, 0, 0);
                break;
            case R.id.tv_fill /* 2131363690 */:
                if (this.f42681o.getResizeMode() == 3) {
                    this.f42676j.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42677k.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42678l.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42679m.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42681o.setResizeMode(4);
                } else {
                    this.f42676j.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42677k.setTextColor(this.f42668b.getResources().getColor(R.color.color_42BD56));
                    this.f42678l.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42679m.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42681o.setResizeMode(3);
                }
                break;
            case R.id.tv_normal /* 2131363712 */:
                if (this.f42681o.getResizeMode() == 4) {
                    this.f42676j.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42677k.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42678l.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42679m.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42681o.setResizeMode(4);
                } else {
                    this.f42676j.setTextColor(this.f42668b.getResources().getColor(R.color.color_42BD56));
                    this.f42677k.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42678l.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42679m.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42681o.setResizeMode(4);
                }
                break;
            case R.id.tv_size_16 /* 2131363730 */:
                if (this.f42681o.getResizeMode() == 0) {
                    this.f42676j.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42677k.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42678l.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42679m.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42681o.setResizeMode(4);
                } else {
                    this.f42676j.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42677k.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42678l.setTextColor(this.f42668b.getResources().getColor(R.color.color_42BD56));
                    this.f42679m.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42681o.setResizeMode(0);
                }
                break;
            case R.id.tv_size_4 /* 2131363731 */:
                if (this.f42681o.getResizeMode() == 1) {
                    this.f42676j.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42677k.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42678l.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42679m.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42681o.setResizeMode(4);
                } else {
                    this.f42676j.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42677k.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42678l.setTextColor(this.f42668b.getResources().getColor(R.color.white));
                    this.f42679m.setTextColor(this.f42668b.getResources().getColor(R.color.color_42BD56));
                    this.f42681o.setResizeMode(1);
                }
                break;
        }
    }
}
