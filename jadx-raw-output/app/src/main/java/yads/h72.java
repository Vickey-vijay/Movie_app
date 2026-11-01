package yads;

import android.content.Context;
import android.util.TypedValue;
import android.view.TextureView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import com.yandex.mobile.ads.R$drawable;

/* JADX INFO: loaded from: classes8.dex */
public final class h72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f78084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fi3 f78085b;

    public /* synthetic */ h72() {
        this(new t0(), new fi3());
    }

    public final e72 a(Context context, ai3 ai3Var, gl1 gl1Var, sd3 sd3Var, int i10) {
        gl1 v20Var;
        TextureView textureView = new TextureView(context);
        textureView.setVisibility(8);
        t0 t0Var = this.f78084a;
        fl1 fl1Var = t0Var.f82845b;
        fl1Var.f77433a.getClass();
        ImageView imageView = null;
        if (gl1Var.getMuteControl() == null && gl1Var.getVideoProgress() == null && gl1Var.getCountDownProgress() == null) {
            fl1Var.f77434b.getClass();
            v20Var = (gl1) es2.a(context, CorePlaybackControlsContainer.class, i10, null);
        } else {
            v20Var = new v20(gl1Var.getMuteControl(), gl1Var.getVideoProgress(), gl1Var.getCountDownProgress());
        }
        Button buttonA = t0Var.f82844a.f84278a.a(context);
        buttonA.setTag(hl3.a("replay_button"));
        buttonA.setVisibility(8);
        un2 un2Var = new un2(context, buttonA);
        un2Var.addView(buttonA);
        n52 n52Var = new n52(context, un2Var, v20Var);
        t0Var.f82846c.getClass();
        gl1 gl1Var2 = n52Var.f80564b;
        n52Var.f80563a.setVisibility(8);
        CheckBox muteControl = gl1Var2 != null ? gl1Var2.getMuteControl() : null;
        if (muteControl != null) {
            muteControl.setVisibility(8);
        }
        ProgressBar videoProgress = gl1Var2 != null ? gl1Var2.getVideoProgress() : null;
        if (videoProgress != null) {
            videoProgress.setVisibility(8);
        }
        TextView countDownProgress = gl1Var2 != null ? gl1Var2.getCountDownProgress() : null;
        if (countDownProgress != null) {
            countDownProgress.setVisibility(8);
        }
        CheckBox muteControl2 = gl1Var2 != null ? gl1Var2.getMuteControl() : null;
        if (muteControl2 != null) {
            muteControl2.setChecked(ck.p.a(ai3Var.f75534d, 0.0d) || ai3Var.f75534d == null);
        }
        n52Var.setVisibility(8);
        fi3 fi3Var = this.f78085b;
        fi3Var.f77410b.getClass();
        if ((sd3Var != null ? sd3Var.f82621c : null) != null) {
            imageView = new ImageView(context);
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ij2 ij2Var = fi3Var.f77409a;
        ij2Var.getClass();
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminateDrawable(ContextCompat.getDrawable(context, R$drawable.monetization_ads_video_progress_bar_background));
        ij2Var.f78678a.getClass();
        int iC = ek.b.c(TypedValue.applyDimension(1, 45.0f, context.getResources().getDisplayMetrics()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iC, iC);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        progressBar.setVisibility(8);
        progressBar.setTag(hl3.a("video_placeholder_spinner"));
        ei3 ei3Var = new ei3(context, progressBar, imageView);
        ei3Var.addView(progressBar);
        if (imageView != null) {
            ei3Var.addView(imageView);
        }
        ei3Var.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        ei3Var.setVisibility(8);
        e72 e72Var = new e72(context, ei3Var, textureView, n52Var);
        e72Var.addView(ei3Var);
        e72Var.addView(textureView);
        e72Var.addView(n52Var);
        e72Var.setTag(hl3.a("native_video_view"));
        return e72Var;
    }

    public h72(t0 t0Var, fi3 fi3Var) {
        this.f78084a = t0Var;
        this.f78085b = fi3Var;
    }
}
