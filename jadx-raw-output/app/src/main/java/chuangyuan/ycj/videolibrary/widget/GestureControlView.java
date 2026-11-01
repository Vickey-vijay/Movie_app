package chuangyuan.ycj.videolibrary.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import chuangyuan.ycj.videolibrary.R$drawable;
import chuangyuan.ycj.videolibrary.R$id;
import chuangyuan.ycj.videolibrary.R$layout;
import chuangyuan.ycj.videolibrary.R$styleable;

/* JADX INFO: loaded from: classes3.dex */
public class GestureControlView extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f5999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f6000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f6001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f6002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AppCompatImageView f6003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AppCompatImageView f6004g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ProgressBar f6005h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ProgressBar f6006i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AppCompatTextView f6007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AppCompatImageView f6008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AppCompatImageView f6009l;

    public GestureControlView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GestureControlView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11;
        super(context, attributeSet, i10);
        setBackgroundColor(0);
        int resourceId = R$layout.simple_exo_video_progress_dialog;
        int i12 = R$layout.simple_video_audio_brightness_dialog;
        int resourceId2 = R$layout.simple_video_fast_forward_dialog;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.GestureControlView, 0, 0);
            try {
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.GestureControlView_player_gesture_audio_layout_id, i12);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.GestureControlView_player_gesture_progress_layout_id, resourceId);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.GestureControlView_player_gesture_bright_layout_id, i12);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R$styleable.GestureControlView_player_gesture_longclick_layout_id, resourceId2);
                typedArrayObtainStyledAttributes.recycle();
                i11 = resourceId4;
                i12 = resourceId3;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = i12;
        }
        a(i12, i11, resourceId, resourceId2);
    }

    public void b(int i10, int i11) {
        View view = this.f6001d;
        if (view != null) {
            if (view.getVisibility() != 0) {
                this.f6006i.setMax(i10);
                this.f6004g.setImageResource(R$drawable.ic_brightness_6_white_48px);
            }
            this.f6001d.setVisibility(0);
            this.f6006i.setProgress(i11);
        }
    }

    public void c(boolean z10, @NonNull SpannableString spannableString) {
        View view = this.f5999b;
        if (view != null) {
            view.setVisibility(0);
            this.f6007j.setText(spannableString);
            if (z10) {
                this.f6008k.setImageResource(R$drawable.ic_video_go);
            } else {
                this.f6008k.setImageResource(R$drawable.ic_video_go_back);
            }
        }
    }

    public void d(int i10, int i11) {
        View view = this.f6000c;
        if (view != null) {
            if (view.getVisibility() != 0) {
                this.f6005h.setMax(i10);
            }
            this.f6000c.setVisibility(0);
            this.f6005h.setProgress(i11);
            this.f6003f.setImageResource(i11 == 0 ? R$drawable.ic_volume_off_white_48px : R$drawable.ic_volume_up_white_48px);
        }
    }

    public void e(int i10) {
        View view = this.f6000c;
        if (view != null) {
            view.setVisibility(i10);
        }
        View view2 = this.f6001d;
        if (view2 != null) {
            view2.setVisibility(i10);
        }
        View view3 = this.f5999b;
        if (view3 != null) {
            view3.setVisibility(i10);
        }
        View view4 = this.f6002e;
        if (view4 != null) {
            view4.setVisibility(i10);
        }
    }

    public View getDialogProLayout() {
        return this.f5999b;
    }

    public View getExoAudioLayout() {
        return this.f6000c;
    }

    public View getExoBrightnessLayout() {
        return this.f6001d;
    }

    public View getExoFastForwardLayout() {
        return this.f6002e;
    }

    public void setFastForwardPosition(int i10) {
        if (this.f6002e != null) {
            this.f6009l.setImageResource(R$drawable.ic_video_fast);
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        this.f6000c = View.inflate(getContext(), i10, null);
        this.f6001d = View.inflate(getContext(), i11, null);
        this.f5999b = View.inflate(getContext(), i12, null);
        this.f6002e = View.inflate(getContext(), i13, null);
        this.f5999b.setVisibility(8);
        this.f6000c.setVisibility(8);
        this.f6001d.setVisibility(8);
        this.f6002e.setVisibility(8);
        addView(this.f5999b, getChildCount());
        addView(this.f6000c, getChildCount());
        addView(this.f6001d, getChildCount());
        addView(this.f6002e, getChildCount());
        int i14 = R$layout.simple_video_audio_brightness_dialog;
        if (i10 == i14) {
            this.f6003f = (AppCompatImageView) this.f6000c.findViewById(R$id.exo_video_audio_brightness_img);
            this.f6005h = (ProgressBar) this.f6000c.findViewById(R$id.exo_video_audio_brightness_pro);
        }
        if (i11 == i14) {
            this.f6004g = (AppCompatImageView) this.f6001d.findViewById(R$id.exo_video_audio_brightness_img);
            this.f6006i = (ProgressBar) this.f6001d.findViewById(R$id.exo_video_audio_brightness_pro);
        }
        if (i12 == R$layout.simple_exo_video_progress_dialog) {
            this.f6007j = (AppCompatTextView) this.f5999b.findViewById(R$id.exo_video_dialog_pro_text);
            this.f6008k = (AppCompatImageView) this.f5999b.findViewById(R$id.exo_video_dialog_pro_img);
        }
        if (i13 == R$layout.simple_video_fast_forward_dialog) {
            this.f6009l = (AppCompatImageView) this.f6002e.findViewById(R$id.exo_video_fast_img);
        }
    }
}
