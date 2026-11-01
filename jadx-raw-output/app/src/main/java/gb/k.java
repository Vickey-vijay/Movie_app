package gb;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.db.VideoSkipDao;
import com.mgs.carparking.dbtable.VideoSkipEntry;
import com.mgs.carparking.ui.homecontent.videodetail.VideoPlayDetailActivity;
import em.p;
import em.r;
import java.util.ArrayList;
import x9.g0;

/* JADX INFO: compiled from: VideoDetailSkipHeadAndEndPop.java */
/* JADX INFO: loaded from: classes11.dex */
public class k extends PopupWindow implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f53367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f53368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f53369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SeekBar f53370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SeekBar f53371f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Button f53372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Button f53373h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f53374i;

    /* JADX INFO: compiled from: VideoDetailSkipHeadAndEndPop.java */
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
            k.this.f53368c.setText(i10 + "");
        }
    }

    /* JADX INFO: compiled from: VideoDetailSkipHeadAndEndPop.java */
    public class b implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }

        public b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            k.this.f53369d.setText(i10 + "");
        }
    }

    /* JADX INFO: compiled from: VideoDetailSkipHeadAndEndPop.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: VideoDetailSkipHeadAndEndPop.java */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f53378b;

        public d(int i10) {
            this.f53378b = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (Integer.parseInt(k.this.f53368c.getText().toString()) > 0 || Integer.parseInt(k.this.f53369d.getText().toString()) > 0) {
                VideoSkipEntry videoSkipEntry = new VideoSkipEntry();
                videoSkipEntry.setId(this.f53378b);
                videoSkipEntry.setProgress_head(Integer.parseInt(k.this.f53368c.getText().toString()));
                videoSkipEntry.setProgress_end(Integer.parseInt(k.this.f53369d.getText().toString()));
                VideoSkipDao.getInstance().insertSkipVideo(videoSkipEntry);
                tl.a.a().b(new g0(videoSkipEntry));
                p.b(r.a().getResources().getString(R.string.str_setting_sucess));
            } else {
                if (VideoSkipDao.getInstance().isExist(this.f53378b)) {
                    VideoSkipDao.getInstance().deleteSkipVideoById(this.f53378b);
                }
                tl.a.a().b(new g0(null));
            }
            k.this.dismiss();
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        setHeight((view.getResources().getDisplayMetrics().heightPixels - rect.bottom) + 100);
        super.showAsDropDown(view);
    }

    public k(VideoPlayDetailActivity videoPlayDetailActivity, Context context, int i10) {
        super(context);
        this.f53367b = context;
        this.f53374i = i10;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pop_layout_video_detail_skip_head_end, (ViewGroup) null);
        this.f53368c = (TextView) viewInflate.findViewById(R.id.tv_head);
        this.f53369d = (TextView) viewInflate.findViewById(R.id.tv_end);
        this.f53370e = (SeekBar) viewInflate.findViewById(R.id.seekBarHead);
        this.f53371f = (SeekBar) viewInflate.findViewById(R.id.seekBarEnd);
        this.f53372g = (Button) viewInflate.findViewById(R.id.btn_cancel);
        this.f53373h = (Button) viewInflate.findViewById(R.id.bt_sure);
        ArrayList<VideoSkipEntry> arrayListQueryItemSkipVideo = VideoSkipDao.getInstance().queryItemSkipVideo(i10);
        if (arrayListQueryItemSkipVideo.size() > 0) {
            this.f53370e.setProgress(arrayListQueryItemSkipVideo.get(0).getProgress_head());
            this.f53371f.setProgress(arrayListQueryItemSkipVideo.get(0).getProgress_end());
            this.f53368c.setText(arrayListQueryItemSkipVideo.get(0).getProgress_head() + "");
            this.f53369d.setText(arrayListQueryItemSkipVideo.get(0).getProgress_end() + "");
        }
        this.f53370e.setOnSeekBarChangeListener(new a());
        this.f53371f.setOnSeekBarChangeListener(new b());
        this.f53372g.setOnClickListener(new c());
        this.f53373h.setOnClickListener(new d(i10));
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
        view.getId();
    }
}
