package gb;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import chuangyuan.ycj.videolibrary.widget.VideoPlayerView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.ui.mine.DownloadVideoPlayActivity;

/* JADX INFO: compiled from: VideoDownloadSetMorePop.java */
/* JADX INFO: loaded from: classes10.dex */
public class l extends PopupWindow implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f53380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DownloadVideoPlayActivity f53381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f53382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f53383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f53384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f53385g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public VideoPlayerView f53386h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SeekBar f53387i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SeekBar f53388j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AudioManager f53389k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f53390l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f53391m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f53392n;

    /* JADX INFO: compiled from: VideoDownloadSetMorePop.java */
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
            l.this.f53389k.setStreamVolume(3, (i10 * l.this.f53390l) / 100, 4);
        }
    }

    /* JADX INFO: compiled from: VideoDownloadSetMorePop.java */
    public class b implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f53394b;

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }

        public b(Context context) {
            this.f53394b = context;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            l.this.c(this.f53394b, i10);
        }
    }

    public void c(Context context, int i10) {
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

    public l(DownloadVideoPlayActivity downloadVideoPlayActivity, Context context, VideoPlayerView videoPlayerView) {
        super(context);
        this.f53391m = -1;
        this.f53392n = -1.0f;
        this.f53381c = downloadVideoPlayActivity;
        this.f53380b = context;
        this.f53386h = videoPlayerView;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        this.f53389k = audioManager;
        this.f53390l = audioManager.getStreamMaxVolume(3);
        this.f53391m = this.f53389k.getStreamVolume(3);
        float f10 = downloadVideoPlayActivity.getWindow().getAttributes().screenBrightness;
        this.f53392n = f10;
        if (f10 <= 0.0f) {
            this.f53392n = 0.5f;
        } else if (f10 < 0.01f) {
            this.f53392n = 0.01f;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_download_set_more, (ViewGroup) null);
        this.f53382d = (TextView) viewInflate.findViewById(R.id.tv_normal);
        this.f53383e = (TextView) viewInflate.findViewById(R.id.tv_fill);
        this.f53384f = (TextView) viewInflate.findViewById(R.id.tv_size_16);
        this.f53385g = (TextView) viewInflate.findViewById(R.id.tv_size_4);
        this.f53387i = (SeekBar) viewInflate.findViewById(R.id.seekBarVolume);
        this.f53388j = (SeekBar) viewInflate.findViewById(R.id.seekBarBright);
        this.f53382d.setOnClickListener(this);
        this.f53383e.setOnClickListener(this);
        this.f53384f.setOnClickListener(this);
        this.f53385g.setOnClickListener(this);
        if (videoPlayerView.getResizeMode() == 4) {
            this.f53382d.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        } else if (videoPlayerView.getResizeMode() == 2) {
            this.f53383e.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        } else if (videoPlayerView.getResizeMode() == 0) {
            this.f53384f.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        } else if (videoPlayerView.getResizeMode() == 1) {
            this.f53385g.setTextColor(context.getResources().getColor(R.color.color_42BD56));
        }
        this.f53387i.setProgress((this.f53391m * 100) / this.f53390l);
        this.f53388j.setProgress((int) (this.f53392n * 255.0f));
        this.f53387i.setOnSeekBarChangeListener(new a());
        this.f53388j.setOnSeekBarChangeListener(new b(context));
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
            case R.id.tv_fill /* 2131363690 */:
                if (this.f53386h.getResizeMode() == 3) {
                    this.f53382d.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53383e.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53384f.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53385g.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53386h.setResizeMode(4);
                } else {
                    this.f53382d.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53383e.setTextColor(this.f53380b.getResources().getColor(R.color.color_42BD56));
                    this.f53384f.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53385g.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53386h.setResizeMode(3);
                }
                break;
            case R.id.tv_normal /* 2131363712 */:
                if (this.f53386h.getResizeMode() == 4) {
                    this.f53382d.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53383e.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53384f.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53385g.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53386h.setResizeMode(4);
                } else {
                    this.f53382d.setTextColor(this.f53380b.getResources().getColor(R.color.color_42BD56));
                    this.f53383e.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53384f.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53385g.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53386h.setResizeMode(4);
                }
                break;
            case R.id.tv_size_16 /* 2131363730 */:
                if (this.f53386h.getResizeMode() == 0) {
                    this.f53382d.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53383e.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53384f.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53385g.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53386h.setResizeMode(4);
                } else {
                    this.f53382d.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53383e.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53384f.setTextColor(this.f53380b.getResources().getColor(R.color.color_42BD56));
                    this.f53385g.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53386h.setResizeMode(0);
                }
                break;
            case R.id.tv_size_4 /* 2131363731 */:
                if (this.f53386h.getResizeMode() == 1) {
                    this.f53382d.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53383e.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53384f.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53385g.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53386h.setResizeMode(4);
                } else {
                    this.f53382d.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53383e.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53384f.setTextColor(this.f53380b.getResources().getColor(R.color.white));
                    this.f53385g.setTextColor(this.f53380b.getResources().getColor(R.color.color_42BD56));
                    this.f53386h.setResizeMode(1);
                }
                break;
        }
    }
}
