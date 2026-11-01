package com.luck.picture.lib.adapter.holder;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.entity.LocalMedia;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class PreviewAudioHolder extends BasePreviewHolder {
    public MediaPlayer A;
    public boolean B;
    public Runnable C;
    public final MediaPlayer.OnCompletionListener D;
    public final MediaPlayer.OnErrorListener E;
    public final MediaPlayer.OnPreparedListener F;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Handler f32083s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f32084t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public TextView f32085u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f32086v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextView f32087w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public SeekBar f32088x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageView f32089y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ImageView f32090z;

    public class a implements MediaPlayer.OnCompletionListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            PreviewAudioHolder.this.P();
            PreviewAudioHolder.this.G();
            PreviewAudioHolder.this.D(true);
        }
    }

    public class b implements MediaPlayer.OnErrorListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            PreviewAudioHolder.this.G();
            PreviewAudioHolder.this.D(true);
            return false;
        }
    }

    public class c implements MediaPlayer.OnPreparedListener {
        public c() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            if (!mediaPlayer.isPlaying()) {
                PreviewAudioHolder.this.P();
                PreviewAudioHolder.this.G();
                PreviewAudioHolder.this.D(true);
            } else {
                PreviewAudioHolder.this.f32088x.setMax(mediaPlayer.getDuration());
                PreviewAudioHolder.this.O();
                PreviewAudioHolder.this.E();
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long currentPosition = PreviewAudioHolder.this.A.getCurrentPosition();
            String strB = o8.d.b(currentPosition);
            if (!TextUtils.equals(strB, PreviewAudioHolder.this.f32087w.getText())) {
                PreviewAudioHolder.this.f32087w.setText(strB);
                if (((long) PreviewAudioHolder.this.A.getDuration()) - currentPosition > 1000) {
                    PreviewAudioHolder.this.f32088x.setProgress((int) currentPosition);
                } else {
                    PreviewAudioHolder previewAudioHolder = PreviewAudioHolder.this;
                    previewAudioHolder.f32088x.setProgress(previewAudioHolder.A.getDuration());
                }
            }
            PreviewAudioHolder.this.f32083s.postDelayed(this, 1000 - (currentPosition % 1000));
        }
    }

    public class e implements m8.j {
        public e() {
        }

        @Override // m8.j
        public void a(View view, float f10, float f11) {
            BasePreviewHolder.a aVar = PreviewAudioHolder.this.f32060r;
            if (aVar != null) {
                aVar.onBackPressed();
            }
        }
    }

    public class f implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f32096b;

        public f(LocalMedia localMedia) {
            this.f32096b = localMedia;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            BasePreviewHolder.a aVar = PreviewAudioHolder.this.f32060r;
            if (aVar == null) {
                return false;
            }
            aVar.a(this.f32096b);
            return false;
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PreviewAudioHolder.this.M();
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PreviewAudioHolder.this.B();
        }
    }

    public class i implements SeekBar.OnSeekBarChangeListener {
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }

        public i() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                seekBar.setProgress(i10);
                PreviewAudioHolder.this.J(i10);
                if (PreviewAudioHolder.this.A.isPlaying()) {
                    PreviewAudioHolder.this.A.seekTo(seekBar.getProgress());
                }
            }
        }
    }

    public class j implements View.OnClickListener {
        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BasePreviewHolder.a aVar = PreviewAudioHolder.this.f32060r;
            if (aVar != null) {
                aVar.onBackPressed();
            }
        }
    }

    public class k implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f32102b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f32103c;

        public k(LocalMedia localMedia, String str) {
            this.f32102b = localMedia;
            this.f32103c = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (o8.f.a()) {
                    return;
                }
                PreviewAudioHolder.this.f32060r.b(this.f32102b.p());
                if (PreviewAudioHolder.this.A.isPlaying()) {
                    PreviewAudioHolder.this.C();
                } else if (PreviewAudioHolder.this.B) {
                    PreviewAudioHolder.this.H();
                } else {
                    PreviewAudioHolder.this.N(this.f32103c);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public class l implements View.OnLongClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LocalMedia f32105b;

        public l(LocalMedia localMedia) {
            this.f32105b = localMedia;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            BasePreviewHolder.a aVar = PreviewAudioHolder.this.f32060r;
            if (aVar == null) {
                return false;
            }
            aVar.a(this.f32105b);
            return false;
        }
    }

    public final void G() {
        this.B = false;
        this.A.stop();
        this.A.reset();
    }

    public final void J(int i10) {
        this.f32087w.setText(o8.d.b(i10));
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void c(View view) {
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void i() {
        this.B = false;
        K();
        D(true);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void j() {
        this.B = false;
        this.f32083s.removeCallbacks(this.C);
        L();
        G();
        D(true);
    }

    public final void B() {
        if (this.f32088x.getProgress() > 3000) {
            SeekBar seekBar = this.f32088x;
            seekBar.setProgress(seekBar.getMax());
        } else {
            SeekBar seekBar2 = this.f32088x;
            seekBar2.setProgress((int) (((long) seekBar2.getProgress()) + 3000));
        }
        J(this.f32088x.getProgress());
        this.A.seekTo(this.f32088x.getProgress());
    }

    public final void C() {
        this.A.pause();
        this.B = true;
        D(false);
        P();
    }

    public void F() {
        this.f32083s.removeCallbacks(this.C);
        if (this.A != null) {
            L();
            this.A.release();
            this.A = null;
        }
    }

    public final void H() {
        this.A.seekTo(this.f32088x.getProgress());
        this.A.start();
        O();
        E();
    }

    public final void I(boolean z10) {
        this.f32089y.setEnabled(z10);
        this.f32090z.setEnabled(z10);
        if (z10) {
            this.f32089y.setAlpha(1.0f);
            this.f32090z.setAlpha(1.0f);
        } else {
            this.f32089y.setAlpha(0.5f);
            this.f32090z.setAlpha(0.5f);
        }
    }

    public final void K() {
        this.A.setOnCompletionListener(this.D);
        this.A.setOnErrorListener(this.E);
        this.A.setOnPreparedListener(this.F);
    }

    public final void L() {
        this.A.setOnCompletionListener(null);
        this.A.setOnErrorListener(null);
        this.A.setOnPreparedListener(null);
    }

    public final void M() {
        if (this.f32088x.getProgress() < 3000) {
            this.f32088x.setProgress(0);
        } else {
            SeekBar seekBar = this.f32088x;
            seekBar.setProgress((int) (((long) seekBar.getProgress()) - 3000));
        }
        J(this.f32088x.getProgress());
        this.A.seekTo(this.f32088x.getProgress());
    }

    public final void O() {
        this.f32083s.post(this.C);
    }

    public final void P() {
        this.f32083s.removeCallbacks(this.C);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void f(LocalMedia localMedia, int i10, int i11) {
        this.f32085u.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R$drawable.ps_ic_audio_play_cover, 0, 0);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void g() {
        this.f32059q.setOnViewTapListener(new e());
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void h(LocalMedia localMedia) {
        this.f32059q.setOnLongClickListener(new f(localMedia));
    }

    public PreviewAudioHolder(@NonNull View view) {
        super(view);
        this.f32083s = new Handler(Looper.getMainLooper());
        this.A = new MediaPlayer();
        this.B = false;
        this.C = new d();
        this.D = new a();
        this.E = new b();
        this.F = new c();
        this.f32084t = (ImageView) view.findViewById(R$id.iv_play_video);
        this.f32085u = (TextView) view.findViewById(R$id.tv_audio_name);
        this.f32087w = (TextView) view.findViewById(R$id.tv_current_time);
        this.f32086v = (TextView) view.findViewById(R$id.tv_total_duration);
        this.f32088x = (SeekBar) view.findViewById(R$id.music_seek_bar);
        this.f32089y = (ImageView) view.findViewById(R$id.iv_play_back);
        this.f32090z = (ImageView) view.findViewById(R$id.iv_play_fast);
    }

    public final void D(boolean z10) {
        P();
        if (z10) {
            this.f32088x.setProgress(0);
            this.f32087w.setText("00:00");
        }
        I(false);
        this.f32084t.setImageResource(R$drawable.ps_ic_audio_play);
        BasePreviewHolder.a aVar = this.f32060r;
        if (aVar != null) {
            aVar.b(null);
        }
    }

    public final void E() {
        O();
        I(true);
        this.f32084t.setImageResource(R$drawable.ps_ic_audio_stop);
    }

    public final void N(String str) {
        try {
            if (a8.d.c(str)) {
                this.A.setDataSource(this.itemView.getContext(), Uri.parse(str));
            } else {
                this.A.setDataSource(str);
            }
            this.A.prepare();
            this.A.seekTo(this.f32088x.getProgress());
            this.A.start();
            this.B = false;
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    public void b(LocalMedia localMedia, int i10) {
        String strF = localMedia.f();
        String strF2 = o8.d.f(localMedia.n());
        String strE = o8.k.e(localMedia.A());
        f(localMedia, -1, -1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(localMedia.p());
        sb2.append("\n");
        sb2.append(strF2);
        sb2.append(" - ");
        sb2.append(strE);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
        String str = strF2 + " - " + strE;
        int iIndexOf = sb2.indexOf(str);
        int length = str.length() + iIndexOf;
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(o8.e.a(this.itemView.getContext(), 12.0f)), iIndexOf, length, 17);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-10132123), iIndexOf, length, 17);
        this.f32085u.setText(spannableStringBuilder);
        this.f32086v.setText(o8.d.b(localMedia.o()));
        this.f32088x.setMax((int) localMedia.o());
        I(false);
        this.f32089y.setOnClickListener(new g());
        this.f32090z.setOnClickListener(new h());
        this.f32088x.setOnSeekBarChangeListener(new i());
        this.itemView.setOnClickListener(new j());
        this.f32084t.setOnClickListener(new k(localMedia, strF));
        this.itemView.setOnLongClickListener(new l(localMedia));
    }
}
